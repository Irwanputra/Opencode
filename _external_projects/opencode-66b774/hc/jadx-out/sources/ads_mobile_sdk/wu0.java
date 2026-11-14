package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class wu0 extends pu0 {
    public final String c;

    public wu0(String str) {
        super(5);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wu0) && this.c.equals(((wu0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return G6547577305291411977.s("RedirectLimitError(message=", this.c, ")");
    }
}
