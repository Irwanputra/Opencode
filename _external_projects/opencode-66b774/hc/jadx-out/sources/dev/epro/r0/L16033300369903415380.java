package dev.epro.r0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
        B1029012102904255937 b1029012102904255937B;
        Q17957571128037780363 q17957571128037780363C;
        I12071840179596922896 i12071840179596922896 = this.b;
        B1029012102904255937 b1029012102904255937E = i12071840179596922896.e();
        if (b1029012102904255937E != null) {
            if (!b1029012102904255937E.C()) {
                b1029012102904255937E = null;
            }
            if (b1029012102904255937E != null && (b1029012102904255937 = (B1029012102904255937) i12071840179596922896.d.getValue()) != null) {
                if (!b1029012102904255937.C()) {
                    b1029012102904255937 = null;
                }
                if (b1029012102904255937 != null && (b1029012102904255937B = i12071840179596922896.b()) != null) {
                    if (!b1029012102904255937B.C()) {
                        b1029012102904255937B = null;
                    }
                    if (b1029012102904255937B != null && (q17957571128037780363C = i12071840179596922896.c()) != null) {
                        C8185053590072587931 c8185053590072587931D = this.a.d();
                        float[] fArr = this.k;
                        N9580590882934638229.d(fArr);
                        b1029012102904255937E.D(fArr);
                        Matrix matrix = this.l;
                        Q13169198992966610970.o0(matrix, fArr);
                        S6349823729575121924 s6349823729575121924K = M18113111391818111737.T(b1029012102904255937).k(b1029012102904255937E.r(b1029012102904255937, 0L));
                        S6349823729575121924 s6349823729575121924K2 = M18113111391818111737.T(b1029012102904255937B).k(b1029012102904255937E.r(b1029012102904255937B, 0L));
                        long j = c8185053590072587931D.d;
                        F12478849263529740365 f12478849263529740365 = c8185053590072587931D.e;
                        boolean z = this.f;
                        boolean z2 = this.g;
                        boolean z3 = this.h;
                        boolean z4 = this.i;
                        CursorAnchorInfo.Builder builder = this.j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iG = F12478849263529740365.g(j);
                        builder.setSelectionRange(iG, F12478849263529740365.f(j));
                        O16392062884302746898 o16392062884302746898 = O16392062884302746898.b;
                        if (z && iG >= 0) {
                            S6349823729575121924 s6349823729575121924C = q17957571128037780363C.c(iG);
                            float fP = W7808703833045379622.p(s6349823729575121924C.a, 0.0f, (int) (q17957571128037780363C.c >> 32));
                            boolean zY = A10225670138084435446.y(s6349823729575121924K, fP, s6349823729575121924C.b);
                            boolean zY2 = A10225670138084435446.y(s6349823729575121924K, fP, s6349823729575121924C.d);
                            boolean z5 = q17957571128037780363C.a(iG) == o16392062884302746898;
                            int i = (zY || zY2) ? 1 : 0;
                            if (!zY || !zY2) {
                                i |= 2;
                            }
                            if (z5) {
                                i |= 4;
                            }
                            int i2 = i;
                            float f = s6349823729575121924C.b;
                            float f2 = s6349823729575121924C.d;
                            builder.setInsertionMarkerLocation(fP, f, f2, f2, i2);
                        }
                        if (z2) {
                            int iG2 = f12478849263529740365 != null ? F12478849263529740365.g(f12478849263529740365.a) : -1;
                            int iF = f12478849263529740365 != null ? F12478849263529740365.f(f12478849263529740365.a) : -1;
                            if (iG2 >= 0 && iG2 < iF) {
                                builder.setComposingText(iG2, c8185053590072587931D.c.subSequence(iG2, iF));
                                float[] fArr2 = new float[(iF - iG2) * 4];
                                q17957571128037780363C.b.a(T1335862270807194835.d(iG2, iF), fArr2);
                                int i3 = iG2;
                                while (i3 < iF) {
                                    int i4 = (i3 - iG2) * 4;
                                    float f3 = fArr2[i4];
                                    float f4 = fArr2[i4 + 1];
                                    float f5 = fArr2[i4 + 2];
                                    float f6 = fArr2[i4 + 3];
                                    int i5 = iF;
                                    int i6 = (f3 < s6349823729575121924K.c ? 1 : 0) & (s6349823729575121924K.a < f5 ? 1 : 0) & (s6349823729575121924K.b < f6 ? 1 : 0) & (f4 < s6349823729575121924K.d ? 1 : 0);
                                    if (!A10225670138084435446.y(s6349823729575121924K, f3, f4) || !A10225670138084435446.y(s6349823729575121924K, f5, f6)) {
                                        i6 |= 2;
                                    }
                                    if (q17957571128037780363C.a(i3) == o16392062884302746898) {
                                        i6 |= 4;
                                    }
                                    builder.addCharacterBounds(i3, f3, f4, f5, f6, i6);
                                    i3++;
                                    iF = i5;
                                }
                            }
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 33 && z3) {
                            T3623367008917729099.p(builder, s6349823729575121924K2);
                        }
                        if (i7 >= 34 && z4) {
                            M2066880349381062048.t(builder, q17957571128037780363C, s6349823729575121924K);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
