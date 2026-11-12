import com.jcraft.jsch.ChannelDirectTCPIP;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SocketFactory;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * Meniru jalur aplikasi seadanya: socket polos ke edge -> kirim payload HTTP
 * Custom (dengan \r\n harfiah) -> lewati preamble 301/101 sampai baris SSH-...
 * -> serahkan socket itu ke JSch (pustaka SSH yang dipakai Wanz Tunnel,
 * com.github.mwiede:jsch) -> login dengan akun pemakai -> buka terowongan
 * direct-tcpip dan minta HTTP sungguhan.
 *
 * Algoritma KEX/host-key TIDAK disetel, jadi yang diuji benar-benar default
 * JSch seperti di aplikasi.
 */
public class jsch_test {

    /** Socket milik JSch: stream-nya diawali byte yang sudah terlanjur dibaca. */
    static final class Prepared extends Socket {
        private final InputStream in;
        private final OutputStream out;

        Prepared(Socket real, byte[] pending) throws IOException {
            this.in = new Replay(real.getInputStream(), pending);
            this.out = real.getOutputStream();
        }

        @Override public InputStream getInputStream() { return in; }
        @Override public OutputStream getOutputStream() { return out; }
        @Override public boolean isConnected() { return true; }
        @Override public boolean isClosed() { return false; }
    }

    /** Beri tahu JSch: pakai socket yang sudah siap (payload + banner) ini. */
    static final class Factory implements SocketFactory {
        private final Socket real;
        private final byte[] pending;

        Factory(Socket real, byte[] pending) { this.real = real; this.pending = pending; }

        @Override public Socket createSocket(String host, int port) throws IOException {
            return new Prepared(real, pending);
        }
        @Override public InputStream getInputStream(Socket s) throws IOException {
            return s.getInputStream();
        }
        @Override public OutputStream getOutputStream(Socket s) throws IOException {
            return s.getOutputStream();
        }
    }

    /** Aliran yang memutar ulang byte preamble/banner sebelum baca socket. */
    static final class Replay extends FilterInputStream {
        private int at = 0;
        private final byte[] pre;

        Replay(InputStream src, byte[] pre) { super(src); this.pre = pre; }

        @Override public int read() throws IOException {
            if (at < pre.length) return pre[at++] & 0xFF;
            return super.read();
        }

        @Override public int read(byte[] b, int off, int len) throws IOException {
            if (at < pre.length) {
                int n = Math.min(len, pre.length - at);
                System.arraycopy(pre, at, b, off, n);
                at += n;
                return n;
            }
            return super.read(b, off, len);
        }
    }

