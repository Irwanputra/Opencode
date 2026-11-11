package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import p000.p001.C0629;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0597 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String[] f4257;

    /* renamed from: 〳ぜぞぜべっ.ぉざぅち〻$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0598 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final List<String> f4258 = new ArrayList(20);

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0598 m1746(String str, String str2) {
            this.f4258.add(str);
            this.f4258.add(str2.trim());
            return this;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m1747(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C0629.m1820("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            if (str2 == null) {
                throw new NullPointerException(C2098.m4187("value for name ", str, " == null"));
            }
            int length2 = str2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char charAt2 = str2.charAt(i2);
                if ((charAt2 <= 31 && charAt2 != '\t') || charAt2 >= 127) {
                    throw new IllegalArgumentException(C0629.m1820("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2));
                }
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0598 m1748(String str, String str2) {
            m1747(str, str2);
            this.f4258.add(str);
            this.f4258.add(str2.trim());
            return this;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C0598 m1749(String str) {
            int i = 0;
            while (i < this.f4258.size()) {
                if (str.equalsIgnoreCase(this.f4258.get(i))) {
                    this.f4258.remove(i);
                    this.f4258.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }
    }

    public C0597(C0598 c0598) {
        List<String> list = c0598.f4258;
        this.f4257 = (String[]) list.toArray(new String[list.size()]);
    }

    public C0597(String[] strArr) {
        this.f4257 = strArr;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C0597 m1740(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            if (strArr2[i] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = strArr2[i].trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            if (str.length() == 0 || str.indexOf(0) != -1 || str2.indexOf(0) != -1) {
                throw new IllegalArgumentException("Unexpected header: " + str + ": " + str2);
            }
        }
        return new C0597(strArr2);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C0597) && Arrays.equals(((C0597) obj).f4257, this.f4257);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4257);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int m1744 = m1744();
        for (int i = 0; i < m1744; i++) {
            sb.append(m1741(i));
            sb.append(": ");
            sb.append(m1745(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String m1741(int i) {
        return this.f4257[i * 2];
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C0598 m1742() {
        C0598 c0598 = new C0598();
        Collections.addAll(c0598.f4258, this.f4257);
        return c0598;
    }

    @Nullable
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String m1743(String str) {
        String[] strArr = this.f4257;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int m1744() {
        return this.f4257.length / 2;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String m1745(int i) {
        return this.f4257[(i * 2) + 1];
    }
}
