package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bn0 {
    public final String a;
    public final String b;
    public final String c;

    public bn0(String str, String str2, String str3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0)) {
            return false;
        }
        bn0 bn0Var = (bn0) obj;
        return S10823041268949770285.t(this.a, bn0Var.a) && S10823041268949770285.t(this.b, bn0Var.b) && S10823041268949770285.t(this.c, bn0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return G6547577305291411977.u(G6547577305291411977.y("FirebaseAnalyticsIds(firebaseAppId=", this.a, ", firebaseAppInstanceId=", this.b, ", firebaseAdEventId="), this.c, ")");
    }
}
