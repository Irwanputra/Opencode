package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r14 != r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r14.a(r13) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        if (r14 != r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
    
        if (r14.a(r13) == r3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L17941041579542105815.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
