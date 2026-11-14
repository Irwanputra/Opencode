package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.L14610744821054695161;
import dev.epro.r0.M665231115116566295;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P14363171583196137821;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z1085125311131623997;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class y91 implements Y4798753258822141670 {
    public final ci3 a;
    public final sv2 b;
    public final ri c;

    public y91(ci3 ci3Var, sv2 sv2Var, ri riVar) {
        ci3Var.getClass();
        sv2Var.getClass();
        riVar.getClass();
        this.a = ci3Var;
        this.b = sv2Var;
        this.c = riVar;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        Object obj;
        Object obj2;
        String str = (String) map.get("applicationMuted");
        ri riVar = this.c;
        if (str != null) {
            riVar.d = str.equals("1");
        }
        String str2 = (String) map.get("applicationVolume");
        ci3 ci3Var = this.a;
        if (str2 != null) {
            try {
                riVar.c = Float.parseFloat(str2);
            } catch (NumberFormatException e) {
                ci3Var.a("Failed to parse application volume: " + str2 + ".", (Throwable) e);
            }
        }
        sv2 sv2Var = this.b;
        E4916761685899363666 a = sv2Var.a();
        a.getClass();
        ArrayList s = K5751602218013079365.s("B3EEABB8EE11C2BE770B684D95219ECB");
        P14363171583196137821 p14363171583196137821 = a.a;
        L14610744821054695161 l14610744821054695161 = a.c;
        ArrayList arrayList = a.b;
        s.clear();
        s.addAll(arrayList);
        s.add("B3EEABB8EE11C2BE770B684D95219ECB");
        M665231115116566295 m665231115116566295 = P14363171583196137821.d;
        Z1085125311131623997 j = E12098517352909843120.j(m665231115116566295, m665231115116566295);
        while (true) {
            obj = null;
            if (!j.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = j.next();
            if (((P14363171583196137821) obj2).a.equals(map.get("maxAdContentRating"))) {
                break;
            }
        }
        P14363171583196137821 p143631715831961378212 = (P14363171583196137821) obj2;
        if (p143631715831961378212 != null) {
            p14363171583196137821 = p143631715831961378212;
        }
        String str3 = (String) map.get("publisherPrivacyPersonalizationState");
        if (str3 != null) {
            try {
                int parseInt = Integer.parseInt(str3);
                M665231115116566295 m6652311151165662952 = L14610744821054695161.d;
                m6652311151165662952.getClass();
                Z1085125311131623997 z1085125311131623997 = new Z1085125311131623997(m6652311151165662952, (byte) 0);
                while (true) {
                    if (!z1085125311131623997.hasNext()) {
                        break;
                    }
                    Object next = z1085125311131623997.next();
                    if (((L14610744821054695161) next).a == parseInt) {
                        obj = next;
                        break;
                    }
                }
                L14610744821054695161 l146107448210546951612 = (L14610744821054695161) obj;
                if (l146107448210546951612 != null) {
                    l14610744821054695161 = l146107448210546951612;
                }
            } catch (NumberFormatException e2) {
                ci3Var.a("Failed to parse publisher privacy personalization state: " + str3 + ".", (Throwable) e2);
            }
        }
        sv2Var.a.setValue(sv2Var, sv2.b[0], new E4916761685899363666(p14363171583196137821, s, l14610744821054695161));
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 40;
    }
}
