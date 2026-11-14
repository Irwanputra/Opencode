package ads_mobile_sdk;

import dev.epro.r0.A10855252310988578378;
import dev.epro.r0.B10755433227221787048;
import dev.epro.r0.E2617735461520075070;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.I16631908410500040363;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class g71 {
    public final sb a;
    public final ci3 b;

    public g71(sb sbVar, ci3 ci3Var) {
        sbVar.getClass();
        ci3Var.getClass();
        this.a = sbVar;
        this.b = ci3Var;
        new H15186625828076266306();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.g71 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.f71
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.f71 r0 = (ads_mobile_sdk.f71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.f71 r0 = new ads_mobile_sdk.f71
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            dev.epro.r0.P16422848101170923038 r5 = r0.b
            ads_mobile_sdk.g71 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L50
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L34:
            dev.epro.r0.E17665849472693074628.k(r6)
            dev.epro.r0.P16422848101170923038 r6 = new dev.epro.r0.P16422848101170923038
            r6.<init>()
            ads_mobile_sdk.sb r1 = r5.a
            r0.a = r5
            r0.b = r6
            r0.e = r2
            r1.getClass()
            java.lang.Object r0 = ads_mobile_sdk.sb.a$1(r1, r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L50
            return r1
        L50:
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            ads_mobile_sdk.ma r1 = (ads_mobile_sdk.ma) r1
            dev.epro.r0.A10855252310988578378 r3 = r1.a     // Catch: java.lang.Exception -> L81
            dev.epro.r0.E2617735461520075070 r1 = r1.b     // Catch: java.lang.Exception -> L81
            r5.getClass()     // Catch: java.lang.Exception -> L81
            dev.epro.r0.I16631908410500040363 r1 = a(r2, r3, r1)     // Catch: java.lang.Exception -> L81
            r6.q(r1)     // Catch: java.lang.Exception -> L81
            goto L5a
        L81:
            r1 = move-exception
            ads_mobile_sdk.ci3 r2 = r5.b
            java.lang.String r3 = "InspectorAdapterInfo.updateAdapters"
            r2.a(r3, r1)
            goto L5a
        L8a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.g71.a(ads_mobile_sdk.g71, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static I16631908410500040363 a(String str, A10855252310988578378 a10855252310988578378, E2617735461520075070 e2617735461520075070) {
        String str2;
        String str3;
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.t("adapterClassName", str);
        String str4 = "";
        if (e2617735461520075070 == null || (str2 = e2617735461520075070.a) == null) {
            str2 = "";
        }
        i16631908410500040363.t("version", str2);
        if (e2617735461520075070 != null && (str3 = e2617735461520075070.b) != null) {
            str4 = str3;
        }
        i16631908410500040363.t("sdkVersion", str4);
        i16631908410500040363.s("status", Integer.valueOf(((B10755433227221787048) a10855252310988578378.d) == B10755433227221787048.c ? 1 : 0));
        i16631908410500040363.t("description", (String) a10855252310988578378.e);
        i16631908410500040363.s("initializationLatencyMillis", Integer.valueOf(a10855252310988578378.b));
        i16631908410500040363.r("supportsInitialization", Boolean.valueOf(e2617735461520075070 != null));
        return i16631908410500040363;
    }
}
