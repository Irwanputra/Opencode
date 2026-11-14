package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X4371701013878427434 extends A16217782072638364977 {

    /* renamed from: o, reason: collision with root package name */
    public O11687042873311337343 f573o;
    public W1972671267364756056 p;
    public O7205211285568135375 q;
    public Z17471428274427141949 r;
    public Z17471428274427141949 s;
    public long t = 0;
    public long u = 0;
    public final X14079453919454031099 v = new X14079453919454031099(this, (byte) 1);
    public final X14079453919454031099 w = new X14079453919454031099(this, (byte) 0);
    public long x = -9223372034707292160L;

    public X4371701013878427434(O11687042873311337343 o11687042873311337343, W1972671267364756056 w1972671267364756056, O7205211285568135375 o7205211285568135375) {
        this.f573o = o11687042873311337343;
        this.p = w1972671267364756056;
        this.q = o7205211285568135375;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void b1() {
        this.x = -9223372034707292160L;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        long j2;
        Z17471428274427141949 d = g17613326942144185441.d(j);
        if (i5164649337253478959.A()) {
            j2 = (d.a << 32) | (d.b & 4294967295L);
        } else {
            O11687042873311337343 o11687042873311337343 = this.f573o;
            int i = d.a;
            if (o11687042873311337343 == null) {
                j2 = (i << 32) | (d.b & 4294967295L);
                this.x = j2;
            } else {
                long j3 = (d.b & 4294967295L) | (i << 32);
                C1787322630442623407 a = o11687042873311337343.a(new H6263990587016482899(this, j3, (byte) 0), null, null, new H6263990587016482899(this, j3, (byte) 1));
                j2 = ((Q13254524308163418711) a.getValue()).a;
                this.x = ((Q13254524308163418711) a.getValue()).a;
            }
        }
        boolean A = i5164649337253478959.A();
        X9852054718446117252 x9852054718446117252 = X9852054718446117252.a;
        if (A) {
            this.r = d;
            this.t = j2;
            return i5164649337253478959.m((int) (j2 >> 32), (int) (j2 & 4294967295L), x9852054718446117252, this.v);
        }
        this.s = d;
        this.u = j2;
        return i5164649337253478959.m((int) (j2 >> 32), (int) (j2 & 4294967295L), x9852054718446117252, this.w);
    }
}
