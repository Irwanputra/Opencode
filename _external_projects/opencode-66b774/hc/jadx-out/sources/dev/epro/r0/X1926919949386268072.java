package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X1926919949386268072 extends A8269341136279542501 {
    public final I5573661370475160895 a;
    public final boolean b;
    public final long c;
    public final long d;

    public X1926919949386268072(I5573661370475160895 i5573661370475160895, boolean z, long j, long j2) {
        this.a = i5573661370475160895;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new W1351014327031161934(new K13841493441907392258(this, (byte) 2));
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        Y4989033692226475498 y4989033692226475498;
        W1351014327031161934 w1351014327031161934 = (W1351014327031161934) r15896830329318850690;
        K13841493441907392258 k13841493441907392258 = new K13841493441907392258(this, (byte) 2);
        w1351014327031161934.f553o = k13841493441907392258;
        if (w1351014327031161934.a.n && (y4989033692226475498 = R7033599853981556291.P(w1351014327031161934, 2).v) != null) {
            y4989033692226475498.E1(k13841493441907392258, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X1926919949386268072)) {
            return false;
        }
        X1926919949386268072 x1926919949386268072 = (X1926919949386268072) obj;
        if (!A891803927997771281.b(3.0f, 3.0f) || !S10823041268949770285.t(this.a, x1926919949386268072.a) || this.b != x1926919949386268072.b) {
            return false;
        }
        long j = x1926919949386268072.c;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.c, j) && P15388715743159210616.a(this.d, x1926919949386268072.d);
    }

    public final int hashCode() {
        int i = G6547577305291411977.i((this.a.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.b);
        int i2 = U10174709222559481877.i;
        return Long.hashCode(this.d) + G6547577305291411977.j(i, this.c, 31);
    }

    public final String toString() {
        String strC = A891803927997771281.c(3.0f);
        String strH = U10174709222559481877.h(this.c);
        String strH2 = U10174709222559481877.h(this.d);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strC);
        sb.append(", shape=");
        sb.append(this.a);
        sb.append(", clip=");
        X2485016533998461232.j(", ambientColor=", strH, ", spotColor=", sb, this.b);
        return G6547577305291411977.u(sb, strH2, ")");
    }
}
