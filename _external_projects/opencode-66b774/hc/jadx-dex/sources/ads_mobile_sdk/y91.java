package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class y91 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.ci3 a;
    public final ads_mobile_sdk.sv2 b;
    public final ads_mobile_sdk.ri c;

    public y91(ads_mobile_sdk.ci3 ci3Var, ads_mobile_sdk.sv2 sv2Var, ads_mobile_sdk.ri riVar) {
        ci3Var.getClass();
        sv2Var.getClass();
        riVar.getClass();
        this.a = ci3Var;
        this.b = sv2Var;
        this.c = riVar;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.String str = (java.lang.String) map.get("applicationMuted");
        ads_mobile_sdk.ri riVar = this.c;
        if (str != null) {
            riVar.d = str.equals("1");
        }
        java.lang.String str2 = (java.lang.String) map.get("applicationVolume");
        ads_mobile_sdk.ci3 ci3Var = this.a;
        if (str2 != null) {
            try {
                riVar.c = java.lang.Float.parseFloat(str2);
            } catch (java.lang.NumberFormatException e) {
                ci3Var.a("Failed to parse application volume: " + str2 + ".", (java.lang.Throwable) e);
            }
        }
        ads_mobile_sdk.sv2 sv2Var = this.b;
        dev.epro.r0.E4916761685899363666 e4916761685899363666A = sv2Var.a();
        e4916761685899363666A.getClass();
        java.util.ArrayList arrayListS = dev.epro.r0.K5751602218013079365.s(new java.lang.String[]{"B3EEABB8EE11C2BE770B684D95219ECB"});
        dev.epro.r0.P14363171583196137821 p14363171583196137821 = e4916761685899363666A.a;
        dev.epro.r0.L14610744821054695161 l14610744821054695161 = e4916761685899363666A.c;
        java.util.ArrayList arrayList = e4916761685899363666A.b;
        arrayListS.clear();
        arrayListS.addAll(arrayList);
        arrayListS.add("B3EEABB8EE11C2BE770B684D95219ECB");
        dev.epro.r0.M665231115116566295 m665231115116566295 = dev.epro.r0.P14363171583196137821.d;
        dev.epro.r0.Z1085125311131623997 z1085125311131623997J = dev.epro.r0.E12098517352909843120.j(m665231115116566295, m665231115116566295);
        while (true) {
            obj = null;
            if (!z1085125311131623997J.hasNext()) {
                next = null;
                break;
            }
            next = z1085125311131623997J.next();
            if (((dev.epro.r0.P14363171583196137821) next).a.equals(map.get("maxAdContentRating"))) {
                break;
            }
        }
        dev.epro.r0.P14363171583196137821 p143631715831961378212 = (dev.epro.r0.P14363171583196137821) next;
        if (p143631715831961378212 != null) {
            p14363171583196137821 = p143631715831961378212;
        }
        java.lang.String str3 = (java.lang.String) map.get("publisherPrivacyPersonalizationState");
        if (str3 != null) {
            try {
                int i = java.lang.Integer.parseInt(str3);
                dev.epro.r0.M665231115116566295 m6652311151165662952 = dev.epro.r0.L14610744821054695161.d;
                m6652311151165662952.getClass();
                dev.epro.r0.Z1085125311131623997 z1085125311131623997 = new dev.epro.r0.Z1085125311131623997(m6652311151165662952, (byte) 0);
                while (true) {
                    if (!z1085125311131623997.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = z1085125311131623997.next();
                    if (((dev.epro.r0.L14610744821054695161) next2).a == i) {
                        obj = next2;
                        break;
                    }
                }
                dev.epro.r0.L14610744821054695161 l146107448210546951612 = (dev.epro.r0.L14610744821054695161) obj;
                if (l146107448210546951612 != null) {
                    l14610744821054695161 = l146107448210546951612;
                }
            } catch (java.lang.NumberFormatException e2) {
                ci3Var.a("Failed to parse publisher privacy personalization state: " + str3 + ".", (java.lang.Throwable) e2);
            }
        }
        sv2Var.a.setValue(sv2Var, ads_mobile_sdk.sv2.b[0], new dev.epro.r0.E4916761685899363666(p14363171583196137821, arrayListS, l14610744821054695161));
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 40;
    }
}
