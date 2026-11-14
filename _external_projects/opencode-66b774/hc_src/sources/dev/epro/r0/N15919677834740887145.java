package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N15919677834740887145 extends R14062301455140331524 implements L12639328004344855510 {
    public byte t;
    public final /* synthetic */ long u;
    public final /* synthetic */ Z7637734454282223795 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N15919677834740887145(long j, Z7637734454282223795 z7637734454282223795, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = j;
        this.v = z7637734454282223795;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new N15919677834740887145(this.u, this.v, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((N15919677834740887145) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (dev.epro.r0.J8045362843799184672.I(8, r10) == r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (dev.epro.r0.J8045362843799184672.I(r3 - 8, r10) == r7) goto L15;
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
            r1 = 8
            long r3 = r10.u
            r5 = 2
            r6 = 1
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L1b
            if (r0 != r5) goto L14
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L36
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            r10 = 0
            return r10
        L1b:
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L2d
        L1f:
            dev.epro.r0.E17665849472693074628.k(r11)
            long r8 = r3 - r1
            r10.t = r6
            java.lang.Object r11 = dev.epro.r0.J8045362843799184672.I(r8, r10)
            if (r11 != r7) goto L2d
            goto L35
        L2d:
            r10.t = r5
            java.lang.Object r11 = dev.epro.r0.J8045362843799184672.I(r1, r10)
            if (r11 != r7) goto L36
        L35:
            return r7
        L36:
            dev.epro.r0.Z7637734454282223795 r10 = r10.v
            dev.epro.r0.H7219028874700587498 r10 = r10.c
            if (r10 == 0) goto L49
            dev.epro.r0.F3982452524614060956 r11 = new dev.epro.r0.F3982452524614060956
            r11.<init>(r3)
            dev.epro.r0.C10696704014433963524 r0 = new dev.epro.r0.C10696704014433963524
            r0.<init>(r11)
            r10.resumeWith(r0)
        L49:
            dev.epro.r0.O9245300239821758723 r10 = dev.epro.r0.O9245300239821758723.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.N15919677834740887145.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
