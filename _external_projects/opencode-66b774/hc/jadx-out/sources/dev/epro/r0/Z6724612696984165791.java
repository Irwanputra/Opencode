package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z6724612696984165791 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t = 1;
    public boolean u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z6724612696984165791(S14157914735975478504 s14157914735975478504, D2717688760023469083 d2717688760023469083, boolean z, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = s14157914735975478504;
        this.v = d2717688760023469083;
        this.x = z;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.v;
        boolean z = this.x;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                return new Z6724612696984165791((S14157914735975478504) obj3, (D2717688760023469083) obj2, z, r4833348786910499294);
            case 1:
                return new Z6724612696984165791((D2717688760023469083) obj2, (S14157914735975478504) obj3, z, r4833348786910499294);
            default:
                return new Z6724612696984165791((U16834965109098959004) obj3, z, (M7102034154292440921) obj2, r4833348786910499294);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((Z6724612696984165791) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.v;
        boolean z = this.x;
        Object obj3 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    D2717688760023469083 d2717688760023469083 = (D2717688760023469083) obj2;
                    Q6203700555324584864 q6203700555324584864 = new Q6203700555324584864(d2717688760023469083, z);
                    J14087722038307951427 j14087722038307951427 = new J14087722038307951427(d2717688760023469083, (byte) 6);
                    this.u = true;
                    Object objN = V1475975160983963926.n((S14157914735975478504) obj3, new Q16819637563808121756(q6203700555324584864, j14087722038307951427, (R4833348786910499294) null), this);
                    if (objN != z3437138737604933638) {
                        objN = o9245300239821758723;
                    }
                    if (objN == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (((D2717688760023469083) obj2).g((S14157914735975478504) obj3, z, this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u16834965109098959004 = (U16834965109098959004) obj3;
                    float f = z ? 1.0f : 0.8f;
                    this.u = true;
                    if (U16834965109098959004.a(u16834965109098959004, new Float(f), (M7102034154292440921) obj2, null, this, 12) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z6724612696984165791(U16834965109098959004 u16834965109098959004, boolean z, M7102034154292440921 m7102034154292440921, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = u16834965109098959004;
        this.x = z;
        this.v = m7102034154292440921;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z6724612696984165791(D2717688760023469083 d2717688760023469083, S14157914735975478504 s14157914735975478504, boolean z, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = d2717688760023469083;
        this.w = s14157914735975478504;
        this.x = z;
    }
}
