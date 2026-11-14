package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B3814434677362505641 {
    public static final dev.epro.r0.B3814434677362505641 a;
    public static final java.security.SecureRandom b;

    static {
        int iTrvbrqaxljmh;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(497);
        java.lang.Object[] objArr = new java.lang.Object[3];
        while (true) {
            try {
                iTrvbrqaxljmh = trvbrqaxljmh(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iTrvbrqaxljmh != 0) {
                switch (iTrvbrqaxljmh) {
                    case 1:
                        a = (dev.epro.r0.B3814434677362505641) objArr[1];
                        continue;
                    case 2:
                        b = (java.security.SecureRandom) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    public static native byte[] a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native byte[] b(int i, java.lang.String str);

    public static native byte[] c(byte[] bArr);

    public static native java.lang.String d(byte[] bArr);

    public static native byte[] e(int i);

    public static native java.util.ArrayList f(java.lang.String str);

    public static native byte[] g(java.security.interfaces.RSAPublicKey rSAPublicKey, byte[] bArr, java.lang.String str);

    private native void tntimfzpvksj();

    private static native int trvbrqaxljmh(java.lang.Object[] objArr);

    private B3814434677362505641() {
        tntimfzpvksj();
    }
}
