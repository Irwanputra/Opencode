package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B7506245556754967052;
import dev.epro.r0.C7584963549263810245;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.P10813970601447104553;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S2322588539201815831;
import dev.epro.r0.S4967920478913205567;
import dev.epro.r0.T18375584833185129273;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.Y12531765857967015337;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class pe2 {
    public final j1 a;
    public final c6 b;
    public final B7506245556754967052 c;
    public final O16637889491137121389 d;
    public final Context e;
    public final P10813970601447104553 f;
    public final kz2 g;
    public final V2597580950516131749 h;
    public final V2597580950516131749 i;
    public final H15186625828076266306 j;
    public volatile boolean k;
    public final ConcurrentHashMap l;

    public pe2(j1 j1Var, c6 c6Var, B7506245556754967052 b7506245556754967052, O16637889491137121389 o16637889491137121389, Context context, P10813970601447104553 p10813970601447104553, kz2 kz2Var, rg0 rg0Var, V2597580950516131749 v2597580950516131749) {
        j1Var.getClass();
        c6Var.getClass();
        b7506245556754967052.getClass();
        o16637889491137121389.getClass();
        context.getClass();
        p10813970601447104553.getClass();
        kz2Var.getClass();
        rg0Var.getClass();
        v2597580950516131749.getClass();
        this.a = j1Var;
        this.b = c6Var;
        this.c = b7506245556754967052;
        this.d = o16637889491137121389;
        this.e = context;
        this.f = p10813970601447104553;
        this.g = kz2Var;
        this.h = rg0Var;
        this.i = v2597580950516131749;
        this.j = new H15186625828076266306();
        this.l = new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0270 A[Catch: all -> 0x024a, TRY_LEAVE, TryCatch #7 {all -> 0x024a, blocks: (B:85:0x0237, B:87:0x023e, B:89:0x0242, B:91:0x0246, B:92:0x024d, B:94:0x0251, B:96:0x0255, B:98:0x0259, B:99:0x025a, B:100:0x025f, B:101:0x0260, B:102:0x0267, B:103:0x0268, B:104:0x026f, B:105:0x0270), top: B:84:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0317 A[Catch: all -> 0x004f, LOOP:0: B:16:0x0311->B:18:0x0317, LOOP_END, TRY_LEAVE, TryCatch #9 {all -> 0x004f, blocks: (B:14:0x004a, B:15:0x0307, B:16:0x0311, B:18:0x0317), top: B:13:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0331 A[Catch: all -> 0x033d, TryCatch #8 {all -> 0x033d, blocks: (B:26:0x032a, B:28:0x0331, B:30:0x0335, B:32:0x0339, B:33:0x0340, B:35:0x0344, B:37:0x0348, B:39:0x034c, B:40:0x034d, B:41:0x0352, B:42:0x0353, B:43:0x035a, B:44:0x035b, B:45:0x0362, B:46:0x0363), top: B:25:0x032a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0363 A[Catch: all -> 0x033d, TRY_LEAVE, TryCatch #8 {all -> 0x033d, blocks: (B:26:0x032a, B:28:0x0331, B:30:0x0335, B:32:0x0339, B:33:0x0340, B:35:0x0344, B:37:0x0348, B:39:0x034c, B:40:0x034d, B:41:0x0352, B:42:0x0353, B:43:0x035a, B:44:0x035b, B:45:0x0362, B:46:0x0363), top: B:25:0x032a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0224 A[Catch: all -> 0x0081, LOOP:1: B:75:0x021e->B:77:0x0224, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x0081, blocks: (B:73:0x007c, B:74:0x0214, B:75:0x021e, B:77:0x0224), top: B:72:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023e A[Catch: all -> 0x024a, TryCatch #7 {all -> 0x024a, blocks: (B:85:0x0237, B:87:0x023e, B:89:0x0242, B:91:0x0246, B:92:0x024d, B:94:0x0251, B:96:0x0255, B:98:0x0259, B:99:0x025a, B:100:0x025f, B:101:0x0260, B:102:0x0267, B:103:0x0268, B:104:0x026f, B:105:0x0270), top: B:84:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r3v10, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r7v9, types: [ads_mobile_sdk.j1] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ads_mobile_sdk.th3, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [ads_mobile_sdk.th3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pe2 r17, ads_mobile_sdk.qc2 r18, boolean r19, dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.pe2, ads_mobile_sdk.qc2, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:3|(12:5|6|7|(1:(4:(1:(1:(2:13|14)(4:16|17|18|19))(8:53|54|55|56|57|58|59|(8:61|(2:63|(1:65))|66|(1:68)(1:74)|69|70|71|72)(6:75|76|(1:78)(1:130)|79|(4:81|82|83|(4:(1:(1:87)(1:88))|89|71|72)(15:90|(1:92)(1:126)|93|94|95|96|97|98|(1:100)(1:112)|(1:102)(1:111)|103|104|(1:106)(1:110)|107|(5:109|57|58|59|(0)(0))))|129)))(7:135|136|137|138|82|83|(0)(0))|23|24|(4:26|(1:30)|31|(2:33|(2:35|(1:37)(2:38|39))(2:40|41))(2:42|43))(1:44))(3:142|143|144))(3:152|153|(2:155|129))|145|146|147|148|(0)(0)|79|(0)|129))|7|(0)(0)|145|146|147|148|(0)(0)|79|(0)|129|(2:(0)|(1:49))) */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0279, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x027a, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01dd A[Catch: all -> 0x0277, TryCatch #1 {all -> 0x0277, blocks: (B:59:0x01d9, B:61:0x01dd, B:63:0x01e5, B:65:0x01fc, B:66:0x020e, B:69:0x0221, B:75:0x0235, B:79:0x00ea), top: B:58:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0235 A[Catch: all -> 0x0277, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0277, blocks: (B:59:0x01d9, B:61:0x01dd, B:63:0x01e5, B:65:0x01fc, B:66:0x020e, B:69:0x0221, B:75:0x0235, B:79:0x00ea), top: B:58:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0138 A[Catch: all -> 0x023b, TryCatch #5 {all -> 0x023b, blocks: (B:83:0x0115, B:87:0x0126, B:89:0x012a, B:90:0x0138, B:93:0x015a, B:104:0x0190, B:107:0x019b, B:116:0x0240, B:119:0x024b), top: B:82:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r7v0, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x01cd -> B:57:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.qw2 r25, java.lang.String r26, dev.epro.r0.K14749510448791472029 r27) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.b(ads_mobile_sdk.qw2, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean b(S4967920478913205567 s4967920478913205567, qw2 qw2Var) {
        int ordinal;
        qw2Var.getClass();
        B7506245556754967052 b7506245556754967052 = this.c;
        b7506245556754967052.getClass();
        if (!((Boolean) b7506245556754967052.a("gads:pc:enabled", Boolean.TRUE, ao.a$11)).booleanValue() || (ordinal = qw2Var.ordinal()) == 1 || ordinal == 3 || ordinal != 5) {
            return false;
        }
        T18375584833185129273 t18375584833185129273 = s4967920478913205567 instanceof T18375584833185129273 ? (T18375584833185129273) s4967920478913205567 : null;
        return t18375584833185129273 != null && t18375584833185129273.q;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(6:(2:3|(9:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:20|21))(7:22|23|24|(1:26)(1:31)|27|(5:30|14|15|16|17)|29))(1:32))(2:44|(1:46)(1:47))|33|34|(3:36|(5:38|24|(0)(0)|27|(0))|29)|16|17))|33|34|(0)|16|17)|50|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0064, code lost:
    
        if (r13.c(r1) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0035, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x00b4, B:23:0x0042, B:24:0x007a, B:26:0x0097, B:27:0x009f, B:31:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x00b4, B:23:0x0042, B:24:0x007a, B:26:0x0097, B:27:0x009f, B:31:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #1 {all -> 0x00b8, blocks: (B:34:0x0067, B:36:0x006b), top: B:33:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [ads_mobile_sdk.pe2] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r12v3, types: [ads_mobile_sdk.pe2] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r13) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.lang.Object b(ads_mobile_sdk.pe2 r16, ads_mobile_sdk.ue2 r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.b(ads_mobile_sdk.pe2, ads_mobile_sdk.ue2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0078, code lost:
    
        if (r1 == r12) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.pe2 r20, dev.epro.r0.K14749510448791472029 r21) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.b(ads_mobile_sdk.pe2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c3, code lost:
    
        if (r0 == r14) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00c3 -> B:12:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(ads_mobile_sdk.qw2 r16, java.lang.String r17, boolean r18, dev.epro.r0.K14749510448791472029 r19) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.qw2, java.lang.String, boolean, dev.epro.r0.K14749510448791472029):java.io.Serializable");
    }

    public final int a(S4967920478913205567 s4967920478913205567, qw2 qw2Var) {
        s4967920478913205567.getClass();
        qw2Var.getClass();
        P5733283974459951585 p5733283974459951585 = rw0.f;
        String str = s4967920478913205567.i;
        String h = P5733283974459951585.h(str);
        if (h != null) {
            str = h;
        }
        if (S10823041268949770285.t(this.l.get(str), Boolean.FALSE)) {
            return 4;
        }
        if (!((iz) ((dr0) this.f).k.get()).p().p().contains(yw.API_PERSISTENT_CACHE)) {
            return 3;
        }
        if (a(qw2Var) > 0) {
            B7506245556754967052 b7506245556754967052 = this.c;
            b7506245556754967052.getClass();
            ao aoVar = ao.a$18;
            if (((Number) b7506245556754967052.a("gads:pc:max_total_cached_ads", (Object) 10, (F4096073349764486348) aoVar)).intValue() > 0 && ((Number) b7506245556754967052.a("gads:pc:cache_fill_count_per_request", (Object) 2, (F4096073349764486348) aoVar)).intValue() > 0) {
                return 0;
            }
        }
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r9 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r9.v(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.zd2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.zd2 r0 = (ads_mobile_sdk.zd2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.zd2 r0 = new ads_mobile_sdk.zd2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            ads_mobile_sdk.pe2 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L67
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            r8 = 0
            return r8
        L33:
            ads_mobile_sdk.pe2 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L51
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.V2597580950516131749 r9 = r8.h
            java.lang.Object r9 = r9.get()
            ads_mobile_sdk.fz r9 = (ads_mobile_sdk.fz) r9
            dev.epro.r0.R5692663580087387669 r9 = r9.B
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = r9.v(r0)
            if (r9 != r4) goto L51
            goto L66
        L51:
            dev.epro.r0.V2597580950516131749 r9 = r8.h
            java.lang.Object r9 = r9.get()
            ads_mobile_sdk.fz r9 = (ads_mobile_sdk.fz) r9
            r0.a = r8
            r0.d = r2
            r9.getClass()
            java.lang.Object r9 = ads_mobile_sdk.fz.d(r9, r0)
            if (r9 != r4) goto L67
        L66:
            return r4
        L67:
            dev.epro.r0.I16631908410500040363 r9 = (dev.epro.r0.I16631908410500040363) r9
            r8.getClass()
            r9.getClass()
            dev.epro.r0.H14305894327539119220 r8 = r9.a
            java.util.Set r8 = r8.entrySet()
            dev.epro.r0.J10770752472956524045 r9 = new dev.epro.r0.J10770752472956524045
            r0 = 20
            r9.<init>(r0)
            java.util.List r1 = dev.epro.r0.R9411874267597469228.W0(r8, r9)
            ads_mobile_sdk.ao r6 = ads_mobile_sdk.ao.a$12
            r5 = 0
            r7 = 30
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            java.lang.String r8 = dev.epro.r0.R9411874267597469228.J0(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "SHA-256"
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)
            java.nio.charset.Charset r0 = dev.epro.r0.F16059529287866721367.a
            byte[] r8 = r8.getBytes(r0)
            r8.getClass()
            byte[] r8 = r9.digest(r8)
            r8.getClass()
            ads_mobile_sdk.ao r9 = ads_mobile_sdk.ao.a$10
            java.lang.String r0 = ""
            r1 = 30
            java.lang.String r8 = dev.epro.r0.O5378677881740157249.L0(r8, r0, r9, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final int a(qw2 qw2Var) {
        ao aoVar = ao.a$18;
        qw2Var.getClass();
        int ordinal = qw2Var.ordinal();
        B7506245556754967052 b7506245556754967052 = this.c;
        switch (ordinal) {
            case 1:
                b7506245556754967052.getClass();
                return ((Number) b7506245556754967052.a("gads:pc:max_app_open_ads", (Object) 2, (F4096073349764486348) aoVar)).intValue();
            case 2:
                b7506245556754967052.getClass();
                return ((Number) b7506245556754967052.a("gads:pc:max_banner_ads", (Object) 0, (F4096073349764486348) aoVar)).intValue();
            case 3:
                b7506245556754967052.getClass();
                return ((Number) b7506245556754967052.a("gads:pc:max_icon_ads", (Object) 2, (F4096073349764486348) aoVar)).intValue();
            case 4:
                b7506245556754967052.getClass();
                return ((Number) b7506245556754967052.a("gads:pc:max_interstitial_ads", (Object) 0, (F4096073349764486348) aoVar)).intValue();
            case 5:
                b7506245556754967052.getClass();
                return ((Number) b7506245556754967052.a("gads:pc:max_native_ads", (Object) 2, (F4096073349764486348) aoVar)).intValue();
            case 6:
                b7506245556754967052.getClass();
                return ((Number) b7506245556754967052.a("gads:pc:max_rewarded_ads", (Object) 0, (F4096073349764486348) aoVar)).intValue();
            case 7:
                b7506245556754967052.getClass();
                return ((Number) b7506245556754967052.a("gads:pc:max_rewarded_interstitial_ads", (Object) 0, (F4096073349764486348) aoVar)).intValue();
            case 8:
                b7506245556754967052.getClass();
                return ((Number) b7506245556754967052.a("gads:pc:max_swipeable_interstitial_ads", (Object) 0, (F4096073349764486348) aoVar)).intValue();
            default:
                return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.qw2 r5, java.lang.String r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.qw2, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0134 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #5 {all -> 0x0038, blocks: (B:12:0x0033, B:13:0x0118, B:15:0x012f, B:17:0x0134, B:24:0x0127), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0146 A[Catch: all -> 0x0152, TryCatch #3 {all -> 0x0152, blocks: (B:28:0x013f, B:30:0x0146, B:32:0x014a, B:34:0x014e, B:35:0x0155, B:37:0x0159, B:39:0x015d, B:41:0x0161, B:42:0x0162, B:43:0x0167, B:44:0x0168, B:45:0x016f, B:46:0x0170, B:47:0x0177, B:48:0x0178), top: B:27:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #3 {all -> 0x0152, blocks: (B:28:0x013f, B:30:0x0146, B:32:0x014a, B:34:0x014e, B:35:0x0155, B:37:0x0159, B:39:0x015d, B:41:0x0161, B:42:0x0162, B:43:0x0167, B:44:0x0168, B:45:0x016f, B:46:0x0170, B:47:0x0177, B:48:0x0178), top: B:27:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #8 {all -> 0x004c, blocks: (B:61:0x0048, B:62:0x0096, B:64:0x00ad, B:66:0x00b2, B:71:0x00a5), top: B:60:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c5 A[Catch: all -> 0x00d1, TryCatch #1 {all -> 0x00d1, blocks: (B:75:0x00be, B:77:0x00c5, B:79:0x00c9, B:81:0x00cd, B:82:0x00d4, B:84:0x00d8, B:86:0x00dc, B:88:0x00e0, B:89:0x00e1, B:90:0x00e6, B:91:0x00e7, B:92:0x00ee, B:93:0x00ef, B:94:0x00f6, B:95:0x00f7), top: B:74:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f7 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #1 {all -> 0x00d1, blocks: (B:75:0x00be, B:77:0x00c5, B:79:0x00c9, B:81:0x00cd, B:82:0x00d4, B:84:0x00d8, B:86:0x00dc, B:88:0x00e0, B:89:0x00e1, B:90:0x00e6, B:91:0x00e7, B:92:0x00ee, B:93:0x00ef, B:94:0x00f6, B:95:0x00f7), top: B:74:0x00be }] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pe2 r16, ads_mobile_sdk.ue2 r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.pe2, ads_mobile_sdk.ue2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final H9390398899829886498 a(g6 g6Var, long j) {
        B7506245556754967052 b7506245556754967052 = this.c;
        b7506245556754967052.getClass();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        long j2 = ((E17093345031926825464) b7506245556754967052.a("gads:pc:ad_ttl_ms", new E17093345031926825464(M9216324016624295870.Z(24, N13798149404328803870.HOURS)), ao.a)).a;
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
        long a0 = M9216324016624295870.a0(j, n13798149404328803870);
        O6641393078261985068 r = g6Var.r();
        r.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : r) {
            E17149812035295265804 e171498120352952658042 = E17093345031926825464.b;
            if (E17093345031926825464.c(E17093345031926825464.g(a0, M9216324016624295870.a0(((b6) obj).p(), n13798149404328803870)), j2) <= 0) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new H9390398899829886498(arrayList, arrayList2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(4:(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|(1:17)(5:21|22|(1:24)|26|27))(2:28|29))(5:30|31|32|15|(0)(0)))(3:33|34|35))(3:77|78|(2:80|19)(1:81))|36|37|38|39|(5:41|22|(0)|26|27)(3:42|(4:44|32|15|(0)(0))|19)))|38|39|(0)(0))|7|(0)(0)|36|37|(2:(0)|(1:73))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x013a, code lost:
    
        if (r1 == r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0046, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0158, code lost:
    
        r1 = r7;
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010c A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:13:0x0041, B:14:0x013d, B:15:0x0106, B:17:0x010c, B:21:0x0140, B:22:0x014a, B:24:0x014e, B:31:0x0061, B:32:0x00fe), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0140 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:13:0x0041, B:14:0x013d, B:15:0x0106, B:17:0x010c, B:21:0x0140, B:22:0x014a, B:24:0x014e, B:31:0x0061, B:32:0x00fe), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014e A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:13:0x0041, B:14:0x013d, B:15:0x0106, B:17:0x010c, B:21:0x0140, B:22:0x014a, B:24:0x014e, B:31:0x0061, B:32:0x00fe), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9 A[Catch: all -> 0x015a, TryCatch #3 {all -> 0x015a, blocks: (B:39:0x00a4, B:41:0x00b9, B:42:0x00bf), top: B:38:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #3 {all -> 0x015a, blocks: (B:39:0x00a4, B:41:0x00b9, B:42:0x00bf), top: B:38:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x013a -> B:14:0x013d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pe2 r21, ads_mobile_sdk.qw2 r22, java.lang.String r23, java.lang.String r24, dev.epro.r0.K14749510448791472029 r25) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.pe2, ads_mobile_sdk.qw2, java.lang.String, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final LinkedHashMap a(Map map, long j, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            g6 g6Var = (g6) entry.getValue();
            H9390398899829886498 a = a(g6Var, j);
            List list = (List) a.a;
            for (b6 b6Var : (List) a.b) {
                WeakHashMap weakHashMap = ji3.a;
                th3 a2 = ji3.a(wv0.CUI_NAME_PERSISTENT_CACHE_EXPIRE, O2161699089510411363.a, true);
                try {
                    String q = b6Var.q();
                    q.getClass();
                    arrayList.add(q);
                    a2.close();
                } catch (Throwable th) {
                    try {
                        a2.b(th);
                        if (!(th instanceof N340633841638932414)) {
                            if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                                a2.a(th);
                            }
                            if (!(th instanceof P2480554073835519965)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof dv0) {
                                        throw th;
                                    }
                                    throw new iu0(th);
                                }
                                throw new du0(th);
                            }
                            throw new lw0(th);
                        }
                        throw th;
                    } finally {
                    }
                }
            }
            if (!list.isEmpty()) {
                Y12531765857967015337 y12531765857967015337 = (Y12531765857967015337) g6Var.n();
                y12531765857967015337.f().getClass();
                y12531765857967015337.e();
                y12531765857967015337.f().getClass();
                y12531765857967015337.d(list);
                linkedHashMap.put(str, (g6) y12531765857967015337.a());
            }
        }
        return linkedHashMap;
    }

    public static g1 a(g1 g1Var, String str, String str2, String str3) {
        g6 g6Var;
        vr0 vr0Var = (vr0) g1Var.u().get(str);
        if (vr0Var == null || (g6Var = (g6) vr0Var.o().get(str2)) == null) {
            return g1Var;
        }
        O6641393078261985068 r = g6Var.r();
        r.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : r) {
            if (!S10823041268949770285.t(((b6) obj).q(), str3)) {
                arrayList.add(obj);
            }
        }
        S2322588539201815831 s2322588539201815831 = (S2322588539201815831) g1Var.n();
        if (arrayList.isEmpty()) {
            C7584963549263810245 c7584963549263810245 = (C7584963549263810245) vr0Var.n();
            c7584963549263810245.e().getClass();
            str2.getClass();
            c7584963549263810245.c(str2);
            vr0 vr0Var2 = (vr0) c7584963549263810245.a();
            if (vr0Var2.o().isEmpty()) {
                s2322588539201815831.e().getClass();
                str.getClass();
                s2322588539201815831.c(str);
            } else {
                s2322588539201815831.e().getClass();
                str.getClass();
                s2322588539201815831.d(str, vr0Var2);
            }
        } else {
            s2322588539201815831.e().getClass();
            C7584963549263810245 c75849635492638102452 = (C7584963549263810245) vr0Var.n();
            c75849635492638102452.e().getClass();
            Y12531765857967015337 y12531765857967015337 = (Y12531765857967015337) g6Var.n();
            y12531765857967015337.f().getClass();
            y12531765857967015337.e();
            y12531765857967015337.f().getClass();
            y12531765857967015337.d(arrayList);
            g6 g6Var2 = (g6) y12531765857967015337.a();
            str2.getClass();
            c75849635492638102452.d(str2, g6Var2);
            vr0 vr0Var3 = (vr0) c75849635492638102452.a();
            str.getClass();
            s2322588539201815831.d(str, vr0Var3);
        }
        return (g1) s2322588539201815831.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012a A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #9 {all -> 0x0039, blocks: (B:12:0x0034, B:13:0x010f, B:15:0x0125, B:17:0x012a, B:24:0x011e), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013c A[Catch: all -> 0x0148, TryCatch #7 {all -> 0x0148, blocks: (B:28:0x0135, B:30:0x013c, B:32:0x0140, B:34:0x0144, B:35:0x014b, B:37:0x014f, B:39:0x0153, B:41:0x0157, B:42:0x0158, B:43:0x015d, B:44:0x015e, B:45:0x0165, B:46:0x0166, B:47:0x016d, B:48:0x016e), top: B:27:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016e A[Catch: all -> 0x0148, TRY_LEAVE, TryCatch #7 {all -> 0x0148, blocks: (B:28:0x0135, B:30:0x013c, B:32:0x0140, B:34:0x0144, B:35:0x014b, B:37:0x014f, B:39:0x0153, B:41:0x0157, B:42:0x0158, B:43:0x015d, B:44:0x015e, B:45:0x0165, B:46:0x0166, B:47:0x016d, B:48:0x016e), top: B:27:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #11 {all -> 0x004d, blocks: (B:61:0x0049, B:62:0x0092, B:64:0x00a8, B:66:0x00ad, B:71:0x00a1), top: B:60:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c0 A[Catch: all -> 0x00cc, TryCatch #10 {all -> 0x00cc, blocks: (B:75:0x00b9, B:77:0x00c0, B:79:0x00c4, B:81:0x00c8, B:82:0x00cf, B:84:0x00d3, B:86:0x00d7, B:88:0x00db, B:89:0x00dc, B:90:0x00e1, B:91:0x00e2, B:92:0x00e9, B:93:0x00ea, B:94:0x00f1, B:95:0x00f2), top: B:74:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f2 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #10 {all -> 0x00cc, blocks: (B:75:0x00b9, B:77:0x00c0, B:79:0x00c4, B:81:0x00c8, B:82:0x00cf, B:84:0x00d3, B:86:0x00d7, B:88:0x00db, B:89:0x00dc, B:90:0x00e1, B:91:0x00e2, B:92:0x00e9, B:93:0x00ea, B:94:0x00f1, B:95:0x00f2), top: B:74:0x00b9 }] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pe2 r16, dev.epro.r0.K14749510448791472029 r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.pe2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r6.a(r1, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.wk0 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.me2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.me2 r0 = (ads_mobile_sdk.me2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.me2 r0 = new ads_mobile_sdk.me2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            ads_mobile_sdk.wk0 r7 = r0.b
            ads_mobile_sdk.pe2 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L49
        L39:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r6.a(r0)
            if (r8 != r5) goto L49
            goto L5e
        L49:
            java.lang.String r8 = (java.lang.String) r8
            ads_mobile_sdk.j1 r6 = r6.a
            dev.epro.r0.N9977563481342542108 r1 = new dev.epro.r0.N9977563481342542108
            r1.<init>(r7, r8, r3)
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r6.a(r1, r0)
            if (r6 != r5) goto L5f
        L5e:
            return r5
        L5f:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.wk0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
