package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D17359225283826368340 {
    public static final java.security.SecureRandom b;
    public final byte[] a;

    static {
        int iSqbenffkxvrs;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(85);
        java.lang.Object[] objArr = new java.lang.Object[4];
        while (true) {
            try {
                iSqbenffkxvrs = sqbenffkxvrs(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iSqbenffkxvrs != 0) {
                switch (iSqbenffkxvrs) {
                    case 1:
                        b = (java.security.SecureRandom) objArr[1];
                        break;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    public /* synthetic */ D17359225283826368340(byte[] bArr, int i, dev.epro.r0.O18369580107802500074 o18369580107802500074) {
        this((byte[]) klxkrltqkhft(bArr, i, o18369580107802500074)[0]);
        rmpbnlitftow1();
    }

    private static native java.lang.Object[] klxkrltqkhft(byte[] bArr, int i, dev.epro.r0.O18369580107802500074 o18369580107802500074);

    private native void nduqymejlomn(byte[] bArr);

    private native void rmpbnlitftow();

    private native void rmpbnlitftow1();

    private static native int sqbenffkxvrs(java.lang.Object[] objArr);

    public final native byte[] a(byte[] bArr, byte[] bArr2);

    public static final class Z11244019023321623390 {
        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(1092);
        }

        private native void ftdpytixgffr();

        private native void viuatjxyolyz(dev.epro.r0.O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(dev.epro.r0.O18369580107802500074 o18369580107802500074) {
            this();
            viuatjxyolyz(o18369580107802500074);
        }

        private Z11244019023321623390() {
            ftdpytixgffr();
        }
    }

    public D17359225283826368340(byte[] bArr) {
        bArr.getClass();
        nduqymejlomn(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D17359225283826368340() {
        this(null, 1, 0 == true ? 1 : 0);
        rmpbnlitftow();
    }
}
