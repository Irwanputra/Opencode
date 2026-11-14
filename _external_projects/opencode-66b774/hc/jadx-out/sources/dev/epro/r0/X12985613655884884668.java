package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X12985613655884884668 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ U16834965109098959004 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ C3125267566254703773 y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X12985613655884884668(U16834965109098959004 u16834965109098959004, float f, boolean z, V6203828496495967432 v6203828496495967432, C3125267566254703773 c3125267566254703773, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 2;
        this.v = u16834965109098959004;
        this.w = f;
        this.x = z;
        this.z = v6203828496495967432;
        this.y = c3125267566254703773;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                return new X12985613655884884668(this.v, this.w, this.x, this.y, (W1972671267364756056) obj2, r4833348786910499294, (byte) 0);
            case 1:
                return new X12985613655884884668(this.v, this.w, this.x, this.y, (W1972671267364756056) obj2, r4833348786910499294, (byte) 1);
            default:
                C3125267566254703773 c3125267566254703773 = this.y;
                return new X12985613655884884668(this.v, this.w, this.x, (V6203828496495967432) obj2, c3125267566254703773, r4833348786910499294);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((X12985613655884884668) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (r6.f(r12, r13) == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        if (dev.epro.r0.E378075302204245686.a(r6, r7, r13, r2, r12) == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
    
        if (r6.f(r12, r13) == r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0119, code lost:
    
        if (dev.epro.r0.E378075302204245686.a(r6, r7, r13, r2, r12) == r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return r5;
     */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X12985613655884884668.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X12985613655884884668(U16834965109098959004 u16834965109098959004, float f, boolean z, C3125267566254703773 c3125267566254703773, W1972671267364756056 w1972671267364756056, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = u16834965109098959004;
        this.w = f;
        this.x = z;
        this.y = c3125267566254703773;
        this.z = w1972671267364756056;
    }
}
