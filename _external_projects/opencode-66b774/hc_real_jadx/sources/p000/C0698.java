package p000;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import p000.p001.C0629;
import p131.p155.p156.p157.C2098;
import p243.C2808;
import p243.C2819;

/* renamed from: 〳ぜぞぜべっ.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0698 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final char[] f4642 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    @Nullable
    public final String f4643;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f4644;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    @Nullable
    public final List<String> f4645;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f4646;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f4647;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f4648;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final List<String> f4649;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final String f4650;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final String f4651;

    /* renamed from: 〳ぜぞぜべっ.ざとぅぼこ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0699 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        @Nullable
        public String f4652;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        @Nullable
        public List<String> f4654;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        @Nullable
        public String f4656;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final List<String> f4658;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        @Nullable
        public String f4659;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f4653 = "";

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public String f4655 = "";

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f4657 = -1;

        /* renamed from: 〳ぜぞぜべっ.ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public enum EnumC0700 {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public C0699() {
            ArrayList arrayList = new ArrayList();
            this.f4658 = arrayList;
            arrayList.add("");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4656);
            sb.append("://");
            if (!this.f4653.isEmpty() || !this.f4655.isEmpty()) {
                sb.append(this.f4653);
                if (!this.f4655.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f4655);
                }
                sb.append('@');
            }
            if (this.f4659.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f4659);
                sb.append(']');
            } else {
                sb.append(this.f4659);
            }
            int i = this.f4657;
            if (i == -1) {
                i = C0698.m1954(this.f4656);
            }
            if (i != C0698.m1954(this.f4656)) {
                sb.append(':');
                sb.append(i);
            }
            List<String> list = this.f4658;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
            if (this.f4654 != null) {
                sb.append('?');
                C0698.m1947(sb, this.f4654);
            }
            if (this.f4652 != null) {
                sb.append('#');
                sb.append(this.f4652);
            }
            return sb.toString();
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0699 m1963(@Nullable String str) {
            this.f4654 = str != null ? C0698.m1948(C0698.m1946(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:144:0x01f1, code lost:
        
            if (r1 <= 65535) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:205:0x005c, code lost:
        
            if (r7 == ':') goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x01c9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0101  */
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p000.C0698.C0699.EnumC0700 m1964(@javax.annotation.Nullable p000.C0698 r34, java.lang.String r35) {
            /*
                Method dump skipped, instructions count: 859
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0698.C0699.m1964(〳ぜぞぜべっ.ざとぅぼこ〺, java.lang.String):〳ぜぞぜべっ.ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ");
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0698 m1965() {
            if (this.f4656 == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f4659 != null) {
                return new C0698(this);
            }
            throw new IllegalStateException("host == null");
        }
    }

    public C0698(C0699 c0699) {
        this.f4647 = c0699.f4656;
        this.f4644 = m1953(c0699.f4653, false);
        this.f4646 = m1953(c0699.f4655, false);
        this.f4650 = c0699.f4659;
        int i = c0699.f4657;
        this.f4648 = i == -1 ? m1954(c0699.f4656) : i;
        this.f4649 = m1960(c0699.f4658, false);
        List<String> list = c0699.f4654;
        this.f4645 = list != null ? m1960(list, true) : null;
        String str = c0699.f4652;
        this.f4643 = str != null ? m1952(str, 0, str.length(), false) : null;
        this.f4651 = c0699.toString();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String m1946(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m1951(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static void m1947(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static List<String> m1948(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static boolean m1949(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C0629.m1806(str.charAt(i + 1)) != -1 && C0629.m1806(str.charAt(i3)) != -1;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String m1950(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m1951(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m1951(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            int i4 = -1;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !m1949(str, i3, i2)))) || (codePointAt == 43 && z3)))) {
                C2819 c2819 = new C2819();
                c2819.m4908(str, i, i3);
                C2819 c28192 = null;
                while (i3 < i2) {
                    int codePointAt2 = str.codePointAt(i3);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            c2819.m4916(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str2.indexOf(codePointAt2) != i4 || (codePointAt2 == 37 && (!z || (z2 && !m1949(str, i3, i2)))))) {
                            if (c28192 == null) {
                                c28192 = new C2819();
                            }
                            if (charset == null || charset.equals(C0629.f4354)) {
                                c28192.m4915(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i3;
                                if (i3 < 0) {
                                    throw new IllegalAccessError(C2098.m4208("beginIndex < 0: ", i3));
                                }
                                if (charCount < i3) {
                                    throw new IllegalArgumentException("endIndex < beginIndex: " + charCount + " < " + i3);
                                }
                                if (charCount > str.length()) {
                                    throw new IllegalArgumentException("endIndex > string.length: " + charCount + " > " + str.length());
                                }
                                if (charset.equals(C2808.f10476)) {
                                    c28192.m4908(str, i3, charCount);
                                } else {
                                    byte[] bytes = str.substring(i3, charCount).getBytes(charset);
                                    c28192.m4923(bytes, 0, bytes.length);
                                }
                            }
                            while (!c28192.mo4874()) {
                                int mo4865 = c28192.mo4865() & 255;
                                c2819.m4927(37);
                                char[] cArr = f4642;
                                c2819.m4927(cArr[(mo4865 >> 4) & 15]);
                                c2819.m4927(cArr[mo4865 & 15]);
                            }
                        } else {
                            c2819.m4915(codePointAt2);
                        }
                    }
                    i3 += Character.charCount(codePointAt2);
                    i4 = -1;
                }
                return c2819.mo4866();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static String m1952(String str, int i, int i2, boolean z) {
        int i3;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                C2819 c2819 = new C2819();
                c2819.m4908(str, i, i4);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt != 37 || (i3 = i4 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            c2819.m4927(32);
                        }
                        c2819.m4915(codePointAt);
                    } else {
                        int m1806 = C0629.m1806(str.charAt(i4 + 1));
                        int m18062 = C0629.m1806(str.charAt(i3));
                        if (m1806 != -1 && m18062 != -1) {
                            c2819.m4927((m1806 << 4) + m18062);
                            i4 = i3;
                        }
                        c2819.m4915(codePointAt);
                    }
                    i4 += Character.charCount(codePointAt);
                }
                return c2819.mo4866();
            }
            i4++;
        }
        return str.substring(i, i2);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static String m1953(String str, boolean z) {
        return m1952(str, 0, str.length(), z);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static int m1954(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C0698) && ((C0698) obj).f4651.equals(this.f4651);
    }

    public int hashCode() {
        return this.f4651.hashCode();
    }

    public String toString() {
        return this.f4651;
    }

    @Nullable
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String m1955() {
        if (this.f4645 == null) {
            return null;
        }
        int indexOf = this.f4651.indexOf(63) + 1;
        String str = this.f4651;
        return this.f4651.substring(indexOf, C0629.m1825(str, indexOf, str.length(), '#'));
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public List<String> m1956() {
        int indexOf = this.f4651.indexOf(47, this.f4647.length() + 3);
        String str = this.f4651;
        int m1807 = C0629.m1807(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m1807) {
            int i = indexOf + 1;
            int m1825 = C0629.m1825(this.f4651, i, m1807, '/');
            arrayList.add(this.f4651.substring(i, m1825));
            indexOf = m1825;
        }
        return arrayList;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public URI m1957() {
        C0699 m1962 = m1962();
        int size = m1962.f4658.size();
        for (int i = 0; i < size; i++) {
            m1962.f4658.set(i, m1946(m1962.f4658.get(i), "[]", true, true, false, true));
        }
        List<String> list = m1962.f4654;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = m1962.f4654.get(i2);
                if (str != null) {
                    m1962.f4654.set(i2, m1946(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = m1962.f4652;
        if (str2 != null) {
            m1962.f4652 = m1946(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String c0699 = m1962.toString();
        try {
            return new URI(c0699);
        } catch (URISyntaxException e) {
            try {
                return URI.create(c0699.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String m1958() {
        if (this.f4646.isEmpty()) {
            return "";
        }
        return this.f4651.substring(this.f4651.indexOf(58, this.f4647.length() + 3) + 1, this.f4651.indexOf(64));
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String m1959() {
        int indexOf = this.f4651.indexOf(47, this.f4647.length() + 3);
        String str = this.f4651;
        return this.f4651.substring(indexOf, C0629.m1807(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final List<String> m1960(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m1952(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String m1961() {
        if (this.f4644.isEmpty()) {
            return "";
        }
        int length = this.f4647.length() + 3;
        String str = this.f4651;
        return this.f4651.substring(length, C0629.m1807(str, length, str.length(), ":@"));
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C0699 m1962() {
        C0699 c0699 = new C0699();
        c0699.f4656 = this.f4647;
        c0699.f4653 = m1961();
        c0699.f4655 = m1958();
        c0699.f4659 = this.f4650;
        c0699.f4657 = this.f4648 != m1954(this.f4647) ? this.f4648 : -1;
        c0699.f4658.clear();
        c0699.f4658.addAll(m1956());
        c0699.m1963(m1955());
        c0699.f4652 = this.f4643 == null ? null : this.f4651.substring(this.f4651.indexOf(35) + 1);
        return c0699;
    }
}
