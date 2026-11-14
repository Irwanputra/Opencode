package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A14883423086378219798 extends V9316690655140275436 {
    public static final Object[] l;
    public static final A14883423086378219798 m;
    public final transient Object[] g;
    public final transient int h;
    public final transient Object[] i;
    public final transient int j;
    public final transient int k;

    static {
        Object[] objArr = new Object[0];
        l = objArr;
        m = new A14883423086378219798(0, 0, 0, objArr, objArr);
    }

    public A14883423086378219798(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super((byte) 2);
        this.g = objArr;
        this.h = i;
        this.i = objArr2;
        this.j = i2;
        this.k = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.i;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = rotateLeft & this.j;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i + 1;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        J13319129656433893658 j13319129656433893658 = this.e;
        if (j13319129656433893658 == null) {
            N985323811900954496 n985323811900954496 = J13319129656433893658.e;
            int i = this.k;
            j13319129656433893658 = i == 0 ? M3906571825257549980.h : new M3906571825257549980(i, this.g);
            this.e = j13319129656433893658;
        }
        return j13319129656433893658.listIterator(0);
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int j(Object[] objArr) {
        Object[] objArr2 = this.g;
        int i = this.k;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int k() {
        return this.k;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int m() {
        return 0;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final Object[] o() {
        return this.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.k;
    }
}
