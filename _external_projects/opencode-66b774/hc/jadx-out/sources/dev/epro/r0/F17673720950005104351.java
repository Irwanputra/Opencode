package dev.epro.r0;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F17673720950005104351 {
    public static final H5336160545165318150 m = new H5336160545165318150("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final H5336160545165318150 n = new H5336160545165318150("\\{(.+?)\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H5336160545165318150 f235o = new H5336160545165318150("http[s]?://");
    public static final H5336160545165318150 p = new H5336160545165318150(".*");
    public static final H5336160545165318150 q = new H5336160545165318150("([^/]*?|)");
    public static final H5336160545165318150 r = new H5336160545165318150("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final O12494175665883759871 d;
    public final O12494175665883759871 e;
    public final K7493131619793429513 f;
    public boolean g;
    public final K7493131619793429513 h;
    public final K7493131619793429513 i;
    public final K7493131619793429513 j;
    public final O12494175665883759871 k;
    public final boolean l;

    public F17673720950005104351(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        z = false;
        final byte b = z ? (byte) 1 : (byte) 0;
        this.d = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.T3425500135353800827
            public final /* synthetic */ F17673720950005104351 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                List list;
                byte b2 = b;
                M7765909118661531151 m7765909118661531151 = M7765909118661531151.IGNORE_CASE;
                F17673720950005104351 f17673720950005104351 = this.b;
                switch (b2) {
                    case 0:
                        String str2 = f17673720950005104351.c;
                        if (str2 != null) {
                            return new H5336160545165318150(str2, m7765909118661531151);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(F17673720950005104351.r.f(f17673720950005104351.a));
                    case 2:
                        String str3 = f17673720950005104351.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    S10973172697741180971.i(E12098517352909843120.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) R9411874267597469228.D0(queryParameters);
                                if (str5 == null) {
                                    f17673720950005104351.g = true;
                                    str5 = str4;
                                }
                                H5501760756038144638 h5501760756038144638 = new H5501760756038144638();
                                int i = 0;
                                for (U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(F17673720950005104351.n, str5); u12307647644992999381B != null; u12307647644992999381B = u12307647644992999381B.d()) {
                                    X13869420807587484607 x13869420807587484607B = u12307647644992999381B.c.b(1);
                                    x13869420807587484607B.getClass();
                                    h5501760756038144638.b.add(x13869420807587484607B.a);
                                    if (u12307647644992999381B.b().a > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, u12307647644992999381B.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = u12307647644992999381B.b().b + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                h5501760756038144638.a = F17673720950005104351.g(sb.toString());
                                linkedHashMap.put(str4, h5501760756038144638);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f17673720950005104351.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        F17673720950005104351.a(fragment, arrayList2, sb2);
                        return new H9390398899829886498(arrayList2, sb2.toString());
                    case 4:
                        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        return (h9390398899829886498 == null || (list = (List) h9390398899829886498.a) == null) ? new ArrayList() : list;
                    case 5:
                        H9390398899829886498 h93903988998298864982 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        if (h93903988998298864982 != null) {
                            return (String) h93903988998298864982.b;
                        }
                        return null;
                    case 6:
                        String str7 = (String) f17673720950005104351.j.getValue();
                        if (str7 != null) {
                            return new H5336160545165318150(str7, m7765909118661531151);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b2 = 1;
        this.e = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.T3425500135353800827
            public final /* synthetic */ F17673720950005104351 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                List list;
                byte b22 = b2;
                M7765909118661531151 m7765909118661531151 = M7765909118661531151.IGNORE_CASE;
                F17673720950005104351 f17673720950005104351 = this.b;
                switch (b22) {
                    case 0:
                        String str2 = f17673720950005104351.c;
                        if (str2 != null) {
                            return new H5336160545165318150(str2, m7765909118661531151);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(F17673720950005104351.r.f(f17673720950005104351.a));
                    case 2:
                        String str3 = f17673720950005104351.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    S10973172697741180971.i(E12098517352909843120.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) R9411874267597469228.D0(queryParameters);
                                if (str5 == null) {
                                    f17673720950005104351.g = true;
                                    str5 = str4;
                                }
                                H5501760756038144638 h5501760756038144638 = new H5501760756038144638();
                                int i = 0;
                                for (U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(F17673720950005104351.n, str5); u12307647644992999381B != null; u12307647644992999381B = u12307647644992999381B.d()) {
                                    X13869420807587484607 x13869420807587484607B = u12307647644992999381B.c.b(1);
                                    x13869420807587484607B.getClass();
                                    h5501760756038144638.b.add(x13869420807587484607B.a);
                                    if (u12307647644992999381B.b().a > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, u12307647644992999381B.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = u12307647644992999381B.b().b + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                h5501760756038144638.a = F17673720950005104351.g(sb.toString());
                                linkedHashMap.put(str4, h5501760756038144638);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f17673720950005104351.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        F17673720950005104351.a(fragment, arrayList2, sb2);
                        return new H9390398899829886498(arrayList2, sb2.toString());
                    case 4:
                        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        return (h9390398899829886498 == null || (list = (List) h9390398899829886498.a) == null) ? new ArrayList() : list;
                    case 5:
                        H9390398899829886498 h93903988998298864982 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        if (h93903988998298864982 != null) {
                            return (String) h93903988998298864982.b;
                        }
                        return null;
                    case 6:
                        String str7 = (String) f17673720950005104351.j.getValue();
                        if (str7 != null) {
                            return new H5336160545165318150(str7, m7765909118661531151);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b3 = 2;
        B13729205492206812220 b13729205492206812220 = new B13729205492206812220(this) { // from class: dev.epro.r0.T3425500135353800827
            public final /* synthetic */ F17673720950005104351 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                List list;
                byte b22 = b3;
                M7765909118661531151 m7765909118661531151 = M7765909118661531151.IGNORE_CASE;
                F17673720950005104351 f17673720950005104351 = this.b;
                switch (b22) {
                    case 0:
                        String str2 = f17673720950005104351.c;
                        if (str2 != null) {
                            return new H5336160545165318150(str2, m7765909118661531151);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(F17673720950005104351.r.f(f17673720950005104351.a));
                    case 2:
                        String str3 = f17673720950005104351.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    S10973172697741180971.i(E12098517352909843120.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) R9411874267597469228.D0(queryParameters);
                                if (str5 == null) {
                                    f17673720950005104351.g = true;
                                    str5 = str4;
                                }
                                H5501760756038144638 h5501760756038144638 = new H5501760756038144638();
                                int i = 0;
                                for (U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(F17673720950005104351.n, str5); u12307647644992999381B != null; u12307647644992999381B = u12307647644992999381B.d()) {
                                    X13869420807587484607 x13869420807587484607B = u12307647644992999381B.c.b(1);
                                    x13869420807587484607B.getClass();
                                    h5501760756038144638.b.add(x13869420807587484607B.a);
                                    if (u12307647644992999381B.b().a > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, u12307647644992999381B.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = u12307647644992999381B.b().b + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                h5501760756038144638.a = F17673720950005104351.g(sb.toString());
                                linkedHashMap.put(str4, h5501760756038144638);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f17673720950005104351.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        F17673720950005104351.a(fragment, arrayList2, sb2);
                        return new H9390398899829886498(arrayList2, sb2.toString());
                    case 4:
                        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        return (h9390398899829886498 == null || (list = (List) h9390398899829886498.a) == null) ? new ArrayList() : list;
                    case 5:
                        H9390398899829886498 h93903988998298864982 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        if (h93903988998298864982 != null) {
                            return (String) h93903988998298864982.b;
                        }
                        return null;
                    case 6:
                        String str7 = (String) f17673720950005104351.j.getValue();
                        if (str7 != null) {
                            return new H5336160545165318150(str7, m7765909118661531151);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        G14718160286012243331 g14718160286012243331 = G14718160286012243331.c;
        this.f = M9216324016624295870.L(g14718160286012243331, b13729205492206812220);
        final byte b4 = 3;
        this.h = M9216324016624295870.L(g14718160286012243331, new B13729205492206812220(this) { // from class: dev.epro.r0.T3425500135353800827
            public final /* synthetic */ F17673720950005104351 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                List list;
                byte b22 = b4;
                M7765909118661531151 m7765909118661531151 = M7765909118661531151.IGNORE_CASE;
                F17673720950005104351 f17673720950005104351 = this.b;
                switch (b22) {
                    case 0:
                        String str2 = f17673720950005104351.c;
                        if (str2 != null) {
                            return new H5336160545165318150(str2, m7765909118661531151);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(F17673720950005104351.r.f(f17673720950005104351.a));
                    case 2:
                        String str3 = f17673720950005104351.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    S10973172697741180971.i(E12098517352909843120.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) R9411874267597469228.D0(queryParameters);
                                if (str5 == null) {
                                    f17673720950005104351.g = true;
                                    str5 = str4;
                                }
                                H5501760756038144638 h5501760756038144638 = new H5501760756038144638();
                                int i = 0;
                                for (U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(F17673720950005104351.n, str5); u12307647644992999381B != null; u12307647644992999381B = u12307647644992999381B.d()) {
                                    X13869420807587484607 x13869420807587484607B = u12307647644992999381B.c.b(1);
                                    x13869420807587484607B.getClass();
                                    h5501760756038144638.b.add(x13869420807587484607B.a);
                                    if (u12307647644992999381B.b().a > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, u12307647644992999381B.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = u12307647644992999381B.b().b + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                h5501760756038144638.a = F17673720950005104351.g(sb.toString());
                                linkedHashMap.put(str4, h5501760756038144638);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f17673720950005104351.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        F17673720950005104351.a(fragment, arrayList2, sb2);
                        return new H9390398899829886498(arrayList2, sb2.toString());
                    case 4:
                        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        return (h9390398899829886498 == null || (list = (List) h9390398899829886498.a) == null) ? new ArrayList() : list;
                    case 5:
                        H9390398899829886498 h93903988998298864982 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        if (h93903988998298864982 != null) {
                            return (String) h93903988998298864982.b;
                        }
                        return null;
                    case 6:
                        String str7 = (String) f17673720950005104351.j.getValue();
                        if (str7 != null) {
                            return new H5336160545165318150(str7, m7765909118661531151);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b5 = 4;
        this.i = M9216324016624295870.L(g14718160286012243331, new B13729205492206812220(this) { // from class: dev.epro.r0.T3425500135353800827
            public final /* synthetic */ F17673720950005104351 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                List list;
                byte b22 = b5;
                M7765909118661531151 m7765909118661531151 = M7765909118661531151.IGNORE_CASE;
                F17673720950005104351 f17673720950005104351 = this.b;
                switch (b22) {
                    case 0:
                        String str2 = f17673720950005104351.c;
                        if (str2 != null) {
                            return new H5336160545165318150(str2, m7765909118661531151);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(F17673720950005104351.r.f(f17673720950005104351.a));
                    case 2:
                        String str3 = f17673720950005104351.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    S10973172697741180971.i(E12098517352909843120.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) R9411874267597469228.D0(queryParameters);
                                if (str5 == null) {
                                    f17673720950005104351.g = true;
                                    str5 = str4;
                                }
                                H5501760756038144638 h5501760756038144638 = new H5501760756038144638();
                                int i = 0;
                                for (U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(F17673720950005104351.n, str5); u12307647644992999381B != null; u12307647644992999381B = u12307647644992999381B.d()) {
                                    X13869420807587484607 x13869420807587484607B = u12307647644992999381B.c.b(1);
                                    x13869420807587484607B.getClass();
                                    h5501760756038144638.b.add(x13869420807587484607B.a);
                                    if (u12307647644992999381B.b().a > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, u12307647644992999381B.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = u12307647644992999381B.b().b + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                h5501760756038144638.a = F17673720950005104351.g(sb.toString());
                                linkedHashMap.put(str4, h5501760756038144638);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f17673720950005104351.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        F17673720950005104351.a(fragment, arrayList2, sb2);
                        return new H9390398899829886498(arrayList2, sb2.toString());
                    case 4:
                        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        return (h9390398899829886498 == null || (list = (List) h9390398899829886498.a) == null) ? new ArrayList() : list;
                    case 5:
                        H9390398899829886498 h93903988998298864982 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        if (h93903988998298864982 != null) {
                            return (String) h93903988998298864982.b;
                        }
                        return null;
                    case 6:
                        String str7 = (String) f17673720950005104351.j.getValue();
                        if (str7 != null) {
                            return new H5336160545165318150(str7, m7765909118661531151);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b6 = 5;
        this.j = M9216324016624295870.L(g14718160286012243331, new B13729205492206812220(this) { // from class: dev.epro.r0.T3425500135353800827
            public final /* synthetic */ F17673720950005104351 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                List list;
                byte b22 = b6;
                M7765909118661531151 m7765909118661531151 = M7765909118661531151.IGNORE_CASE;
                F17673720950005104351 f17673720950005104351 = this.b;
                switch (b22) {
                    case 0:
                        String str2 = f17673720950005104351.c;
                        if (str2 != null) {
                            return new H5336160545165318150(str2, m7765909118661531151);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(F17673720950005104351.r.f(f17673720950005104351.a));
                    case 2:
                        String str3 = f17673720950005104351.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    S10973172697741180971.i(E12098517352909843120.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) R9411874267597469228.D0(queryParameters);
                                if (str5 == null) {
                                    f17673720950005104351.g = true;
                                    str5 = str4;
                                }
                                H5501760756038144638 h5501760756038144638 = new H5501760756038144638();
                                int i = 0;
                                for (U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(F17673720950005104351.n, str5); u12307647644992999381B != null; u12307647644992999381B = u12307647644992999381B.d()) {
                                    X13869420807587484607 x13869420807587484607B = u12307647644992999381B.c.b(1);
                                    x13869420807587484607B.getClass();
                                    h5501760756038144638.b.add(x13869420807587484607B.a);
                                    if (u12307647644992999381B.b().a > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, u12307647644992999381B.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = u12307647644992999381B.b().b + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                h5501760756038144638.a = F17673720950005104351.g(sb.toString());
                                linkedHashMap.put(str4, h5501760756038144638);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f17673720950005104351.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        F17673720950005104351.a(fragment, arrayList2, sb2);
                        return new H9390398899829886498(arrayList2, sb2.toString());
                    case 4:
                        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        return (h9390398899829886498 == null || (list = (List) h9390398899829886498.a) == null) ? new ArrayList() : list;
                    case 5:
                        H9390398899829886498 h93903988998298864982 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        if (h93903988998298864982 != null) {
                            return (String) h93903988998298864982.b;
                        }
                        return null;
                    case 6:
                        String str7 = (String) f17673720950005104351.j.getValue();
                        if (str7 != null) {
                            return new H5336160545165318150(str7, m7765909118661531151);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b7 = 6;
        this.k = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.T3425500135353800827
            public final /* synthetic */ F17673720950005104351 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                List list;
                byte b22 = b7;
                M7765909118661531151 m7765909118661531151 = M7765909118661531151.IGNORE_CASE;
                F17673720950005104351 f17673720950005104351 = this.b;
                switch (b22) {
                    case 0:
                        String str2 = f17673720950005104351.c;
                        if (str2 != null) {
                            return new H5336160545165318150(str2, m7765909118661531151);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(F17673720950005104351.r.f(f17673720950005104351.a));
                    case 2:
                        String str3 = f17673720950005104351.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    S10973172697741180971.i(E12098517352909843120.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) R9411874267597469228.D0(queryParameters);
                                if (str5 == null) {
                                    f17673720950005104351.g = true;
                                    str5 = str4;
                                }
                                H5501760756038144638 h5501760756038144638 = new H5501760756038144638();
                                int i = 0;
                                for (U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(F17673720950005104351.n, str5); u12307647644992999381B != null; u12307647644992999381B = u12307647644992999381B.d()) {
                                    X13869420807587484607 x13869420807587484607B = u12307647644992999381B.c.b(1);
                                    x13869420807587484607B.getClass();
                                    h5501760756038144638.b.add(x13869420807587484607B.a);
                                    if (u12307647644992999381B.b().a > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, u12307647644992999381B.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = u12307647644992999381B.b().b + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                h5501760756038144638.a = F17673720950005104351.g(sb.toString());
                                linkedHashMap.put(str4, h5501760756038144638);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f17673720950005104351.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        F17673720950005104351.a(fragment, arrayList2, sb2);
                        return new H9390398899829886498(arrayList2, sb2.toString());
                    case 4:
                        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        return (h9390398899829886498 == null || (list = (List) h9390398899829886498.a) == null) ? new ArrayList() : list;
                    case 5:
                        H9390398899829886498 h93903988998298864982 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        if (h93903988998298864982 != null) {
                            return (String) h93903988998298864982.b;
                        }
                        return null;
                    case 6:
                        String str7 = (String) f17673720950005104351.j.getValue();
                        if (str7 != null) {
                            return new H5336160545165318150(str7, m7765909118661531151);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b8 = 7;
        new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.T3425500135353800827
            public final /* synthetic */ F17673720950005104351 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                List list;
                byte b22 = b8;
                M7765909118661531151 m7765909118661531151 = M7765909118661531151.IGNORE_CASE;
                F17673720950005104351 f17673720950005104351 = this.b;
                switch (b22) {
                    case 0:
                        String str2 = f17673720950005104351.c;
                        if (str2 != null) {
                            return new H5336160545165318150(str2, m7765909118661531151);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(F17673720950005104351.r.f(f17673720950005104351.a));
                    case 2:
                        String str3 = f17673720950005104351.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    S10973172697741180971.i(E12098517352909843120.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) R9411874267597469228.D0(queryParameters);
                                if (str5 == null) {
                                    f17673720950005104351.g = true;
                                    str5 = str4;
                                }
                                H5501760756038144638 h5501760756038144638 = new H5501760756038144638();
                                int i = 0;
                                for (U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(F17673720950005104351.n, str5); u12307647644992999381B != null; u12307647644992999381B = u12307647644992999381B.d()) {
                                    X13869420807587484607 x13869420807587484607B = u12307647644992999381B.c.b(1);
                                    x13869420807587484607B.getClass();
                                    h5501760756038144638.b.add(x13869420807587484607B.a);
                                    if (u12307647644992999381B.b().a > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, u12307647644992999381B.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = u12307647644992999381B.b().b + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                h5501760756038144638.a = F17673720950005104351.g(sb.toString());
                                linkedHashMap.put(str4, h5501760756038144638);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f17673720950005104351.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        F17673720950005104351.a(fragment, arrayList2, sb2);
                        return new H9390398899829886498(arrayList2, sb2.toString());
                    case 4:
                        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        return (h9390398899829886498 == null || (list = (List) h9390398899829886498.a) == null) ? new ArrayList() : list;
                    case 5:
                        H9390398899829886498 h93903988998298864982 = (H9390398899829886498) f17673720950005104351.h.getValue();
                        if (h93903988998298864982 != null) {
                            return (String) h93903988998298864982.b;
                        }
                        return null;
                    case 6:
                        String str7 = (String) f17673720950005104351.j.getValue();
                        if (str7 != null) {
                            return new H5336160545165318150(str7, m7765909118661531151);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!m.a(str)) {
            String strPattern = f235o.a.pattern();
            strPattern.getClass();
            sb.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        U12307647644992999381 u12307647644992999381L = U8836654130139556418.l(matcher, 0, str);
        if (u12307647644992999381L != null) {
            a(str.substring(0, u12307647644992999381L.b().a), arrayList, sb);
            if (!p.a(sb) && !q.a(sb)) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = g(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(n, str); u12307647644992999381B != null; u12307647644992999381B = u12307647644992999381B.d()) {
            X13869420807587484607 x13869420807587484607B = u12307647644992999381B.c.b(1);
            x13869420807587484607B.getClass();
            arrayList.add(x13869420807587484607B.a);
            if (u12307647644992999381B.b().a > i) {
                String strQuote = Pattern.quote(str.substring(i, u12307647644992999381B.b().a));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = q.a.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = u12307647644992999381B.b().b + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static String g(String str) {
        return (M8927913404651150384.L(str, "\\Q", false) && M8927913404651150384.L(str, "\\E", false)) ? Z13168519540281190457.D(false, str, ".*", "\\E.*\\Q") : M8927913404651150384.L(str, "\\.\\*", false) ? Z13168519540281190457.D(false, str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.a);
        uri2.getClass();
        return R9411874267597469228.G0(pathSegments, uri2.getPathSegments()).size();
    }

    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            P17571903987102865660.n0(arrayList, ((H5501760756038144638) it.next()).b);
        }
        return R9411874267597469228.O0(R9411874267597469228.O0(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        U12307647644992999381 u12307647644992999381E;
        U12307647644992999381 u12307647644992999381E2;
        String strDecode;
        uri.getClass();
        H5336160545165318150 h5336160545165318150 = (H5336160545165318150) this.d.getValue();
        if (h5336160545165318150 != null && (u12307647644992999381E = h5336160545165318150.e(uri.toString())) != null) {
            Bundle bundleZ = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
            if (e(u12307647644992999381E, bundleZ, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, bundleZ, linkedHashMap))) {
                String fragment = uri.getFragment();
                H5336160545165318150 h53361605451653181502 = (H5336160545165318150) this.k.getValue();
                if (h53361605451653181502 != null && (u12307647644992999381E2 = h53361605451653181502.e(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(Z115818233709597990.k0(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            K5751602218013079365.f0();
                            throw null;
                        }
                        String str = (String) obj;
                        X13869420807587484607 x13869420807587484607B = u12307647644992999381E2.c.b(i2);
                        if (x13869420807587484607B != null) {
                            strDecode = Uri.decode(x13869420807587484607B.a);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        if (linkedHashMap.get(str) != null) {
                            Z3383101362411723454.s();
                            return null;
                        }
                        try {
                            str.getClass();
                            bundleZ.putString(str, strDecode);
                            arrayList.add(O9245300239821758723.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (Q3181834110876746778.J(linkedHashMap, new R5711761951756790003(bundleZ, (byte) 0)).isEmpty()) {
                    return bundleZ;
                }
            }
        }
        return null;
    }

    public final boolean e(U12307647644992999381 u12307647644992999381, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String strDecode = null;
            if (i < 0) {
                K5751602218013079365.f0();
                throw null;
            }
            String str = (String) obj;
            X13869420807587484607 x13869420807587484607B = u12307647644992999381.c.b(i3);
            if (x13869420807587484607B != null) {
                strDecode = Uri.decode(x13869420807587484607B.a);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            if (linkedHashMap.get(str) != null) {
                Z3383101362411723454.s();
                return false;
            }
            try {
                str.getClass();
                bundle.putString(str, strDecode);
                arrayList2.add(O9245300239821758723.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof F17673720950005104351)) {
            return false;
        }
        return this.a.equals(((F17673720950005104351) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r21, android.os.Bundle r22, java.util.LinkedHashMap r23) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F17673720950005104351.f(android.net.Uri, android.os.Bundle, java.util.LinkedHashMap):boolean");
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
