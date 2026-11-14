package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B2623585866935622413 extends dev.epro.r0.A8269341136279542501 {
    public final boolean a;
    public final dev.epro.r0.D5961215468735357278 b;
    public final dev.epro.r0.M15706644554150934798 c;
    public final dev.epro.r0.I5573661370475160895 d;

    public B2623585866935622413(boolean z, dev.epro.r0.D5961215468735357278 d5961215468735357278, dev.epro.r0.M15706644554150934798 m15706644554150934798, dev.epro.r0.I5573661370475160895 i5573661370475160895) {
        this.a = z;
        this.b = d5961215468735357278;
        this.c = m15706644554150934798;
        this.d = i5573661370475160895;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        return new dev.epro.r0.K1666881278332016037(this.a, this.b, this.c, this.d);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        boolean z;
        dev.epro.r0.K1666881278332016037 k1666881278332016037 = (dev.epro.r0.K1666881278332016037) r15896830329318850690;
        boolean z2 = k1666881278332016037.q;
        boolean z3 = this.a;
        boolean z4 = true;
        if (z2 != z3) {
            k1666881278332016037.q = z3;
            z = true;
        } else {
            z = false;
        }
        dev.epro.r0.D5961215468735357278 d5961215468735357278 = k1666881278332016037.r;
        dev.epro.r0.D5961215468735357278 d59612154687353572782 = this.b;
        if (d5961215468735357278 != d59612154687353572782) {
            k1666881278332016037.r = d59612154687353572782;
            dev.epro.r0.X7175349259954592591 x7175349259954592591 = k1666881278332016037.v;
            if (x7175349259954592591 != null) {
                x7175349259954592591.c((java.util.concurrent.CancellationException) null);
            }
            k1666881278332016037.v = dev.epro.r0.R7033599853981556291.E(k1666881278332016037.V0(), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.Z15623011445117113174(k1666881278332016037, (dev.epro.r0.R4833348786910499294) null, (byte) 3), 3);
        }
        dev.epro.r0.M15706644554150934798 m15706644554150934798 = k1666881278332016037.w;
        dev.epro.r0.M15706644554150934798 m157066445541509347982 = this.c;
        if (!dev.epro.r0.S10823041268949770285.t(m15706644554150934798, m157066445541509347982)) {
            k1666881278332016037.w = m157066445541509347982;
            z = true;
        }
        dev.epro.r0.I5573661370475160895 i5573661370475160895 = k1666881278332016037.y;
        dev.epro.r0.I5573661370475160895 i55736613704751608952 = this.d;
        if (!dev.epro.r0.S10823041268949770285.t(i5573661370475160895, i55736613704751608952)) {
            if (!dev.epro.r0.S10823041268949770285.t(k1666881278332016037.y, i55736613704751608952)) {
                k1666881278332016037.y = i55736613704751608952;
                k1666881278332016037.A.h1();
            }
            z = true;
        }
        if (!dev.epro.r0.A891803927997771281.b(k1666881278332016037.s, 2.0f)) {
            k1666881278332016037.s = 2.0f;
            z = true;
        }
        if (dev.epro.r0.A891803927997771281.b(k1666881278332016037.t, 1.0f)) {
            z4 = z;
        } else {
            k1666881278332016037.t = 1.0f;
        }
        if (z4) {
            k1666881278332016037.k1();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B2623585866935622413)) {
            return false;
        }
        dev.epro.r0.B2623585866935622413 b2623585866935622413 = (dev.epro.r0.B2623585866935622413) obj;
        return this.a == b2623585866935622413.a && dev.epro.r0.S10823041268949770285.t(this.b, b2623585866935622413.b) && this.c.equals(b2623585866935622413.c) && dev.epro.r0.S10823041268949770285.t(this.d, b2623585866935622413.d) && dev.epro.r0.A891803927997771281.b(2.0f, 2.0f) && dev.epro.r0.A891803927997771281.b(1.0f, 1.0f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + dev.epro.r0.G6547577305291411977.i(java.lang.Boolean.hashCode(this.a) * 31, 31, false)) * 31)) * 31;
        dev.epro.r0.I5573661370475160895 i5573661370475160895 = this.d;
        return java.lang.Float.hashCode(1.0f) + dev.epro.r0.E12098517352909843120.e(2.0f, (iHashCode + (i5573661370475160895 != null ? i5573661370475160895.hashCode() : 0)) * 31, 31);
    }

    public final java.lang.String toString() {
        return "IndicatorLineElement(enabled=" + this.a + ", isError=false, interactionSource=" + this.b + ", colors=" + this.c + ", textFieldShape=" + this.d + ", focusedIndicatorLineThickness=" + ((java.lang.Object) dev.epro.r0.A891803927997771281.c(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((java.lang.Object) dev.epro.r0.A891803927997771281.c(1.0f)) + ')';
    }
}
