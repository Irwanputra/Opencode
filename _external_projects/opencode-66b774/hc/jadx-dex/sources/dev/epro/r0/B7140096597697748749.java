package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B7140096597697748749 extends dev.epro.r0.T10113869190613358580 implements dev.epro.r0.F16971278462881137815 {
    public dev.epro.r0.N1420218926656397722 q;
    public dev.epro.r0.D2717688760023469083 r;
    public dev.epro.r0.I12071840179596922896 s;
    public boolean t;
    public final dev.epro.r0.V697849047308847220 u;
    public final dev.epro.r0.U16834965109098959004 v;
    public final dev.epro.r0.W10506740848038723587 w;
    public dev.epro.r0.X7175349259954592591 x;

    public B7140096597697748749(dev.epro.r0.N1420218926656397722 n1420218926656397722, dev.epro.r0.D2717688760023469083 d2717688760023469083, dev.epro.r0.I12071840179596922896 i12071840179596922896, boolean z) {
        this.q = n1420218926656397722;
        this.r = d2717688760023469083;
        this.s = i12071840179596922896;
        this.t = z;
        dev.epro.r0.V697849047308847220 v697849047308847220T = dev.epro.r0.V4416135141588678913.t(new dev.epro.r0.Q13254524308163418711(0L));
        this.u = v697849047308847220T;
        this.v = new dev.epro.r0.U16834965109098959004(new dev.epro.r0.L2216691091636065972(dev.epro.r0.E10717724117948616506.h(this.q, this.r, this.s, ((dev.epro.r0.Q13254524308163418711) v697849047308847220T.getValue()).a)), dev.epro.r0.K12992568251249708449.b, new dev.epro.r0.L2216691091636065972(dev.epro.r0.K12992568251249708449.c), 8);
        dev.epro.r0.L11691784326485178634 l11691784326485178634 = new dev.epro.r0.L11691784326485178634(this, (byte) 0);
        dev.epro.r0.L11691784326485178634 l116917843264851786342 = new dev.epro.r0.L11691784326485178634(this, (byte) 1);
        if (!dev.epro.r0.C3128094202652520619.a()) {
            dev.epro.r0.D11988991656201568495.j("Magnifier is only supported on API level 28 and higher.");
            throw null;
        }
        dev.epro.r0.W10506740848038723587 w10506740848038723587 = new dev.epro.r0.W10506740848038723587(l11691784326485178634, l116917843264851786342, android.os.Build.VERSION.SDK_INT == 28 ? dev.epro.r0.L8574810731695704454.a : dev.epro.r0.T14814967362137961572.a);
        h1(w10506740848038723587);
        this.w = w10506740848038723587;
    }

    public final void E(dev.epro.r0.N17396598995248644478 n17396598995248644478) {
        n17396598995248644478.a();
        this.w.E(n17396598995248644478);
    }

    public final void V(dev.epro.r0.S2460821117650695638 s2460821117650695638) {
        this.w.V(s2460821117650695638);
    }

    public final void Z0() {
        l1();
    }

    public final void k1(dev.epro.r0.N1420218926656397722 n1420218926656397722, dev.epro.r0.D2717688760023469083 d2717688760023469083, dev.epro.r0.I12071840179596922896 i12071840179596922896, boolean z) {
        dev.epro.r0.N1420218926656397722 n14202189266563977222 = this.q;
        dev.epro.r0.D2717688760023469083 d27176887600234690832 = this.r;
        dev.epro.r0.I12071840179596922896 i120718401795969228962 = this.s;
        boolean z2 = this.t;
        this.q = n1420218926656397722;
        this.r = d2717688760023469083;
        this.s = i12071840179596922896;
        this.t = z;
        if (dev.epro.r0.S10823041268949770285.t(n1420218926656397722, n14202189266563977222) && d2717688760023469083 == d27176887600234690832 && dev.epro.r0.S10823041268949770285.t(i12071840179596922896, i120718401795969228962) && z == z2) {
            return;
        }
        l1();
    }

    public final void l1() {
        dev.epro.r0.X7175349259954592591 x7175349259954592591 = this.x;
        if (x7175349259954592591 != null) {
            x7175349259954592591.c((java.util.concurrent.CancellationException) null);
        }
        this.x = null;
        if (dev.epro.r0.C3128094202652520619.a()) {
            if (!this.t && (((dev.epro.r0.L2216691091636065972) this.v.d()).a & 9223372034707292159L) != 9205357640488583168L) {
                dev.epro.r0.R7033599853981556291.E(V0(), (dev.epro.r0.G8001132634698687269) null, dev.epro.r0.L856869997670741194.d, new dev.epro.r0.G16212247282630895364(this, (dev.epro.r0.R4833348786910499294) null, (byte) 17), 1);
            }
            this.x = dev.epro.r0.R7033599853981556291.E(V0(), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.G5547415528770645763(this, (dev.epro.r0.R4833348786910499294) null, (byte) 13), 3);
        }
    }

    public final void s0(dev.epro.r0.Y4989033692226475498 y4989033692226475498) {
        this.w.s0(y4989033692226475498);
    }
}
