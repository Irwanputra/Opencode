package ads_mobile_sdk;

import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class v8 implements R16693852608535438299 {
    public final ArrayList a;

    public v8(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.P.addAll(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v8) && this.a.equals(((v8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdTypeSignal(adTypes=" + this.a + ")";
    }
}
