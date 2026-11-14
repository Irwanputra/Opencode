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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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
        S6349823729575121924 s6349823729575121924M = j8045362843799184672.M();
        return new Rect((int) (s6349823729575121924M.a + f), (int) (s6349823729575121924M.b + f2), (int) (s6349823729575121924M.c + f), (int) (s6349823729575121924M.d + f2));
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
            S6349823729575121924 s6349823729575121924J = l11060719515004085110.M().j(f, f2);
            Region region = new Region(new Rect((int) (s6349823729575121924J.a + 0.0f), (int) (s6349823729575121924J.b + 0.0f), (int) (s6349823729575121924J.c + 0.0f), (int) (s6349823729575121924J.d + 0.0f)));
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
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
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
                Object objG = a4559761392562572984.g(p149927484013419488282);
                if (objG == null) {
                    objG = null;
                }
                M11181104712105445833 m111811047121054458332 = (M11181104712105445833) objG;
                if (m111811047121054458332 != null) {
                    return m111811047121054458332.b;
                }
            } else {
                Object objG2 = a4559761392562572984.g(D10671166500636893138.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
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
        AccessibilityEvent accessibilityEventJ = j(v(i), 32);
        accessibilityEventJ.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        x(accessibilityEventJ);
    }

    public final void B(int i) {
        L15163798820964713393 l15163798820964713393 = this.y;
        if (l15163798820964713393 != null) {
            R6653624393204003746 r6653624393204003746 = l15163798820964713393.a;
            if (i != r6653624393204003746.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - l15163798820964713393.f <= 1000) {
                AccessibilityEvent accessibilityEventJ = j(v(r6653624393204003746.f), 131072);
                accessibilityEventJ.setFromIndex(l15163798820964713393.d);
                accessibilityEventJ.setToIndex(l15163798820964713393.e);
                accessibilityEventJ.setAction(l15163798820964713393.b);
                accessibilityEventJ.setMovementGranularity(l15163798820964713393.c);
                accessibilityEventJ.getText().add(o(r6653624393204003746));
                x(accessibilityEventJ);
            }
        }
        this.y = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:295:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(dev.epro.r0.W13131470296662841006 r57) {
        /*
            Method dump skipped, instruction units count: 1731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.C(dev.epro.r0.W13131470296662841006):void");
    }

    public final void D(H11725168162114556860 h11725168162114556860, P12475571966978616537 p12475571966978616537) {
        E10198359844879945462 e10198359844879945462W;
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
            if (h11725168162114556860 == null || (e10198359844879945462W = h11725168162114556860.w()) == null) {
                return;
            }
            if (!e10198359844879945462W.c) {
                H11725168162114556860 h11725168162114556860U = h11725168162114556860.u();
                while (true) {
                    if (h11725168162114556860U != null) {
                        E10198359844879945462 e10198359844879945462W2 = h11725168162114556860U.w();
                        if (e10198359844879945462W2 != null && e10198359844879945462W2.c) {
                            h117251681621145568602 = h11725168162114556860U;
                            break;
                        }
                        h11725168162114556860U = h11725168162114556860U.u();
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
            AccessibilityEvent accessibilityEventJ = j(i, 4096);
            if (t16405881657594259547 != null) {
                accessibilityEventJ.setScrollX((int) ((Number) t16405881657594259547.a.invoke()).floatValue());
                accessibilityEventJ.setMaxScrollX((int) ((Number) t16405881657594259547.b.invoke()).floatValue());
            }
            if (t164058816575942595472 != null) {
                accessibilityEventJ.setScrollY((int) ((Number) t164058816575942595472.a.invoke()).floatValue());
                accessibilityEventJ.setMaxScrollY((int) ((Number) t164058816575942595472.b.invoke()).floatValue());
            }
            x(accessibilityEventJ);
        }
    }

    public final boolean F(R6653624393204003746 r6653624393204003746, int i, int i2, boolean z) {
        String strO;
        E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        int i3 = r6653624393204003746.f;
        P14992748401341948828 p14992748401341948828 = E5458822993765169982.j;
        if (e10198359844879945462.a.c(p14992748401341948828) && Z1953481206310471956.H(r6653624393204003746)) {
            J12078565427869724451 j12078565427869724451 = (J12078565427869724451) ((R17587901753867651123) r6653624393204003746.d.b(p14992748401341948828)).b;
            if (j12078565427869724451 != null) {
                return ((Boolean) j12078565427869724451.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.t) && (strO = o(r6653624393204003746)) != null) {
            if (i < 0 || i != i2 || i2 > strO.length()) {
                i = -1;
            }
            this.t = i;
            boolean z2 = strO.length() > 0;
            x(k(v(i3), z2 ? Integer.valueOf(this.t) : null, z2 ? Integer.valueOf(this.t) : null, z2 ? Integer.valueOf(strO.length()) : null, strO));
            B(i3);
            return true;
        }
        return false;
    }

    public final Rect H(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        S7974369370986781936 s7974369370986781936 = this.d;
        long jU = s7974369370986781936.u(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jU2 = s7974369370986781936.u((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jU >> 32);
        int i2 = (int) (jU2 >> 32);
        int i3 = (int) (jU & 4294967295L);
        int i4 = (int) (jU2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.L():void");
    }

    @Override // dev.epro.r0.M6658516668915746104
    public final H12843822278061842084 a(View view) {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r21, dev.epro.r0.P11546267793636643785 r22, java.lang.String r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.e(int, dev.epro.r0.P11546267793636643785, java.lang.String, android.os.Bundle):void");
    }

    public final Rect f(D16246464706717523548 d16246464706717523548) {
        I11366018238968599357 i11366018238968599357 = d16246464706717523548.b;
        return H(i11366018238968599357.a, i11366018238968599357.b, i11366018238968599357.c, i11366018238968599357.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (dev.epro.r0.J8045362843799184672.I(r7, r0) == r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cb -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(dev.epro.r0.K14749510448791472029 r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.g(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r22, long r23, boolean r25) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.h(int, long, boolean):boolean");
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
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        S7974369370986781936 s7974369370986781936 = this.d;
        accessibilityEventObtain.setPackageName(s7974369370986781936.getContext().getPackageName());
        accessibilityEventObtain.setSource(s7974369370986781936, i);
        if (q() && (d16246464706717523548 = (D16246464706717523548) n().b(i)) != null) {
            R6653624393204003746 r6653624393204003746 = d16246464706717523548.a;
            accessibilityEventObtain.setPassword(r6653624393204003746.d.a.c(D10671166500636893138.N));
            Object objG = r6653624393204003746.d.a.g(D10671166500636893138.f192o);
            if (objG == null) {
                objG = null;
            }
            boolean zT = S10823041268949770285.t(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                H3737085483209546534.k(accessibilityEventObtain, zT);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent k(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = j(i, 8192);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
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
                ArrayList arrayListB = E4662066703278899418.b(r6653624393204003746, new A6662317080022852970((Object) q9908018528090167751, (byte) 8), new A6662317080022852970((Object) resources, (byte) 9), K5751602218013079365.U(r6653624393204003746));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((R6653624393204003746) arrayListB.get(i - 1)).f;
                        int i3 = ((R6653624393204003746) arrayListB.get(i)).f;
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.S6349823729575121924 p(dev.epro.r0.R6653624393204003746 r10, android.graphics.Rect r11, dev.epro.r0.I5573661370475160895 r12) {
        /*
            r9 = this;
            dev.epro.r0.P6136162524265531704 r0 = new dev.epro.r0.P6136162524265531704
            r0.<init>(r12)
            dev.epro.r0.H11725168162114556860 r10 = r10.c
            dev.epro.r0.X9608137461199640409 r12 = r10.F
            java.lang.Object r12 = r12.g
            dev.epro.r0.R15896830329318850690 r12 = (dev.epro.r0.R15896830329318850690) r12
            int r1 = r12.d
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L78
        L16:
            if (r12 == 0) goto L78
            int r1 = r12.c
            r1 = r1 & 8
            if (r1 == 0) goto L6f
            r1 = r12
            r5 = r2
        L20:
            if (r1 == 0) goto L6f
            boolean r6 = r1 instanceof dev.epro.r0.T11401768751197276141
            if (r6 == 0) goto L32
            r6 = r1
            dev.epro.r0.T11401768751197276141 r6 = (dev.epro.r0.T11401768751197276141) r6
            r6.V(r0)
            boolean r6 = r0.a
            if (r6 == 0) goto L6a
            r2 = r1
            goto L78
        L32:
            int r6 = r1.c
            r6 = r6 & 8
            if (r6 == 0) goto L6a
            boolean r6 = r1 instanceof dev.epro.r0.J2215566372910931965
            if (r6 == 0) goto L6a
            r6 = r1
            dev.epro.r0.J2215566372910931965 r6 = (dev.epro.r0.J2215566372910931965) r6
            dev.epro.r0.R15896830329318850690 r6 = r6.p
            r7 = r4
        L42:
            if (r6 == 0) goto L67
            int r8 = r6.c
            r8 = r8 & 8
            if (r8 == 0) goto L64
            int r7 = r7 + 1
            if (r7 != r3) goto L50
            r1 = r6
            goto L64
        L50:
            if (r5 != 0) goto L5b
            dev.epro.r0.D389890677992184566 r5 = new dev.epro.r0.D389890677992184566
            r8 = 16
            dev.epro.r0.R15896830329318850690[] r8 = new dev.epro.r0.R15896830329318850690[r8]
            r5.<init>(r4, r8)
        L5b:
            if (r1 == 0) goto L61
            r5.b(r1)
            r1 = r2
        L61:
            r5.b(r6)
        L64:
            dev.epro.r0.R15896830329318850690 r6 = r6.f
            goto L42
        L67:
            if (r7 != r3) goto L6a
            goto L20
        L6a:
            dev.epro.r0.R15896830329318850690 r1 = dev.epro.r0.R7033599853981556291.M(r5)
            goto L20
        L6f:
            int r1 = r12.d
            r1 = r1 & 8
            if (r1 == 0) goto L78
            dev.epro.r0.R15896830329318850690 r12 = r12.f
            goto L16
        L78:
            dev.epro.r0.T11401768751197276141 r2 = (dev.epro.r0.T11401768751197276141) r2
            if (r2 == 0) goto Lbb
            r12 = r2
            dev.epro.r0.R15896830329318850690 r12 = (dev.epro.r0.R15896830329318850690) r12
            dev.epro.r0.R15896830329318850690 r12 = r12.a
            boolean r12 = r12.n
            if (r12 != r3) goto Lbb
            dev.epro.r0.Y4989033692226475498 r10 = dev.epro.r0.R7033599853981556291.Q(r2)
            dev.epro.r0.B1029012102904255937 r12 = dev.epro.r0.V12319504402545346730.z(r10)
            dev.epro.r0.S6349823729575121924 r10 = r12.E(r10, r4)
            float r12 = r10.a
            float r0 = r10.b
            float r1 = r10.c
            float r10 = r10.d
            android.graphics.Rect r9 = r9.H(r12, r0, r1, r10)
            int r10 = r9.left
            int r12 = r11.left
            int r10 = r10 - r12
            float r10 = (float) r10
            int r12 = r9.top
            int r11 = r11.top
            int r12 = r12 - r11
            float r11 = (float) r12
            dev.epro.r0.S6349823729575121924 r12 = new dev.epro.r0.S6349823729575121924
            int r0 = r9.width()
            float r0 = (float) r0
            float r0 = r0 + r10
            int r9 = r9.height()
            float r9 = (float) r9
            float r9 = r9 + r11
            r12.<init>(r10, r11, r0, r9)
            return r12
        Lbb:
            dev.epro.r0.X9608137461199640409 r9 = r10.F
            java.lang.Object r9 = r9.e
            dev.epro.r0.Y4989033692226475498 r9 = (dev.epro.r0.Y4989033692226475498) r9
            dev.epro.r0.S6349823729575121924 r9 = dev.epro.r0.V12319504402545346730.u(r9, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.p(dev.epro.r0.R6653624393204003746, android.graphics.Rect, dev.epro.r0.I5573661370475160895):dev.epro.r0.S6349823729575121924");
    }

    public final boolean q() {
        AccessibilityManager accessibilityManager = this.g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.i;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.i = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(dev.epro.r0.R6653624393204003746 r20, dev.epro.r0.P12773055964240635680 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = dev.epro.r0.F272001595334312984.a
            dev.epro.r0.P12475571966978616537 r3 = new dev.epro.r0.P12475571966978616537
            r3.<init>()
            r4 = 4
            java.util.List r5 = dev.epro.r0.R6653624393204003746.j(r4, r1)
            dev.epro.r0.H11725168162114556860 r6 = r1.c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            dev.epro.r0.R6653624393204003746 r10 = (dev.epro.r0.R6653624393204003746) r10
            dev.epro.r0.W13131470296662841006 r11 = r0.n()
            int r10 = r10.f
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            dev.epro.r0.P12475571966978616537 r11 = r2.b
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L3a
            r0.r(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            dev.epro.r0.P12475571966978616537 r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L80
            r0.r(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = dev.epro.r0.R6653624393204003746.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            dev.epro.r0.R6653624393204003746 r3 = (dev.epro.r0.R6653624393204003746) r3
            dev.epro.r0.Q9908018528090167751 r4 = r0.G
            int r5 = r3.f
            java.lang.Object r4 = r4.b(r5)
            dev.epro.r0.P12773055964240635680 r4 = (dev.epro.r0.P12773055964240635680) r4
            if (r4 == 0) goto Lb6
            dev.epro.r0.W13131470296662841006 r5 = r0.n()
            int r6 = r3.f
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.w(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8477675461387041761.w(dev.epro.r0.R6653624393204003746, dev.epro.r0.P12773055964240635680):void");
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
        AccessibilityEvent accessibilityEventJ = j(i, i2);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(P3521844374884164894.a(list, ",", null, 62));
        }
        return x(accessibilityEventJ);
    }
}
