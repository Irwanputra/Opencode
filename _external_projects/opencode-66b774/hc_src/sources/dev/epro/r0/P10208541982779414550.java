package dev.epro.r0;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
        int V = M8927913404651150384.V(str, '/', length, 4);
        return str.substring(V, L14928198200995638215.d(str, V, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int V = M8927913404651150384.V(str, '/', length, 4);
        int d = L14928198200995638215.d(str, V, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (V < d) {
            int i = V + 1;
            int c = L14928198200995638215.c(str, '/', i, d);
            arrayList.add(str.substring(i, c));
            V = c;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int V = M8927913404651150384.V(str, '?', 0, 6) + 1;
        return str.substring(V, L14928198200995638215.c(str, '#', V, str.length()));
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
        String substring;
        String str;
        Z17877815202129479382 z17877815202129479382 = new Z17877815202129479382();
        String str2 = this.a;
        z17877815202129479382.a = str2;
        z17877815202129479382.b = e();
        z17877815202129479382.c = a();
        z17877815202129479382.d = this.d;
        str2.getClass();
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.e;
        z17877815202129479382.e = i2 != i ? i2 : -1;
        ArrayList arrayList = z17877815202129479382.f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        z17877815202129479382.g = d != null ? Z17877815202129479382.d(R7033599853981556291.n(d, 0, 0, " \"'<>#", 83)) : null;
        if (this.g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(M8927913404651150384.V(str3, '#', 0, 6) + 1);
        }
        z17877815202129479382.h = substring;
        String str4 = z17877815202129479382.d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str4).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        z17877815202129479382.d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, R7033599853981556291.n((String) arrayList.get(i3), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = z17877815202129479382.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? R7033599853981556291.n(str5, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str6 = z17877815202129479382.h;
        z17877815202129479382.h = str6 != null ? R7033599853981556291.n(str6, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String z178778152021294793822 = z17877815202129479382.toString();
        try {
            return new URI(z178778152021294793822);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(z178778152021294793822).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
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
