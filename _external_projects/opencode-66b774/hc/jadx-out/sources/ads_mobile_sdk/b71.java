package ads_mobile_sdk;

import android.os.Bundle;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.I12024973293062010767;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.M9264509465983414107;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P16422848101170923038;
import dev.epro.r0.Q3791352212346016950;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S12306309242770307923;
import dev.epro.r0.S3216761178606715008;
import dev.epro.r0.X2485016533998461232;
import dev.epro.r0.Y12917327898100101934;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class b71 implements S3216761178606715008, I12024973293062010767 {
    public final w81 a;
    public final qw2 b;
    public final Optional c;
    public final String d;
    public final boolean e;
    public final O16637889491137121389 f;
    public final F14240031463097426304 g;
    public final jr0 h;
    public final Optional i;
    public String j;
    public final H15186625828076266306 k;
    public int l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public I16631908410500040363 f10o;
    public String p;
    public String q;
    public String r;
    public I16631908410500040363 s;
    public I16631908410500040363 t;
    public pu0 u;
    public F11004654978627682545 v;
    public long w;
    public volatile boolean x;

    public b71(w81 w81Var, qw2 qw2Var, Optional optional, String str, boolean z, O16637889491137121389 o16637889491137121389, F14240031463097426304 f14240031463097426304, jr0 jr0Var, Optional optional2) {
        w81Var.getClass();
        qw2Var.getClass();
        optional.getClass();
        str.getClass();
        o16637889491137121389.getClass();
        f14240031463097426304.getClass();
        jr0Var.getClass();
        optional2.getClass();
        this.a = w81Var;
        this.b = qw2Var;
        this.c = optional;
        this.d = str;
        this.e = z;
        this.f = o16637889491137121389;
        this.g = f14240031463097426304;
        this.h = jr0Var;
        this.i = optional2;
        this.k = new H15186625828076266306();
        this.l = 1;
        this.f10o = new I16631908410500040363();
        this.p = "";
        this.q = "";
        this.r = "";
        this.s = new I16631908410500040363();
        this.t = new I16631908410500040363();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.w = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.b71 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            boolean r1 = r10 instanceof ads_mobile_sdk.y61
            if (r1 == 0) goto L15
            r1 = r10
            ads_mobile_sdk.y61 r1 = (ads_mobile_sdk.y61) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.y61 r1 = new ads_mobile_sdk.y61
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.c
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            int r3 = r1.e
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2e
            java.lang.String r9 = r1.b
            ads_mobile_sdk.b71 r1 = r1.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L7c
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r4
        L34:
            dev.epro.r0.E17665849472693074628.k(r10)
            java.util.Optional r10 = r9.c
            java.lang.Object r10 = dev.epro.r0.M18113111391818111737.H(r10)
            dev.epro.r0.U4857089234315512256 r10 = (dev.epro.r0.U4857089234315512256) r10
            if (r10 == 0) goto L45
            java.lang.String r4 = r10.e()
        L45:
            if (r4 != 0) goto L49
            r10 = r5
            goto L4a
        L49:
            r10 = 0
        L4a:
            java.util.Optional r3 = r9.i
            java.lang.Object r3 = dev.epro.r0.M18113111391818111737.H(r3)
            dev.epro.r0.G8416418761784758585 r3 = (dev.epro.r0.G8416418761784758585) r3
            java.util.Optional r3 = r9.c
            dev.epro.r0.M18113111391818111737.H(r3)
            ads_mobile_sdk.jr0 r3 = r9.h
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            ads_mobile_sdk.ao r7 = ads_mobile_sdk.ao.a$11
            java.lang.String r8 = "gads:inspector:s2s_enabled"
            java.lang.Object r3 = r3.a(r8, r6, r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r10 == 0) goto L68
            goto L96
        L68:
            ads_mobile_sdk.w81 r10 = r9.a
            r1.a = r9
            r1.b = r4
            r1.e = r5
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.w81.a(r10, r1)
            if (r10 != r2) goto L7a
            return r2
        L7a:
            r1 = r9
            r9 = r4
        L7c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L96
            if (r9 != 0) goto L92
            ads_mobile_sdk.qw2 r9 = r1.b
            java.lang.String r9 = r9.name()
            java.lang.String r10 = "SERVER_TO_SERVER_AD_UNIT_"
            java.lang.String r9 = dev.epro.r0.G6547577305291411977.C(r10, r9)
        L92:
            r1.j = r9
            r1.x = r5
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b71.b(ads_mobile_sdk.b71, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final I16631908410500040363 a(F11004654978627682545 f11004654978627682545) {
        K15572083692188606544 k15572083692188606544;
        K15572083692188606544 i16631908410500040363;
        I16631908410500040363 i166319084105000403632 = new I16631908410500040363();
        i166319084105000403632.t("winningAdapterClassName", f11004654978627682545.b());
        long j = this.w;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        i166319084105000403632.s("responseSecsSinceEpoch", Long.valueOf(E17093345031926825464.k(j, N13798149404328803870.SECONDS)));
        i166319084105000403632.t("responseId", f11004654978627682545.c());
        i166319084105000403632.t("adRequestUrl", this.p);
        i166319084105000403632.t("postBody", this.r);
        i166319084105000403632.t("adResponseBody", this.q);
        i166319084105000403632.r("hasExceededMemoryLimit", Boolean.valueOf(this.m));
        i166319084105000403632.q("adResponseHeaders", this.t);
        i166319084105000403632.q("transactionExtras", this.s);
        i166319084105000403632.q("biddingData", this.f10o);
        P16422848101170923038 p16422848101170923038 = new P16422848101170923038();
        Iterator it = f11004654978627682545.a().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            k15572083692188606544 = Y12917327898100101934.a;
            if (!zHasNext) {
                break;
            }
            M9264509465983414107 m9264509465983414107 = (M9264509465983414107) it.next();
            I16631908410500040363 i166319084105000403633 = new I16631908410500040363();
            i166319084105000403633.t("adapterClassName", m9264509465983414107.b());
            i166319084105000403633.s("latencyMillis", Long.valueOf(m9264509465983414107.g()));
            Bundle bundleC = m9264509465983414107.c();
            try {
                F14240031463097426304 f14240031463097426304 = this.g;
                i16631908410500040363 = (I16631908410500040363) f14240031463097426304.b(I16631908410500040363.class, f14240031463097426304.g(bundleC));
            } catch (Exception e) {
                ArrayList arrayList = G6547577305291411977.l(e).s;
                String message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                arrayList.add(message);
                i16631908410500040363 = null;
            }
            if (i16631908410500040363 == null) {
                i16631908410500040363 = new I16631908410500040363();
            }
            i166319084105000403633.q("credentials", i16631908410500040363);
            S12306309242770307923 s12306309242770307923A = m9264509465983414107.a();
            if (s12306309242770307923A != null) {
                I16631908410500040363 i166319084105000403634 = new I16631908410500040363();
                i166319084105000403634.t("errorDomain", s12306309242770307923A.M());
                i166319084105000403634.s("errorCode", s12306309242770307923A.L());
                i166319084105000403634.t("errorDescription", s12306309242770307923A.N());
                i166319084105000403634.q("underlyingError", k15572083692188606544);
                k15572083692188606544 = i166319084105000403634;
            }
            i166319084105000403633.q("error", k15572083692188606544);
            p16422848101170923038.q(i166319084105000403633);
        }
        i166319084105000403632.q("adNetworks", p16422848101170923038);
        pu0 pu0Var = this.u;
        if (f11004654978627682545.a().isEmpty() && pu0Var != null) {
            P16422848101170923038 p164228481011709230382 = new P16422848101170923038();
            I16631908410500040363 i166319084105000403635 = new I16631908410500040363();
            i166319084105000403635.t("errorDomain", "com.google.android.libraries.ads.mobile.sdk");
            i166319084105000403635.t("errorCode", X2485016533998461232._a(pu0Var.a()).name());
            i166319084105000403635.t("errorDescription", Q3791352212346016950.d(pu0Var));
            i166319084105000403635.q("underlyingError", k15572083692188606544);
            p164228481011709230382.q(i166319084105000403635);
            i166319084105000403632.q("errors", p164228481011709230382);
        }
        return i166319084105000403632;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dev.epro.r0.R4833348786910499294 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.a71
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.a71 r0 = (ads_mobile_sdk.a71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.a71 r0 = new ads_mobile_sdk.a71
            dev.epro.r0.K14749510448791472029 r7 = (dev.epro.r0.K14749510448791472029) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            dev.epro.r0.H15186625828076266306 r6 = r0.b
            ads_mobile_sdk.b71 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            r7 = r6
            r6 = r0
            goto L48
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.a = r6
            dev.epro.r0.H15186625828076266306 r7 = r6.k
            r0.b = r7
            r0.e = r2
            java.lang.Object r0 = r7.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L48
            return r1
        L48:
            dev.epro.r0.I16631908410500040363 r0 = new dev.epro.r0.I16631908410500040363     // Catch: java.lang.Throwable -> L90
            r0.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "state"
            int r4 = r6.l     // Catch: java.lang.Throwable -> L90
            boolean r5 = r6.e     // Catch: java.lang.Throwable -> L90
            if (r4 == r2) goto L62
            r2 = 2
            if (r4 == r2) goto L5f
            r2 = 3
            if (r4 != r2) goto L5e
            java.lang.String r2 = "AD_LOAD_FAILED"
            goto L64
        L5e:
            throw r3     // Catch: java.lang.Throwable -> L90
        L5f:
            java.lang.String r2 = "AD_LOADED"
            goto L64
        L62:
            java.lang.String r2 = "AD_REQUESTED"
        L64:
            r0.t(r1, r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "format"
            ads_mobile_sdk.qw2 r2 = r6.b     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L90
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r2.toUpperCase(r4)     // Catch: java.lang.Throwable -> L90
            r2.getClass()     // Catch: java.lang.Throwable -> L90
            r0.t(r1, r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "isOutOfContext"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L90
            r0.r(r1, r2)     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L92
            java.lang.String r1 = "shown"
            boolean r2 = r6.n     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L90
            r0.r(r1, r2)     // Catch: java.lang.Throwable -> L90
            goto L92
        L90:
            r6 = move-exception
            goto La3
        L92:
            dev.epro.r0.F11004654978627682545 r1 = r6.v     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L9f
            java.lang.String r2 = "responseInfo"
            dev.epro.r0.I16631908410500040363 r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L90
            r0.q(r2, r6)     // Catch: java.lang.Throwable -> L90
        L9f:
            r7.b(r3)
            return r0
        La3:
            r7.b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b71.c(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.S3216761178606715008
    public final Object b(R4833348786910499294 r4833348786910499294) {
        return b(this, (K14749510448791472029) r4833348786910499294);
    }

    @Override // dev.epro.r0.I12024973293062010767
    public final Object a(pu0 pu0Var, F11004654978627682545 f11004654978627682545, R4833348786910499294 r4833348786910499294) {
        return a(this, pu0Var, f11004654978627682545, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.b71 r8, ads_mobile_sdk.pu0 r9, dev.epro.r0.F11004654978627682545 r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            boolean r1 = r11 instanceof ads_mobile_sdk.v61
            if (r1 == 0) goto L15
            r1 = r11
            ads_mobile_sdk.v61 r1 = (ads_mobile_sdk.v61) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g = r2
            goto L1a
        L15:
            ads_mobile_sdk.v61 r1 = new ads_mobile_sdk.v61
            r1.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r1.e
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            int r3 = r1.g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L4a
            if (r3 == r6) goto L3c
            if (r3 == r5) goto L36
            if (r3 != r4) goto L30
            dev.epro.r0.E17665849472693074628.k(r11)
            return r0
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r7
        L36:
            ads_mobile_sdk.b71 r8 = r1.a
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L98
        L3c:
            dev.epro.r0.H15186625828076266306 r8 = r1.d
            dev.epro.r0.F11004654978627682545 r10 = r1.c
            ads_mobile_sdk.pu0 r9 = r1.b
            ads_mobile_sdk.b71 r3 = r1.a
            dev.epro.r0.E17665849472693074628.k(r11)
            r11 = r8
            r8 = r3
            goto L65
        L4a:
            dev.epro.r0.E17665849472693074628.k(r11)
            boolean r11 = r8.x
            if (r11 != 0) goto L52
            goto La8
        L52:
            dev.epro.r0.H15186625828076266306 r11 = r8.k
            r1.a = r8
            r1.b = r9
            r1.c = r10
            r1.d = r11
            r1.g = r6
            java.lang.Object r3 = r11.c(r1)
            if (r3 != r2) goto L65
            goto La7
        L65:
            r8.l = r4     // Catch: java.lang.Throwable -> Laf
            r8.u = r9     // Catch: java.lang.Throwable -> Laf
            r8.v = r10     // Catch: java.lang.Throwable -> Laf
            dev.epro.r0.E17149812035295265804 r9 = dev.epro.r0.E17093345031926825464.b     // Catch: java.lang.Throwable -> Laf
            dev.epro.r0.O16637889491137121389 r9 = r8.f     // Catch: java.lang.Throwable -> Laf
            r9.getClass()     // Catch: java.lang.Throwable -> Laf
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Laf
            dev.epro.r0.N13798149404328803870 r3 = dev.epro.r0.N13798149404328803870.MILLISECONDS     // Catch: java.lang.Throwable -> Laf
            long r9 = dev.epro.r0.M9216324016624295870.a0(r9, r3)     // Catch: java.lang.Throwable -> Laf
            r8.w = r9     // Catch: java.lang.Throwable -> Laf
            r11.b(r7)
            ads_mobile_sdk.w81 r9 = r8.a
            java.lang.String r10 = r8.j
            if (r10 == 0) goto La9
            r1.a = r8
            r1.b = r7
            r1.c = r7
            r1.d = r7
            r1.g = r5
            java.lang.Object r9 = r9.a(r10, r8, r1)
            if (r9 != r2) goto L98
            goto La7
        L98:
            ads_mobile_sdk.w81 r8 = r8.a
            r1.a = r7
            r1.g = r4
            r8.getClass()
            java.lang.Object r8 = ads_mobile_sdk.w81.d(r8, r1)
            if (r8 != r2) goto La8
        La7:
            return r2
        La8:
            return r0
        La9:
            java.lang.String r8 = "adUnitId"
            dev.epro.r0.S10823041268949770285.b0(r8)
            throw r7
        Laf:
            r8 = move-exception
            r11.b(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b71.a(ads_mobile_sdk.b71, ads_mobile_sdk.pu0, dev.epro.r0.F11004654978627682545, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.I12024973293062010767
    public final Object a(d33 d33Var, z1 z1Var, F11004654978627682545 f11004654978627682545, R4833348786910499294 r4833348786910499294) {
        return a(this, f11004654978627682545, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.b71 r10, dev.epro.r0.F11004654978627682545 r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            boolean r1 = r12 instanceof ads_mobile_sdk.w61
            if (r1 == 0) goto L15
            r1 = r12
            ads_mobile_sdk.w61 r1 = (ads_mobile_sdk.w61) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f = r2
            goto L1a
        L15:
            ads_mobile_sdk.w61 r1 = new ads_mobile_sdk.w61
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.d
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            int r3 = r1.f
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L48
            if (r3 == r6) goto L3c
            if (r3 == r5) goto L36
            if (r3 != r4) goto L30
            dev.epro.r0.E17665849472693074628.k(r12)
            return r0
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            return r7
        L36:
            ads_mobile_sdk.b71 r10 = r1.a
            dev.epro.r0.E17665849472693074628.k(r12)
            goto L90
        L3c:
            dev.epro.r0.H15186625828076266306 r10 = r1.c
            dev.epro.r0.F11004654978627682545 r11 = r1.b
            ads_mobile_sdk.b71 r3 = r1.a
            dev.epro.r0.E17665849472693074628.k(r12)
            r12 = r10
            r10 = r3
            goto L61
        L48:
            dev.epro.r0.E17665849472693074628.k(r12)
            boolean r12 = r10.x
            if (r12 != 0) goto L50
            goto La0
        L50:
            dev.epro.r0.H15186625828076266306 r12 = r10.k
            r1.a = r10
            r1.b = r11
            r1.c = r12
            r1.f = r6
            java.lang.Object r3 = r12.c(r1)
            if (r3 != r2) goto L61
            goto L9f
        L61:
            r10.l = r5     // Catch: java.lang.Throwable -> La7
            r10.v = r11     // Catch: java.lang.Throwable -> La7
            dev.epro.r0.E17149812035295265804 r11 = dev.epro.r0.E17093345031926825464.b     // Catch: java.lang.Throwable -> La7
            dev.epro.r0.O16637889491137121389 r11 = r10.f     // Catch: java.lang.Throwable -> La7
            r11.getClass()     // Catch: java.lang.Throwable -> La7
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La7
            dev.epro.r0.N13798149404328803870 r11 = dev.epro.r0.N13798149404328803870.MILLISECONDS     // Catch: java.lang.Throwable -> La7
            long r8 = dev.epro.r0.M9216324016624295870.a0(r8, r11)     // Catch: java.lang.Throwable -> La7
            r10.w = r8     // Catch: java.lang.Throwable -> La7
            r12.b(r7)
            ads_mobile_sdk.w81 r11 = r10.a
            java.lang.String r12 = r10.j
            if (r12 == 0) goto La1
            r1.a = r10
            r1.b = r7
            r1.c = r7
            r1.f = r5
            java.lang.Object r11 = r11.a(r12, r10, r1)
            if (r11 != r2) goto L90
            goto L9f
        L90:
            ads_mobile_sdk.w81 r10 = r10.a
            r1.a = r7
            r1.f = r4
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.w81.d(r10, r1)
            if (r10 != r2) goto La0
        L9f:
            return r2
        La0:
            return r0
        La1:
            java.lang.String r10 = "adUnitId"
            dev.epro.r0.S10823041268949770285.b0(r10)
            throw r7
        La7:
            r10 = move-exception
            r12.b(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b71.a(ads_mobile_sdk.b71, dev.epro.r0.F11004654978627682545, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.S3216761178606715008
    public final Object a(d33 d33Var, R4833348786910499294 r4833348786910499294) {
        return a(this, d33Var, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:30:0x00a0, B:32:0x00a8, B:33:0x00b5), top: B:40:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:30:0x00a0, B:32:0x00a8, B:33:0x00b5), top: B:40:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.b71 r10, ads_mobile_sdk.d33 r11, dev.epro.r0.K14749510448791472029 r12) throws java.lang.Throwable {
        /*
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            boolean r1 = r12 instanceof ads_mobile_sdk.x61
            if (r1 == 0) goto L15
            r1 = r12
            ads_mobile_sdk.x61 r1 = (ads_mobile_sdk.x61) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f = r2
            goto L1a
        L15:
            ads_mobile_sdk.x61 r1 = new ads_mobile_sdk.x61
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.d
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            int r3 = r1.f
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L49
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L37
            dev.epro.r0.R8015591507171738907 r10 = r1.c
            ads_mobile_sdk.d33 r11 = r1.b
            ads_mobile_sdk.b71 r1 = r1.a
            dev.epro.r0.E17665849472693074628.k(r12)     // Catch: java.lang.Throwable -> L34
            goto La0
        L34:
            r11 = move-exception
            goto Lbd
        L37:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            return r6
        L3d:
            dev.epro.r0.R8015591507171738907 r10 = r1.c
            ads_mobile_sdk.d33 r11 = r1.b
            ads_mobile_sdk.b71 r3 = r1.a
            dev.epro.r0.E17665849472693074628.k(r12)
            r12 = r10
            r10 = r3
            goto L62
        L49:
            dev.epro.r0.E17665849472693074628.k(r12)
            boolean r12 = r10.x
            if (r12 != 0) goto L51
            return r0
        L51:
            dev.epro.r0.H15186625828076266306 r12 = r10.k
            r1.a = r10
            r1.b = r11
            r1.c = r12
            r1.f = r5
            java.lang.Object r3 = r12.c(r1)
            if (r3 != r2) goto L62
            goto L9b
        L62:
            ads_mobile_sdk.z23 r3 = r11.b     // Catch: java.lang.Throwable -> Lbb
            ads_mobile_sdk.hv r3 = r3.b     // Catch: java.lang.Throwable -> Lbb
            dev.epro.r0.I16631908410500040363 r7 = r3.f     // Catch: java.lang.Throwable -> Lbb
            r10.f10o = r7     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = r3.c     // Catch: java.lang.Throwable -> Lbb
            r10.p = r7     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = r3.b     // Catch: java.lang.Throwable -> Lbb
            r10.r = r7     // Catch: java.lang.Throwable -> Lbb
            dev.epro.r0.I16631908410500040363 r7 = r3.i     // Catch: java.lang.Throwable -> Lbb
            r10.s = r7     // Catch: java.lang.Throwable -> Lbb
            ads_mobile_sdk.w81 r7 = r10.a     // Catch: java.lang.Throwable -> Lbb
            dev.epro.r0.I16631908410500040363 r3 = r3.e     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lbb
            int r3 = r3.length()     // Catch: java.lang.Throwable -> Lbb
            ads_mobile_sdk.z23 r8 = r11.b     // Catch: java.lang.Throwable -> Lbb
            ads_mobile_sdk.hv r8 = r8.b     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = r8.d     // Catch: java.lang.Throwable -> Lbb
            int r8 = r8.length()     // Catch: java.lang.Throwable -> Lbb
            int r3 = r3 + r8
            r1.a = r10     // Catch: java.lang.Throwable -> Lbb
            r1.b = r11     // Catch: java.lang.Throwable -> Lbb
            r1.c = r12     // Catch: java.lang.Throwable -> Lbb
            r1.f = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r1 = r7.a(r3, r1)     // Catch: java.lang.Throwable -> Lbb
            if (r1 != r2) goto L9c
        L9b:
            return r2
        L9c:
            r9 = r1
            r1 = r10
            r10 = r12
            r12 = r9
        La0:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L34
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r12 == 0) goto Lb5
            ads_mobile_sdk.z23 r11 = r11.b     // Catch: java.lang.Throwable -> L34
            ads_mobile_sdk.hv r11 = r11.b     // Catch: java.lang.Throwable -> L34
            dev.epro.r0.I16631908410500040363 r12 = r11.e     // Catch: java.lang.Throwable -> L34
            r1.t = r12     // Catch: java.lang.Throwable -> L34
            java.lang.String r11 = r11.d     // Catch: java.lang.Throwable -> L34
            r1.q = r11     // Catch: java.lang.Throwable -> L34
            goto Lb7
        Lb5:
            r1.m = r5     // Catch: java.lang.Throwable -> L34
        Lb7:
            r10.b(r6)
            return r0
        Lbb:
            r11 = move-exception
            r10 = r12
        Lbd:
            r10.b(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b71.a(ads_mobile_sdk.b71, ads_mobile_sdk.d33, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.R4833348786910499294 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.z61
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.z61 r0 = (ads_mobile_sdk.z61) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.z61 r0 = new ads_mobile_sdk.z61
            dev.epro.r0.K14749510448791472029 r5 = (dev.epro.r0.K14749510448791472029) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.b71 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L48
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            dev.epro.r0.H15186625828076266306 r5 = r4.k
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L48
            return r1
        L48:
            int r4 = r4.l     // Catch: java.lang.Throwable -> L56
            if (r4 == r2) goto L4d
            goto L4e
        L4d:
            r2 = 0
        L4e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            r5.b(r3)
            return r4
        L56:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b71.a(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.b71 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.u61
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.u61 r0 = (ads_mobile_sdk.u61) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.u61 r0 = new ads_mobile_sdk.u61
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.b71 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.k
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r4.n = r2     // Catch: java.lang.Throwable -> L4e
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L4e
            r5.b(r3)
            return r4
        L4e:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b71.a(ads_mobile_sdk.b71, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
