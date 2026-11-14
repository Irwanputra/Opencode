package ads_mobile_sdk;

import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.N8216500077550626412;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ie3 implements N8216500077550626412 {
    public final w81 a;
    public final /* synthetic */ byte b;

    public ie3(w81 w81Var, byte b) {
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

    @Override // dev.epro.r0.N8216500077550626412
    public final Object a(I16631908410500040363 i16631908410500040363, k kVar) throws Throwable {
        Object objA;
        byte b = this.b;
        String str = "";
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        w81 w81Var = this.a;
        switch (b) {
            case 0:
                try {
                    i16631908410500040363.getClass();
                    String strP = i16631908410500040363.w("test_mode_enabled").p();
                    strP.getClass();
                    str = strP;
                } catch (Exception unused) {
                }
                if (M8927913404651150384.Y(str)) {
                    return o9245300239821758723;
                }
                boolean z = Boolean.parseBoolean(str);
                w81Var.getClass();
                Object objB = w81.b(w81Var, z, kVar);
                return objB == z3437138737604933638 ? objB : o9245300239821758723;
            case 1:
                try {
                    i16631908410500040363.getClass();
                    String strP2 = i16631908410500040363.w("gesture").p();
                    strP2.getClass();
                    str = strP2;
                } catch (Exception unused2) {
                }
                if (str.equals("shake")) {
                    w81Var.getClass();
                    objA = w81.a(w81Var, 2, kVar);
                    if (objA != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                } else if (str.equals("flick")) {
                    w81Var.getClass();
                    objA = w81.a(w81Var, 3, kVar);
                    if (objA != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                } else {
                    w81Var.getClass();
                    objA = w81.a(w81Var, 1, kVar);
                    if (objA != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                }
                return objA;
            default:
                w81Var.getClass();
                Object objA2 = w81.a(w81Var, i16631908410500040363, kVar);
                return objA2 == z3437138737604933638 ? objA2 : o9245300239821758723;
        }
    }
}
