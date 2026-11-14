package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D14517794142029384778 {
    public static final dev.epro.r0.D14517794142029384778 a;
    public static android.content.Context b;
    public static boolean c;
    public static boolean d;
    public static final dev.epro.r0.D14517794142029384778.Z11244019023321623390 e;

    static {
        int iEfuivnqhhzwl;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(1024);
        java.lang.Object[] objArr = new java.lang.Object[3];
        while (true) {
            try {
                iEfuivnqhhzwl = efuivnqhhzwl(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iEfuivnqhhzwl != 0) {
                switch (iEfuivnqhhzwl) {
                    case 1:
                        a = (dev.epro.r0.D14517794142029384778) objArr[1];
                        continue;
                    case 2:
                        e = (dev.epro.r0.D14517794142029384778.Z11244019023321623390) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    public static native java.lang.Object a(org.json.JSONObject jSONObject);

    public static native org.json.JSONObject b(java.lang.String str, java.lang.Object obj);

    public static native void c(dev.epro.r0.E9947071562186447382 e9947071562186447382, boolean z);

    private static native int efuivnqhhzwl(java.lang.Object[] objArr);

    private native void iaxjjgimclbo();

    public static final class Z11244019023321623390 extends android.content.BroadcastReceiver {
        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(421);
        }

        private native void sgkarhjggluj();

        @Override // android.content.BroadcastReceiver
        public final native void onReceive(android.content.Context context, android.content.Intent intent);

        public Z11244019023321623390() {
            sgkarhjggluj();
        }
    }

    private D14517794142029384778() {
        iaxjjgimclbo();
    }
}
