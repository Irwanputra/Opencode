package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T8337309744439716006 {
    public static final T8337309744439716006 g = new T8337309744439716006(false, 0, true, 1, 1, A5535629440393075509.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final A5535629440393075509 f;

    public T8337309744439716006(boolean z, int i, boolean z2, int i2, int i3, A5535629440393075509 a5535629440393075509) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = a5535629440393075509;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T8337309744439716006)) {
            return false;
        }
        T8337309744439716006 t8337309744439716006 = (T8337309744439716006) obj;
        return this.a == t8337309744439716006.a && this.b == t8337309744439716006.b && this.c == t8337309744439716006.c && this.d == t8337309744439716006.d && this.e == t8337309744439716006.e && S10823041268949770285.t(this.f, t8337309744439716006.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + X2485016533998461232.f(this.e, X2485016533998461232.f(this.d, G6547577305291411977.i(X2485016533998461232.f(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String strA = F10310726811924304595.a(this.b);
        String strA2 = C17777856232554783605.a(this.d);
        String strA3 = R512193971042300889.a(this.e);
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.a);
        sb.append(", capitalization=");
        sb.append(strA);
        sb.append(", autoCorrect=");
        X2485016533998461232.j(", keyboardType=", strA2, ", imeAction=", sb, this.c);
        sb.append(strA3);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