    public static void main(String[] args) throws Exception {
        String edge = "104.17.70.206";
        int port = 80;
        String host = "bansos.sunekvpn.cc.cd";
        String fake = "edu.ruangguru.com";
        String user = "sunek-coolmaxx";
        String pass = "Coolmaxx";

        // Payload PERSIS seperti di log HTTP Custom, \r\n ditulis harfiah.
        String payload = "GET / HTTP/1.1\\r\\nHost: " + fake + "\\r\\n\\r\\n"
            + "PATCH / HTTP/1.1\\r\\nHost: " + host + "\\r\\nUpgrade: websocket\\r\\n\\r\\n";
        byte[] wire = payload.replace("\\r\\n", "\r\n").getBytes(StandardCharsets.ISO_8859_1);

        Socket base = new Socket();
        base.connect(new InetSocketAddress(edge, port), 15000);
        base.setSoTimeout(20000);
        base.setTcpNoDelay(true);
        base.getOutputStream().write(wire);
        base.getOutputStream().flush();
        System.out.println("payload   : " + payload.length() + " char, " + wire.length
            + " byte terkirim ke " + edge + ":" + port);

        // Baca sampai baris SSH- (harus di awal baris).
        InputStream raw = base.getInputStream();
        byte[] buf = new byte[64 * 1024];
        int len = 0;
        int bannerAt = -1;
        outer:
        while (true) {
            int n = raw.read(buf, len, buf.length - len);
            if (n < 0) break;
            len += n;
            for (int i = 0; i + 4 <= len; i++) {
                if ((i == 0 || buf[i - 1] == '\n')
                    && buf[i] == 'S' && buf[i + 1] == 'S' && buf[i + 2] == 'H' && buf[i + 3] == '-') {
                    for (int j = i + 4; j < len; j++) {
                        if (buf[j] == '\n') { bannerAt = i; break outer; }
                    }
                }
            }
            if (len > 60000) break;
        }
        if (bannerAt < 0) {
            System.out.println("GAGAL: tidak ada banner SSH; dapat " + len + " byte");
            base.close();
            return;
        }
        int lineEnd = -1;
        for (int j = bannerAt; j < len; j++) if (buf[j] == '\n') { lineEnd = j; break; }
        String banner = new String(buf, bannerAt, lineEnd - bannerAt, StandardCharsets.ISO_8859_1).trim();
        byte[] pending = new byte[len - bannerAt];
        System.arraycopy(buf, bannerAt, pending, 0, pending.length);
        System.out.println("preamble  : " + bannerAt + " byte dilewati");
        System.out.println("banner    : " + banner);

        java.io.File kh = new java.io.File("/tmp/opencode/known_hosts_test");
        JSch jsch = new JSch();
        jsch.setKnownHosts(kh.getPath());
        Session se = jsch.getSession(user, host, port);
        se.setSocketFactory(new Factory(base, pending));
        // Di HP, kunci ini ditanyakan lalu diterima pemakai. Di sini dilepas
        // supaya bagian login + terowongan yang teruji.
        se.setConfig("StrictHostKeyChecking", "ask");
        // Sama seperti app: kunci baru diterima pemakai (promptYesNo = true).
        se.setUserInfo(new com.jcraft.jsch.UserInfo() {
            public String getPassphrase() { return null; }
            public String getPassword() { return null; }
            public boolean promptPassword(String m) { return false; }
            public boolean promptPassphrase(String m) { return false; }
            public boolean promptYesNo(String m) {
                System.out.println("prompt  : " + (m == null ? "-" : m.trim()));
                return true;
            }
            public void showMessage(String m) {}
        });
        se.setConfig("PreferredAuthentications", "password,keyboard-interactive");
        se.setPassword(pass);
        long t0 = System.currentTimeMillis();
        se.connect(25000);
        System.out.printf("LOGIN     : OK (%d ms) versi server=%s%n",
            System.currentTimeMillis() - t0, se.getServerVersion());
        System.out.println("hostkey   : " + se.getHostKey().getType());
        System.out.println("known_hosts: " + (kh.exists()
            ? new java.io.BufferedReader(new java.io.FileReader(kh)).lines().count() + " baris"
            : "tidak ada"));

        // Terowongan: direct-tcpip ke internet, sama seperti mode VPN app.
        ChannelDirectTCPIP ch = (ChannelDirectTCPIP) se.openChannel("direct-tcpip");
        ch.setHost("example.com");
        ch.setPort(80);
        ch.connect(15000);
        OutputStream o = ch.getOutputStream();
        o.write("GET / HTTP/1.1\r\nHost: example.com\r\nConnection: close\r\n\r\n"
            .getBytes(StandardCharsets.ISO_8859_1));
        o.flush();
        InputStream i = ch.getInputStream();
        StringBuilder sb = new StringBuilder();
        int c, total = 0;
        while ((c = i.read()) >= 0) {
            total++;
            if (sb.length() < 80) sb.append((char) c);
        }
        System.out.println("INTERNET  : " + total + " byte lewat terowongan | "
            + sb.toString().replace("\r", ""));
        ch.disconnect();
        se.disconnect();
        base.close();
        System.out.println("HASIL     : SSH + internet NYATA berhasil (JSch default)");
    }
}
