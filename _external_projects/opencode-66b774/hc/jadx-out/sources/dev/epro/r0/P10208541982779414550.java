package dev.epro.r0;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P10208541982779414550 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;

    public P10208541982779414550(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = str5;
        this.h = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(M8927913404651150384.V(str, ':', length, 4) + 1, M8927913404651150384.V(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iV = M8927913404651150384.V(str, '/', length, 4);
        return str.substring(iV, L14928198200995638215.d(str, iV, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iV = M8927913404651150384.V(str, '/', length, 4);
        int iD = L14928198200995638215.d(str, iV, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iV < iD) {
            int i = iV + 1;
            int iC = L14928198200995638215.c(str, '/', i, iD);
            arrayList.add(str.substring(i, iC));
            iV = iC;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int iV = M8927913404651150384.V(str, '?', 0, 6) + 1;
        return str.substring(iV, L14928198200995638215.c(str, '#', iV, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, L14928198200995638215.d(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof P10208541982779414550) && ((P10208541982779414550) obj).h.equals(this.h);
    }

    public final String f() {
        Z17877815202129479382 z17877815202129479382;
        try {
            z17877815202129479382 = new Z17877815202129479382();
            z17877815202129479382.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            z17877815202129479382 = null;
        }
        z17877815202129479382.getClass();
        z17877815202129479382.b = R7033599853981556291.n("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        z17877815202129479382.c = R7033599853981556291.n("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return z17877815202129479382.a().h;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        Z17877815202129479382 z17877815202129479382 = new Z17877815202129479382();
        String str = this.a;
        z17877815202129479382.a = str;
        z17877815202129479382.b = e();
        z17877815202129479382.c = a();
        z17877815202129479382.d = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        z17877815202129479382.e = i2 != i ? i2 : -1;
        ArrayList arrayList = z17877815202129479382.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        z17877815202129479382.g = strD != null ? Z17877815202129479382.d(R7033599853981556291.n(strD, 0, 0, " \"'<>#", 83)) : null;
        if (this.g == null) {
            strSubstring = null;
        } else {
            String str2 = this.h;
            strSubstring = str2.substring(M8927913404651150384.V(str2, '#', 0, 6) + 1);
        }
        z17877815202129479382.h = strSubstring;
        String str3 = z17877815202129479382.d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        z17877815202129479382.d = strReplaceAll;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, R7033599853981556291.n((String) arrayList.get(i3), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = z17877815202129479382.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? R7033599853981556291.n(str4, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str5 = z17877815202129479382.h;
        z17877815202129479382.h = str5 != null ? R7033599853981556291.n(str5, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = z17877815202129479382.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                Q11088980322693754445.k(e);
                return null;
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
