package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class B2324826565484074058 extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.F11522267504195649243 a;
    public final dev.epro.r0.L12639328004344855510 b;
    public final java.lang.Object c;

    public B2324826565484074058(dev.epro.r0.F11522267504195649243 f11522267504195649243, dev.epro.r0.L12639328004344855510 l12639328004344855510, java.lang.Object obj) {
        this.a = f11522267504195649243;
        this.b = l12639328004344855510;
        this.c = obj;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.W17425295458373561372 w17425295458373561372 = new dev.epro.r0.W17425295458373561372();
        w17425295458373561372.o = this.a;
        w17425295458373561372.p = this.b;
        return w17425295458373561372;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.W17425295458373561372 w17425295458373561372 = (dev.epro.r0.W17425295458373561372) r15896830329318850690;
        w17425295458373561372.o = this.a;
        w17425295458373561372.p = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dev.epro.r0.B2324826565484074058.class != obj.getClass()) {
            return false;
        }
        dev.epro.r0.B2324826565484074058 b2324826565484074058 = (dev.epro.r0.B2324826565484074058) obj;
        return this.a == b2324826565484074058.a && dev.epro.r0.S10823041268949770285.t(this.c, b2324826565484074058.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dev.epro.r0.G6547577305291411977.i(this.a.hashCode() * 31, 31, false);
    }
}
