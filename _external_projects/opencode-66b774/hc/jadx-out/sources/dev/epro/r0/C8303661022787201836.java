package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C8303661022787201836 extends R14062301455140331524 implements F4096073349764486348 {
    public byte t;
    public final /* synthetic */ R8029976778412248429 u;
    public final /* synthetic */ float v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ M15459437176959963354 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8303661022787201836(R8029976778412248429 r8029976778412248429, float f, boolean z, M15459437176959963354 m15459437176959963354, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.u = r8029976778412248429;
        this.v = f;
        this.w = z;
        this.x = m15459437176959963354;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        boolean z = this.w;
        M15459437176959963354 m15459437176959963354 = this.x;
        return new C8303661022787201836(this.u, this.v, z, m15459437176959963354, (R4833348786910499294) obj).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r15.f(r14, r0) == r7) goto L34;
     */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            dev.epro.r0.R8029976778412248429 r0 = r14.u
            dev.epro.r0.H617089765907910851 r1 = r0.a
            byte r2 = r14.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 == r4) goto L19
            if (r2 != r3) goto L12
            dev.epro.r0.E17665849472693074628.k(r15)
            return r15
        L12:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r14)
            r14 = 0
            return r14
        L19:
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L98
        L1e:
            dev.epro.r0.E17665849472693074628.k(r15)
            int r15 = r1.b()
            float r2 = r14.v
            if (r15 != 0) goto L55
            double r5 = (double) r2
            r7 = 4610932096582823192(0x3ffd524fe4442d18, double:1.8325957218792777)
            double r5 = r5 + r7
            r9 = 4602891378177867776(0x3fe0c15240000000, double:0.5235987901687622)
            double r5 = r5 / r9
            int r15 = (int) r5
            r5 = 12
            int r15 = r15 % r5
            int r15 = r15 % r5
            float r15 = (float) r15
            r6 = 1057360530(0x3f060a92, float:0.5235988)
            float r15 = r15 * r6
            r0.d = r15
            double r11 = (double) r15
            double r11 = r11 + r7
            double r11 = r11 / r9
            int r15 = (int) r11
            int r15 = r15 % r5
            int r15 = r15 % r5
            boolean r6 = dev.epro.r0.S16343116836002986007.u(r0)
            if (r6 == 0) goto L4f
            goto L50
        L4f:
            r5 = 0
        L50:
            int r15 = r15 + r5
            r1.a(r15)
            goto L75
        L55:
            double r5 = (double) r2
            r7 = 4609988864856304920(0x3ff9f872a4442d18, double:1.6231562058117728)
            double r5 = r5 + r7
            r9 = 4592210274475311104(0x3fbaceea00000000, double:0.10471975803375244)
            double r5 = r5 / r9
            int r15 = (int) r5
            int r15 = r15 % 60
            float r15 = (float) r15
            r5 = 1037465424(0x3dd67750, float:0.10471976)
            float r15 = r15 * r5
            r0.e = r15
            double r5 = (double) r15
            double r5 = r5 + r7
            double r5 = r5 / r9
            int r15 = (int) r5
            int r15 = r15 % 60
            r1.d(r15)
        L75:
            boolean r15 = r14.w
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            r5 = 0
            r6 = 1070141403(0x3fc90fdb, float:1.5707964)
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r15 != 0) goto L9b
            dev.epro.r0.U16834965109098959004 r15 = r0.f
            float r2 = r2 + r6
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L8a
            float r2 = r2 + r1
        L8a:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r14.t = r4
            java.lang.Object r14 = r15.f(r14, r0)
            if (r14 != r7) goto L98
            goto Lba
        L98:
            dev.epro.r0.O9245300239821758723 r14 = dev.epro.r0.O9245300239821758723.a
            return r14
        L9b:
            float r2 = r2 + r6
            int r15 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r15 >= 0) goto La1
            float r2 = r2 + r1
        La1:
            float r15 = r0.h(r2)
            dev.epro.r0.U16834965109098959004 r8 = r0.f
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r15)
            r14.t = r3
            dev.epro.r0.M15459437176959963354 r10 = r14.x
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r14 = dev.epro.r0.U16834965109098959004.a(r8, r9, r10, r11, r12, r13)
            if (r14 != r7) goto Lbb
        Lba:
            return r7
        Lbb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C8303661022787201836.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
