package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D12899267686886439579 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public /* synthetic */ float v;
    public final /* synthetic */ java.lang.Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D12899267686886439579(dev.epro.r0.L7100317404093621994 l7100317404093621994, float f, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = l7100317404093621994;
        this.v = f;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        java.lang.Object obj2 = this.w;
        switch (b) {
            case 0:
                dev.epro.r0.D12899267686886439579 d12899267686886439579 = new dev.epro.r0.D12899267686886439579((dev.epro.r0.C7718609449434082307) obj2, r4833348786910499294);
                d12899267686886439579.v = ((java.lang.Number) obj).floatValue();
                return d12899267686886439579;
            default:
                return new dev.epro.r0.D12899267686886439579((dev.epro.r0.L7100317404093621994) obj2, this.v, r4833348786910499294);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                return create((dev.epro.r0.R4833348786910499294) obj2, java.lang.Float.valueOf(((java.lang.Number) obj).floatValue())).invokeSuspend(o9245300239821758723);
            default:
                return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.M8821877208104636290 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws dev.epro.r0.M8821877208104636290 {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D12899267686886439579.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D12899267686886439579(dev.epro.r0.C7718609449434082307 c7718609449434082307, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = c7718609449434082307;
    }
}
