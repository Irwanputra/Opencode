package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 {
    public final String a;
    public final String b;

    public qw0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw0)) {
            return false;
        }
        qw0 qw0Var = (qw0) obj;
        return S10823041268949770285.t(this.a, qw0Var.a) && S10823041268949770285.t(this.b, qw0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return E12098517352909843120.m("SystemDefaultLocale(language=", this.a, ", country=", this.b, ")");
    }
}
