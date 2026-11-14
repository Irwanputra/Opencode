package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B11821434880939062972;
import dev.epro.r0.G16864365537574524285;
import dev.epro.r0.S17468460685202108735;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class hl extends e2 implements B11821434880939062972 {
    public final Context l;
    public final V2597580950516131749 m;
    public final x60 n;

    /* renamed from: o, reason: collision with root package name */
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0304, code lost:
    
        if (r1.a(r2, r9) != r15) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016f A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:96:0x00e6, B:98:0x0169, B:100:0x016f), top: B:95:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x036b A[Catch: all -> 0x0377, TryCatch #3 {all -> 0x0377, blocks: (B:118:0x0364, B:120:0x036b, B:122:0x036f, B:124:0x0373, B:125:0x037a, B:127:0x037e, B:129:0x0382, B:131:0x0386, B:132:0x0387, B:133:0x038c, B:134:0x038d, B:135:0x0394, B:136:0x0395, B:137:0x039c, B:138:0x039d), top: B:117:0x0364 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039d A[Catch: all -> 0x0377, TRY_LEAVE, TryCatch #3 {all -> 0x0377, blocks: (B:118:0x0364, B:120:0x036b, B:122:0x036f, B:124:0x0373, B:125:0x037a, B:127:0x037e, B:129:0x0382, B:131:0x0386, B:132:0x0387, B:133:0x038c, B:134:0x038d, B:135:0x0394, B:136:0x0395, B:137:0x039c, B:138:0x039d), top: B:117:0x0364 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02aa A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #5 {all -> 0x007d, blocks: (B:25:0x006e, B:27:0x02a4, B:29:0x02aa), top: B:24:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0329 A[Catch: all -> 0x0335, TryCatch #2 {all -> 0x0335, blocks: (B:39:0x0322, B:41:0x0329, B:43:0x032d, B:45:0x0331, B:46:0x0338, B:48:0x033c, B:50:0x0340, B:52:0x0344, B:53:0x0345, B:54:0x034a, B:55:0x034b, B:56:0x0352, B:57:0x0353, B:58:0x035a, B:59:0x035b), top: B:38:0x0322 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x035b A[Catch: all -> 0x0335, TRY_LEAVE, TryCatch #2 {all -> 0x0335, blocks: (B:39:0x0322, B:41:0x0329, B:43:0x032d, B:45:0x0331, B:46:0x0338, B:48:0x033c, B:50:0x0340, B:52:0x0344, B:53:0x0345, B:54:0x034a, B:55:0x034b, B:56:0x0352, B:57:0x0353, B:58:0x035a, B:59:0x035b), top: B:38:0x0322 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r20v5, types: [dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ads_mobile_sdk.th3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v36, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v41, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r5v11, types: [ads_mobile_sdk.yu, dev.epro.r0.E14305960139410517149] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [dev.epro.r0.C9731525580007922156] */
    /* JADX WARN: Type inference failed for: r6v5, types: [ads_mobile_sdk.nh0] */
    @Override // ads_mobile_sdk.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r23, dev.epro.r0.R4833348786910499294 r24) {
        /*
            Method dump skipped, instructions count: 952
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
