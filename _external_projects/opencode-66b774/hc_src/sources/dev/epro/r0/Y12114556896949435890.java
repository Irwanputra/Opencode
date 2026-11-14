package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y12114556896949435890 extends R14062301455140331524 implements L12639328004344855510 {
    public A81664135048468380 t;
    public byte u;
    public final /* synthetic */ Q12103736865181728683 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ F4096073349764486348 x;
    public final /* synthetic */ A7868207189447841291 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y12114556896949435890(Q12103736865181728683 q12103736865181728683, float f, F4096073349764486348 f4096073349764486348, A7868207189447841291 a7868207189447841291, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = q12103736865181728683;
        this.w = f;
        this.x = f4096073349764486348;
        this.y = a7868207189447841291;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new Y12114556896949435890(this.v, this.w, this.x, this.y, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((Y12114556896949435890) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r1 == r12) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [dev.epro.r0.K17903142602918939099] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            dev.epro.r0.Q12103736865181728683 r0 = r14.v
            dev.epro.r0.U2582504393267961583 r6 = r0.a
            byte r1 = r14.u
            r7 = 0
            r8 = 0
            r9 = 2
            r10 = 1
            dev.epro.r0.F4096073349764486348 r11 = r14.x
            dev.epro.r0.Z3437138737604933638 r12 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L26
            if (r1 == r10) goto L1e
            if (r1 != r9) goto L18
            dev.epro.r0.E17665849472693074628.k(r15)
            return r15
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r7
        L1e:
            dev.epro.r0.A81664135048468380 r1 = r14.t
            dev.epro.r0.E17665849472693074628.k(r15)
            r13 = r1
            r1 = r15
            goto L70
        L26:
            dev.epro.r0.E17665849472693074628.k(r15)
            dev.epro.r0.X14364139104409853146 r1 = r0.b
            float r2 = r14.w
            float r1 = dev.epro.r0.U15853425786981391261.u(r1, r8, r2)
            float r1 = r6.j(r2, r1)
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 == 0) goto L40
            java.lang.String r3 = "calculateApproachOffset returned NaN. Please use a valid value."
            dev.epro.r0.Y16081827717826519461.c(r3)
        L40:
            dev.epro.r0.A81664135048468380 r13 = new dev.epro.r0.A81664135048468380
            r13.<init>()
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.signum(r2)
            float r2 = r2 * r1
            r13.a = r2
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            r11.invoke(r1)
            float r2 = r13.a
            dev.epro.r0.K17903142602918939099 r4 = new dev.epro.r0.K17903142602918939099
            r1 = 0
            r4.<init>()
            r14.t = r13
            r14.u = r10
            dev.epro.r0.A7868207189447841291 r1 = r14.y
            float r3 = r14.w
            r5 = r14
            java.lang.Object r1 = r0.d(r1, r2, r3, r4, r5)
            if (r1 != r12) goto L70
            goto Laa
        L70:
            dev.epro.r0.Q17276063867044657934 r1 = (dev.epro.r0.Q17276063867044657934) r1
            java.lang.Object r2 = r1.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r6.t(r2)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 == 0) goto L8b
            java.lang.String r3 = "calculateSnapOffset returned NaN. Please use a valid value."
            dev.epro.r0.Y16081827717826519461.c(r3)
        L8b:
            r13.a = r2
            r3 = 30
            dev.epro.r0.Q17276063867044657934 r3 = dev.epro.r0.B5998207562248239613.n(r1, r8, r8, r3)
            dev.epro.r0.M15459437176959963354 r4 = r0.c
            dev.epro.r0.K17903142602918939099 r0 = new dev.epro.r0.K17903142602918939099
            r0.<init>()
            r14.t = r7
            r14.u = r9
            r1 = r0
            dev.epro.r0.A7868207189447841291 r0 = r14.y
            r5 = r1
            r1 = r2
            r6 = r14
            java.lang.Object r0 = dev.epro.r0.U1554499319261669842.m(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r12) goto Lab
        Laa:
            return r12
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y12114556896949435890.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
