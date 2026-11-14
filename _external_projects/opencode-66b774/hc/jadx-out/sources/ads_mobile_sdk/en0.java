package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class en0 implements R16693852608535438299 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public en0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        if (this.e) {
            String str = this.a;
            if (str == null) {
                str = "";
            }
            p3477296814990354048.F0 = str;
            String str2 = this.b;
            if (str2 == null) {
                str2 = "";
            }
            p3477296814990354048.G0 = str2;
            String str3 = this.c;
            p3477296814990354048.H0 = str3 != null ? str3 : "";
            p3477296814990354048.I0 = this.d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en0)) {
            return false;
        }
        en0 en0Var = (en0) obj;
        return S10823041268949770285.t(this.a, en0Var.a) && S10823041268949770285.t(this.b, en0Var.b) && S10823041268949770285.t(this.c, en0Var.c) && S10823041268949770285.t(this.d, en0Var.d) && this.e == en0Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.e;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode4 + r3;
    }

    public final String toString() {
        StringBuilder sbY = G6547577305291411977.y("FirebaseAnalyticsSignal(firebaseAppId=", this.a, ", firebaseAppInstanceId=", this.b, ", firebaseAdEventId=");
        G6547577305291411977.B(sbY, this.c, ", firebaseAppIdOrigin=", this.d, ", isFirebaseIntegrationEnabled=");
        return E12098517352909843120.o(sbY, this.e, ")");
    }
}
