package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U4857089234315512256;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class v23 {
    public final U4857089234315512256 a;

    public v23(U4857089234315512256 u4857089234315512256) {
        u4857089234315512256.getClass();
        this.a = u4857089234315512256;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v23) && S10823041268949770285.t(this.a, ((v23) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ServerRequest(baseRequest=" + this.a + ")";
    }
}
