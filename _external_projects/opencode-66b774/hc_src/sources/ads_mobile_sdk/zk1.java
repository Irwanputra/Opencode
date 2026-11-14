package ads_mobile_sdk;

import android.net.Uri;
import dev.epro.r0.A18119328133183277592;
import dev.epro.r0.C9731525580007922156;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Y4798753258822141670;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class zk1 implements C9731525580007922156 {
    public final kz2 a;
    public final mi3 b;
    public final rw0 c;
    public final W5797197595347441198 d;
    public final jr0 e;
    public final H15186625828076266306 f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public final ft1 i;

    public zk1(kz2 kz2Var, mi3 mi3Var, rw0 rw0Var, W5797197595347441198 w5797197595347441198, jr0 jr0Var) {
        kz2Var.getClass();
        mi3Var.getClass();
        rw0Var.getClass();
        w5797197595347441198.getClass();
        jr0Var.getClass();
        this.a = kz2Var;
        this.b = mi3Var;
        this.c = rw0Var;
        this.d = w5797197595347441198;
        this.e = jr0Var;
        this.f = new H15186625828076266306();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new ft1(null);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x010f A[Catch: all -> 0x0116, TryCatch #2 {all -> 0x0116, blocks: (B:114:0x0105, B:116:0x010f, B:118:0x011b, B:120:0x0121, B:122:0x0136, B:127:0x0141), top: B:113:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0136 A[Catch: all -> 0x0116, TryCatch #2 {all -> 0x0116, blocks: (B:114:0x0105, B:116:0x010f, B:118:0x011b, B:120:0x0121, B:122:0x0136, B:127:0x0141), top: B:113:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.zk1 r27, ads_mobile_sdk.tx0 r28, android.net.Uri r29, dev.epro.r0.K14749510448791472029 r30) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zk1.a(ads_mobile_sdk.zk1, ads_mobile_sdk.tx0, android.net.Uri, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final Object a(tx0 tx0Var, Uri uri, vx0 vx0Var) {
        return a(this, tx0Var, uri, vx0Var);
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final Object a(tx0 tx0Var, String str, fb fbVar) {
        return a(this, str, fbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.zk1 r5, java.lang.String r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.uk1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.uk1 r0 = (ads_mobile_sdk.uk1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.uk1 r0 = new ads_mobile_sdk.uk1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            r4 = 0
            if (r1 == 0) goto L39
            if (r1 == r2) goto L31
            r5 = 2
            if (r1 != r5) goto L2b
            dev.epro.r0.E17665849472693074628.k(r7)
            return r3
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r4
        L31:
            java.lang.String r6 = r0.b
            ads_mobile_sdk.zk1 r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L4d
        L39:
            dev.epro.r0.E17665849472693074628.k(r7)
            ads_mobile_sdk.ft1 r7 = r5.i
            r0.a = r5
            r0.b = r6
            r0.e = r2
            java.lang.Object r7 = r7.a(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r0) goto L4d
            return r0
        L4d:
            ads_mobile_sdk.ax2 r7 = (ads_mobile_sdk.ax2) r7
            if (r7 != 0) goto L5b
            java.lang.String r5 = "Unknown/Unexpected GMSG without a handler: result"
            ads_mobile_sdk.xv.c(r5, r4)
            r6 = 6
            ads_mobile_sdk.zi3.a(r6, r5, r4)
            return r3
        L5b:
            dev.epro.r0.F14240031463097426304 r0 = new dev.epro.r0.F14240031463097426304     // Catch: java.lang.Exception -> L69
            r0.<init>()     // Catch: java.lang.Exception -> L69
            java.lang.Class<dev.epro.r0.I16631908410500040363> r1 = dev.epro.r0.I16631908410500040363.class
            java.lang.Object r6 = r0.b(r1, r6)     // Catch: java.lang.Exception -> L69
            dev.epro.r0.I16631908410500040363 r6 = (dev.epro.r0.I16631908410500040363) r6     // Catch: java.lang.Exception -> L69
            goto L82
        L69:
            r6 = move-exception
            ads_mobile_sdk.cc2 r0 = dev.epro.r0.G6547577305291411977.l(r6)
            java.util.ArrayList r0 = r0.s
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L7e
            java.lang.Class r6 = r6.getClass()
            java.lang.String r1 = r6.getName()
        L7e:
            r0.add(r1)
            r6 = r4
        L82:
            if (r6 != 0) goto L85
            return r3
        L85:
            ads_mobile_sdk.ix1 r0 = new ads_mobile_sdk.ix1
            r0.<init>(r5, r7, r6, r4)
            dev.epro.r0.W5797197595347441198 r5 = r5.d
            dev.epro.r0.N4024785987441166868 r6 = new dev.epro.r0.N4024785987441166868
            r7 = 26
            r6.<init>(r0, r4, r7)
            r7 = 3
            dev.epro.r0.R7033599853981556291.E(r5, r4, r4, r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zk1.a(ads_mobile_sdk.zk1, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final Object a(String str, Y4798753258822141670 y4798753258822141670, K14749510448791472029 k14749510448791472029) {
        return a(this, str, y4798753258822141670, k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:25:0x0097, B:27:0x00a1, B:28:0x00a9), top: B:24:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.zk1 r9, java.lang.String r10, dev.epro.r0.Y4798753258822141670 r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zk1.a(ads_mobile_sdk.zk1, java.lang.String, dev.epro.r0.Y4798753258822141670, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final Object a(String str, A18119328133183277592 a18119328133183277592, zw0 zw0Var) {
        return a(this, str, a18119328133183277592, zw0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r9.a(r7, r8, r0) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v2, types: [dev.epro.r0.H5998176783492007232] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.zk1 r6, java.lang.String r7, dev.epro.r0.A18119328133183277592 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.yk1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.yk1 r0 = (ads_mobile_sdk.yk1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.yk1 r0 = new ads_mobile_sdk.yk1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            dev.epro.r0.H5998176783492007232 r8 = r0.b
            java.lang.String r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L4b
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.ft1 r6 = r6.i
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r9 = r6.a(r0)
            if (r9 != r5) goto L4b
            goto L5e
        L4b:
            ads_mobile_sdk.ax2 r9 = (ads_mobile_sdk.ax2) r9
            if (r9 != 0) goto L52
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L52:
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r9.a(r7, r8, r0)
            if (r6 != r5) goto L5f
        L5e:
            return r5
        L5f:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zk1.a(ads_mobile_sdk.zk1, java.lang.String, dev.epro.r0.A18119328133183277592, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
