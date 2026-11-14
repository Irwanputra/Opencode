package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z12395694190652584839 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public Z12395694190652584839(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z12395694190652584839)) {
            return false;
        }
        Z12395694190652584839 z12395694190652584839 = (Z12395694190652584839) obj;
        return S10823041268949770285.t(this.a, z12395694190652584839.a) && S10823041268949770285.t(this.b, z12395694190652584839.b) && this.c.equals(z12395694190652584839.c) && this.d.equals(z12395694190652584839.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + E12098517352909843120.h(E12098517352909843120.h(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return G6547577305291411977.w(G6547577305291411977.y("LiteVpnCredentials(username=", this.a, ", password=", this.b, ", proxyUsername="), this.c, ", proxyPassword=", this.d, ")");
    }
}
