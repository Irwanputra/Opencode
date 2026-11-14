package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X7775063904365437305 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ S9385204271696540760 v;
    public final /* synthetic */ L11334185135933894276 w;
    public final /* synthetic */ E10177778682618078576 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X7775063904365437305(S9385204271696540760 s9385204271696540760, L11334185135933894276 l11334185135933894276, E10177778682618078576 e10177778682618078576, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = s9385204271696540760;
        this.w = l11334185135933894276;
        this.x = e10177778682618078576;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new X7775063904365437305(this.v, this.w, this.x, r4833348786910499294, (byte) 0);
            default:
                return new X7775063904365437305(this.v, this.w, this.x, r4833348786910499294, (byte) 1);
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
        return ((X7775063904365437305) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L31;
     */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.t
            dev.epro.r0.O9245300239821758723 r1 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.E10177778682618078576 r2 = r10.x
            dev.epro.r0.S9385204271696540760 r3 = r10.v
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            r7 = 1
            r8 = 2
            dev.epro.r0.L11334185135933894276 r9 = r10.w
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            byte r0 = r10.u
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L41
        L20:
            dev.epro.r0.S10973172697741180971.m(r5)
            r1 = r4
            goto L43
        L25:
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L37
        L29:
            dev.epro.r0.E17665849472693074628.k(r11)
            long r4 = dev.epro.r0.G2974346431614699120.a
            r10.u = r7
            java.lang.Object r11 = dev.epro.r0.J8045362843799184672.I(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.u = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.C = r9
        L43:
            return r1
        L44:
            byte r0 = r10.u
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L71
        L50:
            dev.epro.r0.S10973172697741180971.m(r5)
            r1 = r4
            goto L73
        L55:
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L67
        L59:
            dev.epro.r0.E17665849472693074628.k(r11)
            long r4 = dev.epro.r0.G2974346431614699120.a
            r10.u = r7
            java.lang.Object r11 = dev.epro.r0.J8045362843799184672.I(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.u = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.G = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X7775063904365437305.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
