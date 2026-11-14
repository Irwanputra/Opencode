package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I2076339260272013590 {
    public final V697849047308847220 A;
    public final V697849047308847220 B;
    public I3583119498707957918 a;
    public final V4878375136513573151 b;
    public final L2387191309177986288 c;
    public final W8455343525638953052 d;
    public T17961989259024028332 e;
    public final V697849047308847220 f;
    public final V697849047308847220 g;
    public B1029012102904255937 h;
    public final V697849047308847220 i;
    public M11181104712105445833 j;
    public final V697849047308847220 k;
    public final V697849047308847220 l;
    public final V697849047308847220 m;
    public final V697849047308847220 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V697849047308847220 f290o;
    public boolean p;
    public final V697849047308847220 q;
    public final U9414423904173882634 r;
    public final V697849047308847220 s;
    public final V697849047308847220 t;
    public F4096073349764486348 u;
    public final K5582280330939368310 v;
    public final K5582280330939368310 w;
    public final K5582280330939368310 x;
    public final O3228356295430981133 y;
    public long z;

    public I2076339260272013590(I3583119498707957918 i3583119498707957918, V4878375136513573151 v4878375136513573151, L2387191309177986288 l2387191309177986288) {
        this.a = i3583119498707957918;
        this.b = v4878375136513573151;
        this.c = l2387191309177986288;
        W8455343525638953052 w8455343525638953052 = new W8455343525638953052((byte) 22, false);
        M11181104712105445833 m11181104712105445833 = Z15472362586437216226.a;
        long j = F12478849263529740365.b;
        F13241018602672925865 f13241018602672925865 = new F13241018602672925865(m11181104712105445833, j, (F12478849263529740365) null);
        w8455343525638953052.b = f13241018602672925865;
        w8455343525638953052.c = new K15317901533566777301(m11181104712105445833, f13241018602672925865.b);
        this.d = w8455343525638953052;
        Boolean bool = Boolean.FALSE;
        this.f = V4416135141588678913.t(bool);
        this.g = V4416135141588678913.t(new A891803927997771281(0.0f));
        this.i = V4416135141588678913.t(null);
        this.k = V4416135141588678913.t(I3645473568512758926.a);
        this.l = V4416135141588678913.t(bool);
        this.m = V4416135141588678913.t(bool);
        this.n = V4416135141588678913.t(bool);
        this.f290o = V4416135141588678913.t(bool);
        this.p = true;
        this.q = V4416135141588678913.t(Boolean.TRUE);
        this.r = new U9414423904173882634(l2387191309177986288);
        this.s = V4416135141588678913.t(bool);
        this.t = V4416135141588678913.t(bool);
        this.u = new X2899556981606350920((byte) 7);
        this.v = new K5582280330939368310(this, (byte) 1);
        this.w = new K5582280330939368310(this, (byte) 2);
        this.x = new K5582280330939368310(this, (byte) 3);
        this.y = E12775674050813925581.g();
        this.z = U10174709222559481877.h;
        this.A = V4416135141588678913.t(new F12478849263529740365(j));
        this.B = V4416135141588678913.t(new F12478849263529740365(j));
    }

    public final I3645473568512758926 a() {
        return (I3645473568512758926) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final B1029012102904255937 c() {
        B1029012102904255937 b1029012102904255937 = this.h;
        if (b1029012102904255937 == null || !b1029012102904255937.C()) {
            return null;
        }
        return b1029012102904255937;
    }

    public final N17980339148608222959 d() {
        return (N17980339148608222959) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new F12478849263529740365(j));
    }

    public final void f(long j) {
        this.A.setValue(new F12478849263529740365(j));
    }
}
