package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ie3 implements dev.epro.r0.N8216500077550626412 {
    public final ads_mobile_sdk.w81 a;
    public final /* synthetic */ byte b;

    public ie3(ads_mobile_sdk.w81 w81Var, byte b) {
        this.b = b;
        switch (b) {
            case 1:
                w81Var.getClass();
                this.a = w81Var;
                break;
            case 2:
                w81Var.getClass();
                this.a = w81Var;
                break;
            default:
                w81Var.getClass();
                this.a = w81Var;
                break;
        }
    }

    public final java.lang.Object a(dev.epro.r0.I16631908410500040363 i16631908410500040363, ads_mobile_sdk.k kVar) throws java.lang.Throwable {
        java.lang.Object objA;
        byte b = this.b;
        java.lang.String str = "";
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        ads_mobile_sdk.w81 w81Var = this.a;
        switch (b) {
            case 0:
                try {
                    i16631908410500040363.getClass();
                    java.lang.String strP = i16631908410500040363.w("test_mode_enabled").p();
                    strP.getClass();
                    str = strP;
                } catch (java.lang.Exception unused) {
                }
                if (dev.epro.r0.M8927913404651150384.Y(str)) {
                    return o9245300239821758723;
                }
                boolean z = java.lang.Boolean.parseBoolean(str);
                w81Var.getClass();
                java.lang.Object objB = ads_mobile_sdk.w81.b(w81Var, z, kVar);
                return objB == z3437138737604933638 ? objB : o9245300239821758723;
            case 1:
                try {
                    i16631908410500040363.getClass();
                    java.lang.String strP2 = i16631908410500040363.w("gesture").p();
                    strP2.getClass();
                    str = strP2;
                } catch (java.lang.Exception unused2) {
                }
                if (str.equals("shake")) {
                    w81Var.getClass();
                    objA = ads_mobile_sdk.w81.a(w81Var, 2, kVar);
                    if (objA != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                } else if (str.equals("flick")) {
                    w81Var.getClass();
                    objA = ads_mobile_sdk.w81.a(w81Var, 3, kVar);
                    if (objA != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                } else {
                    w81Var.getClass();
                    objA = ads_mobile_sdk.w81.a(w81Var, 1, kVar);
                    if (objA != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                }
                return objA;
            default:
                w81Var.getClass();
                java.lang.Object objA2 = ads_mobile_sdk.w81.a(w81Var, i16631908410500040363, kVar);
                return objA2 == z3437138737604933638 ? objA2 : o9245300239821758723;
        }
    }
}
