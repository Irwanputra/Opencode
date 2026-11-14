package dev.epro.httpcustom.service;

import android.content.Context;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import dev.epro.r0.A2789795882633926065;
import dev.epro.r0.B11536125491408311921;
import dev.epro.r0.B3665226925537469791;
import dev.epro.r0.C1675504868574764759;
import dev.epro.r0.D9159609133816695612;
import dev.epro.r0.E1148149683108732434;
import dev.epro.r0.H4611829575853284164;
import dev.epro.r0.H6279550229396620207;
import dev.epro.r0.I15538023536476448075;
import dev.epro.r0.K10974653436450232237;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K5483612447425078112;
import dev.epro.r0.K592030916875419172;
import dev.epro.r0.L12602321637077960189;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.M2589602038003343048;
import dev.epro.r0.M9208473312800320189;
import dev.epro.r0.N10074157612675057572;
import dev.epro.r0.O12494175665883759871;
import dev.epro.r0.O15940687614781286589;
import dev.epro.r0.O18369580107802500074;
import dev.epro.r0.R11548601961566607882;
import dev.epro.r0.S12463855685470141508;
import dev.epro.r0.S2634279721334480828;
import dev.epro.r0.S705323397128503595;
import dev.epro.r0.U11062399154044447260;
import dev.epro.r0.X11638668447546090163;
import dev.epro.r0.X7175349259954592591;
import dev.epro.r0.Y9534975391348888281;
import dev.epro.r0.Z5502313684797272946;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public class CustomVpnService extends O15940687614781286589 {
    public static final Z11244019023321623390 T;
    public static final List U;
    public volatile boolean A;
    public L12602321637077960189 B;
    public S705323397128503595 C;
    public S12463855685470141508 D;
    public K5483612447425078112 E;
    public S2634279721334480828 F;
    public K592030916875419172 G;
    public M9208473312800320189 H;
    public M2589602038003343048 I;
    public D9159609133816695612 J;
    public K10974653436450232237 K;
    public U11062399154044447260 L;
    public C1675504868574764759 M;
    public B11536125491408311921 N;
    public B3665226925537469791 O;
    public H6279550229396620207 P;
    public E1148149683108732434 Q;
    public Y9534975391348888281 R;
    public final O12494175665883759871 S;
    public final String d;
    public ParcelFileDescriptor e;
    public final A2789795882633926065 f;
    public volatile N10074157612675057572 g;
    public volatile Integer h;
    public volatile String i;
    public X7175349259954592591 j;
    public long k;
    public final O12494175665883759871 l;
    public X7175349259954592591 m;
    public X7175349259954592591 n;

    /* renamed from: o, reason: collision with root package name */
    public X7175349259954592591 f147o;
    public X7175349259954592591 p;
    public X7175349259954592591 q;
    public X7175349259954592591 r;
    public volatile boolean s;
    public volatile Z5502313684797272946 t;
    public volatile boolean u;
    public volatile boolean v;
    public volatile boolean w;
    public final O12494175665883759871 x;
    public volatile boolean y;
    public volatile boolean z;

    public static final /* synthetic */ class Y6921797927338498306 extends H4611829575853284164 implements L12639328004344855510 {
        static {
            izmyclvb.oeynnivvrnts0(628);
        }

        private native void ceoigghgdmqa();

        @Override // dev.epro.r0.L12639328004344855510
        public final native Object invoke(Object obj, Object obj2);

        public Y6921797927338498306(Object obj) {
            super(2, obj, L12602321637077960189.class, izmyclvb.sb250e956f549(0), izmyclvb.sb250e956f549(1), 0);
            ceoigghgdmqa();
        }
    }

    static {
        int lddvxrqrwmle;
        izmyclvb.oeynnivvrnts0(36);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                lddvxrqrwmle = lddvxrqrwmle(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (lddvxrqrwmle != 0) {
                switch (lddvxrqrwmle) {
                    case 1:
                        T = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        U = (List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native Map a(N10074157612675057572 n10074157612675057572, Map map);

    public static native String b(N10074157612675057572 n10074157612675057572, String str);

    private native void kxdvmwvzbucg();

    private static native int lddvxrqrwmle(Object[] objArr);

    public static native /* synthetic */ void t(CustomVpnService customVpnService, int i);

    public final native void c();

    public final native Object e(K14749510448791472029 k14749510448791472029);

    public final native Object f(Map map, String str, boolean z, R11548601961566607882 r11548601961566607882, K14749510448791472029 k14749510448791472029);

    public final native M9208473312800320189 g();

    public final native K10974653436450232237 h();

    public final native S2634279721334480828 i();

    public final native L12602321637077960189 j();

    public final native M2589602038003343048 k();

    public final native void l(I15538023536476448075 i15538023536476448075);

    public final native void m(int i, Object... objArr);

    public final native void n(Object... objArr);

    public final native void o(Z5502313684797272946 z5502313684797272946);

    @Override // dev.epro.r0.O15940687614781286589, android.app.Service
    public final native void onCreate();

    @Override // android.app.Service
    public final native void onDestroy();

    @Override // android.net.VpnService
    public final native void onRevoke();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i, int i2);

    @Override // android.app.Service
    public final native void onTaskRemoved(Intent intent);

    public final native Object p(K14749510448791472029 k14749510448791472029);

    public final native Object q(Map map, K14749510448791472029 k14749510448791472029);

    public final native void r(String str);

    public final native void s(boolean z, boolean z2, boolean z3);

    public final native void u(X11638668447546090163 x11638668447546090163);

    public final native Object v(Map map, String str, boolean z, K14749510448791472029 k14749510448791472029);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.oeynnivvrnts0(370);
        }

        public static native Intent a(Context context, String str, String str2, int i, String str3, String str4, String str5, String str6);

        public static native /* synthetic */ Intent b(Z11244019023321623390 z11244019023321623390, Context context, String str, String str2, int i, String str3, String str4, int i2);

        public static native Intent c(Context context, String str);

        private native void gfjfhvbkfnkn();

        private native void gjcailwwhtut(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
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
