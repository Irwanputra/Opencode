package dev.epro.r0;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P654724823615270050 extends Z860808776098365610 {

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f435o;
    public final AtomicIntegerFieldUpdater p;

    public P654724823615270050(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f435o = atomicReferenceFieldUpdater;
        this.p = atomicIntegerFieldUpdater;
    }

    @Override // dev.epro.r0.Z860808776098365610
    public final void w(T12670249092619324354 t12670249092619324354, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f435o;
            if (atomicReferenceFieldUpdater.compareAndSet(t12670249092619324354, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(t12670249092619324354) == null);
    }

    @Override // dev.epro.r0.Z860808776098365610
    public final int y(T12670249092619324354 t12670249092619324354) {
        return this.p.decrementAndGet(t12670249092619324354);
    }
}
