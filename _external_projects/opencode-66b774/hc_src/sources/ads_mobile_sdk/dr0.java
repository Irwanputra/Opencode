package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.A2833667236973130790;
import dev.epro.r0.G1018228972762884510;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.L14515889287724438211;
import dev.epro.r0.P10813970601447104553;
import dev.epro.r0.X9852054718446117252;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class dr0 implements P10813970601447104553 {
    public final Context b;
    public final qq0 c;
    public final h70 d;
    public final e23 e;
    public final ti f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final H15186625828076266306 i;
    public I16631908410500040363 j;
    public final AtomicReference k;
    public final AtomicReference l;
    public final AtomicReference m;
    public final AtomicReference n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f28o;
    public boolean p;
    public boolean q;
    public boolean r;

    public dr0(Context context, qq0 qq0Var, h70 h70Var, e23 e23Var, ti tiVar) {
        context.getClass();
        qq0Var.getClass();
        h70Var.getClass();
        e23Var.getClass();
        tiVar.getClass();
        this.b = context;
        this.c = qq0Var;
        this.d = h70Var;
        this.e = e23Var;
        this.f = tiVar;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new H15186625828076266306();
        L14515889287724438211 w = iz.w();
        w.getClass();
        this.k = new AtomicReference((iz) w.a());
        G1018228972762884510 r = pb2.r();
        r.getClass();
        this.l = new AtomicReference((pb2) r.a());
        A2833667236973130790 r2 = uh2.r();
        r2.getClass();
        this.m = new AtomicReference((uh2) r2.a());
        this.n = new AtomicReference(X9852054718446117252.a);
        this.f28o = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|(1:(1:(11:10|11|12|13|14|15|(2:19|(3:21|22|23))|25|26|27|(9:29|(7:84|32|(1:34)|35|36|37|(8:39|(6:80|(1:43)|44|45|46|(8:48|(6:76|(1:52)|53|(6:59|60|61|(3:64|65|62)|66|67)|74|75)|50|(0)|53|(8:55|57|59|60|61|(1:62)|66|67)|74|75)(2:77|78))|41|(0)|44|45|46|(0)(0))(2:81|82))|31|32|(0)|35|36|37|(0)(0))(2:85|86))(2:90|91))(1:92))(1:104)|(5:99|100|(1:102)|74|75)|(3:95|(3:98|13|14)|97)|15|(3:17|19|(0))|25|26|27|(0)(0)))|106|6|(0)(0)|(0)|(0)|15|(0)|25|26|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:39|(6:80|(1:43)|44|45|46|(8:48|(6:76|(1:52)|53|(6:59|60|61|(3:64|65|62)|66|67)|74|75)|50|(0)|53|(8:55|57|59|60|61|(1:62)|66|67)|74|75)(2:77|78))|41|(0)|44|45|46|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:29|(7:84|32|(1:34)|35|36|37|(8:39|(6:80|(1:43)|44|45|46|(8:48|(6:76|(1:52)|53|(6:59|60|61|(3:64|65|62)|66|67)|74|75)|50|(0)|53|(8:55|57|59|60|61|(1:62)|66|67)|74|75)(2:77|78))|41|(0)|44|45|46|(0)(0))(2:81|82))|31|32|(0)|35|36|37|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x005d, code lost:
    
        if (r11.c(r1) == r7) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x006b, TryCatch #4 {all -> 0x006b, blocks: (B:15:0x008f, B:17:0x0099, B:19:0x00a3, B:21:0x00b0, B:25:0x00d4, B:53:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:65:0x018b, B:67:0x01a5, B:100:0x0062, B:95:0x0071), top: B:99:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #4 {all -> 0x006b, blocks: (B:15:0x008f, B:17:0x0099, B:19:0x00a3, B:21:0x00b0, B:25:0x00d4, B:53:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:65:0x018b, B:67:0x01a5, B:100:0x0062, B:95:0x0071), top: B:99:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:27:0x00d9, B:29:0x00dd, B:84:0x00e5, B:85:0x00ea, B:86:0x00ed), top: B:26:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9 A[Catch: all -> 0x00ff, TryCatch #5 {all -> 0x00ff, blocks: (B:37:0x00f5, B:39:0x00f9, B:80:0x0101, B:81:0x0106, B:82:0x0109), top: B:36:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[Catch: all -> 0x0119, TryCatch #3 {all -> 0x0119, blocks: (B:46:0x010f, B:48:0x0113, B:76:0x011b, B:77:0x0120, B:78:0x0123), top: B:45:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184 A[Catch: all -> 0x01a1, TRY_LEAVE, TryCatch #0 {all -> 0x01a1, blocks: (B:61:0x0175, B:62:0x017b, B:64:0x0184), top: B:60:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120 A[Catch: all -> 0x0119, TryCatch #3 {all -> 0x0119, blocks: (B:46:0x010f, B:48:0x0113, B:76:0x011b, B:77:0x0120, B:78:0x0123), top: B:45:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106 A[Catch: all -> 0x00ff, TryCatch #5 {all -> 0x00ff, blocks: (B:37:0x00f5, B:39:0x00f9, B:80:0x0101, B:81:0x0106, B:82:0x0109), top: B:36:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:27:0x00d9, B:29:0x00dd, B:84:0x00e5, B:85:0x00ea, B:86:0x00ed), top: B:26:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0071 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #4 {all -> 0x006b, blocks: (B:15:0x008f, B:17:0x0099, B:19:0x00a3, B:21:0x00b0, B:25:0x00d4, B:53:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:65:0x018b, B:67:0x01a5, B:100:0x0062, B:95:0x0071), top: B:99:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v16, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.a70 r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dr0.a(ads_mobile_sdk.a70, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1 A[EDGE_INSN: B:32:0x00f1->B:33:0x00f1 BREAK  A[LOOP:0: B:15:0x00b2->B:31:0x00b2], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(ads_mobile_sdk.dr0 r16, android.app.ActivityManager r17, dev.epro.r0.I16631908410500040363 r18) {
        /*
            r0 = r18
            r16.getClass()
            r1 = r16
            android.content.Context r1 = r1.b
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r3 = "gads:previous_exit_reason_reset_threshold"
            dev.epro.r0.K15572083692188606544 r3 = r0.w(r3)     // Catch: java.lang.Exception -> L20
            r3.getClass()     // Catch: java.lang.Exception -> L20
            double r3 = r3.c()     // Catch: java.lang.Exception -> L20
            java.lang.Double r2 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L20
        L20:
            double r2 = r2.doubleValue()
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r2 = java.lang.Math.min(r2, r4)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = java.lang.Math.max(r4, r2)
            int r6 = (int) r2
            int r6 = r6 * 2
            r7 = 10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "gads:previous_exit_reasons_to_scan"
            dev.epro.r0.K15572083692188606544 r8 = r0.w(r8)     // Catch: java.lang.Exception -> L4a
            r8.getClass()     // Catch: java.lang.Exception -> L4a
            int r8 = r8.j()     // Catch: java.lang.Exception -> L4a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L4a
        L4a:
            int r7 = r7.intValue()
            int r6 = java.lang.Math.max(r6, r7)
            r7 = 20
            int r6 = java.lang.Math.min(r6, r7)
            r7 = 1
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.String r8 = "gads:previous_exit_reason_values"
            ads_mobile_sdk.br0 r9 = dev.epro.r0.P10813970601447104553.a
            r9.getClass()
            dev.epro.r0.I16631908410500040363 r9 = ads_mobile_sdk.br0.b
            dev.epro.r0.K15572083692188606544 r8 = r0.w(r8)     // Catch: java.lang.Exception -> L7f
            r8.getClass()     // Catch: java.lang.Exception -> L7f
            dev.epro.r0.F14240031463097426304 r10 = new dev.epro.r0.F14240031463097426304     // Catch: java.lang.Exception -> L7f
            r10.<init>()     // Catch: java.lang.Exception -> L7f
            java.lang.String r8 = r8.p()     // Catch: java.lang.Exception -> L7f
            java.lang.Class<dev.epro.r0.I16631908410500040363> r11 = dev.epro.r0.I16631908410500040363.class
            java.lang.Object r8 = r10.b(r11, r8)     // Catch: java.lang.Exception -> L7f
            dev.epro.r0.I16631908410500040363 r8 = (dev.epro.r0.I16631908410500040363) r8     // Catch: java.lang.Exception -> L7f
            r9 = r8
        L7f:
            r10 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            java.lang.Double r8 = java.lang.Double.valueOf(r10)
            java.lang.String r10 = "gads:unspecified_exit_reason_value"
            dev.epro.r0.K15572083692188606544 r0 = r0.w(r10)     // Catch: java.lang.Exception -> L96
            r0.getClass()     // Catch: java.lang.Exception -> L96
            double r10 = r0.c()     // Catch: java.lang.Exception -> L96
            java.lang.Double r8 = java.lang.Double.valueOf(r10)     // Catch: java.lang.Exception -> L96
        L96:
            double r10 = r8.doubleValue()
            double r4 = java.lang.Math.min(r4, r10)
            java.lang.String r0 = r1.getPackageName()
            r8 = r17
            java.util.List r0 = dev.epro.r0.F11474578038339593445.i(r8, r0, r6)
            r0.getClass()
            java.util.Iterator r0 = r0.iterator()
            r10 = 0
            r12 = r10
        Lb2:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lf1
            java.lang.Object r6 = r0.next()
            android.app.ApplicationExitInfo r6 = dev.epro.r0.I2796715180830478750.d(r6)
            java.lang.String r8 = dev.epro.r0.F11474578038339593445.g(r6)
            java.lang.String r14 = r1.getPackageName()
            boolean r8 = dev.epro.r0.S10823041268949770285.t(r8, r14)
            if (r8 == 0) goto Lb2
            int r6 = dev.epro.r0.I2796715180830478750.c(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r6.getClass()
            if (r9 != 0) goto Ldc
            goto Le5
        Ldc:
            dev.epro.r0.K15572083692188606544 r6 = r9.w(r6)     // Catch: java.lang.Exception -> Le5
            double r14 = r6.c()     // Catch: java.lang.Exception -> Le5
            goto Le6
        Le5:
            r14 = r4
        Le6:
            double r12 = r12 + r14
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r6 >= 0) goto Lec
            goto Lf1
        Lec:
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 < 0) goto Lb2
            goto Lf2
        Lf1:
            r7 = 0
        Lf2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dr0.a(ads_mobile_sdk.dr0, android.app.ActivityManager, dev.epro.r0.I16631908410500040363):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        if (r10 == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (ads_mobile_sdk.e23.a(r10, "", r0) == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r10.a(r0) != r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r10.b(r0) == r8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.dr0 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof ads_mobile_sdk.dn
            if (r0 == 0) goto L16
            r0 = r10
            ads_mobile_sdk.dn r0 = (ads_mobile_sdk.dn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            ads_mobile_sdk.dn r0 = new ads_mobile_sdk.dn
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            r7 = 1
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L51
            if (r1 == r7) goto L4b
            if (r1 == r5) goto L45
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L39
            ads_mobile_sdk.dr0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto Lb7
        L39:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r2
        L3f:
            ads_mobile_sdk.dr0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L89
        L45:
            ads_mobile_sdk.dr0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L77
        L4b:
            ads_mobile_sdk.dr0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L6a
        L51:
            dev.epro.r0.E17665849472693074628.k(r10)
            r9.q = r7
            dev.epro.r0.I16631908410500040363 r10 = new dev.epro.r0.I16631908410500040363
            r10.<init>()
            r9.j = r10
            ads_mobile_sdk.qq0 r10 = r9.c
            r0.a = r9
            r0.d = r7
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r8) goto L6a
            goto Lb6
        L6a:
            ads_mobile_sdk.h70 r10 = r9.d
            r0.a = r9
            r0.d = r5
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r8) goto L77
            goto Lb6
        L77:
            ads_mobile_sdk.e23 r10 = r9.e
            r0.a = r9
            r0.d = r4
            r10.getClass()
            java.lang.String r1 = ""
            java.lang.Object r10 = ads_mobile_sdk.e23.a(r10, r1, r0)
            if (r10 != r8) goto L89
            goto Lb6
        L89:
            ads_mobile_sdk.ti r10 = r9.f
            r0.a = r9
            r0.d = r3
            r10.getClass()
            ads_mobile_sdk.qi r1 = ads_mobile_sdk.qi.x()
            r1.getClass()
            dev.epro.r0.A8094652504661216977 r10 = r10.a
            java.lang.Object r10 = r10.get()
            dev.epro.r0.A5401921815192175371 r10 = (dev.epro.r0.A5401921815192175371) r10
            dev.epro.r0.R16580349318584449994 r3 = new dev.epro.r0.R16580349318584449994
            r4 = 14
            r3.<init>(r1, r2, r4)
            java.lang.Object r10 = r10.a(r3, r0)
            if (r10 != r8) goto Laf
            goto Lb0
        Laf:
            r10 = r6
        Lb0:
            if (r10 != r8) goto Lb3
            goto Lb4
        Lb3:
            r10 = r6
        Lb4:
            if (r10 != r8) goto Lb7
        Lb6:
            return r8
        Lb7:
            java.util.concurrent.atomic.AtomicBoolean r9 = r9.f28o
            r10 = 0
            r9.set(r10)
            java.lang.String r9 = "Flags were reset because too many sessions have passed without updating flags"
            r10 = 6
            ads_mobile_sdk.zi3.a(r10, r9, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dr0.a(ads_mobile_sdk.dr0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:14|(6:39|(1:18)(1:38)|19|20|21|(5:23|(1:25)(1:34)|(1:27)|28|(2:30|31)(1:33))(2:35|36))|16|(0)(0)|19|20|21|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:21:0x0065, B:23:0x0069, B:34:0x0070, B:35:0x0075, B:36:0x0078), top: B:20:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:21:0x0065, B:23:0x0069, B:34:0x0070, B:35:0x0075, B:36:0x0078), top: B:20:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            java.lang.String r0 = "flagJson"
            java.lang.String r1 = "GoogleMobileAds"
            r2 = 0
            android.content.Context r3 = r8.b
            android.content.SharedPreferences r1 = r3.getSharedPreferences(r1, r2)
            java.lang.String r2 = "gads:initialize_webview_before_dagger"
            r3 = 0
            dev.epro.r0.I16631908410500040363 r4 = r8.j     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L23
            dev.epro.r0.K15572083692188606544 r2 = r4.w(r2)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L1a
        L18:
            r2 = r3
            goto L27
        L1a:
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L18
            goto L27
        L23:
            dev.epro.r0.S10823041268949770285.b0(r0)     // Catch: java.lang.Throwable -> L18
            throw r3     // Catch: java.lang.Throwable -> L18
        L27:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r2 = dev.epro.r0.S10823041268949770285.t(r2, r4)
            java.lang.String r4 = "early_webview_init_profiles"
            java.lang.String r5 = "early_webview_init_count"
            if (r2 == 0) goto L8e
            r1.getClass()
            android.content.SharedPreferences$Editor r2 = r1.edit()
            java.lang.String r6 = "gads:initialize_webview_before_dagger:count"
            dev.epro.r0.I16631908410500040363 r7 = r8.j     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L51
            dev.epro.r0.K15572083692188606544 r6 = r7.w(r6)     // Catch: java.lang.Throwable -> L46
            if (r6 != 0) goto L48
        L46:
            r6 = r3
            goto L55
        L48:
            int r6 = r6.j()     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L46
            goto L55
        L51:
            dev.epro.r0.S10823041268949770285.b0(r0)     // Catch: java.lang.Throwable -> L46
            throw r3     // Catch: java.lang.Throwable -> L46
        L55:
            if (r6 == 0) goto L5c
            int r6 = r6.intValue()
            goto L5d
        L5c:
            r6 = 5
        L5d:
            r2.putInt(r5, r6)
            r2.apply()
            java.lang.String r2 = "gads:initialize_webview_before_dagger:profiles"
            dev.epro.r0.I16631908410500040363 r8 = r8.j     // Catch: java.lang.Throwable -> L79
            if (r8 == 0) goto L75
            dev.epro.r0.K15572083692188606544 r8 = r8.w(r2)     // Catch: java.lang.Throwable -> L79
            if (r8 != 0) goto L70
            goto L79
        L70:
            java.lang.String r3 = r8.p()     // Catch: java.lang.Throwable -> L79
            goto L79
        L75:
            dev.epro.r0.S10823041268949770285.b0(r0)     // Catch: java.lang.Throwable -> L79
            throw r3     // Catch: java.lang.Throwable -> L79
        L79:
            if (r3 != 0) goto L7d
            java.lang.String r3 = ""
        L7d:
            boolean r8 = dev.epro.r0.M8927913404651150384.Y(r3)
            if (r8 != 0) goto L8d
            android.content.SharedPreferences$Editor r8 = r1.edit()
            r8.putString(r4, r3)
            r8.apply()
        L8d:
            return
        L8e:
            r1.getClass()
            android.content.SharedPreferences$Editor r8 = r1.edit()
            r8.remove(r5)
            r8.remove(r4)
            r8.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dr0.a():void");
    }
}
