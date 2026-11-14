package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.K2042933864045806308;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.V16504496955554646429;
import dev.epro.r0.W4415201450379021245;
import dev.epro.r0.Y16198579552193879165;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 extends j implements R17185427375111049466, RandomAccess, Y16198579552193879165 {
    public static final int[] d;
    public static final jb1 e;
    public int[] b;
    public int c;

    static {
        int[] iArr = new int[0];
        d = iArr;
        e = new jb1(iArr, 0, false);
    }

    public jb1(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        a$1();
        if (i < 0 || i > (i2 = this.c)) {
            W4415201450379021245.a(E12098517352909843120.l("Index:", i, this.c, ", Size:"));
            return;
        }
        int[] iArr = this.b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[V16504496955554646429.a(iArr.length)];
            System.arraycopy(this.b, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i + 1, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = iIntValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a$1();
        byte[] bArr = rb1.a;
        collection.getClass();
        if (!(collection instanceof jb1)) {
            return super.addAll(collection);
        }
        jb1 jb1Var = (jb1) collection;
        int i = jb1Var.c;
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
        System.arraycopy(jb1Var.b, 0, iArrCopyOf, this.c, jb1Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        a$1();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            iArr = new int[V16504496955554646429.a(iArr.length)];
            System.arraycopy(this.b, 0, iArr, 0, this.c);
            this.b = iArr;
        }
        int i3 = this.c;
        this.c = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.c) {
            W4415201450379021245.a(E12098517352909843120.l("Index:", i, this.c, ", Size:"));
        }
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb1)) {
            return super.equals(obj);
        }
        jb1 jb1Var = (jb1) obj;
        if (this.c == jb1Var.c) {
            int[] iArr = jb1Var.b;
            for (int i = 0; i < this.c; i++) {
                if (this.b[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // dev.epro.r0.O6641393078261985068
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final jb1 a(int i) {
        if (i >= this.c) {
            return new jb1(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        K2042933864045806308.h();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Integer.valueOf(this.b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a$1();
        d(i);
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
        a$1();
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
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a$1();
        d(i);
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
        b(((Integer) obj).intValue());
        return true;
    }
}
