package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D6068393946956740578 implements A13182230205880306765 {
    public final long a;
    public final R8540738700654750557 b;
    public final int c;
    public final B15514215514731594265 d;
    public final O2311549625018100601 e;
    public final O2311549625018100601 f;
    public final M7976697329589061320 g;
    public final M7976697329589061320 h;
    public final W16949330580406226836 i;
    public final W16949330580406226836 j;
    public final W16949330580406226836 k;
    public final Q4452198510918047973 l;
    public final Q4452198510918047973 m;

    public D6068393946956740578(long j, R8540738700654750557 r8540738700654750557, B15514215514731594265 b15514215514731594265) {
        int g0 = r8540738700654750557.g0(48.0f);
        this.a = j;
        this.b = r8540738700654750557;
        this.c = g0;
        this.d = b15514215514731594265;
        int g02 = r8540738700654750557.g0(X2123269864450204018.a(j));
        A4300800680137755387 a4300800680137755387 = T13350664027331345869.n;
        this.e = new O2311549625018100601(a4300800680137755387, a4300800680137755387, g02);
        A4300800680137755387 a43008006801377553872 = T13350664027331345869.p;
        this.f = new O2311549625018100601(a43008006801377553872, a43008006801377553872, g02);
        this.g = new M7976697329589061320(U15853425786981391261.c);
        this.h = new M7976697329589061320(U15853425786981391261.d);
        int g03 = r8540738700654750557.g0(X2123269864450204018.b(j));
        O15869581661108952313 o15869581661108952313 = T13350664027331345869.k;
        O15869581661108952313 o158695816611089523132 = T13350664027331345869.m;
        this.i = new W16949330580406226836(o15869581661108952313, o158695816611089523132, g03);
        this.j = new W16949330580406226836(o158695816611089523132, o15869581661108952313, g03);
        this.k = new W16949330580406226836(T13350664027331345869.l, o15869581661108952313, g03);
        this.l = new Q4452198510918047973(o15869581661108952313, g0);
        this.m = new Q4452198510918047973(o158695816611089523132, g0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D6068393946956740578) {
            D6068393946956740578 d6068393946956740578 = (D6068393946956740578) obj;
            return this.a == d6068393946956740578.a && S10823041268949770285.t(this.b, d6068393946956740578.b) && this.c == d6068393946956740578.c && this.d == d6068393946956740578.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + X2485016533998461232.f(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    @Override // dev.epro.r0.A13182230205880306765
    public final long k(I11366018238968599357 i11366018238968599357, long j, F10342546226345611902 f10342546226345611902, long j2) {
        I11366018238968599357 i113660182389685993572;
        long j3;
        char c;
        int i;
        int i2;
        int i3;
        char c2 = ' ';
        int i4 = (int) (j >> 32);
        boolean z = true;
        List V = K5751602218013079365.V(this.e, this.f, ((int) (i11366018238968599357.a() >> 32)) < i4 / 2 ? this.g : this.h);
        int size = V.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i113660182389685993572 = i11366018238968599357;
                j3 = j;
                c = c2;
                i = 0;
                break;
            }
            E13332886634652933381 e13332886634652933381 = (E13332886634652933381) V.get(i5);
            int i6 = (int) (j2 >> c2);
            int i7 = size;
            c = c2;
            j3 = j;
            int i8 = i5;
            i113660182389685993572 = i11366018238968599357;
            i = e13332886634652933381.a(i113660182389685993572, j3, i6, f10342546226345611902);
            if (i8 == V.size() - 1 || (i >= 0 && i6 + i <= i4)) {
                break;
            }
            i5 = i8 + 1;
            size = i7;
            c2 = c;
        }
        int i9 = (int) (j3 & 4294967295L);
        List V2 = K5751602218013079365.V(this.i, this.j, this.k, ((int) (i113660182389685993572.a() & 4294967295L)) < i9 / 2 ? this.l : this.m);
        int size2 = V2.size();
        int i10 = 0;
        while (i10 < size2) {
            boolean z2 = z;
            int i11 = (int) (j2 & 4294967295L);
            int a = ((Y8238840264228398567) V2.get(i10)).a(i113660182389685993572, j3, i11);
            if (i10 == V2.size() - 1 || (a >= (i3 = this.c) && i11 + a <= i9 - i3)) {
                i2 = a;
                break;
            }
            i10++;
            z = z2;
        }
        i2 = 0;
        long j4 = (i << c) | (i2 & 4294967295L);
        this.d.invoke(i113660182389685993572, C775827382551829194.k(j4, j2));
        return j4;
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) X2123269864450204018.c(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
