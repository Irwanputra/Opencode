package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y7883607152544715144 extends R14062301455140331524 implements L12639328004344855510 {
    public float t;
    public byte u;
    public final /* synthetic */ float v;
    public final /* synthetic */ W1460317453757127858 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ long y;
    public final /* synthetic */ S6349823729575121924 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7883607152544715144(float f, W1460317453757127858 w1460317453757127858, boolean z, long j, S6349823729575121924 s6349823729575121924, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = f;
        this.w = w1460317453757127858;
        this.x = z;
        this.y = j;
        this.z = s6349823729575121924;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new Y7883607152544715144(this.v, this.w, this.x, this.y, this.z, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((Y7883607152544715144) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r9.b(r6, r8) == r5) goto L36;
     */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.u
            dev.epro.r0.W1460317453757127858 r1 = r8.w
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L14
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L91
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            r8 = 0
            return r8
        L1b:
            float r0 = r8.t
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L52
        L21:
            dev.epro.r0.E17665849472693074628.k(r9)
            float r9 = r8.v
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L3d
            boolean r0 = java.lang.Float.isInfinite(r9)
            if (r0 == 0) goto L33
            goto L3d
        L33:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3f
            double r6 = (double) r9
            double r6 = java.lang.Math.ceil(r6)
        L3c:
            float r9 = (float) r6
        L3d:
            r0 = r9
            goto L45
        L3f:
            double r6 = (double) r9
            double r6 = java.lang.Math.floor(r6)
            goto L3c
        L45:
            dev.epro.r0.G17854281415623469737 r9 = r1.x
            r8.t = r0
            r8.u = r4
            java.lang.Object r9 = dev.epro.r0.M14643676963617488237.p(r9, r0, r8)
            if (r9 != r5) goto L52
            goto L90
        L52:
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            boolean r4 = r8.x
            if (r4 == 0) goto L91
            long r6 = r8.y
            boolean r4 = dev.epro.r0.F12478849263529740365.d(r6)
            dev.epro.r0.S6349823729575121924 r6 = r8.z
            if (r4 == 0) goto L84
            float r4 = r6.c
            float r7 = r6.a
            float r4 = r4 - r7
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L84
            float r0 = r0 - r9
            float r9 = java.lang.Math.abs(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L7b
            goto L84
        L7b:
            float r9 = r6.c
            float r9 = r9 + r0
            r0 = 11
            dev.epro.r0.S6349823729575121924 r6 = dev.epro.r0.S6349823729575121924.b(r6, r2, r9, r2, r0)
        L84:
            dev.epro.r0.I12071840179596922896 r9 = r1.s
            dev.epro.r0.T14340690021504685682 r9 = r9.g
            r8.u = r3
            java.lang.Object r8 = r9.b(r6, r8)
            if (r8 != r5) goto L91
        L90:
            return r5
        L91:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y7883607152544715144.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
