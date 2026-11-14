package dev.epro.r0;

import java.util.AbstractList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A16630659125393700025 extends R5425141374325592367 {
    public static final A16630659125393700025 d;
    public Object[] b;
    public int c;

    static {
        A16630659125393700025 a16630659125393700025 = new A16630659125393700025(0, new Object[0]);
        d = a16630659125393700025;
        a16630659125393700025.a = false;
    }

    public A16630659125393700025(int i, Object[] objArr) {
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            D11988991656201568495.i(this.c, E12098517352909843120.q(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // dev.epro.r0.R5425141374325592367
    public final R5425141374325592367 b(int i) {
        if (i >= this.c) {
            return new A16630659125393700025(this.c, Arrays.copyOf(this.b, i));
        }
        K2042933864045806308.h();
        return null;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            D11988991656201568495.i(this.c, E12098517352909843120.q(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.b[i];
    }

    @Override // dev.epro.r0.R5425141374325592367, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // dev.epro.r0.R5425141374325592367, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.c;
        Object[] objArrCopyOf = this.b;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, ((i * 3) / 2) + 1);
            this.b = objArrCopyOf;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
