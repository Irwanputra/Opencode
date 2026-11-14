package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O16937597380326035176 extends R15896830329318850690 implements F16971278462881137815, D10205225622993155321, C12172695433110393112 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S16571168858015125610 f404o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public S16571168858015125610 u;
    public J8361625609383425129 v;

    @Override // dev.epro.r0.R16749699847173633337
    public final void O0() {
        this.u = H4776669175763245653.l(this.f404o, R7033599853981556291.R(this).z);
        this.r = true;
        D1286559660607336098.v(this);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    @Override // dev.epro.r0.C12172695433110393112
    public final void Z() {
        if (this.v != null) {
            I3887072968740112330.D(this, new Z8708649088240431789(this, (byte) 1));
        }
        this.r = true;
        D1286559660607336098.v(this);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        U14340554418656580554 u14340554418656580554 = (U14340554418656580554) B11964701839924937722.o(this, Y238707362170117896.k);
        this.u = H4776669175763245653.l(this.f404o, R7033599853981556291.R(this).z);
        H885820584188137964 h885820584188137964 = j1().a.f;
        R6694982557896913324 r6694982557896913324 = j1().a.c;
        if (r6694982557896913324 == null) {
            r6694982557896913324 = R6694982557896913324.c;
        }
        M2626744064473853568 m2626744064473853568 = j1().a.d;
        int i = m2626744064473853568 != null ? m2626744064473853568.a : 0;
        S12008558933731077464 s12008558933731077464 = j1().a.e;
        this.v = ((M14117160572836268953) u14340554418656580554).b(h885820584188137964, r6694982557896913324, i, s12008558933731077464 != null ? s12008558933731077464.a : 65535);
        I3887072968740112330.D(this, new Z8708649088240431789(this, (byte) 0));
        this.r = true;
    }

    @Override // dev.epro.r0.R16749699847173633337
    public final void a() {
        this.r = true;
        D1286559660607336098.v(this);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        this.u = null;
        this.v = null;
        this.r = false;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        if (this.r) {
            h1(i5164649337253478959, j1(), (U14340554418656580554) B11964701839924937722.o(this, Y238707362170117896.k));
            this.r = false;
        }
        int i = this.s;
        int iQ = i != -1 ? W7808703833045379622.q(i, I16980768508151520658.j(j), I16980768508151520658.h(j)) : I16980768508151520658.j(j);
        int i2 = this.t;
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(I16980768508151520658.b(j, 0, 0, iQ, i2 != -1 ? W7808703833045379622.q(i2, I16980768508151520658.j(j), I16980768508151520658.h(j)) : I16980768508151520658.h(j), 3));
        return i5164649337253478959.m(z17471428274427141949D.a, z17471428274427141949D.b, X9852054718446117252.a, new Y17164194448930251553(z17471428274427141949D, (byte) 7));
    }

    public final void h1(I5164649337253478959 i5164649337253478959, S16571168858015125610 s16571168858015125610, U14340554418656580554 u14340554418656580554) {
        I18150855591218230259 i18150855591218230259 = X16499811727614532856.b(s16571168858015125610, i5164649337253478959, u14340554418656580554, 3, true).d;
        float fG = i18150855591218230259.g(0);
        float fG2 = i18150855591218230259.g(1);
        float fG3 = i18150855591218230259.g(2);
        this.s = V933048422416352811.j(fG, fG2, fG3, this.p, 1);
        this.t = V933048422416352811.j(fG, fG2, fG3, this.q, Integer.MAX_VALUE);
    }

    public final void i1(I11965759855724288421 i11965759855724288421) {
        if (this.r) {
            h1(i11965759855724288421, j1(), (U14340554418656580554) B11964701839924937722.o(this, Y238707362170117896.k));
            this.r = false;
        }
        int i = this.s;
        this.s = i >= 0 ? i : 0;
        int i2 = this.t;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.t = i2;
    }

    public final S16571168858015125610 j1() {
        S16571168858015125610 s16571168858015125610 = this.u;
        if (s16571168858015125610 != null) {
            return s16571168858015125610;
        }
        throw G11450220448113054352.f("Resolved style is not set.");
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int l0(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        i1(i11965759855724288421);
        int i2 = this.s;
        int i3 = this.t;
        if (i2 == i3) {
            return i3;
        }
        int iF = g17613326942144185441.f(i);
        int i4 = this.s;
        int i5 = this.t;
        if (iF < i4) {
            iF = i4;
        }
        return iF > i5 ? i5 : iF;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int r(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        i1(i11965759855724288421);
        int i2 = this.s;
        if (i2 == this.t) {
            return i2;
        }
        int iB0 = g17613326942144185441.b0(i);
        int i3 = this.s;
        int i4 = this.t;
        if (iB0 < i3) {
            iB0 = i3;
        }
        return iB0 > i4 ? i4 : iB0;
    }
}
