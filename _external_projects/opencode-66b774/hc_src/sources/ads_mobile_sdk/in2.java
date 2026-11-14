package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.K2042933864045806308;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.V16504496955554646429;
import dev.epro.r0.W4415201450379021245;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class in2 extends j implements RandomAccess, Serializable {
    public static final Object[] d;
    public static final in2 e;
    public Object[] b;
    public int c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        e = new in2(objArr, 0, false);
    }

    public in2(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override // dev.epro.r0.O6641393078261985068
    public final O6641393078261985068 a(int i) {
        if (i >= this.c) {
            return new in2(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        K2042933864045806308.h();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a$1();
        if (i < 0 || i > (i2 = this.c)) {
            W4415201450379021245.a(c(i));
            return;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[V16504496955554646429.a(objArr.length)];
            System.arraycopy(this.b, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    public final String c(int i) {
        return E12098517352909843120.l("Index:", i, this.c, ", Size:");
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int i = this.c;
            if (i == list.size()) {
                if (!(obj instanceof in2)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.b[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                in2 in2Var = (in2) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.b[i3].equals(in2Var.b[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i];
        }
        W4415201450379021245.a(c(i));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.c;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + this.b[i3].hashCode();
        }
        return i2;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        a$1();
        if (i < 0 || i >= (i2 = this.c)) {
            W4415201450379021245.a(c(i));
            return null;
        }
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a$1();
        if (i < 0 || i >= this.c) {
            W4415201450379021245.a(c(i));
            return null;
        }
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a$1();
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(this.b, V16504496955554646429.a(objArr.length));
            this.b = objArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
