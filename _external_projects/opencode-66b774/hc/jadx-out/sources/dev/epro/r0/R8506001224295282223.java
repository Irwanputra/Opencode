package dev.epro.r0;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class R8506001224295282223 {
    public static final R8506001224295282223 a;
    public static final byte[] b;

    static {
        int iEgyjtqeobafs;
        izmyclvb.qgayjvbiagej2(1459);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iEgyjtqeobafs = egyjtqeobafs(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iEgyjtqeobafs != 0) {
                switch (iEgyjtqeobafs) {
                    case 1:
                        a = (R8506001224295282223) objArr[1];
                        continue;
                    case 2:
                        b = (byte[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native byte[] a(int i, int i2, byte[] bArr, int i3);

    public static native byte[] b(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4);

    public static native Socket c(InetSocketAddress inetSocketAddress, int i, byte[] bArr, int i2, int i3);

    public static native void d(InputStream inputStream, OutputStream outputStream);

    public static native H9390398899829886498 e(InetSocketAddress inetSocketAddress, int i);

    private static native int egyjtqeobafs(Object[] objArr);

    public static native H9390398899829886498 f();

    public static native Y6921797927338498306 g(int i, byte[] bArr);

    public static native byte[] h(InputStream inputStream, int i, G2748918448832879793 g2748918448832879793);

    public static native int i(InputStream inputStream);

    public static native int j(InputStream inputStream);

    public static native InetSocketAddress k(InputStream inputStream, InetAddress inetAddress);

    public static native Z11244019023321623390 l(InputStream inputStream);

    public static native void m(InputStream inputStream, OutputStream outputStream);

    public static native void n(OutputStream outputStream, int i, int i2, byte[] bArr, int i3);

    public static native /* synthetic */ void o(R8506001224295282223 r8506001224295282223, OutputStream outputStream, int i);

    private native void zysifaxlfjkx();

    public static final class Y6921797927338498306 {
        public final int a;
        public final byte[] b;
        public final int c;
        public final byte[] d;
        public final int e;
        public final int f;

        static {
            izmyclvb.qgayjvbiagej2(2099);
        }

        private native void bogjyklnsspd(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4);

        public Y6921797927338498306(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
            bArr.getClass();
            bArr2.getClass();
            bogjyklnsspd(i, bArr, i2, bArr2, i3, i4);
        }
    }

    public static final class Z11244019023321623390 {
        public final int a;
        public final int b;
        public final byte[] c;
        public final int d;

        static {
            izmyclvb.qgayjvbiagej2(1632);
        }

        private native void ezmkkabwtmoc(int i, int i2, byte[] bArr, int i3);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(int i, int i2, byte[] bArr, int i3) {
            bArr.getClass();
            ezmkkabwtmoc(i, i2, bArr, i3);
        }
    }

    private R8506001224295282223() {
        zysifaxlfjkx();
    }
}
