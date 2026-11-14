package ads_mobile_sdk;

import android.os.Bundle;
import dev.epro.r0.B7506245556754967052;
import dev.epro.r0.E10962847735889454927;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.E4951175994894594588;
import dev.epro.r0.E6758797890281795541;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H1358060654748692575;
import dev.epro.r0.H6457936572911484476;
import dev.epro.r0.J10770752472956524045;
import dev.epro.r0.J8812673740297114457;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.L14610744821054695161;
import dev.epro.r0.L17551298460506453774;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.N7531780047102116757;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O5378677881740157249;
import dev.epro.r0.P14363171583196137821;
import dev.epro.r0.P16369341241763256475;
import dev.epro.r0.P17571903987102865660;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.S4967920478913205567;
import dev.epro.r0.T18375584833185129273;
import dev.epro.r0.T8598786036980488824;
import dev.epro.r0.W6853231930366344609;
import dev.epro.r0.Z115818233709597990;
import dev.epro.r0.Z1953481206310471956;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class u5 {
    public final B7506245556754967052 a;
    public final sv2 b;

    public u5(B7506245556754967052 b7506245556754967052, sv2 sv2Var) {
        b7506245556754967052.getClass();
        sv2Var.getClass();
        this.a = b7506245556754967052;
        this.b = sv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [dev.epro.r0.O2161699089510411363] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    public static Object a(Object obj) {
        ?? U;
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Byte[] bArr2 = new Byte[bArr.length];
            int length = bArr.length;
            while (i < length) {
                bArr2[i] = Byte.valueOf(bArr[i]);
                i++;
            }
            O5378677881740157249.O0(bArr2);
            List listAsList = Arrays.asList(bArr2);
            listAsList.getClass();
            return R9411874267597469228.d1(listAsList);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            Short[] shArr = new Short[sArr.length];
            int length2 = sArr.length;
            while (i < length2) {
                shArr[i] = Short.valueOf(sArr[i]);
                i++;
            }
            O5378677881740157249.O0(shArr);
            List listAsList2 = Arrays.asList(shArr);
            listAsList2.getClass();
            return R9411874267597469228.d1(listAsList2);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            Integer[] numArr = new Integer[iArr.length];
            int length3 = iArr.length;
            while (i < length3) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            O5378677881740157249.O0(numArr);
            List listAsList3 = Arrays.asList(numArr);
            listAsList3.getClass();
            return R9411874267597469228.d1(listAsList3);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            Long[] lArr = new Long[jArr.length];
            int length4 = jArr.length;
            while (i < length4) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            O5378677881740157249.O0(lArr);
            List listAsList4 = Arrays.asList(lArr);
            listAsList4.getClass();
            return R9411874267597469228.d1(listAsList4);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            Float[] fArr2 = new Float[fArr.length];
            int length5 = fArr.length;
            while (i < length5) {
                fArr2[i] = Float.valueOf(fArr[i]);
                i++;
            }
            O5378677881740157249.O0(fArr2);
            List listAsList5 = Arrays.asList(fArr2);
            listAsList5.getClass();
            return R9411874267597469228.d1(listAsList5);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            Double[] dArr2 = new Double[dArr.length];
            int length6 = dArr.length;
            while (i < length6) {
                dArr2[i] = Double.valueOf(dArr[i]);
                i++;
            }
            O5378677881740157249.O0(dArr2);
            List listAsList6 = Arrays.asList(dArr2);
            listAsList6.getClass();
            return R9411874267597469228.d1(listAsList6);
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length7 = zArr.length;
            if (length7 == 0) {
                U = O2161699089510411363.a;
            } else if (length7 != 1) {
                U = new ArrayList(zArr.length);
                int length8 = zArr.length;
                while (i < length8) {
                    U.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                U = K5751602218013079365.U(Boolean.valueOf(zArr[0]));
            }
            return R9411874267597469228.W0(U, new J10770752472956524045((byte) 18));
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            Character[] chArr = new Character[cArr.length];
            int length9 = cArr.length;
            while (i < length9) {
                chArr[i] = Character.valueOf(cArr[i]);
                i++;
            }
            O5378677881740157249.O0(chArr);
            List listAsList7 = Arrays.asList(chArr);
            listAsList7.getClass();
            return R9411874267597469228.d1(listAsList7);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            int length10 = objArr.length;
            while (i < length10) {
                arrayList.add(a(objArr[i]));
                i++;
            }
            return R9411874267597469228.W0(arrayList, new J10770752472956524045((byte) 19));
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(a(it.next()));
            }
            return R9411874267597469228.W0(arrayList2, new J10770752472956524045((byte) 21));
        }
        if (obj instanceof Set) {
            Iterable iterable2 = (Iterable) obj;
            ArrayList arrayList3 = new ArrayList(Z115818233709597990.k0(iterable2, 10));
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(a(it2.next()));
            }
            return R9411874267597469228.W0(arrayList3, new J10770752472956524045((byte) 22));
        }
        if (!(obj instanceof Map)) {
            return obj instanceof Enum ? ((Enum) obj).name() : obj;
        }
        List<Map.Entry> listW0 = R9411874267597469228.W0(((Map) obj).entrySet(), new J10770752472956524045((byte) 23));
        int iU0 = E4951175994894594588.u0(Z115818233709597990.k0(listW0, 10));
        if (iU0 < 16) {
            iU0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU0);
        for (Map.Entry entry : listW0) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static boolean b(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof String ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof Bundle ? ((Bundle) obj).isEmpty() : obj instanceof Object[] ? ((Object[]) obj).length == 0 : obj instanceof int[] ? ((int[]) obj).length == 0 : obj instanceof long[] ? ((long[]) obj).length == 0 : obj instanceof byte[] ? ((byte[]) obj).length == 0 : obj instanceof short[] ? ((short[]) obj).length == 0 : obj instanceof float[] ? ((float[]) obj).length == 0 : obj instanceof double[] ? ((double[]) obj).length == 0 : obj instanceof boolean[] ? ((boolean[]) obj).length == 0 : (obj instanceof char[]) && ((char[]) obj).length == 0;
    }

    public final H1358060654748692575 b(S4967920478913205567 s4967920478913205567) {
        H1358060654748692575 h1358060654748692575 = new H1358060654748692575();
        B7506245556754967052 b7506245556754967052 = this.a;
        b7506245556754967052.getClass();
        List listV = K5751602218013079365.V("categoryExclusions", "contentUrl", "customTargeting", "googleExtrasBundle", "adSourceExtrasBundles");
        ao aoVar = ao.a$23;
        h1358060654748692575.addAll((List) b7506245556754967052.a("gads:pc:ad_request:cache_key_param_denylist", listV, aoVar));
        boolean z = s4967920478913205567 instanceof T18375584833185129273;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        if (z) {
            h1358060654748692575.addAll((List) b7506245556754967052.a("gads:pc:native_ad_request:cache_key_param_denylist", o2161699089510411363, aoVar));
        } else if (s4967920478913205567 instanceof N7531780047102116757) {
            h1358060654748692575.addAll((List) b7506245556754967052.a("gads:pc:banner_ad_request:cache_key_param_denylist", o2161699089510411363, aoVar));
        }
        return T8598786036980488824.d(h1358060654748692575);
    }

    public static void a(N7531780047102116757 n7531780047102116757, LinkedHashMap linkedHashMap, H1358060654748692575 h1358060654748692575) {
        E6758797890281795541 e6758797890281795541 = n7531780047102116757.j;
        H6457936572911484476 h6457936572911484476 = h1358060654748692575.a;
        if (!h6457936572911484476.containsKey("adSize") && !b(e6758797890281795541)) {
            linkedHashMap.put("adSize", e6758797890281795541);
        }
        List list = n7531780047102116757.k;
        if (!h6457936572911484476.containsKey("adSizes") && !b(list)) {
            linkedHashMap.put("adSizes", list);
        }
        L17551298460506453774 l17551298460506453774 = n7531780047102116757.l;
        if (!h6457936572911484476.containsKey("videoOptions") && !b(l17551298460506453774)) {
            linkedHashMap.put("videoOptions", l17551298460506453774);
        }
        Boolean boolValueOf = Boolean.valueOf(n7531780047102116757.m);
        if (h6457936572911484476.containsKey("manualImpressionRequested") || b(boolValueOf)) {
            return;
        }
        linkedHashMap.put("manualImpressionRequested", boolValueOf);
    }

    public static void a(T18375584833185129273 t18375584833185129273, LinkedHashMap linkedHashMap, H1358060654748692575 h1358060654748692575) {
        List list = t18375584833185129273.j;
        H6457936572911484476 h6457936572911484476 = h1358060654748692575.a;
        if (!h6457936572911484476.containsKey("nativeAdTypes") && !b(list)) {
            linkedHashMap.put("nativeAdTypes", list);
        }
        List list2 = t18375584833185129273.k;
        if (!h6457936572911484476.containsKey("customFormatIds") && !b(list2)) {
            linkedHashMap.put("customFormatIds", list2);
        }
        Boolean boolValueOf = Boolean.valueOf(t18375584833185129273.l);
        if (!h6457936572911484476.containsKey("isImageLoadingDisabled") && !b(boolValueOf)) {
            linkedHashMap.put("isImageLoadingDisabled", boolValueOf);
        }
        P16369341241763256475 p16369341241763256475 = t18375584833185129273.m;
        if (!h6457936572911484476.containsKey("mediaAspectRatio") && !b(p16369341241763256475)) {
            linkedHashMap.put("mediaAspectRatio", p16369341241763256475);
        }
        W6853231930366344609 w6853231930366344609 = t18375584833185129273.n;
        if (!h6457936572911484476.containsKey("adChoicesPlacement") && !b(w6853231930366344609)) {
            linkedHashMap.put("adChoicesPlacement", w6853231930366344609);
        }
        L17551298460506453774 l17551298460506453774 = t18375584833185129273.f502o;
        if (!h6457936572911484476.containsKey("videoOptions") && !b(l17551298460506453774)) {
            linkedHashMap.put("videoOptions", l17551298460506453774);
        }
        h6457936572911484476.containsKey("customClickGestureDirection");
        Boolean bool = Boolean.FALSE;
        if (!h6457936572911484476.containsKey("customClickGestureAllowTaps") && !b(bool)) {
            linkedHashMap.put("customClickGestureAllowTaps", bool);
        }
        Boolean boolValueOf2 = Boolean.valueOf(t18375584833185129273.p);
        if (!h6457936572911484476.containsKey("customMuteThisAdRequested") && !b(boolValueOf2)) {
            linkedHashMap.put("customMuteThisAdRequested", boolValueOf2);
        }
        h6457936572911484476.containsKey("adSize");
        if (!h6457936572911484476.containsKey("adSizes")) {
            O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
            if (!b(o2161699089510411363)) {
                linkedHashMap.put("adSizes", o2161699089510411363);
            }
        }
        if (!h6457936572911484476.containsKey("manualImpressionRequested") && !b(bool)) {
            linkedHashMap.put("manualImpressionRequested", bool);
        }
        Boolean boolValueOf3 = Boolean.valueOf(t18375584833185129273.q);
        if (h6457936572911484476.containsKey("adPersistenceEnabled") || b(boolValueOf3)) {
            return;
        }
        linkedHashMap.put("adPersistenceEnabled", boolValueOf3);
    }

    public final void a(LinkedHashMap linkedHashMap, H1358060654748692575 h1358060654748692575) {
        E4916761685899363666 e4916761685899363666A = this.b.a();
        e4916761685899363666A.getClass();
        H6457936572911484476 h6457936572911484476 = h1358060654748692575.a;
        H6457936572911484476 h64579365729114844762 = h1358060654748692575.a;
        if (!h6457936572911484476.containsKey("tagForChildDirectedTreatment")) {
            J8812673740297114457 j8812673740297114457 = J8812673740297114457.TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED;
            if (!b(j8812673740297114457)) {
                linkedHashMap.put("tagForChildDirectedTreatment", j8812673740297114457);
            }
        }
        if (!h64579365729114844762.containsKey("tagForUnderAgeOfConsent")) {
            E10962847735889454927 e10962847735889454927 = E10962847735889454927.TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED;
            if (!b(e10962847735889454927)) {
                linkedHashMap.put("tagForUnderAgeOfConsent", e10962847735889454927);
            }
        }
        P14363171583196137821 p14363171583196137821 = e4916761685899363666A.a;
        if (!h64579365729114844762.containsKey("maxAdContentRating") && !b(p14363171583196137821)) {
            linkedHashMap.put("maxAdContentRating", p14363171583196137821);
        }
        ArrayList arrayList = e4916761685899363666A.b;
        if (!h64579365729114844762.containsKey("testDeviceIds") && !b(arrayList)) {
            linkedHashMap.put("testDeviceIds", arrayList);
        }
        L14610744821054695161 l14610744821054695161 = e4916761685899363666A.c;
        if (!h64579365729114844762.containsKey("publisherPrivacyPersonalizationState") && !b(l14610744821054695161)) {
            linkedHashMap.put("publisherPrivacyPersonalizationState", l14610744821054695161);
        }
        h64579365729114844762.containsKey("ageRestrictedTreatmentInternal");
    }

    public static void a(S4967920478913205567 s4967920478913205567, LinkedHashMap linkedHashMap, H1358060654748692575 h1358060654748692575) {
        String str = s4967920478913205567.i;
        H6457936572911484476 h6457936572911484476 = h1358060654748692575.a;
        if (!h6457936572911484476.containsKey("adUnitId") && !b(str)) {
            linkedHashMap.put("adUnitId", str);
        }
        LinkedHashSet linkedHashSet = s4967920478913205567.a;
        if (!h6457936572911484476.containsKey("categoryExclusions") && !b(linkedHashSet)) {
            linkedHashMap.put("categoryExclusions", linkedHashSet);
        }
        String str2 = s4967920478913205567.b;
        if (!h6457936572911484476.containsKey("contentUrl") && !b(str2)) {
            linkedHashMap.put("contentUrl", str2);
        }
        LinkedHashMap linkedHashMap2 = s4967920478913205567.c;
        if (!h6457936572911484476.containsKey("customTargeting") && !b(linkedHashMap2)) {
            linkedHashMap.put("customTargeting", linkedHashMap2);
        }
        a("googleExtrasBundle", s4967920478913205567.d, linkedHashMap, h1358060654748692575);
        HashSet hashSet = s4967920478913205567.e;
        if (!h6457936572911484476.containsKey("keywords") && !b(hashSet)) {
            linkedHashMap.put("keywords", hashSet);
        }
        HashSet hashSet2 = s4967920478913205567.f;
        if (!h6457936572911484476.containsKey("neighboringContentUrls") && !b(hashSet2)) {
            linkedHashMap.put("neighboringContentUrls", hashSet2);
        }
        if (!h6457936572911484476.containsKey("adSourceExtrasBundles")) {
            for (Map.Entry entry : s4967920478913205567.g.entrySet()) {
                String str3 = (String) entry.getKey();
                a("adSourceExtrasBundles." + str3, (Bundle) entry.getValue(), linkedHashMap, h1358060654748692575);
            }
        }
        String str4 = s4967920478913205567.h;
        if (!h6457936572911484476.containsKey("publisherProvidedId") && !b(str4)) {
            linkedHashMap.put("publisherProvidedId", str4);
        }
        h6457936572911484476.containsKey("requestAgent");
        if (!h6457936572911484476.containsKey("placementId") && !b((Object) 0L)) {
            linkedHashMap.put("placementId", 0L);
        }
        Boolean bool = Boolean.FALSE;
        if (h6457936572911484476.containsKey("skipUninitializedAdapters") || b(bool)) {
            return;
        }
        linkedHashMap.put("skipUninitializedAdapters", bool);
    }

    /* JADX WARN: Finally extract failed */
    public final String a(S4967920478913205567 s4967920478913205567) throws IOException {
        WeakHashMap weakHashMap = ji3.a;
        th3 th3VarA = ji3.a(wv0.CUI_NAME_PERSISTENT_CACHE_KEY_GENERATE, O2161699089510411363.a, true);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            H1358060654748692575 h1358060654748692575B = b(s4967920478913205567);
            a(linkedHashMap, h1358060654748692575B);
            a(s4967920478913205567, linkedHashMap, h1358060654748692575B);
            if (s4967920478913205567 instanceof T18375584833185129273) {
                a((T18375584833185129273) s4967920478913205567, linkedHashMap, h1358060654748692575B);
            } else if (s4967920478913205567 instanceof N7531780047102116757) {
                a((N7531780047102116757) s4967920478913205567, linkedHashMap, h1358060654748692575B);
            }
            List<Map.Entry> listW0 = R9411874267597469228.W0(linkedHashMap.entrySet(), new J10770752472956524045((byte) 24));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : listW0) {
                P17571903987102865660.n0(arrayList, K5751602218013079365.V(entry.getKey(), a(entry.getValue())));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            String strValueOf = String.valueOf(Objects.hash(Arrays.copyOf(array, array.length)));
            th3VarA.close();
            return strValueOf;
        } catch (Throwable th) {
            try {
                th3VarA.b(th);
                if (!(th instanceof N340633841638932414)) {
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        th3VarA.a(th);
                    }
                    if (!(th instanceof P2480554073835519965)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof dv0) {
                                throw th;
                            }
                            throw new iu0(th);
                        }
                        throw new du0(th);
                    }
                    throw new lw0(th);
                }
                throw th;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    Z1953481206310471956.z(th3VarA, th2);
                    throw th3;
                }
            }
        }
    }

    public static void a(String str, Bundle bundle, LinkedHashMap linkedHashMap, H1358060654748692575 h1358060654748692575) {
        for (String str2 : bundle.keySet()) {
            if (!h1358060654748692575.a.containsKey(str2)) {
                Object obj = bundle.get(str2);
                if (obj instanceof Bundle) {
                    a(G6547577305291411977.s(str, ".", str2), (Bundle) obj, linkedHashMap, h1358060654748692575);
                } else if (!b(obj)) {
                    linkedHashMap.put(str + "." + str2, obj);
                }
            }
        }
    }
}
