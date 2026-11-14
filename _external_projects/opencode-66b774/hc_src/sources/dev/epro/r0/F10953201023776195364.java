package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F10953201023776195364 extends Z8594524026390833435 {
    public static final F10953201023776195364 h = new F10953201023776195364(0, new Object[0]);
    public final transient Object[] f;
    public final transient int g;

    public F10953201023776195364(int i, Object[] objArr) {
        super((byte) 1);
        this.f = objArr;
        this.g = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        E10717724117948616506.q(i, this.g);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final Object[] l() {
        return this.f;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int m() {
        return 0;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int n() {
        return this.g;
    }

    @Override // dev.epro.r0.Z8594524026390833435, dev.epro.r0.G10942763614670705019
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.g;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
