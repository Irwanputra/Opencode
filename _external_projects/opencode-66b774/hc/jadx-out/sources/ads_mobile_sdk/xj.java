package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xj {
    public final ql1 a;
    public final H15186625828076266306 b;
    public final LinkedHashMap c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final AtomicInteger f;
    public final AtomicReference g;
    public final AtomicBoolean h;

    public xj(qq0 qq0Var, ql1 ql1Var) {
        qq0Var.getClass();
        ql1Var.getClass();
        this.a = ql1Var;
        this.b = new H15186625828076266306();
        this.c = new LinkedHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new AtomicInteger(0);
        this.g = new AtomicReference("");
        this.h = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.xj r4, java.lang.String r5, java.lang.String r6, dev.epro.r0.R4833348786910499294 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.uj
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.uj r0 = (ads_mobile_sdk.uj) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.uj r0 = new ads_mobile_sdk.uj
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.e
            int r1 = r0.g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            dev.epro.r0.H15186625828076266306 r4 = r0.d
            java.lang.String r6 = r0.c
            java.lang.String r5 = r0.b
            ads_mobile_sdk.xj r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            r7 = r4
            r4 = r0
            goto L4e
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L36:
            dev.epro.r0.E17665849472693074628.k(r7)
            dev.epro.r0.H15186625828076266306 r7 = r4.b
            r0.a = r4
            r0.b = r5
            r0.c = r6
            r0.d = r7
            r0.g = r2
            java.lang.Object r0 = r7.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4e
            return r1
        L4e:
            if (r6 == 0) goto L5f
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L57
            goto L5f
        L57:
            java.util.LinkedHashMap r4 = r4.c     // Catch: java.lang.Throwable -> L5d
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L5d
            goto L64
        L5d:
            r4 = move-exception
            goto L6a
        L5f:
            java.util.LinkedHashMap r4 = r4.c     // Catch: java.lang.Throwable -> L5d
            r4.remove(r5)     // Catch: java.lang.Throwable -> L5d
        L64:
            r7.b(r3)
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L6a:
            r7.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xj.a(ads_mobile_sdk.xj, java.lang.String, java.lang.String, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.xj r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.jj
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.jj r0 = (ads_mobile_sdk.jj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.jj r0 = new ads_mobile_sdk.jj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.xj r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L46
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L30:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.b
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r4
            r4 = r5
        L46:
            java.util.LinkedHashMap r5 = r0.c     // Catch: java.lang.Throwable -> L50
            r4.b(r3)
            java.util.Map r4 = dev.epro.r0.E4951175994894594588.z0(r5)
            return r4
        L50:
            r5 = move-exception
            r4.b(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xj.a(ads_mobile_sdk.xj, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
