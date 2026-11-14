package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract /* synthetic */ class A5278692089272127728 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int iFiswupkreeun;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(879);
        java.lang.Object[] objArr = new java.lang.Object[8];
        while (true) {
            try {
                iFiswupkreeun = fiswupkreeun(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iFiswupkreeun != 0) {
                switch (iFiswupkreeun) {
                    case 1:
                        a = (int[]) objArr[1];
                        continue;
                    case 2:
                        b = (int[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    private static native int fiswupkreeun(java.lang.Object[] objArr);
}
