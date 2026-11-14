package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L3924708429741079482 extends R14062301455140331524 implements J12078565427869724451 {
    public byte t;
    public /* synthetic */ S7864201625552763331 u;
    public /* synthetic */ int v;
    public final /* synthetic */ P1480303480448191796 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L3924708429741079482(P1480303480448191796 p1480303480448191796, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.w = p1480303480448191796;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        L3924708429741079482 l3924708429741079482 = new L3924708429741079482(this.w, (R4833348786910499294) obj3);
        l3924708429741079482.u = (S7864201625552763331) obj;
        l3924708429741079482.v = iIntValue;
        return l3924708429741079482.invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r14.emit(dev.epro.r0.C4426096483489462691.a, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r0.emit(dev.epro.r0.C4426096483489462691.c, r13) != r10) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[PHI: r0
      0x0077: PHI (r0v6 dev.epro.r0.S7864201625552763331) = 
      (r0v4 dev.epro.r0.S7864201625552763331)
      (r0v5 dev.epro.r0.S7864201625552763331)
      (r0v9 dev.epro.r0.S7864201625552763331)
     binds: [B:26:0x005d, B:31:0x0074, B:12:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            dev.epro.r0.P1480303480448191796 r0 = r13.w
            long r1 = r0.b
            byte r3 = r13.t
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r3 == 0) goto L37
            if (r3 == r9) goto L33
            if (r3 == r8) goto L2d
            if (r3 == r7) goto L27
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            goto L33
        L1b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r13)
            return r4
        L21:
            dev.epro.r0.S7864201625552763331 r0 = r13.u
            dev.epro.r0.E17665849472693074628.k(r14)
            goto L77
        L27:
            dev.epro.r0.S7864201625552763331 r0 = r13.u
            dev.epro.r0.E17665849472693074628.k(r14)
            goto L6c
        L2d:
            dev.epro.r0.S7864201625552763331 r0 = r13.u
            dev.epro.r0.E17665849472693074628.k(r14)
            goto L59
        L33:
            dev.epro.r0.E17665849472693074628.k(r14)
            goto L84
        L37:
            dev.epro.r0.E17665849472693074628.k(r14)
            dev.epro.r0.S7864201625552763331 r14 = r13.u
            int r3 = r13.v
            if (r3 <= 0) goto L4b
            r13.t = r9
            dev.epro.r0.C4426096483489462691 r0 = dev.epro.r0.C4426096483489462691.a
            java.lang.Object r13 = r14.emit(r0, r13)
            if (r13 != r10) goto L84
            goto L83
        L4b:
            long r11 = r0.a
            r13.u = r14
            r13.t = r8
            java.lang.Object r0 = dev.epro.r0.J8045362843799184672.I(r11, r13)
            if (r0 != r10) goto L58
            goto L83
        L58:
            r0 = r14
        L59:
            r8 = 0
            int r14 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r14 <= 0) goto L77
            r13.u = r0
            r13.t = r7
            dev.epro.r0.C4426096483489462691 r14 = dev.epro.r0.C4426096483489462691.b
            java.lang.Object r14 = r0.emit(r14, r13)
            if (r14 != r10) goto L6c
            goto L83
        L6c:
            r13.u = r0
            r13.t = r6
            java.lang.Object r14 = dev.epro.r0.J8045362843799184672.I(r1, r13)
            if (r14 != r10) goto L77
            goto L83
        L77:
            r13.u = r4
            r13.t = r5
            dev.epro.r0.C4426096483489462691 r14 = dev.epro.r0.C4426096483489462691.c
            java.lang.Object r13 = r0.emit(r14, r13)
            if (r13 != r10) goto L84
        L83:
            return r10
        L84:
            dev.epro.r0.O9245300239821758723 r13 = dev.epro.r0.O9245300239821758723.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L3924708429741079482.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
