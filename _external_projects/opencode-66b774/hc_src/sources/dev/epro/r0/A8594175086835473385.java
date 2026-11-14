package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A8594175086835473385 extends T7441316690157960089 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A8594175086835473385(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(r4833348786910499294);
        this.t = b;
        this.w = obj;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                A8594175086835473385 a8594175086835473385 = new A8594175086835473385((N11829648573770870927) obj2, r4833348786910499294, (byte) 0);
                a8594175086835473385.v = obj;
                return a8594175086835473385;
            default:
                A8594175086835473385 a85941750868354733852 = new A8594175086835473385((F4096073349764486348) obj2, r4833348786910499294, (byte) 1);
                a85941750868354733852.v = obj;
                return a85941750868354733852;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z7637734454282223795 z7637734454282223795 = (Z7637734454282223795) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((A8594175086835473385) create(r4833348786910499294, z7637734454282223795)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r15 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r15 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        if (r15 != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0093, code lost:
    
        if (r15 == r5) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a8 -> B:25:0x00ac). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A8594175086835473385.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
