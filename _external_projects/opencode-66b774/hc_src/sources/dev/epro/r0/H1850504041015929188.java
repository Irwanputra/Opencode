package dev.epro.r0;

import ads_mobile_sdk.ap;
import ads_mobile_sdk.au0;
import ads_mobile_sdk.gn1;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H1850504041015929188 extends au0 {
    public final void c(boolean z) {
        int i;
        b();
        ap apVar = (ap) this.b;
        i = apVar.bitField0_;
        apVar.bitField0_ = i | 4;
        apVar.shouldCollectSignalsOnFullApp_ = z;
    }

    public final void d(boolean z) {
        int i;
        b();
        ap apVar = (ap) this.b;
        i = apVar.bitField0_;
        apVar.bitField0_ = i | 2;
        apVar.shouldGatherSignals_ = z;
    }

    public final Map e() {
        gn1 gn1Var;
        gn1Var = ((ap) this.b).serverParameters_;
        return Collections.unmodifiableMap(Collections.unmodifiableMap(gn1Var));
    }
}
