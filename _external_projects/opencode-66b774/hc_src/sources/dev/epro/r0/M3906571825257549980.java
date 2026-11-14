package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M3906571825257549980 extends J13319129656433893658 {
    public static final M3906571825257549980 h = new M3906571825257549980(0, new Object[0]);
    public final transient Object[] f;
    public final transient int g;

    public M3906571825257549980(int i, Object[] objArr) {
        super((byte) 2);
        this.f = objArr;
        this.g = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        P1789376955961125859.m(i, this.g);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // dev.epro.r0.J13319129656433893658, dev.epro.r0.G10942763614670705019
    public final int j(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.g;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int k() {
        return this.g;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int m() {
        return 0;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final Object[] o() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
