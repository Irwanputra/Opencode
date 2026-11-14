package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 extends pu0 {
    public final int c;
    public final String d;

    public ru0(String str, int i) {
        super(5);
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0)) {
            return false;
        }
        ru0 ru0Var = (ru0) obj;
        return this.c == ru0Var.c && S10823041268949770285.t(this.d, ru0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.c) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HttpError(responseCode=" + this.c + ", responseMessage=" + this.d + ")";
    }
}
