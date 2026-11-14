package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D11771291342654552486 implements R4833348786910499294, B10350247327218861320 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(D11771291342654552486.class, Object.class, "result");
    public final R4833348786910499294 a;
    private volatile Object result;

    public D11771291342654552486(R4833348786910499294 r4833348786910499294) {
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        this.a = r4833348786910499294;
        this.result = z3437138737604933638;
    }

    @Override // dev.epro.r0.B10350247327218861320
    public final B10350247327218861320 getCallerFrame() {
        R4833348786910499294 r4833348786910499294 = this.a;
        if (r4833348786910499294 instanceof B10350247327218861320) {
            return (B10350247327218861320) r4833348786910499294;
        }
        return null;
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        return this.a.getContext();
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final void resumeWith(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        while (true) {
            Object obj2 = this.result;
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.b;
            if (obj2 == z3437138737604933638) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, z3437138737604933638, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != z3437138737604933638) {
                        break;
                    }
                }
                return;
            }
            Z3437138737604933638 z34371387376049336382 = Z3437138737604933638.a;
            if (obj2 != z34371387376049336382) {
                S10973172697741180971.m("Already resumed");
                return;
            }
            Z3437138737604933638 z34371387376049336383 = Z3437138737604933638.c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, z34371387376049336382, z34371387376049336383)) {
                if (atomicReferenceFieldUpdater.get(this) != z34371387376049336382) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
