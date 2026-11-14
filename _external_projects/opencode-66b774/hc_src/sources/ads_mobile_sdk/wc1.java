package ads_mobile_sdk;

import dev.epro.r0.C5867465274389968370;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class wc1 extends jo {
    public final int e;
    public final p32 f;
    public final jr0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc1(String str, int i, mi3 mi3Var, C5867465274389968370 c5867465274389968370, p32 p32Var, jr0 jr0Var) {
        super(str, i, mi3Var, c5867465274389968370);
        str.getClass();
        mi3Var.getClass();
        c5867465274389968370.getClass();
        p32Var.getClass();
        jr0Var.getClass();
        this.e = i;
        this.f = p32Var;
        this.g = jr0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if (r10 != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (dev.epro.r0.O9245300239821758723.a == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.wc1 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.uc1
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.uc1 r0 = (ads_mobile_sdk.uc1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.uc1 r0 = new ads_mobile_sdk.uc1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            goto L90
        L2b:
            r9 = move-exception
            goto L93
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r2
        L33:
            ads_mobile_sdk.wc1 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L5f
        L39:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r9
            r0.d = r4
            ads_mobile_sdk.mi3 r10 = r9.c
            ads_mobile_sdk.th3 r1 = ads_mobile_sdk.ji3.a()
            r10.getClass()
            r1.a = r10
            ads_mobile_sdk.fh1 r10 = r10.b
            java.lang.String r1 = r9.a
            r10.a = r1
            int r1 = r9.b
            r10.c = r1
            dev.epro.r0.C5867465274389968370 r10 = r9.d
            r10.b(r0)
            dev.epro.r0.O9245300239821758723 r10 = dev.epro.r0.O9245300239821758723.a
            if (r10 != r5) goto L5f
            goto L8f
        L5f:
            ads_mobile_sdk.jr0 r10 = r9.g     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            r10.getClass()     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            java.lang.String r1 = "gads:load_timeout:milliseconds"
            dev.epro.r0.E17149812035295265804 r6 = dev.epro.r0.E17093345031926825464.b     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            dev.epro.r0.N13798149404328803870 r6 = dev.epro.r0.N13798149404328803870.MINUTES     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            r7 = 5
            long r6 = dev.epro.r0.M9216324016624295870.Z(r7, r6)     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            dev.epro.r0.E17093345031926825464 r8 = new dev.epro.r0.E17093345031926825464     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            r8.<init>(r6)     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            ads_mobile_sdk.ao r6 = ads_mobile_sdk.ao.a     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            java.lang.Object r10 = r10.a(r1, r8, r6)     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            dev.epro.r0.E17093345031926825464 r10 = (dev.epro.r0.E17093345031926825464) r10     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            long r6 = r10.a     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            dev.epro.r0.N4024785987441166868 r10 = new dev.epro.r0.N4024785987441166868     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            r1 = 25
            r10.<init>(r9, r2, r1)     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            r0.a = r2     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            r0.d = r3     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            java.lang.Object r10 = dev.epro.r0.V16504496955554646429.r(r6, r10, r0)     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            if (r10 != r5) goto L90
        L8f:
            return r5
        L90:
            dev.epro.r0.M16184408391440927034 r10 = (dev.epro.r0.M16184408391440927034) r10     // Catch: dev.epro.r0.P2480554073835519965 -> L2b
            return r10
        L93:
            ads_mobile_sdk.yu0 r10 = new ads_mobile_sdk.yu0
            r10.<init>(r9, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wc1.a(ads_mobile_sdk.wc1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
