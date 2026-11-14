package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ue2 {
    public final String a;
    public final qw2 b;
    public final String c;

    public ue2(String str, qw2 qw2Var, String str2) {
        str.getClass();
        qw2Var.getClass();
        str2.getClass();
        this.a = str;
        this.b = qw2Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue2)) {
            return false;
        }
        ue2 ue2Var = (ue2) obj;
        return S10823041268949770285.t(this.a, ue2Var.a) && this.b == ue2Var.b && S10823041268949770285.t(this.c, ue2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistentCacheToken(filename=");
        sb.append(this.a);
        sb.append(", adFormat=");
        sb.append(this.b);
        sb.append(", adRequest=");
        return G6547577305291411977.u(sb, this.c, ")");
    }
}
