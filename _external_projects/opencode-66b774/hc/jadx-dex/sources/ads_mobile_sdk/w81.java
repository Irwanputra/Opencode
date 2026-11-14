package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class w81 extends ads_mobile_sdk.c61 {
    public static final dev.epro.r0.C13799120990122180696 N = new dev.epro.r0.C13799120990122180696(4, "Ad inspector cannot be opened because it is already open.");
    public static final dev.epro.r0.C13799120990122180696 O = new dev.epro.r0.C13799120990122180696(2, "Ad inspector failed to load.");
    public static final dev.epro.r0.C13799120990122180696 P = new dev.epro.r0.C13799120990122180696(1, "Ad inspector had an internal error.");
    public static final dev.epro.r0.C13799120990122180696 Q = new dev.epro.r0.C13799120990122180696(3, "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
    public static final dev.epro.r0.C13799120990122180696 R = new dev.epro.r0.C13799120990122180696(5, "Ad inspector cannot be opened because it is disabled in the AndroidManifest.xml.");
    public dev.epro.r0.I16631908410500040363 A;
    public dev.epro.r0.I16631908410500040363 B;
    public ads_mobile_sdk.p71 C;
    public final dev.epro.r0.H15186625828076266306 D;
    public long E;
    public final java.util.LinkedHashMap F;
    public final java.util.LinkedHashMap G;
    public final dev.epro.r0.H15186625828076266306 H;
    public java.lang.ref.WeakReference I;
    public final java.util.concurrent.atomic.AtomicBoolean J;
    public final java.util.concurrent.atomic.AtomicBoolean K;
    public final java.util.concurrent.atomic.AtomicBoolean L;
    public java.lang.Boolean M;
    public final android.content.Context c;
    public final dev.epro.r0.W5797197595347441198 d;
    public final java.lang.String e;
    public final dev.epro.r0.V2597580950516131749 f;
    public final dev.epro.r0.V2597580950516131749 g;
    public final dev.epro.r0.F14240031463097426304 h;
    public final ads_mobile_sdk.jr0 i;
    public final dev.epro.r0.O16637889491137121389 j;
    public final dev.epro.r0.O12043144740933444288 k;
    public final ads_mobile_sdk.da1 l;
    public final ads_mobile_sdk.mg m;
    public final ads_mobile_sdk.wj n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ads_mobile_sdk.u91 f121o;
    public final ads_mobile_sdk.sp3 p;
    public final ads_mobile_sdk.kz2 q;
    public final ads_mobile_sdk.sv2 r;
    public final dev.epro.r0.V2597580950516131749 s;
    public final ads_mobile_sdk.g71 t;
    public final ads_mobile_sdk.fz u;
    public final ads_mobile_sdk.ri v;
    public final ads_mobile_sdk.b41 w;
    public final dev.epro.r0.H15186625828076266306 x;
    public ads_mobile_sdk.ba1 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w81(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, java.lang.String str, dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, dev.epro.r0.F14240031463097426304 f14240031463097426304, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, dev.epro.r0.O12043144740933444288 o12043144740933444288, ads_mobile_sdk.da1 da1Var, ads_mobile_sdk.mg mgVar, ads_mobile_sdk.wj wjVar, ads_mobile_sdk.u91 u91Var, ads_mobile_sdk.sp3 sp3Var, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.sv2 sv2Var, dev.epro.r0.V2597580950516131749 v25975809505161317493, ads_mobile_sdk.g71 g71Var, ads_mobile_sdk.fz fzVar, ads_mobile_sdk.ri riVar, ads_mobile_sdk.b41 b41Var) {
        super(ads_mobile_sdk.wv0.CUI_NAME_SDKINIT_INIT_AD_INSPECTOR, false);
        context.getClass();
        w5797197595347441198.getClass();
        str.getClass();
        v2597580950516131749.getClass();
        v25975809505161317492.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        o12043144740933444288.getClass();
        da1Var.getClass();
        mgVar.getClass();
        wjVar.getClass();
        u91Var.getClass();
        sp3Var.getClass();
        kz2Var.getClass();
        sv2Var.getClass();
        g71Var.getClass();
        fzVar.getClass();
        riVar.getClass();
        b41Var.getClass();
        this.c = context;
        this.d = w5797197595347441198;
        this.e = str;
        this.f = v2597580950516131749;
        this.g = v25975809505161317492;
        this.h = f14240031463097426304;
        this.i = jr0Var;
        this.j = o16637889491137121389;
        this.k = o12043144740933444288;
        this.l = da1Var;
        this.m = mgVar;
        this.n = wjVar;
        this.f121o = u91Var;
        this.p = sp3Var;
        this.q = kz2Var;
        this.r = sv2Var;
        this.s = v25975809505161317493;
        this.t = g71Var;
        this.u = fzVar;
        this.v = riVar;
        this.w = b41Var;
        this.x = new dev.epro.r0.H15186625828076266306();
        this.A = new dev.epro.r0.I16631908410500040363();
        this.B = new dev.epro.r0.I16631908410500040363();
        this.C = ads_mobile_sdk.p71.a;
        this.D = new dev.epro.r0.H15186625828076266306();
        this.F = new java.util.LinkedHashMap();
        this.G = new java.util.LinkedHashMap();
        this.H = new dev.epro.r0.H15186625828076266306();
        this.I = new java.lang.ref.WeakReference(null);
        this.J = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.K = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.L = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0582, code lost:
    
        if (r3 == r10) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x08b2, code lost:
    
        if (r3 == r10) goto L289;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0496 A[Catch: all -> 0x05a3, TRY_LEAVE, TryCatch #2 {all -> 0x05a3, blocks: (B:138:0x052e, B:140:0x0534, B:144:0x0567, B:120:0x0490, B:122:0x0496, B:128:0x04cd, B:130:0x04d1, B:162:0x05a7, B:163:0x05ac), top: B:357:0x0490 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04cd A[Catch: all -> 0x05a3, TRY_ENTER, TryCatch #2 {all -> 0x05a3, blocks: (B:138:0x052e, B:140:0x0534, B:144:0x0567, B:120:0x0490, B:122:0x0496, B:128:0x04cd, B:130:0x04d1, B:162:0x05a7, B:163:0x05ac), top: B:357:0x0490 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0534 A[Catch: all -> 0x05a3, TRY_LEAVE, TryCatch #2 {all -> 0x05a3, blocks: (B:138:0x052e, B:140:0x0534, B:144:0x0567, B:120:0x0490, B:122:0x0496, B:128:0x04cd, B:130:0x04d1, B:162:0x05a7, B:163:0x05ac), top: B:357:0x0490 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0567 A[Catch: all -> 0x05a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x05a3, blocks: (B:138:0x052e, B:140:0x0534, B:144:0x0567, B:120:0x0490, B:122:0x0496, B:128:0x04cd, B:130:0x04d1, B:162:0x05a7, B:163:0x05ac), top: B:357:0x0490 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05d5 A[Catch: all -> 0x05e1, TryCatch #0 {all -> 0x05e1, blocks: (B:183:0x05ce, B:185:0x05d5, B:187:0x05d9, B:189:0x05dd, B:192:0x05e4, B:194:0x05e8, B:196:0x05ec, B:198:0x05f0, B:199:0x05f1, B:200:0x05f6, B:201:0x05f7, B:202:0x05fe, B:203:0x05ff, B:204:0x0606, B:205:0x0607), top: B:354:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0607 A[Catch: all -> 0x05e1, TRY_LEAVE, TryCatch #0 {all -> 0x05e1, blocks: (B:183:0x05ce, B:185:0x05d5, B:187:0x05d9, B:189:0x05dd, B:192:0x05e4, B:194:0x05e8, B:196:0x05ec, B:198:0x05f0, B:199:0x05f1, B:200:0x05f6, B:201:0x05f7, B:202:0x05fe, B:203:0x05ff, B:204:0x0606, B:205:0x0607), top: B:354:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0646 A[Catch: all -> 0x08f1, TRY_LEAVE, TryCatch #9 {all -> 0x08f1, blocks: (B:217:0x0641, B:219:0x0646, B:222:0x0675, B:322:0x08f7, B:323:0x08fa, B:215:0x063a), top: B:363:0x063a, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0675 A[Catch: all -> 0x08f1, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x08f1, blocks: (B:217:0x0641, B:219:0x0646, B:222:0x0675, B:322:0x08f7, B:323:0x08fa, B:215:0x063a), top: B:363:0x063a, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06a3 A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #13 {all -> 0x00f7, blocks: (B:27:0x00e6, B:252:0x0782, B:32:0x0110, B:243:0x0726, B:312:0x08e4, B:313:0x08e7, B:35:0x0139, B:228:0x069e, B:230:0x06a3, B:233:0x06d2, B:235:0x06da, B:238:0x0709, B:315:0x08e9, B:316:0x08ed, B:38:0x0165, B:241:0x0723, B:226:0x0699), top: B:358:0x0043, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06d2 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #13 {all -> 0x00f7, blocks: (B:27:0x00e6, B:252:0x0782, B:32:0x0110, B:243:0x0726, B:312:0x08e4, B:313:0x08e7, B:35:0x0139, B:228:0x069e, B:230:0x06a3, B:233:0x06d2, B:235:0x06da, B:238:0x0709, B:315:0x08e9, B:316:0x08ed, B:38:0x0165, B:241:0x0723, B:226:0x0699), top: B:358:0x0043, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07c0 A[Catch: all -> 0x08c6, TRY_LEAVE, TryCatch #18 {all -> 0x08c6, blocks: (B:290:0x08b5, B:292:0x08bd, B:261:0x07ba, B:263:0x07c0, B:269:0x07f8, B:271:0x07fc, B:304:0x08d5, B:305:0x08da), top: B:375:0x07ba }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x07f8 A[Catch: all -> 0x08c6, TRY_ENTER, TryCatch #18 {all -> 0x08c6, blocks: (B:290:0x08b5, B:292:0x08bd, B:261:0x07ba, B:263:0x07c0, B:269:0x07f8, B:271:0x07fc, B:304:0x08d5, B:305:0x08da), top: B:375:0x07ba }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0860 A[Catch: all -> 0x08cf, TRY_LEAVE, TryCatch #23 {all -> 0x08cf, blocks: (B:279:0x085a, B:281:0x0860, B:287:0x0897), top: B:381:0x085a }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0897 A[Catch: all -> 0x08cf, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x08cf, blocks: (B:279:0x085a, B:281:0x0860, B:287:0x0897), top: B:381:0x085a }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0906 A[Catch: all -> 0x0912, TryCatch #24 {all -> 0x0912, blocks: (B:327:0x08ff, B:329:0x0906, B:331:0x090a, B:333:0x090e, B:336:0x0915, B:338:0x0919, B:340:0x091d, B:342:0x0921, B:343:0x0922, B:344:0x0927, B:345:0x0928, B:346:0x092f, B:347:0x0930, B:348:0x0937, B:349:0x0938), top: B:382:0x08ff }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0938 A[Catch: all -> 0x0912, TRY_LEAVE, TryCatch #24 {all -> 0x0912, blocks: (B:327:0x08ff, B:329:0x0906, B:331:0x090a, B:333:0x090e, B:336:0x0915, B:338:0x0919, B:340:0x091d, B:342:0x0921, B:343:0x0922, B:344:0x0927, B:345:0x0928, B:346:0x092f, B:347:0x0930, B:348:0x0937, B:349:0x0938), top: B:382:0x08ff }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031c A[Catch: all -> 0x05c0, TRY_LEAVE, TryCatch #16 {all -> 0x05c0, blocks: (B:75:0x0317, B:77:0x031c, B:81:0x0351, B:178:0x05c6, B:179:0x05c9, B:73:0x0312), top: B:373:0x0312, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0378 A[Catch: all -> 0x022e, TRY_LEAVE, TryCatch #7 {all -> 0x022e, blocks: (B:53:0x0218, B:58:0x0247, B:102:0x03fe, B:168:0x05b3, B:169:0x05b6, B:61:0x0270, B:87:0x0373, B:89:0x0378, B:92:0x03a9, B:94:0x03b1, B:97:0x03e2, B:171:0x05b8, B:172:0x05bc, B:64:0x029f, B:100:0x03fb, B:85:0x036e), top: B:358:0x0043, inners: #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a9 A[Catch: all -> 0x022e, TRY_ENTER, TryCatch #7 {all -> 0x022e, blocks: (B:53:0x0218, B:58:0x0247, B:102:0x03fe, B:168:0x05b3, B:169:0x05b6, B:61:0x0270, B:87:0x0373, B:89:0x0378, B:92:0x03a9, B:94:0x03b1, B:97:0x03e2, B:171:0x05b8, B:172:0x05bc, B:64:0x029f, B:100:0x03fb, B:85:0x036e), top: B:358:0x0043, inners: #8, #12 }] */
    /* JADX WARN: Type inference failed for: r0v140 */
    /* JADX WARN: Type inference failed for: r0v144, types: [dev.epro.r0.V3805393212198381221, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150, types: [dev.epro.r0.V3805393212198381221, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v184 */
    /* JADX WARN: Type inference failed for: r0v185 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v67, types: [dev.epro.r0.V3805393212198381221, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72, types: [dev.epro.r0.V3805393212198381221, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v23, types: [ads_mobile_sdk.p71] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v49, types: [dev.epro.r0.V3805393212198381221, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27, types: [ads_mobile_sdk.p71] */
    /* JADX WARN: Type inference failed for: r12v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v13, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [dev.epro.r0.R8015591507171738907, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v50, types: [dev.epro.r0.R8015591507171738907, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v75, types: [dev.epro.r0.R8015591507171738907, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84, types: [dev.epro.r0.R8015591507171738907, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v87, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [dev.epro.r0.V3805393212198381221, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v41, types: [dev.epro.r0.V3805393212198381221, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [ads_mobile_sdk.em2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v113 */
    /* JADX WARN: Type inference failed for: r3v114 */
    /* JADX WARN: Type inference failed for: r3v115 */
    /* JADX WARN: Type inference failed for: r3v116 */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v119 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [dev.epro.r0.V3805393212198381221, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [ads_mobile_sdk.u91] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v90, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v98, types: [ads_mobile_sdk.u91] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [dev.epro.r0.V3805393212198381221] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78, types: [dev.epro.r0.V3805393212198381221] */
    /* JADX WARN: Type inference failed for: r5v80 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r29, ads_mobile_sdk.p71 r30, dev.epro.r0.V3805393212198381221 r31, dev.epro.r0.K14749510448791472029 r32) {
        /*
            Method dump skipped, instruction units count: 2406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, ads_mobile_sdk.p71, dev.epro.r0.V3805393212198381221, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:39:0x00b5, B:43:0x00bf, B:46:0x00c5, B:50:0x00cd, B:52:0x00d1, B:54:0x00d7, B:56:0x00db, B:57:0x00e3, B:58:0x00e6, B:59:0x00e7, B:60:0x00ea, B:61:0x00eb, B:63:0x00f1), top: B:75:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:39:0x00b5, B:43:0x00bf, B:46:0x00c5, B:50:0x00cd, B:52:0x00d1, B:54:0x00d7, B:56:0x00db, B:57:0x00e3, B:58:0x00e6, B:59:0x00e7, B:60:0x00ea, B:61:0x00eb, B:63:0x00f1), top: B:75:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r0v0, types: [ads_mobile_sdk.w81] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ads_mobile_sdk.w81] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r18v0, types: [ads_mobile_sdk.w81] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ads_mobile_sdk.w81] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ads_mobile_sdk.w81] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.w81 r18, boolean r19, dev.epro.r0.K14749510448791472029 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.b(ads_mobile_sdk.w81, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(ads_mobile_sdk.w81 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.m81
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.m81 r0 = (ads_mobile_sdk.m81) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.m81 r0 = new ads_mobile_sdk.m81
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ads_mobile_sdk.w81 r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L3e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r4.v(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L3e
            return r0
        L3e:
            dev.epro.r0.W5797197595347441198 r5 = r4.d
            dev.epro.r0.N12893830608069839869 r0 = new dev.epro.r0.N12893830608069839869
            r1 = 2
            r0.<init>(r4, r2, r1)
            r5.getClass()
            dev.epro.r0.P7598478828797568949 r4 = new dev.epro.r0.P7598478828797568949
            r4.<init>(r0, r2, r3)
            dev.epro.r0.I3826119971291161142 r0 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.R7033599853981556291.E(r5, r0, r2, r4, r1)
            ads_mobile_sdk.xu0 r4 = new ads_mobile_sdk.xu0
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.e(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void c() {
        dev.epro.r0.M16184408391440927034 qu0Var;
        if (this.z) {
            return;
        }
        ((ads_mobile_sdk.b43) this.f.get()).i = this;
        ads_mobile_sdk.nr0 nr0Var = (ads_mobile_sdk.nr0) this.g.get();
        nr0Var.getClass();
        nr0Var.m = this;
        this.z = true;
        ads_mobile_sdk.ba1 ba1Var = this.y;
        android.graphics.drawable.Drawable applicationIcon = null;
        if (ba1Var == null) {
            dev.epro.r0.S10823041268949770285.b0("storedInspectorSettings");
            throw null;
        }
        a(ba1Var.r$2());
        ads_mobile_sdk.mg mgVar = this.m;
        android.content.pm.ApplicationInfo applicationInfo = mgVar.c;
        java.util.concurrent.atomic.AtomicReference atomicReference = mgVar.d;
        android.content.Context context = mgVar.a;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        try {
            i16631908410500040363.t("name", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(applicationInfo.packageName, 0)).toString());
            i16631908410500040363.t("packageName", applicationInfo.packageName);
            dev.epro.r0.V10300877997588547986 v10300877997588547986A = mgVar.b.a();
            java.lang.String strEncodeToString = "";
            i16631908410500040363.t("adMobAppId", v10300877997588547986A != null ? (java.lang.String) v10300877997588547986A.b : "");
            java.lang.CharSequence charSequence = (java.lang.CharSequence) atomicReference.get();
            if (charSequence == null || dev.epro.r0.M8927913404651150384.Y(charSequence)) {
                try {
                    android.content.pm.ApplicationInfo applicationInfo2 = context.getPackageManager().getApplicationInfo(context.getApplicationInfo().packageName, 0);
                    applicationInfo2.getClass();
                    applicationIcon = context.getPackageManager().getApplicationIcon(applicationInfo2);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                if (applicationIcon != null) {
                    applicationIcon.setBounds(0, 0, 256, 256);
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(256, 256, android.graphics.Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    applicationIcon.draw(new android.graphics.Canvas(bitmapCreateBitmap));
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    bitmapCreateBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    strEncodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                }
                atomicReference.set(strEncodeToString);
            }
            java.lang.CharSequence charSequence2 = (java.lang.CharSequence) atomicReference.get();
            if (charSequence2 != null && !dev.epro.r0.M8927913404651150384.Y(charSequence2)) {
                i16631908410500040363.t("icon", (java.lang.String) atomicReference.get());
                i16631908410500040363.s("iconWidthPx", 256);
                i16631908410500040363.s("iconHeightPx", 256);
            }
            qu0Var = new ads_mobile_sdk.xu0(i16631908410500040363);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            qu0Var = new ads_mobile_sdk.qu0(e, 0, null, 6);
        }
        if (qu0Var instanceof ads_mobile_sdk.xu0) {
            this.B = (dev.epro.r0.I16631908410500040363) ((ads_mobile_sdk.xu0) qu0Var).b;
        }
    }

    public final boolean d() {
        boolean zBooleanValue;
        android.content.pm.PackageManager packageManager;
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        ads_mobile_sdk.jr0 jr0Var = this.i;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:inspector:disable_ad_inspector_from_manifest_enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            java.lang.Boolean bool = this.M;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                try {
                    packageManager = this.c.getPackageManager();
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                zBooleanValue = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.c.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) ? false : bundle.getBoolean("com.google.android.libraries.ads.mobile.sdk.flag.DISABLE_AD_INSPECTOR", false);
                this.M = java.lang.Boolean.valueOf(zBooleanValue);
            }
        } else {
            zBooleanValue = false;
        }
        ads_mobile_sdk.ba1 ba1Var = this.y;
        if (ba1Var == null) {
            dev.epro.r0.S10823041268949770285.b0("storedInspectorSettings");
            throw null;
        }
        boolean zS = ba1Var.s();
        boolean z = zBooleanValue && !zS;
        if (zBooleanValue) {
            if (zS) {
                if (this.L.compareAndSet(false, true)) {
                    ads_mobile_sdk.kz2 kz2Var = this.q;
                    ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_AD_INSPECTOR_GLOBAL_ALLOWLIST_OVERRIDE;
                    ads_mobile_sdk.mi3 mi3Var = new ads_mobile_sdk.mi3(new ads_mobile_sdk.ur2(), new ads_mobile_sdk.fh1(), new ads_mobile_sdk.tu2(), new ads_mobile_sdk.s8());
                    if (ads_mobile_sdk.ji3.b().a == null) {
                        ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var).close();
                    } else {
                        ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true).close();
                    }
                }
            } else if (this.K.compareAndSet(false, true)) {
                ads_mobile_sdk.kz2 kz2Var2 = this.q;
                ads_mobile_sdk.wv0 wv0Var2 = ads_mobile_sdk.wv0.CUI_NAME_AD_INSPECTOR_DISABLED;
                ads_mobile_sdk.mi3 mi3Var2 = new ads_mobile_sdk.mi3(new ads_mobile_sdk.ur2(), new ads_mobile_sdk.fh1(), new ads_mobile_sdk.tu2(), new ads_mobile_sdk.s8());
                if (ads_mobile_sdk.ji3.b().a == null) {
                    ads_mobile_sdk.kz2.a(kz2Var2, wv0Var2, o2161699089510411363, mi3Var2).close();
                } else {
                    ads_mobile_sdk.ji3.a(wv0Var2, o2161699089510411363, true).close();
                }
            }
        }
        if (z) {
            this.J.compareAndSet(false, true);
        }
        return z;
    }

    public final boolean g() {
        if (d()) {
            return false;
        }
        ads_mobile_sdk.ba1 ba1Var = this.y;
        if (ba1Var == null) {
            dev.epro.r0.S10823041268949770285.b0("storedInspectorSettings");
            throw null;
        }
        if (ba1Var.u()) {
            return true;
        }
        ads_mobile_sdk.ba1 ba1Var2 = this.y;
        if (ba1Var2 == null) {
            dev.epro.r0.S10823041268949770285.b0("storedInspectorSettings");
            throw null;
        }
        if (!ba1Var2.t()) {
            return false;
        }
        ads_mobile_sdk.jr0 jr0Var = this.i;
        jr0Var.getClass();
        return ((java.lang.Boolean) jr0Var.a("gads:inspector:linked_device_enable_inspector", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue();
    }

    @Override // ads_mobile_sdk.c61
    public final java.lang.Object h(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        return e(this, (dev.epro.r0.K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(dev.epro.r0.K14749510448791472029 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.v71
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.v71 r0 = (ads_mobile_sdk.v71) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.v71 r0 = new ads_mobile_sdk.v71
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2c:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.c = r2
            java.lang.String r5 = r4.b()
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = "{}"
            boolean r4 = dev.epro.r0.S10823041268949770285.t(r5, r4)
            if (r4 == 0) goto L47
            java.lang.String r4 = ""
            return r4
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.r(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098 A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #1 {all -> 0x005b, blocks: (B:22:0x0057, B:34:0x008f, B:37:0x0098, B:39:0x00a0, B:50:0x00dd, B:51:0x00e0, B:52:0x00e1, B:53:0x00e4, B:31:0x0082), top: B:59:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:22:0x0057, B:34:0x008f, B:37:0x0098, B:39:0x00a0, B:50:0x00dd, B:51:0x00e0, B:52:0x00e1, B:53:0x00e4, B:31:0x0082), top: B:59:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v9, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.s(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x022e, code lost:
    
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x046b A[Catch: all -> 0x007a, TryCatch #6 {all -> 0x007a, blocks: (B:13:0x0064, B:137:0x048a, B:139:0x0491, B:141:0x049a, B:145:0x04a8, B:155:0x04da, B:156:0x04df, B:148:0x04b4, B:149:0x04b8, B:150:0x04b9, B:152:0x04cc, B:153:0x04d4, B:132:0x0458, B:134:0x046b, B:135:0x0473, B:21:0x00ae, B:25:0x00e7, B:104:0x0379, B:81:0x0312, B:83:0x031a, B:98:0x0339, B:100:0x033d, B:160:0x051a, B:161:0x051e, B:94:0x032f, B:162:0x051f, B:163:0x0525), top: B:180:0x002b, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x048a A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #6 {all -> 0x007a, blocks: (B:13:0x0064, B:137:0x048a, B:139:0x0491, B:141:0x049a, B:145:0x04a8, B:155:0x04da, B:156:0x04df, B:148:0x04b4, B:149:0x04b8, B:150:0x04b9, B:152:0x04cc, B:153:0x04d4, B:132:0x0458, B:134:0x046b, B:135:0x0473, B:21:0x00ae, B:25:0x00e7, B:104:0x0379, B:81:0x0312, B:83:0x031a, B:98:0x0339, B:100:0x033d, B:160:0x051a, B:161:0x051e, B:94:0x032f, B:162:0x051f, B:163:0x0525), top: B:180:0x002b, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x049a A[Catch: all -> 0x007a, Exception -> 0x04b2, TryCatch #9 {Exception -> 0x04b2, blocks: (B:139:0x0491, B:141:0x049a, B:145:0x04a8, B:148:0x04b4, B:149:0x04b8), top: B:183:0x0491, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b4 A[Catch: all -> 0x007a, Exception -> 0x04b2, TryCatch #9 {Exception -> 0x04b2, blocks: (B:139:0x0491, B:141:0x049a, B:145:0x04a8, B:148:0x04b4, B:149:0x04b8), top: B:183:0x0491, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x051f A[Catch: all -> 0x007a, TryCatch #6 {all -> 0x007a, blocks: (B:13:0x0064, B:137:0x048a, B:139:0x0491, B:141:0x049a, B:145:0x04a8, B:155:0x04da, B:156:0x04df, B:148:0x04b4, B:149:0x04b8, B:150:0x04b9, B:152:0x04cc, B:153:0x04d4, B:132:0x0458, B:134:0x046b, B:135:0x0473, B:21:0x00ae, B:25:0x00e7, B:104:0x0379, B:81:0x0312, B:83:0x031a, B:98:0x0339, B:100:0x033d, B:160:0x051a, B:161:0x051e, B:94:0x032f, B:162:0x051f, B:163:0x0525), top: B:180:0x002b, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031a A[Catch: all -> 0x007a, TryCatch #6 {all -> 0x007a, blocks: (B:13:0x0064, B:137:0x048a, B:139:0x0491, B:141:0x049a, B:145:0x04a8, B:155:0x04da, B:156:0x04df, B:148:0x04b4, B:149:0x04b8, B:150:0x04b9, B:152:0x04cc, B:153:0x04d4, B:132:0x0458, B:134:0x046b, B:135:0x0473, B:21:0x00ae, B:25:0x00e7, B:104:0x0379, B:81:0x0312, B:83:0x031a, B:98:0x0339, B:100:0x033d, B:160:0x051a, B:161:0x051e, B:94:0x032f, B:162:0x051f, B:163:0x0525), top: B:180:0x002b, inners: #9 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0274 -> B:69:0x027c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x02a8 -> B:75:0x02ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(dev.epro.r0.K14749510448791472029 r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.t(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x003a, B:21:0x004c, B:25:0x005c, B:38:0x00a6, B:40:0x00aa, B:41:0x00b1, B:43:0x00c3, B:45:0x00c9, B:34:0x0088), top: B:69:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x003a, B:21:0x004c, B:25:0x005c, B:38:0x00a6, B:40:0x00aa, B:41:0x00b1, B:43:0x00c3, B:45:0x00c9, B:34:0x0088), top: B:69:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:58:0x012a, B:51:0x00f7, B:53:0x00fb, B:55:0x0108, B:61:0x0130, B:62:0x0133, B:47:0x00ed, B:65:0x0136, B:66:0x013a), top: B:69:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #1 {all -> 0x0134, blocks: (B:58:0x012a, B:51:0x00f7, B:53:0x00fb, B:55:0x0108, B:61:0x0130, B:62:0x0133, B:47:0x00ed, B:65:0x0136, B:66:0x013a), top: B:69:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:58:0x012a, B:51:0x00f7, B:53:0x00fb, B:55:0x0108, B:61:0x0130, B:62:0x0133, B:47:0x00ed, B:65:0x0136, B:66:0x013a), top: B:69:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v3, types: [dev.epro.r0.R8015591507171738907, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(dev.epro.r0.K14749510448791472029 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.u(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {all -> 0x007d, blocks: (B:27:0x0070, B:29:0x0074), top: B:55:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #1 {all -> 0x009f, blocks: (B:42:0x0095, B:44:0x009b), top: B:57:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(dev.epro.r0.K14749510448791472029 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.b81
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.b81 r0 = (ads_mobile_sdk.b81) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.b81 r0 = new ads_mobile_sdk.b81
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L49
            if (r1 == r5) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L35
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L95
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r6
        L3b:
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.w81 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L70
        L43:
            ads_mobile_sdk.w81 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L57
        L49:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r8
            r0.e = r5
            java.lang.Object r9 = r8.u(r0)
            if (r9 != r7) goto L57
            goto L93
        L57:
            ads_mobile_sdk.jr0 r9 = r8.i
            boolean r9 = r9.a0()
            if (r9 == 0) goto Lad
            dev.epro.r0.H15186625828076266306 r9 = r8.x
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r7) goto L6e
            goto L93
        L6e:
            r1 = r8
            r8 = r9
        L70:
            boolean r9 = r1.z     // Catch: java.lang.Throwable -> L7d
            if (r9 != 0) goto L7f
            boolean r9 = r1.d()     // Catch: java.lang.Throwable -> L7d
            if (r9 == 0) goto L7b
            goto L7f
        L7b:
            r5 = 0
            goto L7f
        L7d:
            r9 = move-exception
            goto La9
        L7f:
            r8.b(r6)
            if (r5 == 0) goto L85
            goto Lad
        L85:
            dev.epro.r0.H15186625828076266306 r8 = r1.x
            r0.a = r1
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r7) goto L94
        L93:
            return r7
        L94:
            r0 = r1
        L95:
            boolean r9 = r0.g()     // Catch: java.lang.Throwable -> L9f
            if (r9 == 0) goto La1
            r0.c()     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r9 = move-exception
            goto La5
        La1:
            r8.b(r6)
            return r2
        La5:
            r8.b(r6)
            throw r9
        La9:
            r8.b(r6)
            throw r9
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.v(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r7.f(r0) == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.w81 r7, dev.epro.r0.K14749510448791472029 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.c81
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.c81 r0 = (ads_mobile_sdk.c81) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.c81 r0 = new ads_mobile_sdk.c81
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.a
            dev.epro.r0.R8015591507171738907 r7 = (dev.epro.r0.R8015591507171738907) r7
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6f
        L2f:
            r8 = move-exception
            goto L75
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L37:
            dev.epro.r0.H15186625828076266306 r7 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.w81 r1 = (ads_mobile_sdk.w81) r1
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r7
            r7 = r1
            goto L55
        L43:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.H15186625828076266306 r8 = r7.H
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r5) goto L55
            goto L6b
        L55:
            java.lang.ref.WeakReference r7 = r7.I     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.s91 r7 = (ads_mobile_sdk.s91) r7     // Catch: java.lang.Throwable -> L6c
            if (r7 == 0) goto L6e
            r0.a = r8     // Catch: java.lang.Throwable -> L6c
            r0.b = r4     // Catch: java.lang.Throwable -> L6c
            r0.e = r2     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r7.f(r0)     // Catch: java.lang.Throwable -> L6c
            if (r7 != r5) goto L6e
        L6b:
            return r5
        L6c:
            r7 = move-exception
            goto L78
        L6e:
            r7 = r8
        L6f:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L2f
            r7.b(r4)
            return r8
        L75:
            r6 = r8
            r8 = r7
            r7 = r6
        L78:
            r8.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.d(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.w81 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.z71
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.z71 r0 = (ads_mobile_sdk.z71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.z71 r0 = new ads_mobile_sdk.z71
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
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
            dev.epro.r0.H15186625828076266306 r5 = r4.x
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            boolean r4 = r4.d()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L52
            r5.b(r3)
            return r4
        L52:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.c(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.w81 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.y71
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.y71 r0 = (ads_mobile_sdk.y71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.y71 r0 = new ads_mobile_sdk.y71
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
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
            dev.epro.r0.H15186625828076266306 r5 = r4.x
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.ba1 r4 = r4.y     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L4e
            r5.b(r3)
            return r4
        L4e:
            java.lang.String r4 = "storedInspectorSettings"
            dev.epro.r0.S10823041268949770285.b0(r4)     // Catch: java.lang.Throwable -> L54
            throw r3     // Catch: java.lang.Throwable -> L54
        L54:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.b(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final java.lang.String b() {
        if (!g()) {
            return "{}";
        }
        ads_mobile_sdk.ba1 ba1Var = this.y;
        if (ba1Var != null) {
            if (ba1Var.w() > 0) {
                ads_mobile_sdk.ba1 ba1Var2 = this.y;
                if (ba1Var2 == null) {
                    dev.epro.r0.S10823041268949770285.b0("storedInspectorSettings");
                    throw null;
                }
                long jW = ba1Var2.w();
                this.j.getClass();
                if (jW < java.lang.System.currentTimeMillis() / 1000) {
                    dev.epro.r0.R7033599853981556291.E(this.d, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.S14769385926647291222(this, (dev.epro.r0.R4833348786910499294) null, (byte) 11), 3);
                    return "{}";
                }
            }
            ads_mobile_sdk.ba1 ba1Var3 = this.y;
            if (ba1Var3 == null) {
                dev.epro.r0.S10823041268949770285.b0("storedInspectorSettings");
                throw null;
            }
            java.lang.String strV = ba1Var3.v();
            strV.getClass();
            return strV;
        }
        dev.epro.r0.S10823041268949770285.b0("storedInspectorSettings");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v8, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.w81 r16, java.lang.String r17, dev.epro.r0.R4833348786910499294 r18) {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof ads_mobile_sdk.t81
            if (r2 == 0) goto L18
            r2 = r1
            ads_mobile_sdk.t81 r2 = (ads_mobile_sdk.t81) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f = r3
        L16:
            r13 = r2
            goto L1e
        L18:
            ads_mobile_sdk.t81 r2 = new ads_mobile_sdk.t81
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r13.d
            int r2 = r13.f
            r3 = 2
            r4 = 1
            r15 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L38
            java.lang.Object r0 = r13.a
            r2 = r0
            dev.epro.r0.R8015591507171738907 r2 = (dev.epro.r0.R8015591507171738907) r2
            dev.epro.r0.E17665849472693074628.k(r1)     // Catch: java.lang.Throwable -> L36
            goto L81
        L36:
            r0 = move-exception
            goto L87
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r15
        L3e:
            dev.epro.r0.H15186625828076266306 r0 = r13.c
            java.lang.String r2 = r13.b
            java.lang.Object r4 = r13.a
            ads_mobile_sdk.w81 r4 = (ads_mobile_sdk.w81) r4
            dev.epro.r0.E17665849472693074628.k(r1)
            r11 = r2
            r2 = r0
            r0 = r4
            goto L66
        L4d:
            dev.epro.r0.E17665849472693074628.k(r1)
            dev.epro.r0.H15186625828076266306 r1 = r0.x
            r13.a = r0
            r2 = r17
            r13.b = r2
            r13.c = r1
            r13.f = r4
            java.lang.Object r4 = r1.c(r13)
            if (r4 != r5) goto L64
            r1 = r5
            goto L80
        L64:
            r11 = r2
            r2 = r1
        L66:
            r13.a = r2     // Catch: java.lang.Throwable -> L36
            r13.b = r15     // Catch: java.lang.Throwable -> L36
            r13.c = r15     // Catch: java.lang.Throwable -> L36
            r13.f = r3     // Catch: java.lang.Throwable -> L36
            r6 = 0
            r4 = 0
            r1 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 383(0x17f, float:5.37E-43)
            r3 = r0
            java.lang.Object r0 = a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L36
            if (r0 != r1) goto L81
        L80:
            return r1
        L81:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L36
            r2.b(r15)
            return r0
        L87:
            r2.b(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.b(ads_mobile_sdk.w81, java.lang.String, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Comparable a(ads_mobile_sdk.w81 r5, java.lang.String r6, java.lang.String r7, dev.epro.r0.I16631908410500040363 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.r71
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.r71 r0 = (ads_mobile_sdk.r71) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            ads_mobile_sdk.r71 r0 = new ads_mobile_sdk.r71
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.h
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L38
            android.net.Uri$Builder r5 = r0.g
            java.lang.String r6 = r0.f
            android.net.Uri$Builder r7 = r0.e
            android.net.Uri$Builder r8 = r0.d
            dev.epro.r0.I16631908410500040363 r1 = r0.c
            java.lang.String r2 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            r4 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r4
            goto L6f
        L38:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L3f:
            dev.epro.r0.E17665849472693074628.k(r9)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            r0.a = r5
            r0.b = r7
            r0.c = r8
            r0.d = r6
            r0.e = r6
            java.lang.String r9 = "linkedDeviceId"
            r0.f = r9
            r0.g = r6
            r0.j = r2
            r5.getClass()
            java.lang.Object r0 = b(r5, r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L68
            return r1
        L68:
            r1 = r8
            r2 = r0
            r0 = r5
            r5 = r6
            r8 = r5
            r6 = r9
            r9 = r8
        L6f:
            ads_mobile_sdk.ba1 r2 = (ads_mobile_sdk.ba1) r2
            java.lang.String r2 = r2.q()
            r5.appendQueryParameter(r6, r2)
            if (r7 == 0) goto L7f
            java.lang.String r5 = "adSlotPath"
            r8.appendQueryParameter(r5, r7)
        L7f:
            java.lang.String r5 = r0.e
            java.lang.String r6 = "afmaVersion"
            r8.appendQueryParameter(r6, r5)
            if (r1 == 0) goto L91
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "debugData"
            r8.appendQueryParameter(r6, r5)
        L91:
            android.net.Uri r5 = r9.build()
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, java.lang.String, java.lang.String, dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Comparable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x03c9, code lost:
    
        if (a(r5, (java.lang.String) r4, r7) != r8) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3 A[Catch: all -> 0x028d, TRY_LEAVE, TryCatch #7 {all -> 0x028d, blocks: (B:96:0x027a, B:98:0x0281, B:100:0x0285, B:102:0x0289, B:105:0x0290, B:107:0x0294, B:109:0x0298, B:111:0x029c, B:112:0x029d, B:113:0x02a2, B:114:0x02a3, B:115:0x02aa, B:116:0x02ab, B:117:0x02b2, B:118:0x02b3), top: B:215:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033d A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #9 {all -> 0x0051, blocks: (B:13:0x004c, B:165:0x03cc, B:18:0x0062, B:162:0x03b3, B:21:0x0073, B:132:0x0337, B:134:0x033d, B:137:0x034a, B:155:0x0390, B:168:0x03d5, B:138:0x0353, B:140:0x0357, B:145:0x0362, B:148:0x036d, B:152:0x037f), top: B:218:0x0039, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x034a A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x0051, blocks: (B:13:0x004c, B:165:0x03cc, B:18:0x0062, B:162:0x03b3, B:21:0x0073, B:132:0x0337, B:134:0x033d, B:137:0x034a, B:155:0x0390, B:168:0x03d5, B:138:0x0353, B:140:0x0357, B:145:0x0362, B:148:0x036d, B:152:0x037f), top: B:218:0x0039, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f7 A[Catch: all -> 0x0403, TryCatch #1 {all -> 0x0403, blocks: (B:174:0x03f0, B:176:0x03f7, B:178:0x03fb, B:180:0x03ff, B:183:0x0406, B:185:0x040a, B:187:0x040e, B:189:0x0412, B:190:0x0413, B:191:0x0418, B:192:0x0419, B:193:0x0420, B:194:0x0421, B:195:0x0428, B:196:0x0429), top: B:205:0x03f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0429 A[Catch: all -> 0x0403, TRY_LEAVE, TryCatch #1 {all -> 0x0403, blocks: (B:174:0x03f0, B:176:0x03f7, B:178:0x03fb, B:180:0x03ff, B:183:0x0406, B:185:0x040a, B:187:0x040e, B:189:0x0412, B:190:0x0413, B:191:0x0418, B:192:0x0419, B:193:0x0420, B:194:0x0421, B:195:0x0428, B:196:0x0429), top: B:205:0x03f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c6 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #12 {all -> 0x00b8, blocks: (B:29:0x00b3, B:87:0x0256, B:34:0x00c9, B:84:0x023d, B:37:0x00da, B:55:0x01c0, B:57:0x01c6, B:60:0x01d3, B:78:0x021b, B:90:0x025f, B:61:0x01dc, B:63:0x01e0, B:68:0x01eb, B:71:0x01f8, B:75:0x020a), top: B:218:0x0039, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3 A[Catch: all -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x00b8, blocks: (B:29:0x00b3, B:87:0x0256, B:34:0x00c9, B:84:0x023d, B:37:0x00da, B:55:0x01c0, B:57:0x01c6, B:60:0x01d3, B:78:0x021b, B:90:0x025f, B:61:0x01dc, B:63:0x01e0, B:68:0x01eb, B:71:0x01f8, B:75:0x020a), top: B:218:0x0039, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0237 A[PHI: r0 r1 r2 r4 r5
      0x0237: PHI (r0v39 boolean) = (r0v31 boolean), (r0v40 boolean) binds: [B:79:0x0233, B:34:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r1v29 ??) = (r1v53 ??), (r1v54 ??) binds: [B:79:0x0233, B:34:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r2v19 ??) = (r2v38 ??), (r2v39 ??) binds: [B:79:0x0233, B:34:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r4v11 ??) = (r4v45 ??), (r4v46 ??) binds: [B:79:0x0233, B:34:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r5v16 ads_mobile_sdk.w81) = (r5v13 ads_mobile_sdk.w81), (r5v18 ads_mobile_sdk.w81) binds: [B:79:0x0233, B:34:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0281 A[Catch: all -> 0x028d, TryCatch #7 {all -> 0x028d, blocks: (B:96:0x027a, B:98:0x0281, B:100:0x0285, B:102:0x0289, B:105:0x0290, B:107:0x0294, B:109:0x0298, B:111:0x029c, B:112:0x029d, B:113:0x02a2, B:114:0x02a3, B:115:0x02aa, B:116:0x02ab, B:117:0x02b2, B:118:0x02b3), top: B:215:0x027a }] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r2v0, types: [dev.epro.r0.I16631908410500040363] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v17, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v27, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v14, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v19, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r22, java.lang.String r23, dev.epro.r0.I16631908410500040363 r24, dev.epro.r0.K14749510448791472029 r25) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, java.lang.String, dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.t71
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.t71 r0 = (ads_mobile_sdk.t71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.t71 r0 = new ads_mobile_sdk.t71
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
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
            dev.epro.r0.H15186625828076266306 r5 = r4.x
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            boolean r4 = r4.g()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L52
            r5.b(r3)
            return r4
        L52:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, ads_mobile_sdk.b71 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.q71
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.q71 r0 = (ads_mobile_sdk.q71) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.q71 r0 = new ads_mobile_sdk.q71
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            dev.epro.r0.H15186625828076266306 r7 = r0.d
            ads_mobile_sdk.b71 r9 = r0.c
            java.lang.String r8 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            r10 = r7
            r7 = r0
            goto L4e
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r3
        L36:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r7
            r0.b = r8
            r0.c = r9
            dev.epro.r0.H15186625828076266306 r10 = r7.D
            r0.d = r10
            r0.g = r2
            java.lang.Object r0 = r10.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.LinkedHashMap r0 = r7.F     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedHashMap r1 = r7.G     // Catch: java.lang.Throwable -> L7c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7c
            ads_mobile_sdk.jr0 r2 = r7.i     // Catch: java.lang.Throwable -> L7c
            r2.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "gads:inspector:max_ad_life_cycles"
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L7c
            ads_mobile_sdk.ao r6 = ads_mobile_sdk.ao.a$18     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r2 = r2.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L7c
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7c
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            if (r0 < r2) goto L7e
            java.lang.String r7 = "Maximum number of stored ad requests reached. Dropping the current request."
            ads_mobile_sdk.xv.c(r7, r3)     // Catch: java.lang.Throwable -> L7c
            r10.b(r3)
            return r4
        L7c:
            r7 = move-exception
            goto L9c
        L7e:
            java.lang.Object r0 = r1.get(r8)     // Catch: java.lang.Throwable -> L7c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L8e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            r1.put(r8, r0)     // Catch: java.lang.Throwable -> L7c
        L8e:
            r0.add(r9)     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedHashMap r7 = r7.F     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = r9.d     // Catch: java.lang.Throwable -> L7c
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L7c
            r10.b(r3)
            return r4
        L9c:
            r10.b(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(java.lang.String, ads_mobile_sdk.b71, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v8, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r16, java.lang.String r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof ads_mobile_sdk.o81
            if (r2 == 0) goto L18
            r2 = r1
            ads_mobile_sdk.o81 r2 = (ads_mobile_sdk.o81) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f = r3
        L16:
            r13 = r2
            goto L1e
        L18:
            ads_mobile_sdk.o81 r2 = new ads_mobile_sdk.o81
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r13.d
            int r2 = r13.f
            r3 = 2
            r4 = 1
            r15 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L38
            java.lang.Object r0 = r13.a
            r2 = r0
            dev.epro.r0.R8015591507171738907 r2 = (dev.epro.r0.R8015591507171738907) r2
            dev.epro.r0.E17665849472693074628.k(r1)     // Catch: java.lang.Throwable -> L36
            goto L81
        L36:
            r0 = move-exception
            goto L87
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r15
        L3e:
            dev.epro.r0.H15186625828076266306 r0 = r13.c
            java.lang.String r2 = r13.b
            java.lang.Object r4 = r13.a
            ads_mobile_sdk.w81 r4 = (ads_mobile_sdk.w81) r4
            dev.epro.r0.E17665849472693074628.k(r1)
            r10 = r2
            r2 = r0
            r0 = r4
            goto L66
        L4d:
            dev.epro.r0.E17665849472693074628.k(r1)
            dev.epro.r0.H15186625828076266306 r1 = r0.x
            r13.a = r0
            r2 = r17
            r13.b = r2
            r13.c = r1
            r13.f = r4
            java.lang.Object r4 = r1.c(r13)
            if (r4 != r5) goto L64
            r1 = r5
            goto L80
        L64:
            r10 = r2
            r2 = r1
        L66:
            r13.a = r2     // Catch: java.lang.Throwable -> L36
            r13.b = r15     // Catch: java.lang.Throwable -> L36
            r13.c = r15     // Catch: java.lang.Throwable -> L36
            r13.f = r3     // Catch: java.lang.Throwable -> L36
            r6 = 0
            r4 = 0
            r1 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 447(0x1bf, float:6.26E-43)
            r3 = r0
            java.lang.Object r0 = a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L36
            if (r0 != r1) goto L81
        L80:
            return r1
        L81:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L36
            r2.b(r15)
            return r0
        L87:
            r2.b(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #0 {all -> 0x00d5, blocks: (B:40:0x00a8, B:44:0x00b2, B:46:0x00b8, B:36:0x00a0, B:53:0x00dc, B:54:0x00e1), top: B:57:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v9, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r17, int r18, dev.epro.r0.K14749510448791472029 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, int, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #0 {all -> 0x00d2, blocks: (B:36:0x00be, B:40:0x00c8, B:43:0x00ce, B:47:0x00d6, B:50:0x00dc, B:52:0x00e2, B:54:0x00e6, B:55:0x00ee, B:56:0x00f1, B:57:0x00f2, B:58:0x00f5, B:59:0x00f6, B:61:0x00fc), top: B:71:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:36:0x00be, B:40:0x00c8, B:43:0x00ce, B:47:0x00d6, B:50:0x00dc, B:52:0x00e2, B:54:0x00e6, B:55:0x00ee, B:56:0x00f1, B:57:0x00f2, B:58:0x00f5, B:59:0x00f6, B:61:0x00fc), top: B:71:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r17, boolean r18, dev.epro.r0.K14749510448791472029 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:24:0x0067, B:27:0x006e, B:32:0x007b, B:34:0x007f, B:36:0x0085, B:49:0x00ba, B:50:0x00bf), top: B:56:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #1 {all -> 0x0077, blocks: (B:24:0x0067, B:27:0x006e, B:32:0x007b, B:34:0x007f, B:36:0x0085, B:49:0x00ba, B:50:0x00bf), top: B:56:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r16, dev.epro.r0.I16631908410500040363 r17, dev.epro.r0.K14749510448791472029 r18) throws java.lang.Throwable {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof ads_mobile_sdk.r81
            if (r2 == 0) goto L18
            r2 = r1
            ads_mobile_sdk.r81 r2 = (ads_mobile_sdk.r81) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f = r3
        L16:
            r13 = r2
            goto L1e
        L18:
            ads_mobile_sdk.r81 r2 = new ads_mobile_sdk.r81
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r13.d
            int r2 = r13.f
            r3 = 2
            r4 = 1
            r15 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r2 == 0) goto L50
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3c
            java.lang.Object r0 = r13.b
            r2 = r0
            dev.epro.r0.R8015591507171738907 r2 = (dev.epro.r0.R8015591507171738907) r2
            ads_mobile_sdk.w81 r0 = r13.a
            dev.epro.r0.E17665849472693074628.k(r1)     // Catch: java.lang.Throwable -> L39
            goto La7
        L39:
            r0 = move-exception
            goto Lc0
        L3c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r15
        L42:
            dev.epro.r0.H15186625828076266306 r0 = r13.c
            java.lang.Object r2 = r13.b
            dev.epro.r0.I16631908410500040363 r2 = (dev.epro.r0.I16631908410500040363) r2
            ads_mobile_sdk.w81 r4 = r13.a
            dev.epro.r0.E17665849472693074628.k(r1)
            r1 = r0
            r0 = r4
            goto L67
        L50:
            dev.epro.r0.E17665849472693074628.k(r1)
            dev.epro.r0.H15186625828076266306 r1 = r0.x
            r13.a = r0
            r2 = r17
            r13.b = r2
            r13.c = r1
            r13.f = r4
            java.lang.Object r4 = r1.c(r13)
            if (r4 != r5) goto L67
            r2 = r5
            goto La3
        L67:
            r0.A = r2     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "is_globally_allowlisted"
            if (r2 != 0) goto L6e
            goto L7a
        L6e:
            dev.epro.r0.K15572083692188606544 r2 = r2.w(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            goto L7b
        L77:
            r0 = move-exception
            r2 = r1
            goto Lc0
        L7a:
            r2 = 0
        L7b:
            ads_mobile_sdk.ba1 r4 = r0.y     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto Lba
            boolean r4 = r4.s()     // Catch: java.lang.Throwable -> L77
            if (r2 == r4) goto La4
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L77
            r13.a = r0     // Catch: java.lang.Throwable -> L77
            r13.b = r1     // Catch: java.lang.Throwable -> L77
            r13.c = r15     // Catch: java.lang.Throwable -> L77
            r13.f = r3     // Catch: java.lang.Throwable -> L77
            r6 = 0
            r4 = 0
            r2 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 255(0xff, float:3.57E-43)
            r3 = r0
            java.lang.Object r0 = a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L77
            if (r0 != r2) goto La5
        La3:
            return r2
        La4:
            r3 = r0
        La5:
            r2 = r1
            r0 = r3
        La7:
            boolean r1 = r0.g()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto Lb4
            boolean r1 = r0.z     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto Lb4
            r0.c()     // Catch: java.lang.Throwable -> L39
        Lb4:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L39
            r2.b(r15)
            return r0
        Lba:
            java.lang.String r0 = "storedInspectorSettings"
            dev.epro.r0.S10823041268949770285.b0(r0)     // Catch: java.lang.Throwable -> L77
            throw r15     // Catch: java.lang.Throwable -> L77
        Lc0:
            r2.b(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.u81
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.u81 r0 = (ads_mobile_sdk.u81) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.u81 r0 = new ads_mobile_sdk.u81
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            int r9 = r0.c
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            r10 = r8
            r8 = r0
            goto L4a
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r8
            dev.epro.r0.H15186625828076266306 r10 = r8.D
            r0.b = r10
            r0.c = r9
            r0.f = r2
            java.lang.Object r0 = r10.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            long r0 = r8.E     // Catch: java.lang.Throwable -> L72
            long r4 = (long) r9     // Catch: java.lang.Throwable -> L72
            long r0 = r0 + r4
            ads_mobile_sdk.jr0 r9 = r8.i     // Catch: java.lang.Throwable -> L72
            r9.getClass()     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "gads:inspector:max_ad_response_logs_bytes"
            r6 = 20971520(0x1400000, double:1.03613076E-316)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L72
            ads_mobile_sdk.ao r7 = ads_mobile_sdk.ao.a$26     // Catch: java.lang.Throwable -> L72
            java.lang.Object r9 = r9.a(r2, r6, r7)     // Catch: java.lang.Throwable -> L72
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L72
            long r6 = r9.longValue()     // Catch: java.lang.Throwable -> L72
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 < 0) goto L74
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L72
            r10.b(r3)
            return r8
        L72:
            r8 = move-exception
            goto L7f
        L74:
            long r0 = r8.E     // Catch: java.lang.Throwable -> L72
            long r0 = r0 + r4
            r8.E = r0     // Catch: java.lang.Throwable -> L72
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L72
            r10.b(r3)
            return r8
        L7f:
            r10.b(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(int, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [ads_mobile_sdk.b43, android.hardware.SensorEventListener] */
    /* JADX WARN: Type inference failed for: r10v6, types: [ads_mobile_sdk.nr0, android.hardware.SensorEventListener] */
    public final void a(int i) {
        android.hardware.Sensor defaultSensor;
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA != 1) {
            if (iA != 2) {
                return;
            }
            ?? r10 = (ads_mobile_sdk.nr0) this.g.get();
            synchronized (r10) {
                try {
                    ads_mobile_sdk.jr0 jr0Var = r10.b;
                    jr0Var.getClass();
                    if (((java.lang.Boolean) jr0Var.a("gads:inspector:flick_enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
                        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) r10.a.getSystemService(android.hardware.SensorManager.class);
                        defaultSensor = sensorManager != 0 ? sensorManager.getDefaultSensor(4) : null;
                        if (!r10.n && sensorManager != 0 && defaultSensor != null) {
                            r10.e = sensorManager;
                            r10.f = defaultSensor;
                            ads_mobile_sdk.jr0 jr0Var2 = r10.b;
                            jr0Var2.getClass();
                            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
                            sensorManager.registerListener((android.hardware.SensorEventListener) r10, defaultSensor, 3, ((int) dev.epro.r0.E17093345031926825464.k(((dev.epro.r0.E17093345031926825464) jr0Var2.a("gads:inspector:flick_reset_time_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(3000, dev.epro.r0.N13798149404328803870.d)), ads_mobile_sdk.ao.a)).a, dev.epro.r0.N13798149404328803870.c)) / 100);
                            r10.n = true;
                        }
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        ?? r102 = (ads_mobile_sdk.b43) this.f.get();
        synchronized (r102) {
            try {
                ads_mobile_sdk.jr0 jr0Var3 = r102.b;
                jr0Var3.getClass();
                if (((java.lang.Boolean) jr0Var3.a("gads:inspector:shake_enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
                    android.hardware.SensorManager sensorManager2 = (android.hardware.SensorManager) r102.a.getSystemService(android.hardware.SensorManager.class);
                    defaultSensor = sensorManager2 != 0 ? sensorManager2.getDefaultSensor(1) : null;
                    if (!r102.j && sensorManager2 != 0 && defaultSensor != null) {
                        r102.e = sensorManager2;
                        r102.f = defaultSensor;
                        ads_mobile_sdk.jr0 jr0Var4 = r102.b;
                        jr0Var4.getClass();
                        dev.epro.r0.E17149812035295265804 e171498120352952658042 = dev.epro.r0.E17093345031926825464.b;
                        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.d;
                        dev.epro.r0.E17093345031926825464 e17093345031926825464 = new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(500, n13798149404328803870));
                        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a;
                        sensorManager2.registerListener((android.hardware.SensorEventListener) r102, defaultSensor, 3, ((int) dev.epro.r0.E17093345031926825464.k(((dev.epro.r0.E17093345031926825464) jr0Var4.a("gads:inspector:shake_interval", e17093345031926825464, aoVar)).a, dev.epro.r0.N13798149404328803870.c)) / 10);
                        r102.c.getClass();
                        long jA0 = dev.epro.r0.M9216324016624295870.a0(android.os.SystemClock.elapsedRealtime(), n13798149404328803870);
                        ads_mobile_sdk.jr0 jr0Var5 = r102.b;
                        jr0Var5.getClass();
                        r102.g = dev.epro.r0.E17093345031926825464.g(jA0, ((dev.epro.r0.E17093345031926825464) jr0Var5.a("gads:inspector:shake_interval", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(500, n13798149404328803870)), aoVar)).a);
                        r102.j = true;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static java.lang.Object a(ads_mobile_sdk.w81 w81Var, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool3, dev.epro.r0.K14749510448791472029 k14749510448791472029, int i2) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            l = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 64) != 0) {
            str3 = null;
        }
        if ((i2 & 128) != 0) {
            str4 = null;
        }
        if ((i2 & 256) != 0) {
            bool3 = null;
        }
        w81Var.getClass();
        return a(w81Var, bool, bool2, i, str, l, str2, str3, str4, bool3, k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r8, java.lang.Boolean r9, java.lang.Boolean r10, int r11, java.lang.String r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Boolean r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, java.lang.Boolean, java.lang.Boolean, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
