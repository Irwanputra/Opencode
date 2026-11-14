package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L18111935460025096722 extends T1422539684983103901 {
    public F9886074403848142923 J;
    public Boolean K;
    public J3971902247911265635 L;
    public R8540738700654750557 M;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C1(float r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof dev.epro.r0.K1156020009529999285
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.K1156020009529999285 r0 = (dev.epro.r0.K1156020009529999285) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.K1156020009529999285 r0 = new dev.epro.r0.K1156020009529999285
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.A81664135048468380 r7 = r0.t
            dev.epro.r0.E17665849472693074628.k(r9)
            goto Lc2
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L32:
            dev.epro.r0.E17665849472693074628.k(r9)
            return r9
        L36:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.F9886074403848142923 r9 = r7.J
            boolean r9 = r9.f()
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r9 == 0) goto L97
            dev.epro.r0.F9886074403848142923 r7 = r7.J
            r0.w = r3
            boolean r9 = r7.f()
            if (r9 != 0) goto L52
            java.lang.String r9 = "AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information."
            dev.epro.r0.Y16081827717826519461.a(r9)
        L52:
            dev.epro.r0.V697849047308847220 r9 = r7.c
            java.lang.Object r9 = r9.getValue()
            dev.epro.r0.V4351601219763732262 r2 = r7.d()
            float r3 = r7.i()
            dev.epro.r0.F4096073349764486348 r5 = r7.i
            dev.epro.r0.V10450421848591554621 r5 = (dev.epro.r0.V10450421848591554621) r5
            if (r5 == 0) goto L91
            dev.epro.r0.B13729205492206812220 r6 = r7.j
            dev.epro.r0.S464754454553842217 r6 = (dev.epro.r0.S464754454553842217) r6
            if (r6 == 0) goto L8b
            java.lang.Object r2 = dev.epro.r0.D15445857918358799638.z(r2, r3, r8, r5, r6)
            dev.epro.r0.F4096073349764486348 r3 = r7.b
            java.lang.Object r3 = r3.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L83
            java.lang.Object r7 = dev.epro.r0.D15445857918358799638.w(r7, r2, r8, r0)
            goto L87
        L83:
            java.lang.Object r7 = dev.epro.r0.D15445857918358799638.w(r7, r9, r8, r0)
        L87:
            if (r7 != r1) goto L8a
            goto Lc0
        L8a:
            return r7
        L8b:
            java.lang.String r7 = "velocityThreshold"
            dev.epro.r0.S10823041268949770285.b0(r7)
            throw r4
        L91:
            java.lang.String r7 = "positionalThreshold"
            dev.epro.r0.S10823041268949770285.b0(r7)
            throw r4
        L97:
            dev.epro.r0.A81664135048468380 r9 = new dev.epro.r0.A81664135048468380
            r9.<init>()
            r9.a = r8
            dev.epro.r0.F9886074403848142923 r3 = r7.J
            dev.epro.r0.P6069467826135040566 r5 = new dev.epro.r0.P6069467826135040566
            r5.<init>(r7, r9, r8, r4)
            r0.t = r9
            r0.w = r2
            java.lang.Object r7 = r3.m
            dev.epro.r0.T17817572153526645469 r7 = (dev.epro.r0.T17817572153526645469) r7
            dev.epro.r0.P10410169637657332617 r8 = new dev.epro.r0.P10410169637657332617
            r2 = 5
            r8.<init>(r3, r5, r4, r2)
            dev.epro.r0.D6414970586266598845 r2 = dev.epro.r0.D6414970586266598845.a
            java.lang.Object r7 = r7.a(r2, r8, r0)
            if (r7 != r1) goto Lbc
            goto Lbe
        Lbc:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
        Lbe:
            if (r7 != r1) goto Lc1
        Lc0:
            return r1
        Lc1:
            r7 = r9
        Lc2:
            float r7 = r7.a
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
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
        Object a = ((T17817572153526645469) f9886074403848142923.m).a(D6414970586266598845.a, new P10410169637657332617((Object) f9886074403848142923, (Object) new V7931860346224571473(o12152244488187446230, this, null), (R4833348786910499294) null, (byte) 5), j13979756969328643311);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (a != z3437138737604933638) {
            a = o9245300239821758723;
        }
        return a == z3437138737604933638 ? a : o9245300239821758723;
    }

    @Override // dev.epro.r0.T1422539684983103901
    public final boolean z1() {
        return this.J.h.getValue() != null;
    }
}
