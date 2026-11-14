package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.g6;
import ads_mobile_sdk.gn1;
import ads_mobile_sdk.vr0;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C7584963549263810245 extends au0 {
    public final void c(String str) {
        Objects.requireNonNull(str);
        b();
        ((vr0) this.b).q().remove(str);
    }

    public final void d(String str, g6 g6Var) {
        Objects.requireNonNull(str);
        b();
        ((vr0) this.b).q().put(str, g6Var);
    }

    public final Map e() {
        gn1 gn1Var;
        gn1Var = ((vr0) this.b).adResponseLists_;
        return Collections.unmodifiableMap(Collections.unmodifiableMap(gn1Var));
    }
}
