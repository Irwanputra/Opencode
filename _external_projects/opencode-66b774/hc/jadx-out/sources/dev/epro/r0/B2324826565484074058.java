package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
final class B2324826565484074058 extends A8269341136279542501 {
    public final F11522267504195649243 a;
    public final L12639328004344855510 b;
    public final Object c;

    public B2324826565484074058(F11522267504195649243 f11522267504195649243, L12639328004344855510 l12639328004344855510, Object obj) {
        this.a = f11522267504195649243;
        this.b = l12639328004344855510;
        this.c = obj;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        W17425295458373561372 w17425295458373561372 = new W17425295458373561372();
        w17425295458373561372.f557o = this.a;
        w17425295458373561372.p = this.b;
        return w17425295458373561372;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        W17425295458373561372 w17425295458373561372 = (W17425295458373561372) r15896830329318850690;
        w17425295458373561372.f557o = this.a;
        w17425295458373561372.p = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B2324826565484074058.class != obj.getClass()) {
            return false;
        }
        B2324826565484074058 b2324826565484074058 = (B2324826565484074058) obj;
        return this.a == b2324826565484074058.a && S10823041268949770285.t(this.c, b2324826565484074058.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + G6547577305291411977.i(this.a.hashCode() * 31, 31, false);
    }
}
