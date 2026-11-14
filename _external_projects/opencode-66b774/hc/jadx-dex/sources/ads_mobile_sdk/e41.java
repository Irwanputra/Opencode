package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class e41 {
    public static final ads_mobile_sdk.e41 a = new ads_mobile_sdk.e41();

    public static dev.epro.r0.H9390398899829886498 a(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        try {
            java.lang.String strP = i16631908410500040363.w("format").p();
            strP.getClass();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = strP.toLowerCase(locale);
            lowerCase.getClass();
            java.lang.String strP2 = i16631908410500040363.w("ad_unit_id").p();
            strP2.getClass();
            java.lang.String lowerCase2 = strP2.toLowerCase(locale);
            lowerCase2.getClass();
            if (lowerCase.length() != 0 && lowerCase2.length() != 0) {
                dev.epro.r0.I16631908410500040363 i16631908410500040363Y = i16631908410500040363.y("mediation_config");
                dev.epro.r0.P16422848101170923038 p16422848101170923038X = i16631908410500040363Y != null ? i16631908410500040363Y.x("ad_networks") : null;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (p16422848101170923038X != null) {
                    java.util.ArrayList arrayList2 = p16422848101170923038X.a;
                    int size = arrayList2.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        java.lang.Object obj = arrayList2.get(i2);
                        i2++;
                        int i3 = i + 1;
                        if (i < 0) {
                            dev.epro.r0.K5751602218013079365.f0();
                            throw null;
                        }
                        dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) obj;
                        k15572083692188606544.getClass();
                        ads_mobile_sdk.yn1 yn1VarG = g(k15572083692188606544.l());
                        if (yn1VarG != null) {
                            arrayList.add(yn1VarG);
                        }
                        i = i3;
                    }
                }
                if (!arrayList.isEmpty()) {
                    java.lang.String str = lowerCase2 + "," + lowerCase;
                    dev.epro.r0.B6062915069895823126 b6062915069895823126Q = ads_mobile_sdk.dp1.q();
                    b6062915069895823126Q.getClass();
                    java.util.Collections.unmodifiableList(((ads_mobile_sdk.dp1) b6062915069895823126Q.b).adNetworkInfo_).getClass();
                    b6062915069895823126Q.b();
                    ads_mobile_sdk.dp1 dp1Var = (ads_mobile_sdk.dp1) b6062915069895823126Q.b;
                    dev.epro.r0.O6641393078261985068 o6641393078261985068 = dp1Var.adNetworkInfo_;
                    if (!((ads_mobile_sdk.j) o6641393078261985068).a) {
                        dp1Var.adNetworkInfo_ = dev.epro.r0.T8598786036980488824.b(o6641393078261985068);
                    }
                    ads_mobile_sdk.au0.a(arrayList, dp1Var.adNetworkInfo_);
                    return new dev.epro.r0.H9390398899829886498(str, (ads_mobile_sdk.dp1) b6062915069895823126Q.a());
                }
            }
            return null;
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(e);
            return null;
        }
    }

    public static dev.epro.r0.H9390398899829886498 b(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        try {
            java.lang.String strA = ads_mobile_sdk.d62.a(i16631908410500040363, "format", "");
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = strA.toLowerCase(locale);
            lowerCase.getClass();
            java.lang.String lowerCase2 = ads_mobile_sdk.d62.a(i16631908410500040363, "ad_unit_id", "").toLowerCase(locale);
            lowerCase2.getClass();
            dev.epro.r0.K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("request_signals");
            if (lowerCase.length() != 0 && lowerCase2.length() != 0 && k15572083692188606544W != null) {
                return new dev.epro.r0.H9390398899829886498(lowerCase2 + "," + lowerCase, k15572083692188606544W.toString());
            }
            return null;
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(e);
            return null;
        }
    }

    public static ads_mobile_sdk.z8 c(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        dev.epro.r0.O14932123057360168587 o14932123057360168587R = ads_mobile_sdk.z8.r();
        o14932123057360168587R.getClass();
        java.util.Collections.unmodifiableList(((ads_mobile_sdk.z8) o14932123057360168587R.b).includingRegexes_).getClass();
        dev.epro.r0.P16422848101170923038 p16422848101170923038X = i16631908410500040363.x("including");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        if (p16422848101170923038X != null) {
            java.util.ArrayList arrayList2 = p16422848101170923038X.a;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                java.lang.Object obj = arrayList2.get(i3);
                i3++;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    dev.epro.r0.K5751602218013079365.f0();
                    throw null;
                }
                dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) obj;
                k15572083692188606544.getClass();
                java.lang.String strP = k15572083692188606544.p();
                if (strP != null) {
                    arrayList.add(strP);
                }
                i2 = i4;
            }
        }
        o14932123057360168587R.b();
        ads_mobile_sdk.z8 z8Var = (ads_mobile_sdk.z8) o14932123057360168587R.b;
        dev.epro.r0.O6641393078261985068 o6641393078261985068 = z8Var.includingRegexes_;
        if (!((ads_mobile_sdk.j) o6641393078261985068).a) {
            z8Var.includingRegexes_ = dev.epro.r0.T8598786036980488824.b(o6641393078261985068);
        }
        ads_mobile_sdk.au0.a(arrayList, z8Var.includingRegexes_);
        java.util.Collections.unmodifiableList(((ads_mobile_sdk.z8) o14932123057360168587R.b).excludingRegexes_).getClass();
        dev.epro.r0.P16422848101170923038 p16422848101170923038X2 = i16631908410500040363.x("excluding");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (p16422848101170923038X2 != null) {
            java.util.ArrayList arrayList4 = p16422848101170923038X2.a;
            int size2 = arrayList4.size();
            int i5 = 0;
            while (i5 < size2) {
                java.lang.Object obj2 = arrayList4.get(i5);
                i5++;
                int i6 = i + 1;
                if (i < 0) {
                    dev.epro.r0.K5751602218013079365.f0();
                    throw null;
                }
                dev.epro.r0.K15572083692188606544 k155720836921886065442 = (dev.epro.r0.K15572083692188606544) obj2;
                k155720836921886065442.getClass();
                java.lang.String strP2 = k155720836921886065442.p();
                if (strP2 != null) {
                    arrayList3.add(strP2);
                }
                i = i6;
            }
        }
        o14932123057360168587R.b();
        ads_mobile_sdk.z8 z8Var2 = (ads_mobile_sdk.z8) o14932123057360168587R.b;
        dev.epro.r0.O6641393078261985068 o66413930782619850682 = z8Var2.excludingRegexes_;
        if (!((ads_mobile_sdk.j) o66413930782619850682).a) {
            z8Var2.excludingRegexes_ = dev.epro.r0.T8598786036980488824.b(o66413930782619850682);
        }
        ads_mobile_sdk.au0.a(arrayList3, z8Var2.excludingRegexes_);
        java.lang.String lowerCase = ads_mobile_sdk.d62.a(i16631908410500040363, "effective_ad_unit_id", "").toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        o14932123057360168587R.b();
        ((ads_mobile_sdk.z8) o14932123057360168587R.b).b(lowerCase);
        return (ads_mobile_sdk.z8) o14932123057360168587R.a();
    }

    public static ads_mobile_sdk.a70 d(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        i16631908410500040363.getClass();
        dev.epro.r0.H14305894327539119220 h14305894327539119220 = i16631908410500040363.a;
        try {
            dev.epro.r0.U1061257129253093767 u1061257129253093767S = ads_mobile_sdk.a70.s();
            u1061257129253093767S.getClass();
            java.lang.String strP = i16631908410500040363.w("client_pat").p();
            strP.getClass();
            ads_mobile_sdk.pb2 pb2VarA = ads_mobile_sdk.pb2.a(android.util.Base64.decode(strP, 0));
            pb2VarA.getClass();
            u1061257129253093767S.b();
            ((ads_mobile_sdk.a70) u1061257129253093767S.b).a(pb2VarA);
            java.lang.String strP2 = i16631908410500040363.w("client_pre").p();
            strP2.getClass();
            ads_mobile_sdk.uh2 uh2VarA = ads_mobile_sdk.uh2.a(android.util.Base64.decode(strP2, 0));
            uh2VarA.getClass();
            u1061257129253093767S.b();
            ((ads_mobile_sdk.a70) u1061257129253093767S.b).a(uh2VarA);
            java.util.Collections.unmodifiableMap(java.util.Collections.unmodifiableMap(((ads_mobile_sdk.a70) u1061257129253093767S.b).concatenatedSignalsMap_)).getClass();
            dev.epro.r0.F14240031463097426304 f14240031463097426304 = new dev.epro.r0.F14240031463097426304();
            java.lang.String strP3 = i16631908410500040363.w("arr_params").p();
            strP3.getClass();
            dev.epro.r0.H14305894327539119220 h143058943275391192202 = ((dev.epro.r0.I16631908410500040363) f14240031463097426304.b(dev.epro.r0.I16631908410500040363.class, strP3)).a;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(dev.epro.r0.E4951175994894594588.u0(h143058943275391192202.d));
            dev.epro.r0.L622219180424329983 it = h143058943275391192202.entrySet().iterator();
            while (it.hasNext()) {
                dev.epro.r0.S8064361206571326475 s8064361206571326475A = it.a();
                linkedHashMap.put(s8064361206571326475A.getKey(), ((dev.epro.r0.K15572083692188606544) s8064361206571326475A.getValue()).m().p());
            }
            u1061257129253093767S.b();
            ads_mobile_sdk.a70 a70Var = (ads_mobile_sdk.a70) u1061257129253093767S.b;
            ads_mobile_sdk.gn1 gn1Var = a70Var.concatenatedSignalsMap_;
            if (!gn1Var.a) {
                a70Var.concatenatedSignalsMap_ = gn1Var.b();
            }
            a70Var.concatenatedSignalsMap_.putAll(linkedHashMap);
            return (ads_mobile_sdk.a70) u1061257129253093767S.a();
        } catch (java.lang.Exception e) {
            java.util.ArrayList arrayList = dev.epro.r0.G6547577305291411977.l(e).s;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static ads_mobile_sdk.oa e(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        try {
            dev.epro.r0.E11743167429115753335 e11743167429115753335Q = ads_mobile_sdk.oa.q();
            e11743167429115753335Q.getClass();
            java.util.Collections.unmodifiableList(((ads_mobile_sdk.oa) e11743167429115753335Q.b).initializationData_).getClass();
            dev.epro.r0.K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("data");
            dev.epro.r0.P16422848101170923038 p16422848101170923038K = k15572083692188606544W != null ? k15572083692188606544W.k() : null;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (p16422848101170923038K != null) {
                java.util.ArrayList arrayList2 = p16422848101170923038K.a;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    java.lang.Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        dev.epro.r0.K5751602218013079365.f0();
                        throw null;
                    }
                    dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) obj;
                    k15572083692188606544.getClass();
                    arrayList.add(f(k15572083692188606544.l()));
                    i = i3;
                }
            }
            e11743167429115753335Q.b();
            ads_mobile_sdk.oa oaVar = (ads_mobile_sdk.oa) e11743167429115753335Q.b;
            dev.epro.r0.O6641393078261985068 o6641393078261985068 = oaVar.initializationData_;
            if (!((ads_mobile_sdk.j) o6641393078261985068).a) {
                oaVar.initializationData_ = dev.epro.r0.T8598786036980488824.b(o6641393078261985068);
            }
            ads_mobile_sdk.au0.a(arrayList, oaVar.initializationData_);
            return (ads_mobile_sdk.oa) e11743167429115753335Q.a();
        } catch (java.lang.Exception e) {
            java.util.ArrayList arrayList3 = dev.epro.r0.G6547577305291411977.l(e).s;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList3.add(message);
            return null;
        }
    }

    public static ads_mobile_sdk.qa f(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        dev.epro.r0.K15899002224316188312 k15899002224316188312Q = ads_mobile_sdk.qa.q();
        k15899002224316188312Q.getClass();
        dev.epro.r0.K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("format");
        java.lang.String strP = k15572083692188606544W != null ? k15572083692188606544W.p() : null;
        if (strP == null) {
            strP = "";
        }
        k15899002224316188312Q.b();
        ((ads_mobile_sdk.qa) k15899002224316188312Q.b).b(strP);
        dev.epro.r0.K15572083692188606544 k15572083692188606544W2 = i16631908410500040363.w("data");
        if (k15572083692188606544W2 != null) {
            dev.epro.r0.I16631908410500040363 i16631908410500040363L = k15572083692188606544W2.l();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            dev.epro.r0.L622219180424329983 it = i16631908410500040363L.a.entrySet().iterator();
            while (it.hasNext()) {
                dev.epro.r0.S8064361206571326475 s8064361206571326475A = it.a();
                java.lang.String str = (java.lang.String) s8064361206571326475A.getKey();
                dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) s8064361206571326475A.getValue();
                str.getClass();
                k15572083692188606544.getClass();
                linkedHashMap.put(str, k15572083692188606544.p());
            }
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.String str3 = (java.lang.String) entry.getValue();
                java.util.Collections.unmodifiableMap(java.util.Collections.unmodifiableMap(((ads_mobile_sdk.qa) k15899002224316188312Q.b).extras_)).getClass();
                str3.getClass();
                str2.getClass();
                k15899002224316188312Q.b();
                ads_mobile_sdk.qa qaVar = (ads_mobile_sdk.qa) k15899002224316188312Q.b;
                ads_mobile_sdk.gn1 gn1Var = qaVar.extras_;
                if (!gn1Var.a) {
                    qaVar.extras_ = gn1Var.b();
                }
                qaVar.extras_.put(str2, str3);
            }
        }
        return (ads_mobile_sdk.qa) k15899002224316188312Q.a();
    }

    public static ads_mobile_sdk.yn1 g(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        try {
            dev.epro.r0.S6059772632253557467 s6059772632253557467R = ads_mobile_sdk.yn1.r();
            s6059772632253557467R.getClass();
            dev.epro.r0.I16631908410500040363 i16631908410500040363Y = i16631908410500040363.y("data");
            java.util.Collections.unmodifiableMap(java.util.Collections.unmodifiableMap(((ads_mobile_sdk.yn1) s6059772632253557467R.b).data_)).getClass();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            if (i16631908410500040363Y != null) {
                dev.epro.r0.L622219180424329983 it = i16631908410500040363Y.a.entrySet().iterator();
                while (it.hasNext()) {
                    dev.epro.r0.S8064361206571326475 s8064361206571326475A = it.a();
                    java.lang.String str = (java.lang.String) s8064361206571326475A.getKey();
                    dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) s8064361206571326475A.getValue();
                    str.getClass();
                    k15572083692188606544.getClass();
                    linkedHashMap.put(str, k15572083692188606544.p());
                }
            }
            s6059772632253557467R.b();
            ads_mobile_sdk.yn1 yn1Var = (ads_mobile_sdk.yn1) s6059772632253557467R.b;
            ads_mobile_sdk.gn1 gn1Var = yn1Var.data_;
            if (!gn1Var.a) {
                yn1Var.data_ = gn1Var.b();
            }
            yn1Var.data_.putAll(linkedHashMap);
            java.util.Collections.unmodifiableList(((ads_mobile_sdk.yn1) s6059772632253557467R.b).adapters_).getClass();
            dev.epro.r0.P16422848101170923038 p16422848101170923038X = i16631908410500040363.x("rtb_adapters");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            if (p16422848101170923038X != null) {
                java.util.ArrayList arrayList2 = p16422848101170923038X.a;
                int size = arrayList2.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    java.lang.Object obj = arrayList2.get(i3);
                    i3++;
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        dev.epro.r0.K5751602218013079365.f0();
                        throw null;
                    }
                    dev.epro.r0.K15572083692188606544 k155720836921886065442 = (dev.epro.r0.K15572083692188606544) obj;
                    k155720836921886065442.getClass();
                    java.util.List list = ads_mobile_sdk.z1.D0;
                    java.lang.String strP = k155720836921886065442.p();
                    strP.getClass();
                    arrayList.add(dev.epro.r0.B6030175592171028728.h(i16631908410500040363Y == null ? new dev.epro.r0.I16631908410500040363() : i16631908410500040363Y, strP));
                    i2 = i4;
                }
            }
            s6059772632253557467R.b();
            ads_mobile_sdk.yn1 yn1Var2 = (ads_mobile_sdk.yn1) s6059772632253557467R.b;
            dev.epro.r0.O6641393078261985068 o6641393078261985068 = yn1Var2.adapters_;
            if (!((ads_mobile_sdk.j) o6641393078261985068).a) {
                yn1Var2.adapters_ = dev.epro.r0.T8598786036980488824.b(o6641393078261985068);
            }
            ads_mobile_sdk.au0.a(arrayList, yn1Var2.adapters_);
            java.util.Collections.unmodifiableList(((ads_mobile_sdk.yn1) s6059772632253557467R.b).waterfallAdapters_).getClass();
            dev.epro.r0.P16422848101170923038 p16422848101170923038X2 = i16631908410500040363.x("adapters");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (p16422848101170923038X2 != null) {
                java.util.ArrayList arrayList4 = p16422848101170923038X2.a;
                int size2 = arrayList4.size();
                int i5 = 0;
                while (i5 < size2) {
                    java.lang.Object obj2 = arrayList4.get(i5);
                    i5++;
                    int i6 = i + 1;
                    if (i < 0) {
                        dev.epro.r0.K5751602218013079365.f0();
                        throw null;
                    }
                    dev.epro.r0.K15572083692188606544 k155720836921886065443 = (dev.epro.r0.K15572083692188606544) obj2;
                    k155720836921886065443.getClass();
                    java.util.List list2 = ads_mobile_sdk.z1.D0;
                    java.lang.String strP2 = k155720836921886065443.p();
                    strP2.getClass();
                    arrayList3.add(dev.epro.r0.B6030175592171028728.h(i16631908410500040363Y == null ? new dev.epro.r0.I16631908410500040363() : i16631908410500040363Y, strP2));
                    i = i6;
                }
            }
            s6059772632253557467R.b();
            ads_mobile_sdk.yn1 yn1Var3 = (ads_mobile_sdk.yn1) s6059772632253557467R.b;
            dev.epro.r0.O6641393078261985068 o66413930782619850682 = yn1Var3.waterfallAdapters_;
            if (!((ads_mobile_sdk.j) o66413930782619850682).a) {
                yn1Var3.waterfallAdapters_ = dev.epro.r0.T8598786036980488824.b(o66413930782619850682);
            }
            ads_mobile_sdk.au0.a(arrayList3, yn1Var3.waterfallAdapters_);
            return (ads_mobile_sdk.yn1) s6059772632253557467R.a();
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(e);
            return null;
        }
    }

    public static dev.epro.r0.H9390398899829886498 h(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        try {
            java.lang.String strA = ads_mobile_sdk.d62.a(i16631908410500040363, "adapter_class_name", "");
            if (strA.length() == 0) {
                return null;
            }
            dev.epro.r0.H1850504041015929188 h1850504041015929188S = ads_mobile_sdk.ap.s();
            h1850504041015929188S.getClass();
            h1850504041015929188S.b();
            ((ads_mobile_sdk.ap) h1850504041015929188S.b).b(strA);
            h1850504041015929188S.d(ads_mobile_sdk.d62.a(i16631908410500040363, "collect_signals", false));
            h1850504041015929188S.c(true);
            h1850504041015929188S.e().getClass();
            dev.epro.r0.K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("data");
            dev.epro.r0.I16631908410500040363 i16631908410500040363L = k15572083692188606544W != null ? k15572083692188606544W.l() : null;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            if (i16631908410500040363L != null) {
                dev.epro.r0.L622219180424329983 it = i16631908410500040363L.a.entrySet().iterator();
                while (it.hasNext()) {
                    dev.epro.r0.S8064361206571326475 s8064361206571326475A = it.a();
                    java.lang.String str = (java.lang.String) s8064361206571326475A.getKey();
                    dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) s8064361206571326475A.getValue();
                    str.getClass();
                    k15572083692188606544.getClass();
                    linkedHashMap.put(str, k15572083692188606544.p());
                }
            }
            h1850504041015929188S.b();
            ((ads_mobile_sdk.ap) h1850504041015929188S.b).p().putAll(linkedHashMap);
            return new dev.epro.r0.H9390398899829886498(strA, (ads_mobile_sdk.ap) h1850504041015929188S.a());
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(e);
            return null;
        }
    }

    public static ads_mobile_sdk.iz a(dev.epro.r0.I16631908410500040363 i16631908410500040363, dev.epro.r0.I16631908410500040363 i166319084105000403632) {
        i16631908410500040363.getClass();
        i166319084105000403632.getClass();
        try {
            dev.epro.r0.L14515889287724438211 l14515889287724438211W = ads_mobile_sdk.iz.w();
            l14515889287724438211W.getClass();
            java.lang.String strF = new dev.epro.r0.F14240031463097426304().f(i166319084105000403632);
            l14515889287724438211W.b();
            ((ads_mobile_sdk.iz) l14515889287724438211W.b).c(strF);
            java.lang.String strP = i16631908410500040363.w("consent_state").p();
            strP.getClass();
            l14515889287724438211W.b();
            ((ads_mobile_sdk.iz) l14515889287724438211W.b).b(strP);
            dev.epro.r0.P12817159812099202599 p12817159812099202599 = dev.epro.r0.W1349480363743553773.e;
            java.lang.String strP2 = i16631908410500040363.w("allowlist").p();
            strP2.getClass();
            ads_mobile_sdk.ax axVarA = ads_mobile_sdk.ax.a(p12817159812099202599.a(strP2));
            axVarA.getClass();
            l14515889287724438211W.b();
            ((ads_mobile_sdk.iz) l14515889287724438211W.b).a(axVarA);
            return (ads_mobile_sdk.iz) l14515889287724438211W.a();
        } catch (java.lang.Exception e) {
            java.util.ArrayList arrayList = dev.epro.r0.G6547577305291411977.l(e).s;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static ads_mobile_sdk.ap a(dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str, java.lang.String str2) {
        try {
            if (!ads_mobile_sdk.d62.a(i16631908410500040363, "platform", "").equalsIgnoreCase(str2)) {
                return null;
            }
            dev.epro.r0.H1850504041015929188 h1850504041015929188S = ads_mobile_sdk.ap.s();
            h1850504041015929188S.getClass();
            h1850504041015929188S.b();
            ((ads_mobile_sdk.ap) h1850504041015929188S.b).b(str);
            java.lang.String lowerCase = ads_mobile_sdk.d62.a(i16631908410500040363, "platform", "").toLowerCase(java.util.Locale.ROOT);
            lowerCase.getClass();
            h1850504041015929188S.b();
            ((ads_mobile_sdk.ap) h1850504041015929188S.b).c(lowerCase);
            h1850504041015929188S.d(ads_mobile_sdk.d62.a(i16631908410500040363, "collect_secure_signals", false));
            h1850504041015929188S.c(ads_mobile_sdk.d62.a(i16631908410500040363, "collect_secure_signals_on_full_app", false));
            h1850504041015929188S.e().getClass();
            dev.epro.r0.K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("data");
            dev.epro.r0.I16631908410500040363 i16631908410500040363L = k15572083692188606544W != null ? k15572083692188606544W.l() : null;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            if (i16631908410500040363L != null) {
                dev.epro.r0.L622219180424329983 it = i16631908410500040363L.a.entrySet().iterator();
                while (it.hasNext()) {
                    dev.epro.r0.S8064361206571326475 s8064361206571326475A = it.a();
                    java.lang.String str3 = (java.lang.String) s8064361206571326475A.getKey();
                    dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) s8064361206571326475A.getValue();
                    str3.getClass();
                    k15572083692188606544.getClass();
                    linkedHashMap.put(str3, k15572083692188606544.p());
                }
            }
            h1850504041015929188S.b();
            ((ads_mobile_sdk.ap) h1850504041015929188S.b).p().putAll(linkedHashMap);
            return (ads_mobile_sdk.ap) h1850504041015929188S.a();
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(e);
            return null;
        }
    }

    public static dev.epro.r0.H9390398899829886498 a(dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str) {
        try {
            java.lang.String strA = ads_mobile_sdk.d62.a(i16631908410500040363, "adapter_class_name", "");
            if (strA.length() == 0) {
                return null;
            }
            dev.epro.r0.K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("permission_set");
            dev.epro.r0.P16422848101170923038 p16422848101170923038K = k15572083692188606544W != null ? k15572083692188606544W.k() : null;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (p16422848101170923038K != null) {
                java.util.ArrayList arrayList2 = p16422848101170923038K.a;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    java.lang.Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i >= 0) {
                        dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) obj;
                        k15572083692188606544.getClass();
                        ads_mobile_sdk.ap apVarA = a(k15572083692188606544.l(), strA, str);
                        dev.epro.r0.H9390398899829886498 h9390398899829886498 = apVarA != null ? new dev.epro.r0.H9390398899829886498(strA, apVarA) : null;
                        if (h9390398899829886498 != null) {
                            arrayList.add(h9390398899829886498);
                        }
                        i = i3;
                    } else {
                        dev.epro.r0.K5751602218013079365.f0();
                        throw null;
                    }
                }
            }
            return (dev.epro.r0.H9390398899829886498) dev.epro.r0.R9411874267597469228.D0(arrayList);
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(e);
            return null;
        }
    }

    public static ads_mobile_sdk.d9 a(dev.epro.r0.P16422848101170923038 p16422848101170923038) {
        try {
            dev.epro.r0.D3699235533239707501 d3699235533239707501Q = ads_mobile_sdk.d9.q();
            d3699235533239707501Q.getClass();
            java.util.Collections.unmodifiableList(((ads_mobile_sdk.d9) d3699235533239707501Q.b).adUnitPatterns_).getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = p16422848101170923038.a;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                java.lang.Object obj = arrayList2.get(i2);
                i2++;
                int i3 = i + 1;
                if (i >= 0) {
                    dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) obj;
                    k15572083692188606544.getClass();
                    arrayList.add(c(k15572083692188606544.l()));
                    i = i3;
                } else {
                    dev.epro.r0.K5751602218013079365.f0();
                    throw null;
                }
            }
            d3699235533239707501Q.b();
            ads_mobile_sdk.d9 d9Var = (ads_mobile_sdk.d9) d3699235533239707501Q.b;
            dev.epro.r0.O6641393078261985068 o6641393078261985068 = d9Var.adUnitPatterns_;
            if (!((ads_mobile_sdk.j) o6641393078261985068).a) {
                d9Var.adUnitPatterns_ = dev.epro.r0.T8598786036980488824.b(o6641393078261985068);
            }
            ads_mobile_sdk.au0.a(arrayList, d9Var.adUnitPatterns_);
            return (ads_mobile_sdk.d9) d3699235533239707501Q.a();
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(e);
            return null;
        }
    }
}
