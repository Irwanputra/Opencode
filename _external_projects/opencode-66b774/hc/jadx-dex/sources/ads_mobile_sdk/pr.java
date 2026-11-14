package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pr implements dev.epro.r0.Y4798753258822141670 {
    public final android.content.Context a;
    public final ads_mobile_sdk.ci3 b;

    public pr(android.content.Context context, ads_mobile_sdk.ci3 ci3Var) {
        context.getClass();
        ci3Var.getClass();
        this.a = context;
        this.b = ci3Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        int i;
        dev.epro.r0.O9245300239821758723 o9245300239821758723;
        dev.epro.r0.P16422848101170923038 p16422848101170923038;
        dev.epro.r0.O9245300239821758723 o9245300239821758723ResolveActivity;
        ads_mobile_sdk.ci3 ci3Var = this.b;
        java.lang.String str = (java.lang.String) map.get("data");
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        dev.epro.r0.O9245300239821758723 o92453002398217587232 = dev.epro.r0.O9245300239821758723.a;
        if (str == null) {
            ads_mobile_sdk.zi3.a(6, "Missing data argument for canOpenIntents gmsg", null);
            java.lang.Object objA = tx0Var.a(new dev.epro.r0.I16631908410500040363(), "openableIntents", r4833348786910499294);
            if (objA == z3437138737604933638) {
                return objA;
            }
        } else {
            try {
                dev.epro.r0.P16422848101170923038 p16422848101170923038E = ads_mobile_sdk.d62.e((dev.epro.r0.I16631908410500040363) new dev.epro.r0.F14240031463097426304().b(dev.epro.r0.I16631908410500040363.class, str), "intents");
                if (p16422848101170923038E != null) {
                    dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
                    int size = p16422848101170923038E.a.size();
                    int i2 = 0;
                    while (i2 < size) {
                        dev.epro.r0.I16631908410500040363 i16631908410500040363A = ads_mobile_sdk.d62.a(p16422848101170923038E, i2);
                        if (i16631908410500040363A == null) {
                            i = size;
                            o9245300239821758723 = o92453002398217587232;
                            p16422848101170923038 = p16422848101170923038E;
                        } else {
                            java.lang.String strA = ads_mobile_sdk.d62.a(i16631908410500040363A, "id", "");
                            i = size;
                            o9245300239821758723 = o92453002398217587232;
                            android.content.Intent intent = (android.content.Intent) dev.epro.r0.M14643676963617488237.d(ads_mobile_sdk.d62.a(i16631908410500040363A, "intent_url", ""), new dev.epro.r0.J3227772737003951788(this, (byte) 4));
                            if (intent == null) {
                                intent = new android.content.Intent();
                                p16422848101170923038 = p16422848101170923038E;
                                dev.epro.r0.M14643676963617488237.d(ads_mobile_sdk.d62.a(i16631908410500040363A, "u", ""), new ads_mobile_sdk.jr(intent, (byte) 0));
                                dev.epro.r0.M14643676963617488237.d(ads_mobile_sdk.d62.a(i16631908410500040363A, "i", ""), new ads_mobile_sdk.jr(intent, (byte) 1));
                                dev.epro.r0.M14643676963617488237.d(ads_mobile_sdk.d62.a(i16631908410500040363A, "m", ""), new ads_mobile_sdk.jr(intent, (byte) 2));
                                dev.epro.r0.M14643676963617488237.d(ads_mobile_sdk.d62.a(i16631908410500040363A, "p", ""), new ads_mobile_sdk.jr(intent, (byte) 3));
                                dev.epro.r0.M14643676963617488237.d(ads_mobile_sdk.d62.a(i16631908410500040363A, "c", ""), new ads_mobile_sdk.jr(intent, (byte) 4));
                            } else {
                                p16422848101170923038 = p16422848101170923038E;
                            }
                            try {
                                o9245300239821758723ResolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
                            } catch (java.lang.Exception e) {
                                ci3Var.a("Failed resolving intent: " + intent, (java.lang.Throwable) e);
                                o9245300239821758723ResolveActivity = o9245300239821758723;
                            }
                            i16631908410500040363.r(strA, java.lang.Boolean.valueOf(o9245300239821758723ResolveActivity != null));
                        }
                        i2++;
                        size = i;
                        o92453002398217587232 = o9245300239821758723;
                        p16422848101170923038E = p16422848101170923038;
                    }
                    dev.epro.r0.O9245300239821758723 o92453002398217587233 = o92453002398217587232;
                    java.lang.String str2 = (java.lang.String) map.get("ad_mid");
                    if (str2 != null && !dev.epro.r0.M8927913404651150384.Y(str2)) {
                        i16631908410500040363.t("ad_mid", str2);
                    }
                    java.lang.Object objA2 = tx0Var.a(i16631908410500040363, "openableIntents", r4833348786910499294);
                    return objA2 == z3437138737604933638 ? objA2 : o92453002398217587233;
                }
                ads_mobile_sdk.zi3.a(6, "Missing intents parameter for canOpenIntents gmsg", null);
                java.lang.Object objA3 = tx0Var.a(new dev.epro.r0.I16631908410500040363(), "openableIntents", r4833348786910499294);
                if (objA3 == z3437138737604933638) {
                    return objA3;
                }
            } catch (java.lang.Exception e2) {
                ads_mobile_sdk.zi3.a(4, "Invalid JSON data for canOpenIntents gmsg", e2);
                ci3Var.a("Invalid JSON data for canOpenIntents gmsg", (java.lang.Throwable) e2);
                java.lang.Object objA4 = tx0Var.a(new dev.epro.r0.I16631908410500040363(), "openableIntents", r4833348786910499294);
                return objA4 == z3437138737604933638 ? objA4 : o92453002398217587232;
            }
        }
        return o92453002398217587232;
    }

    public final int b() {
        return 33;
    }
}
