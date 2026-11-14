package ads_mobile_sdk;

import dev.epro.r0.B11821434880939062972;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class vm extends e2 implements B11821434880939062972 {
    public final V2597580950516131749 l;
    public final x60 m;
    public final sp3 n;

    /* renamed from: o, reason: collision with root package name */
    public final W5797197595347441198 f116o;
    public final p01 p;
    public final ri q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(V2597580950516131749 v2597580950516131749, x60 x60Var, sp3 sp3Var, W5797197595347441198 w5797197595347441198, p01 p01Var, ri riVar, mi3 mi3Var, U4857089234315512256 u4857089234315512256, qw2 qw2Var, long j, int i, z1 z1Var, hv hvVar, d33 d33Var, String str, eg2 eg2Var, m31 m31Var) {
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
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030f A[Catch: all -> 0x031b, TryCatch #7 {all -> 0x031b, blocks: (B:130:0x0308, B:132:0x030f, B:134:0x0313, B:136:0x0317, B:137:0x031e, B:139:0x0322, B:141:0x0326, B:143:0x032a, B:144:0x032b, B:145:0x0330, B:146:0x0331, B:147:0x0338, B:148:0x0339, B:149:0x0340, B:150:0x0341), top: B:129:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0341 A[Catch: all -> 0x031b, TRY_LEAVE, TryCatch #7 {all -> 0x031b, blocks: (B:130:0x0308, B:132:0x030f, B:134:0x0313, B:136:0x0317, B:137:0x031e, B:139:0x0322, B:141:0x0326, B:143:0x032a, B:144:0x032b, B:145:0x0330, B:146:0x0331, B:147:0x0338, B:148:0x0339, B:149:0x0340, B:150:0x0341), top: B:129:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0275 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #4 {all -> 0x0063, blocks: (B:17:0x0055, B:19:0x026f, B:21:0x0275), top: B:16:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02cd A[Catch: all -> 0x02d9, TryCatch #6 {all -> 0x02d9, blocks: (B:32:0x02c6, B:34:0x02cd, B:36:0x02d1, B:38:0x02d5, B:39:0x02dc, B:41:0x02e0, B:43:0x02e4, B:45:0x02e8, B:46:0x02e9, B:47:0x02ee, B:48:0x02ef, B:49:0x02f6, B:50:0x02f7, B:51:0x02fe, B:52:0x02ff), top: B:31:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ff A[Catch: all -> 0x02d9, TRY_LEAVE, TryCatch #6 {all -> 0x02d9, blocks: (B:32:0x02c6, B:34:0x02cd, B:36:0x02d1, B:38:0x02d5, B:39:0x02dc, B:41:0x02e0, B:43:0x02e4, B:45:0x02e8, B:46:0x02e9, B:47:0x02ee, B:48:0x02ef, B:49:0x02f6, B:50:0x02f7, B:51:0x02fe, B:52:0x02ff), top: B:31:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:89:0x00c8, B:91:0x010d, B:93:0x0113), top: B:88:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r1v32, types: [dev.epro.r0.G5167407908812687496, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v4, types: [ads_mobile_sdk.th3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v11, types: [ads_mobile_sdk.yu, dev.epro.r0.E14305960139410517149] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v29, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v33, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [dev.epro.r0.C9731525580007922156] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ads_mobile_sdk.nh0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [dev.epro.r0.V3131360009326842010] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.vm r23, dev.epro.r0.K14749510448791472029 r24) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vm.a(ads_mobile_sdk.vm, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.U10184268024341301528
    public final boolean b() {
        k61 k61Var = this.f.I;
        if ((k61Var != null ? k61Var.a : null) == null) {
            return (k61Var != null ? k61Var.b : null) != null;
        }
        return true;
    }

    public /* synthetic */ vm(V2597580950516131749 v2597580950516131749, x60 x60Var, sp3 sp3Var, W5797197595347441198 w5797197595347441198, p01 p01Var, ri riVar, mi3 mi3Var, U4857089234315512256 u4857089234315512256, qw2 qw2Var, long j, int i, z1 z1Var, hv hvVar, d33 d33Var, String str, eg2 eg2Var) {
        this(v2597580950516131749, x60Var, sp3Var, w5797197595347441198, p01Var, riVar, mi3Var, u4857089234315512256, qw2Var, j, i, z1Var, hvVar, d33Var, str, eg2Var, new m31());
    }

    @Override // ads_mobile_sdk.e2
    public final Object a(boolean z, R4833348786910499294 r4833348786910499294) {
        return a(this, (K14749510448791472029) r4833348786910499294);
    }

    @Override // dev.epro.r0.B11821434880939062972
    public final ri a() {
        return this.q;
    }
}
