package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D16111500240585586517 extends dev.epro.r0.Y14132333989764804283 {
    public static final dev.epro.r0.J8779296386071736043 r = new dev.epro.r0.J8779296386071736043();
    public static final dev.epro.r0.D16457379462628768197 s = new dev.epro.r0.D16457379462628768197("closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f201o;
    public java.lang.String p;
    public dev.epro.r0.K15572083692188606544 q;

    public D16111500240585586517() {
        super(r);
        this.f201o = new java.util.ArrayList();
        this.q = dev.epro.r0.Y12917327898100101934.a;
    }

    public final void A(long j) {
        H(new dev.epro.r0.D16457379462628768197(java.lang.Long.valueOf(j)));
    }

    public final void B(java.lang.Boolean bool) {
        if (bool == null) {
            H(dev.epro.r0.Y12917327898100101934.a);
        } else {
            H(new dev.epro.r0.D16457379462628768197(bool));
        }
    }

    public final void C(java.lang.Number number) {
        if (number == null) {
            H(dev.epro.r0.Y12917327898100101934.a);
            return;
        }
        if (((dev.epro.r0.Y14132333989764804283) this).h != 1) {
            double dDoubleValue = number.doubleValue();
            if (java.lang.Double.isNaN(dDoubleValue) || java.lang.Double.isInfinite(dDoubleValue)) {
                dev.epro.r0.Q11088980322693754445.l("JSON forbids NaN and infinities: ", number);
                return;
            }
        }
        H(new dev.epro.r0.D16457379462628768197(number));
    }

    public final void D(java.lang.String str) {
        if (str == null) {
            H(dev.epro.r0.Y12917327898100101934.a);
        } else {
            H(new dev.epro.r0.D16457379462628768197(str));
        }
    }

    public final void E(boolean z) {
        H(new dev.epro.r0.D16457379462628768197(java.lang.Boolean.valueOf(z)));
    }

    public final dev.epro.r0.K15572083692188606544 G() {
        return (dev.epro.r0.K15572083692188606544) this.f201o.get(r1.size() - 1);
    }

    public final void H(dev.epro.r0.K15572083692188606544 k15572083692188606544) {
        if (this.p != null) {
            if (!(k15572083692188606544 instanceof dev.epro.r0.Y12917327898100101934) || ((dev.epro.r0.Y14132333989764804283) this).k) {
                G().q(this.p, k15572083692188606544);
            }
            this.p = null;
            return;
        }
        if (this.f201o.isEmpty()) {
            this.q = k15572083692188606544;
            return;
        }
        dev.epro.r0.P16422848101170923038 p16422848101170923038G = G();
        if (p16422848101170923038G instanceof dev.epro.r0.P16422848101170923038) {
            p16422848101170923038G.q(k15572083692188606544);
        } else {
            dev.epro.r0.Z3383101362411723454.r();
        }
    }

    public final void c() {
        dev.epro.r0.P16422848101170923038 p16422848101170923038 = new dev.epro.r0.P16422848101170923038();
        H(p16422848101170923038);
        this.f201o.add(p16422848101170923038);
    }

    public final void close() {
        java.util.ArrayList arrayList = this.f201o;
        if (arrayList.isEmpty()) {
            arrayList.add(s);
        } else {
            dev.epro.r0.Q11088980322693754445.h("Incomplete document");
        }
    }

    public final void d() {
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        H(i16631908410500040363);
        this.f201o.add(i16631908410500040363);
    }

    public final void g() {
        java.util.ArrayList arrayList = this.f201o;
        if (arrayList.isEmpty() || this.p != null) {
            dev.epro.r0.Z3383101362411723454.r();
        } else if (G() instanceof dev.epro.r0.P16422848101170923038) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            dev.epro.r0.Z3383101362411723454.r();
        }
    }

    public final void h() {
        java.util.ArrayList arrayList = this.f201o;
        if (arrayList.isEmpty() || this.p != null) {
            dev.epro.r0.Z3383101362411723454.r();
        } else if (G() instanceof dev.epro.r0.I16631908410500040363) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            dev.epro.r0.Z3383101362411723454.r();
        }
    }

    public final void j(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "name == null");
        if (this.f201o.isEmpty() || this.p != null) {
            dev.epro.r0.S10973172697741180971.m("Did not expect a name");
        } else if (G() instanceof dev.epro.r0.I16631908410500040363) {
            this.p = str;
        } else {
            dev.epro.r0.S10973172697741180971.m("Please begin an object before writing a name.");
        }
    }

    public final dev.epro.r0.Y14132333989764804283 p() {
        H(dev.epro.r0.Y12917327898100101934.a);
        return this;
    }

    public final void z(double d) {
        if (((dev.epro.r0.Y14132333989764804283) this).h == 1 || (!java.lang.Double.isNaN(d) && !java.lang.Double.isInfinite(d))) {
            H(new dev.epro.r0.D16457379462628768197(java.lang.Double.valueOf(d)));
        } else {
            throw new java.lang.IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    public final void flush() {
    }
}
