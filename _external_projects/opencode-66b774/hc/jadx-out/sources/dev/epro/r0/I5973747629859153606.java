package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I5973747629859153606 extends O8620973563946607355 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f296o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;

    public I5973747629859153606(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f296o = atomicReferenceFieldUpdater;
        this.p = atomicReferenceFieldUpdater2;
        this.q = atomicReferenceFieldUpdater3;
        this.r = atomicReferenceFieldUpdater4;
        this.s = atomicReferenceFieldUpdater5;
    }

    @Override // dev.epro.r0.O8620973563946607355
    public final void S(G10471708993481961957 g10471708993481961957, G10471708993481961957 g104717089934819619572) {
        this.p.lazySet(g10471708993481961957, g104717089934819619572);
    }

    @Override // dev.epro.r0.O8620973563946607355
    public final void T(G10471708993481961957 g10471708993481961957, Thread thread) {
        this.f296o.lazySet(g10471708993481961957, thread);
    }

    @Override // dev.epro.r0.O8620973563946607355
    public final boolean t(P16078978668947144669 p16078978668947144669, H3067108644890218695 h3067108644890218695, H3067108644890218695 h30671086448902186952) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(p16078978668947144669, h3067108644890218695, h30671086448902186952)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p16078978668947144669) == h3067108644890218695);
        return false;
    }

    @Override // dev.epro.r0.O8620973563946607355
    public final boolean u(P16078978668947144669 p16078978668947144669, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(p16078978668947144669, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p16078978668947144669) == obj);
        return false;
    }

    @Override // dev.epro.r0.O8620973563946607355
    public final boolean v(P16078978668947144669 p16078978668947144669, G10471708993481961957 g10471708993481961957, G10471708993481961957 g104717089934819619572) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(p16078978668947144669, g10471708993481961957, g104717089934819619572)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p16078978668947144669) == g10471708993481961957);
        return false;
    }
}
