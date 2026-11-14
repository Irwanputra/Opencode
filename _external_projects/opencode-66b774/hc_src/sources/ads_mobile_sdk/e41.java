package ads_mobile_sdk;

import android.util.Base64;
import dev.epro.r0.B6030175592171028728;
import dev.epro.r0.B6062915069895823126;
import dev.epro.r0.D3699235533239707501;
import dev.epro.r0.E11743167429115753335;
import dev.epro.r0.E4951175994894594588;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H14305894327539119220;
import dev.epro.r0.H1850504041015929188;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.K15899002224316188312;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.L14515889287724438211;
import dev.epro.r0.L622219180424329983;
import dev.epro.r0.O14932123057360168587;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.P12817159812099202599;
import dev.epro.r0.P16422848101170923038;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.S11564727846197427291;
import dev.epro.r0.S6059772632253557467;
import dev.epro.r0.S8064361206571326475;
import dev.epro.r0.T8598786036980488824;
import dev.epro.r0.U1061257129253093767;
import dev.epro.r0.W1349480363743553773;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class e41 {
    public static final e41 a = new e41();

    public static H9390398899829886498 a(I16631908410500040363 i16631908410500040363) {
        O6641393078261985068 o6641393078261985068;
        O6641393078261985068 o66413930782619850682;
        O6641393078261985068 o66413930782619850683;
        try {
            String p = i16631908410500040363.w("format").p();
            p.getClass();
            Locale locale = Locale.ROOT;
            String lowerCase = p.toLowerCase(locale);
            lowerCase.getClass();
            String p2 = i16631908410500040363.w("ad_unit_id").p();
            p2.getClass();
            String lowerCase2 = p2.toLowerCase(locale);
            lowerCase2.getClass();
            if (lowerCase.length() != 0 && lowerCase2.length() != 0) {
                I16631908410500040363 y = i16631908410500040363.y("mediation_config");
                P16422848101170923038 x = y != null ? y.x("ad_networks") : null;
                ArrayList arrayList = new ArrayList();
                if (x != null) {
                    ArrayList arrayList2 = x.a;
                    int size = arrayList2.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        int i3 = i + 1;
                        if (i < 0) {
                            K5751602218013079365.f0();
                            throw null;
                        }
                        K15572083692188606544 k15572083692188606544 = (K15572083692188606544) obj;
                        k15572083692188606544.getClass();
                        yn1 g = g(k15572083692188606544.l());
                        if (g != null) {
                            arrayList.add(g);
                        }
                        i = i3;
                    }
                }
                if (!arrayList.isEmpty()) {
                    String str = lowerCase2 + "," + lowerCase;
                    B6062915069895823126 q = dp1.q();
                    q.getClass();
                    o6641393078261985068 = ((dp1) q.b).adNetworkInfo_;
                    Collections.unmodifiableList(o6641393078261985068).getClass();
                    q.b();
                    dp1 dp1Var = (dp1) q.b;
                    o66413930782619850682 = dp1Var.adNetworkInfo_;
                    if (!((j) o66413930782619850682).a) {
                        dp1Var.adNetworkInfo_ = T8598786036980488824.b(o66413930782619850682);
                    }
                    o66413930782619850683 = dp1Var.adNetworkInfo_;
                    au0.a(arrayList, o66413930782619850683);
                    return new H9390398899829886498(str, (dp1) q.a());
                }
            }
            return null;
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static H9390398899829886498 b(I16631908410500040363 i16631908410500040363) {
        try {
            String a2 = d62.a(i16631908410500040363, "format", "");
            Locale locale = Locale.ROOT;
            String lowerCase = a2.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = d62.a(i16631908410500040363, "ad_unit_id", "").toLowerCase(locale);
            lowerCase2.getClass();
            K15572083692188606544 w = i16631908410500040363.w("request_signals");
            if (lowerCase.length() != 0 && lowerCase2.length() != 0 && w != null) {
                return new H9390398899829886498(lowerCase2 + "," + lowerCase, w.toString());
            }
            return null;
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static z8 c(I16631908410500040363 i16631908410500040363) {
        O6641393078261985068 o6641393078261985068;
        O6641393078261985068 o66413930782619850682;
        O6641393078261985068 o66413930782619850683;
        O6641393078261985068 o66413930782619850684;
        O6641393078261985068 o66413930782619850685;
        O6641393078261985068 o66413930782619850686;
        O14932123057360168587 r = z8.r();
        r.getClass();
        o6641393078261985068 = ((z8) r.b).includingRegexes_;
        Collections.unmodifiableList(o6641393078261985068).getClass();
        P16422848101170923038 x = i16631908410500040363.x("including");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (x != null) {
            ArrayList arrayList2 = x.a;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    K5751602218013079365.f0();
                    throw null;
                }
                K15572083692188606544 k15572083692188606544 = (K15572083692188606544) obj;
                k15572083692188606544.getClass();
                String p = k15572083692188606544.p();
                if (p != null) {
                    arrayList.add(p);
                }
                i2 = i4;
            }
        }
        r.b();
        z8 z8Var = (z8) r.b;
        o66413930782619850682 = z8Var.includingRegexes_;
        if (!((j) o66413930782619850682).a) {
            z8Var.includingRegexes_ = T8598786036980488824.b(o66413930782619850682);
        }
        o66413930782619850683 = z8Var.includingRegexes_;
        au0.a(arrayList, o66413930782619850683);
        o66413930782619850684 = ((z8) r.b).excludingRegexes_;
        Collections.unmodifiableList(o66413930782619850684).getClass();
        P16422848101170923038 x2 = i16631908410500040363.x("excluding");
        ArrayList arrayList3 = new ArrayList();
        if (x2 != null) {
            ArrayList arrayList4 = x2.a;
            int size2 = arrayList4.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList4.get(i5);
                i5++;
                int i6 = i + 1;
                if (i < 0) {
                    K5751602218013079365.f0();
                    throw null;
                }
                K15572083692188606544 k155720836921886065442 = (K15572083692188606544) obj2;
                k155720836921886065442.getClass();
                String p2 = k155720836921886065442.p();
                if (p2 != null) {
                    arrayList3.add(p2);
                }
                i = i6;
            }
        }
        r.b();
        z8 z8Var2 = (z8) r.b;
        o66413930782619850685 = z8Var2.excludingRegexes_;
        if (!((j) o66413930782619850685).a) {
            z8Var2.excludingRegexes_ = T8598786036980488824.b(o66413930782619850685);
        }
        o66413930782619850686 = z8Var2.excludingRegexes_;
        au0.a(arrayList3, o66413930782619850686);
        String lowerCase = d62.a(i16631908410500040363, "effective_ad_unit_id", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        r.b();
        ((z8) r.b).b(lowerCase);
        return (z8) r.a();
    }

    public static a70 d(I16631908410500040363 i16631908410500040363) {
        gn1 gn1Var;
        gn1 gn1Var2;
        gn1 gn1Var3;
        i16631908410500040363.getClass();
        H14305894327539119220 h14305894327539119220 = i16631908410500040363.a;
        try {
            U1061257129253093767 s = a70.s();
            s.getClass();
            String p = i16631908410500040363.w("client_pat").p();
            p.getClass();
            pb2 a2 = pb2.a(Base64.decode(p, 0));
            a2.getClass();
            s.b();
            ((a70) s.b).a(a2);
            String p2 = i16631908410500040363.w("client_pre").p();
            p2.getClass();
            uh2 a3 = uh2.a(Base64.decode(p2, 0));
            a3.getClass();
            s.b();
            ((a70) s.b).a(a3);
            gn1Var = ((a70) s.b).concatenatedSignalsMap_;
            Collections.unmodifiableMap(Collections.unmodifiableMap(gn1Var)).getClass();
            F14240031463097426304 f14240031463097426304 = new F14240031463097426304();
            String p3 = i16631908410500040363.w("arr_params").p();
            p3.getClass();
            H14305894327539119220 h143058943275391192202 = ((I16631908410500040363) f14240031463097426304.b(I16631908410500040363.class, p3)).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(E4951175994894594588.u0(h143058943275391192202.d));
            Iterator it = ((S11564727846197427291) h143058943275391192202.entrySet()).iterator();
            while (((L622219180424329983) it).hasNext()) {
                S8064361206571326475 a4 = ((L622219180424329983) it).a();
                linkedHashMap.put(a4.getKey(), ((K15572083692188606544) a4.getValue()).m().p());
            }
            s.b();
            a70 a70Var = (a70) s.b;
            gn1Var2 = a70Var.concatenatedSignalsMap_;
            if (!gn1Var2.a) {
                a70Var.concatenatedSignalsMap_ = gn1Var2.b();
            }
            gn1Var3 = a70Var.concatenatedSignalsMap_;
            gn1Var3.putAll(linkedHashMap);
            return (a70) s.a();
        } catch (Exception e) {
            ArrayList arrayList = G6547577305291411977.l(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static oa e(I16631908410500040363 i16631908410500040363) {
        O6641393078261985068 o6641393078261985068;
        O6641393078261985068 o66413930782619850682;
        O6641393078261985068 o66413930782619850683;
        try {
            E11743167429115753335 q = oa.q();
            q.getClass();
            o6641393078261985068 = ((oa) q.b).initializationData_;
            Collections.unmodifiableList(o6641393078261985068).getClass();
            K15572083692188606544 w = i16631908410500040363.w("data");
            P16422848101170923038 k = w != null ? w.k() : null;
            ArrayList arrayList = new ArrayList();
            if (k != null) {
                ArrayList arrayList2 = k.a;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        K5751602218013079365.f0();
                        throw null;
                    }
                    K15572083692188606544 k15572083692188606544 = (K15572083692188606544) obj;
                    k15572083692188606544.getClass();
                    arrayList.add(f(k15572083692188606544.l()));
                    i = i3;
                }
            }
            q.b();
            oa oaVar = (oa) q.b;
            o66413930782619850682 = oaVar.initializationData_;
            if (!((j) o66413930782619850682).a) {
                oaVar.initializationData_ = T8598786036980488824.b(o66413930782619850682);
            }
            o66413930782619850683 = oaVar.initializationData_;
            au0.a(arrayList, o66413930782619850683);
            return (oa) q.a();
        } catch (Exception e) {
            ArrayList arrayList3 = G6547577305291411977.l(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList3.add(message);
            return null;
        }
    }

    public static qa f(I16631908410500040363 i16631908410500040363) {
        gn1 gn1Var;
        gn1 gn1Var2;
        gn1 gn1Var3;
        K15899002224316188312 q = qa.q();
        q.getClass();
        K15572083692188606544 w = i16631908410500040363.w("format");
        String p = w != null ? w.p() : null;
        if (p == null) {
            p = "";
        }
        q.b();
        ((qa) q.b).b(p);
        K15572083692188606544 w2 = i16631908410500040363.w("data");
        if (w2 != null) {
            I16631908410500040363 l = w2.l();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((S11564727846197427291) l.a.entrySet()).iterator();
            while (((L622219180424329983) it).hasNext()) {
                S8064361206571326475 a2 = ((L622219180424329983) it).a();
                String str = (String) a2.getKey();
                K15572083692188606544 k15572083692188606544 = (K15572083692188606544) a2.getValue();
                str.getClass();
                k15572083692188606544.getClass();
                linkedHashMap.put(str, k15572083692188606544.p());
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                gn1Var = ((qa) q.b).extras_;
                Collections.unmodifiableMap(Collections.unmodifiableMap(gn1Var)).getClass();
                str3.getClass();
                str2.getClass();
                q.b();
                qa qaVar = (qa) q.b;
                gn1Var2 = qaVar.extras_;
                if (!gn1Var2.a) {
                    qaVar.extras_ = gn1Var2.b();
                }
                gn1Var3 = qaVar.extras_;
                gn1Var3.put(str2, str3);
            }
        }
        return (qa) q.a();
    }

    public static yn1 g(I16631908410500040363 i16631908410500040363) {
        gn1 gn1Var;
        gn1 gn1Var2;
        gn1 gn1Var3;
        O6641393078261985068 o6641393078261985068;
        O6641393078261985068 o66413930782619850682;
        O6641393078261985068 o66413930782619850683;
        O6641393078261985068 o66413930782619850684;
        O6641393078261985068 o66413930782619850685;
        O6641393078261985068 o66413930782619850686;
        try {
            S6059772632253557467 r = yn1.r();
            r.getClass();
            I16631908410500040363 y = i16631908410500040363.y("data");
            gn1Var = ((yn1) r.b).data_;
            Collections.unmodifiableMap(Collections.unmodifiableMap(gn1Var)).getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (y != null) {
                Iterator it = ((S11564727846197427291) y.a.entrySet()).iterator();
                while (((L622219180424329983) it).hasNext()) {
                    S8064361206571326475 a2 = ((L622219180424329983) it).a();
                    String str = (String) a2.getKey();
                    K15572083692188606544 k15572083692188606544 = (K15572083692188606544) a2.getValue();
                    str.getClass();
                    k15572083692188606544.getClass();
                    linkedHashMap.put(str, k15572083692188606544.p());
                }
            }
            r.b();
            yn1 yn1Var = (yn1) r.b;
            gn1Var2 = yn1Var.data_;
            if (!gn1Var2.a) {
                yn1Var.data_ = gn1Var2.b();
            }
            gn1Var3 = yn1Var.data_;
            gn1Var3.putAll(linkedHashMap);
            o6641393078261985068 = ((yn1) r.b).adapters_;
            Collections.unmodifiableList(o6641393078261985068).getClass();
            P16422848101170923038 x = i16631908410500040363.x("rtb_adapters");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (x != null) {
                ArrayList arrayList2 = x.a;
                int size = arrayList2.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        K5751602218013079365.f0();
                        throw null;
                    }
                    K15572083692188606544 k155720836921886065442 = (K15572083692188606544) obj;
                    k155720836921886065442.getClass();
                    List list = z1.D0;
                    String p = k155720836921886065442.p();
                    p.getClass();
                    arrayList.add(B6030175592171028728.h(y == null ? new I16631908410500040363() : y, p));
                    i2 = i4;
                }
            }
            r.b();
            yn1 yn1Var2 = (yn1) r.b;
            o66413930782619850682 = yn1Var2.adapters_;
            if (!((j) o66413930782619850682).a) {
                yn1Var2.adapters_ = T8598786036980488824.b(o66413930782619850682);
            }
            o66413930782619850683 = yn1Var2.adapters_;
            au0.a(arrayList, o66413930782619850683);
            o66413930782619850684 = ((yn1) r.b).waterfallAdapters_;
            Collections.unmodifiableList(o66413930782619850684).getClass();
            P16422848101170923038 x2 = i16631908410500040363.x("adapters");
            ArrayList arrayList3 = new ArrayList();
            if (x2 != null) {
                ArrayList arrayList4 = x2.a;
                int size2 = arrayList4.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList4.get(i5);
                    i5++;
                    int i6 = i + 1;
                    if (i < 0) {
                        K5751602218013079365.f0();
                        throw null;
                    }
                    K15572083692188606544 k155720836921886065443 = (K15572083692188606544) obj2;
                    k155720836921886065443.getClass();
                    List list2 = z1.D0;
                    String p2 = k155720836921886065443.p();
                    p2.getClass();
                    arrayList3.add(B6030175592171028728.h(y == null ? new I16631908410500040363() : y, p2));
                    i = i6;
                }
            }
            r.b();
            yn1 yn1Var3 = (yn1) r.b;
            o66413930782619850685 = yn1Var3.waterfallAdapters_;
            if (!((j) o66413930782619850685).a) {
                yn1Var3.waterfallAdapters_ = T8598786036980488824.b(o66413930782619850685);
            }
            o66413930782619850686 = yn1Var3.waterfallAdapters_;
            au0.a(arrayList3, o66413930782619850686);
            return (yn1) r.a();
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static H9390398899829886498 h(I16631908410500040363 i16631908410500040363) {
        try {
            String a2 = d62.a(i16631908410500040363, "adapter_class_name", "");
            if (a2.length() == 0) {
                return null;
            }
            H1850504041015929188 s = ap.s();
            s.getClass();
            s.b();
            ((ap) s.b).b(a2);
            s.d(d62.a(i16631908410500040363, "collect_signals", false));
            s.c(true);
            s.e().getClass();
            K15572083692188606544 w = i16631908410500040363.w("data");
            I16631908410500040363 l = w != null ? w.l() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (l != null) {
                Iterator it = ((S11564727846197427291) l.a.entrySet()).iterator();
                while (((L622219180424329983) it).hasNext()) {
                    S8064361206571326475 a3 = ((L622219180424329983) it).a();
                    String str = (String) a3.getKey();
                    K15572083692188606544 k15572083692188606544 = (K15572083692188606544) a3.getValue();
                    str.getClass();
                    k15572083692188606544.getClass();
                    linkedHashMap.put(str, k15572083692188606544.p());
                }
            }
            s.b();
            ((ap) s.b).p().putAll(linkedHashMap);
            return new H9390398899829886498(a2, (ap) s.a());
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static iz a(I16631908410500040363 i16631908410500040363, I16631908410500040363 i166319084105000403632) {
        i16631908410500040363.getClass();
        i166319084105000403632.getClass();
        try {
            L14515889287724438211 w = iz.w();
            w.getClass();
            String f = new F14240031463097426304().f(i166319084105000403632);
            w.b();
            ((iz) w.b).c(f);
            String p = i16631908410500040363.w("consent_state").p();
            p.getClass();
            w.b();
            ((iz) w.b).b(p);
            P12817159812099202599 p12817159812099202599 = W1349480363743553773.e;
            String p2 = i16631908410500040363.w("allowlist").p();
            p2.getClass();
            ax a2 = ax.a(p12817159812099202599.a(p2));
            a2.getClass();
            w.b();
            ((iz) w.b).a(a2);
            return (iz) w.a();
        } catch (Exception e) {
            ArrayList arrayList = G6547577305291411977.l(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static ap a(I16631908410500040363 i16631908410500040363, String str, String str2) {
        try {
            if (!d62.a(i16631908410500040363, "platform", "").equalsIgnoreCase(str2)) {
                return null;
            }
            H1850504041015929188 s = ap.s();
            s.getClass();
            s.b();
            ((ap) s.b).b(str);
            String lowerCase = d62.a(i16631908410500040363, "platform", "").toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            s.b();
            ((ap) s.b).c(lowerCase);
            s.d(d62.a(i16631908410500040363, "collect_secure_signals", false));
            s.c(d62.a(i16631908410500040363, "collect_secure_signals_on_full_app", false));
            s.e().getClass();
            K15572083692188606544 w = i16631908410500040363.w("data");
            I16631908410500040363 l = w != null ? w.l() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (l != null) {
                Iterator it = ((S11564727846197427291) l.a.entrySet()).iterator();
                while (((L622219180424329983) it).hasNext()) {
                    S8064361206571326475 a2 = ((L622219180424329983) it).a();
                    String str3 = (String) a2.getKey();
                    K15572083692188606544 k15572083692188606544 = (K15572083692188606544) a2.getValue();
                    str3.getClass();
                    k15572083692188606544.getClass();
                    linkedHashMap.put(str3, k15572083692188606544.p());
                }
            }
            s.b();
            ((ap) s.b).p().putAll(linkedHashMap);
            return (ap) s.a();
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static H9390398899829886498 a(I16631908410500040363 i16631908410500040363, String str) {
        try {
            String a2 = d62.a(i16631908410500040363, "adapter_class_name", "");
            if (a2.length() == 0) {
                return null;
            }
            K15572083692188606544 w = i16631908410500040363.w("permission_set");
            P16422848101170923038 k = w != null ? w.k() : null;
            ArrayList arrayList = new ArrayList();
            if (k != null) {
                ArrayList arrayList2 = k.a;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i >= 0) {
                        K15572083692188606544 k15572083692188606544 = (K15572083692188606544) obj;
                        k15572083692188606544.getClass();
                        ap a3 = a(k15572083692188606544.l(), a2, str);
                        H9390398899829886498 h9390398899829886498 = a3 != null ? new H9390398899829886498(a2, a3) : null;
                        if (h9390398899829886498 != null) {
                            arrayList.add(h9390398899829886498);
                        }
                        i = i3;
                    } else {
                        K5751602218013079365.f0();
                        throw null;
                    }
                }
            }
            return (H9390398899829886498) R9411874267597469228.D0(arrayList);
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static d9 a(P16422848101170923038 p16422848101170923038) {
        O6641393078261985068 o6641393078261985068;
        O6641393078261985068 o66413930782619850682;
        O6641393078261985068 o66413930782619850683;
        try {
            D3699235533239707501 q = d9.q();
            q.getClass();
            o6641393078261985068 = ((d9) q.b).adUnitPatterns_;
            Collections.unmodifiableList(o6641393078261985068).getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = p16422848101170923038.a;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                int i3 = i + 1;
                if (i >= 0) {
                    K15572083692188606544 k15572083692188606544 = (K15572083692188606544) obj;
                    k15572083692188606544.getClass();
                    arrayList.add(c(k15572083692188606544.l()));
                    i = i3;
                } else {
                    K5751602218013079365.f0();
                    throw null;
                }
            }
            q.b();
            d9 d9Var = (d9) q.b;
            o66413930782619850682 = d9Var.adUnitPatterns_;
            if (!((j) o66413930782619850682).a) {
                d9Var.adUnitPatterns_ = T8598786036980488824.b(o66413930782619850682);
            }
            o66413930782619850683 = d9Var.adUnitPatterns_;
            au0.a(arrayList, o66413930782619850683);
            return (d9) q.a();
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }
}
