package p131.p161.p211.p214;

import java.math.BigDecimal;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2631 extends Number {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f10073;

    public C2631(String str) {
        this.f10073 = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f10073);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2631)) {
            return false;
        }
        String str = this.f10073;
        String str2 = ((C2631) obj).f10073;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f10073);
    }

    public int hashCode() {
        return this.f10073.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f10073);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f10073);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f10073).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f10073);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f10073).longValue();
        }
    }

    public String toString() {
        return this.f10073;
    }
}
