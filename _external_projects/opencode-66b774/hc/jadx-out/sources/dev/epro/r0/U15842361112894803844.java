package dev.epro.r0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U15842361112894803844 extends N7756202525712935399 {
    public static final U15842361112894803844 e = new U15842361112894803844(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public U15842361112894803844(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // dev.epro.r0.N7756202525712935399, dev.epro.r0.H9330595680939527366
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final Object[] c() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        U15853425786981391261.w(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final int i() {
        return this.d;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final int j() {
        return 0;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
