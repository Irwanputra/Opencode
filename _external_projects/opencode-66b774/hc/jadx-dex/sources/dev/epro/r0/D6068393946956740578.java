package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D6068393946956740578 implements dev.epro.r0.A13182230205880306765 {
    public final long a;
    public final dev.epro.r0.R8540738700654750557 b;
    public final int c;
    public final dev.epro.r0.B15514215514731594265 d;
    public final dev.epro.r0.O2311549625018100601 e;
    public final dev.epro.r0.O2311549625018100601 f;
    public final dev.epro.r0.M7976697329589061320 g;
    public final dev.epro.r0.M7976697329589061320 h;
    public final dev.epro.r0.W16949330580406226836 i;
    public final dev.epro.r0.W16949330580406226836 j;
    public final dev.epro.r0.W16949330580406226836 k;
    public final dev.epro.r0.Q4452198510918047973 l;
    public final dev.epro.r0.Q4452198510918047973 m;

    public D6068393946956740578(long j, dev.epro.r0.R8540738700654750557 r8540738700654750557, dev.epro.r0.B15514215514731594265 b15514215514731594265) {
        int iG0 = r8540738700654750557.g0(48.0f);
        this.a = j;
        this.b = r8540738700654750557;
        this.c = iG0;
        this.d = b15514215514731594265;
        int iG02 = r8540738700654750557.g0(dev.epro.r0.X2123269864450204018.a(j));
        dev.epro.r0.A4300800680137755387 a4300800680137755387 = dev.epro.r0.T13350664027331345869.n;
        this.e = new dev.epro.r0.O2311549625018100601(a4300800680137755387, a4300800680137755387, iG02);
        dev.epro.r0.A4300800680137755387 a43008006801377553872 = dev.epro.r0.T13350664027331345869.p;
        this.f = new dev.epro.r0.O2311549625018100601(a43008006801377553872, a43008006801377553872, iG02);
        this.g = new dev.epro.r0.M7976697329589061320(dev.epro.r0.U15853425786981391261.c);
        this.h = new dev.epro.r0.M7976697329589061320(dev.epro.r0.U15853425786981391261.d);
        int iG03 = r8540738700654750557.g0(dev.epro.r0.X2123269864450204018.b(j));
        dev.epro.r0.O15869581661108952313 o15869581661108952313 = dev.epro.r0.T13350664027331345869.k;
        dev.epro.r0.O15869581661108952313 o158695816611089523132 = dev.epro.r0.T13350664027331345869.m;
        this.i = new dev.epro.r0.W16949330580406226836(o15869581661108952313, o158695816611089523132, iG03);
        this.j = new dev.epro.r0.W16949330580406226836(o158695816611089523132, o15869581661108952313, iG03);
        this.k = new dev.epro.r0.W16949330580406226836(dev.epro.r0.T13350664027331345869.l, o15869581661108952313, iG03);
        this.l = new dev.epro.r0.Q4452198510918047973(o15869581661108952313, iG0);
        this.m = new dev.epro.r0.Q4452198510918047973(o158695816611089523132, iG0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dev.epro.r0.D6068393946956740578) {
            dev.epro.r0.D6068393946956740578 d6068393946956740578 = (dev.epro.r0.D6068393946956740578) obj;
            return this.a == d6068393946956740578.a && dev.epro.r0.S10823041268949770285.t(this.b, d6068393946956740578.b) && this.c == d6068393946956740578.c && this.d == d6068393946956740578.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + dev.epro.r0.X2485016533998461232.f(this.c, (this.b.hashCode() + (java.lang.Long.hashCode(this.a) * 31)) * 31, 31);
    }

    @Override // dev.epro.r0.A13182230205880306765
    public final long k(dev.epro.r0.I11366018238968599357 i11366018238968599357, long j, dev.epro.r0.F10342546226345611902 f10342546226345611902, long j2) {
        dev.epro.r0.I11366018238968599357 i113660182389685993572;
        long j3;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        java.util.List listV = dev.epro.r0.K5751602218013079365.V(new dev.epro.r0.E13332886634652933381[]{this.e, this.f, ((int) (i11366018238968599357.a() >> 32)) < i3 / 2 ? this.g : this.h});
        int size = listV.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i113660182389685993572 = i11366018238968599357;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            dev.epro.r0.E13332886634652933381 e13332886634652933381 = (dev.epro.r0.E13332886634652933381) listV.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            i113660182389685993572 = i11366018238968599357;
            iA = e13332886634652933381.a(i113660182389685993572, j3, i5, f10342546226345611902);
            if (i7 == listV.size() - 1 || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        java.util.List listV2 = dev.epro.r0.K5751602218013079365.V(new dev.epro.r0.Y8238840264228398567[]{this.i, this.j, this.k, ((int) (i113660182389685993572.a() & 4294967295L)) < i8 / 2 ? this.l : this.m});
        int size2 = listV2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((dev.epro.r0.Y8238840264228398567) listV2.get(i9)).a(i113660182389685993572, j3, i10);
            if (i9 == listV2.size() - 1 || (iA2 >= (i2 = this.c) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                break;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j4 = (((long) iA) << c) | (((long) i) & 4294967295L);
        this.d.invoke(i113660182389685993572, dev.epro.r0.C775827382551829194.k(j4, j2));
        return j4;
    }

    public final java.lang.String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((java.lang.Object) dev.epro.r0.X2123269864450204018.c(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
