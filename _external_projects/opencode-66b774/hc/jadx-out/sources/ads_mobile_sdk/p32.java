package ads_mobile_sdk;

import dev.epro.r0.C5867465274389968370;
import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.F6376701238281935735;
import dev.epro.r0.I12024973293062010767;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.Q1304841290039450495;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z888930033515493246;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class p32 implements Z888930033515493246, I12024973293062010767 {
    public final zj1 a;
    public final y22 b;
    public final F6376701238281935735 c;
    public final U4857089234315512256 d;
    public final qw2 e;
    public final C5867465274389968370 f;
    public final l g;
    public final qv2 h;
    public final bw2 i;
    public final iw2 j;
    public final jr0 k;
    public final Q1304841290039450495 l;
    public final ci3 m;
    public final F14240031463097426304 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m5 f88o;
    public final W5797197595347441198 p;
    public volatile boolean q;
    public volatile boolean r;

    public p32(zj1 zj1Var, y22 y22Var, F6376701238281935735 f6376701238281935735, U4857089234315512256 u4857089234315512256, qw2 qw2Var, C5867465274389968370 c5867465274389968370, l lVar, qv2 qv2Var, bw2 bw2Var, iw2 iw2Var, jr0 jr0Var, Q1304841290039450495 q1304841290039450495, ci3 ci3Var, F14240031463097426304 f14240031463097426304, m5 m5Var, W5797197595347441198 w5797197595347441198) {
        zj1Var.getClass();
        y22Var.getClass();
        f6376701238281935735.getClass();
        u4857089234315512256.getClass();
        qw2Var.getClass();
        c5867465274389968370.getClass();
        lVar.getClass();
        qv2Var.getClass();
        bw2Var.getClass();
        iw2Var.getClass();
        jr0Var.getClass();
        q1304841290039450495.getClass();
        ci3Var.getClass();
        f14240031463097426304.getClass();
        m5Var.getClass();
        w5797197595347441198.getClass();
        this.a = zj1Var;
        this.b = y22Var;
        this.c = f6376701238281935735;
        this.d = u4857089234315512256;
        this.e = qw2Var;
        this.f = c5867465274389968370;
        this.g = lVar;
        this.h = qv2Var;
        this.i = bw2Var;
        this.j = iw2Var;
        this.k = jr0Var;
        this.l = q1304841290039450495;
        this.m = ci3Var;
        this.n = f14240031463097426304;
        this.f88o = m5Var;
        this.p = w5797197595347441198;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0223 A[Catch: all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:34:0x00bb, B:87:0x01ce, B:93:0x01df, B:95:0x01e5, B:98:0x01ec, B:107:0x0223, B:110:0x022c), top: B:254:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0242 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #4 {all -> 0x0089, blocks: (B:21:0x0084, B:136:0x02a0, B:26:0x0097, B:115:0x023c, B:117:0x0242, B:120:0x024d, B:122:0x025d, B:127:0x027e, B:133:0x028b), top: B:261:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024d A[Catch: all -> 0x0089, TRY_ENTER, TryCatch #4 {all -> 0x0089, blocks: (B:21:0x0084, B:136:0x02a0, B:26:0x0097, B:115:0x023c, B:117:0x0242, B:120:0x024d, B:122:0x025d, B:127:0x027e, B:133:0x028b), top: B:261:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bb A[Catch: all -> 0x02b6, TRY_LEAVE, TryCatch #10 {all -> 0x02b6, blocks: (B:138:0x02a3, B:141:0x02ab, B:146:0x02bb), top: B:270:0x02a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fa A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #7 {all -> 0x0073, blocks: (B:16:0x006e, B:151:0x02ed, B:153:0x02fa), top: B:266:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030a A[Catch: all -> 0x0314, TRY_LEAVE, TryCatch #8 {all -> 0x0314, blocks: (B:157:0x0306, B:159:0x030a, B:164:0x0316, B:166:0x031e, B:168:0x0322, B:170:0x032a, B:173:0x0357, B:174:0x0358), top: B:268:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0316 A[Catch: all -> 0x0314, TRY_ENTER, TryCatch #8 {all -> 0x0314, blocks: (B:157:0x0306, B:159:0x030a, B:164:0x0316, B:166:0x031e, B:168:0x0322, B:170:0x032a, B:173:0x0357, B:174:0x0358), top: B:268:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0409 A[Catch: all -> 0x0415, TryCatch #9 {all -> 0x0415, blocks: (B:196:0x0402, B:198:0x0409, B:200:0x040d, B:202:0x0411, B:205:0x0418, B:207:0x041c, B:209:0x0420, B:211:0x0424, B:212:0x0425, B:213:0x042a, B:214:0x042b, B:215:0x0432, B:216:0x0433, B:217:0x043a, B:218:0x043b), top: B:269:0x0402 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x043b A[Catch: all -> 0x0415, TRY_LEAVE, TryCatch #9 {all -> 0x0415, blocks: (B:196:0x0402, B:198:0x0409, B:200:0x040d, B:202:0x0411, B:205:0x0418, B:207:0x041c, B:209:0x0420, B:211:0x0424, B:212:0x0425, B:213:0x042a, B:214:0x042b, B:215:0x0432, B:216:0x0433, B:217:0x043a, B:218:0x043b), top: B:269:0x0402 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0450 A[Catch: all -> 0x045c, TryCatch #15 {all -> 0x045c, blocks: (B:227:0x0449, B:229:0x0450, B:231:0x0454, B:233:0x0458, B:236:0x045f, B:238:0x0463, B:240:0x0467, B:242:0x046b, B:243:0x046c, B:244:0x0471, B:245:0x0472, B:246:0x0479, B:247:0x047a, B:248:0x0481, B:249:0x0482), top: B:278:0x0449 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0482 A[Catch: all -> 0x045c, TRY_LEAVE, TryCatch #15 {all -> 0x045c, blocks: (B:227:0x0449, B:229:0x0450, B:231:0x0454, B:233:0x0458, B:236:0x045f, B:238:0x0463, B:240:0x0467, B:242:0x046b, B:243:0x046c, B:244:0x0471, B:245:0x0472, B:246:0x0479, B:247:0x047a, B:248:0x0481, B:249:0x0482), top: B:278:0x0449 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01a9 A[EXC_TOP_SPLITTER, PHI: r0 r8 r12 r14
      0x01a9: PHI (r0v18 ads_mobile_sdk.p32) = (r0v0 ads_mobile_sdk.p32), (r0v11 ads_mobile_sdk.p32), (r0v21 ads_mobile_sdk.p32) binds: [B:76:0x01a7, B:58:0x014d, B:69:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r8v10 ??) = (r8v67 ??), (r8v68 ??), (r8v69 ??) binds: [B:76:0x01a7, B:58:0x014d, B:69:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r12v5 ??) = (r12v0 ??), (r12v16 ??), (r12v7 ??) binds: [B:76:0x01a7, B:58:0x014d, B:69:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r14v8 long) = (r14v2 long), (r14v6 long), (r14v13 long) binds: [B:76:0x01a7, B:58:0x014d, B:69:0x0197] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #14 {all -> 0x019a, blocks: (B:57:0x0147, B:59:0x014f, B:61:0x015d), top: B:276:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0177 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #12 {all -> 0x00d8, blocks: (B:39:0x00d3, B:66:0x016f, B:68:0x0177, B:44:0x00e8), top: B:261:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af A[Catch: all -> 0x01d3, TRY_LEAVE, TryCatch #6 {all -> 0x01d3, blocks: (B:77:0x01a9, B:79:0x01af, B:82:0x01c0), top: B:264:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e5 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:34:0x00bb, B:87:0x01ce, B:93:0x01df, B:95:0x01e5, B:98:0x01ec, B:107:0x0223, B:110:0x022c), top: B:254:0x00bb }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v15, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [ads_mobile_sdk.ue2, dev.epro.r0.G8001132634698687269, dev.epro.r0.L856869997670741194, dev.epro.r0.R4833348786910499294, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.p32 r22, dev.epro.r0.K14749510448791472029 r23) {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p32.b(ads_mobile_sdk.p32, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x00ab, TryCatch #4 {all -> 0x00ab, blocks: (B:50:0x0172, B:52:0x0176, B:30:0x0084, B:32:0x008a, B:35:0x00ae), top: B:93:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #4 {all -> 0x00ab, blocks: (B:50:0x0172, B:52:0x0176, B:30:0x0084, B:32:0x008a, B:35:0x00ae), top: B:93:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:14:0x003a, B:39:0x00f6, B:41:0x00fc, B:43:0x0110, B:45:0x0122, B:46:0x0151, B:48:0x0155), top: B:95:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:14:0x003a, B:39:0x00f6, B:41:0x00fc, B:43:0x0110, B:45:0x0122, B:46:0x0151, B:48:0x0155), top: B:95:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.P3477296814990354048 r22, dev.epro.r0.K14749510448791472029 r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p32.a(dev.epro.r0.P3477296814990354048, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.I12024973293062010767
    public final Object a(pu0 pu0Var, F11004654978627682545 f11004654978627682545, R4833348786910499294 r4833348786910499294) {
        return a(this, pu0Var, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.p32 r12, ads_mobile_sdk.pu0 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            boolean r1 = r14 instanceof ads_mobile_sdk.j32
            if (r1 == 0) goto L15
            r1 = r14
            ads_mobile_sdk.j32 r1 = (ads_mobile_sdk.j32) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g = r2
            goto L1a
        L15:
            ads_mobile_sdk.j32 r1 = new ads_mobile_sdk.j32
            r1.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r1.e
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            int r3 = r1.g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L4c
            if (r3 == r6) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L30
            dev.epro.r0.E17665849472693074628.k(r14)
            return r0
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r12)
            return r7
        L36:
            dev.epro.r0.E17665849472693074628.k(r14)
            return r0
        L3a:
            boolean r12 = r1.d
            boolean r13 = r1.c
            ads_mobile_sdk.pu0 r3 = r1.b
            ads_mobile_sdk.p32 r6 = r1.a
            dev.epro.r0.E17665849472693074628.k(r14)
            r11 = r3
            r3 = r12
            r12 = r6
            r6 = r14
            r14 = r13
            r13 = r11
            goto L71
        L4c:
            dev.epro.r0.E17665849472693074628.k(r14)
            boolean r14 = r12.r
            boolean r3 = r12.q
            ads_mobile_sdk.iw2 r8 = r12.j
            dev.epro.r0.U4857089234315512256 r9 = r12.d
            java.lang.String r9 = r9.e()
            ads_mobile_sdk.qw2 r10 = r12.e
            r1.a = r12
            r1.b = r13
            r1.c = r14
            r1.d = r3
            r1.g = r6
            r8.getClass()
            java.lang.Enum r6 = ads_mobile_sdk.iw2.a(r8, r9, r10, r1)
            if (r6 != r2) goto L71
            goto Lc5
        L71:
            ads_mobile_sdk.im0 r6 = (ads_mobile_sdk.im0) r6
            ads_mobile_sdk.im0 r8 = ads_mobile_sdk.im0.INVALID
            if (r6 != r8) goto L78
            goto Lc6
        L78:
            r12.getClass()
            boolean r8 = r13 instanceof ads_mobile_sdk.uu0
            if (r8 == 0) goto L86
            ads_mobile_sdk.uu0 r13 = (ads_mobile_sdk.uu0) r13
            boolean r13 = r13.d
            if (r13 == 0) goto L86
            goto Lc6
        L86:
            if (r3 != 0) goto La2
            ads_mobile_sdk.iw2 r13 = r12.j
            dev.epro.r0.U4857089234315512256 r14 = r12.d
            java.lang.String r14 = r14.e()
            ads_mobile_sdk.qw2 r12 = r12.e
            r1.a = r7
            r1.b = r7
            r1.g = r5
            r13.getClass()
            java.lang.Object r12 = ads_mobile_sdk.iw2.d(r13, r14, r12, r1)
            if (r12 != r2) goto Lc6
            goto Lc5
        La2:
            if (r14 == 0) goto Lc6
            ads_mobile_sdk.im0 r13 = ads_mobile_sdk.im0.WATERFALL_FILL
            if (r6 == r13) goto Lac
            ads_mobile_sdk.im0 r13 = ads_mobile_sdk.im0.AD_SHOW
            if (r6 != r13) goto Lc6
        Lac:
            ads_mobile_sdk.iw2 r13 = r12.j
            dev.epro.r0.U4857089234315512256 r14 = r12.d
            java.lang.String r14 = r14.e()
            ads_mobile_sdk.qw2 r12 = r12.e
            r1.a = r7
            r1.b = r7
            r1.g = r4
            r13.getClass()
            java.lang.Object r12 = ads_mobile_sdk.iw2.d(r13, r14, r12, r1)
            if (r12 != r2) goto Lc6
        Lc5:
            return r2
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p32.a(ads_mobile_sdk.p32, ads_mobile_sdk.pu0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.I12024973293062010767
    public final Object a(d33 d33Var, z1 z1Var, F11004654978627682545 f11004654978627682545, R4833348786910499294 r4833348786910499294) {
        return a(this, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.p32 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.k32
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.k32 r0 = (ads_mobile_sdk.k32) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.k32 r0 = new ads_mobile_sdk.k32
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            r4 = 2
            r5 = 1
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            dev.epro.r0.E17665849472693074628.k(r9)
            return r3
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r2
        L33:
            ads_mobile_sdk.p32 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L54
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.iw2 r9 = r8.j
            dev.epro.r0.U4857089234315512256 r1 = r8.d
            java.lang.String r1 = r1.e()
            ads_mobile_sdk.qw2 r7 = r8.e
            r0.a = r8
            r0.d = r5
            r9.getClass()
            java.lang.Enum r9 = ads_mobile_sdk.iw2.a(r9, r1, r7, r0)
            if (r9 != r6) goto L54
            goto L71
        L54:
            ads_mobile_sdk.im0 r9 = (ads_mobile_sdk.im0) r9
            ads_mobile_sdk.im0 r1 = ads_mobile_sdk.im0.WATERFALL_FILL
            if (r9 != r1) goto L72
            ads_mobile_sdk.iw2 r9 = r8.j
            dev.epro.r0.U4857089234315512256 r1 = r8.d
            java.lang.String r1 = r1.e()
            ads_mobile_sdk.qw2 r8 = r8.e
            r0.a = r2
            r0.d = r4
            r9.getClass()
            java.lang.Object r8 = ads_mobile_sdk.iw2.c(r9, r1, r8, r0)
            if (r8 != r6) goto L72
        L71:
            return r6
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p32.a(ads_mobile_sdk.p32, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.Z888930033515493246
    public final Object a(R4833348786910499294 r4833348786910499294) {
        return b(this, (K14749510448791472029) r4833348786910499294);
    }
}
