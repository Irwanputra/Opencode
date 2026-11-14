package ads_mobile_sdk;

import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class t31 implements R16693852608535438299 {
    public final Map a;

    public t31(Map map) {
        map.getClass();
        this.a = map;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        Map<String, String> map = this.a;
        if (map.isEmpty()) {
            return;
        }
        p3477296814990354048.T1 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t31) && S10823041268949770285.t(this.a, ((t31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InMemorySdkCoreDataSignal(inMemorySdkCoreData=" + this.a + ")";
    }
}
