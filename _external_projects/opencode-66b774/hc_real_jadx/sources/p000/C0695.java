package p000;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: 〳ぜぞぜべっ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0695 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f4628;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    @Nullable
    public final String f4629;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f4630;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final Pattern f4627 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final Pattern f4626 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public C0695(String str, String str2, String str3, @Nullable String str4) {
        this.f4630 = str;
        this.f4628 = str2;
        this.f4629 = str4;
    }

    @Nullable
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C0695 m1944(String str) {
        Matcher matcher = f4627.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f4626.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = group3;
            }
        }
        return new C0695(str, lowerCase, lowerCase2, str2);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C0695) && ((C0695) obj).f4630.equals(this.f4630);
    }

    public int hashCode() {
        return this.f4630.hashCode();
    }

    public String toString() {
        return this.f4630;
    }
}
