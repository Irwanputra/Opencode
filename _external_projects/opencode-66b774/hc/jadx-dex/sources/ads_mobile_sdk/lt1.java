package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class lt1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public ads_mobile_sdk.th3 a;
    public ads_mobile_sdk.th3 b;
    public ads_mobile_sdk.it1 c;
    public boolean d;
    public final /* synthetic */ ads_mobile_sdk.it1 e;
    public final /* synthetic */ ads_mobile_sdk.wt1 f;
    public final /* synthetic */ dev.epro.r0.I16631908410500040363 g;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lt1(ads_mobile_sdk.it1 it1Var, ads_mobile_sdk.wt1 wt1Var, dev.epro.r0.I16631908410500040363 i16631908410500040363, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.e = it1Var;
        this.f = wt1Var;
        this.g = i16631908410500040363;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        switch (this.t) {
            case 0:
                return new ads_mobile_sdk.lt1(this.e, this.f, this.g, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.lt1(this.e, this.f, this.g, r4833348786910499294, (byte) 1);
            case 2:
                return new ads_mobile_sdk.lt1(this.e, this.f, this.g, r4833348786910499294, (byte) 2);
            default:
                return new ads_mobile_sdk.lt1(this.e, this.f, this.g, r4833348786910499294, (byte) 3);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
            case 1:
                return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
            case 2:
                return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
            default:
                return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014b A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #5 {all -> 0x0126, blocks: (B:80:0x0113, B:82:0x011a, B:84:0x011e, B:86:0x0122, B:89:0x0128, B:91:0x012c, B:93:0x0130, B:95:0x0134, B:96:0x0135, B:97:0x013a, B:98:0x013b, B:99:0x0142, B:100:0x0143, B:101:0x014a, B:102:0x014b), top: B:239:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b6 A[Catch: all -> 0x01c2, TryCatch #1 {all -> 0x01c2, blocks: (B:141:0x01af, B:143:0x01b6, B:145:0x01ba, B:147:0x01be, B:150:0x01c4, B:152:0x01c8, B:154:0x01cc, B:156:0x01d0, B:157:0x01d1, B:158:0x01d6, B:159:0x01d7, B:160:0x01de, B:161:0x01df, B:162:0x01e6, B:163:0x01e7), top: B:232:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e7 A[Catch: all -> 0x01c2, TRY_LEAVE, TryCatch #1 {all -> 0x01c2, blocks: (B:141:0x01af, B:143:0x01b6, B:145:0x01ba, B:147:0x01be, B:150:0x01c4, B:152:0x01c8, B:154:0x01cc, B:156:0x01d0, B:157:0x01d1, B:158:0x01d6, B:159:0x01d7, B:160:0x01de, B:161:0x01df, B:162:0x01e6, B:163:0x01e7), top: B:232:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:33:0x008e, B:35:0x0095, B:37:0x0099, B:39:0x009d, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:48:0x00af, B:49:0x00b0, B:50:0x00b5, B:51:0x00b6, B:52:0x00bd, B:53:0x00be, B:54:0x00c5, B:55:0x00c6), top: B:231:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6 A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:33:0x008e, B:35:0x0095, B:37:0x0099, B:39:0x009d, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:48:0x00af, B:49:0x00b0, B:50:0x00b5, B:51:0x00b6, B:52:0x00bd, B:53:0x00be, B:54:0x00c5, B:55:0x00c6), top: B:231:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a A[Catch: all -> 0x0126, TryCatch #5 {all -> 0x0126, blocks: (B:80:0x0113, B:82:0x011a, B:84:0x011e, B:86:0x0122, B:89:0x0128, B:91:0x012c, B:93:0x0130, B:95:0x0134, B:96:0x0135, B:97:0x013a, B:98:0x013b, B:99:0x0142, B:100:0x0143, B:101:0x014a, B:102:0x014b), top: B:239:0x0113 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lt1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
