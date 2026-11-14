package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S13046716707540739929 extends R14062301455140331524 implements L12639328004344855510 {
    public long t;
    public byte u;
    public /* synthetic */ long v;
    public final /* synthetic */ V5142773592757085764 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S13046716707540739929(V5142773592757085764 v5142773592757085764, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = v5142773592757085764;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        S13046716707540739929 s13046716707540739929 = new S13046716707540739929(this.w, r4833348786910499294);
        s13046716707540739929.v = ((L9139634373441254073) obj).a;
        return s13046716707540739929;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        long j = ((L9139634373441254073) obj).a;
        S13046716707540739929 s13046716707540739929 = new S13046716707540739929(this.w, (R4833348786910499294) obj2);
        s13046716707540739929.v = j;
        return s13046716707540739929.invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            byte r0 = r14.u
            r1 = 3
            r2 = 2
            r3 = 1
            dev.epro.r0.V5142773592757085764 r4 = r14.w
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L19
            long r0 = r14.t
            long r2 = r14.v
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L70
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r14)
            r14 = 0
            return r14
        L20:
            long r2 = r14.t
            long r6 = r14.v
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L56
        L28:
            long r6 = r14.v
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L40
        L2e:
            dev.epro.r0.E17665849472693074628.k(r15)
            long r6 = r14.v
            dev.epro.r0.P13832034982779129365 r15 = r4.f
            r14.v = r6
            r14.u = r3
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r5) goto L40
            goto L6d
        L40:
            dev.epro.r0.L9139634373441254073 r15 = (dev.epro.r0.L9139634373441254073) r15
            long r8 = r15.a
            long r8 = dev.epro.r0.L9139634373441254073.d(r6, r8)
            r14.v = r6
            r14.t = r8
            r14.u = r2
            java.lang.Object r15 = r4.a(r8, r14)
            if (r15 != r5) goto L55
            goto L6d
        L55:
            r2 = r8
        L56:
            dev.epro.r0.L9139634373441254073 r15 = (dev.epro.r0.L9139634373441254073) r15
            long r11 = r15.a
            dev.epro.r0.P13832034982779129365 r8 = r4.f
            long r9 = dev.epro.r0.L9139634373441254073.d(r2, r11)
            r14.v = r6
            r14.t = r11
            r14.u = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r2 = r6
            r0 = r11
        L70:
            dev.epro.r0.L9139634373441254073 r15 = (dev.epro.r0.L9139634373441254073) r15
            long r14 = r15.a
            long r14 = dev.epro.r0.L9139634373441254073.d(r0, r14)
            long r14 = dev.epro.r0.L9139634373441254073.d(r2, r14)
            dev.epro.r0.L9139634373441254073 r0 = new dev.epro.r0.L9139634373441254073
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S13046716707540739929.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
