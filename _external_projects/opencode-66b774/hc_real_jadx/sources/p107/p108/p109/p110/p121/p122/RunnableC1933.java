package p107.p108.p109.p110.p121.p122;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.C1852;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.〳ぜぞぜべっ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1933 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Socket f8425;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1932 f8426;

    public RunnableC1933(Socket socket) {
        this.f8425 = socket;
    }

    @Override // java.lang.Runnable
    public void run() {
        Socket socket;
        String a = Crypt.a(Crypt.xrc("K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk"));
        try {
            try {
                InputStream inputStream = this.f8425.getInputStream();
                OutputStream outputStream = this.f8425.getOutputStream();
                byte[] bArr = new byte[102400];
                inputStream.read(bArr, 0, 3);
                outputStream.write(new byte[]{5, 0});
                outputStream.flush();
                inputStream.read(bArr, 0, 10);
                Socket socket2 = new Socket((bArr[4] & 255) + a + (bArr[5] & 255) + a + (bArr[6] & 255) + a + (bArr[7] & 255), ((bArr[8] & 255) * NotificationCompat.FLAG_LOCAL_ONLY) + (bArr[9] & 255));
                InputStream inputStream2 = socket2.getInputStream();
                OutputStream outputStream2 = socket2.getOutputStream();
                byte[] address = socket2.getLocalAddress().getAddress();
                int localPort = socket2.getLocalPort();
                outputStream.write(new byte[]{5, 0, 0, 1, address[0], address[1], address[2], address[3], (byte) (localPort >> 8), (byte) (localPort & Base64.BASELENGTH)}, 0, 10);
                outputStream.flush();
                C1932 c1932 = new C1932(inputStream2, outputStream, this.f8425, socket2);
                this.f8426 = c1932;
                c1932.start();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = inputStream.read(bArr, 0, 102400);
                    if (read <= 0) {
                        break;
                    }
                    m4016(socket2, read);
                    outputStream2.write(bArr, 0, read);
                    byteArrayOutputStream.write(bArr, 0, read);
                    outputStream2.flush();
                }
                socket = this.f8425;
                if (socket == null) {
                    return;
                }
            } catch (Exception unused) {
                socket = this.f8425;
                if (socket == null) {
                    return;
                }
            } catch (Throwable th) {
                try {
                    Socket socket3 = this.f8425;
                    if (socket3 != null) {
                        socket3.close();
                    }
                } catch (IOException unused2) {
                }
                throw th;
            }
            socket.close();
        } catch (IOException unused3) {
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4016(Socket socket, int i) {
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        C2098.m4199(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), m4207, Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
        m4207.append(App.f3759.getString(2131820626));
        m4207.append(Crypt.a(Crypt.xrc("\u00194i\u001afj@g>\u0019efH4jHbk\u001bdiKflLkiK1;Ldi\u001d3gIc;\u0019b;M6i\u001ccn\u001b3;\u00194nAk>Af>O4m\u001a")));
        m4207.append(socket.getInetAddress().getHostName());
        m4207.append(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")));
        m4207.append(socket.getInetAddress().getHostAddress());
        m4207.append(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")));
        m4207.append(socket.getPort());
        m4207.append(Crypt.a(Crypt.xrc("\u001b7oNa:Hg>\u001ag9H1fMgf\u001ba<NfmLfgL6jJ`")));
        m4207.append(this.f8425.getInetAddress().getHostAddress());
        m4207.append(Crypt.a(Crypt.xrc("NdkJ3m\u001bgoIdgA1k@b=\u001dcmAgg\u001dbi\u001d7m\u0019b")));
        m4207.append(C1852.m3975(i, new Locale(Crypt.a(Crypt.xrc("\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3")))));
        C1687.m3666(Crypt.a(Crypt.xrc("O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4")), m4207.toString());
    }
}
