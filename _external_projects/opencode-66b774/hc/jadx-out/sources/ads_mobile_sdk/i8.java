package ads_mobile_sdk;

import android.os.Bundle;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.L622219180424329983;
import dev.epro.r0.M9264509465983414107;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S11564727846197427291;
import dev.epro.r0.S12306309242770307923;
import dev.epro.r0.S8064361206571326475;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class i8 {
    public final jr0 a;
    public String b;
    public hv c;
    public I16631908410500040363 d;
    public M9264509465983414107 e;
    public List f;
    public final Map g;

    public i8(jr0 jr0Var) {
        jr0Var.getClass();
        this.a = jr0Var;
        this.f = Collections.synchronizedList(new ArrayList());
        this.g = Collections.synchronizedMap(new LinkedHashMap());
    }

    public final Bundle a(I16631908410500040363 i16631908410500040363) {
        hv hvVar = this.c;
        if (hvVar == null) {
            S10823041268949770285.b0("commonConfiguration");
            throw null;
        }
        I16631908410500040363 i166319084105000403632 = hvVar.q;
        I16631908410500040363 i166319084105000403633 = this.d;
        if (i166319084105000403633 == null) {
            i166319084105000403633 = new I16631908410500040363();
        }
        I16631908410500040363 i16631908410500040363A = i166319084105000403632.a();
        Iterator it = ((S11564727846197427291) i166319084105000403633.a.entrySet()).iterator();
        while (((L622219180424329983) it).hasNext()) {
            S8064361206571326475 s8064361206571326475A = ((L622219180424329983) it).a();
            i16631908410500040363A.q((String) s8064361206571326475A.getKey(), (K15572083692188606544) s8064361206571326475A.getValue());
        }
        if (i16631908410500040363 != null) {
            jr0 jr0Var = this.a;
            jr0Var.getClass();
            if (((Boolean) jr0Var.a("gads:enable_ad_specific_response_info_extras:enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
                Iterator it2 = ((S11564727846197427291) i16631908410500040363.a.entrySet()).iterator();
                while (((L622219180424329983) it2).hasNext()) {
                    S8064361206571326475 s8064361206571326475A2 = ((L622219180424329983) it2).a();
                    i16631908410500040363A.q((String) s8064361206571326475A2.getKey(), (K15572083692188606544) s8064361206571326475A2.getValue());
                }
            }
        }
        Bundle bundleB = d62.b(i16631908410500040363A);
        if (bundleB.containsKey("ad_value") && (bundleB.get("ad_value") instanceof Integer)) {
            bundleB.putDouble("ad_value", bundleB.getInt("ad_value"));
        }
        return bundleB;
    }

    public final F11004654978627682545 a() {
        if (this.c == null) {
            return null;
        }
        M9264509465983414107 m9264509465983414107 = this.e;
        String strB = m9264509465983414107 != null ? m9264509465983414107.b() : null;
        String str = this.b;
        Bundle bundleA = a(null);
        M9264509465983414107 m92645094659834141072 = this.e;
        List list = this.f;
        list.getClass();
        return new F11004654978627682545(strB, str, bundleA, m92645094659834141072, list);
    }

    public final void a(z1 z1Var, int i) {
        String str = z1Var.d;
        if (str.length() == 0) {
            return;
        }
        Map map = this.g;
        map.getClass();
        if (map.containsKey(str)) {
            return;
        }
        M9264509465983414107 m9264509465983414107 = new M9264509465983414107(z1Var.f, 0L, null, d62.b(z1Var.c), z1Var.h, z1Var.i, z1Var.j, z1Var.k);
        this.f.add(i, m9264509465983414107);
        map.put(str, m9264509465983414107);
    }

    public final void a(z1 z1Var, long j, S12306309242770307923 s12306309242770307923) {
        String str = z1Var.d;
        Map map = this.g;
        M9264509465983414107 m9264509465983414107 = (M9264509465983414107) map.get(str);
        if (m9264509465983414107 == null) {
            return;
        }
        M9264509465983414107 m92645094659834141072 = new M9264509465983414107(m9264509465983414107.b(), E17093345031926825464.e(j), s12306309242770307923, m9264509465983414107.c(), m9264509465983414107.h(), m9264509465983414107.d(), m9264509465983414107.f(), m9264509465983414107.e());
        map.put(str, m92645094659834141072);
        this.f.set(this.f.indexOf(m9264509465983414107), m92645094659834141072);
    }
}
