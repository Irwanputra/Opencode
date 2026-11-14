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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
        Object obj2;
        ci3 ci3Var = this.b;
        String str = (String) map.get("data");
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj3 = O9245300239821758723.a;
        if (str == null) {
            zi3.a(6, "Missing data argument for canOpenIntents gmsg", null);
            Object a = tx0Var.a(new I16631908410500040363(), "openableIntents", r4833348786910499294);
            if (a == z3437138737604933638) {
                return a;
            }
        } else {
            try {
                P16422848101170923038 e = d62.e((I16631908410500040363) new F14240031463097426304().b(I16631908410500040363.class, str), "intents");
                if (e != null) {
                    I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
                    int size = e.a.size();
                    int i2 = 0;
                    while (i2 < size) {
                        I16631908410500040363 a2 = d62.a(e, i2);
                        if (a2 == null) {
                            i = size;
                            obj = obj3;
                            p16422848101170923038 = e;
                        } else {
                            String a3 = d62.a(a2, "id", "");
                            i = size;
                            obj = obj3;
                            Intent intent = (Intent) M14643676963617488237.d(d62.a(a2, "intent_url", ""), new J3227772737003951788(this, (byte) 4));
                            if (intent == null) {
                                intent = new Intent();
                                p16422848101170923038 = e;
                                M14643676963617488237.d(d62.a(a2, "u", ""), new jr(intent, (byte) 0));
                                M14643676963617488237.d(d62.a(a2, "i", ""), new jr(intent, (byte) 1));
                                M14643676963617488237.d(d62.a(a2, "m", ""), new jr(intent, (byte) 2));
                                M14643676963617488237.d(d62.a(a2, "p", ""), new jr(intent, (byte) 3));
                                M14643676963617488237.d(d62.a(a2, "c", ""), new jr(intent, (byte) 4));
                            } else {
                                p16422848101170923038 = e;
                            }
                            try {
                                obj2 = this.a.getPackageManager().resolveActivity(intent, 65536);
                            } catch (Exception e2) {
                                ci3Var.a("Failed resolving intent: " + intent, (Throwable) e2);
                                obj2 = obj;
                            }
                            i16631908410500040363.r(a3, Boolean.valueOf(obj2 != null));
                        }
                        i2++;
                        size = i;
                        obj3 = obj;
                        e = p16422848101170923038;
                    }
                    Object obj4 = obj3;
                    String str2 = (String) map.get("ad_mid");
                    if (str2 != null && !M8927913404651150384.Y(str2)) {
                        i16631908410500040363.t("ad_mid", str2);
                    }
                    Object a4 = tx0Var.a(i16631908410500040363, "openableIntents", r4833348786910499294);
                    return a4 == z3437138737604933638 ? a4 : obj4;
                }
                zi3.a(6, "Missing intents parameter for canOpenIntents gmsg", null);
                Object a5 = tx0Var.a(new I16631908410500040363(), "openableIntents", r4833348786910499294);
                if (a5 == z3437138737604933638) {
                    return a5;
                }
            } catch (Exception e3) {
                zi3.a(4, "Invalid JSON data for canOpenIntents gmsg", e3);
                ci3Var.a("Invalid JSON data for canOpenIntents gmsg", (Throwable) e3);
                Object a6 = tx0Var.a(new I16631908410500040363(), "openableIntents", r4833348786910499294);
                return a6 == z3437138737604933638 ? a6 : obj3;
            }
        }
        return obj3;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 33;
    }
}
