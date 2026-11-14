package ads_mobile_sdk;

import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class x23 {
    public final String a;
    public final I16631908410500040363 b;

    public x23(I16631908410500040363 i16631908410500040363, String str) {
        this.a = str;
        this.b = i16631908410500040363;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x23)) {
            return false;
        }
        x23 x23Var = (x23) obj;
        return this.a.equals(x23Var.a) && S10823041268949770285.t(this.b, x23Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        I16631908410500040363 i16631908410500040363 = this.b;
        return iHashCode + (i16631908410500040363 == null ? 0 : i16631908410500040363.a.hashCode());
    }

    public final String toString() {
        return "Action(name=" + this.a + ", info=" + this.b + ")";
    }
}
