package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V1540328691236583783 extends T18016951143603335921 {
    public final AtomicReferenceFieldUpdater T;
    public final AtomicReferenceFieldUpdater U;
    public final AtomicReferenceFieldUpdater V;
    public final AtomicReferenceFieldUpdater W;
    public final AtomicReferenceFieldUpdater X;

    public V1540328691236583783(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.T = atomicReferenceFieldUpdater;
        this.U = atomicReferenceFieldUpdater2;
        this.V = atomicReferenceFieldUpdater3;
        this.W = atomicReferenceFieldUpdater4;
        this.X = atomicReferenceFieldUpdater5;
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final G5604827203694114189 E(R4225980552687347745 r4225980552687347745) {
        return (G5604827203694114189) this.W.getAndSet(r4225980552687347745, G5604827203694114189.d);
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final R14797178970429462271 F(R4225980552687347745 r4225980552687347745) {
        return (R14797178970429462271) this.V.getAndSet(r4225980552687347745, R14797178970429462271.c);
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final void U(R14797178970429462271 r14797178970429462271, R14797178970429462271 r147971789704294622712) {
        this.U.lazySet(r14797178970429462271, r147971789704294622712);
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final void V(R14797178970429462271 r14797178970429462271, Thread thread) {
        this.T.lazySet(r14797178970429462271, thread);
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final boolean v(R4225980552687347745 r4225980552687347745, G5604827203694114189 g5604827203694114189, G5604827203694114189 g56048272036941141892) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.W;
            if (atomicReferenceFieldUpdater.compareAndSet(r4225980552687347745, g5604827203694114189, g56048272036941141892)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r4225980552687347745) == g5604827203694114189);
        return false;
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final boolean w(R4225980552687347745 r4225980552687347745, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.X;
            if (atomicReferenceFieldUpdater.compareAndSet(r4225980552687347745, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r4225980552687347745) == obj);
        return false;
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final boolean x(R4225980552687347745 r4225980552687347745, R14797178970429462271 r14797178970429462271, R14797178970429462271 r147971789704294622712) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.V;
            if (atomicReferenceFieldUpdater.compareAndSet(r4225980552687347745, r14797178970429462271, r147971789704294622712)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r4225980552687347745) == r14797178970429462271);
        return false;
    }
}
