package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L11053642188676444705 extends X17453750288186724334 {
    public final /* synthetic */ AtomicReferenceArray g;

    public L11053642188676444705(long j, L11053642188676444705 l11053642188676444705, int i) {
        super(j, l11053642188676444705, i);
        this.g = new AtomicReferenceArray(Y10566681300840353022.f);
    }

    @Override // dev.epro.r0.X17453750288186724334
    public final int g() {
        return Y10566681300840353022.f;
    }

    @Override // dev.epro.r0.X17453750288186724334
    public final void h(int i, G8001132634698687269 g8001132634698687269) {
        this.g.set(i, Y10566681300840353022.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
