package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class D9957392468432150353 {
    public static final byte[] a;
    public static final byte[] b;

    static {
        int iKsrdocmedjvo;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(1138);
        java.lang.Object[] objArr = new java.lang.Object[4];
        while (true) {
            try {
                iKsrdocmedjvo = ksrdocmedjvo(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iKsrdocmedjvo != 0) {
                switch (iKsrdocmedjvo) {
                    case 1:
                        a = (byte[]) objArr[1];
                        continue;
                    case 2:
                        b = (byte[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    private static native int ksrdocmedjvo(java.lang.Object[] objArr);
}
