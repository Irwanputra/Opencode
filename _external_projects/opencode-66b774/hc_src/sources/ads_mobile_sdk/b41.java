package ads_mobile_sdk;

import dev.epro.r0.M9197813449740923653;
import dev.epro.r0.V10300877997588547986;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class b41 {
    public volatile V10300877997588547986 a;

    public final V10300877997588547986 a() {
        V10300877997588547986 v10300877997588547986 = this.a;
        if (v10300877997588547986 == null) {
            M9197813449740923653 m9197813449740923653 = xv.f4a;
            IllegalStateException illegalStateException = new IllegalStateException("InitializationConfig is requested but null. MobileAds.initialize() must be called first.");
            ci3 ci3Var = xv.a;
            if (ci3Var != null) {
                ci3Var.a("InitializationConfig is requested but null. MobileAds.initialize() must be called first.", (Throwable) illegalStateException);
            }
        }
        return v10300877997588547986;
    }
}
