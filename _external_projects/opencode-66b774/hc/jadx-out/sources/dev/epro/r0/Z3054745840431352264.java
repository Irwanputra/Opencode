package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z3054745840431352264 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public /* synthetic */ boolean v;
    public final /* synthetic */ J7128855986599981135 w;
    public final /* synthetic */ int x;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z3054745840431352264(J7128855986599981135 j7128855986599981135, int i, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = j7128855986599981135;
        this.x = i;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        int i = this.x;
        J7128855986599981135 j7128855986599981135 = this.w;
        switch (b) {
            case 0:
                Z3054745840431352264 z3054745840431352264 = new Z3054745840431352264(j7128855986599981135, i, r4833348786910499294, (byte) 0);
                z3054745840431352264.v = ((Boolean) obj).booleanValue();
                return z3054745840431352264;
            default:
                Z3054745840431352264 z30547458404313522642 = new Z3054745840431352264(j7128855986599981135, i, r4833348786910499294, (byte) 1);
                z30547458404313522642.v = ((Boolean) obj).booleanValue();
                return z30547458404313522642;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((Z3054745840431352264) create(r4833348786910499294, bool)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z3054745840431352264.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
