package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M4874962628954682344 extends T7441316690157960089 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public /* synthetic */ Object v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M4874962628954682344(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.x = obj2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                M4874962628954682344 m4874962628954682344 = new M4874962628954682344((String) this.w, (K2023750379864020554) obj2, r4833348786910499294, (byte) 0);
                m4874962628954682344.v = obj;
                return m4874962628954682344;
            case 1:
                M4874962628954682344 m48749626289546823442 = new M4874962628954682344((G8001132634698687269) this.w, (L12639328004344855510) obj2, r4833348786910499294, (byte) 1);
                m48749626289546823442.v = obj;
                return m48749626289546823442;
            case 2:
                M4874962628954682344 m48749626289546823443 = new M4874962628954682344((N235339945877347053) obj2, r4833348786910499294);
                m48749626289546823443.v = obj;
                return m48749626289546823443;
            case 3:
                M4874962628954682344 m48749626289546823444 = new M4874962628954682344((A15234621907337682254) this.w, (V10383417447826362791) obj2, r4833348786910499294, (byte) 3);
                m48749626289546823444.v = obj;
                return m48749626289546823444;
            default:
                M4874962628954682344 m48749626289546823445 = new M4874962628954682344((J17191566391535857141) this.w, (A7209497065939201693) obj2, r4833348786910499294, (byte) 4);
                m48749626289546823445.v = obj;
                return m48749626289546823445;
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
        return ((M4874962628954682344) create(r4833348786910499294, z7637734454282223795)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0184, code lost:
    
        if (r4 == r8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0221, code lost:
    
        if (dev.epro.r0.V1475975160983963926.m(r5, r4, r18) != r8) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0232, code lost:
    
        if (dev.epro.r0.V1475975160983963926.m(r5, r4, r18) == r8) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0284, code lost:
    
        if (r0 == r8) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0268, code lost:
    
        if (r3 == r8) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r3 != r8) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if (r3 == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012c, code lost:
    
        if (r0 == r8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011f, code lost:
    
        if (r3 == r8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019d, code lost:
    
        if (r5 != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020b A[Catch: CancellationException -> 0x01f2, TRY_ENTER, TryCatch #0 {CancellationException -> 0x01f2, blocks: (B:112:0x020b, B:117:0x0219, B:125:0x01ee, B:127:0x01f9), top: B:103:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0237  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0221 -> B:93:0x0205). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0232 -> B:93:0x0205). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b2 -> B:8:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x019d -> B:68:0x01a1). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M4874962628954682344.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4874962628954682344(N235339945877347053 n235339945877347053, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.t = (byte) 2;
        this.x = n235339945877347053;
    }
}
