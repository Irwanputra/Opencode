package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class s8 {
    public String b = "";
    public String c = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return S10823041268949770285.t(this.b, s8Var.b) && this.c.equals(s8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + H4776669175763245653.c(0, this.b);
    }

    public final String toString() {
        return E12098517352909843120.m("AdTraceMeta(impressionEarned=false, adTraceId=", this.b, ", backendQueryId=", this.c, ")");
    }
}
