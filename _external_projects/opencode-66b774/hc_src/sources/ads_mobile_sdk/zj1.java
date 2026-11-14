package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.D335540316075951619;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P10813970601447104553;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class zj1 extends tk0 {
    public final W5797197595347441198 d;
    public final W5797197595347441198 e;
    public final jr0 f;
    public final O16637889491137121389 g;
    public final O12043144740933444288 h;
    public final zq0 i;
    public final e23 j;
    public final sp3 k;
    public final kz2 l;
    public final D335540316075951619 m;
    public final V2597580950516131749 n;

    /* renamed from: o, reason: collision with root package name */
    public final rw0 f136o;
    public fz p;

    public zj1(Context context, W5797197595347441198 w5797197595347441198, W5797197595347441198 w57971975953474411982, jr0 jr0Var, O16637889491137121389 o16637889491137121389, O12043144740933444288 o12043144740933444288, zq0 zq0Var, e23 e23Var, P10813970601447104553 p10813970601447104553, sp3 sp3Var, kz2 kz2Var, D335540316075951619 d335540316075951619, V2597580950516131749 v2597580950516131749, rw0 rw0Var) {
        context.getClass();
        w5797197595347441198.getClass();
        w57971975953474411982.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        o12043144740933444288.getClass();
        zq0Var.getClass();
        e23Var.getClass();
        p10813970601447104553.getClass();
        sp3Var.getClass();
        kz2Var.getClass();
        d335540316075951619.getClass();
        v2597580950516131749.getClass();
        rw0Var.getClass();
        this.d = w5797197595347441198;
        this.e = w57971975953474411982;
        this.f = jr0Var;
        this.g = o16637889491137121389;
        this.h = o12043144740933444288;
        this.i = zq0Var;
        this.j = e23Var;
        this.k = sp3Var;
        this.l = kz2Var;
        this.m = d335540316075951619;
        this.n = v2597580950516131749;
        this.f136o = rw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #2 {all -> 0x0033, blocks: (B:12:0x002e, B:13:0x00ec, B:15:0x00f2), top: B:11:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107 A[Catch: all -> 0x0113, TryCatch #1 {all -> 0x0113, blocks: (B:22:0x0100, B:24:0x0107, B:26:0x010b, B:28:0x010f, B:29:0x0115, B:31:0x0119, B:33:0x011d, B:35:0x0121, B:36:0x0122, B:37:0x0127, B:38:0x0128, B:39:0x012f, B:40:0x0130, B:41:0x0137, B:42:0x0138), top: B:21:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138 A[Catch: all -> 0x0113, TRY_LEAVE, TryCatch #1 {all -> 0x0113, blocks: (B:22:0x0100, B:24:0x0107, B:26:0x010b, B:28:0x010f, B:29:0x0115, B:31:0x0119, B:33:0x011d, B:35:0x0121, B:36:0x0122, B:37:0x0127, B:38:0x0128, B:39:0x012f, B:40:0x0130, B:41:0x0137, B:42:0x0138), top: B:21:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008b A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #3 {all -> 0x0044, blocks: (B:55:0x0040, B:56:0x0085, B:58:0x008b), top: B:54:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a0 A[Catch: all -> 0x00ac, TryCatch #7 {all -> 0x00ac, blocks: (B:64:0x0099, B:66:0x00a0, B:68:0x00a4, B:70:0x00a8, B:71:0x00ae, B:73:0x00b2, B:75:0x00b6, B:77:0x00ba, B:78:0x00bb, B:79:0x00c0, B:80:0x00c1, B:81:0x00c8, B:82:0x00c9, B:83:0x00d0, B:84:0x00d1), top: B:63:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d1 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #7 {all -> 0x00ac, blocks: (B:64:0x0099, B:66:0x00a0, B:68:0x00a4, B:70:0x00a8, B:71:0x00ae, B:73:0x00b2, B:75:0x00b6, B:77:0x00ba, B:78:0x00bb, B:79:0x00c0, B:80:0x00c1, B:81:0x00c8, B:82:0x00c9, B:83:0x00d0, B:84:0x00d1), top: B:63:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0046  */
    @Override // ads_mobile_sdk.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r14, dev.epro.r0.R4833348786910499294 r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zj1.a(java.lang.String, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zj1.b(java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0100 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002c, B:13:0x00fa, B:15:0x0100), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0115 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:22:0x010e, B:24:0x0115, B:26:0x0119, B:28:0x011d, B:29:0x0123, B:31:0x0127, B:33:0x012b, B:35:0x012f, B:36:0x0130, B:37:0x0135, B:38:0x0136, B:39:0x013d, B:40:0x013e, B:41:0x0145, B:42:0x0146), top: B:21:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146 A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:22:0x010e, B:24:0x0115, B:26:0x0119, B:28:0x011d, B:29:0x0123, B:31:0x0127, B:33:0x012b, B:35:0x012f, B:36:0x0130, B:37:0x0135, B:38:0x0136, B:39:0x013d, B:40:0x013e, B:41:0x0145, B:42:0x0146), top: B:21:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #2 {all -> 0x0042, blocks: (B:55:0x003e, B:56:0x008c, B:58:0x0092), top: B:54:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7 A[Catch: all -> 0x00b3, TryCatch #3 {all -> 0x00b3, blocks: (B:64:0x00a0, B:66:0x00a7, B:68:0x00ab, B:70:0x00af, B:71:0x00b5, B:73:0x00b9, B:75:0x00bd, B:77:0x00c1, B:78:0x00c2, B:79:0x00c7, B:80:0x00c8, B:81:0x00cf, B:82:0x00d0, B:83:0x00d7, B:84:0x00d8), top: B:63:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d8 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #3 {all -> 0x00b3, blocks: (B:64:0x00a0, B:66:0x00a7, B:68:0x00ab, B:70:0x00af, B:71:0x00b5, B:73:0x00b9, B:75:0x00bd, B:77:0x00c1, B:78:0x00c2, B:79:0x00c7, B:80:0x00c8, B:81:0x00cf, B:82:0x00d0, B:83:0x00d7, B:84:0x00d8), top: B:63:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zj1.c(java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r8 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        if (r8 == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.K14749510448791472029 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.tj1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.tj1 r0 = (ads_mobile_sdk.tj1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.tj1 r0 = new ads_mobile_sdk.tj1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            ads_mobile_sdk.zj1 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L82
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L35:
            ads_mobile_sdk.zj1 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L61
        L3b:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r7
            r0.d = r4
            ads_mobile_sdk.jr0 r8 = r7.f
            java.lang.Object r8 = r8.a
            dev.epro.r0.P10813970601447104553 r8 = (dev.epro.r0.P10813970601447104553) r8
            ads_mobile_sdk.dr0 r8 = (ads_mobile_sdk.dr0) r8
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.f28o
            boolean r1 = r1.get()
            if (r1 == 0) goto L54
        L52:
            r8 = r5
            goto L5a
        L54:
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r6) goto L52
        L5a:
            if (r8 != r6) goto L5d
            goto L5e
        L5d:
            r8 = r5
        L5e:
            if (r8 != r6) goto L61
            goto L81
        L61:
            ads_mobile_sdk.jr0 r8 = r7.f
            java.lang.Object r8 = r8.a
            dev.epro.r0.P10813970601447104553 r8 = (dev.epro.r0.P10813970601447104553) r8
            ads_mobile_sdk.dr0 r8 = (ads_mobile_sdk.dr0) r8
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f28o
            boolean r8 = r8.get()
            if (r8 == 0) goto L77
            ads_mobile_sdk.xu0 r7 = new ads_mobile_sdk.xu0
            r7.<init>(r5)
            return r7
        L77:
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r7.b(r0)
            if (r8 != r6) goto L82
        L81:
            return r6
        L82:
            dev.epro.r0.M16184408391440927034 r8 = (dev.epro.r0.M16184408391440927034) r8
            boolean r0 = r8 instanceof ads_mobile_sdk.pu0
            if (r0 == 0) goto L8b
            ads_mobile_sdk.pu0 r8 = (ads_mobile_sdk.pu0) r8
            return r8
        L8b:
            r8.getClass()
            ads_mobile_sdk.xu0 r8 = (ads_mobile_sdk.xu0) r8
            java.lang.Object r8 = r8.b
            ads_mobile_sdk.re1 r8 = (ads_mobile_sdk.re1) r8
            ads_mobile_sdk.jr0 r7 = r7.f
            java.lang.Object r7 = r7.a
            dev.epro.r0.P10813970601447104553 r7 = (dev.epro.r0.P10813970601447104553) r7
            ads_mobile_sdk.dr0 r7 = (ads_mobile_sdk.dr0) r7
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.f28o
            boolean r7 = r7.get()
            if (r7 == 0) goto Laa
            ads_mobile_sdk.xu0 r7 = new ads_mobile_sdk.xu0
            r7.<init>(r5)
            return r7
        Laa:
            ads_mobile_sdk.tu0 r7 = new ads_mobile_sdk.tu0
            java.lang.String r8 = "Failed to get the CSRB flags"
            r7.<init>(r8, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zj1.e(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d5, code lost:
    
        if (dev.epro.r0.E17093345031926825464.c(r9, dev.epro.r0.E17093345031926825464.h(r1, ((dev.epro.r0.E17093345031926825464) r14.a("gads:sdk_core_ttl_seconds", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(30, r4)), r0)).a)) >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r15 == r9) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.zj1 r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            ads_mobile_sdk.ao r0 = ads_mobile_sdk.ao.a$2
            boolean r1 = r15 instanceof ads_mobile_sdk.wj1
            if (r1 == 0) goto L15
            r1 = r15
            ads_mobile_sdk.wj1 r1 = (ads_mobile_sdk.wj1) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.wj1 r1 = new ads_mobile_sdk.wj1
            r1.<init>(r14, r15)
        L1a:
            java.lang.Object r15 = r1.c
            int r2 = r1.e
            dev.epro.r0.N13798149404328803870 r3 = dev.epro.r0.N13798149404328803870.MILLISECONDS
            dev.epro.r0.N13798149404328803870 r4 = dev.epro.r0.N13798149404328803870.DAYS
            r5 = 30
            java.lang.String r6 = "gads:sdk_core_ttl_seconds"
            r7 = 2
            r8 = 1
            dev.epro.r0.Z3437138737604933638 r9 = dev.epro.r0.Z3437138737604933638.a
            if (r2 == 0) goto L45
            if (r2 == r8) goto L3f
            if (r2 != r7) goto L38
            long r9 = r1.b
            ads_mobile_sdk.zj1 r14 = r1.a
            dev.epro.r0.E17665849472693074628.k(r15)
            goto La9
        L38:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r14)
            r14 = 0
            return r14
        L3f:
            ads_mobile_sdk.zj1 r14 = r1.a
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L58
        L45:
            dev.epro.r0.E17665849472693074628.k(r15)
            ads_mobile_sdk.e23 r15 = r14.j
            r1.a = r14
            r1.e = r8
            r15.getClass()
            java.lang.Object r15 = ads_mobile_sdk.e23.a(r15, r1)
            if (r15 != r9) goto L58
            goto La7
        L58:
            ads_mobile_sdk.y13 r15 = (ads_mobile_sdk.y13) r15
            java.lang.String r15 = r15.o()
            r15.getClass()
            boolean r15 = dev.epro.r0.M8927913404651150384.Y(r15)
            if (r15 != 0) goto Ld8
            ads_mobile_sdk.jr0 r15 = r14.f
            dev.epro.r0.F6899175859206092457 r15 = r15.s
            r15.getClass()
            dev.epro.r0.E17149812035295265804 r2 = dev.epro.r0.E17093345031926825464.b
            long r10 = dev.epro.r0.M9216324016624295870.Z(r5, r4)
            dev.epro.r0.E17093345031926825464 r2 = new dev.epro.r0.E17093345031926825464
            r2.<init>(r10)
            java.lang.Object r15 = r15.a(r6, r2, r0)
            dev.epro.r0.E17093345031926825464 r15 = (dev.epro.r0.E17093345031926825464) r15
            long r10 = r15.a
            r12 = 0
            int r15 = dev.epro.r0.E17093345031926825464.c(r10, r12)
            if (r15 <= 0) goto Ld9
            dev.epro.r0.O16637889491137121389 r15 = r14.g
            r15.getClass()
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = dev.epro.r0.M9216324016624295870.a0(r10, r3)
            ads_mobile_sdk.e23 r15 = r14.j
            r1.a = r14
            r1.b = r10
            r1.e = r7
            r15.getClass()
            java.lang.Object r15 = ads_mobile_sdk.e23.a(r15, r1)
            if (r15 != r9) goto La8
        La7:
            return r9
        La8:
            r9 = r10
        La9:
            ads_mobile_sdk.y13 r15 = (ads_mobile_sdk.y13) r15
            long r1 = r15.q()
            long r1 = dev.epro.r0.M9216324016624295870.a0(r1, r3)
            ads_mobile_sdk.jr0 r14 = r14.f
            dev.epro.r0.F6899175859206092457 r14 = r14.s
            r14.getClass()
            dev.epro.r0.E17149812035295265804 r15 = dev.epro.r0.E17093345031926825464.b
            long r3 = dev.epro.r0.M9216324016624295870.Z(r5, r4)
            dev.epro.r0.E17093345031926825464 r15 = new dev.epro.r0.E17093345031926825464
            r15.<init>(r3)
            java.lang.Object r14 = r14.a(r6, r15, r0)
            dev.epro.r0.E17093345031926825464 r14 = (dev.epro.r0.E17093345031926825464) r14
            long r14 = r14.a
            long r14 = dev.epro.r0.E17093345031926825464.h(r1, r14)
            int r14 = dev.epro.r0.E17093345031926825464.c(r9, r14)
            if (r14 >= 0) goto Ld8
            goto Ld9
        Ld8:
            r8 = 0
        Ld9:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r8)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zj1.a(ads_mobile_sdk.zj1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r2.v(r3) == r11) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // ads_mobile_sdk.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.re1 r18, dev.epro.r0.R4833348786910499294 r19) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zj1.a(ads_mobile_sdk.re1, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r8 == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ads_mobile_sdk.zj1 r6, java.lang.String r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.yj1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.yj1 r0 = (ads_mobile_sdk.yj1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.yj1 r0 = new ads_mobile_sdk.yj1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            java.lang.Object r6 = r0.a
            java.lang.String r6 = (java.lang.String) r6
            dev.epro.r0.E17665849472693074628.k(r8)
            return r6
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L35:
            java.lang.Object r6 = r0.a
            ads_mobile_sdk.zj1 r6 = (ads_mobile_sdk.zj1) r6
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L4b
        L3d:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r6
            r0.d = r4
            java.lang.Object r8 = r6.c(r7, r0)
            if (r8 != r5) goto L4b
            goto L7b
        L4b:
            dev.epro.r0.M16184408391440927034 r8 = (dev.epro.r0.M16184408391440927034) r8
            boolean r7 = r8 instanceof ads_mobile_sdk.pu0
            if (r7 == 0) goto L52
            return r2
        L52:
            r8.getClass()
            ads_mobile_sdk.xu0 r8 = (ads_mobile_sdk.xu0) r8
            java.lang.Object r7 = r8.b
            ads_mobile_sdk.a21 r7 = (ads_mobile_sdk.a21) r7
            ads_mobile_sdk.ww2 r7 = r7.d
            if (r7 == 0) goto L63
            java.lang.String r2 = ads_mobile_sdk.ww2.a(r7)
        L63:
            if (r2 == 0) goto L7c
            boolean r7 = dev.epro.r0.M8927913404651150384.Y(r2)
            if (r7 == 0) goto L6c
            goto L7c
        L6c:
            ads_mobile_sdk.e23 r6 = r6.j
            r0.a = r2
            r0.d = r3
            r6.getClass()
            java.lang.Object r6 = ads_mobile_sdk.e23.a(r6, r2, r0)
            if (r6 != r5) goto L7c
        L7b:
            return r5
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zj1.b(ads_mobile_sdk.zj1, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r9 == r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.zj1 r7, java.lang.String r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.uj1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.uj1 r0 = (ads_mobile_sdk.uj1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.uj1 r0 = new ads_mobile_sdk.uj1
            r0.<init>(r7, r9)
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
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L33:
            ads_mobile_sdk.zj1 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L47
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r7
            r0.d = r5
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r6) goto L47
            goto L61
        L47:
            dev.epro.r0.M16184408391440927034 r9 = (dev.epro.r0.M16184408391440927034) r9
            boolean r8 = r9 instanceof ads_mobile_sdk.pu0
            if (r8 == 0) goto L4e
            goto L62
        L4e:
            r9.getClass()
            ads_mobile_sdk.xu0 r9 = (ads_mobile_sdk.xu0) r9
            java.lang.Object r8 = r9.b
            ads_mobile_sdk.re1 r8 = (ads_mobile_sdk.re1) r8
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.c(r8, r0)
            if (r7 != r6) goto L62
        L61:
            return r6
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zj1.a(ads_mobile_sdk.zj1, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r9 == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r7, java.util.concurrent.Executor r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.xj1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.xj1 r0 = (ads_mobile_sdk.xj1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.xj1 r0 = new ads_mobile_sdk.xj1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L31:
            java.util.concurrent.Executor r8 = r0.b
            java.util.List r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L49
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = r6.b(r0)
            if (r9 != r5) goto L49
            goto L80
        L49:
            dev.epro.r0.M16184408391440927034 r9 = (dev.epro.r0.M16184408391440927034) r9
            boolean r6 = r9 instanceof ads_mobile_sdk.pu0
            if (r6 == 0) goto L52
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L52:
            r9.getClass()
            ads_mobile_sdk.xu0 r9 = (ads_mobile_sdk.xu0) r9
            java.lang.Object r6 = r9.b
            ads_mobile_sdk.re1 r6 = (ads_mobile_sdk.re1) r6
            r0.a = r4
            r0.b = r4
            r0.e = r2
            ads_mobile_sdk.tx0 r9 = r6.a
            if (r9 != 0) goto L68
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L7e
        L68:
            java.util.concurrent.ConcurrentLinkedQueue r1 = r9.z
            r1.offer(r7)
            dev.epro.r0.W5797197595347441198 r6 = r6.b
            dev.epro.r0.G8001132634698687269 r6 = r6.h()
            dev.epro.r0.E13942609761711486177 r7 = new dev.epro.r0.E13942609761711486177
            r1 = 12
            r7.<init>(r9, r8, r4, r1)
            java.lang.Object r6 = dev.epro.r0.R7033599853981556291.d0(r6, r7, r0)
        L7e:
            if (r6 != r5) goto L81
        L80:
            return r5
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zj1.a(java.util.List, java.util.concurrent.Executor, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
