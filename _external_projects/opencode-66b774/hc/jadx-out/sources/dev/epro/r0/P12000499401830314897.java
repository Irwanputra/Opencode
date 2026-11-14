package dev.epro.r0;

import ads_mobile_sdk.fl2;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P12000499401830314897 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P12000499401830314897(boolean z, Object obj, long j, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = z;
        this.x = obj;
        this.w = j;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                return new P12000499401830314897(this.v, (N5230833122018532994) obj2, this.w, r4833348786910499294, (byte) 0);
            case 1:
                return new P12000499401830314897(this.v, (B8669154544800329371) obj2, this.w, r4833348786910499294, (byte) 1);
            default:
                return new P12000499401830314897(this.v, (fl2) obj2, this.w, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((P12000499401830314897) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((P12000499401830314897) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((P12000499401830314897) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if (r0 == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
    
        if (r0 == r9) goto L51;
     */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            byte r0 = r12.t
            long r1 = r12.w
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            java.lang.Object r3 = r12.x
            boolean r4 = r12.v
            r7 = 0
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.Z3437138737604933638 r9 = dev.epro.r0.Z3437138737604933638.a
            r10 = 1
            r11 = 2
            switch(r0) {
                case 0: goto L72;
                case 1: goto L46;
                default: goto L14;
            }
        L14:
            byte r0 = r12.u
            if (r0 == 0) goto L26
            if (r0 == r10) goto L22
            if (r0 != r11) goto L1d
            goto L22
        L1d:
            dev.epro.r0.S10973172697741180971.m(r8)
            r6 = r7
            goto L45
        L22:
            dev.epro.r0.E17665849472693074628.k(r13)
            goto L45
        L26:
            dev.epro.r0.E17665849472693074628.k(r13)
            ads_mobile_sdk.fl2 r3 = (ads_mobile_sdk.fl2) r3
            if (r4 == 0) goto L39
            r12.u = r10
            r3.getClass()
            java.lang.Object r0 = ads_mobile_sdk.fl2.c(r3, r1, r12)
            if (r0 != r9) goto L45
            goto L44
        L39:
            r12.u = r11
            r3.getClass()
            java.lang.Object r0 = ads_mobile_sdk.fl2.d(r3, r1, r12)
            if (r0 != r9) goto L45
        L44:
            r6 = r9
        L45:
            return r6
        L46:
            byte r0 = r12.u
            if (r0 == 0) goto L58
            if (r0 == r10) goto L54
            if (r0 != r11) goto L4f
            goto L54
        L4f:
            dev.epro.r0.S10973172697741180971.m(r8)
            r6 = r7
            goto L71
        L54:
            dev.epro.r0.E17665849472693074628.k(r13)
            goto L71
        L58:
            dev.epro.r0.E17665849472693074628.k(r13)
            dev.epro.r0.B8669154544800329371 r3 = (dev.epro.r0.B8669154544800329371) r3
            if (r4 == 0) goto L68
            r12.u = r10
            java.lang.Object r0 = r3.d(r1, r12)
            if (r0 != r9) goto L71
            goto L70
        L68:
            r12.u = r11
            java.lang.Object r0 = r3.b(r1, r12)
            if (r0 != r9) goto L71
        L70:
            r6 = r9
        L71:
            return r6
        L72:
            byte r0 = r12.u
            if (r0 == 0) goto L89
            if (r0 == r10) goto L84
            if (r0 != r11) goto L7f
            dev.epro.r0.E17665849472693074628.k(r13)
            r0 = r13
            goto Lb4
        L7f:
            dev.epro.r0.S10973172697741180971.m(r8)
            r6 = r7
            goto Lb8
        L84:
            dev.epro.r0.E17665849472693074628.k(r13)
            r0 = r13
            goto La0
        L89:
            dev.epro.r0.E17665849472693074628.k(r13)
            dev.epro.r0.N5230833122018532994 r3 = (dev.epro.r0.N5230833122018532994) r3
            dev.epro.r0.P13832034982779129365 r0 = r3.a
            if (r4 != 0) goto La5
            r12.u = r10
            r1 = 0
            long r3 = r12.w
            r5 = r12
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r9) goto La0
            goto Lb2
        La0:
            dev.epro.r0.L9139634373441254073 r0 = (dev.epro.r0.L9139634373441254073) r0
            long r0 = r0.a
            goto Lb8
        La5:
            r12.u = r11
            long r1 = r12.w
            r3 = 0
            r5 = r12
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r9) goto Lb4
        Lb2:
            r6 = r9
            goto Lb8
        Lb4:
            dev.epro.r0.L9139634373441254073 r0 = (dev.epro.r0.L9139634373441254073) r0
            long r0 = r0.a
        Lb8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P12000499401830314897.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
