package dev.epro.r0;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S17075056514715236939 implements K7493131619793429513, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(S17075056514715236939.class, Object.class, "b");
    public volatile B13729205492206812220 a;
    public volatile Object b;

    @Override // dev.epro.r0.K7493131619793429513
    public final Object getValue() {
        Object obj = this.b;
        N5158094851646208854 n5158094851646208854 = N5158094851646208854.q;
        if (obj != n5158094851646208854) {
            return obj;
        }
        B13729205492206812220 b13729205492206812220 = this.a;
        if (b13729205492206812220 != null) {
            Object objInvoke = b13729205492206812220.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, n5158094851646208854, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != n5158094851646208854) {
                }
            }
            this.a = null;
            return objInvoke;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != N5158094851646208854.q ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
