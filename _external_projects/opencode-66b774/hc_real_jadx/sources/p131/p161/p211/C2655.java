package p131.p161.p211;

import java.math.BigInteger;
import p131.p161.p211.p214.C2631;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.でどあくず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2655 extends AbstractC2532 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f10116;

    public C2655(Boolean bool) {
        bool.getClass();
        this.f10116 = bool;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static boolean m4635(C2655 c2655) {
        Object obj = c2655.f10116;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2655.class != obj.getClass()) {
            return false;
        }
        C2655 c2655 = (C2655) obj;
        if (this.f10116 == null) {
            return c2655.f10116 == null;
        }
        if (m4635(this) && m4635(c2655)) {
            return m4637().longValue() == c2655.m4637().longValue();
        }
        Object obj2 = this.f10116;
        if (!(obj2 instanceof Number) || !(c2655.f10116 instanceof Number)) {
            return obj2.equals(c2655.f10116);
        }
        double doubleValue = m4637().doubleValue();
        double doubleValue2 = c2655.m4637().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f10116 == null) {
            return 31;
        }
        if (m4635(this)) {
            doubleToLongBits = m4637().longValue();
        } else {
            Object obj = this.f10116;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m4637().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m4636() {
        Object obj = this.f10116;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(m4638());
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Number m4637() {
        Object obj = this.f10116;
        return obj instanceof String ? new C2631((String) this.f10116) : (Number) obj;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String m4638() {
        Object obj = this.f10116;
        return obj instanceof Number ? m4637().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public C2655(Number number) {
        number.getClass();
        this.f10116 = number;
    }

    public C2655(String str) {
        str.getClass();
        this.f10116 = str;
    }
}
