package dev.epro.r0;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z7116998279549816000 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ConstraintTrackingWorker u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z7116998279549816000(ConstraintTrackingWorker constraintTrackingWorker, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.u = constraintTrackingWorker;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.d(null, null, null, this);
    }
}
