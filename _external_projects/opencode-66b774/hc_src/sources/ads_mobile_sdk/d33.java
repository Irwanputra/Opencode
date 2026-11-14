package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class d33 {
    public final v23 a;
    public final z23 b;
    public final boolean c;
    public final ue2 d;

    public d33(v23 v23Var, z23 z23Var, boolean z, ue2 ue2Var) {
        z23Var.getClass();
        this.a = v23Var;
        this.b = z23Var;
        this.c = z;
        this.d = ue2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d33)) {
            return false;
        }
        d33 d33Var = (d33) obj;
        return S10823041268949770285.t(this.a, d33Var.a) && S10823041268949770285.t(this.b, d33Var.b) && this.c == d33Var.c && S10823041268949770285.t(this.d, d33Var.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ue2 ue2Var = this.d;
        return i2 + (ue2Var == null ? 0 : ue2Var.hashCode());
    }

    public final String toString() {
        return "ServerTransaction(serverRequest=" + this.a + ", serverResponse=" + this.b + ", isFromPersistentCache=" + this.c + ", persistentCacheToken=" + this.d + ")";
    }
}
