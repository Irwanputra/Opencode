package ads_mobile_sdk;

import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xu0 implements M16184408391440927034 {
    public final Object b;

    public xu0(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xu0) && S10823041268949770285.t(this.b, ((xu0) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.b + ")";
    }
}
