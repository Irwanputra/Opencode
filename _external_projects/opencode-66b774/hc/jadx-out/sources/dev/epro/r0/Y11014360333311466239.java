package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y11014360333311466239 {
    public final H885820584188137964 a;
    public final R6694982557896913324 b;
    public final int c;
    public final int d;
    public final Object e;

    public Y11014360333311466239(H885820584188137964 h885820584188137964, R6694982557896913324 r6694982557896913324, int i, int i2, Object obj) {
        this.a = h885820584188137964;
        this.b = r6694982557896913324;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y11014360333311466239)) {
            return false;
        }
        Y11014360333311466239 y11014360333311466239 = (Y11014360333311466239) obj;
        return S10823041268949770285.t(this.a, y11014360333311466239.a) && S10823041268949770285.t(this.b, y11014360333311466239.b) && this.c == y11014360333311466239.c && this.d == y11014360333311466239.d && S10823041268949770285.t(this.e, y11014360333311466239.e);
    }

    public final int hashCode() {
        H885820584188137964 h885820584188137964 = this.a;
        int iF = X2485016533998461232.f(this.d, X2485016533998461232.f(this.c, (((h885820584188137964 == null ? 0 : h885820584188137964.hashCode()) * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        return iF + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str = "Invalid";
        int i = this.c;
        String str2 = i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        G6547577305291411977.B(sb, str2, ", fontSynthesis=", str, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
