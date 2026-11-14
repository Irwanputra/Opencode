package dev.epro.r0;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q5096424420613459804 {
    public final P8646985343900033725 a;
    public final R14253319523827250490 b;
    public final P9699383776227634085 c;
    public final O13417198602908953591 d;
    public final String e;
    public final String f;
    public final String g;

    public Q5096424420613459804(P8646985343900033725 p8646985343900033725, R14253319523827250490 r14253319523827250490, P9699383776227634085 p9699383776227634085, O13417198602908953591 o13417198602908953591, String str, String str2, String str3) {
        this.a = p8646985343900033725;
        this.b = r14253319523827250490;
        this.c = p9699383776227634085;
        this.d = o13417198602908953591;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final String a(L15314296645528043221 l15314296645528043221, Locale locale) {
        if (l15314296645528043221 == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.e, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        int i = l15314296645528043221.a;
        long j = l15314296645528043221.d;
        P8646985343900033725 p8646985343900033725 = this.a;
        if (!p8646985343900033725.c(i)) {
            Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{F17068667133831649611.a(p8646985343900033725.a, locale, 7), F17068667133831649611.a(p8646985343900033725.b, locale, 7)}, 2);
            return String.format(this.f, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
        R14253319523827250490 r14253319523827250490 = this.b;
        if (r14253319523827250490.a(i) && r14253319523827250490.b(j)) {
            return "";
        }
        Object[] objArrCopyOf3 = Arrays.copyOf(new Object[]{this.d.a(Long.valueOf(j), locale, false)}, 1);
        return String.format(this.g, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
    }
}
