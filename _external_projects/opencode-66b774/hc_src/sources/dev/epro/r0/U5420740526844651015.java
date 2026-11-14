package dev.epro.r0;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U5420740526844651015 extends AbstractSet implements Serializable {
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient int d;
    public transient int e;

    public static U5420740526844651015 a() {
        U5420740526844651015 u5420740526844651015 = new U5420740526844651015();
        u5420740526844651015.d = M18113111391818111737.z(3, 1);
        return u5420740526844651015;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int min;
        char c = 31;
        if (c()) {
            U15853425786981391261.C("Arrays already allocated", c());
            int i = this.d;
            int d0 = D15445857918358799638.d0(i);
            this.a = D15445857918358799638.B(d0);
            this.d = D15445857918358799638.S(this.d, 32 - Integer.numberOfLeadingZeros(d0 - 1), 31);
            this.b = new int[i];
            this.c = new Object[i];
        }
        Set b = b();
        if (b != null) {
            return b.add(obj);
        }
        int[] j = j();
        Object[] i2 = i();
        int i3 = this.e;
        int i4 = i3 + 1;
        int R = U16229988784104357932.R(obj);
        int i5 = (1 << (this.d & 31)) - 1;
        int i6 = R & i5;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int b0 = D15445857918358799638.b0(i6, obj2);
        if (b0 != 0) {
            int i7 = ~i5;
            int i8 = R & i7;
            int i9 = 0;
            while (true) {
                int i10 = b0 - 1;
                int i11 = j[i10];
                char c2 = c;
                if ((i11 & i7) == i8 && M2066880349381062048.A(obj, i2[i10])) {
                    return false;
                }
                int i12 = i11 & i5;
                i9++;
                if (i12 != 0) {
                    b0 = i12;
                    c = c2;
                } else {
                    if (i9 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.d & 31), 1.0f);
                        int i13 = isEmpty() ? -1 : 0;
                        while (i13 >= 0) {
                            linkedHashSet.add(i()[i13]);
                            i13++;
                            if (i13 >= this.e) {
                                i13 = -1;
                            }
                        }
                        this.a = linkedHashSet;
                        this.b = null;
                        this.c = null;
                        this.d += 32;
                        return linkedHashSet.add(obj);
                    }
                    if (i4 > i5) {
                        i5 = k(i5, D15445857918358799638.T(i5), R, i3);
                    } else {
                        j[i10] = D15445857918358799638.S(i11, i4, i5);
                    }
                }
            }
        } else if (i4 > i5) {
            i5 = k(i5, D15445857918358799638.T(i5), R, i3);
        } else {
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            D15445857918358799638.c0(i6, i4, obj3);
        }
        int length = j().length;
        if (i4 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(j(), min);
            this.c = Arrays.copyOf(i(), min);
        }
        j()[i3] = D15445857918358799638.S(R, 0, i5);
        i()[i3] = obj;
        this.e = i4;
        this.d += 32;
        return true;
    }

    public final Set b() {
        Object obj = this.a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final boolean c() {
        return this.a == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (c()) {
            return;
        }
        this.d += 32;
        Set b = b();
        if (b != null) {
            this.d = M18113111391818111737.z(size(), 3);
            b.clear();
            this.a = null;
            this.e = 0;
            return;
        }
        Arrays.fill(i(), 0, this.e, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (c()) {
            return false;
        }
        Set b = b();
        if (b != null) {
            return b.contains(obj);
        }
        int R = U16229988784104357932.R(obj);
        int i = (1 << (this.d & 31)) - 1;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int b0 = D15445857918358799638.b0(R & i, obj2);
        if (b0 == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = R & i2;
        do {
            int i4 = b0 - 1;
            int i5 = j()[i4];
            if ((i5 & i2) == i3 && M2066880349381062048.A(obj, i()[i4])) {
                return true;
            }
            b0 = i5 & i;
        } while (b0 != 0);
        return false;
    }

    public final Object[] i() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set b = b();
        return b != null ? b.iterator() : new X5270663186006261488(this);
    }

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object B = D15445857918358799638.B(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            D15445857918358799638.c0(i3 & i5, i4 + 1, B);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] j = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int b0 = D15445857918358799638.b0(i6, obj);
            while (b0 != 0) {
                int i7 = b0 - 1;
                int i8 = j[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int b02 = D15445857918358799638.b0(i10, B);
                D15445857918358799638.c0(i10, b0, B);
                j[i7] = D15445857918358799638.S(i9, b02, i5);
                b0 = i8 & i;
            }
        }
        this.a = B;
        this.d = D15445857918358799638.S(this.d, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!c()) {
            Set b = b();
            if (b != null) {
                return b.remove(obj);
            }
            int i3 = (1 << (this.d & 31)) - 1;
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int V = D15445857918358799638.V(obj, null, i3, obj2, j(), i(), null);
            if (V != -1) {
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                int[] j = j();
                Object[] i4 = i();
                int size = size();
                int i5 = size - 1;
                if (V < i5) {
                    Object obj4 = i4[i5];
                    i4[V] = obj4;
                    i4[i5] = null;
                    j[V] = j[i5];
                    j[i5] = 0;
                    int R = U16229988784104357932.R(obj4) & i3;
                    int b0 = D15445857918358799638.b0(R, obj3);
                    if (b0 == size) {
                        D15445857918358799638.c0(R, V + 1, obj3);
                    } else {
                        while (true) {
                            i = b0 - 1;
                            i2 = j[i];
                            int i6 = i2 & i3;
                            if (i6 == size) {
                                break;
                            }
                            b0 = i6;
                        }
                        j[i] = D15445857918358799638.S(i2, V + 1, i3);
                    }
                } else {
                    i4[V] = null;
                    j[V] = 0;
                }
                this.e--;
                this.d += 32;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set b = b();
        return b != null ? b.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (c()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set b = b();
        if (b != null) {
            return b.toArray(objArr);
        }
        Object[] i = i();
        int i2 = this.e;
        U15853425786981391261.B(0, i2, i.length);
        if (objArr.length < i2) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i2);
        } else if (objArr.length > i2) {
            objArr[i2] = null;
        }
        System.arraycopy(i, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (c()) {
            return new Object[0];
        }
        Set b = b();
        return b != null ? b.toArray() : Arrays.copyOf(i(), this.e);
    }
}
