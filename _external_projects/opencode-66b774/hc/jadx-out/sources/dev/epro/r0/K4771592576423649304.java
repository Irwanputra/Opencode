package dev.epro.r0;

import dev.epro.r0.R8506001224295282223;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class K4771592576423649304 implements AutoCloseable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char[] f332o;
    public final int a;
    public final int b;
    public final boolean c;
    public final P17638734969945972448 d;
    public final A2789795882633926065 e;
    public final InetSocketAddress f;
    public volatile ServerSocket g;
    public volatile DatagramSocket h;
    public final Y11460403151847909905 i;
    public final Object j;
    public final HashMap k;
    public final HashMap l;
    public int m;
    public final Set n;

    public final class Y11460403151847909905 {
        public final Object a;
        public Socket b;
        public OutputStream c;
        public boolean d;

        static {
            izmyclvb.dpqpjfpoanwt1(521);
        }

        private native void dteeuajapsjs(K4771592576423649304 k4771592576423649304);

        public final native void a();

        public final native OutputStream b();

        public final native Object c(Socket socket, K14749510448791472029 k14749510448791472029);

        public Y11460403151847909905() {
            dteeuajapsjs(K4771592576423649304.this);
        }
    }

    static {
        int iIqbpbktmikmn;
        izmyclvb.dpqpjfpoanwt1(1029);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iIqbpbktmikmn = iqbpbktmikmn(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iIqbpbktmikmn != 0) {
                switch (iIqbpbktmikmn) {
                    case 1:
                        f332o = (char[]) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    public /* synthetic */ K4771592576423649304(int i, int i2, int i3, boolean z, P17638734969945972448 p17638734969945972448, int i4, O18369580107802500074 o18369580107802500074) {
        Object[] objArrJekuuvadkhbj = jekuuvadkhbj(i, i2, i3, z, p17638734969945972448, i4, o18369580107802500074);
        this(((Integer) objArrJekuuvadkhbj[0]).intValue(), ((Integer) objArrJekuuvadkhbj[1]).intValue(), ((Integer) objArrJekuuvadkhbj[2]).intValue(), ((Integer) objArrJekuuvadkhbj[3]).intValue(), (P17638734969945972448) objArrJekuuvadkhbj[4]);
        cmojtmdvbsjs();
    }

    private native void cmojtmdvbsjs();

    private static native int iqbpbktmikmn(Object[] objArr);

    private static native Object[] jekuuvadkhbj(int i, int i2, int i3, boolean z, P17638734969945972448 p17638734969945972448, int i4, O18369580107802500074 o18369580107802500074);

    private native void pltaydpcjtsw(int i, int i2, int i3, boolean z, P17638734969945972448 p17638734969945972448);

    public final native Object b(DatagramSocket datagramSocket, InetSocketAddress inetSocketAddress, int i, byte[] bArr, int i2, byte[] bArr2, K14749510448791472029 k14749510448791472029);

    public final native void c(Socket socket);

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native int d();

    public final native void e(Socket socket, OutputStream outputStream, R8506001224295282223.Z11244019023321623390 z11244019023321623390);

    public final native void g();

    public final native void h();

    public final native Object j(K14749510448791472029 k14749510448791472029);

    public static final class Y6921797927338498306 {
        public final int a;
        public final InetSocketAddress b;
        public final int c;
        public final byte[] d;
        public final int e;
        public String f;
        public long g;
        public boolean h;

        static {
            izmyclvb.dpqpjfpoanwt1(2194);
        }

        private native void yazycsibftwo(int i, InetSocketAddress inetSocketAddress, int i2, byte[] bArr, int i3, boolean z);

        public Y6921797927338498306(int i, InetSocketAddress inetSocketAddress, int i2, byte[] bArr, int i3, boolean z) {
            inetSocketAddress.getClass();
            bArr.getClass();
            yazycsibftwo(i, inetSocketAddress, i2, bArr, i3, z);
        }
    }

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(1747);
        }

        private native void bnsgumzojwid(O18369580107802500074 o18369580107802500074);

        private native void laiyjlxevjos();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            bnsgumzojwid(o18369580107802500074);
        }

        private Z11244019023321623390() {
            laiyjlxevjos();
        }
    }

    public K4771592576423649304(int i, int i2, int i3, boolean z, P17638734969945972448 p17638734969945972448) {
        pltaydpcjtsw(i, i2, i3, z, p17638734969945972448);
    }
}
