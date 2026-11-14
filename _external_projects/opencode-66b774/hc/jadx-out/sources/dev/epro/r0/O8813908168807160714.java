package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O8813908168807160714 extends T7441316690157960089 implements L12639328004344855510 {
    public long[] t;
    public int u;
    public int v;
    public byte w;
    public /* synthetic */ Object x;
    public final /* synthetic */ D7201182503133677242 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8813908168807160714(D7201182503133677242 d7201182503133677242, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.y = d7201182503133677242;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        O8813908168807160714 o8813908168807160714 = new O8813908168807160714(this.y, r4833348786910499294);
        o8813908168807160714.x = obj;
        return o8813908168807160714;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((O8813908168807160714) create((R4833348786910499294) obj2, (N3180492300688416475) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            dev.epro.r0.D7201182503133677242 r1 = r0.y
            long r2 = r1.a
            long r4 = r1.c
            long r6 = r1.b
            byte r8 = r0.w
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            dev.epro.r0.Z3437138737604933638 r11 = dev.epro.r0.Z3437138737604933638.a
            if (r8 == 0) goto L4b
            if (r8 == r10) goto L3c
            if (r8 == r14) goto L32
            if (r8 != r13) goto L2c
            int r1 = r0.u
            java.lang.Object r6 = r0.x
            dev.epro.r0.N3180492300688416475 r6 = (dev.epro.r0.N3180492300688416475) r6
            dev.epro.r0.E17665849472693074628.k(r23)
            r7 = r13
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r9
        L32:
            int r1 = r0.u
            java.lang.Object r8 = r0.x
            dev.epro.r0.N3180492300688416475 r8 = (dev.epro.r0.N3180492300688416475) r8
            dev.epro.r0.E17665849472693074628.k(r23)
            goto L93
        L3c:
            int r1 = r0.v
            int r8 = r0.u
            long[] r15 = r0.t
            java.lang.Object r13 = r0.x
            dev.epro.r0.N3180492300688416475 r13 = (dev.epro.r0.N3180492300688416475) r13
            dev.epro.r0.E17665849472693074628.k(r23)
            int r8 = r8 + r10
            goto L59
        L4b:
            dev.epro.r0.E17665849472693074628.k(r23)
            java.lang.Object r8 = r0.x
            r13 = r8
            dev.epro.r0.N3180492300688416475 r13 = (dev.epro.r0.N3180492300688416475) r13
            long[] r15 = r1.d
            if (r15 == 0) goto L70
            int r1 = r15.length
            r8 = 0
        L59:
            if (r8 >= r1) goto L70
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.x = r13
            r0.t = r15
            r0.u = r8
            r0.v = r1
            r0.w = r10
            r13.c(r0, r4)
            return r11
        L70:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = r13
            r1 = 0
        L76:
            if (r1 >= r12) goto L95
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L93
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.x = r8
            r0.t = r9
            r0.u = r1
            r0.w = r14
            r8.c(r0, r2)
            return r11
        L93:
            int r1 = r1 + r10
            goto L76
        L95:
            r13 = r8
        L96:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r13
            r15 = 0
        L9c:
            if (r15 >= r12) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.x = r6
            r0.t = r9
            r0.u = r15
            r7 = 3
            r0.w = r7
            r6.c(r0, r1)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9c
        Lc1:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O8813908168807160714.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
