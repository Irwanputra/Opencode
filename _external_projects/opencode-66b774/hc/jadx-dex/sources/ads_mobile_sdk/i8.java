package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class i8 {
    public final ads_mobile_sdk.jr0 a;
    public java.lang.String b;
    public ads_mobile_sdk.hv c;
    public dev.epro.r0.I16631908410500040363 d;
    public dev.epro.r0.M9264509465983414107 e;
    public java.util.List f;
    public final java.util.Map g;

    public i8(ads_mobile_sdk.jr0 jr0Var) {
        jr0Var.getClass();
        this.a = jr0Var;
        this.f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.g = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
    }

    public final android.os.Bundle a(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        ads_mobile_sdk.hv hvVar = this.c;
        if (hvVar == null) {
            dev.epro.r0.S10823041268949770285.b0("commonConfiguration");
            throw null;
        }
        dev.epro.r0.I16631908410500040363 i166319084105000403632 = hvVar.q;
        dev.epro.r0.I16631908410500040363 i166319084105000403633 = this.d;
        if (i166319084105000403633 == null) {
            i166319084105000403633 = new dev.epro.r0.I16631908410500040363();
        }
        dev.epro.r0.I16631908410500040363 i16631908410500040363U = i166319084105000403632.u();
        dev.epro.r0.L622219180424329983 it = i166319084105000403633.a.entrySet().iterator();
        while (it.hasNext()) {
            dev.epro.r0.S8064361206571326475 s8064361206571326475A = it.a();
            i16631908410500040363U.q((java.lang.String) s8064361206571326475A.getKey(), (dev.epro.r0.K15572083692188606544) s8064361206571326475A.getValue());
        }
        if (i16631908410500040363 != null) {
            ads_mobile_sdk.jr0 jr0Var = this.a;
            jr0Var.getClass();
            if (((java.lang.Boolean) jr0Var.a("gads:enable_ad_specific_response_info_extras:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
                dev.epro.r0.L622219180424329983 it2 = i16631908410500040363.a.entrySet().iterator();
                while (it2.hasNext()) {
                    dev.epro.r0.S8064361206571326475 s8064361206571326475A2 = it2.a();
                    i16631908410500040363U.q((java.lang.String) s8064361206571326475A2.getKey(), (dev.epro.r0.K15572083692188606544) s8064361206571326475A2.getValue());
                }
            }
        }
        android.os.Bundle bundleB = ads_mobile_sdk.d62.b(i16631908410500040363U);
        if (bundleB.containsKey("ad_value") && (bundleB.get("ad_value") instanceof java.lang.Integer)) {
            bundleB.putDouble("ad_value", bundleB.getInt("ad_value"));
        }
        return bundleB;
    }

    public final dev.epro.r0.F11004654978627682545 a() {
        if (this.c == null) {
            return null;
        }
        dev.epro.r0.M9264509465983414107 m9264509465983414107 = this.e;
        java.lang.String strB = m9264509465983414107 != null ? m9264509465983414107.b() : null;
        java.lang.String str = this.b;
        android.os.Bundle bundleA = a(null);
        dev.epro.r0.M9264509465983414107 m92645094659834141072 = this.e;
        java.util.List list = this.f;
        list.getClass();
        return new dev.epro.r0.F11004654978627682545(strB, str, bundleA, m92645094659834141072, list);
    }

    public final void a(ads_mobile_sdk.z1 z1Var, int i) {
        java.lang.String str = z1Var.d;
        if (str.length() == 0) {
            return;
        }
        java.util.Map map = this.g;
        map.getClass();
        if (map.containsKey(str)) {
            return;
        }
        dev.epro.r0.M9264509465983414107 m9264509465983414107 = new dev.epro.r0.M9264509465983414107(z1Var.f, 0L, (dev.epro.r0.S12306309242770307923) null, ads_mobile_sdk.d62.b(z1Var.c), z1Var.h, z1Var.i, z1Var.j, z1Var.k);
        this.f.add(i, m9264509465983414107);
        map.put(str, m9264509465983414107);
    }

    public final void a(ads_mobile_sdk.z1 z1Var, long j, dev.epro.r0.S12306309242770307923 s12306309242770307923) {
        java.lang.String str = z1Var.d;
        java.util.Map map = this.g;
        dev.epro.r0.M9264509465983414107 m9264509465983414107 = (dev.epro.r0.M9264509465983414107) map.get(str);
        if (m9264509465983414107 == null) {
            return;
        }
        dev.epro.r0.M9264509465983414107 m92645094659834141072 = new dev.epro.r0.M9264509465983414107(m9264509465983414107.b(), dev.epro.r0.E17093345031926825464.e(j), s12306309242770307923, m9264509465983414107.c(), m9264509465983414107.h(), m9264509465983414107.d(), m9264509465983414107.f(), m9264509465983414107.e());
        map.put(str, m92645094659834141072);
        this.f.set(this.f.indexOf(m9264509465983414107), m92645094659834141072);
    }
}
