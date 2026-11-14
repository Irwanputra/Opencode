package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L17941041579542105815 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public W12133020733110407383 u;
    public byte v;
    public /* synthetic */ Object w;
    public final /* synthetic */ J196785984016436306 x;
    public final /* synthetic */ F4096073349764486348 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L17941041579542105815(J196785984016436306 j196785984016436306, R4833348786910499294 r4833348786910499294, F4096073349764486348 f4096073349764486348, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.x = j196785984016436306;
        this.y = f4096073349764486348;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                L17941041579542105815 l17941041579542105815 = new L17941041579542105815(this.x, r4833348786910499294, this.y, (byte) 0);
                l17941041579542105815.w = obj;
                return l17941041579542105815;
            default:
                L17941041579542105815 l179410415795421058152 = new L17941041579542105815(this.x, r4833348786910499294, this.y, (byte) 1);
                l179410415795421058152.w = obj;
                return l179410415795421058152;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        F6741456026889144139 f6741456026889144139 = (F6741456026889144139) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((L17941041579542105815) create(r4833348786910499294, f6741456026889144139)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[PHI: r0 r14
      0x0099: PHI (r0v18 dev.epro.r0.F6741456026889144139) = (r0v17 dev.epro.r0.F6741456026889144139), (r0v24 dev.epro.r0.F6741456026889144139) binds: [B:28:0x0096, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r14v32 java.lang.Object) = (r14v30 java.lang.Object), (r14v0 java.lang.Object) binds: [B:28:0x0096, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0145 A[PHI: r0 r14
      0x0145: PHI (r0v6 dev.epro.r0.F6741456026889144139) = (r0v5 dev.epro.r0.F6741456026889144139), (r0v12 dev.epro.r0.F6741456026889144139) binds: [B:63:0x0142, B:49:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r14v12 java.lang.Object) = (r14v10 java.lang.Object), (r14v0 java.lang.Object) binds: [B:63:0x0142, B:49:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L17941041579542105815.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
