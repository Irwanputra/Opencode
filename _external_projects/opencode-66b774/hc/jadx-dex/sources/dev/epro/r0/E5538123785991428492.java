package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E5538123785991428492 {
    public static final dev.epro.r0.E5538123785991428492 a;
    public static final javax.crypto.spec.OAEPParameterSpec b;
    public static final java.security.spec.PSSParameterSpec c;

    static {
        int iVuhmsqepstoy;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(858);
        java.lang.Object[] objArr = new java.lang.Object[13];
        while (true) {
            try {
                iVuhmsqepstoy = vuhmsqepstoy(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iVuhmsqepstoy != 0) {
                switch (iVuhmsqepstoy) {
                    case 1:
                        a = (dev.epro.r0.E5538123785991428492) objArr[1];
                        continue;
                    case 2:
                        b = (javax.crypto.spec.OAEPParameterSpec) objArr[1];
                        continue;
                    case 3:
                        c = (java.security.spec.PSSParameterSpec) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    public static native byte[] a(java.security.PrivateKey privateKey, byte[] bArr);

    public static native byte[] b(java.security.PrivateKey privateKey, byte[] bArr, boolean z);

    private native void hsxfcqepcwqh();

    private static native int vuhmsqepstoy(java.lang.Object[] objArr);

    private E5538123785991428492() {
        hsxfcqepcwqh();
    }
}
