package ads_mobile_sdk;

import dev.epro.r0.B8669154544800329371;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qo implements B8669154544800329371 {
    public final WeakReference a;
    public final g0 b;

    public qo(WeakReference weakReference, g0 g0Var) {
        this.a = weakReference;
        this.b = g0Var;
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object b(long j, R14062301455140331524 r14062301455140331524) {
        uo uoVar = (uo) this.a.get();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (uoVar != null) {
            uoVar.b(j, r14062301455140331524);
            return o9245300239821758723;
        }
        this.b.a(this);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object d(long j, R14062301455140331524 r14062301455140331524) {
        uo uoVar = (uo) this.a.get();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (uoVar != null) {
            uoVar.d(j, r14062301455140331524);
            return o9245300239821758723;
        }
        this.b.a(this);
        return o9245300239821758723;
    }
}
