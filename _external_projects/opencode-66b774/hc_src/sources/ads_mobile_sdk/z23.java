package ads_mobile_sdk;

import dev.epro.r0.I16631908410500040363;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class z23 {
    public final ArrayList a;
    public final hv b;
    public final ArrayList c;
    public I16631908410500040363 d;

    public z23(ArrayList arrayList, hv hvVar, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = hvVar;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z23)) {
            return false;
        }
        z23 z23Var = (z23) obj;
        return this.a.equals(z23Var.a) && this.b.equals(z23Var.b) && this.c.equals(z23Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ServerResponse(adConfigurations=" + this.a + ", commonConfiguration=" + this.b + ", actions=" + this.c + ")";
    }
}
