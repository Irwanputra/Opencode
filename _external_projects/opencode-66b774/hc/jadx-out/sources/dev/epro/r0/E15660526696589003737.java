package dev.epro.r0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E15660526696589003737 extends N7756202525712935399 {
    public final transient Object[] c;
    public final transient boolean d;
    public final transient int e;

    /* JADX WARN: Multi-variable type inference failed */
    public E15660526696589003737(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        U15853425786981391261.w(i, this.e);
        Object obj = this.c[(i * 2) + (this.d ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
