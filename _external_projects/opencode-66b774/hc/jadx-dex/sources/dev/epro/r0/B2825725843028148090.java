package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B2825725843028148090 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.util.Map c;
    public final android.os.IBinder d;

    public B2825725843028148090(java.lang.String str, java.lang.String str2, java.util.Map map, android.os.IBinder iBinder) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = iBinder;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B2825725843028148090)) {
            return false;
        }
        dev.epro.r0.B2825725843028148090 b2825725843028148090 = (dev.epro.r0.B2825725843028148090) obj;
        if (!this.a.equals(b2825725843028148090.a) || !this.b.equals(b2825725843028148090.b) || !this.c.equals(b2825725843028148090.c)) {
            return false;
        }
        android.os.IBinder iBinder = b2825725843028148090.d;
        android.os.IBinder iBinder2 = this.d;
        return iBinder2 == null ? iBinder == null : iBinder2.equals(iBinder);
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        android.os.IBinder iBinder = this.d;
        return (iBinder == null ? 0 : iBinder.hashCode()) ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        java.lang.String string = this.c.toString();
        java.lang.String strValueOf = java.lang.String.valueOf(this.d);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HsdpPrewarmRequest{targetAppPackageName=");
        sb.append(this.a);
        sb.append(", referrer=");
        dev.epro.r0.G6547577305291411977.B(sb, this.b, ", extraQueryParams=", string, ", windowToken=");
        return dev.epro.r0.G6547577305291411977.u(sb, strValueOf, "}");
    }
}
