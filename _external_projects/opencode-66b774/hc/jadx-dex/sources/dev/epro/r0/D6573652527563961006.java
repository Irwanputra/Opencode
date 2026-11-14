package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D6573652527563961006 implements dev.epro.r0.I15538023536476448075 {
    public static final dev.epro.r0.D6573652527563961006 a;

    static {
        int iOkarkausojum;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(907);
        java.lang.Object[] objArr = new java.lang.Object[3];
        while (true) {
            try {
                iOkarkausojum = okarkausojum(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iOkarkausojum != 0) {
                switch (iOkarkausojum) {
                    case 1:
                        a = (dev.epro.r0.D6573652527563961006) objArr[1];
                        break;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    private static native int okarkausojum(java.lang.Object[] objArr);

    private native void vgiruosnnujq();

    public final native boolean equals(java.lang.Object obj);

    public final native int hashCode();

    public final native java.lang.String toString();

    private D6573652527563961006() {
        vgiruosnnujq();
    }
}
