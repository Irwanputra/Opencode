package p243;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺぁあねじ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2810 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final Logger f10480 = Logger.getLogger(C2810.class.getName());

    /* renamed from: ぺぁあねじ.おぐぴう〸ず$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2811 implements InterfaceC2827 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ C2803 f10481;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ InputStream f10482;

        public C2811(C2803 c2803, InputStream inputStream) {
            this.f10481 = c2803;
            this.f10482 = inputStream;
        }

        @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f10482.close();
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("source(");
            m4207.append(this.f10482);
            m4207.append(")");
            return m4207.toString();
        }

        @Override // p243.InterfaceC2827
        /* renamed from: 〺つふすそ */
        public C2803 mo1761() {
            return this.f10481;
        }

        @Override // p243.InterfaceC2827
        /* renamed from: ざっざへづ */
        public long mo1762(C2819 c2819, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.f10481.mo4861();
                C2825 m4925 = c2819.m4925(1);
                int read = this.f10482.read(m4925.f10515, m4925.f10514, (int) Math.min(j, 8192 - m4925.f10514));
                if (read == -1) {
                    return -1L;
                }
                m4925.f10514 += read;
                long j2 = read;
                c2819.f10501 += j2;
                return j2;
            } catch (AssertionError e) {
                if (C2810.m4895(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static InterfaceC2822 m4893(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C2807 c2807 = new C2807(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new C2814(c2807, new C2828(c2807, outputStream));
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static InterfaceC2827 m4894(InputStream inputStream, C2803 c2803) {
        if (inputStream != null) {
            return new C2811(c2803, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m4895(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static InterfaceC2827 m4896(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C2807 c2807 = new C2807(socket);
        return new C2802(c2807, m4894(socket.getInputStream(), c2807));
    }
}
