package ads_mobile_sdk;

import dev.epro.r0.M9216324016624295870;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class nl0 {
    public static volatile nl0 a;
    public static volatile nl0 b;
    public static final nl0 c = new nl0();

    public static nl0 a() {
        nl0 nl0Var;
        int i = qe.a;
        nl0 nl0Var2 = a;
        if (nl0Var2 != null) {
            return nl0Var2;
        }
        synchronized (nl0.class) {
            try {
                nl0Var = a;
                if (nl0Var == null) {
                    nl0Var = ml0.a("getEmptyRegistry");
                    if (nl0Var == null) {
                        nl0Var = c;
                    }
                    a = nl0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nl0Var;
    }

    public static nl0 b() {
        nl0 nl0Var = b;
        if (nl0Var != null) {
            return nl0Var;
        }
        synchronized (nl0.class) {
            try {
                nl0 nl0Var2 = b;
                if (nl0Var2 != null) {
                    return nl0Var2;
                }
                int i = qe.a;
                nl0 a2 = ml0.a("loadGeneratedRegistry");
                if (a2 == null && (a2 = M9216324016624295870.m()) == null && (a2 = ml0.a("getEmptyRegistry")) == null) {
                    a2 = c;
                }
                b = a2;
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
