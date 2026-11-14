package ads_mobile_sdk;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.G7713175901684004489;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K17751841687800543607;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O13929443358578228167;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P16188089657974175786;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.Q7233093895216384319;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S14769385926647291222;
import dev.epro.r0.T18375584833185129273;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X16599180054040010357;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class jp0 {
    public final eg2 C;
    public Point D;
    public Point E;
    public long F;
    public long G;
    public final AtomicBoolean H;
    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public WeakReference c;
    public WeakReference d;
    public WeakReference e;
    public WeakReference f;
    public final I16631908410500040363 g;
    public final W5797197595347441198 h;
    public final W5797197595347441198 i;
    public final k8 j;
    public final it1 k;
    public final zv1 l;
    public final P16188089657974175786 m;
    public final kz2 n;

    /* renamed from: o, reason: collision with root package name */
    public final mi3 f62o;
    public final O16637889491137121389 p;
    public final X16599180054040010357 q;
    public final i82 r;
    public final ih0 s;
    public final b02 t;
    public final h02 u;
    public final qw2 v;
    public final z1 w;
    public final b41 x;
    public final jr0 y;
    public final z03 z;

    public jp0(I16631908410500040363 i16631908410500040363, W5797197595347441198 w5797197595347441198, W5797197595347441198 w57971975953474411982, k8 k8Var, it1 it1Var, zv1 zv1Var, P16188089657974175786 p16188089657974175786, kz2 kz2Var, mi3 mi3Var, O16637889491137121389 o16637889491137121389, X16599180054040010357 x16599180054040010357, i82 i82Var, ih0 ih0Var, kx2 kx2Var, y2 y2Var, b02 b02Var, h02 h02Var, qw2 qw2Var, z1 z1Var, b41 b41Var, jr0 jr0Var, z03 z03Var, F14240031463097426304 f14240031463097426304, ci3 ci3Var, eg2 eg2Var) {
        i16631908410500040363.getClass();
        w5797197595347441198.getClass();
        w57971975953474411982.getClass();
        k8Var.getClass();
        it1Var.getClass();
        zv1Var.getClass();
        p16188089657974175786.getClass();
        kz2Var.getClass();
        mi3Var.getClass();
        o16637889491137121389.getClass();
        x16599180054040010357.getClass();
        i82Var.getClass();
        ih0Var.getClass();
        kx2Var.getClass();
        y2Var.getClass();
        b02Var.getClass();
        h02Var.getClass();
        qw2Var.getClass();
        z1Var.getClass();
        b41Var.getClass();
        jr0Var.getClass();
        z03Var.getClass();
        f14240031463097426304.getClass();
        ci3Var.getClass();
        eg2Var.getClass();
        this.a = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.c = new WeakReference(null);
        this.d = new WeakReference(null);
        this.e = new WeakReference(null);
        this.f = new WeakReference(null);
        this.g = i16631908410500040363;
        this.h = w5797197595347441198;
        this.i = w57971975953474411982;
        this.j = k8Var;
        this.k = it1Var;
        this.l = zv1Var;
        this.m = p16188089657974175786;
        this.n = kz2Var;
        this.f62o = mi3Var;
        this.p = o16637889491137121389;
        this.q = x16599180054040010357;
        this.r = i82Var;
        this.s = ih0Var;
        this.t = b02Var;
        this.u = h02Var;
        this.v = qw2Var;
        this.w = z1Var;
        this.x = b41Var;
        this.y = jr0Var;
        this.z = z03Var;
        this.C = eg2Var;
        this.D = new Point();
        this.E = new Point();
        new AtomicBoolean(false);
        this.H = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.jp0 r12, dev.epro.r0.W1307410158614224409 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            boolean r0 = r14 instanceof ads_mobile_sdk.gp0
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.gp0 r0 = (ads_mobile_sdk.gp0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.gp0 r0 = new ads_mobile_sdk.gp0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2f
            android.view.WindowManager r12 = r0.b
            ads_mobile_sdk.jp0 r13 = r0.a
            dev.epro.r0.E17665849472693074628.k(r14)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L78
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r12)
            return r2
        L35:
            dev.epro.r0.E17665849472693074628.k(r14)
            ads_mobile_sdk.z1 r14 = r12.w
            boolean r14 = r14.q0
            if (r14 != 0) goto L3f
            goto L7e
        L3f:
            ads_mobile_sdk.b41 r14 = r12.x
            r14.a()
            ads_mobile_sdk.ew1 r13 = (ads_mobile_sdk.ew1) r13
            android.widget.FrameLayout r13 = r13.c()
            if (r13 == 0) goto L51
            android.content.Context r13 = r13.getContext()
            goto L52
        L51:
            r13 = r2
        L52:
            boolean r14 = r13 instanceof android.app.Activity
            if (r14 == 0) goto L59
            r2 = r13
            android.app.Activity r2 = (android.app.Activity) r2
        L59:
            if (r2 != 0) goto L5c
            goto L7e
        L5c:
            java.lang.Class<android.view.WindowManager> r13 = android.view.WindowManager.class
            java.lang.Object r13 = r2.getSystemService(r13)
            android.view.WindowManager r13 = (android.view.WindowManager) r13
            ads_mobile_sdk.h02 r14 = r12.u
            r0.a = r12
            r0.b = r13
            r0.e = r3
            r14.getClass()
            java.lang.Object r14 = ads_mobile_sdk.h02.a(r14, r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r14 != r0) goto L78
            return r0
        L78:
            dev.epro.r0.M16184408391440927034 r14 = (dev.epro.r0.M16184408391440927034) r14
            boolean r0 = r14 instanceof ads_mobile_sdk.pu0
            if (r0 == 0) goto L7f
        L7e:
            return r4
        L7f:
            r14.getClass()
            ads_mobile_sdk.xu0 r14 = (ads_mobile_sdk.xu0) r14
            java.lang.Object r14 = r14.b
            ads_mobile_sdk.tx0 r14 = (ads_mobile_sdk.tx0) r14
            ads_mobile_sdk.zv1 r0 = r12.l
            r0.getClass()
            android.view.WindowManager$LayoutParams r5 = new android.view.WindowManager$LayoutParams
            r9 = 0
            r10 = -2
            r6 = -2
            r7 = -2
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            ads_mobile_sdk.jr0 r0 = r0.b
            r1 = 808(0x328, float:1.132E-42)
            java.lang.String r2 = "gads:policy_validator_layoutparam:flags"
            java.lang.Integer r1 = dev.epro.r0.O17574792317020433029.c(r0, r2, r1)
            ads_mobile_sdk.ao r3 = ads_mobile_sdk.ao.a$18
            java.lang.Object r0 = r0.a(r2, r1, r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.flags = r0
            r0 = 2
            r5.type = r0
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r5.gravity = r0
            r13.addView(r14, r5)
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            r13.<init>(r14)
            r12.e = r13
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp0.a(ads_mobile_sdk.jp0, dev.epro.r0.W1307410158614224409, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ads_mobile_sdk.jp0 r5, dev.epro.r0.W1307410158614224409 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.hp0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.hp0 r0 = (ads_mobile_sdk.hp0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.hp0 r0 = new ads_mobile_sdk.hp0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            r4 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            dev.epro.r0.W1307410158614224409 r6 = r0.b
            ads_mobile_sdk.jp0 r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto La2
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r4
        L33:
            dev.epro.r0.E17665849472693074628.k(r7)
            ads_mobile_sdk.qw2 r7 = r5.v
            ads_mobile_sdk.qw2 r1 = ads_mobile_sdk.qw2.g
            if (r7 != r1) goto L3d
            return r3
        L3d:
            dev.epro.r0.I16631908410500040363 r7 = r5.g
            java.lang.String r1 = "overlay"
            if (r7 != 0) goto L44
            goto L49
        L44:
            dev.epro.r0.I16631908410500040363 r7 = r7.y(r1)     // Catch: java.lang.Exception -> L49
            goto L4a
        L49:
            r7 = r4
        L4a:
            if (r7 == 0) goto Lc7
            dev.epro.r0.H14305894327539119220 r7 = r7.a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L56
            goto Lc7
        L56:
            java.lang.ref.WeakReference r7 = r5.d
            java.lang.Object r7 = r7.get()
            ads_mobile_sdk.tx0 r7 = (ads_mobile_sdk.tx0) r7
            if (r7 == 0) goto L6c
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.k
            if (r1 == 0) goto L6c
            boolean r1 = r1.get()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
        L6c:
            if (r7 == 0) goto L77
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r1 = dev.epro.r0.S10823041268949770285.t(r4, r1)
            if (r1 == 0) goto L77
            goto Lc7
        L77:
            if (r7 == 0) goto L8d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = dev.epro.r0.S10823041268949770285.t(r4, r1)
            if (r1 == 0) goto L8d
            r1 = r6
            ads_mobile_sdk.ew1 r1 = (ads_mobile_sdk.ew1) r1
            android.widget.FrameLayout r1 = r1.d()
            if (r1 == 0) goto L8d
            r1.removeView(r7)
        L8d:
            ads_mobile_sdk.b02 r7 = r5.t
            r0.a = r5
            r0.b = r6
            r0.e = r2
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.b02.a(r7, r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r0) goto La2
            r3 = r0
            goto Lc7
        La2:
            dev.epro.r0.M16184408391440927034 r7 = (dev.epro.r0.M16184408391440927034) r7
            boolean r0 = r7 instanceof ads_mobile_sdk.pu0
            if (r0 == 0) goto La9
            goto Lc7
        La9:
            r7.getClass()
            ads_mobile_sdk.xu0 r7 = (ads_mobile_sdk.xu0) r7
            java.lang.Object r7 = r7.b
            ads_mobile_sdk.tx0 r7 = (ads_mobile_sdk.tx0) r7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r7)
            r5.getClass()
            r5.d = r0
            ads_mobile_sdk.ew1 r6 = (ads_mobile_sdk.ew1) r6
            android.widget.FrameLayout r5 = r6.d()
            if (r5 == 0) goto Lc7
            r5.addView(r7)
        Lc7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp0.b(ads_mobile_sdk.jp0, dev.epro.r0.W1307410158614224409, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final int e() {
        ((T18375584833185129273) this.m).getClass();
        return 0;
    }

    public final boolean k() {
        it1 it1Var = this.k;
        return (it1Var.p.isEmpty() || it1Var.q == null) ? false : true;
    }

    public final void a() {
    }

    public final void a(View view, O13929443358578228167 o13929443358578228167, LinkedHashMap linkedHashMap, ImageView.ScaleType scaleType) {
        linkedHashMap.getClass();
        scaleType.getClass();
        R7033599853981556291.E(this.h, null, null, new xo0(this, null, (byte) 0), 3);
        vv1 c = G7713175901684004489.c(this.n, this.f62o, this.l, o13929443358578228167, linkedHashMap, scaleType);
        String a = a(view, linkedHashMap);
        a(this, o13929443358578228167, c, a, this.l.a(a, this.E, this.D), 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.I16631908410500040363 b(dev.epro.r0.O13929443358578228167 r2, android.widget.ImageView.ScaleType r3, java.util.LinkedHashMap r4) {
        /*
            r1 = this;
            r4.getClass()
            r3.getClass()
            dev.epro.r0.I16631908410500040363 r0 = new dev.epro.r0.I16631908410500040363
            r0.<init>()
            dev.epro.r0.I16631908410500040363 r2 = r1.a(r2, r3, r4)
            java.lang.String r3 = "nas"
            r0.q(r3, r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.H
            boolean r2 = r2.get()
            if (r2 == 0) goto L36
            java.lang.String r2 = "allow_custom_click_gesture"
            dev.epro.r0.I16631908410500040363 r1 = r1.g
            if (r1 != 0) goto L23
            goto L2c
        L23:
            dev.epro.r0.K15572083692188606544 r1 = r1.w(r2)     // Catch: java.lang.Exception -> L2c
            boolean r1 = r1.b()     // Catch: java.lang.Exception -> L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L36
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "custom_click_gesture_eligible"
            r0.r(r2, r1)
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp0.b(dev.epro.r0.O13929443358578228167, android.widget.ImageView$ScaleType, java.util.LinkedHashMap):dev.epro.r0.I16631908410500040363");
    }

    public static void a(jp0 jp0Var, FrameLayout frameLayout, vv1 vv1Var, String str, I16631908410500040363 i16631908410500040363, int i) {
        R7033599853981556291.E(jp0Var.h, null, null, new u72(jp0Var, vv1Var, i16631908410500040363, str, frameLayout, (i & 32) == 0, null), 3);
    }

    public final String a(FrameLayout frameLayout) {
        kz2 kz2Var = this.n;
        wv0 wv0Var = wv0.CUI_NAME_VIEW_SIGNALS;
        mi3 mi3Var = this.f62o;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                String a2 = this.j.a(frameLayout);
                a.close();
                return a2;
            } catch (Throwable th) {
                try {
                    a.b(th);
                    if (!(th instanceof N340633841638932414)) {
                        if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                            a.a(th);
                        }
                        if (!(th instanceof P2480554073835519965)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof dv0) {
                                    throw th;
                                }
                                throw new iu0(th);
                            }
                            throw new du0(th);
                        }
                        throw new lw0(th);
                    }
                    throw th;
                } finally {
                }
            }
        } else {
            th3 a3 = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                String a4 = this.j.a(frameLayout);
                a3.close();
                return a4;
            } catch (Throwable th2) {
                try {
                    a3.b(th2);
                    if (!(th2 instanceof N340633841638932414)) {
                        if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                            a3.a(th2);
                        }
                        if (!(th2 instanceof P2480554073835519965)) {
                            if (!(th2 instanceof CancellationException)) {
                                if (th2 instanceof dv0) {
                                    throw th2;
                                }
                                throw new iu0(th2);
                            }
                            throw new du0(th2);
                        }
                        throw new lw0(th2);
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    public final String a(View view, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (S10823041268949770285.t(view, (View) ((WeakReference) entry.getValue()).get())) {
                return str;
            }
        }
        int i = this.k.b;
        if (i != 0 && Q7233093895216384319.a[L11610354117192841236.A(i)] == 1) {
            return "3099";
        }
        return null;
    }

    public final I16631908410500040363 a(O13929443358578228167 o13929443358578228167, ImageView.ScaleType scaleType, LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        scaleType.getClass();
        vv1 c = G7713175901684004489.c(this.n, this.f62o, this.l, o13929443358578228167, linkedHashMap, scaleType);
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.q("asset_view_signal", c.a);
        i16631908410500040363.q("ad_view_signal", c.b);
        i16631908410500040363.q("scroll_view_signal", c.c);
        i16631908410500040363.q("lock_screen_signal", c.d);
        return i16631908410500040363;
    }

    public final void a(O13929443358578228167 o13929443358578228167, MotionEvent motionEvent) {
        this.l.getClass();
        int[] iArr = new int[2];
        o13929443358578228167.getLocationOnScreen(iArr);
        this.D = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.p.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.G = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.F = currentTimeMillis;
            this.E = this.D;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.D;
        obtain.setLocation(point.x, point.y);
        k8 k8Var = this.j;
        k8Var.getClass();
        ga3 ga3Var = ((f7) k8Var.b().a).b;
        K17751841687800543607 k17751841687800543607 = (K17751841687800543607) ga3Var.f.get();
        if (k17751841687800543607 == null) {
            ga3Var.e.b(yk0.EVENT_ID_EARLY_INPUT_EVENT);
        } else {
            k17751841687800543607.a(obtain);
        }
        obtain.recycle();
    }

    public final void a(WeakReference weakReference, O13929443358578228167 o13929443358578228167, LinkedHashMap linkedHashMap, ew1 ew1Var, ew1 ew1Var2) {
        linkedHashMap.getClass();
        this.c = weakReference;
        this.D = new Point();
        this.E = new Point();
        R7033599853981556291.E(this.i, null, null, new S14769385926647291222(this, o13929443358578228167, weakReference, null, (byte) 6), 3);
        o13929443358578228167.setOnTouchListener(ew1Var);
        o13929443358578228167.setClickable(true);
        o13929443358578228167.setOnClickListener(ew1Var2);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (view != null) {
                view.setOnTouchListener(ew1Var);
                view.setClickable(true);
                view.setOnClickListener(ew1Var2);
            }
        }
    }
}
