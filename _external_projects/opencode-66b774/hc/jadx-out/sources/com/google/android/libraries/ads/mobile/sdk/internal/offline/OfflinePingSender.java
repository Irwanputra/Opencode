package com.google.android.libraries.ads.mobile.sdk.internal.offline;

import ads_mobile_sdk.aw;
import ads_mobile_sdk.b41;
import ads_mobile_sdk.bk;
import ads_mobile_sdk.db0;
import ads_mobile_sdk.ev;
import ads_mobile_sdk.gj0;
import ads_mobile_sdk.gu0;
import ads_mobile_sdk.hb1;
import ads_mobile_sdk.kr0;
import ads_mobile_sdk.n42;
import ads_mobile_sdk.p42;
import ads_mobile_sdk.v42;
import ads_mobile_sdk.w20;
import android.content.Context;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import dev.epro.r0.A2789795882633926065;
import dev.epro.r0.E12775674050813925581;
import dev.epro.r0.E13942609761711486177;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.I5566604416186847280;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.L14610744821054695161;
import dev.epro.r0.M14267729522421844969;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.N18249742966722306189;
import dev.epro.r0.O8620973563946607355;
import dev.epro.r0.P14363171583196137821;
import dev.epro.r0.R10975805389692362869;
import dev.epro.r0.R13606847544478402433;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.V10300877997588547986;
import dev.epro.r0.Z1555232923955070058;
import dev.epro.r0.Z4023314114778119473;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class OfflinePingSender extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final R10975805389692362869 c() {
        byte b = 2;
        byte b2 = 9;
        R4833348786910499294 r4833348786910499294 = null;
        try {
            Z1555232923955070058.a.getClass();
            n42 n42Var = (n42) ((db0) gu0.a()).q1.get();
            n42Var.getClass();
            R7033599853981556291.E(n42Var.a, null, null, new I5566604416186847280(n42Var, new E13942609761711486177(n42Var, r4833348786910499294, b2), r4833348786910499294, b), 3);
        } catch (Exception unused) {
            Z4023314114778119473 z4023314114778119473 = this.b.b;
            z4023314114778119473.getClass();
            Object obj = z4023314114778119473.a.get("OFFLINE_DATABASE_VERSION");
            int iIntValue = ((Number) (obj instanceof Integer ? obj : 1)).intValue();
            Z4023314114778119473 z40233141147781194732 = this.b.b;
            z40233141147781194732.getClass();
            Object obj2 = z40233141147781194732.a.get("HTTP_CLIENT_TIMEOUT");
            long jLongValue = ((Number) (obj2 instanceof Long ? obj2 : 20L)).longValue();
            Object obj3 = this.b.b.a.get("USER_AGENT");
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str == null) {
                return new M14267729522421844969();
            }
            V10300877997588547986 v10300877997588547986 = new V10300877997588547986("offline-ping-sender", new E4916761685899363666(P14363171583196137821.b, K5751602218013079365.s("B3EEABB8EE11C2BE770B684D95219ECB"), L14610744821054695161.b), new Bundle());
            b41 b41Var = new b41();
            b41Var.a = v10300877997588547986;
            aw awVar = new aw(b41Var);
            A2789795882633926065 a2789795882633926065A = O8620973563946607355.a(new N18249742966722306189(awVar.d));
            v42 v42Var = new v42(str);
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            M9216324016624295870.a0(jLongValue, N13798149404328803870.MILLISECONDS);
            p42 p42Var = new p42(new w20(a2789795882633926065A, new N18249742966722306189(awVar.d), null, awVar, v42Var, this.a, null, null, null));
            Context context = this.a;
            Integer numValueOf = Integer.valueOf(iIntValue);
            Long lValueOf = Long.valueOf(jLongValue);
            hb1 hb1VarA = hb1.a(context);
            hb1 hb1VarA2 = hb1.a(a2789795882633926065A);
            hb1 hb1VarA3 = hb1.a(numValueOf);
            n42 n42Var2 = (n42) new gj0(new kr0(hb1VarA, hb1VarA2, hb1VarA3, new gj0(E12775674050813925581.D), new gj0(new ev(hb1VarA, hb1VarA3, hb1.a(lValueOf), hb1.a(v42Var))), new gj0(new bk(hb1VarA2, hb1.a(p42Var), (byte) 7)), (byte) 1)).get();
            n42Var2.getClass();
            R7033599853981556291.E(n42Var2.a, null, null, new I5566604416186847280(n42Var2, new E13942609761711486177(n42Var2, r4833348786910499294, b2), r4833348786910499294, b), 3);
        }
        return new R13606847544478402433();
    }
}
