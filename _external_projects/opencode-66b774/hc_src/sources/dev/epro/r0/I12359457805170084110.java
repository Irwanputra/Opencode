package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I12359457805170084110 extends R14062301455140331524 implements L12639328004344855510 {
    public byte t;
    public final /* synthetic */ float u;
    public final /* synthetic */ H17052510251737830620 v;
    public final /* synthetic */ R14289894334981469490 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I12359457805170084110(float f, H17052510251737830620 h17052510251737830620, R14289894334981469490 r14289894334981469490, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = f;
        this.v = h17052510251737830620;
        this.w = r14289894334981469490;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new I12359457805170084110(this.u, this.v, this.w, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((I12359457805170084110) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (dev.epro.r0.S10823041268949770285.t(r3.b.getValue(), r4) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r9 != r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
    
        if (r3.u(r4, r3.b.getValue(), r9) == r8) goto L29;
     */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.t
            dev.epro.r0.O9245300239821758723 r1 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.H17052510251737830620 r3 = r9.v
            r2 = 0
            float r4 = r9.u
            r5 = 2
            r6 = 1
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L22
            if (r0 == r6) goto L1e
            if (r0 != r5) goto L17
            dev.epro.r0.E17665849472693074628.k(r10)
            return r1
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            r9 = 0
            return r9
        L1e:
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L38
        L22:
            dev.epro.r0.E17665849472693074628.k(r10)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 <= 0) goto L38
            r9.t = r6
            dev.epro.r0.V697849047308847220 r10 = r3.b
            java.lang.Object r10 = r10.getValue()
            java.lang.Object r10 = r3.u(r4, r10, r9)
            if (r10 != r8) goto L38
            goto L70
        L38:
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L71
            r9.t = r5
            dev.epro.r0.W3656598099029166611 r5 = r3.e
            if (r5 != 0) goto L44
        L42:
            r9 = r1
            goto L6e
        L44:
            dev.epro.r0.V697849047308847220 r10 = r3.c
            java.lang.Object r10 = r10.getValue()
            dev.epro.r0.R14289894334981469490 r4 = r9.w
            boolean r10 = dev.epro.r0.S10823041268949770285.t(r10, r4)
            if (r10 == 0) goto L5f
            dev.epro.r0.V697849047308847220 r10 = r3.b
            java.lang.Object r10 = r10.getValue()
            boolean r10 = dev.epro.r0.S10823041268949770285.t(r10, r4)
            if (r10 == 0) goto L5f
            goto L42
        L5f:
            dev.epro.r0.E8130113249282715849 r10 = r3.l
            dev.epro.r0.U16964168814270949320 r2 = new dev.epro.r0.U16964168814270949320
            r6 = 0
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = dev.epro.r0.E8130113249282715849.a(r10, r2, r9)
            if (r9 != r8) goto L42
        L6e:
            if (r9 != r8) goto L71
        L70:
            return r8
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I12359457805170084110.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
