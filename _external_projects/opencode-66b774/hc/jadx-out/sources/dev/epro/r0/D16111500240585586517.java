package dev.epro.r0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D16111500240585586517 extends Y14132333989764804283 {
    public static final J8779296386071736043 r = new J8779296386071736043();
    public static final D16457379462628768197 s = new D16457379462628768197("closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f201o;
    public String p;
    public K15572083692188606544 q;

    public D16111500240585586517() {
        super(r);
        this.f201o = new ArrayList();
        this.q = Y12917327898100101934.a;
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void A(long j) {
        H(new D16457379462628768197(Long.valueOf(j)));
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void B(Boolean bool) {
        if (bool == null) {
            H(Y12917327898100101934.a);
        } else {
            H(new D16457379462628768197(bool));
        }
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void C(Number number) {
        if (number == null) {
            H(Y12917327898100101934.a);
            return;
        }
        if (this.h != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                Q11088980322693754445.l("JSON forbids NaN and infinities: ", number);
                return;
            }
        }
        H(new D16457379462628768197(number));
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void D(String str) {
        if (str == null) {
            H(Y12917327898100101934.a);
        } else {
            H(new D16457379462628768197(str));
        }
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void E(boolean z) {
        H(new D16457379462628768197(Boolean.valueOf(z)));
    }

    public final K15572083692188606544 G() {
        return (K15572083692188606544) this.f201o.get(r1.size() - 1);
    }

    public final void H(K15572083692188606544 k15572083692188606544) {
        if (this.p != null) {
            if (!(k15572083692188606544 instanceof Y12917327898100101934) || this.k) {
                ((I16631908410500040363) G()).q(this.p, k15572083692188606544);
            }
            this.p = null;
            return;
        }
        if (this.f201o.isEmpty()) {
            this.q = k15572083692188606544;
            return;
        }
        K15572083692188606544 k15572083692188606544G = G();
        if (k15572083692188606544G instanceof P16422848101170923038) {
            ((P16422848101170923038) k15572083692188606544G).q(k15572083692188606544);
        } else {
            Z3383101362411723454.r();
        }
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void c() {
        P16422848101170923038 p16422848101170923038 = new P16422848101170923038();
        H(p16422848101170923038);
        this.f201o.add(p16422848101170923038);
    }

    @Override // dev.epro.r0.Y14132333989764804283, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f201o;
        if (arrayList.isEmpty()) {
            arrayList.add(s);
        } else {
            Q11088980322693754445.h("Incomplete document");
        }
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void d() {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        H(i16631908410500040363);
        this.f201o.add(i16631908410500040363);
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void g() {
        ArrayList arrayList = this.f201o;
        if (arrayList.isEmpty() || this.p != null) {
            Z3383101362411723454.r();
        } else if (G() instanceof P16422848101170923038) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            Z3383101362411723454.r();
        }
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void h() {
        ArrayList arrayList = this.f201o;
        if (arrayList.isEmpty() || this.p != null) {
            Z3383101362411723454.r();
        } else if (G() instanceof I16631908410500040363) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            Z3383101362411723454.r();
        }
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void j(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f201o.isEmpty() || this.p != null) {
            S10973172697741180971.m("Did not expect a name");
        } else if (G() instanceof I16631908410500040363) {
            this.p = str;
        } else {
            S10973172697741180971.m("Please begin an object before writing a name.");
        }
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final Y14132333989764804283 p() {
        H(Y12917327898100101934.a);
        return this;
    }

    @Override // dev.epro.r0.Y14132333989764804283
    public final void z(double d) {
        if (this.h == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            H(new D16457379462628768197(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // dev.epro.r0.Y14132333989764804283, java.io.Flushable
    public final void flush() {
    }
}
