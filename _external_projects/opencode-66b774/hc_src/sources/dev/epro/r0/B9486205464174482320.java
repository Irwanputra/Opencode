package dev.epro.r0;

import ads_mobile_sdk.mg2;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B9486205464174482320 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ boolean v;
    public Object w;
    public Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B9486205464174482320(boolean z, I13087925019311684776 i13087925019311684776, A10693687560045094360 a10693687560045094360, B9692660393722135472 b9692660393722135472, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 0;
        this.v = z;
        this.w = i13087925019311684776;
        this.x = a10693687560045094360;
        this.y = b9692660393722135472;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        boolean z = this.v;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return new B9486205464174482320(this.v, (I13087925019311684776) this.w, (A10693687560045094360) this.x, (B9692660393722135472) obj2, r4833348786910499294);
            case 1:
                return new B9486205464174482320((mg2) obj2, z, r4833348786910499294, (byte) 1);
            default:
                return new B9486205464174482320((mg2) obj2, z, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((B9486205464174482320) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((B9486205464174482320) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return new B9486205464174482320((mg2) this.y, this.v, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00d5, code lost:
    
        if (ads_mobile_sdk.mg2.a(r15, r7, r14) == r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0192, code lost:
    
        if (ads_mobile_sdk.mg2.a(r15, r7, r14) == r4) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01ed, code lost:
    
        if (ads_mobile_sdk.mg2.a(r15, r7, r14) == r4) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x028f, code lost:
    
        if (r15 == r13) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x007a, code lost:
    
        if (ads_mobile_sdk.mg2.a(r15, r7, r14) == r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0201 A[Catch: all -> 0x020d, TryCatch #3 {all -> 0x020d, blocks: (B:118:0x01fa, B:120:0x0201, B:122:0x0205, B:124:0x0209, B:125:0x0210, B:127:0x0214, B:129:0x0218, B:131:0x021c, B:132:0x021d, B:133:0x0222, B:134:0x0223, B:135:0x022a, B:136:0x022b, B:137:0x0232, B:138:0x0233), top: B:117:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0233 A[Catch: all -> 0x020d, TRY_LEAVE, TryCatch #3 {all -> 0x020d, blocks: (B:118:0x01fa, B:120:0x0201, B:122:0x0205, B:124:0x0209, B:125:0x0210, B:127:0x0214, B:129:0x0218, B:131:0x021c, B:132:0x021d, B:133:0x0222, B:134:0x0223, B:135:0x022a, B:136:0x022b, B:137:0x0232, B:138:0x0233), top: B:117:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01a5 A[Catch: all -> 0x01b1, TryCatch #5 {all -> 0x01b1, blocks: (B:157:0x019e, B:159:0x01a5, B:161:0x01a9, B:163:0x01ad, B:164:0x01b4, B:166:0x01b8, B:168:0x01bc, B:170:0x01c0, B:171:0x01c1, B:172:0x01c6, B:173:0x01c7, B:174:0x01ce, B:175:0x01cf, B:176:0x01d6, B:177:0x01d7), top: B:156:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01d7 A[Catch: all -> 0x01b1, TRY_LEAVE, TryCatch #5 {all -> 0x01b1, blocks: (B:157:0x019e, B:159:0x01a5, B:161:0x01a9, B:163:0x01ad, B:164:0x01b4, B:166:0x01b8, B:168:0x01bc, B:170:0x01c0, B:171:0x01c1, B:172:0x01c6, B:173:0x01c7, B:174:0x01ce, B:175:0x01cf, B:176:0x01d6, B:177:0x01d7), top: B:156:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e9 A[Catch: all -> 0x00f5, TryCatch #8 {all -> 0x00f5, blocks: (B:18:0x00e2, B:20:0x00e9, B:22:0x00ed, B:24:0x00f1, B:25:0x00f8, B:27:0x00fc, B:29:0x0100, B:31:0x0104, B:32:0x0105, B:33:0x010a, B:34:0x010b, B:35:0x0112, B:36:0x0113, B:37:0x011a, B:38:0x011b), top: B:17:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #8 {all -> 0x00f5, blocks: (B:18:0x00e2, B:20:0x00e9, B:22:0x00ed, B:24:0x00f1, B:25:0x00f8, B:27:0x00fc, B:29:0x0100, B:31:0x0104, B:32:0x0105, B:33:0x010a, B:34:0x010b, B:35:0x0112, B:36:0x0113, B:37:0x011a, B:38:0x011b), top: B:17:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008d A[Catch: all -> 0x0099, TryCatch #11 {all -> 0x0099, blocks: (B:57:0x0086, B:59:0x008d, B:61:0x0091, B:63:0x0095, B:64:0x009c, B:66:0x00a0, B:68:0x00a4, B:70:0x00a8, B:71:0x00a9, B:72:0x00ae, B:73:0x00af, B:74:0x00b6, B:75:0x00b7, B:76:0x00be, B:77:0x00bf), top: B:56:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bf A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #11 {all -> 0x0099, blocks: (B:57:0x0086, B:59:0x008d, B:61:0x0091, B:63:0x0095, B:64:0x009c, B:66:0x00a0, B:68:0x00a4, B:70:0x00a8, B:71:0x00a9, B:72:0x00ae, B:73:0x00af, B:74:0x00b6, B:75:0x00b7, B:76:0x00be, B:77:0x00bf), top: B:56:0x0086 }] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B9486205464174482320.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B9486205464174482320(mg2 mg2Var, boolean z, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.y = mg2Var;
        this.v = z;
    }
}
