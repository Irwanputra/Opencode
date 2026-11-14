package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.g1;
import ads_mobile_sdk.gn1;
import ads_mobile_sdk.vr0;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S2322588539201815831 extends au0 {
    public final void c(String str) {
        Objects.requireNonNull(str);
        b();
        ((g1) this.b).s().remove(str);
    }

    public final void d(String str, vr0 vr0Var) {
        Objects.requireNonNull(str);
        b();
        ((g1) this.b).s().put(str, vr0Var);
    }

    public final Map e() {
        gn1 gn1Var;
        gn1Var = ((g1) this.b).pools_;
        return Collections.unmodifiableMap(Collections.unmodifiableMap(gn1Var));
    }
}
