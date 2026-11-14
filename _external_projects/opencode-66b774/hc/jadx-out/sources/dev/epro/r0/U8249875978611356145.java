package dev.epro.r0;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class U8249875978611356145 implements AutoCloseable {
    public static final /* synthetic */ int j = 0;
    public final int a;
    public final P17638734969945972448 b;
    public final B13729205492206812220 c;
    public final F4096073349764486348 d;
    public final A2789795882633926065 e;
    public volatile DatagramSocket f;
    public volatile String g;
    public volatile boolean h;
    public volatile boolean i;

    static {
        izmyclvb.qgayjvbiagej2(945);
        ctqppbpfpbon();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ U8249875978611356145(int i, P17638734969945972448 p17638734969945972448, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, int i2, O18369580107802500074 o18369580107802500074) {
        Object[] objArrQejimkideoqx = qejimkideoqx(i, p17638734969945972448, b13729205492206812220, f4096073349764486348, i2, o18369580107802500074);
        this(i, p17638734969945972448, (B13729205492206812220) objArrQejimkideoqx[0], (F4096073349764486348) objArrQejimkideoqx[1]);
        iwpvuocrnohx();
    }

    private static native void ctqppbpfpbon();

    private native void iwpvuocrnohx();

    private static native Object[] qejimkideoqx(int i, P17638734969945972448 p17638734969945972448, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, int i2, O18369580107802500074 o18369580107802500074);

    private native void qhsickwymlwy(int i, P17638734969945972448 p17638734969945972448, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348);

    public final native Object b(DatagramSocket datagramSocket, SocketAddress socketAddress, byte[] bArr, K14749510448791472029 k14749510448791472029);

    @Override // java.lang.AutoCloseable
    public final native void close();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(1087);
        }

        private native void longlhscdolr();

        private native void thmeiqyuqxuc(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            thmeiqyuqxuc(o18369580107802500074);
        }

        private Z11244019023321623390() {
            longlhscdolr();
        }
    }

    public U8249875978611356145(int i, P17638734969945972448 p17638734969945972448, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348) {
        p17638734969945972448.getClass();
        qhsickwymlwy(i, p17638734969945972448, b13729205492206812220, f4096073349764486348);
    }
}
