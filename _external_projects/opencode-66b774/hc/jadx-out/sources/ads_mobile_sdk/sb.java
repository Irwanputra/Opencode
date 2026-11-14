package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import dev.epro.r0.D6215562826263076784;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.K3117629719891097781;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.R5692663580087387669;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X11776734143967878387;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class sb {
    public static final List A = K5751602218013079365.V("com.google.ads.mediation.admob.AdMobAdapter", "com.google.ads.mediation.admob.AdMobCustomTabsAdapter");
    public final W5797197595347441198 a;
    public final G8001132634698687269 b;
    public final Context c;
    public final X11776734143967878387 d;
    public final K3117629719891097781 e;
    public final g0 f;
    public final wj g;
    public final O16637889491137121389 h;
    public final jr0 i;
    public final kz2 j;
    public final b41 k;
    public final H15186625828076266306 l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f106o;
    public long r;
    public int s;
    public long t;
    public final H15186625828076266306 u;
    public final LinkedHashSet v;
    public final LinkedHashSet w;
    public Set x;
    public final AtomicBoolean y;
    public final R5692663580087387669 z;

    public sb(W5797197595347441198 w5797197595347441198, G8001132634698687269 g8001132634698687269, Context context, X11776734143967878387 x11776734143967878387, K3117629719891097781 k3117629719891097781, g0 g0Var, wj wjVar, O16637889491137121389 o16637889491137121389, jr0 jr0Var, kz2 kz2Var, b41 b41Var) {
        w5797197595347441198.getClass();
        g8001132634698687269.getClass();
        context.getClass();
        x11776734143967878387.getClass();
        k3117629719891097781.getClass();
        g0Var.getClass();
        wjVar.getClass();
        o16637889491137121389.getClass();
        jr0Var.getClass();
        kz2Var.getClass();
        b41Var.getClass();
        this.a = w5797197595347441198;
        this.b = g8001132634698687269;
        this.c = context;
        this.d = x11776734143967878387;
        this.e = k3117629719891097781;
        this.f = g0Var;
        this.g = wjVar;
        this.h = o16637889491137121389;
        this.i = jr0Var;
        this.j = kz2Var;
        this.k = b41Var;
        this.l = new H15186625828076266306();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.f106o = 0L;
        D6215562826263076784.i(null, null, 7);
        this.r = 0L;
        this.t = 0L;
        this.u = new H15186625828076266306();
        this.v = new LinkedHashSet();
        this.w = new LinkedHashSet();
        this.y = new AtomicBoolean(false);
        this.z = J8045362843799184672.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:312:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0230 A[Catch: all -> 0x0244, TRY_LEAVE, TryCatch #5 {all -> 0x0244, blocks: (B:105:0x022a, B:107:0x0230), top: B:272:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024f A[Catch: all -> 0x0255, TRY_LEAVE, TryCatch #12 {all -> 0x0255, blocks: (B:111:0x0248, B:113:0x024f, B:152:0x037a, B:153:0x037d), top: B:282:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0280 A[Catch: all -> 0x0125, TryCatch #6 {all -> 0x0125, blocks: (B:55:0x011b, B:145:0x0341, B:148:0x0371, B:149:0x0374, B:60:0x013a, B:128:0x02c7, B:118:0x025e, B:120:0x0280, B:121:0x0285, B:123:0x029a, B:124:0x02a0, B:92:0x01c6, B:132:0x02e4, B:133:0x02e8, B:135:0x02ee, B:138:0x02ff, B:140:0x0313), top: B:263:0x002f, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029a A[Catch: all -> 0x0125, TryCatch #6 {all -> 0x0125, blocks: (B:55:0x011b, B:145:0x0341, B:148:0x0371, B:149:0x0374, B:60:0x013a, B:128:0x02c7, B:118:0x025e, B:120:0x0280, B:121:0x0285, B:123:0x029a, B:124:0x02a0, B:92:0x01c6, B:132:0x02e4, B:133:0x02e8, B:135:0x02ee, B:138:0x02ff, B:140:0x0313), top: B:263:0x002f, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ee A[Catch: all -> 0x033d, TryCatch #17 {all -> 0x033d, blocks: (B:132:0x02e4, B:133:0x02e8, B:135:0x02ee, B:138:0x02ff, B:140:0x0313), top: B:288:0x02e4, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038b A[Catch: all -> 0x0397, TryCatch #14 {all -> 0x0397, blocks: (B:157:0x0384, B:159:0x038b, B:161:0x038f, B:163:0x0393, B:166:0x039a, B:168:0x039e, B:170:0x03a2, B:172:0x03a6, B:173:0x03a7, B:174:0x03ac, B:175:0x03ad, B:176:0x03b4, B:177:0x03b5, B:178:0x03bc, B:179:0x03bd), top: B:284:0x0384 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03bd A[Catch: all -> 0x0397, TRY_LEAVE, TryCatch #14 {all -> 0x0397, blocks: (B:157:0x0384, B:159:0x038b, B:161:0x038f, B:163:0x0393, B:166:0x039a, B:168:0x039e, B:170:0x03a2, B:172:0x03a6, B:173:0x03a7, B:174:0x03ac, B:175:0x03ad, B:176:0x03b4, B:177:0x03b5, B:178:0x03bc, B:179:0x03bd), top: B:284:0x0384 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f4 A[Catch: all -> 0x0408, TRY_LEAVE, TryCatch #8 {all -> 0x0408, blocks: (B:189:0x03ea, B:191:0x03f4), top: B:276:0x03ea, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0413 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:13:0x004c, B:226:0x0506, B:229:0x0536, B:230:0x0539, B:16:0x0068, B:209:0x0488, B:199:0x041d, B:201:0x043f, B:202:0x0444, B:204:0x045a, B:205:0x0460, B:48:0x00f6, B:195:0x040c, B:197:0x0413, B:232:0x053d, B:233:0x0540, B:213:0x04a5, B:214:0x04a9, B:216:0x04af, B:219:0x04c0, B:221:0x04d4, B:189:0x03ea, B:191:0x03f4), top: B:263:0x002f, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x043f A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:13:0x004c, B:226:0x0506, B:229:0x0536, B:230:0x0539, B:16:0x0068, B:209:0x0488, B:199:0x041d, B:201:0x043f, B:202:0x0444, B:204:0x045a, B:205:0x0460, B:48:0x00f6, B:195:0x040c, B:197:0x0413, B:232:0x053d, B:233:0x0540, B:213:0x04a5, B:214:0x04a9, B:216:0x04af, B:219:0x04c0, B:221:0x04d4, B:189:0x03ea, B:191:0x03f4), top: B:263:0x002f, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x045a A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:13:0x004c, B:226:0x0506, B:229:0x0536, B:230:0x0539, B:16:0x0068, B:209:0x0488, B:199:0x041d, B:201:0x043f, B:202:0x0444, B:204:0x045a, B:205:0x0460, B:48:0x00f6, B:195:0x040c, B:197:0x0413, B:232:0x053d, B:233:0x0540, B:213:0x04a5, B:214:0x04a9, B:216:0x04af, B:219:0x04c0, B:221:0x04d4, B:189:0x03ea, B:191:0x03f4), top: B:263:0x002f, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04af A[Catch: all -> 0x0502, TryCatch #4 {all -> 0x0502, blocks: (B:213:0x04a5, B:214:0x04a9, B:216:0x04af, B:219:0x04c0, B:221:0x04d4), top: B:270:0x04a5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x054b A[Catch: all -> 0x0557, TryCatch #16 {all -> 0x0557, blocks: (B:236:0x0544, B:238:0x054b, B:240:0x054f, B:242:0x0553, B:245:0x055a, B:247:0x055e, B:249:0x0562, B:251:0x0566, B:252:0x0567, B:253:0x056c, B:254:0x056d, B:255:0x0574, B:256:0x0575, B:257:0x057c, B:258:0x057d), top: B:287:0x0544 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x057d A[Catch: all -> 0x0557, TRY_LEAVE, TryCatch #16 {all -> 0x0557, blocks: (B:236:0x0544, B:238:0x054b, B:240:0x054f, B:242:0x0553, B:245:0x055a, B:247:0x055e, B:249:0x0562, B:251:0x0566, B:252:0x0567, B:253:0x056c, B:254:0x056d, B:255:0x0574, B:256:0x0575, B:257:0x057c, B:258:0x057d), top: B:287:0x0544 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r12v11, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r12v12, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v9, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.sb r25, dev.epro.r0.K14749510448791472029 r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cf, code lost:
    
        if (dev.epro.r0.O8620973563946607355.N((java.util.List) r0, r2) == r14) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179 A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #1 {all -> 0x01a5, blocks: (B:61:0x016b, B:63:0x0179), top: B:82:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0167 -> B:82:0x016b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a$1(ads_mobile_sdk.sb r17, java.util.Set r18, dev.epro.r0.K14749510448791472029 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a$1(ads_mobile_sdk.sb, java.util.Set, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:25:0x0073, B:27:0x0077, B:30:0x007f), top: B:55:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2 A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:38:0x00a6, B:39:0x00ac, B:41:0x00b2, B:43:0x00b8, B:46:0x00d1, B:47:0x00d6, B:48:0x00d7), top: B:57:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.sb r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.b(ads_mobile_sdk.sb, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.rb
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.rb r0 = (ads_mobile_sdk.rb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.rb r0 = new ads_mobile_sdk.rb
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.sb r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            r9 = r8
            r8 = r0
            goto L46
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r8
            dev.epro.r0.H15186625828076266306 r9 = r8.l
            r0.b = r9
            r0.e = r2
            java.lang.Object r0 = r9.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            int r0 = r8.s     // Catch: java.lang.Throwable -> L6a
            if (r0 != r2) goto L6c
            long r0 = r8.r     // Catch: java.lang.Throwable -> L6a
            dev.epro.r0.E17149812035295265804 r2 = dev.epro.r0.E17093345031926825464.b     // Catch: java.lang.Throwable -> L6a
            dev.epro.r0.O16637889491137121389 r2 = r8.h     // Catch: java.lang.Throwable -> L6a
            r2.getClass()     // Catch: java.lang.Throwable -> L6a
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6a
            dev.epro.r0.N13798149404328803870 r2 = dev.epro.r0.N13798149404328803870.MILLISECONDS     // Catch: java.lang.Throwable -> L6a
            long r4 = dev.epro.r0.M9216324016624295870.a0(r4, r2)     // Catch: java.lang.Throwable -> L6a
            long r6 = r8.t     // Catch: java.lang.Throwable -> L6a
            long r4 = dev.epro.r0.E17093345031926825464.g(r4, r6)     // Catch: java.lang.Throwable -> L6a
            long r0 = dev.epro.r0.E17093345031926825464.h(r0, r4)     // Catch: java.lang.Throwable -> L6a
            r8.r = r0     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r8 = move-exception
            goto L78
        L6c:
            int r0 = r8.s     // Catch: java.lang.Throwable -> L6a
            int r0 = r0 + (-1)
            r8.s = r0     // Catch: java.lang.Throwable -> L6a
            r9.b(r3)
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            return r8
        L78:
            r9.b(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a$1(ads_mobile_sdk.sb r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.ya
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.ya r0 = (ads_mobile_sdk.ya) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ya r0 = new ads_mobile_sdk.ya
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.sb r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.l
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            java.util.LinkedHashMap r4 = r4.m     // Catch: java.lang.Throwable -> L50
            java.util.Map r4 = dev.epro.r0.E4951175994894594588.z0(r4)     // Catch: java.lang.Throwable -> L50
            r5.b(r3)
            return r4
        L50:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a$1(ads_mobile_sdk.sb, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0211 A[Catch: all -> 0x0219, TryCatch #4 {all -> 0x0219, blocks: (B:117:0x0277, B:120:0x0280, B:122:0x0284, B:118:0x027c, B:119:0x027f, B:99:0x020b, B:101:0x0211, B:104:0x021d, B:106:0x0221, B:110:0x0240, B:112:0x024a, B:116:0x0250), top: B:161:0x020b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0221 A[Catch: all -> 0x0219, TRY_LEAVE, TryCatch #4 {all -> 0x0219, blocks: (B:117:0x0277, B:120:0x0280, B:122:0x0284, B:118:0x027c, B:119:0x027f, B:99:0x020b, B:101:0x0211, B:104:0x021d, B:106:0x0221, B:110:0x0240, B:112:0x024a, B:116:0x0250), top: B:161:0x020b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024a A[Catch: all -> 0x024d, TryCatch #6 {all -> 0x024d, blocks: (B:110:0x0240, B:112:0x024a, B:116:0x0250), top: B:163:0x0240, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0284 A[Catch: all -> 0x0219, TRY_LEAVE, TryCatch #4 {all -> 0x0219, blocks: (B:117:0x0277, B:120:0x0280, B:122:0x0284, B:118:0x027c, B:119:0x027f, B:99:0x020b, B:101:0x0211, B:104:0x021d, B:106:0x0221, B:110:0x0240, B:112:0x024a, B:116:0x0250), top: B:161:0x020b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029a A[Catch: all -> 0x02a6, TryCatch #2 {all -> 0x02a6, blocks: (B:128:0x0293, B:130:0x029a, B:132:0x029e, B:134:0x02a2, B:137:0x02a9, B:139:0x02ad, B:141:0x02b1, B:143:0x02b5, B:144:0x02b6, B:145:0x02bb, B:146:0x02bc, B:147:0x02c3, B:148:0x02c4, B:149:0x02cb, B:150:0x02cc), top: B:159:0x0293 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cc A[Catch: all -> 0x02a6, TRY_LEAVE, TryCatch #2 {all -> 0x02a6, blocks: (B:128:0x0293, B:130:0x029a, B:132:0x029e, B:134:0x02a2, B:137:0x02a9, B:139:0x02ad, B:141:0x02b1, B:143:0x02b5, B:144:0x02b6, B:145:0x02bb, B:146:0x02bc, B:147:0x02c3, B:148:0x02c4, B:149:0x02cb, B:150:0x02cc), top: B:159:0x0293 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106 A[Catch: all -> 0x007b, TryCatch #5 {all -> 0x007b, blocks: (B:26:0x0075, B:56:0x0168, B:59:0x0171, B:61:0x0175, B:57:0x016d, B:58:0x0170, B:31:0x0086, B:40:0x0100, B:42:0x0106, B:43:0x010d, B:45:0x0111, B:49:0x0131, B:51:0x013b, B:55:0x0141), top: B:162:0x0030, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #5 {all -> 0x007b, blocks: (B:26:0x0075, B:56:0x0168, B:59:0x0171, B:61:0x0175, B:57:0x016d, B:58:0x0170, B:31:0x0086, B:40:0x0100, B:42:0x0106, B:43:0x010d, B:45:0x0111, B:49:0x0131, B:51:0x013b, B:55:0x0141), top: B:162:0x0030, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b A[Catch: all -> 0x013e, TryCatch #8 {all -> 0x013e, blocks: (B:49:0x0131, B:51:0x013b, B:55:0x0141), top: B:166:0x0131, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #5 {all -> 0x007b, blocks: (B:26:0x0075, B:56:0x0168, B:59:0x0171, B:61:0x0175, B:57:0x016d, B:58:0x0170, B:31:0x0086, B:40:0x0100, B:42:0x0106, B:43:0x010d, B:45:0x0111, B:49:0x0131, B:51:0x013b, B:55:0x0141), top: B:162:0x0030, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v9, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r18v1, types: [dev.epro.r0.E2617735461520075070] */
    /* JADX WARN: Type inference failed for: r18v2, types: [dev.epro.r0.E2617735461520075070] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.sb r16, java.lang.String r17, ads_mobile_sdk.oa r18, long r19, dev.epro.r0.K14749510448791472029 r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, java.lang.String, ads_mobile_sdk.oa, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final long a() {
        int i = this.s;
        long jH = this.r;
        if (i != 0) {
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            this.h.getClass();
            jH = E17093345031926825464.h(jH, E17093345031926825464.g(M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS), this.t));
        }
        return E17093345031926825464.e(jH);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
    
        if (r4.b(r3) != r11) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.sb r18, java.lang.String r19, ads_mobile_sdk.oa r20, dev.epro.r0.K14749510448791472029 r21) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, java.lang.String, ads_mobile_sdk.oa, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [dev.epro.r0.B10755433227221787048, dev.epro.r0.H15186625828076266306, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r22v0, types: [dev.epro.r0.Q16898486116126855517, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7, types: [dev.epro.r0.H15186625828076266306] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.Q16898486116126855517 r22, java.lang.String r23, ads_mobile_sdk.oa r24, dev.epro.r0.K14749510448791472029 r25) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(dev.epro.r0.Q16898486116126855517, java.lang.String, ads_mobile_sdk.oa, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.sb r3, dev.epro.r0.U4857089234315512256 r4, java.lang.String r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r5 = r6 instanceof ads_mobile_sdk.mb
            if (r5 == 0) goto L13
            r5 = r6
            ads_mobile_sdk.mb r5 = (ads_mobile_sdk.mb) r5
            int r0 = r5.g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.g = r0
            goto L18
        L13:
            ads_mobile_sdk.mb r5 = new ads_mobile_sdk.mb
            r5.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r5.e
            int r0 = r5.g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L30
            if (r0 != r1) goto L2a
            dev.epro.r0.H15186625828076266306 r3 = r5.d
            dev.epro.r0.U4857089234315512256 r4 = r5.b
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L44
        L2a:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r3)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            dev.epro.r0.H15186625828076266306 r3 = r3.u
            r5.b = r4
            r5.d = r3
            r5.g = r1
            java.lang.Object r5 = r3.c(r5)
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r6) goto L44
            return r6
        L44:
            r4.getClass()     // Catch: java.lang.Throwable -> L4d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4d
            r3.b(r2)
            return r4
        L4d:
            r4 = move-exception
            r3.b(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, dev.epro.r0.U4857089234315512256, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.sb r4, dev.epro.r0.A10855252310988578378 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.pb
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.pb r0 = (ads_mobile_sdk.pb) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.pb r0 = new ads_mobile_sdk.pb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.c
            ads_mobile_sdk.sb r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            r6 = r4
            r4 = r5
            goto L48
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r6)
            dev.epro.r0.H15186625828076266306 r6 = r4.l
            r0.a = r4
            r0.b = r5
            r0.c = r6
            r0.f = r2
            java.lang.Object r5 = r6.c(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L48
            return r0
        L48:
            r4.getClass()     // Catch: java.lang.Throwable -> L67
            dev.epro.r0.E17149812035295265804 r5 = dev.epro.r0.E17093345031926825464.b     // Catch: java.lang.Throwable -> L67
            dev.epro.r0.O16637889491137121389 r5 = r4.h     // Catch: java.lang.Throwable -> L67
            r5.getClass()     // Catch: java.lang.Throwable -> L67
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L67
            dev.epro.r0.N13798149404328803870 r5 = dev.epro.r0.N13798149404328803870.MILLISECONDS     // Catch: java.lang.Throwable -> L67
            long r0 = dev.epro.r0.M9216324016624295870.a0(r0, r5)     // Catch: java.lang.Throwable -> L67
            long r4 = r4.f106o     // Catch: java.lang.Throwable -> L67
            dev.epro.r0.E17093345031926825464.g(r0, r4)     // Catch: java.lang.Throwable -> L67
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L67
            r6.b(r3)
            return r4
        L67:
            r4 = move-exception
            r6.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, dev.epro.r0.A10855252310988578378, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.qb
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.qb r0 = (ads_mobile_sdk.qb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.qb r0 = new ads_mobile_sdk.qb
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r6 = r0.b
            ads_mobile_sdk.sb r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            r7 = r6
            r6 = r0
            goto L46
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.a = r6
            dev.epro.r0.H15186625828076266306 r7 = r6.l
            r0.b = r7
            r0.e = r2
            java.lang.Object r0 = r7.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            int r0 = r6.s     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L6c
            long r0 = r6.t     // Catch: java.lang.Throwable -> L59
            r4 = 0
            boolean r0 = dev.epro.r0.E17093345031926825464.d(r0, r4)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5b
            long r0 = r6.f106o     // Catch: java.lang.Throwable -> L59
            r6.t = r0     // Catch: java.lang.Throwable -> L59
            goto L6c
        L59:
            r6 = move-exception
            goto L77
        L5b:
            dev.epro.r0.O16637889491137121389 r0 = r6.h     // Catch: java.lang.Throwable -> L59
            r0.getClass()     // Catch: java.lang.Throwable -> L59
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L59
            dev.epro.r0.N13798149404328803870 r4 = dev.epro.r0.N13798149404328803870.MILLISECONDS     // Catch: java.lang.Throwable -> L59
            long r0 = dev.epro.r0.M9216324016624295870.a0(r0, r4)     // Catch: java.lang.Throwable -> L59
            r6.t = r0     // Catch: java.lang.Throwable -> L59
        L6c:
            int r0 = r6.s     // Catch: java.lang.Throwable -> L59
            int r0 = r0 + r2
            r6.s = r0     // Catch: java.lang.Throwable -> L59
            r7.b(r3)
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        L77:
            r7.b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
