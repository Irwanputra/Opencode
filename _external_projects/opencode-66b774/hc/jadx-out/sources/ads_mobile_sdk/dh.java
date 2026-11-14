package ads_mobile_sdk;

import dev.epro.r0.G16562784700295586616;
import dev.epro.r0.J4422749016291691854;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class dh implements G16562784700295586616 {
    public final ed1 a;
    public final J4422749016291691854 b;
    public final AtomicBoolean c;

    public dh(ed1 ed1Var, J4422749016291691854 j4422749016291691854) {
        ed1Var.getClass();
        j4422749016291691854.getClass();
        this.a = ed1Var;
        this.b = j4422749016291691854;
        this.c = new AtomicBoolean(false);
    }

    @Override // dev.epro.r0.G16562784700295586616
    public final Object a(qo3 qo3Var, R4833348786910499294 r4833348786910499294) {
        if (qo3Var.b && this.c.compareAndSet(false, true) && this.a.i().u) {
            this.b.d();
        }
        return O9245300239821758723.a;
    }
}
