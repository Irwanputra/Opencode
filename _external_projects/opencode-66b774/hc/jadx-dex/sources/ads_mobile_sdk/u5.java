package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class u5 {
    public final dev.epro.r0.B7506245556754967052 a;
    public final ads_mobile_sdk.sv2 b;

    public u5(dev.epro.r0.B7506245556754967052 b7506245556754967052, ads_mobile_sdk.sv2 sv2Var) {
        b7506245556754967052.getClass();
        sv2Var.getClass();
        this.a = b7506245556754967052;
        this.b = sv2Var;
    }

    public static java.lang.Object a(java.lang.Object obj) {
        dev.epro.r0.O2161699089510411363 o2161699089510411363U;
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            java.lang.Byte[] bArr2 = new java.lang.Byte[bArr.length];
            int length = bArr.length;
            while (i < length) {
                bArr2[i] = java.lang.Byte.valueOf(bArr[i]);
                i++;
            }
            dev.epro.r0.O5378677881740157249.O0(bArr2);
            java.util.List listAsList = java.util.Arrays.asList(bArr2);
            listAsList.getClass();
            return dev.epro.r0.R9411874267597469228.d1(listAsList);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            java.lang.Short[] shArr = new java.lang.Short[sArr.length];
            int length2 = sArr.length;
            while (i < length2) {
                shArr[i] = java.lang.Short.valueOf(sArr[i]);
                i++;
            }
            dev.epro.r0.O5378677881740157249.O0(shArr);
            java.util.List listAsList2 = java.util.Arrays.asList(shArr);
            listAsList2.getClass();
            return dev.epro.r0.R9411874267597469228.d1(listAsList2);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            java.lang.Integer[] numArr = new java.lang.Integer[iArr.length];
            int length3 = iArr.length;
            while (i < length3) {
                numArr[i] = java.lang.Integer.valueOf(iArr[i]);
                i++;
            }
            dev.epro.r0.O5378677881740157249.O0(numArr);
            java.util.List listAsList3 = java.util.Arrays.asList(numArr);
            listAsList3.getClass();
            return dev.epro.r0.R9411874267597469228.d1(listAsList3);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            java.lang.Long[] lArr = new java.lang.Long[jArr.length];
            int length4 = jArr.length;
            while (i < length4) {
                lArr[i] = java.lang.Long.valueOf(jArr[i]);
                i++;
            }
            dev.epro.r0.O5378677881740157249.O0(lArr);
            java.util.List listAsList4 = java.util.Arrays.asList(lArr);
            listAsList4.getClass();
            return dev.epro.r0.R9411874267597469228.d1(listAsList4);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            java.lang.Float[] fArr2 = new java.lang.Float[fArr.length];
            int length5 = fArr.length;
            while (i < length5) {
                fArr2[i] = java.lang.Float.valueOf(fArr[i]);
                i++;
            }
            dev.epro.r0.O5378677881740157249.O0(fArr2);
            java.util.List listAsList5 = java.util.Arrays.asList(fArr2);
            listAsList5.getClass();
            return dev.epro.r0.R9411874267597469228.d1(listAsList5);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            java.lang.Double[] dArr2 = new java.lang.Double[dArr.length];
            int length6 = dArr.length;
            while (i < length6) {
                dArr2[i] = java.lang.Double.valueOf(dArr[i]);
                i++;
            }
            dev.epro.r0.O5378677881740157249.O0(dArr2);
            java.util.List listAsList6 = java.util.Arrays.asList(dArr2);
            listAsList6.getClass();
            return dev.epro.r0.R9411874267597469228.d1(listAsList6);
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length7 = zArr.length;
            if (length7 == 0) {
                o2161699089510411363U = dev.epro.r0.O2161699089510411363.a;
            } else if (length7 != 1) {
                o2161699089510411363U = new java.util.ArrayList(zArr.length);
                int length8 = zArr.length;
                while (i < length8) {
                    o2161699089510411363U.add(java.lang.Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                o2161699089510411363U = dev.epro.r0.K5751602218013079365.U(java.lang.Boolean.valueOf(zArr[0]));
            }
            return dev.epro.r0.R9411874267597469228.W0(o2161699089510411363U, new dev.epro.r0.J10770752472956524045((byte) 18));
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            java.lang.Character[] chArr = new java.lang.Character[cArr.length];
            int length9 = cArr.length;
            while (i < length9) {
                chArr[i] = java.lang.Character.valueOf(cArr[i]);
                i++;
            }
            dev.epro.r0.O5378677881740157249.O0(chArr);
            java.util.List listAsList7 = java.util.Arrays.asList(chArr);
            listAsList7.getClass();
            return dev.epro.r0.R9411874267597469228.d1(listAsList7);
        }
        if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
            int length10 = objArr.length;
            while (i < length10) {
                arrayList.add(a(objArr[i]));
                i++;
            }
            return dev.epro.r0.R9411874267597469228.W0(arrayList, new dev.epro.r0.J10770752472956524045((byte) 19));
        }
        if (obj instanceof java.util.List) {
            java.lang.Iterable iterable = (java.lang.Iterable) obj;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(iterable, 10));
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(a(it.next()));
            }
            return dev.epro.r0.R9411874267597469228.W0(arrayList2, new dev.epro.r0.J10770752472956524045((byte) 21));
        }
        if (obj instanceof java.util.Set) {
            java.lang.Iterable iterable2 = (java.lang.Iterable) obj;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(iterable2, 10));
            java.util.Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(a(it2.next()));
            }
            return dev.epro.r0.R9411874267597469228.W0(arrayList3, new dev.epro.r0.J10770752472956524045((byte) 22));
        }
        if (!(obj instanceof java.util.Map)) {
            return obj instanceof java.lang.Enum ? ((java.lang.Enum) obj).name() : obj;
        }
        java.util.List<java.util.Map.Entry> listW0 = dev.epro.r0.R9411874267597469228.W0(((java.util.Map) obj).entrySet(), new dev.epro.r0.J10770752472956524045((byte) 23));
        int iU0 = dev.epro.r0.E4951175994894594588.u0(dev.epro.r0.Z115818233709597990.k0(listW0, 10));
        if (iU0 < 16) {
            iU0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iU0);
        for (java.util.Map.Entry entry : listW0) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static boolean b(java.lang.Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof java.lang.String ? ((java.lang.CharSequence) obj).length() == 0 : obj instanceof java.util.Collection ? ((java.util.Collection) obj).isEmpty() : obj instanceof java.util.Map ? ((java.util.Map) obj).isEmpty() : obj instanceof android.os.Bundle ? ((android.os.Bundle) obj).isEmpty() : obj instanceof java.lang.Object[] ? ((java.lang.Object[]) obj).length == 0 : obj instanceof int[] ? ((int[]) obj).length == 0 : obj instanceof long[] ? ((long[]) obj).length == 0 : obj instanceof byte[] ? ((byte[]) obj).length == 0 : obj instanceof short[] ? ((short[]) obj).length == 0 : obj instanceof float[] ? ((float[]) obj).length == 0 : obj instanceof double[] ? ((double[]) obj).length == 0 : obj instanceof boolean[] ? ((boolean[]) obj).length == 0 : (obj instanceof char[]) && ((char[]) obj).length == 0;
    }

    public final dev.epro.r0.H1358060654748692575 b(dev.epro.r0.S4967920478913205567 s4967920478913205567) {
        dev.epro.r0.H1358060654748692575 h1358060654748692575 = new dev.epro.r0.H1358060654748692575();
        dev.epro.r0.B7506245556754967052 b7506245556754967052 = this.a;
        b7506245556754967052.getClass();
        java.util.List listV = dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{"categoryExclusions", "contentUrl", "customTargeting", "googleExtrasBundle", "adSourceExtrasBundles"});
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$23;
        h1358060654748692575.addAll((java.util.List) b7506245556754967052.a("gads:pc:ad_request:cache_key_param_denylist", listV, aoVar));
        boolean z = s4967920478913205567 instanceof dev.epro.r0.T18375584833185129273;
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        if (z) {
            h1358060654748692575.addAll((java.util.List) b7506245556754967052.a("gads:pc:native_ad_request:cache_key_param_denylist", o2161699089510411363, aoVar));
        } else if (s4967920478913205567 instanceof dev.epro.r0.N7531780047102116757) {
            h1358060654748692575.addAll((java.util.List) b7506245556754967052.a("gads:pc:banner_ad_request:cache_key_param_denylist", o2161699089510411363, aoVar));
        }
        return dev.epro.r0.T8598786036980488824.d(h1358060654748692575);
    }

    public static void a(dev.epro.r0.N7531780047102116757 n7531780047102116757, java.util.LinkedHashMap linkedHashMap, dev.epro.r0.H1358060654748692575 h1358060654748692575) {
        dev.epro.r0.E6758797890281795541 e6758797890281795541 = n7531780047102116757.j;
        dev.epro.r0.H6457936572911484476 h6457936572911484476 = h1358060654748692575.a;
        if (!h6457936572911484476.containsKey("adSize") && !b(e6758797890281795541)) {
            linkedHashMap.put("adSize", e6758797890281795541);
        }
        java.util.List list = n7531780047102116757.k;
        if (!h6457936572911484476.containsKey("adSizes") && !b(list)) {
            linkedHashMap.put("adSizes", list);
        }
        dev.epro.r0.L17551298460506453774 l17551298460506453774 = n7531780047102116757.l;
        if (!h6457936572911484476.containsKey("videoOptions") && !b(l17551298460506453774)) {
            linkedHashMap.put("videoOptions", l17551298460506453774);
        }
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(n7531780047102116757.m);
        if (h6457936572911484476.containsKey("manualImpressionRequested") || b(boolValueOf)) {
            return;
        }
        linkedHashMap.put("manualImpressionRequested", boolValueOf);
    }

    public static void a(dev.epro.r0.T18375584833185129273 t18375584833185129273, java.util.LinkedHashMap linkedHashMap, dev.epro.r0.H1358060654748692575 h1358060654748692575) {
        java.util.List list = t18375584833185129273.j;
        dev.epro.r0.H6457936572911484476 h6457936572911484476 = h1358060654748692575.a;
        if (!h6457936572911484476.containsKey("nativeAdTypes") && !b(list)) {
            linkedHashMap.put("nativeAdTypes", list);
        }
        java.util.List list2 = t18375584833185129273.k;
        if (!h6457936572911484476.containsKey("customFormatIds") && !b(list2)) {
            linkedHashMap.put("customFormatIds", list2);
        }
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(t18375584833185129273.l);
        if (!h6457936572911484476.containsKey("isImageLoadingDisabled") && !b(boolValueOf)) {
            linkedHashMap.put("isImageLoadingDisabled", boolValueOf);
        }
        dev.epro.r0.P16369341241763256475 p16369341241763256475 = t18375584833185129273.m;
        if (!h6457936572911484476.containsKey("mediaAspectRatio") && !b(p16369341241763256475)) {
            linkedHashMap.put("mediaAspectRatio", p16369341241763256475);
        }
        dev.epro.r0.W6853231930366344609 w6853231930366344609 = t18375584833185129273.n;
        if (!h6457936572911484476.containsKey("adChoicesPlacement") && !b(w6853231930366344609)) {
            linkedHashMap.put("adChoicesPlacement", w6853231930366344609);
        }
        dev.epro.r0.L17551298460506453774 l17551298460506453774 = t18375584833185129273.o;
        if (!h6457936572911484476.containsKey("videoOptions") && !b(l17551298460506453774)) {
            linkedHashMap.put("videoOptions", l17551298460506453774);
        }
        h6457936572911484476.containsKey("customClickGestureDirection");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (!h6457936572911484476.containsKey("customClickGestureAllowTaps") && !b(bool)) {
            linkedHashMap.put("customClickGestureAllowTaps", bool);
        }
        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(t18375584833185129273.p);
        if (!h6457936572911484476.containsKey("customMuteThisAdRequested") && !b(boolValueOf2)) {
            linkedHashMap.put("customMuteThisAdRequested", boolValueOf2);
        }
        h6457936572911484476.containsKey("adSize");
        if (!h6457936572911484476.containsKey("adSizes")) {
            dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
            if (!b(o2161699089510411363)) {
                linkedHashMap.put("adSizes", o2161699089510411363);
            }
        }
        if (!h6457936572911484476.containsKey("manualImpressionRequested") && !b(bool)) {
            linkedHashMap.put("manualImpressionRequested", bool);
        }
        java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(t18375584833185129273.q);
        if (h6457936572911484476.containsKey("adPersistenceEnabled") || b(boolValueOf3)) {
            return;
        }
        linkedHashMap.put("adPersistenceEnabled", boolValueOf3);
    }

    public final void a(java.util.LinkedHashMap linkedHashMap, dev.epro.r0.H1358060654748692575 h1358060654748692575) {
        dev.epro.r0.E4916761685899363666 e4916761685899363666A = this.b.a();
        e4916761685899363666A.getClass();
        dev.epro.r0.H6457936572911484476 h6457936572911484476 = h1358060654748692575.a;
        dev.epro.r0.H6457936572911484476 h64579365729114844762 = h1358060654748692575.a;
        if (!h6457936572911484476.containsKey("tagForChildDirectedTreatment")) {
            dev.epro.r0.J8812673740297114457 j8812673740297114457 = dev.epro.r0.J8812673740297114457.a;
            if (!b(j8812673740297114457)) {
                linkedHashMap.put("tagForChildDirectedTreatment", j8812673740297114457);
            }
        }
        if (!h64579365729114844762.containsKey("tagForUnderAgeOfConsent")) {
            dev.epro.r0.E10962847735889454927 e10962847735889454927 = dev.epro.r0.E10962847735889454927.TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED;
            if (!b(e10962847735889454927)) {
                linkedHashMap.put("tagForUnderAgeOfConsent", e10962847735889454927);
            }
        }
        dev.epro.r0.P14363171583196137821 p14363171583196137821 = e4916761685899363666A.a;
        if (!h64579365729114844762.containsKey("maxAdContentRating") && !b(p14363171583196137821)) {
            linkedHashMap.put("maxAdContentRating", p14363171583196137821);
        }
        java.util.ArrayList arrayList = e4916761685899363666A.b;
        if (!h64579365729114844762.containsKey("testDeviceIds") && !b(arrayList)) {
            linkedHashMap.put("testDeviceIds", arrayList);
        }
        dev.epro.r0.L14610744821054695161 l14610744821054695161 = e4916761685899363666A.c;
        if (!h64579365729114844762.containsKey("publisherPrivacyPersonalizationState") && !b(l14610744821054695161)) {
            linkedHashMap.put("publisherPrivacyPersonalizationState", l14610744821054695161);
        }
        h64579365729114844762.containsKey("ageRestrictedTreatmentInternal");
    }

    public static void a(dev.epro.r0.S4967920478913205567 s4967920478913205567, java.util.LinkedHashMap linkedHashMap, dev.epro.r0.H1358060654748692575 h1358060654748692575) {
        java.lang.String str = s4967920478913205567.i;
        dev.epro.r0.H6457936572911484476 h6457936572911484476 = h1358060654748692575.a;
        if (!h6457936572911484476.containsKey("adUnitId") && !b(str)) {
            linkedHashMap.put("adUnitId", str);
        }
        java.util.LinkedHashSet linkedHashSet = ((dev.epro.r0.U4857089234315512256) s4967920478913205567).a;
        if (!h6457936572911484476.containsKey("categoryExclusions") && !b(linkedHashSet)) {
            linkedHashMap.put("categoryExclusions", linkedHashSet);
        }
        java.lang.String str2 = ((dev.epro.r0.U4857089234315512256) s4967920478913205567).b;
        if (!h6457936572911484476.containsKey("contentUrl") && !b(str2)) {
            linkedHashMap.put("contentUrl", str2);
        }
        java.util.LinkedHashMap linkedHashMap2 = ((dev.epro.r0.U4857089234315512256) s4967920478913205567).c;
        if (!h6457936572911484476.containsKey("customTargeting") && !b(linkedHashMap2)) {
            linkedHashMap.put("customTargeting", linkedHashMap2);
        }
        a("googleExtrasBundle", ((dev.epro.r0.U4857089234315512256) s4967920478913205567).d, linkedHashMap, h1358060654748692575);
        java.util.HashSet hashSet = ((dev.epro.r0.U4857089234315512256) s4967920478913205567).e;
        if (!h6457936572911484476.containsKey("keywords") && !b(hashSet)) {
            linkedHashMap.put("keywords", hashSet);
        }
        java.util.HashSet hashSet2 = ((dev.epro.r0.U4857089234315512256) s4967920478913205567).f;
        if (!h6457936572911484476.containsKey("neighboringContentUrls") && !b(hashSet2)) {
            linkedHashMap.put("neighboringContentUrls", hashSet2);
        }
        if (!h6457936572911484476.containsKey("adSourceExtrasBundles")) {
            for (java.util.Map.Entry entry : ((dev.epro.r0.U4857089234315512256) s4967920478913205567).g.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                a("adSourceExtrasBundles." + str3, (android.os.Bundle) entry.getValue(), linkedHashMap, h1358060654748692575);
            }
        }
        java.lang.String str4 = ((dev.epro.r0.U4857089234315512256) s4967920478913205567).h;
        if (!h6457936572911484476.containsKey("publisherProvidedId") && !b(str4)) {
            linkedHashMap.put("publisherProvidedId", str4);
        }
        h6457936572911484476.containsKey("requestAgent");
        if (!h6457936572911484476.containsKey("placementId") && !b((java.lang.Object) 0L)) {
            linkedHashMap.put("placementId", 0L);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (h6457936572911484476.containsKey("skipUninitializedAdapters") || b(bool)) {
            return;
        }
        linkedHashMap.put("skipUninitializedAdapters", bool);
    }

    /* JADX WARN: Finally extract failed */
    public final java.lang.String a(dev.epro.r0.S4967920478913205567 s4967920478913205567) {
        java.util.WeakHashMap weakHashMap = ads_mobile_sdk.ji3.a;
        ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(ads_mobile_sdk.wv0.CUI_NAME_PERSISTENT_CACHE_KEY_GENERATE, dev.epro.r0.O2161699089510411363.a, true);
        try {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            dev.epro.r0.H1358060654748692575 h1358060654748692575B = b(s4967920478913205567);
            a(linkedHashMap, h1358060654748692575B);
            a(s4967920478913205567, linkedHashMap, h1358060654748692575B);
            if (s4967920478913205567 instanceof dev.epro.r0.T18375584833185129273) {
                a((dev.epro.r0.T18375584833185129273) s4967920478913205567, linkedHashMap, h1358060654748692575B);
            } else if (s4967920478913205567 instanceof dev.epro.r0.N7531780047102116757) {
                a((dev.epro.r0.N7531780047102116757) s4967920478913205567, linkedHashMap, h1358060654748692575B);
            }
            java.util.List<java.util.Map.Entry> listW0 = dev.epro.r0.R9411874267597469228.W0(linkedHashMap.entrySet(), new dev.epro.r0.J10770752472956524045((byte) 24));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry entry : listW0) {
                dev.epro.r0.P17571903987102865660.n0(arrayList, dev.epro.r0.K5751602218013079365.V(new java.lang.Object[]{entry.getKey(), a(entry.getValue())}));
            }
            java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
            java.lang.String strValueOf = java.lang.String.valueOf(java.util.Objects.hash(java.util.Arrays.copyOf(array, array.length)));
            th3VarA.close();
            return strValueOf;
        } catch (java.lang.Throwable th) {
            try {
                th3VarA.b(th);
                if (!(th instanceof dev.epro.r0.N340633841638932414)) {
                    if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                        th3VarA.a(th);
                    }
                    if (!(th instanceof dev.epro.r0.P2480554073835519965)) {
                        if (!(th instanceof java.util.concurrent.CancellationException)) {
                            if (th instanceof ads_mobile_sdk.dv0) {
                                throw th;
                            }
                            throw new ads_mobile_sdk.iu0(th);
                        }
                        throw new ads_mobile_sdk.du0(th);
                    }
                    throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                }
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    dev.epro.r0.Z1953481206310471956.z(th3VarA, th2);
                    throw th3;
                }
            }
        }
    }

    public static void a(java.lang.String str, android.os.Bundle bundle, java.util.LinkedHashMap linkedHashMap, dev.epro.r0.H1358060654748692575 h1358060654748692575) {
        for (java.lang.String str2 : bundle.keySet()) {
            if (!h1358060654748692575.a.containsKey(str2)) {
                java.lang.Object obj = bundle.get(str2);
                if (obj instanceof android.os.Bundle) {
                    a(dev.epro.r0.G6547577305291411977.s(str, ".", str2), (android.os.Bundle) obj, linkedHashMap, h1358060654748692575);
                } else if (!b(obj)) {
                    linkedHashMap.put(str + "." + str2, obj);
                }
            }
        }
    }
}
