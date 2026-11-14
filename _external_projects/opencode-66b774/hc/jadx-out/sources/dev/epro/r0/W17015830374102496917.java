package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W17015830374102496917 {
    public static final W17015830374102496917 g = new W17015830374102496917(0, 0, 127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final A5535629440393075509 f;

    public W17015830374102496917(int i, int i2, int i3) {
        Boolean bool = (i3 & 2) != 0 ? null : Boolean.FALSE;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = -1;
        this.b = bool;
        this.c = i;
        this.d = i2;
        this.e = null;
        this.f = null;
    }

    public final int a() {
        int i = this.d;
        R512193971042300889 r512193971042300889 = new R512193971042300889(i);
        if (i == -1) {
            r512193971042300889 = null;
        }
        if (r512193971042300889 != null) {
            return r512193971042300889.a;
        }
        return 1;
    }

    public final T8337309744439716006 b(boolean z) {
        int i = this.a;
        F10310726811924304595 f10310726811924304595 = new F10310726811924304595(i);
        if (i == -1) {
            f10310726811924304595 = null;
        }
        int i2 = f10310726811924304595 != null ? f10310726811924304595.a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        C17777856232554783605 c17777856232554783605 = i3 != 0 ? new C17777856232554783605(i3) : null;
        int i4 = c17777856232554783605 != null ? c17777856232554783605.a : 1;
        int iA = a();
        A5535629440393075509 a5535629440393075509 = this.f;
        if (a5535629440393075509 == null) {
            a5535629440393075509 = A5535629440393075509.c;
        }
        return new T8337309744439716006(z, i2, zBooleanValue, i4, iA, a5535629440393075509);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W17015830374102496917)) {
            return false;
        }
        W17015830374102496917 w17015830374102496917 = (W17015830374102496917) obj;
        return this.a == w17015830374102496917.a && S10823041268949770285.t(this.b, w17015830374102496917.b) && this.c == w17015830374102496917.c && this.d == w17015830374102496917.d && S10823041268949770285.t(this.e, w17015830374102496917.e) && S10823041268949770285.t(this.f, w17015830374102496917.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iF = X2485016533998461232.f(this.d, X2485016533998461232.f(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.e;
        int iHashCode2 = (iF + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        A5535629440393075509 a5535629440393075509 = this.f;
        return iHashCode2 + (a5535629440393075509 != null ? a5535629440393075509.a.hashCode() : 0);
    }

    public final String toString() {
        String strA = F10310726811924304595.a(this.a);
        String strA2 = C17777856232554783605.a(this.c);
        String strA3 = R512193971042300889.a(this.d);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(strA);
        sb.append(", autoCorrectEnabled=");
        sb.append(this.b);
        sb.append(", keyboardType=");
        G6547577305291411977.B(sb, strA2, ", imeAction=", strA3, ", platformImeOptions=nullshowKeyboardOnFocus=");
        sb.append(this.e);
        sb.append(", hintLocales=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
