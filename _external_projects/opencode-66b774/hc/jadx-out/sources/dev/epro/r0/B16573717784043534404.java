package dev.epro.r0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B16573717784043534404 {
    public final S7974369370986781936 a;
    public final Q7316561721656982910 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public F13241018602672925865 j;
    public Q17957571128037780363 k;
    public R17143752899285419206 l;
    public S6349823729575121924 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S6349823729575121924 f172o;
    public final Object c = new Object();
    public F4096073349764486348 m = C9244826096114317613.d;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = N9580590882934638229.a();
    public final Matrix r = new Matrix();

    public B16573717784043534404(S7974369370986781936 s7974369370986781936, Q7316561721656982910 q7316561721656982910) {
        this.a = s7974369370986781936;
        this.b = q7316561721656982910;
    }

    public final void a() {
        View view;
        Q7316561721656982910 q7316561721656982910 = this.b;
        K7493131619793429513 k7493131619793429513 = (K7493131619793429513) q7316561721656982910.c;
        InputMethodManager inputMethodManager = (InputMethodManager) k7493131619793429513.getValue();
        View view2 = (View) q7316561721656982910.b;
        if (inputMethodManager.isActive(view2)) {
            F4096073349764486348 f4096073349764486348 = this.m;
            float[] fArr = this.q;
            f4096073349764486348.invoke(new N9580590882934638229(fArr));
            this.a.t(fArr);
            Matrix matrix = this.r;
            Q13169198992966610970.o0(matrix, fArr);
            F13241018602672925865 f13241018602672925865 = this.j;
            f13241018602672925865.getClass();
            long j = f13241018602672925865.b;
            R17143752899285419206 r17143752899285419206 = this.l;
            r17143752899285419206.getClass();
            Q17957571128037780363 q17957571128037780363 = this.k;
            q17957571128037780363.getClass();
            V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
            S6349823729575121924 s6349823729575121924 = this.n;
            s6349823729575121924.getClass();
            float f = s6349823729575121924.d;
            float f2 = s6349823729575121924.b;
            S6349823729575121924 s63498237295751219242 = this.f172o;
            s63498237295751219242.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            F12478849263529740365 f12478849263529740365 = f13241018602672925865.c;
            int iG = F12478849263529740365.g(j);
            builder.setSelectionRange(iG, F12478849263529740365.f(j));
            O16392062884302746898 o16392062884302746898 = O16392062884302746898.b;
            if (!z || iG < 0) {
                view = view2;
            } else {
                int iS = r17143752899285419206.s(iG);
                S6349823729575121924 s6349823729575121924C = q17957571128037780363.c(iS);
                view = view2;
                float fP = W7808703833045379622.p(s6349823729575121924C.a, 0.0f, (int) (q17957571128037780363.c >> 32));
                boolean zR = V1475975160983963926.r(s6349823729575121924, fP, s6349823729575121924C.b);
                boolean zR2 = V1475975160983963926.r(s6349823729575121924, fP, s6349823729575121924C.d);
                boolean z5 = q17957571128037780363.a(iS) == o16392062884302746898;
                int i = (zR || zR2) ? 1 : 0;
                if (!zR || !zR2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = s6349823729575121924C.b;
                float f4 = s6349823729575121924C.d;
                builder.setInsertionMarkerLocation(fP, f3, f4, f4, i);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int iG2 = f12478849263529740365 != null ? F12478849263529740365.g(f12478849263529740365.a) : -1;
                int iF = f12478849263529740365 != null ? F12478849263529740365.f(f12478849263529740365.a) : -1;
                if (iG2 >= 0 && iG2 < iF) {
                    builder2.setComposingText(iG2, f13241018602672925865.a.b.subSequence(iG2, iF));
                    int iS2 = r17143752899285419206.s(iG2);
                    int iS3 = r17143752899285419206.s(iF);
                    float[] fArr2 = new float[(iS3 - iS2) * 4];
                    v11538895333762958192.a(T1335862270807194835.d(iS2, iS3), fArr2);
                    while (iG2 < iF) {
                        int iS4 = r17143752899285419206.s(iG2);
                        int i2 = (iS4 - iS2) * 4;
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iF;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iG2;
                        int i5 = (s6349823729575121924.a < f7 ? 1 : 0) & (f5 < s6349823729575121924.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!V1475975160983963926.r(s6349823729575121924, f5, f6) || !V1475975160983963926.r(s6349823729575121924, f7, f8)) {
                            i5 |= 2;
                        }
                        if (q17957571128037780363.a(iS4) == o16392062884302746898) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iG2 = i4 + 1;
                        iF = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                T3623367008917729099.o(builder2, s63498237295751219242);
            }
            if (i6 >= 34 && z4 && !s6349823729575121924.h()) {
                int i7 = v11538895333762958192.f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iQ = W7808703833045379622.q(v11538895333762958192.e(f2), 0, i7);
                int iQ2 = W7808703833045379622.q(v11538895333762958192.e(f), 0, i7);
                if (iQ <= iQ2) {
                    while (true) {
                        builder2.addVisibleLineBounds(q17957571128037780363.f(iQ), v11538895333762958192.f(iQ), q17957571128037780363.g(iQ), v11538895333762958192.b(iQ));
                        if (iQ == iQ2) {
                            break;
                        } else {
                            iQ++;
                        }
                    }
                }
            }
            ((InputMethodManager) k7493131619793429513.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
