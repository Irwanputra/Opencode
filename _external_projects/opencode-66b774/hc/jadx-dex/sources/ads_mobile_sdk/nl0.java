package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class nl0 {
    public static volatile ads_mobile_sdk.nl0 a;
    public static volatile ads_mobile_sdk.nl0 b;
    public static final ads_mobile_sdk.nl0 c = new ads_mobile_sdk.nl0();

    public static ads_mobile_sdk.nl0 a() {
        ads_mobile_sdk.nl0 nl0VarA;
        int i = ads_mobile_sdk.qe.a;
        ads_mobile_sdk.nl0 nl0Var = a;
        if (nl0Var != null) {
            return nl0Var;
        }
        synchronized (ads_mobile_sdk.nl0.class) {
            try {
                nl0VarA = a;
                if (nl0VarA == null) {
                    nl0VarA = ads_mobile_sdk.ml0.a("getEmptyRegistry");
                    if (nl0VarA == null) {
                        nl0VarA = c;
                    }
                    a = nl0VarA;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return nl0VarA;
    }

    public static ads_mobile_sdk.nl0 b() {
        ads_mobile_sdk.nl0 nl0Var = b;
        if (nl0Var != null) {
            return nl0Var;
        }
        synchronized (ads_mobile_sdk.nl0.class) {
            try {
                ads_mobile_sdk.nl0 nl0Var2 = b;
                if (nl0Var2 != null) {
                    return nl0Var2;
                }
                int i = ads_mobile_sdk.qe.a;
                ads_mobile_sdk.nl0 nl0VarA = ads_mobile_sdk.ml0.a("loadGeneratedRegistry");
                if (nl0VarA == null && (nl0VarA = dev.epro.r0.M9216324016624295870.m()) == null && (nl0VarA = ads_mobile_sdk.ml0.a("getEmptyRegistry")) == null) {
                    nl0VarA = c;
                }
                b = nl0VarA;
                return nl0VarA;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
