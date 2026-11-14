package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X11776734143967878387;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class i03 {
    public final O16637889491137121389 b;
    public final wj c;
    public final X11776734143967878387 e;
    public final W5797197595347441198 f;
    public final kz2 g;
    public final sb h;
    public final U4857089234315512256 i;
    public final ts2 j;
    public final long k;
    public final long l;
    public final H15186625828076266306 m;
    public final ArrayList n;

    public i03(jr0 jr0Var, Context context, O16637889491137121389 o16637889491137121389, wj wjVar, g0 g0Var, X11776734143967878387 x11776734143967878387, W5797197595347441198 w5797197595347441198, kz2 kz2Var, sb sbVar, U4857089234315512256 u4857089234315512256, ts2 ts2Var) {
        jr0Var.getClass();
        context.getClass();
        o16637889491137121389.getClass();
        wjVar.getClass();
        g0Var.getClass();
        x11776734143967878387.getClass();
        w5797197595347441198.getClass();
        kz2Var.getClass();
        sbVar.getClass();
        u4857089234315512256.getClass();
        ts2Var.getClass();
        this.b = o16637889491137121389;
        this.c = wjVar;
        this.e = x11776734143967878387;
        this.f = w5797197595347441198;
        this.g = kz2Var;
        this.h = sbVar;
        this.i = u4857089234315512256;
        this.j = ts2Var;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.k = ((E17093345031926825464) jr0Var.a("(gads:rtb_v1_1:signal_timeout_ms", new E17093345031926825464(M9216324016624295870.Z(900, N13798149404328803870.MILLISECONDS)), ao.a)).a;
        this.l = E17093345031926825464.j(u93.e.a, ((Number) jr0Var.a("gads:rtb_timeout_multiplier", Double.valueOf(0.95d), ao.a$14)).doubleValue());
        this.m = new H15186625828076266306();
        this.n = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a8, code lost:
    
        if (r15.a(r10, r2, r0, r5, r3, r8) == r9) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02d6, code lost:
    
        if (r15.a(r10, r2, r0, r5, r3, r8) == r9) goto L116;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ea A[Catch: all -> 0x02f6, TryCatch #5 {all -> 0x02f6, blocks: (B:104:0x02e3, B:106:0x02ea, B:108:0x02ee, B:110:0x02f2, B:111:0x02f9, B:113:0x02fd, B:115:0x0301, B:117:0x0305, B:118:0x0306, B:119:0x030b, B:120:0x030c, B:121:0x0313, B:122:0x0314, B:123:0x031b, B:124:0x031c), top: B:103:0x02e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x031c A[Catch: all -> 0x02f6, TRY_LEAVE, TryCatch #5 {all -> 0x02f6, blocks: (B:104:0x02e3, B:106:0x02ea, B:108:0x02ee, B:110:0x02f2, B:111:0x02f9, B:113:0x02fd, B:115:0x0301, B:117:0x0305, B:118:0x0306, B:119:0x030b, B:120:0x030c, B:121:0x0313, B:122:0x0314, B:123:0x031b, B:124:0x031c), top: B:103:0x02e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112 A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #1 {all -> 0x01b0, blocks: (B:16:0x010a, B:18:0x0112, B:22:0x0134, B:24:0x0144, B:25:0x0149, B:27:0x0156, B:29:0x015c, B:30:0x0164, B:32:0x016a, B:34:0x0180), top: B:15:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134 A[Catch: all -> 0x01b0, TRY_ENTER, TryCatch #1 {all -> 0x01b0, blocks: (B:16:0x010a, B:18:0x0112, B:22:0x0134, B:24:0x0144, B:25:0x0149, B:27:0x0156, B:29:0x015c, B:30:0x0164, B:32:0x016a, B:34:0x0180), top: B:15:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bd A[Catch: all -> 0x01c9, TryCatch #6 {all -> 0x01c9, blocks: (B:41:0x01b6, B:43:0x01bd, B:45:0x01c1, B:47:0x01c5, B:48:0x01cc, B:50:0x01d0, B:52:0x01d4, B:54:0x01d8, B:55:0x01d9, B:56:0x01de, B:57:0x01df, B:58:0x01e6, B:59:0x01e7, B:60:0x01ee, B:61:0x01ef), top: B:40:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ef A[Catch: all -> 0x01c9, TRY_LEAVE, TryCatch #6 {all -> 0x01c9, blocks: (B:41:0x01b6, B:43:0x01bd, B:45:0x01c1, B:47:0x01c5, B:48:0x01cc, B:50:0x01d0, B:52:0x01d4, B:54:0x01d8, B:55:0x01d9, B:56:0x01de, B:57:0x01df, B:58:0x01e6, B:59:0x01e7, B:60:0x01ee, B:61:0x01ef), top: B:40:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0240 A[Catch: all -> 0x02dd, TRY_LEAVE, TryCatch #7 {all -> 0x02dd, blocks: (B:80:0x0238, B:82:0x0240, B:85:0x0262, B:87:0x0272, B:88:0x0277, B:90:0x0284, B:92:0x028a, B:93:0x0292, B:95:0x0298, B:97:0x02ae), top: B:79:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0262 A[Catch: all -> 0x02dd, TRY_ENTER, TryCatch #7 {all -> 0x02dd, blocks: (B:80:0x0238, B:82:0x0240, B:85:0x0262, B:87:0x0272, B:88:0x0277, B:90:0x0284, B:92:0x028a, B:93:0x0292, B:95:0x0298, B:97:0x02ae), top: B:79:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b4  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [dev.epro.r0.U4857089234315512256] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v27, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v9, types: [ads_mobile_sdk.th3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map.Entry r18, dev.epro.r0.U4857089234315512256 r19, java.util.Map r20, ads_mobile_sdk.qw2 r21, dev.epro.r0.E6758797890281795541 r22, dev.epro.r0.K14749510448791472029 r23) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i03.a(java.util.Map$Entry, dev.epro.r0.U4857089234315512256, java.util.Map, ads_mobile_sdk.qw2, dev.epro.r0.E6758797890281795541, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r1.c(r8) == r14) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.os.Bundle r17, android.os.Bundle r18, dev.epro.r0.E6758797890281795541 r19, java.lang.String r20, java.lang.String r21, dev.epro.r0.K14749510448791472029 r22) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i03.a(android.os.Bundle, android.os.Bundle, dev.epro.r0.E6758797890281795541, java.lang.String, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(dev.epro.r0.E6758797890281795541 r13, ads_mobile_sdk.qw2 r14, dev.epro.r0.U4857089234315512256 r15, dev.epro.r0.K14749510448791472029 r16) {
        /*
            r12 = this;
            r0 = r16
            boolean r2 = r0 instanceof ads_mobile_sdk.c03
            if (r2 == 0) goto L16
            r2 = r0
            ads_mobile_sdk.c03 r2 = (ads_mobile_sdk.c03) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.e = r3
        L14:
            r6 = r2
            goto L1c
        L16:
            ads_mobile_sdk.c03 r2 = new ads_mobile_sdk.c03
            r2.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.c
            int r2 = r6.e
            r7 = 2
            r8 = 1
            r9 = 0
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r2 == 0) goto L3f
            if (r2 == r8) goto L39
            if (r2 != r7) goto L33
            dev.epro.r0.H15186625828076266306 r1 = r6.b
            ads_mobile_sdk.i03 r2 = r6.a
            dev.epro.r0.E17665849472693074628.k(r0)
            goto L6d
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r9
        L39:
            ads_mobile_sdk.i03 r1 = r6.a
            dev.epro.r0.E17665849472693074628.k(r0)
            goto L5c
        L3f:
            dev.epro.r0.E17665849472693074628.k(r0)
            dev.epro.r0.P5733283974459951585 r11 = ads_mobile_sdk.rw0.f
            dev.epro.r0.U7325339214157685715 r0 = new dev.epro.r0.U7325339214157685715
            r5 = 0
            r1 = r12
            r4 = r13
            r3 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a = r12
            r6.e = r8
            long r2 = r12.l
            java.lang.Object r0 = r11.c(r2, r0, r6)
            if (r0 != r10) goto L5b
            goto L6a
        L5b:
            r1 = r12
        L5c:
            dev.epro.r0.H15186625828076266306 r0 = r1.m
            r6.a = r1
            r6.b = r0
            r6.e = r7
            java.lang.Object r2 = r0.c(r6)
            if (r2 != r10) goto L6b
        L6a:
            return r10
        L6b:
            r2 = r1
            r1 = r0
        L6d:
            java.util.ArrayList r0 = r2.n     // Catch: java.lang.Throwable -> L73
            r1.b(r9)
            return r0
        L73:
            r0 = move-exception
            r1.b(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i03.a(dev.epro.r0.E6758797890281795541, ads_mobile_sdk.qw2, dev.epro.r0.U4857089234315512256, dev.epro.r0.K14749510448791472029):java.io.Serializable");
    }
}
