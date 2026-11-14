package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 {
    public final String a;
    public final String b;

    public tf1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf1)) {
            return false;
        }
        tf1 tf1Var = (tf1) obj;
        return this.a.equals(tf1Var.a) && this.b.equals(tf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return E12098517352909843120.m("InternalMuteThisAdReason(description=", this.a, ", muteUrl=", this.b, ")");
    }
}
