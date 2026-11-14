package dev.epro.r0;

import dev.epro.r0.R8506001224295282223;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class I15982450409077447857 implements AutoCloseable {
    public static final /* synthetic */ int l = 0;
    public final String a;
    public final E443975109472006681 b;
    public volatile boolean c;
    public final ExecutorService d;
    public final CopyOnWriteArrayList e;
    public final Set f;
    public final Set g;
    public final ConcurrentHashMap h;
    public final CountDownLatch i;
    public volatile boolean j;
    public final Semaphore k;

    static {
        izmyclvb.dpqpjfpoanwt1(941);
        ldmkwbqqhptw();
    }

    public static native void A(OutputStream outputStream, String str);

    private static native void ldmkwbqqhptw();

    private native void lycuyvcqlopk(String str, E443975109472006681 e443975109472006681);

    public static native DatagramSocket p(String str);

    public static native LinkedHashMap s(InputStream inputStream);

    public static native String u(InputStream inputStream);

    public static native InetSocketAddress v(int i, byte[] bArr, int i2);

    public final native void B(OutputStream outputStream);

    public final native void b(Socket socket);

    public final native Socket c(int i, byte[] bArr, int i2);

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native int d();

    public final native void e(Socket socket, InputStream inputStream, OutputStream outputStream);

    public final native void g(Socket socket, InputStream inputStream, OutputStream outputStream);

    public final native boolean h(LinkedHashMap linkedHashMap);

    public final native boolean j(InetAddress inetAddress);

    public final native boolean o(R8506001224295282223.Z11244019023321623390 z11244019023321623390);

    public final native void q(Socket socket, Socket socket2);

    public final native void z(String str, boolean z);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(349);
        }

        private native void onufatoonjrw(O18369580107802500074 o18369580107802500074);

        private native void zoujuefborrn();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            onufatoonjrw(o18369580107802500074);
        }

        private Z11244019023321623390() {
            zoujuefborrn();
        }
    }

    public I15982450409077447857(String str, E443975109472006681 e443975109472006681) {
        str.getClass();
        e443975109472006681.getClass();
        lycuyvcqlopk(str, e443975109472006681);
    }
}
