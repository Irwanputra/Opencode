package dev.epro.r0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y11675591421631573075 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Serializable g;
    public final Object h;
    public final Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f582o;
    public Object p;
    public Object q;

    public Y11675591421631573075() {
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.f582o = new ArrayList();
    }

    public void a(G15471856606567993098 g15471856606567993098, Object... objArr) {
        ((ArrayList) this.g).add(new L14430836125261710634(g15471856606567993098, objArr));
    }

    public boolean b() {
        ArrayList arrayList = (ArrayList) this.n;
        ArrayList arrayList2 = (ArrayList) this.m;
        ArrayList arrayList3 = (ArrayList) this.l;
        ArrayList arrayList4 = (ArrayList) this.j;
        if (!((ArrayList) this.g).isEmpty()) {
            return true;
        }
        if (!arrayList4.isEmpty()) {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                if (!((A425643027312015150) obj).c.isEmpty()) {
                    return true;
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                if (!((N5994973193905141093) obj2).c.isEmpty()) {
                    return true;
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                if (!((U10137507234533468731) obj3).b.isEmpty()) {
                    return true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            int size4 = arrayList.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj4 = arrayList.get(i4);
                i4++;
                if (!((U10137507234533468731) obj4).b.isEmpty()) {
                    return true;
                }
            }
        }
        V14323974914327418545 v14323974914327418545 = (V14323974914327418545) this.p;
        return (v14323974914327418545 == null || v14323974914327418545.a.isEmpty()) ? false : true;
    }

    public void c(F11254987978987383037 f11254987978987383037) {
        int i = f11254987978987383037.a;
        ArrayList arrayList = (ArrayList) f11254987978987383037.c;
        if (i != 0) {
            throw new IllegalArgumentException("Unknown ApkSigResult Signing Block Scheme Id " + i);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.p = new V14323974914327418545((P15728539964912394135) arrayList.get(0));
    }

    public void d(P3161324327665759195 p3161324327665759195) {
        if (p3161324327665759195 == null) {
            return;
        }
        ArrayList arrayList = p3161324327665759195.g;
        if (p3161324327665759195.a()) {
            ((ArrayList) this.g).addAll(p3161324327665759195.i);
        }
        if (p3161324327665759195.b()) {
            ((ArrayList) this.h).addAll(p3161324327665759195.h);
        }
        int i = p3161324327665759195.a;
        int i2 = 0;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            this.p = new V14323974914327418545((P15728539964912394135) arrayList.get(0));
            return;
        }
        if (i == 31) {
            this.e = p3161324327665759195.b;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ArrayList) this.n).add(new U10137507234533468731((P5799335319119159120) obj));
            }
            this.q = p3161324327665759195.f;
            return;
        }
        if (i == 2) {
            this.c = p3161324327665759195.b;
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                ((ArrayList) this.l).add(new N5994973193905141093((P5799335319119159120) obj2));
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                S10973172697741180971.j("Unknown Signing Block Scheme Id");
                return;
            }
            this.f = p3161324327665759195.b;
            int size3 = arrayList.size();
            while (i2 < size3) {
                Object obj3 = arrayList.get(i2);
                i2++;
                ((ArrayList) this.f582o).add(new V1582076683219966939((P5799335319119159120) obj3));
            }
            return;
        }
        this.d = p3161324327665759195.b;
        int size4 = arrayList.size();
        while (i2 < size4) {
            Object obj4 = arrayList.get(i2);
            i2++;
            ((ArrayList) this.m).add(new U10137507234533468731((P5799335319119159120) obj4));
        }
        if (((V8767056641518014226) this.q) == null) {
            this.q = p3161324327665759195.f;
        }
    }

    public void e() {
        O16392062884302746898 o16392062884302746898;
        boolean z;
        boolean z2;
        Matrix matrix = (Matrix) this.q;
        float[] fArr = (float[]) this.p;
        W8455343525638953052 w8455343525638953052 = (W8455343525638953052) this.h;
        InputMethodManager B = w8455343525638953052.B();
        View view = (View) w8455343525638953052.b;
        if (!B.isActive(view) || ((F13241018602672925865) this.j) == null || ((R17143752899285419206) this.l) == null || ((Q17957571128037780363) this.k) == null || ((S6349823729575121924) this.m) == null || ((S6349823729575121924) this.n) == null) {
            return;
        }
        N9580590882934638229.d(fArr);
        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) ((H16627033410010803438) this.g).h.r.getValue();
        if (b1029012102904255937 != null) {
            if (!b1029012102904255937.C()) {
                b1029012102904255937 = null;
            }
            if (b1029012102904255937 != null) {
                b1029012102904255937.D(fArr);
            }
        }
        S6349823729575121924 s6349823729575121924 = (S6349823729575121924) this.n;
        s6349823729575121924.getClass();
        float f = -s6349823729575121924.a;
        S6349823729575121924 s63498237295751219242 = (S6349823729575121924) this.n;
        s63498237295751219242.getClass();
        N9580590882934638229.f(fArr, f, -s63498237295751219242.b);
        Q13169198992966610970.o0(matrix, fArr);
        CursorAnchorInfo.Builder builder = (CursorAnchorInfo.Builder) this.f582o;
        F13241018602672925865 f13241018602672925865 = (F13241018602672925865) this.j;
        f13241018602672925865.getClass();
        long j = f13241018602672925865.b;
        R17143752899285419206 r17143752899285419206 = (R17143752899285419206) this.l;
        r17143752899285419206.getClass();
        Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) this.k;
        q17957571128037780363.getClass();
        S6349823729575121924 s63498237295751219243 = (S6349823729575121924) this.m;
        s63498237295751219243.getClass();
        S6349823729575121924 s63498237295751219244 = (S6349823729575121924) this.n;
        s63498237295751219244.getClass();
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        builder.reset();
        builder.setMatrix(matrix);
        F12478849263529740365 f12478849263529740365 = f13241018602672925865.c;
        int g = F12478849263529740365.g(j);
        builder.setSelectionRange(g, F12478849263529740365.f(j));
        O16392062884302746898 o163920628843027468982 = O16392062884302746898.b;
        if (!z3 || g < 0) {
            o16392062884302746898 = o163920628843027468982;
            z = z5;
            z2 = z6;
        } else {
            int s = r17143752899285419206.s(g);
            S6349823729575121924 c = q17957571128037780363.c(s);
            z = z5;
            z2 = z6;
            float p = W7808703833045379622.p(c.a, 0.0f, (int) (q17957571128037780363.c >> 32));
            boolean y = A10225670138084435446.y(s63498237295751219243, p, c.b);
            boolean y2 = A10225670138084435446.y(s63498237295751219243, p, c.d);
            boolean z7 = q17957571128037780363.a(s) == o163920628843027468982;
            int i = (y || y2) ? 1 : 0;
            if (!y || !y2) {
                i |= 2;
            }
            if (z7) {
                i |= 4;
            }
            o16392062884302746898 = o163920628843027468982;
            float f2 = c.b;
            float f3 = c.d;
            builder.setInsertionMarkerLocation(p, f2, f3, f3, i);
        }
        if (z4) {
            int g2 = f12478849263529740365 != null ? F12478849263529740365.g(f12478849263529740365.a) : -1;
            int f4 = f12478849263529740365 != null ? F12478849263529740365.f(f12478849263529740365.a) : -1;
            if (g2 >= 0 && g2 < f4) {
                builder.setComposingText(g2, f13241018602672925865.a.b.subSequence(g2, f4));
                int s2 = r17143752899285419206.s(g2);
                int s3 = r17143752899285419206.s(f4);
                float[] fArr2 = new float[(s3 - s2) * 4];
                q17957571128037780363.b.a(T1335862270807194835.d(s2, s3), fArr2);
                int i2 = g2;
                while (i2 < f4) {
                    int s4 = r17143752899285419206.s(i2);
                    int i3 = (s4 - s2) * 4;
                    float f5 = fArr2[i3];
                    float f6 = fArr2[i3 + 1];
                    int i4 = f4;
                    float f7 = fArr2[i3 + 2];
                    float f8 = fArr2[i3 + 3];
                    int i5 = s2;
                    int i6 = (s63498237295751219243.a < f7 ? 1 : 0) & (f5 < s63498237295751219243.c ? 1 : 0) & (s63498237295751219243.b < f8 ? 1 : 0) & (f6 < s63498237295751219243.d ? 1 : 0);
                    if (!A10225670138084435446.y(s63498237295751219243, f5, f6) || !A10225670138084435446.y(s63498237295751219243, f7, f8)) {
                        i6 |= 2;
                    }
                    if (q17957571128037780363.a(s4) == o16392062884302746898) {
                        i6 |= 4;
                    }
                    builder.addCharacterBounds(i2, f5, f6, f7, f8, i6);
                    i2++;
                    fArr2 = fArr2;
                    s2 = i5;
                    f4 = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z) {
            T3623367008917729099.p(builder, s63498237295751219244);
        }
        if (i7 >= 34 && z2) {
            M2066880349381062048.t(builder, q17957571128037780363, s63498237295751219243);
        }
        w8455343525638953052.B().updateCursorAnchorInfo(view, builder.build());
        this.b = false;
    }

    public Y11675591421631573075(H16627033410010803438 h16627033410010803438, W8455343525638953052 w8455343525638953052) {
        this.g = h16627033410010803438;
        this.h = w8455343525638953052;
        this.i = new Object();
        this.f582o = new CursorAnchorInfo.Builder();
        this.p = N9580590882934638229.a();
        this.q = new Matrix();
    }
}
