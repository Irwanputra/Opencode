package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B17541588548501223042 extends dev.epro.r0.A16390126751166503819 {
    public final java.lang.String a;
    public final java.util.List b;
    public final int c;
    public final dev.epro.r0.D14208870094104617988 d;
    public final float e;
    public final dev.epro.r0.D14208870094104617988 f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public B17541588548501223042(java.lang.String str, java.util.List list, int i, dev.epro.r0.D14208870094104617988 d14208870094104617988, float f, dev.epro.r0.D14208870094104617988 d142088700941046179882, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dev.epro.r0.B17541588548501223042.class == obj.getClass()) {
            dev.epro.r0.B17541588548501223042 b17541588548501223042 = (dev.epro.r0.B17541588548501223042) obj;
            return dev.epro.r0.S10823041268949770285.t(this.a, b17541588548501223042.a) && dev.epro.r0.S10823041268949770285.t(this.d, b17541588548501223042.d) && this.e == b17541588548501223042.e && dev.epro.r0.S10823041268949770285.t(this.f, b17541588548501223042.f) && this.g == b17541588548501223042.g && this.h == b17541588548501223042.h && this.i == b17541588548501223042.i && this.j == b17541588548501223042.j && this.k == b17541588548501223042.k && this.l == b17541588548501223042.l && this.m == b17541588548501223042.m && this.n == b17541588548501223042.n && this.c == b17541588548501223042.c && dev.epro.r0.S10823041268949770285.t(this.b, b17541588548501223042.b);
        }
        return false;
    }

    public final int hashCode() {
        int iH = dev.epro.r0.G6547577305291411977.h(this.a.hashCode() * 31, 31, this.b);
        dev.epro.r0.D14208870094104617988 d14208870094104617988 = this.d;
        int iE = dev.epro.r0.E12098517352909843120.e(this.e, (iH + (d14208870094104617988 != null ? d14208870094104617988.hashCode() : 0)) * 31, 31);
        dev.epro.r0.D14208870094104617988 d142088700941046179882 = this.f;
        return java.lang.Integer.hashCode(this.c) + dev.epro.r0.E12098517352909843120.e(this.n, dev.epro.r0.E12098517352909843120.e(this.m, dev.epro.r0.E12098517352909843120.e(this.l, dev.epro.r0.E12098517352909843120.e(this.k, dev.epro.r0.X2485016533998461232.f(this.j, dev.epro.r0.X2485016533998461232.f(this.i, dev.epro.r0.E12098517352909843120.e(this.h, dev.epro.r0.E12098517352909843120.e(this.g, (iE + (d142088700941046179882 != null ? d142088700941046179882.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
