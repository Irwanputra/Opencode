package com.google.android.libraries.ads.mobile.sdk.internal.offline;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class OfflinePingSender extends androidx.work.Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflinePingSender(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final dev.epro.r0.R10975805389692362869 c() {
        byte b = 9;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        try {
            dev.epro.r0.Z1555232923955070058.a.getClass();
            ads_mobile_sdk.n42 n42Var = (ads_mobile_sdk.n42) ((ads_mobile_sdk.db0) ads_mobile_sdk.gu0.a()).q1.get();
            n42Var.getClass();
            dev.epro.r0.R7033599853981556291.E(n42Var.a, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.I5566604416186847280(n42Var, new dev.epro.r0.E13942609761711486177(n42Var, r4833348786910499294, b), (dev.epro.r0.R4833348786910499294) null, (byte) 2), 3);
        } catch (java.lang.Exception unused) {
            dev.epro.r0.Z4023314114778119473 z4023314114778119473 = ((dev.epro.r0.P14960607863193493823) this).b.b;
            z4023314114778119473.getClass();
            java.lang.Object obj = z4023314114778119473.a.get("OFFLINE_DATABASE_VERSION");
            int iIntValue = ((java.lang.Number) (obj instanceof java.lang.Integer ? obj : 1)).intValue();
            dev.epro.r0.Z4023314114778119473 z40233141147781194732 = ((dev.epro.r0.P14960607863193493823) this).b.b;
            z40233141147781194732.getClass();
            java.lang.Object obj2 = z40233141147781194732.a.get("HTTP_CLIENT_TIMEOUT");
            long jLongValue = ((java.lang.Number) (obj2 instanceof java.lang.Long ? obj2 : 20L)).longValue();
            java.lang.Object obj3 = ((dev.epro.r0.P14960607863193493823) this).b.b.a.get("USER_AGENT");
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str == null) {
                return new dev.epro.r0.M14267729522421844969();
            }
            dev.epro.r0.V10300877997588547986 v10300877997588547986 = new dev.epro.r0.V10300877997588547986("offline-ping-sender", new dev.epro.r0.E4916761685899363666(dev.epro.r0.P14363171583196137821.b, dev.epro.r0.K5751602218013079365.s(new java.lang.String[]{"B3EEABB8EE11C2BE770B684D95219ECB"}), dev.epro.r0.L14610744821054695161.b), new android.os.Bundle());
            ads_mobile_sdk.b41 b41Var = new ads_mobile_sdk.b41();
            b41Var.a = v10300877997588547986;
            ads_mobile_sdk.aw awVar = new ads_mobile_sdk.aw(b41Var);
            dev.epro.r0.A2789795882633926065 a2789795882633926065A = dev.epro.r0.O8620973563946607355.a(new dev.epro.r0.N18249742966722306189(awVar.d));
            ads_mobile_sdk.v42 v42Var = new ads_mobile_sdk.v42(str);
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
            dev.epro.r0.M9216324016624295870.a0(jLongValue, dev.epro.r0.N13798149404328803870.d);
            ads_mobile_sdk.p42 p42Var = new ads_mobile_sdk.p42(new ads_mobile_sdk.w20(a2789795882633926065A, new dev.epro.r0.N18249742966722306189(awVar.d), null, awVar, v42Var, ((dev.epro.r0.P14960607863193493823) this).a, null, null, null));
            android.content.Context context = ((dev.epro.r0.P14960607863193493823) this).a;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iIntValue);
            java.lang.Long lValueOf = java.lang.Long.valueOf(jLongValue);
            ads_mobile_sdk.hb1 hb1VarA = ads_mobile_sdk.hb1.a(context);
            ads_mobile_sdk.hb1 hb1VarA2 = ads_mobile_sdk.hb1.a(a2789795882633926065A);
            ads_mobile_sdk.hb1 hb1VarA3 = ads_mobile_sdk.hb1.a(numValueOf);
            ads_mobile_sdk.n42 n42Var2 = (ads_mobile_sdk.n42) new ads_mobile_sdk.gj0(new ads_mobile_sdk.kr0(hb1VarA, hb1VarA2, hb1VarA3, new ads_mobile_sdk.gj0(dev.epro.r0.E12775674050813925581.D), new ads_mobile_sdk.gj0(new ads_mobile_sdk.ev(hb1VarA, hb1VarA3, ads_mobile_sdk.hb1.a(lValueOf), ads_mobile_sdk.hb1.a(v42Var))), new ads_mobile_sdk.gj0(new ads_mobile_sdk.bk(hb1VarA2, ads_mobile_sdk.hb1.a(p42Var), (byte) 7)), (byte) 1)).get();
            n42Var2.getClass();
            dev.epro.r0.R7033599853981556291.E(n42Var2.a, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.I5566604416186847280(n42Var2, new dev.epro.r0.E13942609761711486177(n42Var2, r4833348786910499294, b), (dev.epro.r0.R4833348786910499294) null, (byte) 2), 3);
        }
        return new dev.epro.r0.R13606847544478402433();
    }
}
