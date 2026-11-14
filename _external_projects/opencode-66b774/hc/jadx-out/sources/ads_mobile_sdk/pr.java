package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.J3227772737003951788;
import dev.epro.r0.M14643676963617488237;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P16422848101170923038;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class pr implements Y4798753258822141670 {
    public final Context a;
    public final ci3 b;

    public pr(Context context, ci3 ci3Var) {
        context.getClass();
        ci3Var.getClass();
        this.a = context;
        this.b = ci3Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        int i;
        Object obj;
        P16422848101170923038 p16422848101170923038;
        Object objResolveActivity;
        ci3 ci3Var = this.b;
        String str = (String) map.get("data");
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj2 = O9245300239821758723.a;
        if (str == null) {
            zi3.a(6, "Missing data argument for canOpenIntents gmsg", null);
            Object objA = tx0Var.a(new I16631908410500040363(), "openableIntents", r4833348786910499294);
            if (objA == z3437138737604933638) {
                return objA;
            }
        } else {
            try {
                P16422848101170923038 p16422848101170923038E = d62.e((I16631908410500040363) new F14240031463097426304().b(I16631908410500040363.class, str), "intents");
                if (p16422848101170923038E != null) {
                    I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
                    int size = p16422848101170923038E.a.size();
                    int i2 = 0;
                    while (i2 < size) {
                        I16631908410500040363 i16631908410500040363A = d62.a(p16422848101170923038E, i2);
                        if (i16631908410500040363A == null) {
                            i = size;
                            obj = obj2;
                            p16422848101170923038 = p16422848101170923038E;
                        } else {
                            String strA = d62.a(i16631908410500040363A, "id", "");
                            i = size;
                            obj = obj2;
                            Intent intent = (Intent) M14643676963617488237.d(d62.a(i16631908410500040363A, "intent_url", ""), new J3227772737003951788(this, (byte) 4));
                            if (intent == null) {
                                intent = new Intent();
                                p16422848101170923038 = p16422848101170923038E;
                                M14643676963617488237.d(d62.a(i16631908410500040363A, "u", ""), new jr(intent, (byte) 0));
                                M14643676963617488237.d(d62.a(i16631908410500040363A, "i", ""), new jr(intent, (byte) 1));
                                M14643676963617488237.d(d62.a(i16631908410500040363A, "m", ""), new jr(intent, (byte) 2));
                                M14643676963617488237.d(d62.a(i16631908410500040363A, "p", ""), new jr(intent, (byte) 3));
                                M14643676963617488237.d(d62.a(i16631908410500040363A, "c", ""), new jr(intent, (byte) 4));
                            } else {
                                p16422848101170923038 = p16422848101170923038E;
                            }
                            try {
                                objResolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
                            } catch (Exception e) {
                                ci3Var.a("Failed resolving intent: " + intent, (Throwable) e);
                                objResolveActivity = obj;
                            }
                            i16631908410500040363.r(strA, Boolean.valueOf(objResolveActivity != null));
                        }
                        i2++;
                        size = i;
                        obj2 = obj;
                        p16422848101170923038E = p16422848101170923038;
                    }
                    Object obj3 = obj2;
                    String str2 = (String) map.get("ad_mid");
                    if (str2 != null && !M8927913404651150384.Y(str2)) {
                        i16631908410500040363.t("ad_mid", str2);
                    }
                    Object objA2 = tx0Var.a(i16631908410500040363, "openableIntents", r4833348786910499294);
                    return objA2 == z3437138737604933638 ? objA2 : obj3;
                }
                zi3.a(6, "Missing intents parameter for canOpenIntents gmsg", null);
                Object objA3 = tx0Var.a(new I16631908410500040363(), "openableIntents", r4833348786910499294);
                if (objA3 == z3437138737604933638) {
                    return objA3;
                }
            } catch (Exception e2) {
                zi3.a(4, "Invalid JSON data for canOpenIntents gmsg", e2);
                ci3Var.a("Invalid JSON data for canOpenIntents gmsg", (Throwable) e2);
                Object objA4 = tx0Var.a(new I16631908410500040363(), "openableIntents", r4833348786910499294);
                return objA4 == z3437138737604933638 ? objA4 : obj2;
            }
        }
        return obj2;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 33;
    }
}
