package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B11821434880939062972;
import dev.epro.r0.G16864365537574524285;
import dev.epro.r0.S17468460685202108735;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class hl extends e2 implements B11821434880939062972 {
    public final Context l;
    public final V2597580950516131749 m;
    public final x60 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sp3 f48o;
    public final G16864365537574524285 p;
    public final W5797197595347441198 q;
    public final p01 r;
    public final ri s;
    public final S17468460685202108735 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(Context context, bb0 bb0Var, x60 x60Var, sp3 sp3Var, G16864365537574524285 g16864365537574524285, W5797197595347441198 w5797197595347441198, p01 p01Var, ri riVar, mi3 mi3Var, U4857089234315512256 u4857089234315512256, qw2 qw2Var, long j, int i, z1 z1Var, hv hvVar, d33 d33Var, String str, S17468460685202108735 s17468460685202108735, dm dmVar) {
        super(mi3Var, u4857089234315512256, qw2Var, j, i, z1Var, hvVar, d33Var, str, (eg2) dmVar.get());
        context.getClass();
        bb0Var.getClass();
        x60Var.getClass();
        sp3Var.getClass();
        g16864365537574524285.getClass();
        w5797197595347441198.getClass();
        p01Var.getClass();
        riVar.getClass();
        mi3Var.getClass();
        u4857089234315512256.getClass();
        qw2Var.getClass();
        z1Var.getClass();
        hvVar.getClass();
        d33Var.getClass();
        str.getClass();
        s17468460685202108735.getClass();
        this.l = context;
        this.m = bb0Var;
        this.n = x60Var;
        this.f48o = sp3Var;
        this.p = g16864365537574524285;
        this.q = w5797197595347441198;
        this.r = p01Var;
        this.s = riVar;
        this.t = s17468460685202108735;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0304, code lost:
    
        if (r1.a(r2, r9) != r15) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0329 A[Catch: all -> 0x0335, TryCatch #2 {all -> 0x0335, blocks: (B:108:0x0322, B:110:0x0329, B:112:0x032d, B:114:0x0331, B:117:0x0338, B:119:0x033c, B:121:0x0340, B:123:0x0344, B:124:0x0345, B:125:0x034a, B:126:0x034b, B:127:0x0352, B:128:0x0353, B:129:0x035a, B:130:0x035b), top: B:168:0x0322 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x035b A[Catch: all -> 0x0335, TRY_LEAVE, TryCatch #2 {all -> 0x0335, blocks: (B:108:0x0322, B:110:0x0329, B:112:0x032d, B:114:0x0331, B:117:0x0338, B:119:0x033c, B:121:0x0340, B:123:0x0344, B:124:0x0345, B:125:0x034a, B:126:0x034b, B:127:0x0352, B:128:0x0353, B:129:0x035a, B:130:0x035b), top: B:168:0x0322 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036b A[Catch: all -> 0x0377, TryCatch #3 {all -> 0x0377, blocks: (B:137:0x0364, B:139:0x036b, B:141:0x036f, B:143:0x0373, B:146:0x037a, B:148:0x037e, B:150:0x0382, B:152:0x0386, B:153:0x0387, B:154:0x038c, B:155:0x038d, B:156:0x0394, B:157:0x0395, B:158:0x039c, B:159:0x039d), top: B:169:0x0364 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x039d A[Catch: all -> 0x0377, TRY_LEAVE, TryCatch #3 {all -> 0x0377, blocks: (B:137:0x0364, B:139:0x036b, B:141:0x036f, B:143:0x0373, B:146:0x037a, B:148:0x037e, B:150:0x0382, B:152:0x0386, B:153:0x0387, B:154:0x038c, B:155:0x038d, B:156:0x0394, B:157:0x0395, B:158:0x039c, B:159:0x039d), top: B:169:0x0364 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:24:0x00e6, B:47:0x0169, B:49:0x016f), top: B:164:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02aa A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #5 {all -> 0x007d, blocks: (B:16:0x006e, B:87:0x02a4, B:89:0x02aa), top: B:172:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b8  */
    /* JADX WARN: Type inference failed for: r20v5, types: [dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v22, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v36, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v41, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v11, types: [ads_mobile_sdk.yu, dev.epro.r0.E14305960139410517149] */
    /* JADX WARN: Type inference failed for: r5v28, types: [ads_mobile_sdk.k90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [dev.epro.r0.C9731525580007922156] */
    @Override // ads_mobile_sdk.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r23, dev.epro.r0.R4833348786910499294 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hl.a(boolean, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.U10184268024341301528
    public final boolean b() {
        k61 k61Var = this.f.I;
        if ((k61Var != null ? k61Var.a : null) == null) {
            return (k61Var != null ? k61Var.b : null) != null;
        }
        return true;
    }

    @Override // dev.epro.r0.B11821434880939062972
    public final ri a() {
        return this.s;
    }
}
