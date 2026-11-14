package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B17541588548501223042 extends A16390126751166503819 {
    public final String a;
    public final List b;
    public final int c;
    public final D14208870094104617988 d;
    public final float e;
    public final D14208870094104617988 f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public B17541588548501223042(String str, List list, int i, D14208870094104617988 d14208870094104617988, float f, D14208870094104617988 d142088700941046179882, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = d14208870094104617988;
        this.e = f;
        this.f = d142088700941046179882;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B17541588548501223042.class == obj.getClass()) {
            B17541588548501223042 b17541588548501223042 = (B17541588548501223042) obj;
            return S10823041268949770285.t(this.a, b17541588548501223042.a) && S10823041268949770285.t(this.d, b17541588548501223042.d) && this.e == b17541588548501223042.e && S10823041268949770285.t(this.f, b17541588548501223042.f) && this.g == b17541588548501223042.g && this.h == b17541588548501223042.h && this.i == b17541588548501223042.i && this.j == b17541588548501223042.j && this.k == b17541588548501223042.k && this.l == b17541588548501223042.l && this.m == b17541588548501223042.m && this.n == b17541588548501223042.n && this.c == b17541588548501223042.c && S10823041268949770285.t(this.b, b17541588548501223042.b);
        }
        return false;
    }

    public final int hashCode() {
        int h = G6547577305291411977.h(this.a.hashCode() * 31, 31, this.b);
        D14208870094104617988 d14208870094104617988 = this.d;
        int e = E12098517352909843120.e(this.e, (h + (d14208870094104617988 != null ? d14208870094104617988.hashCode() : 0)) * 31, 31);
        D14208870094104617988 d142088700941046179882 = this.f;
        return Integer.hashCode(this.c) + E12098517352909843120.e(this.n, E12098517352909843120.e(this.m, E12098517352909843120.e(this.l, E12098517352909843120.e(this.k, X2485016533998461232.f(this.j, X2485016533998461232.f(this.i, E12098517352909843120.e(this.h, E12098517352909843120.e(this.g, (e + (d142088700941046179882 != null ? d142088700941046179882.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
