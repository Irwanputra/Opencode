package dev.epro.httpcustom.core.util;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class CatalogRefreshReceiver extends android.content.BroadcastReceiver {
    public static final java.util.concurrent.ArrayBlockingQueue a;

    static {
        int iEwybgeplycoc;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(390);
        java.lang.Object[] objArr = new java.lang.Object[4];
        while (true) {
            try {
                iEwybgeplycoc = ewybgeplycoc(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iEwybgeplycoc != 0) {
                switch (iEwybgeplycoc) {
                    case 1:
                        a = (java.util.concurrent.ArrayBlockingQueue) objArr[1];
                        break;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    private native void bunzgdiztahz();

    private static native int ewybgeplycoc(java.lang.Object[] objArr);

    @Override // android.content.BroadcastReceiver
    public final native void onReceive(android.content.Context context, android.content.Intent intent);

    public static final class Y6921797927338498306 {
        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(979);
        }

        private native void hoztvnsotesc();

        private native void sqlvqlydhwvn(dev.epro.r0.O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Y6921797927338498306(dev.epro.r0.O18369580107802500074 o18369580107802500074) {
            this();
            sqlvqlydhwvn(o18369580107802500074);
        }

        private Y6921797927338498306() {
            hoztvnsotesc();
        }
    }

    public static final class Z11244019023321623390 {
        public final java.lang.String a;
        public final boolean b;

        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(62);
        }

        private native void yzqyodccbcnb(java.lang.String str, boolean z);

        public final native boolean equals(java.lang.Object obj);

        public final native int hashCode();

        public final native java.lang.String toString();

        public Z11244019023321623390(java.lang.String str, boolean z) {
            str.getClass();
            yzqyodccbcnb(str, z);
        }
    }

    public CatalogRefreshReceiver() {
        bunzgdiztahz();
    }
}
