package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I5566604416186847280 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I5566604416186847280(H17052510251737830620 h17052510251737830620, Object obj, W3656598099029166611 w3656598099029166611, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 3;
        this.y = h17052510251737830620;
        this.w = obj;
        this.z = w3656598099029166611;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                I5566604416186847280 i5566604416186847280 = new I5566604416186847280(this.y, obj2, r4833348786910499294, (byte) 0);
                i5566604416186847280.x = obj;
                return i5566604416186847280;
            case 1:
                return new I5566604416186847280(this.y, obj2, r4833348786910499294, (byte) 1);
            case 2:
                return new I5566604416186847280(this.y, obj2, r4833348786910499294, (byte) 2);
            case 3:
                return new I5566604416186847280((H17052510251737830620) this.y, this.w, (W3656598099029166611) obj2, r4833348786910499294);
            default:
                I5566604416186847280 i55666044161868472802 = new I5566604416186847280((B13729205492206812220) obj2, r4833348786910499294);
                i55666044161868472802.x = obj;
                return i55666044161868472802;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.z;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((I5566604416186847280) create((R4833348786910499294) obj2, obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return new I5566604416186847280(this.y, obj3, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new I5566604416186847280(this.y, obj3, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return ((I5566604416186847280) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                ((I5566604416186847280) create((R4833348786910499294) obj2, (S7864201625552763331) obj)).invokeSuspend(o9245300239821758723);
                return Z3437138737604933638.a;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #2 {all -> 0x0032, blocks: (B:16:0x0048, B:25:0x008d, B:22:0x007c, B:27:0x0097, B:10:0x002e, B:19:0x0067), top: B:193:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187 A[PHI: r6 r19
      0x0187: PHI (r6v9 dev.epro.r0.H17052510251737830620) = (r6v8 dev.epro.r0.H17052510251737830620), (r6v15 dev.epro.r0.H17052510251737830620) binds: [B:71:0x0183, B:51:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r19v2 float) = (r19v1 float), (r19v5 float) binds: [B:71:0x0183, B:51:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193 A[PHI: r6 r19
      0x0193: PHI (r6v10 dev.epro.r0.H17052510251737830620) = 
      (r6v8 dev.epro.r0.H17052510251737830620)
      (r6v9 dev.epro.r0.H17052510251737830620)
      (r6v16 dev.epro.r0.H17052510251737830620)
     binds: [B:76:0x0191, B:74:0x018d, B:50:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r19v3 float) = (r19v0 float), (r19v2 float), (r19v6 float) binds: [B:76:0x0191, B:74:0x018d, B:50:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v21, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v24, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r4v0, types: [dev.epro.r0.O9245300239821758723, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [dev.epro.r0.M9197813449740923653] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [dev.epro.r0.M9197813449740923653, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:22:0x007c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a8 -> B:22:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I5566604416186847280.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I5566604416186847280(B13729205492206812220 b13729205492206812220, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 4;
        this.z = b13729205492206812220;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I5566604416186847280(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.y = obj;
        this.z = obj2;
    }
}
