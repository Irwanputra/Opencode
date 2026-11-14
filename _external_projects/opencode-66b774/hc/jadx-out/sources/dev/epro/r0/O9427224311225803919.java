package dev.epro.r0;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O9427224311225803919 {
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public O9427224311225803919(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O9427224311225803919)) {
            return false;
        }
        O9427224311225803919 o9427224311225803919 = (O9427224311225803919) obj;
        return o9427224311225803919.a.equals(this.a) && o9427224311225803919.b.equals(this.b) && o9427224311225803919.c == this.c && o9427224311225803919.d.equals(this.d) && o9427224311225803919.e.equals(this.e) && o9427224311225803919.f == this.f && o9427224311225803919.g == this.g && o9427224311225803919.h == this.h && o9427224311225803919.i == this.i && S10823041268949770285.t(o9427224311225803919.j, this.j);
    }

    public final int hashCode() {
        int i = G6547577305291411977.i(G6547577305291411977.i(G6547577305291411977.i(G6547577305291411977.i(E12098517352909843120.h(E12098517352909843120.h(G6547577305291411977.j(E12098517352909843120.h(E12098517352909843120.h(527, 31, this.a), 31, this.b), this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j = this.c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) Q10449490638169241031.a.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String str2 = this.j;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
