package p000;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p000.p001.C0629;
import p000.p001.p003.C0616;

/* renamed from: 〳ぜぞぜべっ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0723 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final boolean f4790;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f4791;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final boolean f4792;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final long f4793;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f4794;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final String f4795;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean f4796;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final String f4797;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final boolean f4798;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final Pattern f4786 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final Pattern f4789 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final Pattern f4787 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final Pattern f4788 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C0723(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4794 = str;
        this.f4791 = str2;
        this.f4793 = j;
        this.f4797 = str3;
        this.f4795 = str4;
        this.f4796 = z;
        this.f4792 = z2;
        this.f4798 = z3;
        this.f4790 = z4;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static long m1981(String str, int i, int i2) {
        int m1982 = m1982(str, i, i2, false);
        Matcher matcher = f4788.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (m1982 < i2) {
            int m19822 = m1982(str, m1982 + 1, i2, true);
            matcher.region(m1982, m19822);
            if (i4 == -1 && matcher.usePattern(f4788).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f4787).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else {
                if (i6 == -1) {
                    Pattern pattern = f4789;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f4786).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            }
            m1982 = m1982(str, m19822 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i6 == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C0629.f4353);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static int m1982(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0723)) {
            return false;
        }
        C0723 c0723 = (C0723) obj;
        return c0723.f4794.equals(this.f4794) && c0723.f4791.equals(this.f4791) && c0723.f4797.equals(this.f4797) && c0723.f4795.equals(this.f4795) && c0723.f4793 == this.f4793 && c0723.f4796 == this.f4796 && c0723.f4792 == this.f4792 && c0723.f4790 == this.f4790 && c0723.f4798 == this.f4798;
    }

    public int hashCode() {
        int hashCode = (this.f4795.hashCode() + ((this.f4797.hashCode() + ((this.f4791.hashCode() + ((this.f4794.hashCode() + 527) * 31)) * 31)) * 31)) * 31;
        long j = this.f4793;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f4796 ? 1 : 0)) * 31) + (!this.f4792 ? 1 : 0)) * 31) + (!this.f4790 ? 1 : 0)) * 31) + (!this.f4798 ? 1 : 0);
    }

    public String toString() {
        String format;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4794);
        sb.append('=');
        sb.append(this.f4791);
        if (this.f4790) {
            if (this.f4793 == Long.MIN_VALUE) {
                format = "; max-age=0";
            } else {
                sb.append("; expires=");
                format = C0616.f4308.get().format(new Date(this.f4793));
            }
            sb.append(format);
        }
        if (!this.f4798) {
            sb.append("; domain=");
            sb.append(this.f4797);
        }
        sb.append("; path=");
        sb.append(this.f4795);
        if (this.f4796) {
            sb.append("; secure");
        }
        if (this.f4792) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
