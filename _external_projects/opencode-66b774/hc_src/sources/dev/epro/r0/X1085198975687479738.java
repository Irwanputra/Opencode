package dev.epro.r0;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X1085198975687479738 extends K14749510448791472029 {
    public P14960607863193493823 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ConstraintTrackingWorker v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1085198975687479738(ConstraintTrackingWorker constraintTrackingWorker, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.v = constraintTrackingWorker;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(this);
    }
}
