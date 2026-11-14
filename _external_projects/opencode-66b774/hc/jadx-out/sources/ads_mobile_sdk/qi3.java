package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qi3 {
    public final UUID a;
    public final cc2[] b;

    public qi3(UUID uuid, cc2[] cc2VarArr) {
        cc2VarArr.getClass();
        this.a = uuid;
        this.b = cc2VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi3)) {
            return false;
        }
        qi3 qi3Var = (qi3) obj;
        return this.a.equals(qi3Var.a) && S10823041268949770285.t(this.b, qi3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TraceSnapshot(rootTraceId=" + this.a + ", perTraceMeta=" + Arrays.toString(this.b) + ")";
    }
}
