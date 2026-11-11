package p015.p016.p020;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import p015.p016.C0787;
import p015.p016.p020.C0958;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0956 implements Iterable<C0968>, Cloneable {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final String[] f5265 = new String[0];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f5266 = 0;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String[] f5267;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String[] f5268;

    /* renamed from: いいにぽつ.〺つふすそ.びぐびあび.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0957 implements Iterator<C0968> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f5269 = 0;

        public C0957() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5269 < C0956.this.f5266;
        }

        @Override // java.util.Iterator
        public C0968 next() {
            C0956 c0956 = C0956.this;
            String[] strArr = c0956.f5267;
            int i = this.f5269;
            C0968 c0968 = new C0968(strArr[i], c0956.f5268[i], c0956);
            this.f5269++;
            return c0968;
        }

        @Override // java.util.Iterator
        public void remove() {
            C0956 c0956 = C0956.this;
            int i = this.f5269 - 1;
            this.f5269 = i;
            int i2 = c0956.f5266;
            if (i >= i2) {
                throw new IllegalArgumentException("Must be false");
            }
            int i3 = (i2 - i) - 1;
            if (i3 > 0) {
                String[] strArr = c0956.f5267;
                int i4 = i + 1;
                System.arraycopy(strArr, i4, strArr, i, i3);
                String[] strArr2 = c0956.f5268;
                System.arraycopy(strArr2, i4, strArr2, i, i3);
            }
            int i5 = c0956.f5266 - 1;
            c0956.f5266 = i5;
            c0956.f5267[i5] = null;
            c0956.f5268[i5] = null;
        }
    }

    public C0956() {
        String[] strArr = f5265;
        this.f5267 = strArr;
        this.f5268 = strArr;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static String[] m2255(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0956.class != obj.getClass()) {
            return false;
        }
        C0956 c0956 = (C0956) obj;
        if (this.f5266 == c0956.f5266 && Arrays.equals(this.f5267, c0956.f5267)) {
            return Arrays.equals(this.f5268, c0956.f5268);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5266 * 31) + Arrays.hashCode(this.f5267)) * 31) + Arrays.hashCode(this.f5268);
    }

    @Override // java.lang.Iterable
    public Iterator<C0968> iterator() {
        return new C0957();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            m2256(sb, new C0958("").f5271);
            return sb.toString();
        } catch (IOException e) {
            throw new C0787(e);
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m2256(Appendable appendable, C0958.C0960 c0960) {
        int i = this.f5266;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f5267[i2];
            String str2 = this.f5268[i2];
            appendable.append(' ').append(str);
            if (!C0968.m2277(str, str2, c0960)) {
                appendable.append("=\"");
                if (str2 == null) {
                    str2 = "";
                }
                C0962.m2273(appendable, str2, c0960, true, false, false);
                appendable.append('\"');
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2257(C0956 c0956) {
        int i = c0956.f5266;
        if (i == 0) {
            return;
        }
        m2260(this.f5266 + i);
        C0957 c0957 = c0956.new C0957();
        while (c0957.hasNext()) {
            m2262((C0968) c0957.next());
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String m2258(String str) {
        String str2;
        int m2259 = m2259(str);
        return (m2259 == -1 || (str2 = this.f5268[m2259]) == null) ? "" : str2;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int m2259(String str) {
        C1687.m3701(str);
        for (int i = 0; i < this.f5266; i++) {
            if (str.equalsIgnoreCase(this.f5267[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m2260(int i) {
        C1687.m3722(i >= this.f5266);
        String[] strArr = this.f5267;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 4 ? this.f5266 * 2 : 4;
        if (i <= i2) {
            i = i2;
        }
        this.f5267 = m2255(strArr, i);
        this.f5268 = m2255(this.f5268, i);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2261(String str, String str2) {
        m2260(this.f5266 + 1);
        String[] strArr = this.f5267;
        int i = this.f5266;
        strArr[i] = str;
        this.f5268[i] = str2;
        this.f5266 = i + 1;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C0956 m2262(C0968 c0968) {
        C1687.m3701(c0968);
        m2266(c0968.f5302, c0968.f5303);
        c0968.f5304 = this;
        return this;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String m2263(String str) {
        String str2;
        int m2265 = m2265(str);
        return (m2265 == -1 || (str2 = this.f5268[m2265]) == null) ? "" : str2;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0956 clone() {
        try {
            C0956 c0956 = (C0956) super.clone();
            c0956.f5266 = this.f5266;
            this.f5267 = m2255(this.f5267, this.f5266);
            this.f5268 = m2255(this.f5268, this.f5266);
            return c0956;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int m2265(String str) {
        C1687.m3701(str);
        for (int i = 0; i < this.f5266; i++) {
            if (str.equals(this.f5267[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C0956 m2266(String str, String str2) {
        int m2265 = m2265(str);
        if (m2265 != -1) {
            this.f5268[m2265] = str2;
        } else {
            m2261(str, str2);
        }
        return this;
    }
}
