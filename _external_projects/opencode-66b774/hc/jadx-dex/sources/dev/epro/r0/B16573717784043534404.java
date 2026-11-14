package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B16573717784043534404 {
    public final dev.epro.r0.S7974369370986781936 a;
    public final dev.epro.r0.Q7316561721656982910 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public dev.epro.r0.F13241018602672925865 j;
    public dev.epro.r0.Q17957571128037780363 k;
    public dev.epro.r0.R17143752899285419206 l;
    public dev.epro.r0.S6349823729575121924 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dev.epro.r0.S6349823729575121924 f172o;
    public final java.lang.Object c = new java.lang.Object();
    public dev.epro.r0.F4096073349764486348 m = dev.epro.r0.C9244826096114317613.d;
    public final android.view.inputmethod.CursorAnchorInfo.Builder p = new android.view.inputmethod.CursorAnchorInfo.Builder();
    public final float[] q = dev.epro.r0.N9580590882934638229.a();
    public final android.graphics.Matrix r = new android.graphics.Matrix();

    public B16573717784043534404(dev.epro.r0.S7974369370986781936 s7974369370986781936, dev.epro.r0.Q7316561721656982910 q7316561721656982910) {
        this.a = s7974369370986781936;
        this.b = q7316561721656982910;
    }

    public final void a() {
        android.view.View view;
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = this.b;
        dev.epro.r0.K7493131619793429513 k7493131619793429513 = (dev.epro.r0.K7493131619793429513) q7316561721656982910.c;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) k7493131619793429513.getValue();
        android.view.View view2 = (android.view.View) q7316561721656982910.b;
        if (inputMethodManager.isActive(view2)) {
            dev.epro.r0.F4096073349764486348 f4096073349764486348 = this.m;
            float[] fArr = this.q;
            f4096073349764486348.invoke(new dev.epro.r0.N9580590882934638229(fArr));
            this.a.t(fArr);
            android.graphics.Matrix matrix = this.r;
            dev.epro.r0.Q13169198992966610970.o0(matrix, fArr);
            dev.epro.r0.F13241018602672925865 f13241018602672925865 = this.j;
            f13241018602672925865.getClass();
            long j = f13241018602672925865.b;
            dev.epro.r0.R17143752899285419206 r17143752899285419206 = this.l;
            r17143752899285419206.getClass();
            dev.epro.r0.Q17957571128037780363 q17957571128037780363 = this.k;
            q17957571128037780363.getClass();
            dev.epro.r0.V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
            dev.epro.r0.S6349823729575121924 s6349823729575121924 = this.n;
            s6349823729575121924.getClass();
            float f = s6349823729575121924.d;
            float f2 = s6349823729575121924.b;
            dev.epro.r0.S6349823729575121924 s63498237295751219242 = this.f172o;
            s63498237295751219242.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            android.view.inputmethod.CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            dev.epro.r0.F12478849263529740365 f12478849263529740365 = f13241018602672925865.c;
            int iG = dev.epro.r0.F12478849263529740365.g(j);
            builder.setSelectionRange(iG, dev.epro.r0.F12478849263529740365.f(j));
            dev.epro.r0.O16392062884302746898 o16392062884302746898 = dev.epro.r0.O16392062884302746898.b;
            if (!z || iG < 0) {
                view = view2;
            } else {
                int iS = r17143752899285419206.s(iG);
                dev.epro.r0.S6349823729575121924 s6349823729575121924C = q17957571128037780363.c(iS);
                view = view2;
                float fP = dev.epro.r0.W7808703833045379622.p(s6349823729575121924C.a, 0.0f, (int) (q17957571128037780363.c >> 32));
                boolean zR = dev.epro.r0.V1475975160983963926.r(s6349823729575121924, fP, s6349823729575121924C.b);
                boolean zR2 = dev.epro.r0.V1475975160983963926.r(s6349823729575121924, fP, s6349823729575121924C.d);
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
            android.view.inputmethod.CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int iG2 = f12478849263529740365 != null ? dev.epro.r0.F12478849263529740365.g(f12478849263529740365.a) : -1;
                int iF = f12478849263529740365 != null ? dev.epro.r0.F12478849263529740365.f(f12478849263529740365.a) : -1;
                if (iG2 >= 0 && iG2 < iF) {
                    builder2.setComposingText(iG2, f13241018602672925865.a.b.subSequence(iG2, iF));
                    int iS2 = r17143752899285419206.s(iG2);
                    int iS3 = r17143752899285419206.s(iF);
                    float[] fArr2 = new float[(iS3 - iS2) * 4];
                    v11538895333762958192.a(dev.epro.r0.T1335862270807194835.d(iS2, iS3), fArr2);
                    while (iG2 < iF) {
                        int iS4 = r17143752899285419206.s(iG2);
                        int i2 = (iS4 - iS2) * 4;
                        float f5 = fArr2[i2];
                        android.view.inputmethod.CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iF;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iG2;
                        int i5 = (s6349823729575121924.a < f7 ? 1 : 0) & (f5 < s6349823729575121924.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!dev.epro.r0.V1475975160983963926.r(s6349823729575121924, f5, f6) || !dev.epro.r0.V1475975160983963926.r(s6349823729575121924, f7, f8)) {
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
            int i6 = android.os.Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                dev.epro.r0.T3623367008917729099.o(builder2, s63498237295751219242);
            }
            if (i6 >= 34 && z4 && !s6349823729575121924.h()) {
                int i7 = v11538895333762958192.f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iQ = dev.epro.r0.W7808703833045379622.q(v11538895333762958192.e(f2), 0, i7);
                int iQ2 = dev.epro.r0.W7808703833045379622.q(v11538895333762958192.e(f), 0, i7);
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
            ((android.view.inputmethod.InputMethodManager) k7493131619793429513.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
