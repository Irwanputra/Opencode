package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D10134974485008251909 {
    public static final dev.epro.r0.D10134974485008251909 a;

    static {
        int iBzqgphqnnbit;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(477);
        java.lang.Object[] objArr = new java.lang.Object[3];
        while (true) {
            try {
                iBzqgphqnnbit = bzqgphqnnbit(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iBzqgphqnnbit != 0) {
                switch (iBzqgphqnnbit) {
                    case 1:
                        a = (dev.epro.r0.D10134974485008251909) objArr[1];
                        break;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    public static native void a(dev.epro.r0.D10134974485008251909 d10134974485008251909, java.net.Socket socket, dev.epro.r0.D10134974485008251909.Z11244019023321623390 z11244019023321623390, int i, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.V14513365896667116290 v14513365896667116290, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.L12639328004344855510 l12639328004344855510, int i2);

    public static native void b(dev.epro.r0.D10134974485008251909 d10134974485008251909, java.net.Socket socket, dev.epro.r0.D10134974485008251909.Z11244019023321623390 z11244019023321623390, int i);

    private static native int bzqgphqnnbit(java.lang.Object[] objArr);

    public static native dev.epro.r0.D10134974485008251909.Z11244019023321623390 c(dev.epro.r0.D10134974485008251909 d10134974485008251909, java.lang.String str, int i, java.util.Collection collection, dev.epro.r0.V14513365896667116290 v14513365896667116290, int i2);

    private native void cengjdgczbzm();

    public static final class Z11244019023321623390 {
        public final android.net.Network a;
        public final java.net.InetSocketAddress b;
        public final java.lang.String c;

        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(672);
        }

        public /* synthetic */ Z11244019023321623390(android.net.Network network, java.net.InetSocketAddress inetSocketAddress, java.lang.String str, int i, dev.epro.r0.O18369580107802500074 o18369580107802500074) {
            this(network, inetSocketAddress, (java.lang.String) deuutrdpeazl(network, inetSocketAddress, str, i, o18369580107802500074)[0]);
            ivssubcnwegu();
        }

        private native void anaqtjdkqpvb(android.net.Network network, java.net.InetSocketAddress inetSocketAddress, java.lang.String str);

        private static native java.lang.Object[] deuutrdpeazl(android.net.Network network, java.net.InetSocketAddress inetSocketAddress, java.lang.String str, int i, dev.epro.r0.O18369580107802500074 o18369580107802500074);

        private native void ivssubcnwegu();

        public final native boolean equals(java.lang.Object obj);

        public final native int hashCode();

        public final native java.lang.String toString();

        public Z11244019023321623390(android.net.Network network, java.net.InetSocketAddress inetSocketAddress, java.lang.String str) {
            inetSocketAddress.getClass();
            str.getClass();
            anaqtjdkqpvb(network, inetSocketAddress, str);
        }
    }

    private D10134974485008251909() {
        cengjdgczbzm();
    }
}
