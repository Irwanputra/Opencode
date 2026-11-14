package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q15505522140990258817 extends T7441316690157960089 implements L12639328004344855510 {
    public Object t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ B13729205492206812220 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q15505522140990258817(B13729205492206812220 b13729205492206812220, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.w = b13729205492206812220;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        Q15505522140990258817 q15505522140990258817 = new Q15505522140990258817(this.w, r4833348786910499294);
        q15505522140990258817.v = obj;
        return q15505522140990258817;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((Q15505522140990258817) create((R4833348786910499294) obj2, (N3180492300688416475) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:5:0x0035). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.u
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            java.lang.Object r0 = r4.t
            java.lang.Object r3 = r4.v
            dev.epro.r0.N3180492300688416475 r3 = (dev.epro.r0.N3180492300688416475) r3
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L35
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r1
        L18:
            dev.epro.r0.E17665849472693074628.k(r5)
            java.lang.Object r5 = r4.v
            dev.epro.r0.N3180492300688416475 r5 = (dev.epro.r0.N3180492300688416475) r5
            r3 = r5
        L20:
            dev.epro.r0.B13729205492206812220 r5 = r4.w
            java.lang.Object r5 = r5.invoke()
            if (r5 == 0) goto L34
            r4.v = r3
            r4.t = r5
            r4.u = r2
            r3.c(r4, r5)
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            return r4
        L34:
            r0 = r1
        L35:
            if (r0 != 0) goto L20
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q15505522140990258817.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
