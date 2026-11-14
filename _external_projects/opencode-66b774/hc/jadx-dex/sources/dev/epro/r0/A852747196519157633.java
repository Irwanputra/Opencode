package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A852747196519157633 {
    public dev.epro.r0.M11181104712105445833 a;
    public dev.epro.r0.U14340554418656580554 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public java.util.List g;
    public dev.epro.r0.C9610972087028600954 h;
    public dev.epro.r0.R8540738700654750557 j;
    public dev.epro.r0.S16571168858015125610 k;
    public dev.epro.r0.I1581330382723795749 l;
    public dev.epro.r0.F10342546226345611902 m;
    public dev.epro.r0.Q17957571128037780363 n;
    public long q;
    public long i = dev.epro.r0.Q14673201322024832673.a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f165o = -1;
    public int p = -1;

    public A852747196519157633(dev.epro.r0.M11181104712105445833 m11181104712105445833, dev.epro.r0.S16571168858015125610 s16571168858015125610, dev.epro.r0.U14340554418656580554 u14340554418656580554, int i, boolean z, int i2, int i3, java.util.List list) {
        this.a = m11181104712105445833;
        this.b = u14340554418656580554;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = s16571168858015125610;
    }

    public final int a(int i, dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        int i2 = this.f165o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = dev.epro.r0.O15160157444238005800.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            dev.epro.r0.C9610972087028600954 c9610972087028600954 = this.h;
            dev.epro.r0.S16571168858015125610 s16571168858015125610 = this.k;
            dev.epro.r0.R8540738700654750557 r8540738700654750557 = this.j;
            r8540738700654750557.getClass();
            dev.epro.r0.C9610972087028600954 c9610972087028600954Z = dev.epro.r0.G16660188620551127941.z(c9610972087028600954, f10342546226345611902, s16571168858015125610, r8540738700654750557, this.b);
            this.h = c9610972087028600954Z;
            jA = c9610972087028600954Z.a(this.f, jA);
        }
        int iD = dev.epro.r0.T13998044911588922055.d(b(jA, f10342546226345611902).e);
        int iJ = dev.epro.r0.I16980768508151520658.j(jA);
        if (iD < iJ) {
            iD = iJ;
        }
        this.f165o = i;
        this.p = iD;
        return iD;
    }

    public final dev.epro.r0.V11538895333762958192 b(long j, dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        dev.epro.r0.I1581330382723795749 i1581330382723795749E = e(f10342546226345611902);
        long jR = dev.epro.r0.E3422549137300678133.R(i1581330382723795749E.c(), this.c, j, this.d);
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new dev.epro.r0.V11538895333762958192(i1581330382723795749E, jR, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            dev.epro.r0.C9610972087028600954 c9610972087028600954 = this.h;
            dev.epro.r0.S16571168858015125610 s16571168858015125610 = this.k;
            dev.epro.r0.R8540738700654750557 r8540738700654750557 = this.j;
            r8540738700654750557.getClass();
            dev.epro.r0.C9610972087028600954 c9610972087028600954Z = dev.epro.r0.G16660188620551127941.z(c9610972087028600954, f10342546226345611902, s16571168858015125610, r8540738700654750557, this.b);
            this.h = c9610972087028600954Z;
            j = c9610972087028600954Z.a(this.f, j);
        }
        dev.epro.r0.Q17957571128037780363 q17957571128037780363 = this.n;
        if (q17957571128037780363 != null) {
            dev.epro.r0.V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
            dev.epro.r0.K10916014851776401112 k10916014851776401112 = q17957571128037780363.a;
            if (!v11538895333762958192.a.b()) {
                dev.epro.r0.F10342546226345611902 f103425462263456119022 = k10916014851776401112.h;
                long j2 = k10916014851776401112.j;
                if (f10342546226345611902 == f103425462263456119022 && (dev.epro.r0.I16980768508151520658.c(j, j2) || (dev.epro.r0.I16980768508151520658.i(j) == dev.epro.r0.I16980768508151520658.i(j2) && dev.epro.r0.I16980768508151520658.k(j) == dev.epro.r0.I16980768508151520658.k(j2) && dev.epro.r0.I16980768508151520658.h(j) >= v11538895333762958192.e && !v11538895333762958192.c))) {
                    dev.epro.r0.Q17957571128037780363 q179575711280377803632 = this.n;
                    q179575711280377803632.getClass();
                    if (dev.epro.r0.I16980768508151520658.c(j, q179575711280377803632.a.j)) {
                        return false;
                    }
                    dev.epro.r0.Q17957571128037780363 q179575711280377803633 = this.n;
                    q179575711280377803633.getClass();
                    this.n = f(f10342546226345611902, j, q179575711280377803633.b);
                    return true;
                }
            }
        }
        this.n = f(f10342546226345611902, j, b(j, f10342546226345611902));
        return true;
    }

    public final void d(dev.epro.r0.R8540738700654750557 r8540738700654750557) {
        long jA;
        dev.epro.r0.R8540738700654750557 r85407387006547505572 = this.j;
        if (r8540738700654750557 != null) {
            int i = dev.epro.r0.Q14673201322024832673.b;
            jA = dev.epro.r0.Q14673201322024832673.a(r8540738700654750557.c(), r8540738700654750557.s());
        } else {
            jA = dev.epro.r0.Q14673201322024832673.a;
        }
        if (r85407387006547505572 == null) {
            this.j = r8540738700654750557;
            this.i = jA;
        } else if (r8540738700654750557 == null || this.i != jA) {
            this.j = r8540738700654750557;
            this.i = jA;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.f165o = -1;
        }
    }

    public final dev.epro.r0.I1581330382723795749 e(dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        dev.epro.r0.I1581330382723795749 i1581330382723795749 = this.l;
        if (i1581330382723795749 == null || f10342546226345611902 != this.m || i1581330382723795749.b()) {
            this.m = f10342546226345611902;
            dev.epro.r0.M11181104712105445833 m11181104712105445833 = this.a;
            dev.epro.r0.S16571168858015125610 s16571168858015125610L = dev.epro.r0.H4776669175763245653.l(this.k, f10342546226345611902);
            dev.epro.r0.R8540738700654750557 r8540738700654750557 = this.j;
            r8540738700654750557.getClass();
            dev.epro.r0.U14340554418656580554 u14340554418656580554 = this.b;
            dev.epro.r0.O2161699089510411363 o2161699089510411363 = this.g;
            if (o2161699089510411363 == null) {
                o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
            }
            i1581330382723795749 = new dev.epro.r0.I1581330382723795749(m11181104712105445833, r8540738700654750557, u14340554418656580554, s16571168858015125610L, o2161699089510411363, this.d);
        }
        this.l = i1581330382723795749;
        return i1581330382723795749;
    }

    public final dev.epro.r0.Q17957571128037780363 f(dev.epro.r0.F10342546226345611902 f10342546226345611902, long j, dev.epro.r0.V11538895333762958192 v11538895333762958192) {
        float fMin = java.lang.Math.min(v11538895333762958192.a.c(), v11538895333762958192.d);
        dev.epro.r0.M11181104712105445833 m11181104712105445833 = this.a;
        dev.epro.r0.S16571168858015125610 s16571168858015125610 = this.k;
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = this.g;
        if (o2161699089510411363 == null) {
            o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        dev.epro.r0.R8540738700654750557 r8540738700654750557 = this.j;
        r8540738700654750557.getClass();
        return new dev.epro.r0.Q17957571128037780363(new dev.epro.r0.K10916014851776401112(m11181104712105445833, s16571168858015125610, o2161699089510411363, i, z, i2, r8540738700654750557, f10342546226345611902, this.b, j), v11538895333762958192, dev.epro.r0.O15160157444238005800.d(j, (((long) dev.epro.r0.T13998044911588922055.d(fMin)) << 32) | (((long) dev.epro.r0.T13998044911588922055.d(v11538895333762958192.e)) & 4294967295L)));
    }

    public final void g(dev.epro.r0.M11181104712105445833 m11181104712105445833, dev.epro.r0.S16571168858015125610 s16571168858015125610, dev.epro.r0.U14340554418656580554 u14340554418656580554, int i, boolean z, int i2, int i3, java.util.List list) {
        this.a = m11181104712105445833;
        boolean zC = s16571168858015125610.c(this.k);
        this.k = s16571168858015125610;
        if (!zC) {
            this.q <<= 2;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.f165o = -1;
        }
        this.b = u14340554418656580554;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.q = (this.q << 2) | 2;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.f165o = -1;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.n != null ? "<TextLayoutResult>" : "null";
        java.lang.String strB = dev.epro.r0.Q14673201322024832673.b(this.i);
        long j = this.q;
        dev.epro.r0.Q17957571128037780363 q17957571128037780363 = this.n;
        dev.epro.r0.I16980768508151520658 i16980768508151520658 = q17957571128037780363 != null ? new dev.epro.r0.I16980768508151520658(q17957571128037780363.a.j) : "null";
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strB, ", history=");
        sbY.append(j);
        sbY.append(", constraints=");
        sbY.append(i16980768508151520658);
        sbY.append(")");
        return sbY.toString();
    }
}
