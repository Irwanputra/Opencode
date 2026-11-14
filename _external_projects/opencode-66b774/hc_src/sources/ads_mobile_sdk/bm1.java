package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bm1 {
    public final String a;
    public final ue2 b;
    public final boolean c;
    public final long d;

    public bm1(String str, ue2 ue2Var, boolean z, long j) {
        str.getClass();
        ue2Var.getClass();
        this.a = str;
        this.b = ue2Var;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm1)) {
            return false;
        }
        bm1 bm1Var = (bm1) obj;
        return S10823041268949770285.t(this.a, bm1Var.a) && S10823041268949770285.t(this.b, bm1Var.b) && this.c == bm1Var.c && this.d == bm1Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Long.hashCode(this.d) + ((hashCode + i) * 31);
    }

    public final String toString() {
        return "LoadedAd(ad=" + this.a + ", token=" + this.b + ", isFromPreviousSession=" + this.c + ", timeInCacheMs=" + this.d + ")";
    }
}
