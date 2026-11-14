package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D11771291342654552486 implements dev.epro.r0.R4833348786910499294, dev.epro.r0.B10350247327218861320 {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(dev.epro.r0.D11771291342654552486.class, java.lang.Object.class, "result");
    public final dev.epro.r0.R4833348786910499294 a;
    private volatile java.lang.Object result;

    public D11771291342654552486(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        this.a = r4833348786910499294;
        this.result = z3437138737604933638;
    }

    @Override // dev.epro.r0.B10350247327218861320
    public final dev.epro.r0.B10350247327218861320 getCallerFrame() {
        dev.epro.r0.B10350247327218861320 b10350247327218861320 = this.a;
        if (b10350247327218861320 instanceof dev.epro.r0.B10350247327218861320) {
            return b10350247327218861320;
        }
        return null;
    }

    public final dev.epro.r0.G8001132634698687269 getContext() {
        return this.a.getContext();
    }

    public final void resumeWith(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        while (true) {
            java.lang.Object obj2 = this.result;
            dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.b;
            if (obj2 == z3437138737604933638) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, z3437138737604933638, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != z3437138737604933638) {
                        break;
                    }
                }
                return;
            }
            dev.epro.r0.Z3437138737604933638 z34371387376049336382 = dev.epro.r0.Z3437138737604933638.a;
            if (obj2 != z34371387376049336382) {
                dev.epro.r0.S10973172697741180971.m("Already resumed");
                return;
            }
            dev.epro.r0.Z3437138737604933638 z34371387376049336383 = dev.epro.r0.Z3437138737604933638.c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, z34371387376049336382, z34371387376049336383)) {
                if (atomicReferenceFieldUpdater.get(this) != z34371387376049336382) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final java.lang.String toString() {
        return "SafeContinuation for " + this.a;
    }
}
