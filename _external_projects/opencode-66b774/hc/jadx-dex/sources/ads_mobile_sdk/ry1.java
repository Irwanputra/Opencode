package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ry1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.F4096073349764486348 {
    public java.lang.Object a;
    public java.io.Closeable b;
    public java.io.Closeable c;
    public java.lang.Object d;
    public java.lang.Object e;
    public ads_mobile_sdk.th3 f;
    public byte g;
    public final /* synthetic */ dev.epro.r0.I16631908410500040363 h;
    public final /* synthetic */ ads_mobile_sdk.xy1 i;
    public final /* synthetic */ ads_mobile_sdk.eg2 j;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry1(ads_mobile_sdk.eg2 eg2Var, ads_mobile_sdk.xy1 xy1Var, dev.epro.r0.I16631908410500040363 i16631908410500040363, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.h = i16631908410500040363;
        this.i = xy1Var;
        this.j = eg2Var;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.ry1(this.j, this.i, this.h, (dev.epro.r0.R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.h;
                return new ads_mobile_sdk.ry1(this.j, this.i, i16631908410500040363, (dev.epro.r0.R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d9 A[Catch: all -> 0x01e5, TryCatch #6 {all -> 0x01e5, blocks: (B:102:0x01d2, B:104:0x01d9, B:106:0x01dd, B:108:0x01e1, B:111:0x01e8, B:113:0x01ec, B:115:0x01f0, B:117:0x01f4, B:118:0x01f5, B:119:0x01fa, B:120:0x01fb, B:121:0x0202, B:122:0x0203, B:123:0x020a, B:124:0x020b), top: B:271:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b A[Catch: all -> 0x01e5, TRY_LEAVE, TryCatch #6 {all -> 0x01e5, blocks: (B:102:0x01d2, B:104:0x01d9, B:106:0x01dd, B:108:0x01e1, B:111:0x01e8, B:113:0x01ec, B:115:0x01f0, B:117:0x01f4, B:118:0x01f5, B:119:0x01fa, B:120:0x01fb, B:121:0x0202, B:122:0x0203, B:123:0x020a, B:124:0x020b), top: B:271:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033d A[Catch: all -> 0x0345, TRY_LEAVE, TryCatch #5 {all -> 0x0345, blocks: (B:180:0x0337, B:182:0x033d), top: B:269:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034f A[Catch: all -> 0x0276, TryCatch #20 {all -> 0x0276, blocks: (B:186:0x0348, B:188:0x034f, B:190:0x0366, B:150:0x026b), top: B:295:0x026b }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0366 A[Catch: all -> 0x0276, TRY_LEAVE, TryCatch #20 {all -> 0x0276, blocks: (B:186:0x0348, B:188:0x034f, B:190:0x0366, B:150:0x026b), top: B:295:0x026b }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0393 A[Catch: all -> 0x039f, TryCatch #23 {all -> 0x039f, blocks: (B:200:0x038c, B:202:0x0393, B:204:0x0397, B:206:0x039b, B:209:0x03a2, B:211:0x03a6, B:213:0x03aa, B:215:0x03ae, B:216:0x03af, B:217:0x03b4, B:218:0x03b5, B:219:0x03bc, B:220:0x03bd, B:221:0x03c4, B:222:0x03c5), top: B:299:0x038c }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c5 A[Catch: all -> 0x039f, TRY_LEAVE, TryCatch #23 {all -> 0x039f, blocks: (B:200:0x038c, B:202:0x0393, B:204:0x0397, B:206:0x039b, B:209:0x03a2, B:211:0x03a6, B:213:0x03aa, B:215:0x03ae, B:216:0x03af, B:217:0x03b4, B:218:0x03b5, B:219:0x03bc, B:220:0x03bd, B:221:0x03c4, B:222:0x03c5), top: B:299:0x038c }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03e1 A[Catch: all -> 0x03ed, TryCatch #12 {all -> 0x03ed, blocks: (B:233:0x03da, B:235:0x03e1, B:237:0x03e5, B:239:0x03e9, B:242:0x03f0, B:244:0x03f4, B:246:0x03f8, B:248:0x03fc, B:249:0x03fd, B:250:0x0402, B:251:0x0403, B:252:0x040a, B:253:0x040b, B:254:0x0412, B:255:0x0413), top: B:280:0x03da }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0413 A[Catch: all -> 0x03ed, TRY_LEAVE, TryCatch #12 {all -> 0x03ed, blocks: (B:233:0x03da, B:235:0x03e1, B:237:0x03e5, B:239:0x03e9, B:242:0x03f0, B:244:0x03f4, B:246:0x03f8, B:248:0x03fc, B:249:0x03fd, B:250:0x0402, B:251:0x0403, B:252:0x040a, B:253:0x040b, B:254:0x0412, B:255:0x0413), top: B:280:0x03da }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #8 {all -> 0x01c6, blocks: (B:94:0x01c2, B:95:0x01c5, B:35:0x00c5, B:37:0x00cb, B:39:0x00d6, B:41:0x00da, B:98:0x01c9, B:99:0x01ce, B:92:0x01c0, B:69:0x0186, B:71:0x018d, B:73:0x0191, B:75:0x0195, B:78:0x019c, B:80:0x01a0, B:82:0x01a4, B:84:0x01a8, B:85:0x01a9, B:86:0x01ae, B:87:0x01af, B:88:0x01b6, B:89:0x01b7, B:90:0x01be, B:91:0x01bf), top: B:273:0x00c5, inners: #2, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6 A[Catch: all -> 0x01c6, TRY_ENTER, TryCatch #8 {all -> 0x01c6, blocks: (B:94:0x01c2, B:95:0x01c5, B:35:0x00c5, B:37:0x00cb, B:39:0x00d6, B:41:0x00da, B:98:0x01c9, B:99:0x01ce, B:92:0x01c0, B:69:0x0186, B:71:0x018d, B:73:0x0191, B:75:0x0195, B:78:0x019c, B:80:0x01a0, B:82:0x01a4, B:84:0x01a8, B:85:0x01a9, B:86:0x01ae, B:87:0x01af, B:88:0x01b6, B:89:0x01b7, B:90:0x01be, B:91:0x01bf), top: B:273:0x00c5, inners: #2, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #16 {all -> 0x0130, blocks: (B:46:0x0122, B:48:0x0128), top: B:287:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:52:0x0137, B:54:0x013e, B:58:0x0162), top: B:260:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162 A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:52:0x0137, B:54:0x013e, B:58:0x0162), top: B:260:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018d A[Catch: all -> 0x0199, TryCatch #22 {all -> 0x0199, blocks: (B:69:0x0186, B:71:0x018d, B:73:0x0191, B:75:0x0195, B:78:0x019c, B:80:0x01a0, B:82:0x01a4, B:84:0x01a8, B:85:0x01a9, B:86:0x01ae, B:87:0x01af, B:88:0x01b6, B:89:0x01b7, B:90:0x01be, B:91:0x01bf), top: B:298:0x0186, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf A[Catch: all -> 0x0199, TRY_LEAVE, TryCatch #22 {all -> 0x0199, blocks: (B:69:0x0186, B:71:0x018d, B:73:0x0191, B:75:0x0195, B:78:0x019c, B:80:0x01a0, B:82:0x01a4, B:84:0x01a8, B:85:0x01a9, B:86:0x01ae, B:87:0x01af, B:88:0x01b6, B:89:0x01b7, B:90:0x01be, B:91:0x01bf), top: B:298:0x0186, outer: #8 }] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v50, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v64, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v81, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ry1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
