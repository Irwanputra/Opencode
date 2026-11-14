package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q12373594814942395141 extends B401944902727389462 {
    public Q12373594814942395141(R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        if (r4833348786910499294 == null || r4833348786910499294.getContext() == I3826119971291161142.a) {
            return;
        }
        S10973172697741180971.j("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        return I3826119971291161142.a;
    }
}
