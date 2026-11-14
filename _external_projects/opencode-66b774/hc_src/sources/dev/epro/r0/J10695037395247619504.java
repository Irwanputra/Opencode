package dev.epro.r0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J10695037395247619504 {
    public static final J10695037395247619504 b = new J10695037395247619504(new Z13811601408893342202(new LocaleList(new Locale[0])));
    public final Z13811601408893342202 a;

    public J10695037395247619504(Z13811601408893342202 z13811601408893342202) {
        this.a = z13811601408893342202;
    }

    public static J10695037395247619504 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new J10695037395247619504(new Z13811601408893342202(new LocaleList(localeArr)));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J10695037395247619504) {
            return this.a.equals(((J10695037395247619504) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
