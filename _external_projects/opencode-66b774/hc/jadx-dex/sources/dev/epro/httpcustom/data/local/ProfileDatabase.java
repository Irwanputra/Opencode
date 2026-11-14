package dev.epro.httpcustom.data.local;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class ProfileDatabase extends dev.epro.r0.J196785984016436306 {
    public static final dev.epro.httpcustom.data.local.ProfileDatabase.Z11244019023321623390 l;
    public static volatile dev.epro.httpcustom.data.local.ProfileDatabase m;

    static {
        int iErmbldawmgoc;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(113);
        java.lang.Object[] objArr = new java.lang.Object[4];
        while (true) {
            try {
                iErmbldawmgoc = ermbldawmgoc(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iErmbldawmgoc != 0) {
                switch (iErmbldawmgoc) {
                    case 1:
                        l = (dev.epro.httpcustom.data.local.ProfileDatabase.Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    private static native int ermbldawmgoc(java.lang.Object[] objArr);

    private native void vdpmfhennjkk();

    public abstract dev.epro.r0.C9265849176590713551 s();

    public static final class Z11244019023321623390 {
        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(ads_mobile_sdk.pd.f1);
        }

        public static native java.util.List a(android.content.Context context);

        private native void pociffoknxuf();

        private native void pygcnpwkywcb(dev.epro.r0.O18369580107802500074 o18369580107802500074);

        public final native dev.epro.httpcustom.data.local.ProfileDatabase b(android.content.Context context);

        public final native void c(android.content.Context context);

        public /* synthetic */ Z11244019023321623390(dev.epro.r0.O18369580107802500074 o18369580107802500074) {
            this();
            pygcnpwkywcb(o18369580107802500074);
        }

        private Z11244019023321623390() {
            pociffoknxuf();
        }
    }

    public ProfileDatabase() {
        vdpmfhennjkk();
    }
}
