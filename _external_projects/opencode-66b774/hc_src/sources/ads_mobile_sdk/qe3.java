package ads_mobile_sdk;

import dev.epro.r0.T13262009518181969142;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X11776734143967878387;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qe3 extends e2 {
    public final T13262009518181969142 l;
    public final T13262009518181969142 m;
    public final Optional n;

    /* renamed from: o, reason: collision with root package name */
    public final X11776734143967878387 f94o;
    public final kh0 p;
    public final W5797197595347441198 q;
    public final sb r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe3(T13262009518181969142 t13262009518181969142, T13262009518181969142 t132620095181819691422, Optional optional, X11776734143967878387 x11776734143967878387, kh0 kh0Var, W5797197595347441198 w5797197595347441198, sb sbVar, mi3 mi3Var, U4857089234315512256 u4857089234315512256, qw2 qw2Var, long j, int i, z1 z1Var, hv hvVar, d33 d33Var, String str, eg2 eg2Var) {
        super(mi3Var, u4857089234315512256, qw2Var, j, i, z1Var, hvVar, d33Var, str, eg2Var);
        t13262009518181969142.getClass();
        t132620095181819691422.getClass();
        optional.getClass();
        x11776734143967878387.getClass();
        kh0Var.getClass();
        w5797197595347441198.getClass();
        sbVar.getClass();
        mi3Var.getClass();
        u4857089234315512256.getClass();
        qw2Var.getClass();
        z1Var.getClass();
        hvVar.getClass();
        d33Var.getClass();
        str.getClass();
        eg2Var.getClass();
        this.l = t13262009518181969142;
        this.m = t132620095181819691422;
        this.n = optional;
        this.f94o = x11776734143967878387;
        this.p = kh0Var;
        this.q = w5797197595347441198;
        this.r = sbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.Q16898486116126855517 r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qe3.a(dev.epro.r0.Q16898486116126855517, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.U10184268024341301528
    public final boolean b() {
        return !this.f.b.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006e -> B:10:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.ArrayList r8, boolean r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.me3
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.me3 r0 = (ads_mobile_sdk.me3) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.me3 r0 = new ads_mobile_sdk.me3
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f
            int r1 = r0.h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 != r3) goto L36
            boolean r7 = r0.e
            java.lang.String r8 = r0.d
            java.util.Iterator r9 = r0.c
            dev.epro.r0.M16184408391440927034 r1 = r0.b
            ads_mobile_sdk.qe3 r2 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            r6 = r9
            r9 = r7
            r7 = r2
            r2 = r1
            r1 = r10
        L34:
            r10 = r6
            goto L72
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L3c:
            dev.epro.r0.E17665849472693074628.k(r10)
            java.util.Iterator r8 = r8.iterator()
            r6 = r9
            r9 = r8
            r8 = r6
        L46:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La3
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            ads_mobile_sdk.sb r1 = r7.r
            dev.epro.r0.U4857089234315512256 r4 = r7.b
            r0.a = r7
            r0.b = r2
            r0.c = r9
            r0.d = r10
            r0.e = r8
            r0.h = r3
            r1.getClass()
            java.lang.Object r1 = ads_mobile_sdk.sb.a(r1, r4, r10, r0)
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 != r4) goto L6e
            return r4
        L6e:
            r6 = r9
            r9 = r8
            r8 = r10
            goto L34
        L72:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L8e
            if (r2 != 0) goto L8e
            ads_mobile_sdk.tu0 r2 = new ads_mobile_sdk.tu0
            java.lang.String r1 = "The adapter requested for this mediation element ("
            java.lang.String r4 = ") is not eligible because it was excluded by AdRequest.skipUninitializedAdapters and has not yet successfully initialized."
            java.lang.String r8 = dev.epro.r0.G6547577305291411977.s(r1, r8, r4)
            r1 = 14
            r2.<init>(r8, r1)
        L8b:
            r8 = r9
            r9 = r10
            goto L46
        L8e:
            r7.getClass()
            dev.epro.r0.X11776734143967878387 r1 = r7.f94o
            ads_mobile_sdk.qw2 r4 = r7.c
            r5 = 4
            dev.epro.r0.Q16898486116126855517 r8 = dev.epro.r0.X11776734143967878387.a(r1, r8, r9, r4, r5)
            if (r8 != 0) goto L9d
            goto L8b
        L9d:
            ads_mobile_sdk.xu0 r7 = new ads_mobile_sdk.xu0
            r7.<init>(r8)
            return r7
        La3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qe3.a(java.util.ArrayList, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r8 == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0048, code lost:
    
        if (r8 == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // ads_mobile_sdk.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, dev.epro.r0.R4833348786910499294 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.pe3
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.pe3 r0 = (ads_mobile_sdk.pe3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.pe3 r0 = new ads_mobile_sdk.pe3
            dev.epro.r0.K14749510448791472029 r8 = (dev.epro.r0.K14749510448791472029) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L69
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L33:
            ads_mobile_sdk.qe3 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L4b
        L39:
            dev.epro.r0.E17665849472693074628.k(r8)
            ads_mobile_sdk.z1 r8 = r6.f
            java.util.ArrayList r8 = r8.b
            r0.a = r6
            r0.d = r4
            java.lang.Object r8 = r6.a(r8, r7, r0)
            if (r8 != r5) goto L4b
            goto L68
        L4b:
            dev.epro.r0.M16184408391440927034 r8 = (dev.epro.r0.M16184408391440927034) r8
            if (r8 == 0) goto L84
            boolean r7 = r8 instanceof ads_mobile_sdk.pu0
            if (r7 == 0) goto L56
            ads_mobile_sdk.pu0 r8 = (ads_mobile_sdk.pu0) r8
            return r8
        L56:
            ads_mobile_sdk.xu0 r8 = (ads_mobile_sdk.xu0) r8
            java.lang.Object r7 = r8.b
            dev.epro.r0.Q16898486116126855517 r7 = (dev.epro.r0.Q16898486116126855517) r7
            if (r7 == 0) goto L84
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r5) goto L69
        L68:
            return r5
        L69:
            dev.epro.r0.M16184408391440927034 r8 = (dev.epro.r0.M16184408391440927034) r8
            boolean r6 = r8 instanceof ads_mobile_sdk.pu0
            if (r6 == 0) goto L70
            return r8
        L70:
            boolean r6 = r8 instanceof ads_mobile_sdk.xu0
            if (r6 == 0) goto L80
            ads_mobile_sdk.xu0 r6 = new ads_mobile_sdk.xu0
            dev.epro.r0.G6219617120344415229 r7 = new dev.epro.r0.G6219617120344415229
            r0 = 3
            r7.<init>(r8, r0)
            r6.<init>(r7)
            return r6
        L80:
            dev.epro.r0.Z3383101362411723454.g()
            return r2
        L84:
            ads_mobile_sdk.su0 r7 = new ads_mobile_sdk.su0
            dev.epro.r0.S12306309242770307923 r8 = new dev.epro.r0.S12306309242770307923
            ads_mobile_sdk.z1 r6 = r6.f
            java.util.ArrayList r6 = r6.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to instantiate any mediation adapter class: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "undefined"
            r1 = 7
            r8.<init>(r1, r6, r0)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qe3.a(boolean, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }
}
