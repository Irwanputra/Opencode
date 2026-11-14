package ads_mobile_sdk;

import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class dk3 extends dr {
    public final fz l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk3(fz fzVar, jr0 jr0Var, g0 g0Var, kz2 kz2Var, O16637889491137121389 o16637889491137121389, W5797197595347441198 w5797197595347441198) {
        super(o16637889491137121389, w5797197595347441198, kz2Var, jr0Var, g0Var);
        jr0Var.getClass();
        o16637889491137121389.getClass();
        w5797197595347441198.getClass();
        kz2Var.getClass();
        g0Var.getClass();
        fzVar.getClass();
        this.l = fzVar;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public final cw0 mo19a() {
        return cw0.TRUSTLESS_TOKEN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // dev.epro.r0.K4548097313143615345
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.bk3
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.bk3 r0 = (ads_mobile_sdk.bk3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            ads_mobile_sdk.bk3 r0 = new ads_mobile_sdk.bk3
            dev.epro.r0.K14749510448791472029 r8 = (dev.epro.r0.K14749510448791472029) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L80
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L31:
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L61
        L35:
            dev.epro.r0.E17665849472693074628.k(r8)
            ads_mobile_sdk.jr0 r8 = r7.f
            dev.epro.r0.S12091007627917879797 r8 = r8.r
            r8.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ads_mobile_sdk.ao r5 = ads_mobile_sdk.ao.a$11
            java.lang.String r6 = "gads:trustless_token_caching_in_signal_source_enabled"
            java.lang.Object r8 = r8.a(r6, r1, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            ads_mobile_sdk.fz r7 = r7.l
            if (r8 == 0) goto L74
            r0.c = r4
            r7.getClass()
            java.lang.Object r8 = ads_mobile_sdk.fz.h(r7, r0)
            if (r8 != r1) goto L61
            goto L7f
        L61:
            dev.epro.r0.M16184408391440927034 r8 = (dev.epro.r0.M16184408391440927034) r8
            if (r8 == 0) goto L92
            boolean r7 = r8 instanceof ads_mobile_sdk.pu0
            if (r7 == 0) goto L6c
            ads_mobile_sdk.pu0 r8 = (ads_mobile_sdk.pu0) r8
            return r8
        L6c:
            ads_mobile_sdk.xu0 r8 = (ads_mobile_sdk.xu0) r8
            java.lang.Object r7 = r8.b
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2
            goto L92
        L74:
            r0.c = r3
            r7.getClass()
            java.lang.Object r8 = ads_mobile_sdk.fz.i(r7, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            dev.epro.r0.M16184408391440927034 r8 = (dev.epro.r0.M16184408391440927034) r8
            if (r8 == 0) goto L92
            boolean r7 = r8 instanceof ads_mobile_sdk.pu0
            if (r7 == 0) goto L8b
            ads_mobile_sdk.pu0 r8 = (ads_mobile_sdk.pu0) r8
            return r8
        L8b:
            ads_mobile_sdk.xu0 r8 = (ads_mobile_sdk.xu0) r8
            java.lang.Object r7 = r8.b
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2
        L92:
            ads_mobile_sdk.xu0 r7 = new ads_mobile_sdk.xu0
            ads_mobile_sdk.ak3 r8 = new ads_mobile_sdk.ak3
            r8.<init>(r2)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk3.d(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // ads_mobile_sdk.dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(dev.epro.r0.R4833348786910499294 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.ck3
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ck3 r0 = (ads_mobile_sdk.ck3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.ck3 r0 = new ads_mobile_sdk.ck3
            dev.epro.r0.K14749510448791472029 r9 = (dev.epro.r0.K14749510448791472029) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            dev.epro.r0.E17665849472693074628.k(r9)
            return r9
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r2
        L33:
            ads_mobile_sdk.dk3 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L65
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.jr0 r9 = r8.f
            dev.epro.r0.S12091007627917879797 r9 = r9.r
            r9.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ads_mobile_sdk.ao r6 = ads_mobile_sdk.ao.a$11
            java.lang.String r7 = "gads:trustless_token_caching_in_signal_source_enabled"
            java.lang.Object r9 = r9.a(r7, r1, r6)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7d
            r0.a = r8
            r0.d = r4
            ads_mobile_sdk.fz r9 = r8.l
            r9.getClass()
            java.lang.Object r9 = ads_mobile_sdk.fz.k(r9, r0)
            if (r9 != r5) goto L65
            goto L7b
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6e
            goto L7d
        L6e:
            r0.a = r2
            r0.d = r3
            r8.getClass()
            java.lang.Object r8 = ads_mobile_sdk.dr.b(r8, r0)
            if (r8 != r5) goto L7c
        L7b:
            return r5
        L7c:
            return r8
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk3.k(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }
}
