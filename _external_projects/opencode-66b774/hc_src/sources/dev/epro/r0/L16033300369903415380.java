package dev.epro.r0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L16033300369903415380 {
    public final N1420218926656397722 a;
    public final I12071840179596922896 b;
    public final W8455343525638953052 c;
    public final W5797197595347441198 d;
    public X7175349259954592591 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final CursorAnchorInfo.Builder j = new CursorAnchorInfo.Builder();
    public final float[] k = N9580590882934638229.a();
    public final Matrix l = new Matrix();

    public L16033300369903415380(N1420218926656397722 n1420218926656397722, I12071840179596922896 i12071840179596922896, W8455343525638953052 w8455343525638953052, W5797197595347441198 w5797197595347441198) {
        this.a = n1420218926656397722;
        this.b = i12071840179596922896;
        this.c = w8455343525638953052;
        this.d = w5797197595347441198;
    }

    public final CursorAnchorInfo a() {
        B1029012102904255937 b1029012102904255937;
        B1029012102904255937 b;
        Q17957571128037780363 c;
        I12071840179596922896 i12071840179596922896 = this.b;
        B1029012102904255937 e = i12071840179596922896.e();
        if (e != null) {
            if (!e.C()) {
                e = null;
            }
            if (e != null && (b1029012102904255937 = (B1029012102904255937) i12071840179596922896.d.getValue()) != null) {
                if (!b1029012102904255937.C()) {
                    b1029012102904255937 = null;
                }
                if (b1029012102904255937 != null && (b = i12071840179596922896.b()) != null) {
                    if (!b.C()) {
                        b = null;
                    }
                    if (b != null && (c = i12071840179596922896.c()) != null) {
                        C8185053590072587931 d = this.a.d();
                        float[] fArr = this.k;
                        N9580590882934638229.d(fArr);
                        e.D(fArr);
                        Matrix matrix = this.l;
                        Q13169198992966610970.o0(matrix, fArr);
                        S6349823729575121924 k = M18113111391818111737.T(b1029012102904255937).k(e.r(b1029012102904255937, 0L));
                        S6349823729575121924 k2 = M18113111391818111737.T(b).k(e.r(b, 0L));
                        long j = d.d;
                        F12478849263529740365 f12478849263529740365 = d.e;
                        boolean z = this.f;
                        boolean z2 = this.g;
                        boolean z3 = this.h;
                        boolean z4 = this.i;
                        CursorAnchorInfo.Builder builder = this.j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int g = F12478849263529740365.g(j);
                        builder.setSelectionRange(g, F12478849263529740365.f(j));
                        O16392062884302746898 o16392062884302746898 = O16392062884302746898.b;
                        if (z && g >= 0) {
                            S6349823729575121924 c2 = c.c(g);
                            float p = W7808703833045379622.p(c2.a, 0.0f, (int) (c.c >> 32));
                            boolean y = A10225670138084435446.y(k, p, c2.b);
                            boolean y2 = A10225670138084435446.y(k, p, c2.d);
                            boolean z5 = c.a(g) == o16392062884302746898;
                            int i = (y || y2) ? 1 : 0;
                            if (!y || !y2) {
                                i |= 2;
                            }
                            if (z5) {
                                i |= 4;
                            }
                            int i2 = i;
                            float f = c2.b;
                            float f2 = c2.d;
                            builder.setInsertionMarkerLocation(p, f, f2, f2, i2);
                        }
                        if (z2) {
                            int g2 = f12478849263529740365 != null ? F12478849263529740365.g(f12478849263529740365.a) : -1;
                            int f3 = f12478849263529740365 != null ? F12478849263529740365.f(f12478849263529740365.a) : -1;
                            if (g2 >= 0 && g2 < f3) {
                                builder.setComposingText(g2, d.c.subSequence(g2, f3));
                                float[] fArr2 = new float[(f3 - g2) * 4];
                                c.b.a(T1335862270807194835.d(g2, f3), fArr2);
                                int i3 = g2;
                                while (i3 < f3) {
                                    int i4 = (i3 - g2) * 4;
                                    float f4 = fArr2[i4];
                                    float f5 = fArr2[i4 + 1];
                                    float f6 = fArr2[i4 + 2];
                                    float f7 = fArr2[i4 + 3];
                                    int i5 = f3;
                                    int i6 = (f4 < k.c ? 1 : 0) & (k.a < f6 ? 1 : 0) & (k.b < f7 ? 1 : 0) & (f5 < k.d ? 1 : 0);
                                    if (!A10225670138084435446.y(k, f4, f5) || !A10225670138084435446.y(k, f6, f7)) {
                                        i6 |= 2;
                                    }
                                    if (c.a(i3) == o16392062884302746898) {
                                        i6 |= 4;
                                    }
                                    builder.addCharacterBounds(i3, f4, f5, f6, f7, i6);
                                    i3++;
                                    f3 = i5;
                                }
                            }
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 33 && z3) {
                            T3623367008917729099.p(builder, k2);
                        }
                        if (i7 >= 34 && z4) {
                            M2066880349381062048.t(builder, c, k);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
