package dev.epro.r0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J8477675461387041761 extends M6658516668915746104 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final G1892398518770611911 N = R1911624190916196378.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    public final P12475571966978616537 A;
    public final A3997919466996862373 B;
    public final A3997919466996862373 C;
    public final String D;
    public final String E;
    public final I1632105416032993715 F;
    public final Q9908018528090167751 G;
    public P12773055964240635680 H;
    public boolean I;
    public final A3997919466996862373 J;
    public final W13948953340889349604 K;
    public final ArrayList L;
    public final P16222058759139466260 M;
    public final S7974369370986781936 d;
    public int e = Integer.MIN_VALUE;
    public final P16222058759139466260 f = new P16222058759139466260(this, 0);
    public final AccessibilityManager g;
    public long h;
    public List i;
    public final X4231293104204236710 j;
    public int k;
    public int l;
    public P11546267793636643785 m;
    public P11546267793636643785 n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318o;
    public final Q9908018528090167751 p;
    public final Q9908018528090167751 q;
    public final E8321115364184429049 r;
    public final E8321115364184429049 s;
    public int t;
    public Integer u;
    public final K4498948325030944807 v;
    public final H17686692708284905246 w;
    public boolean x;
    public L15163798820964713393 y;
    public Q9908018528090167751 z;

    public J8477675461387041761(S7974369370986781936 s7974369370986781936) {
        this.d = s7974369370986781936;
        Object systemService = s7974369370986781936.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.g = (AccessibilityManager) systemService;
        this.h = 100L;
        new Handler(Looper.getMainLooper());
        this.j = new X4231293104204236710(this);
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.p = new Q9908018528090167751();
        this.q = new Q9908018528090167751();
        this.r = new E8321115364184429049(0);
        this.s = new E8321115364184429049(0);
        this.t = -1;
        this.v = new K4498948325030944807(0);
        this.w = I3887072968740112330.a(1, 6, null);
        this.x = true;
        Q9908018528090167751 q9908018528090167751 = C4240022152304578596.a;
        q9908018528090167751.getClass();
        this.z = q9908018528090167751;
        this.A = new P12475571966978616537();
        this.B = new A3997919466996862373();
        this.C = new A3997919466996862373();
        this.D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.F = new I1632105416032993715((byte) 18);
        this.G = new Q9908018528090167751();
        this.H = new P12773055964240635680(s7974369370986781936.getSemanticsOwner().a(), q9908018528090167751);
        int i = W4456716121976909571.a;
        this.J = new A3997919466996862373();
        s7974369370986781936.addOnAttachStateChangeListener(this);
        this.K = new W13948953340889349604(this, (byte) 2);
        this.L = new ArrayList();
        this.M = new P16222058759139466260(this, (byte) 1);
    }

    public static Rect G(J8045362843799184672 j8045362843799184672, float f, float f2) {
        if (!(j8045362843799184672 instanceof K10859651572364480586) && !(j8045362843799184672 instanceof K14082636229475424456)) {
            return null;
        }
        S6349823729575121924 M = j8045362843799184672.M();
        return new Rect((int) (M.a + f), (int) (M.b + f2), (int) (M.c + f), (int) (M.d + f2));
    }

    public static float[] I(J8045362843799184672 j8045362843799184672) {
        if (!(j8045362843799184672 instanceof K14082636229475424456)) {
            return null;
        }
        V14120702150497747934 v14120702150497747934 = ((K14082636229475424456) j8045362843799184672).r;
        long j = v14120702150497747934.h;
        long j2 = v14120702150497747934.g;
        long j3 = v14120702150497747934.f;
        long j4 = v14120702150497747934.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region J(J8045362843799184672 j8045362843799184672, float f, float f2) {
        if (j8045362843799184672 instanceof L11060719515004085110) {
            L11060719515004085110 l11060719515004085110 = (L11060719515004085110) j8045362843799184672;
            S6349823729575121924 j = l11060719515004085110.M().j(f, f2);
            Region region = new Region(new Rect((int) (j.a + 0.0f), (int) (j.b + 0.0f), (int) (j.c + 0.0f), (int) (j.d + 0.0f)));
            Region region2 = new Region();
            B1061516154492673368 b1061516154492673368 = l11060719515004085110.r;
            if (b1061516154492673368 instanceof B1061516154492673368) {
                Path path = b1061516154492673368.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            D11988991656201568495.j("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String o(R6653624393204003746 r6653624393204003746) {
        M11181104712105445833 m11181104712105445833;
        if (r6653624393204003746 != null) {
            E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
            A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
            P14992748401341948828 p14992748401341948828 = D10671166500636893138.a;
            if (a4559761392562572984.c(p14992748401341948828)) {
                return P3521844374884164894.a((List) e10198359844879945462.b(p14992748401341948828), ",", null, 62);
            }
            P14992748401341948828 p149927484013419488282 = D10671166500636893138.G;
            if (a4559761392562572984.c(p149927484013419488282)) {
                Object g = a4559761392562572984.g(p149927484013419488282);
                if (g == null) {
                    g = null;
                }
                M11181104712105445833 m111811047121054458332 = (M11181104712105445833) g;
                if (m111811047121054458332 != null) {
                    return m111811047121054458332.b;
                }
            } else {
                Object g2 = a4559761392562572984.g(D10671166500636893138.C);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (m11181104712105445833 = (M11181104712105445833) R9411874267597469228.D0(list)) != null) {
                    return m11181104712105445833.b;
                }
            }
        }
        return null;
    }

    public static final boolean s(T16405881657594259547 t16405881657594259547, float f) {
        B13729205492206812220 b13729205492206812220 = t16405881657594259547.a;
        if (f >= 0.0f || ((Number) b13729205492206812220.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) b13729205492206812220.invoke()).floatValue() < ((Number) t16405881657594259547.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean t(T16405881657594259547 t16405881657594259547) {
        B13729205492206812220 b13729205492206812220 = t16405881657594259547.a;
        if (((Number) b13729205492206812220.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) b13729205492206812220.invoke()).floatValue();
        ((Number) t16405881657594259547.b.invoke()).floatValue();
        return false;
    }

    public static final boolean u(T16405881657594259547 t16405881657594259547) {
        B13729205492206812220 b13729205492206812220 = t16405881657594259547.a;
        if (((Number) b13729205492206812220.invoke()).floatValue() < ((Number) t16405881657594259547.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) b13729205492206812220.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(J8477675461387041761 j8477675461387041761, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        j8477675461387041761.y(i, i2, num, null);
    }

    public final void A(int i, int i2, String str) {
        AccessibilityEvent j = j(v(i), 32);
        j.setContentChangeTypes(i2);
        if (str != null) {
            j.getText().add(str);
        }
        x(j);
    }

    public final void B(int i) {
        L15163798820964713393 l15163798820964713393 = this.y;
        if (l15163798820964713393 != null) {
            R6653624393204003746 r6653624393204003746 = l15163798820964713393.a;
            if (i != r6653624393204003746.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - l15163798820964713393.f <= 1000) {
                AccessibilityEvent j = j(v(r6653624393204003746.f), 131072);
                j.setFromIndex(l15163798820964713393.d);
                j.setToIndex(l15163798820964713393.e);
                j.setAction(l15163798820964713393.b);
                j.setMovementGranularity(l15163798820964713393.c);
                j.getText().add(o(r6653624393204003746));
                x(j);
            }
        }
        this.y = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0526, code lost:
    
        if (r5 != null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x052b, code lost:
    
        if (r5 == null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0127, code lost:
    
        if (dev.epro.r0.S10823041268949770285.t(r1, r13) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(dev.epro.r0.W13131470296662841006 r57) {
        /*
            Method dump skipped, instructions count: 1731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.C(dev.epro.r0.W13131470296662841006):void");
    }

    public final void D(H11725168162114556860 h11725168162114556860, P12475571966978616537 p12475571966978616537) {
        E10198359844879945462 w;
        if (h11725168162114556860.H() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(h11725168162114556860)) {
            H11725168162114556860 h117251681621145568602 = null;
            if (!h11725168162114556860.F.i(8)) {
                h11725168162114556860 = h11725168162114556860.u();
                while (true) {
                    if (h11725168162114556860 == null) {
                        h11725168162114556860 = null;
                        break;
                    } else if (h11725168162114556860.F.i(8)) {
                        break;
                    } else {
                        h11725168162114556860 = h11725168162114556860.u();
                    }
                }
            }
            if (h11725168162114556860 == null || (w = h11725168162114556860.w()) == null) {
                return;
            }
            if (!w.c) {
                H11725168162114556860 u = h11725168162114556860.u();
                while (true) {
                    if (u != null) {
                        E10198359844879945462 w2 = u.w();
                        if (w2 != null && w2.c) {
                            h117251681621145568602 = u;
                            break;
                        }
                        u = u.u();
                    } else {
                        break;
                    }
                }
                if (h117251681621145568602 != null) {
                    h11725168162114556860 = h117251681621145568602;
                }
            }
            int i = h11725168162114556860.b;
            if (p12475571966978616537.a(i)) {
                z(this, v(i), 2048, 1, 8);
            }
        }
    }

    public final void E(H11725168162114556860 h11725168162114556860) {
        if (h11725168162114556860.H() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(h11725168162114556860)) {
            int i = h11725168162114556860.b;
            T16405881657594259547 t16405881657594259547 = (T16405881657594259547) this.p.b(i);
            T16405881657594259547 t164058816575942595472 = (T16405881657594259547) this.q.b(i);
            if (t16405881657594259547 == null && t164058816575942595472 == null) {
                return;
            }
            AccessibilityEvent j = j(i, 4096);
            if (t16405881657594259547 != null) {
                j.setScrollX((int) ((Number) t16405881657594259547.a.invoke()).floatValue());
                j.setMaxScrollX((int) ((Number) t16405881657594259547.b.invoke()).floatValue());
            }
            if (t164058816575942595472 != null) {
                j.setScrollY((int) ((Number) t164058816575942595472.a.invoke()).floatValue());
                j.setMaxScrollY((int) ((Number) t164058816575942595472.b.invoke()).floatValue());
            }
            x(j);
        }
    }

    public final boolean F(R6653624393204003746 r6653624393204003746, int i, int i2, boolean z) {
        String o2;
        E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        int i3 = r6653624393204003746.f;
        P14992748401341948828 p14992748401341948828 = E5458822993765169982.j;
        if (e10198359844879945462.a.c(p14992748401341948828) && Z1953481206310471956.H(r6653624393204003746)) {
            J12078565427869724451 j12078565427869724451 = (J12078565427869724451) ((R17587901753867651123) r6653624393204003746.d.b(p14992748401341948828)).b;
            if (j12078565427869724451 != null) {
                return ((Boolean) j12078565427869724451.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.t) && (o2 = o(r6653624393204003746)) != null) {
            if (i < 0 || i != i2 || i2 > o2.length()) {
                i = -1;
            }
            this.t = i;
            boolean z2 = o2.length() > 0;
            x(k(v(i3), z2 ? Integer.valueOf(this.t) : null, z2 ? Integer.valueOf(this.t) : null, z2 ? Integer.valueOf(o2.length()) : null, o2));
            B(i3);
            return true;
        }
        return false;
    }

    public final Rect H(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        S7974369370986781936 s7974369370986781936 = this.d;
        long u = s7974369370986781936.u((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long u2 = s7974369370986781936.u((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (u >> 32);
        int i2 = (int) (u2 >> 32);
        int i3 = (int) (u & 4294967295L);
        int i4 = (int) (u2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.L():void");
    }

    @Override // dev.epro.r0.M6658516668915746104
    public final H12843822278061842084 a(View view) {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r21, dev.epro.r0.P11546267793636643785 r22, java.lang.String r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.e(int, dev.epro.r0.P11546267793636643785, java.lang.String, android.os.Bundle):void");
    }

    public final Rect f(D16246464706717523548 d16246464706717523548) {
        I11366018238968599357 i11366018238968599357 = d16246464706717523548.b;
        return H(i11366018238968599357.a, i11366018238968599357.b, i11366018238968599357.c, i11366018238968599357.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        if (dev.epro.r0.J8045362843799184672.I(r7, r0) == r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002c, B:14:0x0056, B:20:0x0068, B:22:0x0070, B:24:0x0079, B:31:0x0097, B:34:0x00a6, B:38:0x00ae, B:39:0x00b1, B:41:0x00b2, B:48:0x0040, B:50:0x0047, B:26:0x007e, B:28:0x0083, B:30:0x0094), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00cb -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(dev.epro.r0.K14749510448791472029 r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.g(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean h(int i, long j, boolean z) {
        P14992748401341948828 p14992748401341948828;
        int i2;
        if (S10823041268949770285.t(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            W13131470296662841006 n = n();
            if (!L2216691091636065972.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    p14992748401341948828 = D10671166500636893138.w;
                } else {
                    if (z) {
                        Z3383101362411723454.g();
                        return false;
                    }
                    p14992748401341948828 = D10671166500636893138.v;
                }
                Object[] objArr = n.c;
                long[] jArr = n.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    D16246464706717523548 d16246464706717523548 = (D16246464706717523548) objArr[(i3 << 3) + i6];
                                    I11366018238968599357 i11366018238968599357 = d16246464706717523548.b;
                                    float f = i11366018238968599357.a;
                                    i2 = i4;
                                    float f2 = i11366018238968599357.b;
                                    float f3 = i11366018238968599357.c;
                                    float f4 = i11366018238968599357.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object g = d16246464706717523548.a.d.a.g(p14992748401341948828);
                                        if (g == null) {
                                            g = null;
                                        }
                                        T16405881657594259547 t16405881657594259547 = (T16405881657594259547) g;
                                        if (t16405881657594259547 != null) {
                                            B13729205492206812220 b13729205492206812220 = t16405881657594259547.a;
                                            if (i < 0) {
                                                if (((Number) b13729205492206812220.invoke()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) b13729205492206812220.invoke()).floatValue() >= ((Number) t16405881657594259547.b.invoke()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void i() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.d.getSemanticsOwner().a(), this.H);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                C(n());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent j(int i, int i2) {
        D16246464706717523548 d16246464706717523548;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        S7974369370986781936 s7974369370986781936 = this.d;
        obtain.setPackageName(s7974369370986781936.getContext().getPackageName());
        obtain.setSource(s7974369370986781936, i);
        if (q() && (d16246464706717523548 = (D16246464706717523548) n().b(i)) != null) {
            R6653624393204003746 r6653624393204003746 = d16246464706717523548.a;
            obtain.setPassword(r6653624393204003746.d.a.c(D10671166500636893138.N));
            Object g = r6653624393204003746.d.a.g(D10671166500636893138.f192o);
            if (g == null) {
                g = null;
            }
            boolean t = S10823041268949770285.t(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                H3737085483209546534.k(obtain, t);
            }
        }
        return obtain;
    }

    public final AccessibilityEvent k(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent j = j(i, 8192);
        if (num != null) {
            j.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            j.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            j.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            j.getText().add(charSequence);
        }
        return j;
    }

    public final int l(R6653624393204003746 r6653624393204003746) {
        E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        if (!e10198359844879945462.a.c(D10671166500636893138.a)) {
            P14992748401341948828 p14992748401341948828 = D10671166500636893138.H;
            if (e10198359844879945462.a.c(p14992748401341948828)) {
                return (int) (((F12478849263529740365) e10198359844879945462.b(p14992748401341948828)).a & 4294967295L);
            }
        }
        return this.t;
    }

    public final int m(R6653624393204003746 r6653624393204003746) {
        E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        if (!e10198359844879945462.a.c(D10671166500636893138.a)) {
            P14992748401341948828 p14992748401341948828 = D10671166500636893138.H;
            if (e10198359844879945462.a.c(p14992748401341948828)) {
                return (int) (((F12478849263529740365) e10198359844879945462.b(p14992748401341948828)).a >> 32);
            }
        }
        return this.t;
    }

    public final W13131470296662841006 n() {
        if (this.x) {
            this.x = false;
            S7974369370986781936 s7974369370986781936 = this.d;
            this.z = U15853425786981391261.G(s7974369370986781936.getSemanticsOwner(), new M14716691558468128220((byte) 13));
            if (q()) {
                Q9908018528090167751 q9908018528090167751 = this.z;
                Resources resources = s7974369370986781936.getContext().getResources();
                A3997919466996862373 a3997919466996862373 = this.B;
                a3997919466996862373.a();
                A3997919466996862373 a39979194669968623732 = this.C;
                a39979194669968623732.a();
                D16246464706717523548 d16246464706717523548 = (D16246464706717523548) q9908018528090167751.b(-1);
                R6653624393204003746 r6653624393204003746 = d16246464706717523548 != null ? d16246464706717523548.a : null;
                r6653624393204003746.getClass();
                ArrayList b = E4662066703278899418.b(r6653624393204003746, new A6662317080022852970((Object) q9908018528090167751, (byte) 8), new A6662317080022852970((Object) resources, (byte) 9), K5751602218013079365.U(r6653624393204003746));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((R6653624393204003746) b.get(i - 1)).f;
                        int i3 = ((R6653624393204003746) b.get(i)).f;
                        a3997919466996862373.f(i2, i3);
                        a39979194669968623732.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.z;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager.isEnabled()) {
            this.i = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.d.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.K);
        AccessibilityManager accessibilityManager = this.g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final S6349823729575121924 p(R6653624393204003746 r6653624393204003746, Rect rect, I5573661370475160895 i5573661370475160895) {
        P6136162524265531704 p6136162524265531704 = new P6136162524265531704(i5573661370475160895);
        H11725168162114556860 h11725168162114556860 = r6653624393204003746.c;
        R15896830329318850690 r15896830329318850690 = (R15896830329318850690) h11725168162114556860.F.g;
        R16749699847173633337 r16749699847173633337 = null;
        if ((r15896830329318850690.d & 8) != 0) {
            loop0: while (true) {
                if (r15896830329318850690 == null) {
                    break;
                }
                if ((r15896830329318850690.c & 8) != 0) {
                    R15896830329318850690 r158968303293188506902 = r15896830329318850690;
                    D389890677992184566 d389890677992184566 = null;
                    while (r158968303293188506902 != null) {
                        if (r158968303293188506902 instanceof T11401768751197276141) {
                            ((T11401768751197276141) r158968303293188506902).V(p6136162524265531704);
                            if (p6136162524265531704.a) {
                                r16749699847173633337 = r158968303293188506902;
                                break loop0;
                            }
                        } else if ((r158968303293188506902.c & 8) != 0 && (r158968303293188506902 instanceof J2215566372910931965)) {
                            int i = 0;
                            for (R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) r158968303293188506902).p; r158968303293188506903 != null; r158968303293188506903 = r158968303293188506903.f) {
                                if ((r158968303293188506903.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r158968303293188506902 = r158968303293188506903;
                                    } else {
                                        if (d389890677992184566 == null) {
                                            d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                        }
                                        if (r158968303293188506902 != null) {
                                            d389890677992184566.b(r158968303293188506902);
                                            r158968303293188506902 = null;
                                        }
                                        d389890677992184566.b(r158968303293188506903);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        r158968303293188506902 = R7033599853981556291.M(d389890677992184566);
                    }
                }
                if ((r15896830329318850690.d & 8) == 0) {
                    break;
                }
                r15896830329318850690 = r15896830329318850690.f;
            }
        }
        R16749699847173633337 r167496998471736333372 = (T11401768751197276141) r16749699847173633337;
        if (r167496998471736333372 == null || !((R15896830329318850690) r167496998471736333372).a.n) {
            return V12319504402545346730.u((Y4989033692226475498) h11725168162114556860.F.e, false);
        }
        Y4989033692226475498 Q = R7033599853981556291.Q(r167496998471736333372);
        S6349823729575121924 E = V12319504402545346730.z(Q).E(Q, false);
        Rect H = H(E.a, E.b, E.c, E.d);
        float f = H.left - rect.left;
        float f2 = H.top - rect.top;
        return new S6349823729575121924(f, f2, H.width() + f, H.height() + f2);
    }

    public final boolean q() {
        AccessibilityManager accessibilityManager = this.g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.i;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.i = list;
        }
        return !list.isEmpty();
    }

    public final void r(H11725168162114556860 h11725168162114556860) {
        if (this.v.add(h11725168162114556860)) {
            this.w.a(O9245300239821758723.a);
        }
    }

    public final int v(int i) {
        if (i == this.d.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    public final void w(R6653624393204003746 r6653624393204003746, P12773055964240635680 p12773055964240635680) {
        List i;
        List i2;
        int[] iArr = F272001595334312984.a;
        P12475571966978616537 p12475571966978616537 = new P12475571966978616537();
        i = r6653624393204003746.i((r3 & 1) != 0 ? !r6653624393204003746.b : false, (r3 & 2) == 0);
        H11725168162114556860 h11725168162114556860 = r6653624393204003746.c;
        int size = i.size();
        for (int i3 = 0; i3 < size; i3++) {
            R6653624393204003746 r66536243932040037462 = (R6653624393204003746) i.get(i3);
            W13131470296662841006 n = n();
            int i4 = r66536243932040037462.f;
            if (n.a(i4)) {
                if (!p12773055964240635680.b.c(i4)) {
                    r(h11725168162114556860);
                    return;
                }
                p12475571966978616537.a(i4);
            }
        }
        P12475571966978616537 p124755719669786165372 = p12773055964240635680.b;
        int[] iArr2 = p124755719669786165372.b;
        long[] jArr = p124755719669786165372.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j = jArr[i5];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j) < 128 && !p12475571966978616537.c(iArr2[(i5 << 3) + i7])) {
                            r(h11725168162114556860);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        i2 = r6653624393204003746.i((r3 & 1) != 0 ? !r6653624393204003746.b : false, (r3 & 2) == 0);
        int size2 = i2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            R6653624393204003746 r66536243932040037463 = (R6653624393204003746) i2.get(i8);
            P12773055964240635680 p127730559642406356802 = (P12773055964240635680) this.G.b(r66536243932040037463.f);
            if (p127730559642406356802 != null && n().a(r66536243932040037463.f)) {
                w(r66536243932040037463, p127730559642406356802);
            }
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f318o = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f318o = false;
        }
    }

    public final boolean y(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent j = j(i, i2);
        if (num != null) {
            j.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            j.setContentDescription(P3521844374884164894.a(list, ",", null, 62));
        }
        return x(j);
    }
}
