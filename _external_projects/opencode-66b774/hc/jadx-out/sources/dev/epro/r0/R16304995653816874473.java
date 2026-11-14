package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R16304995653816874473 extends R15896830329318850690 implements D10205225622993155321, T11401768751197276141 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public G17854281415623469737 f465o;
    public boolean p;

    @Override // dev.epro.r0.T11401768751197276141
    public final void V(S2460821117650695638 s2460821117650695638) {
        U4676709778812953726.q(s2460821117650695638);
        final byte b = 0;
        final byte b2 = 1;
        T16405881657594259547 t16405881657594259547 = new T16405881657594259547(new B13729205492206812220(this) { // from class: dev.epro.r0.W8074521310633161902
            public final /* synthetic */ R16304995653816874473 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                int iG;
                byte b3 = b;
                R16304995653816874473 r16304995653816874473 = this.b;
                switch (b3) {
                    case 0:
                        iG = r16304995653816874473.f465o.a.g();
                        break;
                    default:
                        iG = r16304995653816874473.f465o.f.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new B13729205492206812220(this) { // from class: dev.epro.r0.W8074521310633161902
            public final /* synthetic */ R16304995653816874473 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                int iG;
                byte b3 = b2;
                R16304995653816874473 r16304995653816874473 = this.b;
                switch (b3) {
                    case 0:
                        iG = r16304995653816874473.f465o.a.g();
                        break;
                    default:
                        iG = r16304995653816874473.f465o.f.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (!this.p) {
            U4676709778812953726.j(s2460821117650695638, t16405881657594259547);
            return;
        }
        P14992748401341948828 p14992748401341948828 = D10671166500636893138.w;
        D15596191924284547207 d15596191924284547207 = U4676709778812953726.a[13];
        p14992748401341948828.getClass();
        s2460821117650695638.a(p14992748401341948828, t16405881657594259547);
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int W(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return g17613326942144185441.a0(i);
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        E18444280280170001567.w(j, this.p ? R7000310675073492254.a : R7000310675073492254.b);
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(I16980768508151520658.b(j, 0, this.p ? I16980768508151520658.i(j) : Integer.MAX_VALUE, 0, this.p ? Integer.MAX_VALUE : I16980768508151520658.h(j), 5));
        int i = z17471428274427141949D.a;
        int i2 = I16980768508151520658.i(j);
        if (i > i2) {
            i = i2;
        }
        int i3 = z17471428274427141949D.b;
        int iH = I16980768508151520658.h(j);
        if (i3 > iH) {
            i3 = iH;
        }
        int i4 = z17471428274427141949D.b - i3;
        int i5 = z17471428274427141949D.a - i;
        if (!this.p) {
            i4 = i5;
        }
        this.f465o.f(i4);
        this.f465o.b.h(this.p ? i3 : i);
        this.f465o.c.h(this.p ? z17471428274427141949D.b : z17471428274427141949D.a);
        this.f465o.d.setValue(Boolean.FALSE);
        return i5164649337253478959.m(i, i3, X9852054718446117252.a, new C16936830270381006423(this, i4, z17471428274427141949D, (byte) 4));
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int l0(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return g17613326942144185441.f(i);
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int r(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return g17613326942144185441.b0(i);
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int z(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return g17613326942144185441.V(i);
    }
}
