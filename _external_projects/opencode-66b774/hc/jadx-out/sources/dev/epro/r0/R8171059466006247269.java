package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R8171059466006247269 extends A314510841421691141 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // dev.epro.r0.A314510841421691141
    public final boolean a(T8224077743602349830 t8224077743602349830) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(D15913187640519482289.f);
        return true;
    }

    @Override // dev.epro.r0.A314510841421691141
    public final R4833348786910499294[] b(T8224077743602349830 t8224077743602349830) {
        this.a.set(null);
        return K5751602218013079365.a;
    }
}
