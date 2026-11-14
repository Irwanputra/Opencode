package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class wu0 extends ads_mobile_sdk.pu0 {
    public final java.lang.String c;

    public wu0(java.lang.String str) {
        super(5);
        this.c = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.wu0) && this.c.equals(((ads_mobile_sdk.wu0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.s("RedirectLimitError(message=", this.c, ")");
    }
}
