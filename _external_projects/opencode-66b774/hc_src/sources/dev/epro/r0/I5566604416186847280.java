package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #2 {all -> 0x0032, blocks: (B:13:0x0048, B:14:0x008d, B:16:0x007c, B:20:0x0097, B:26:0x002e, B:28:0x0067), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v21, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r4v0, types: [dev.epro.r0.O9245300239821758723, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [dev.epro.r0.M9197813449740923653] */
    /* JADX WARN: Type inference failed for: r4v15, types: [dev.epro.r0.M9197813449740923653, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0095 -> B:16:0x007c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a8 -> B:16:0x007c). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 994
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
