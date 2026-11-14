package dev.epro.httpcustom.service;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class CustomVpnService extends dev.epro.r0.O15940687614781286589 {
    public static final dev.epro.httpcustom.service.CustomVpnService.Z11244019023321623390 T;
    public static final java.util.List U;
    public volatile boolean A;
    public dev.epro.r0.L12602321637077960189 B;
    public dev.epro.r0.S705323397128503595 C;
    public dev.epro.r0.S12463855685470141508 D;
    public dev.epro.r0.K5483612447425078112 E;
    public dev.epro.r0.S2634279721334480828 F;
    public dev.epro.r0.K592030916875419172 G;
    public dev.epro.r0.M9208473312800320189 H;
    public dev.epro.r0.M2589602038003343048 I;
    public dev.epro.r0.D9159609133816695612 J;
    public dev.epro.r0.K10974653436450232237 K;
    public dev.epro.r0.U11062399154044447260 L;
    public dev.epro.r0.C1675504868574764759 M;
    public dev.epro.r0.B11536125491408311921 N;
    public dev.epro.r0.B3665226925537469791 O;
    public dev.epro.r0.H6279550229396620207 P;
    public dev.epro.r0.E1148149683108732434 Q;
    public dev.epro.r0.Y9534975391348888281 R;
    public final dev.epro.r0.O12494175665883759871 S;
    public final java.lang.String d;
    public android.os.ParcelFileDescriptor e;
    public final dev.epro.r0.A2789795882633926065 f;
    public volatile dev.epro.r0.N10074157612675057572 g;
    public volatile java.lang.Integer h;
    public volatile java.lang.String i;
    public dev.epro.r0.X7175349259954592591 j;
    public long k;
    public final dev.epro.r0.O12494175665883759871 l;
    public dev.epro.r0.X7175349259954592591 m;
    public dev.epro.r0.X7175349259954592591 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dev.epro.r0.X7175349259954592591 f147o;
    public dev.epro.r0.X7175349259954592591 p;
    public dev.epro.r0.X7175349259954592591 q;
    public dev.epro.r0.X7175349259954592591 r;
    public volatile boolean s;
    public volatile dev.epro.r0.Z5502313684797272946 t;
    public volatile boolean u;
    public volatile boolean v;
    public volatile boolean w;
    public final dev.epro.r0.O12494175665883759871 x;
    public volatile boolean y;
    public volatile boolean z;

    public static final /* synthetic */ class Y6921797927338498306 extends dev.epro.r0.H4611829575853284164 implements dev.epro.r0.L12639328004344855510 {
        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(628);
        }

        private native void ceoigghgdmqa();

        public final native java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2);

        public Y6921797927338498306(java.lang.Object obj) {
            super(2, obj, dev.epro.r0.L12602321637077960189.class, o.bwmna.gdrqkg.izmyclvb.sb250e956f549(0), o.bwmna.gdrqkg.izmyclvb.sb250e956f549(1), 0);
            ceoigghgdmqa();
        }
    }

    static {
        int iLddvxrqrwmle;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(36);
        java.lang.Object[] objArr = new java.lang.Object[4];
        while (true) {
            try {
                iLddvxrqrwmle = lddvxrqrwmle(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iLddvxrqrwmle != 0) {
                switch (iLddvxrqrwmle) {
                    case 1:
                        T = (dev.epro.httpcustom.service.CustomVpnService.Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        U = (java.util.List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    public static native java.util.Map a(dev.epro.r0.N10074157612675057572 n10074157612675057572, java.util.Map map);

    public static native java.lang.String b(dev.epro.r0.N10074157612675057572 n10074157612675057572, java.lang.String str);

    private native void kxdvmwvzbucg();

    private static native int lddvxrqrwmle(java.lang.Object[] objArr);

    public static native /* synthetic */ void t(dev.epro.httpcustom.service.CustomVpnService customVpnService, int i);

    public final native void c();

    public final native java.lang.Object e(dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public final native java.lang.Object f(java.util.Map map, java.lang.String str, boolean z, dev.epro.r0.R11548601961566607882 r11548601961566607882, dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public final native dev.epro.r0.M9208473312800320189 g();

    public final native dev.epro.r0.K10974653436450232237 h();

    public final native dev.epro.r0.S2634279721334480828 i();

    public final native dev.epro.r0.L12602321637077960189 j();

    public final native dev.epro.r0.M2589602038003343048 k();

    public final native void l(dev.epro.r0.I15538023536476448075 i15538023536476448075);

    public final native void m(int i, java.lang.Object... objArr);

    public final native void n(java.lang.Object... objArr);

    public final native void o(dev.epro.r0.Z5502313684797272946 z5502313684797272946);

    public final native void onCreate();

    public final native void onDestroy();

    public final native void onRevoke();

    public final native int onStartCommand(android.content.Intent intent, int i, int i2);

    public final native void onTaskRemoved(android.content.Intent intent);

    public final native java.lang.Object p(dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public final native java.lang.Object q(java.util.Map map, dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public final native void r(java.lang.String str);

    public final native void s(boolean z, boolean z2, boolean z3);

    public final native void u(dev.epro.r0.X11638668447546090163 x11638668447546090163);

    public final native java.lang.Object v(java.util.Map map, java.lang.String str, boolean z, dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public static final class Z11244019023321623390 {
        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(370);
        }

        public static native android.content.Intent a(android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6);

        public static native /* synthetic */ android.content.Intent b(dev.epro.httpcustom.service.CustomVpnService.Z11244019023321623390 z11244019023321623390, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, int i2);

        public static native android.content.Intent c(android.content.Context context, java.lang.String str);

        private native void gfjfhvbkfnkn();

        private native void gjcailwwhtut(dev.epro.r0.O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(dev.epro.r0.O18369580107802500074 o18369580107802500074) {
            this();
            gjcailwwhtut(o18369580107802500074);
        }

        private Z11244019023321623390() {
            gfjfhvbkfnkn();
        }
    }

    public CustomVpnService() {
        kxdvmwvzbucg();
    }
}
