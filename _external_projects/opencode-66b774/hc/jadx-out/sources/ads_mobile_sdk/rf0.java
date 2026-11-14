package ads_mobile_sdk;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import dev.epro.r0.C10200104071869769031;
import dev.epro.r0.F16059529287866721367;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7410747940286448830;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 {
    public static final Uri q = Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push");
    public final G8001132634698687269 a;
    public final W5797197595347441198 b;
    public final kz2 c;
    public final ci3 d;
    public final g0 e;
    public final jr0 f;
    public final rw0 g;
    public final xj h;
    public final O12043144740933444288 i;
    public final w81 j;
    public final AtomicBoolean k;
    public String l;
    public String m;
    public I16631908410500040363 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mi3 f102o;
    public String p;

    public rf0(G8001132634698687269 g8001132634698687269, W5797197595347441198 w5797197595347441198, kz2 kz2Var, ci3 ci3Var, g0 g0Var, jr0 jr0Var, rw0 rw0Var, xj xjVar, O12043144740933444288 o12043144740933444288, w81 w81Var, String str) {
        g8001132634698687269.getClass();
        w5797197595347441198.getClass();
        kz2Var.getClass();
        ci3Var.getClass();
        g0Var.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        xjVar.getClass();
        o12043144740933444288.getClass();
        w81Var.getClass();
        str.getClass();
        this.a = g8001132634698687269;
        this.b = w5797197595347441198;
        this.c = kz2Var;
        this.d = ci3Var;
        this.e = g0Var;
        this.f = jr0Var;
        this.g = rw0Var;
        this.h = xjVar;
        this.i = o12043144740933444288;
        this.j = w81Var;
        this.k = new AtomicBoolean(false);
        this.f102o = X7410747940286448830.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x032a, code lost:
    
        if (r0 == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ed, code lost:
    
        if (r0 == r4) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f8 A[Catch: all -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x00fc, blocks: (B:58:0x00f6, B:75:0x0158, B:78:0x0171, B:80:0x0175, B:100:0x01f8), top: B:227:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021a A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:108:0x0213, B:110:0x021a, B:112:0x021e, B:114:0x0222, B:117:0x0229, B:119:0x022d, B:121:0x0231, B:123:0x0235, B:124:0x0236, B:125:0x023b, B:126:0x023c, B:127:0x0243, B:128:0x0244, B:129:0x024b, B:130:0x024c), top: B:210:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024c A[Catch: all -> 0x0226, TRY_LEAVE, TryCatch #3 {all -> 0x0226, blocks: (B:108:0x0213, B:110:0x021a, B:112:0x021e, B:114:0x0222, B:117:0x0229, B:119:0x022d, B:121:0x0231, B:123:0x0235, B:124:0x0236, B:125:0x023b, B:126:0x023c, B:127:0x0243, B:128:0x0244, B:129:0x024b, B:130:0x024c), top: B:210:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0334 A[Catch: all -> 0x0099, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x0099, blocks: (B:33:0x0092, B:145:0x0294, B:148:0x02ad, B:150:0x02b1, B:170:0x0334), top: B:226:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0356 A[Catch: all -> 0x0362, TryCatch #1 {all -> 0x0362, blocks: (B:178:0x034f, B:180:0x0356, B:182:0x035a, B:184:0x035e, B:187:0x0365, B:189:0x0369, B:191:0x036d, B:193:0x0371, B:194:0x0372, B:195:0x0377, B:196:0x0378, B:197:0x037f, B:198:0x0380, B:199:0x0387, B:200:0x0388), top: B:207:0x034f }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0388 A[Catch: all -> 0x0362, TRY_LEAVE, TryCatch #1 {all -> 0x0362, blocks: (B:178:0x034f, B:180:0x0356, B:182:0x035a, B:184:0x035e, B:187:0x0365, B:189:0x0369, B:191:0x036d, B:193:0x0371, B:194:0x0372, B:195:0x0377, B:196:0x0378, B:197:0x037f, B:198:0x0380, B:199:0x0387, B:200:0x0388), top: B:207:0x034f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    /* JADX WARN: Type inference failed for: r2v0, types: [ads_mobile_sdk.ao, dev.epro.r0.F4096073349764486348] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v3, types: [dev.epro.r0.Z3437138737604933638, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v20, types: [ads_mobile_sdk.jr0, ads_mobile_sdk.yu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ads_mobile_sdk.jr0, ads_mobile_sdk.yu, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.rf0 r16, dev.epro.r0.K14749510448791472029 r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.a(ads_mobile_sdk.rf0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c2, code lost:
    
        if (r2.a(r4, r13, r6) == r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        if (r2.a(r4, r13, r6) == r1) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018a A[Catch: all -> 0x01a7, TryCatch #5 {all -> 0x01a7, blocks: (B:102:0x0184, B:104:0x018a, B:112:0x01aa, B:114:0x01ae), top: B:157:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01aa A[Catch: all -> 0x01a7, TryCatch #5 {all -> 0x01a7, blocks: (B:102:0x0184, B:104:0x018a, B:112:0x01aa, B:114:0x01ae), top: B:157:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d7 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:122:0x01d0, B:124:0x01d7, B:126:0x01db, B:128:0x01df, B:131:0x01e6, B:133:0x01ea, B:135:0x01ee, B:137:0x01f2, B:138:0x01f3, B:139:0x01f8, B:140:0x01f9, B:141:0x0200, B:142:0x0201, B:143:0x0208, B:144:0x0209), top: B:154:0x01d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0209 A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #3 {all -> 0x01e3, blocks: (B:122:0x01d0, B:124:0x01d7, B:126:0x01db, B:128:0x01df, B:131:0x01e6, B:133:0x01ea, B:135:0x01ee, B:137:0x01f2, B:138:0x01f3, B:139:0x01f8, B:140:0x01f9, B:141:0x0200, B:142:0x0201, B:143:0x0208, B:144:0x0209), top: B:154:0x01d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[Catch: all -> 0x00ea, TryCatch #7 {all -> 0x00ea, blocks: (B:45:0x00c6, B:47:0x00cc, B:55:0x00ed, B:57:0x00f1), top: B:159:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed A[Catch: all -> 0x00ea, TryCatch #7 {all -> 0x00ea, blocks: (B:45:0x00c6, B:47:0x00cc, B:55:0x00ed, B:57:0x00f1), top: B:159:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c A[Catch: all -> 0x0128, TryCatch #6 {all -> 0x0128, blocks: (B:65:0x0115, B:67:0x011c, B:69:0x0120, B:71:0x0124, B:74:0x012b, B:76:0x012f, B:78:0x0133, B:80:0x0137, B:81:0x0138, B:82:0x013d, B:83:0x013e, B:84:0x0145, B:85:0x0146, B:86:0x014d, B:87:0x014e), top: B:158:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e A[Catch: all -> 0x0128, TRY_LEAVE, TryCatch #6 {all -> 0x0128, blocks: (B:65:0x0115, B:67:0x011c, B:69:0x0120, B:71:0x0124, B:74:0x012b, B:76:0x012f, B:78:0x0133, B:80:0x0137, B:81:0x0138, B:82:0x013d, B:83:0x013e, B:84:0x0145, B:85:0x0146, B:86:0x014d, B:87:0x014e), top: B:158:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ads_mobile_sdk.rf0 r12, dev.epro.r0.K14749510448791472029 r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.b(ads_mobile_sdk.rf0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.xe0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.xe0 r0 = (ads_mobile_sdk.xe0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.xe0 r0 = new ads_mobile_sdk.xe0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            ads_mobile_sdk.rf0 r6 = r0.c
            ads_mobile_sdk.rw0 r1 = r0.b
            ads_mobile_sdk.rf0 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L61
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r7)
            ads_mobile_sdk.jr0 r7 = r6.f
            r7.getClass()
            java.lang.String r1 = "https://www.google.com/dfp/linkDevice"
            ads_mobile_sdk.ao r4 = ads_mobile_sdk.ao.a$6
            java.lang.String r5 = "gads:drx_debug:debug_device_linking_url"
            java.lang.Object r7 = r7.a(r5, r1, r4)
            java.lang.String r7 = (java.lang.String) r7
            r0.a = r6
            ads_mobile_sdk.rw0 r1 = r6.g
            r0.b = r1
            r0.c = r6
            r0.f = r2
            java.lang.String r2 = r6.l
            ads_mobile_sdk.w81 r4 = r6.j
            r4.getClass()
            java.lang.Comparable r7 = ads_mobile_sdk.w81.a(r4, r7, r2, r3, r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r0) goto L60
            return r0
        L60:
            r0 = r6
        L61:
            android.net.Uri r7 = (android.net.Uri) r7
            r6.getClass()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.VIEW"
            r2.<init>(r4, r7)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r4 = "android.support.customtabs.extra.SESSION"
            r7.putBinder(r4, r3)
            java.lang.String r6 = r6.p
            if (r6 == 0) goto L8f
            java.lang.String r3 = "com.android.browser.application_id"
            r7.putString(r3, r6)
            r2.putExtras(r7)
            r1.a(r2)
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.k
            r7 = 0
            r6.set(r7)
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        L8f:
            java.lang.String r6 = "packageName"
            dev.epro.r0.S10823041268949770285.b0(r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.c(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ea, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r7, r8, r3) == r4) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fa, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r7, r8, r3) == r4) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0218 A[Catch: all -> 0x0224, TryCatch #1 {all -> 0x0224, blocks: (B:112:0x0211, B:114:0x0218, B:116:0x021c, B:118:0x0220, B:121:0x0227, B:123:0x022b, B:125:0x022f, B:127:0x0233, B:128:0x0234, B:129:0x0239, B:130:0x023a, B:131:0x0241, B:132:0x0242, B:133:0x0249, B:134:0x024a), top: B:141:0x0211 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024a A[Catch: all -> 0x0224, TRY_LEAVE, TryCatch #1 {all -> 0x0224, blocks: (B:112:0x0211, B:114:0x0218, B:116:0x021c, B:118:0x0220, B:121:0x0227, B:123:0x022b, B:125:0x022f, B:127:0x0233, B:128:0x0234, B:129:0x0239, B:130:0x023a, B:131:0x0241, B:132:0x0242, B:133:0x0249, B:134:0x024a), top: B:141:0x0211 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a A[Catch: all -> 0x0136, TryCatch #2 {all -> 0x0136, blocks: (B:55:0x0123, B:57:0x012a, B:59:0x012e, B:61:0x0132, B:64:0x0139, B:66:0x013d, B:68:0x0141, B:70:0x0145, B:71:0x0146, B:72:0x014b, B:73:0x014c, B:74:0x0153, B:75:0x0154, B:76:0x015b, B:77:0x015c), top: B:142:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c A[Catch: all -> 0x0136, TRY_LEAVE, TryCatch #2 {all -> 0x0136, blocks: (B:55:0x0123, B:57:0x012a, B:59:0x012e, B:61:0x0132, B:64:0x0139, B:66:0x013d, B:68:0x0141, B:70:0x0145, B:71:0x0146, B:72:0x014b, B:73:0x014c, B:74:0x0153, B:75:0x0154, B:76:0x015b, B:77:0x015c), top: B:142:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.K14749510448791472029 r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.d(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0382, code lost:
    
        if (r5.c(r3) == r4) goto L189;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d1 A[Catch: all -> 0x02dd, TryCatch #16 {all -> 0x02dd, blocks: (B:119:0x02ca, B:121:0x02d1, B:123:0x02d5, B:125:0x02d9, B:128:0x02e0, B:130:0x02e4, B:132:0x02e8, B:134:0x02ec, B:135:0x02ed, B:136:0x02f2, B:137:0x02f3, B:138:0x02fa, B:139:0x02fb, B:140:0x0302, B:141:0x0303), top: B:260:0x02ca }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0303 A[Catch: all -> 0x02dd, TRY_LEAVE, TryCatch #16 {all -> 0x02dd, blocks: (B:119:0x02ca, B:121:0x02d1, B:123:0x02d5, B:125:0x02d9, B:128:0x02e0, B:130:0x02e4, B:132:0x02e8, B:134:0x02ec, B:135:0x02ed, B:136:0x02f2, B:137:0x02f3, B:138:0x02fa, B:139:0x02fb, B:140:0x0302, B:141:0x0303), top: B:260:0x02ca }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0346 A[Catch: all -> 0x0074, TryCatch #13 {all -> 0x0074, blocks: (B:18:0x0068, B:24:0x007e, B:27:0x0093, B:162:0x0369, B:164:0x0371, B:171:0x0391, B:30:0x00a7, B:156:0x033e, B:158:0x0346), top: B:253:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0371 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #13 {all -> 0x0074, blocks: (B:18:0x0068, B:24:0x007e, B:27:0x0093, B:162:0x0369, B:164:0x0371, B:171:0x0391, B:30:0x00a7, B:156:0x033e, B:158:0x0346), top: B:253:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0493 A[Catch: all -> 0x049f, TryCatch #19 {all -> 0x049f, blocks: (B:207:0x048c, B:209:0x0493, B:211:0x0497, B:213:0x049b, B:216:0x04a2, B:218:0x04a6, B:220:0x04aa, B:222:0x04ae, B:223:0x04af, B:224:0x04b4, B:225:0x04b5, B:226:0x04bc, B:227:0x04bd, B:228:0x04c4, B:229:0x04c5), top: B:265:0x048c }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04c5 A[Catch: all -> 0x049f, TRY_LEAVE, TryCatch #19 {all -> 0x049f, blocks: (B:207:0x048c, B:209:0x0493, B:211:0x0497, B:213:0x049b, B:216:0x04a2, B:218:0x04a6, B:220:0x04aa, B:222:0x04ae, B:223:0x04af, B:224:0x04b4, B:225:0x04b5, B:226:0x04bc, B:227:0x04bd, B:228:0x04c4, B:229:0x04c5), top: B:265:0x048c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181 A[Catch: all -> 0x01c3, TryCatch #3 {all -> 0x01c3, blocks: (B:72:0x01a2, B:74:0x01aa, B:84:0x01ce, B:66:0x0179, B:68:0x0181), top: B:241:0x0179 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa A[Catch: all -> 0x01c3, TRY_LEAVE, TryCatch #3 {all -> 0x01c3, blocks: (B:72:0x01a2, B:74:0x01aa, B:84:0x01ce, B:66:0x0179, B:68:0x0181), top: B:241:0x0179 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0230  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ads_mobile_sdk.th3, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.K14749510448791472029 r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.e(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static final void b(rf0 rf0Var, String str) {
        rf0Var.getClass();
        boolean zE0 = rf0Var.f.E0();
        Activity activityB = rf0Var.e.b();
        if (activityB == null) {
            return;
        }
        if (zE0) {
            byte[] bytes = str.getBytes(F16059529287866721367.a);
            bytes.getClass();
            if (bytes.length > 100000) {
                Toast.makeText(activityB, "Text too large to share, please use Copy", 1).show();
                W5797197595347441198 w5797197595347441198 = rf0Var.b;
                R4833348786910499294 r4833348786910499294 = null;
                df0 df0Var = new df0(rf0Var, r4833348786910499294, (byte) 7);
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(df0Var, r4833348786910499294, (byte) 1), 2);
                return;
            }
        }
        rf0Var.g.a(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
        if (zE0) {
            return;
        }
        rf0Var.k.set(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0216 A[Catch: all -> 0x01f0, TRY_LEAVE, TryCatch #0 {all -> 0x01f0, blocks: (B:92:0x01dd, B:94:0x01e4, B:96:0x01e8, B:98:0x01ec, B:101:0x01f3, B:103:0x01f7, B:105:0x01fb, B:107:0x01ff, B:108:0x0200, B:109:0x0205, B:110:0x0206, B:111:0x020d, B:112:0x020e, B:113:0x0215, B:114:0x0216), top: B:119:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125 A[Catch: all -> 0x0079, TryCatch #6 {all -> 0x0079, blocks: (B:86:0x01d1, B:27:0x0073, B:45:0x011f, B:47:0x0125, B:49:0x012a), top: B:129:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #6 {all -> 0x0079, blocks: (B:86:0x01d1, B:27:0x0073, B:45:0x011f, B:47:0x0125, B:49:0x012a), top: B:129:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4 A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:92:0x01dd, B:94:0x01e4, B:96:0x01e8, B:98:0x01ec, B:101:0x01f3, B:103:0x01f7, B:105:0x01fb, B:107:0x01ff, B:108:0x0200, B:109:0x0205, B:110:0x0206, B:111:0x020d, B:112:0x020e, B:113:0x0215, B:114:0x0216), top: B:119:0x01dd }] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v2, types: [ads_mobile_sdk.th3, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r13v10, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r7v12, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final String a(String str, boolean z) {
        if (str.length() != 0) {
            Pattern patternCompile = Pattern.compile("\\+");
            patternCompile.getClass();
            String strReplaceAll = patternCompile.matcher(str).replaceAll("%20");
            strReplaceAll.getClass();
            Uri uriBuild = new Uri.Builder().encodedQuery(strReplaceAll).build();
            uriBuild.getClass();
            String string = M8927913404651150384.D0(R9411874267597469228.J0(this.g.d(uriBuild).entrySet(), "\n\n", null, null, 0, new C10200104071869769031(this, z), 30)).toString();
            if (!M8927913404651150384.Y(string)) {
                return string;
            }
        }
        return "No debug information";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[PHI: r3 r5 r7
      0x0047: PHI (r3v3 ads_mobile_sdk.rf0) = (r3v0 ads_mobile_sdk.rf0), (r3v1 ads_mobile_sdk.rf0), (r3v4 ads_mobile_sdk.rf0) binds: [B:20:0x0045, B:14:0x0032, B:4:0x000b] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r5v3 android.app.Activity) = (r5v0 android.app.Activity), (r5v1 android.app.Activity), (r5v4 android.app.Activity) binds: [B:20:0x0045, B:14:0x0032, B:4:0x000b] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r7v3 ads_mobile_sdk.qf0) = (r7v0 ads_mobile_sdk.qf0), (r7v1 ads_mobile_sdk.qf0), (r7v4 ads_mobile_sdk.qf0) binds: [B:20:0x0045, B:14:0x0032, B:4:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.app.Activity r10, java.lang.String r11, ads_mobile_sdk.qf0 r12) {
        /*
            r9 = this;
            int r0 = r11.hashCode()
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            switch(r0) {
                case 48: goto L3c;
                case 49: goto L29;
                case 50: goto Lf;
                default: goto Lb;
            }
        Lb:
            r3 = r9
            r5 = r10
            r7 = r12
            goto L47
        Lf:
            java.lang.String r0 = "2"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto Lb
            r6 = 1
            r8 = 1
            java.lang.String r4 = "There was no creative pushed from DFP to the device."
            r3 = r9
            r5 = r10
            r7 = r12
            java.lang.Object r9 = a(r3, r4, r5, r6, r7, r8)
            if (r9 != r1) goto L25
            goto L26
        L25:
            r9 = r2
        L26:
            if (r9 != r1) goto L7f
            return r9
        L29:
            r3 = r9
            r5 = r10
            r7 = r12
            java.lang.String r9 = "1"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L35
            goto L47
        L35:
            java.lang.Object r9 = r3.c(r7)
            if (r9 != r1) goto L7f
            return r9
        L3c:
            r3 = r9
            r5 = r10
            r7 = r12
            java.lang.String r9 = "0"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L70
        L47:
            int r9 = r11.length()
            r10 = 50
            int r9 = java.lang.Math.min(r10, r9)
            r10 = 0
            java.lang.String r9 = r11.substring(r10, r9)
            java.lang.String r10 = "Invalid creative preview status: "
            java.lang.String r9 = r10.concat(r9)
            r10 = 0
            r11 = 6
            ads_mobile_sdk.zi3.a(r11, r9, r10)
            r6 = 0
            r8 = 10
            r4 = 0
            java.lang.Object r9 = a(r3, r4, r5, r6, r7, r8)
            if (r9 != r1) goto L6c
            goto L6d
        L6c:
            r9 = r2
        L6d:
            if (r9 != r1) goto L7f
            return r9
        L70:
            r6 = 0
            r8 = 1
            java.lang.String r4 = "The device is successfully linked for creative preview."
            java.lang.Object r9 = a(r3, r4, r5, r6, r7, r8)
            if (r9 != r1) goto L7b
            goto L7c
        L7b:
            r9 = r2
        L7c:
            if (r9 != r1) goto L7f
            return r9
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.a(android.app.Activity, java.lang.String, ads_mobile_sdk.qf0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r1.a(r0, r4) == r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0152, code lost:
    
        if (r1.a(r0, r4) == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b1 A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #10 {all -> 0x018b, blocks: (B:97:0x0178, B:99:0x017f, B:101:0x0183, B:103:0x0187, B:106:0x018e, B:108:0x0192, B:110:0x0196, B:112:0x019a, B:113:0x019b, B:114:0x01a0, B:115:0x01a1, B:116:0x01a8, B:117:0x01a9, B:118:0x01b0, B:119:0x01b1), top: B:141:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:49:0x00df, B:51:0x00e6, B:53:0x00ea, B:55:0x00ee, B:58:0x00f5, B:60:0x00f9, B:62:0x00fd, B:64:0x0101, B:65:0x0102, B:66:0x0107, B:67:0x0108, B:68:0x010f, B:69:0x0110, B:70:0x0117, B:71:0x0118), top: B:125:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118 A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #1 {all -> 0x00f2, blocks: (B:49:0x00df, B:51:0x00e6, B:53:0x00ea, B:55:0x00ee, B:58:0x00f5, B:60:0x00f9, B:62:0x00fd, B:64:0x0101, B:65:0x0102, B:66:0x0107, B:67:0x0108, B:68:0x010f, B:69:0x0110, B:70:0x0117, B:71:0x0118), top: B:125:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f A[Catch: all -> 0x018b, TryCatch #10 {all -> 0x018b, blocks: (B:97:0x0178, B:99:0x017f, B:101:0x0183, B:103:0x0187, B:106:0x018e, B:108:0x0192, B:110:0x0196, B:112:0x019a, B:113:0x019b, B:114:0x01a0, B:115:0x01a1, B:116:0x01a8, B:117:0x01a9, B:118:0x01b0, B:119:0x01b1), top: B:141:0x0178 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.rf0 r16, java.lang.String r17, java.lang.String r18, dev.epro.r0.I16631908410500040363 r19, ads_mobile_sdk.mi3 r20, dev.epro.r0.K14749510448791472029 r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.a(ads_mobile_sdk.rf0, java.lang.String, java.lang.String, dev.epro.r0.I16631908410500040363, ads_mobile_sdk.mi3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static final void a(rf0 rf0Var, String str) {
        rf0Var.getClass();
        Activity activityB = rf0Var.e.b();
        byte b = 1;
        if (activityB != null) {
            ClipboardManager clipboardManager = (ClipboardManager) activityB.getSystemService(ClipboardManager.class);
            if (clipboardManager == null) {
                Toast.makeText(activityB, "Copy failed, unable to access clipboard", 0).show();
            } else {
                try {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Ad Information", str));
                    Toast.makeText(activityB, "Copied to clipboard", 0).show();
                } catch (Throwable unused) {
                    Toast.makeText(activityB, "Copy failed, possibly due to size", 1).show();
                }
            }
        }
        W5797197595347441198 w5797197595347441198 = rf0Var.b;
        R4833348786910499294 r4833348786910499294 = null;
        df0 df0Var = new df0(rf0Var, r4833348786910499294, (byte) 8);
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(df0Var, r4833348786910499294, b), 2);
    }

    public static final void a(rf0 rf0Var, AtomicInteger atomicInteger, int i, int i2, int i3) {
        rf0Var.getClass();
        W5797197595347441198 w5797197595347441198 = rf0Var.b;
        ff0 ff0Var = new ff0(atomicInteger, i, i2, rf0Var, i3, null);
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(ff0Var, null, (byte) 1), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.app.Activity r24, dev.epro.r0.K14749510448791472029 r25) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.a(android.app.Activity, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, java.lang.String r8, android.app.Activity r9, boolean r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.nf0
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.nf0 r0 = (ads_mobile_sdk.nf0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.nf0 r0 = new ads_mobile_sdk.nf0
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2d
            ads_mobile_sdk.rf0 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r11)     // Catch: java.lang.Throwable -> L2b
            return r2
        L2b:
            r7 = move-exception
            goto L95
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r5
        L33:
            dev.epro.r0.E17665849472693074628.k(r11)
            if (r9 != 0) goto L3e
            ads_mobile_sdk.g0 r9 = r6.e     // Catch: java.lang.Throwable -> L2b
            android.app.Activity r9 = r9.b()     // Catch: java.lang.Throwable -> L2b
        L3e:
            if (r9 != 0) goto L4c
            java.lang.String r7 = "No Activity context available for showing status dialog."
            r8 = 6
            ads_mobile_sdk.zi3.a(r8, r7, r5)     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.k     // Catch: java.lang.Throwable -> L2b
            r7.set(r4)     // Catch: java.lang.Throwable -> L2b
            return r2
        L4c:
            android.app.AlertDialog$Builder r11 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L2b
            r1 = 16974374(0x1030226, float:2.4062441E-38)
            r11.<init>(r9, r1)     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L59
            java.lang.String r7 = "Error"
            goto L5b
        L59:
            java.lang.String r7 = "Info"
        L5b:
            r11.setTitle(r7)     // Catch: java.lang.Throwable -> L2b
            r11.setMessage(r8)     // Catch: java.lang.Throwable -> L2b
            dev.epro.r0.L6673764091176688892 r7 = new dev.epro.r0.L6673764091176688892     // Catch: java.lang.Throwable -> L2b
            r7.<init>(r6, r4)     // Catch: java.lang.Throwable -> L2b
            r11.setOnDismissListener(r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = "Dismiss"
            if (r10 == 0) goto L7c
            r11.setNegativeButton(r7, r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = "Learn More"
            dev.epro.r0.C10112288073830842119 r8 = new dev.epro.r0.C10112288073830842119     // Catch: java.lang.Throwable -> L2b
            r9 = 2
            r8.<init>(r6, r9)     // Catch: java.lang.Throwable -> L2b
            r11.setPositiveButton(r7, r8)     // Catch: java.lang.Throwable -> L2b
            goto L7f
        L7c:
            r11.setNeutralButton(r7, r5)     // Catch: java.lang.Throwable -> L2b
        L7f:
            dev.epro.r0.G8001132634698687269 r7 = r6.a     // Catch: java.lang.Throwable -> L2b
            ads_mobile_sdk.af0 r8 = new ads_mobile_sdk.af0     // Catch: java.lang.Throwable -> L2b
            r9 = 3
            r8.<init>(r11, r5, r9)     // Catch: java.lang.Throwable -> L2b
            r0.a = r6     // Catch: java.lang.Throwable -> L2b
            r0.d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = dev.epro.r0.R7033599853981556291.d0(r7, r8, r0)     // Catch: java.lang.Throwable -> L2b
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r7) goto L94
            return r7
        L94:
            return r2
        L95:
            ads_mobile_sdk.th3 r8 = ads_mobile_sdk.ji3.a()
            ads_mobile_sdk.cc2 r9 = r8.e()
            r9.m = r4
            r8.a(r7)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.k
            r8.set(r4)
            ads_mobile_sdk.ci3 r6 = r6.d
            java.lang.String r8 = "Failed to show status dialog"
            r6.a(r8, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf0.a(boolean, java.lang.String, android.app.Activity, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static /* synthetic */ Object a(rf0 rf0Var, String str, Activity activity, boolean z, K14749510448791472029 k14749510448791472029, int i) {
        K14749510448791472029 k147495104487914720292;
        boolean z2;
        boolean z3 = (i & 1) == 0;
        if ((i & 2) != 0) {
            str = "In-app preview failed to load because of a system error. Please try again later.";
        }
        if ((i & 4) != 0) {
            activity = null;
        }
        if ((i & 8) != 0) {
            k147495104487914720292 = k14749510448791472029;
            z2 = false;
        } else {
            k147495104487914720292 = k14749510448791472029;
            z2 = z;
        }
        return rf0Var.a(z3, str, activity, z2, k147495104487914720292);
    }
}
