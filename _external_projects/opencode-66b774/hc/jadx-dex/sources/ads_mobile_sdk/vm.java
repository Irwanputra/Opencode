package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class vm extends ads_mobile_sdk.e2 implements dev.epro.r0.B11821434880939062972 {
    public final dev.epro.r0.V2597580950516131749 l;
    public final ads_mobile_sdk.x60 m;
    public final ads_mobile_sdk.sp3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dev.epro.r0.W5797197595347441198 f116o;
    public final ads_mobile_sdk.p01 p;
    public final ads_mobile_sdk.ri q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.x60 x60Var, ads_mobile_sdk.sp3 sp3Var, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.p01 p01Var, ads_mobile_sdk.ri riVar, ads_mobile_sdk.mi3 mi3Var, dev.epro.r0.U4857089234315512256 u4857089234315512256, ads_mobile_sdk.qw2 qw2Var, long j, int i, ads_mobile_sdk.z1 z1Var, ads_mobile_sdk.hv hvVar, ads_mobile_sdk.d33 d33Var, java.lang.String str, ads_mobile_sdk.eg2 eg2Var, ads_mobile_sdk.m31 m31Var) {
        super(mi3Var, u4857089234315512256, qw2Var, j, i, z1Var, hvVar, d33Var, str, eg2Var, m31Var);
        v2597580950516131749.getClass();
        this.l = v2597580950516131749;
        this.m = x60Var;
        this.n = sp3Var;
        this.f116o = w5797197595347441198;
        this.p = p01Var;
        this.q = riVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cd A[Catch: all -> 0x02d9, TryCatch #6 {all -> 0x02d9, blocks: (B:106:0x02c6, B:108:0x02cd, B:110:0x02d1, B:112:0x02d5, B:115:0x02dc, B:117:0x02e0, B:119:0x02e4, B:121:0x02e8, B:122:0x02e9, B:123:0x02ee, B:124:0x02ef, B:125:0x02f6, B:126:0x02f7, B:127:0x02fe, B:128:0x02ff), top: B:174:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ff A[Catch: all -> 0x02d9, TRY_LEAVE, TryCatch #6 {all -> 0x02d9, blocks: (B:106:0x02c6, B:108:0x02cd, B:110:0x02d1, B:112:0x02d5, B:115:0x02dc, B:117:0x02e0, B:119:0x02e4, B:121:0x02e8, B:122:0x02e9, B:123:0x02ee, B:124:0x02ef, B:125:0x02f6, B:126:0x02f7, B:127:0x02fe, B:128:0x02ff), top: B:174:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030f A[Catch: all -> 0x031b, TryCatch #7 {all -> 0x031b, blocks: (B:135:0x0308, B:137:0x030f, B:139:0x0313, B:141:0x0317, B:144:0x031e, B:146:0x0322, B:148:0x0326, B:150:0x032a, B:151:0x032b, B:152:0x0330, B:153:0x0331, B:154:0x0338, B:155:0x0339, B:156:0x0340, B:157:0x0341), top: B:175:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0341 A[Catch: all -> 0x031b, TRY_LEAVE, TryCatch #7 {all -> 0x031b, blocks: (B:135:0x0308, B:137:0x030f, B:139:0x0313, B:141:0x0317, B:144:0x031e, B:146:0x0322, B:148:0x0326, B:150:0x032a, B:151:0x032b, B:152:0x0330, B:153:0x0331, B:154:0x0338, B:155:0x0339, B:156:0x0340, B:157:0x0341), top: B:175:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:23:0x00c8, B:33:0x010d, B:35:0x0113), top: B:162:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0275 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #4 {all -> 0x0063, blocks: (B:15:0x0055, B:92:0x026f, B:94:0x0275), top: B:170:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0283  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v15, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v29, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v33, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.vm r23, dev.epro.r0.K14749510448791472029 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vm.a(ads_mobile_sdk.vm, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean b() {
        ads_mobile_sdk.k61 k61Var = this.f.I;
        if ((k61Var != null ? k61Var.a : null) == null) {
            return (k61Var != null ? k61Var.b : null) != null;
        }
        return true;
    }

    public /* synthetic */ vm(dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.x60 x60Var, ads_mobile_sdk.sp3 sp3Var, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.p01 p01Var, ads_mobile_sdk.ri riVar, ads_mobile_sdk.mi3 mi3Var, dev.epro.r0.U4857089234315512256 u4857089234315512256, ads_mobile_sdk.qw2 qw2Var, long j, int i, ads_mobile_sdk.z1 z1Var, ads_mobile_sdk.hv hvVar, ads_mobile_sdk.d33 d33Var, java.lang.String str, ads_mobile_sdk.eg2 eg2Var) {
        this(v2597580950516131749, x60Var, sp3Var, w5797197595347441198, p01Var, riVar, mi3Var, u4857089234315512256, qw2Var, j, i, z1Var, hvVar, d33Var, str, eg2Var, new ads_mobile_sdk.m31());
    }

    @Override // ads_mobile_sdk.e2
    public final java.lang.Object a(boolean z, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        return a(this, (dev.epro.r0.K14749510448791472029) r4833348786910499294);
    }

    @Override // dev.epro.r0.B11821434880939062972
    public final ads_mobile_sdk.ri a() {
        return this.q;
    }
}
