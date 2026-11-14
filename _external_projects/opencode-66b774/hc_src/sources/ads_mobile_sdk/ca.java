package ads_mobile_sdk;

import dev.epro.r0.G16562784700295586616;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ca implements G16562784700295586616 {
    public final y2 a;
    public final AtomicBoolean b;

    public ca(y2 y2Var) {
        y2Var.getClass();
        this.a = y2Var;
        this.b = new AtomicBoolean(false);
    }

    @Override // dev.epro.r0.G16562784700295586616
    public final Object a(qo3 qo3Var, R4833348786910499294 r4833348786910499294) {
        boolean z = qo3Var.b;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (z && this.b.compareAndSet(false, true)) {
            this.a.q(r4833348786910499294);
        }
        return o9245300239821758723;
    }
}
