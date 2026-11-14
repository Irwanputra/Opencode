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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class e41 {
    public static final e41 a = new e41();

    public static H9390398899829886498 a(I16631908410500040363 i16631908410500040363) {
        try {
            String strP = i16631908410500040363.w("format").p();
            strP.getClass();
            Locale locale = Locale.ROOT;
            String lowerCase = strP.toLowerCase(locale);
            lowerCase.getClass();
            String strP2 = i16631908410500040363.w("ad_unit_id").p();
            strP2.getClass();
            String lowerCase2 = strP2.toLowerCase(locale);
            lowerCase2.getClass();
            if (lowerCase.length() != 0 && lowerCase2.length() != 0) {
                I16631908410500040363 i16631908410500040363Y = i16631908410500040363.y("mediation_config");
                P16422848101170923038 p16422848101170923038X = i16631908410500040363Y != null ? i16631908410500040363Y.x("ad_networks") : null;
                ArrayList arrayList = new ArrayList();
                if (p16422848101170923038X != null) {
                    ArrayList arrayList2 = p16422848101170923038X.a;
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
                        yn1 yn1VarG = g(k15572083692188606544.l());
                        if (yn1VarG != null) {
                            arrayList.add(yn1VarG);
                        }
                        i = i3;
                    }
                }
                if (!arrayList.isEmpty()) {
                    String str = lowerCase2 + "," + lowerCase;
                    B6062915069895823126 b6062915069895823126Q = dp1.q();
                    b6062915069895823126Q.getClass();
                    Collections.unmodifiableList(((dp1) b6062915069895823126Q.b).adNetworkInfo_).getClass();
                    b6062915069895823126Q.b();
                    dp1 dp1Var = (dp1) b6062915069895823126Q.b;
                    O6641393078261985068 o6641393078261985068 = dp1Var.adNetworkInfo_;
                    if (!((j) o6641393078261985068).a) {
                        dp1Var.adNetworkInfo_ = T8598786036980488824.b(o6641393078261985068);
                    }
                    au0.a(arrayList, dp1Var.adNetworkInfo_);
                    return new H9390398899829886498(str, (dp1) b6062915069895823126Q.a());
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
            String strA = d62.a(i16631908410500040363, "format", "");
            Locale locale = Locale.ROOT;
            String lowerCase = strA.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = d62.a(i16631908410500040363, "ad_unit_id", "").toLowerCase(locale);
            lowerCase2.getClass();
            K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("request_signals");
            if (lowerCase.length() != 0 && lowerCase2.length() != 0 && k15572083692188606544W != null) {
                return new H9390398899829886498(lowerCase2 + "," + lowerCase, k15572083692188606544W.toString());
            }
            return null;
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static z8 c(I16631908410500040363 i16631908410500040363) {
        O14932123057360168587 o14932123057360168587R = z8.r();
        o14932123057360168587R.getClass();
        Collections.unmodifiableList(((z8) o14932123057360168587R.b).includingRegexes_).getClass();
        P16422848101170923038 p16422848101170923038X = i16631908410500040363.x("including");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (p16422848101170923038X != null) {
            ArrayList arrayList2 = p16422848101170923038X.a;
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
                String strP = k15572083692188606544.p();
                if (strP != null) {
                    arrayList.add(strP);
                }
                i2 = i4;
            }
        }
        o14932123057360168587R.b();
        z8 z8Var = (z8) o14932123057360168587R.b;
        O6641393078261985068 o6641393078261985068 = z8Var.includingRegexes_;
        if (!((j) o6641393078261985068).a) {
            z8Var.includingRegexes_ = T8598786036980488824.b(o6641393078261985068);
        }
        au0.a(arrayList, z8Var.includingRegexes_);
        Collections.unmodifiableList(((z8) o14932123057360168587R.b).excludingRegexes_).getClass();
        P16422848101170923038 p16422848101170923038X2 = i16631908410500040363.x("excluding");
        ArrayList arrayList3 = new ArrayList();
        if (p16422848101170923038X2 != null) {
            ArrayList arrayList4 = p16422848101170923038X2.a;
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
                String strP2 = k155720836921886065442.p();
                if (strP2 != null) {
                    arrayList3.add(strP2);
                }
                i = i6;
            }
        }
        o14932123057360168587R.b();
        z8 z8Var2 = (z8) o14932123057360168587R.b;
        O6641393078261985068 o66413930782619850682 = z8Var2.excludingRegexes_;
        if (!((j) o66413930782619850682).a) {
            z8Var2.excludingRegexes_ = T8598786036980488824.b(o66413930782619850682);
        }
        au0.a(arrayList3, z8Var2.excludingRegexes_);
        String lowerCase = d62.a(i16631908410500040363, "effective_ad_unit_id", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        o14932123057360168587R.b();
        ((z8) o14932123057360168587R.b).b(lowerCase);
        return (z8) o14932123057360168587R.a();
    }

    public static a70 d(I16631908410500040363 i16631908410500040363) {
        i16631908410500040363.getClass();
        H14305894327539119220 h14305894327539119220 = i16631908410500040363.a;
        try {
            U1061257129253093767 u1061257129253093767S = a70.s();
            u1061257129253093767S.getClass();
            String strP = i16631908410500040363.w("client_pat").p();
            strP.getClass();
            pb2 pb2VarA = pb2.a(Base64.decode(strP, 0));
            pb2VarA.getClass();
            u1061257129253093767S.b();
            ((a70) u1061257129253093767S.b).a(pb2VarA);
            String strP2 = i16631908410500040363.w("client_pre").p();
            strP2.getClass();
            uh2 uh2VarA = uh2.a(Base64.decode(strP2, 0));
            uh2VarA.getClass();
            u1061257129253093767S.b();
            ((a70) u1061257129253093767S.b).a(uh2VarA);
            Collections.unmodifiableMap(Collections.unmodifiableMap(((a70) u1061257129253093767S.b).concatenatedSignalsMap_)).getClass();
            F14240031463097426304 f14240031463097426304 = new F14240031463097426304();
            String strP3 = i16631908410500040363.w("arr_params").p();
            strP3.getClass();
            H14305894327539119220 h143058943275391192202 = ((I16631908410500040363) f14240031463097426304.b(I16631908410500040363.class, strP3)).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(E4951175994894594588.u0(h143058943275391192202.d));
            Iterator it = ((S11564727846197427291) h143058943275391192202.entrySet()).iterator();
            while (((L622219180424329983) it).hasNext()) {
                S8064361206571326475 s8064361206571326475A = ((L622219180424329983) it).a();
                linkedHashMap.put(s8064361206571326475A.getKey(), ((K15572083692188606544) s8064361206571326475A.getValue()).m().p());
            }
            u1061257129253093767S.b();
            a70 a70Var = (a70) u1061257129253093767S.b;
            gn1 gn1Var = a70Var.concatenatedSignalsMap_;
            if (!gn1Var.a) {
                a70Var.concatenatedSignalsMap_ = gn1Var.b();
            }
            a70Var.concatenatedSignalsMap_.putAll(linkedHashMap);
            return (a70) u1061257129253093767S.a();
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
        try {
            E11743167429115753335 e11743167429115753335Q = oa.q();
            e11743167429115753335Q.getClass();
            Collections.unmodifiableList(((oa) e11743167429115753335Q.b).initializationData_).getClass();
            K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("data");
            P16422848101170923038 p16422848101170923038K = k15572083692188606544W != null ? k15572083692188606544W.k() : null;
            ArrayList arrayList = new ArrayList();
            if (p16422848101170923038K != null) {
                ArrayList arrayList2 = p16422848101170923038K.a;
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
            e11743167429115753335Q.b();
            oa oaVar = (oa) e11743167429115753335Q.b;
            O6641393078261985068 o6641393078261985068 = oaVar.initializationData_;
            if (!((j) o6641393078261985068).a) {
                oaVar.initializationData_ = T8598786036980488824.b(o6641393078261985068);
            }
            au0.a(arrayList, oaVar.initializationData_);
            return (oa) e11743167429115753335Q.a();
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
        K15899002224316188312 k15899002224316188312Q = qa.q();
        k15899002224316188312Q.getClass();
        K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("format");
        String strP = k15572083692188606544W != null ? k15572083692188606544W.p() : null;
        if (strP == null) {
            strP = "";
        }
        k15899002224316188312Q.b();
        ((qa) k15899002224316188312Q.b).b(strP);
        K15572083692188606544 k15572083692188606544W2 = i16631908410500040363.w("data");
        if (k15572083692188606544W2 != null) {
            I16631908410500040363 i16631908410500040363L = k15572083692188606544W2.l();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((S11564727846197427291) i16631908410500040363L.a.entrySet()).iterator();
            while (((L622219180424329983) it).hasNext()) {
                S8064361206571326475 s8064361206571326475A = ((L622219180424329983) it).a();
                String str = (String) s8064361206571326475A.getKey();
                K15572083692188606544 k15572083692188606544 = (K15572083692188606544) s8064361206571326475A.getValue();
                str.getClass();
                k15572083692188606544.getClass();
                linkedHashMap.put(str, k15572083692188606544.p());
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                Collections.unmodifiableMap(Collections.unmodifiableMap(((qa) k15899002224316188312Q.b).extras_)).getClass();
                str3.getClass();
                str2.getClass();
                k15899002224316188312Q.b();
                qa qaVar = (qa) k15899002224316188312Q.b;
                gn1 gn1Var = qaVar.extras_;
                if (!gn1Var.a) {
                    qaVar.extras_ = gn1Var.b();
                }
                qaVar.extras_.put(str2, str3);
            }
        }
        return (qa) k15899002224316188312Q.a();
    }

    public static yn1 g(I16631908410500040363 i16631908410500040363) {
        try {
            S6059772632253557467 s6059772632253557467R = yn1.r();
            s6059772632253557467R.getClass();
            I16631908410500040363 i16631908410500040363Y = i16631908410500040363.y("data");
            Collections.unmodifiableMap(Collections.unmodifiableMap(((yn1) s6059772632253557467R.b).data_)).getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i16631908410500040363Y != null) {
                Iterator it = ((S11564727846197427291) i16631908410500040363Y.a.entrySet()).iterator();
                while (((L622219180424329983) it).hasNext()) {
                    S8064361206571326475 s8064361206571326475A = ((L622219180424329983) it).a();
                    String str = (String) s8064361206571326475A.getKey();
                    K15572083692188606544 k15572083692188606544 = (K15572083692188606544) s8064361206571326475A.getValue();
                    str.getClass();
                    k15572083692188606544.getClass();
                    linkedHashMap.put(str, k15572083692188606544.p());
                }
            }
            s6059772632253557467R.b();
            yn1 yn1Var = (yn1) s6059772632253557467R.b;
            gn1 gn1Var = yn1Var.data_;
            if (!gn1Var.a) {
                yn1Var.data_ = gn1Var.b();
            }
            yn1Var.data_.putAll(linkedHashMap);
            Collections.unmodifiableList(((yn1) s6059772632253557467R.b).adapters_).getClass();
            P16422848101170923038 p16422848101170923038X = i16631908410500040363.x("rtb_adapters");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (p16422848101170923038X != null) {
                ArrayList arrayList2 = p16422848101170923038X.a;
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
                    String strP = k155720836921886065442.p();
                    strP.getClass();
                    arrayList.add(B6030175592171028728.h(i16631908410500040363Y == null ? new I16631908410500040363() : i16631908410500040363Y, strP));
                    i2 = i4;
                }
            }
            s6059772632253557467R.b();
            yn1 yn1Var2 = (yn1) s6059772632253557467R.b;
            O6641393078261985068 o6641393078261985068 = yn1Var2.adapters_;
            if (!((j) o6641393078261985068).a) {
                yn1Var2.adapters_ = T8598786036980488824.b(o6641393078261985068);
            }
            au0.a(arrayList, yn1Var2.adapters_);
            Collections.unmodifiableList(((yn1) s6059772632253557467R.b).waterfallAdapters_).getClass();
            P16422848101170923038 p16422848101170923038X2 = i16631908410500040363.x("adapters");
            ArrayList arrayList3 = new ArrayList();
            if (p16422848101170923038X2 != null) {
                ArrayList arrayList4 = p16422848101170923038X2.a;
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
                    String strP2 = k155720836921886065443.p();
                    strP2.getClass();
                    arrayList3.add(B6030175592171028728.h(i16631908410500040363Y == null ? new I16631908410500040363() : i16631908410500040363Y, strP2));
                    i = i6;
                }
            }
            s6059772632253557467R.b();
            yn1 yn1Var3 = (yn1) s6059772632253557467R.b;
            O6641393078261985068 o66413930782619850682 = yn1Var3.waterfallAdapters_;
            if (!((j) o66413930782619850682).a) {
                yn1Var3.waterfallAdapters_ = T8598786036980488824.b(o66413930782619850682);
            }
            au0.a(arrayList3, yn1Var3.waterfallAdapters_);
            return (yn1) s6059772632253557467R.a();
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static H9390398899829886498 h(I16631908410500040363 i16631908410500040363) {
        try {
            String strA = d62.a(i16631908410500040363, "adapter_class_name", "");
            if (strA.length() == 0) {
                return null;
            }
            H1850504041015929188 h1850504041015929188S = ap.s();
            h1850504041015929188S.getClass();
            h1850504041015929188S.b();
            ((ap) h1850504041015929188S.b).b(strA);
            h1850504041015929188S.d(d62.a(i16631908410500040363, "collect_signals", false));
            h1850504041015929188S.c(true);
            h1850504041015929188S.e().getClass();
            K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("data");
            I16631908410500040363 i16631908410500040363L = k15572083692188606544W != null ? k15572083692188606544W.l() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i16631908410500040363L != null) {
                Iterator it = ((S11564727846197427291) i16631908410500040363L.a.entrySet()).iterator();
                while (((L622219180424329983) it).hasNext()) {
                    S8064361206571326475 s8064361206571326475A = ((L622219180424329983) it).a();
                    String str = (String) s8064361206571326475A.getKey();
                    K15572083692188606544 k15572083692188606544 = (K15572083692188606544) s8064361206571326475A.getValue();
                    str.getClass();
                    k15572083692188606544.getClass();
                    linkedHashMap.put(str, k15572083692188606544.p());
                }
            }
            h1850504041015929188S.b();
            ((ap) h1850504041015929188S.b).p().putAll(linkedHashMap);
            return new H9390398899829886498(strA, (ap) h1850504041015929188S.a());
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static iz a(I16631908410500040363 i16631908410500040363, I16631908410500040363 i166319084105000403632) {
        i16631908410500040363.getClass();
        i166319084105000403632.getClass();
        try {
            L14515889287724438211 l14515889287724438211W = iz.w();
            l14515889287724438211W.getClass();
            String strF = new F14240031463097426304().f(i166319084105000403632);
            l14515889287724438211W.b();
            ((iz) l14515889287724438211W.b).c(strF);
            String strP = i16631908410500040363.w("consent_state").p();
            strP.getClass();
            l14515889287724438211W.b();
            ((iz) l14515889287724438211W.b).b(strP);
            P12817159812099202599 p12817159812099202599 = W1349480363743553773.e;
            String strP2 = i16631908410500040363.w("allowlist").p();
            strP2.getClass();
            ax axVarA = ax.a(p12817159812099202599.a(strP2));
            axVarA.getClass();
            l14515889287724438211W.b();
            ((iz) l14515889287724438211W.b).a(axVarA);
            return (iz) l14515889287724438211W.a();
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
            H1850504041015929188 h1850504041015929188S = ap.s();
            h1850504041015929188S.getClass();
            h1850504041015929188S.b();
            ((ap) h1850504041015929188S.b).b(str);
            String lowerCase = d62.a(i16631908410500040363, "platform", "").toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            h1850504041015929188S.b();
            ((ap) h1850504041015929188S.b).c(lowerCase);
            h1850504041015929188S.d(d62.a(i16631908410500040363, "collect_secure_signals", false));
            h1850504041015929188S.c(d62.a(i16631908410500040363, "collect_secure_signals_on_full_app", false));
            h1850504041015929188S.e().getClass();
            K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("data");
            I16631908410500040363 i16631908410500040363L = k15572083692188606544W != null ? k15572083692188606544W.l() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i16631908410500040363L != null) {
                Iterator it = ((S11564727846197427291) i16631908410500040363L.a.entrySet()).iterator();
                while (((L622219180424329983) it).hasNext()) {
                    S8064361206571326475 s8064361206571326475A = ((L622219180424329983) it).a();
                    String str3 = (String) s8064361206571326475A.getKey();
                    K15572083692188606544 k15572083692188606544 = (K15572083692188606544) s8064361206571326475A.getValue();
                    str3.getClass();
                    k15572083692188606544.getClass();
                    linkedHashMap.put(str3, k15572083692188606544.p());
                }
            }
            h1850504041015929188S.b();
            ((ap) h1850504041015929188S.b).p().putAll(linkedHashMap);
            return (ap) h1850504041015929188S.a();
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }

    public static H9390398899829886498 a(I16631908410500040363 i16631908410500040363, String str) {
        try {
            String strA = d62.a(i16631908410500040363, "adapter_class_name", "");
            if (strA.length() == 0) {
                return null;
            }
            K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("permission_set");
            P16422848101170923038 p16422848101170923038K = k15572083692188606544W != null ? k15572083692188606544W.k() : null;
            ArrayList arrayList = new ArrayList();
            if (p16422848101170923038K != null) {
                ArrayList arrayList2 = p16422848101170923038K.a;
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
                        ap apVarA = a(k15572083692188606544.l(), strA, str);
                        H9390398899829886498 h9390398899829886498 = apVarA != null ? new H9390398899829886498(strA, apVarA) : null;
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
        try {
            D3699235533239707501 d3699235533239707501Q = d9.q();
            d3699235533239707501Q.getClass();
            Collections.unmodifiableList(((d9) d3699235533239707501Q.b).adUnitPatterns_).getClass();
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
            d3699235533239707501Q.b();
            d9 d9Var = (d9) d3699235533239707501Q.b;
            O6641393078261985068 o6641393078261985068 = d9Var.adUnitPatterns_;
            if (!((j) o6641393078261985068).a) {
                d9Var.adUnitPatterns_ = T8598786036980488824.b(o6641393078261985068);
            }
            au0.a(arrayList, d9Var.adUnitPatterns_);
            return (d9) d3699235533239707501Q.a();
        } catch (Exception e) {
            zi3.a(e);
            return null;
        }
    }
}
