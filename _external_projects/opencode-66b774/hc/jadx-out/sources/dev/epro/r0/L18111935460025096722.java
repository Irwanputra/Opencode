package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L18111935460025096722 extends T1422539684983103901 {
    public F9886074403848142923 J;
    public Boolean K;
    public J3971902247911265635 L;
    public R8540738700654750557 M;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C1(float r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L18111935460025096722.C1(float, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean D1() {
        Boolean bool = this.K;
        if (bool == null) {
            return R7033599853981556291.R(this).z == F10342546226345611902.b && this.q == R7000310675073492254.b;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final void E1() {
        J15264501749816156841 j15264501749816156841 = V15080374573826814248.a;
        M14716691558468128220 m14716691558468128220 = V15080374573826814248.b;
        R8540738700654750557 r8540738700654750557 = R7033599853981556291.R(this).y;
        this.M = r8540738700654750557;
        F9886074403848142923 f9886074403848142923 = this.J;
        this.L = new Q12103736865181728683(new Q7316561721656982910((Object) f9886074403848142923, (Object) m14716691558468128220, (Object) new S464754454553842217(r8540738700654750557, (byte) 0), (byte) 7), D15445857918358799638.b, j15264501749816156841);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        E1();
    }

    @Override // dev.epro.r0.R16749699847173633337
    public final void a() {
        x0();
        if (this.n) {
            R8540738700654750557 r8540738700654750557 = R7033599853981556291.R(this).y;
            R8540738700654750557 r85407387006547505572 = this.M;
            if (r85407387006547505572 == null || !r85407387006547505572.equals(r8540738700654750557)) {
                this.M = r8540738700654750557;
                E1();
            }
        }
    }

    @Override // dev.epro.r0.T1422539684983103901
    public final Object l1(O12152244488187446230 o12152244488187446230, J13979756969328643311 j13979756969328643311) {
        F9886074403848142923 f9886074403848142923 = this.J;
        Object objA = ((T17817572153526645469) f9886074403848142923.m).a(D6414970586266598845.a, new P10410169637657332617((Object) f9886074403848142923, (Object) new V7931860346224571473(o12152244488187446230, this, null), (R4833348786910499294) null, (byte) 5), j13979756969328643311);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (objA != z3437138737604933638) {
            objA = o9245300239821758723;
        }
        return objA == z3437138737604933638 ? objA : o9245300239821758723;
    }

    @Override // dev.epro.r0.T1422539684983103901
    public final boolean z1() {
        return this.J.h.getValue() != null;
    }
}
