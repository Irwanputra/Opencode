package dev.epro.r0;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M15067098841499153540 extends H10977569097456317418 implements RandomAccess, D7322335987077648503 {
    public static final int[] d;
    public static final M15067098841499153540 e;
    public int[] b;
    public int c;

    static {
        int[] iArr = new int[0];
        d = iArr;
        e = new M15067098841499153540(iArr, 0, false);
    }

    public M15067098841499153540(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            W4415201450379021245.a(E12098517352909843120.l("Index:", i, this.c, ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[E12098517352909843120.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i3, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = iIntValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // dev.epro.r0.H10977569097456317418, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = W16701142256148280421.a;
        collection.getClass();
        if (!(collection instanceof M15067098841499153540)) {
            return super.addAll(collection);
        }
        M15067098841499153540 m15067098841499153540 = (M15067098841499153540) collection;
        int i = m15067098841499153540.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.b;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.b = iArrCopyOf;
        }
        System.arraycopy(m15067098841499153540.b, 0, iArrCopyOf, this.c, m15067098841499153540.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int b(int i) {
        c(i);
        return this.b[i];
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            W4415201450379021245.a(E12098517352909843120.l("Index:", i, this.c, ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // dev.epro.r0.H10977569097456317418, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M15067098841499153540)) {
            return super.equals(obj);
        }
        M15067098841499153540 m15067098841499153540 = (M15067098841499153540) obj;
        if (this.c == m15067098841499153540.c) {
            int[] iArr = m15067098841499153540.b;
            for (int i = 0; i < this.c; i++) {
                if (this.b[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // dev.epro.r0.K5888984147544128677
    public final /* bridge */ /* synthetic */ K5888984147544128677 g(int i) {
        if (i >= this.c) {
            return new M15067098841499153540(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        K2042933864045806308.h();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Integer.valueOf(this.b[i]);
    }

    @Override // dev.epro.r0.H10977569097456317418, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // dev.epro.r0.H10977569097456317418, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        c(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            W4415201450379021245.a("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i2, iArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        c(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        int i = this.c;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i == length) {
            iArr = new int[E12098517352909843120.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, iArr, 0, this.c);
            this.b = iArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        iArr[i2] = iIntValue;
        return true;
    }
}
