package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.R18140250564721702687;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class m5 extends R18140250564721702687 {
    public final jr0 c;
    public final O12043144740933444288 d;
    public final W5797197595347441198 e;

    public m5(jr0 jr0Var, O12043144740933444288 o12043144740933444288, W5797197595347441198 w5797197595347441198) {
        jr0Var.getClass();
        o12043144740933444288.getClass();
        w5797197595347441198.getClass();
        this.c = jr0Var;
        this.d = o12043144740933444288;
        this.e = w5797197595347441198;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.m5 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            ads_mobile_sdk.ao r0 = ads_mobile_sdk.ao.a$11
            boolean r1 = r10 instanceof ads_mobile_sdk.l5
            if (r1 == 0) goto L15
            r1 = r10
            ads_mobile_sdk.l5 r1 = (ads_mobile_sdk.l5) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            ads_mobile_sdk.l5 r1 = new ads_mobile_sdk.l5
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.b
            int r2 = r1.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ads_mobile_sdk.m5 r9 = r1.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L87
        L29:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            r9 = 0
            return r9
        L30:
            dev.epro.r0.E17665849472693074628.k(r10)
            ads_mobile_sdk.jr0 r10 = r9.c
            r10.getClass()
            java.lang.String r2 = "gads:ad_request_http_client_enabled"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r2 = r10.a(r2, r4, r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L87
            dev.epro.r0.O12043144740933444288 r2 = r9.d
            java.lang.String r4 = "gads:ad_request_http_client_max_idle_connections"
            r5 = 5
            java.lang.Integer r6 = dev.epro.r0.O17574792317020433029.c(r10, r4, r5)
            ads_mobile_sdk.ao r7 = ads_mobile_sdk.ao.a$18
            java.lang.Object r4 = r10.a(r4, r6, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            dev.epro.r0.E17149812035295265804 r6 = dev.epro.r0.E17093345031926825464.b
            dev.epro.r0.N13798149404328803870 r6 = dev.epro.r0.N13798149404328803870.MINUTES
            long r7 = dev.epro.r0.M9216324016624295870.Z(r5, r6)
            dev.epro.r0.E17093345031926825464 r5 = new dev.epro.r0.E17093345031926825464
            r5.<init>(r7)
            ads_mobile_sdk.ao r7 = ads_mobile_sdk.ao.a$1
            java.lang.String r8 = "gads:ad_request_http_client_connection_pool_keep_alive_minutes"
            java.lang.Object r10 = r10.a(r8, r5, r7)
            dev.epro.r0.E17093345031926825464 r10 = (dev.epro.r0.E17093345031926825464) r10
            long r7 = r10.a
            long r5 = dev.epro.r0.E17093345031926825464.k(r7, r6)
            r1.a = r9
            r1.d = r3
            java.lang.Object r10 = r2.a(r4, r5, r1)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r10 != r1) goto L87
            return r1
        L87:
            ads_mobile_sdk.jr0 r10 = r9.c
            r10.getClass()
            java.lang.String r1 = "gads:preconnect_initialization_task_enabled"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r10 = r10.a(r1, r2, r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L9f
            r9.b$1()
        L9f:
            ads_mobile_sdk.xu0 r9 = new ads_mobile_sdk.xu0
            dev.epro.r0.O9245300239821758723 r10 = dev.epro.r0.O9245300239821758723.a
            r9.<init>(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m5.a(ads_mobile_sdk.m5, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void b$1() {
        jr0 jr0Var = this.c;
        jr0Var.getClass();
        Iterator it = ((List) jr0Var.a("gads:preconnect_urls", K5751602218013079365.V("https://googleads.g.doubleclick.net", "https://pubads.g.doubleclick.net"), ao.a$23)).iterator();
        while (it.hasNext()) {
            R7033599853981556291.E(this.e, null, null, new fb((Object) this, it.next(), (R4833348786910499294) null, (byte) 11), 3);
        }
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        return a(this, (K14749510448791472029) r4833348786910499294);
    }
}
