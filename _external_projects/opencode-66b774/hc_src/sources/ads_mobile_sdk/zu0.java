package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class zu0 extends pu0 {
    public final int c;
    public final String d;
    public final String e;

    public zu0(int i, String str, String str2) {
        super(5);
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu0)) {
            return false;
        }
        zu0 zu0Var = (zu0) obj;
        return this.c == zu0Var.c && S10823041268949770285.t(this.d, zu0Var.d) && S10823041268949770285.t(this.e, zu0Var.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.c) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebError(errorCode=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", failingUrl=");
        return G6547577305291411977.u(sb, this.e, ")");
    }
}
