package dev.epro.r0;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J12573461487805533470 extends G10942763614670705019 implements Set {
    public static final Object[] h;
    public static final J12573461487805533470 i;
    public transient I1430064897078411404 e;
    public final transient Object[] f;
    public final transient Object[] g;

    static {
        Object[] objArr = new Object[0];
        h = objArr;
        i = new J12573461487805533470(objArr, objArr);
    }

    public J12573461487805533470(Object[] objArr, Object[] objArr2) {
        super((byte) 0);
        this.f = objArr;
        this.g = objArr2;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int a(Object[] objArr) {
        System.arraycopy(this.f, 0, objArr, 0, 0);
        return 0;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int b() {
        return 0;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final Object[] i() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        I1430064897078411404 i1430064897078411404 = this.e;
        if (i1430064897078411404 == null) {
            U16122055668975483727 u16122055668975483727 = C12135989508407940960.e;
            i1430064897078411404 = I1430064897078411404.g;
            this.e = i1430064897078411404;
        }
        return i1430064897078411404.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
