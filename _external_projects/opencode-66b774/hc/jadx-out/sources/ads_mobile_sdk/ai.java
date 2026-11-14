package ads_mobile_sdk;

import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.R4833348786910499294;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ai implements K4548097313143615345 {
    public final g0 a;

    public ai(g0 g0Var) {
        g0Var.getClass();
        this.a = g0Var;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* JADX INFO: renamed from: a */
    public final cw0 mo19a() {
        return cw0.APP_OPEN;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        boolean z;
        g0 g0Var = this.a;
        synchronized (g0Var) {
            z = g0Var.n;
        }
        return new xu0(new zh(z));
    }
}
