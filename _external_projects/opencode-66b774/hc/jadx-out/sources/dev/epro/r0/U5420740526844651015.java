package dev.epro.r0;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        int iMin;
        char c = 31;
        if (c()) {
            U15853425786981391261.C("Arrays already allocated", c());
            int i = this.d;
            int iD0 = D15445857918358799638.d0(i);
            this.a = D15445857918358799638.B(iD0);
            this.d = D15445857918358799638.S(this.d, 32 - Integer.numberOfLeadingZeros(iD0 - 1), 31);
            this.b = new int[i];
            this.c = new Object[i];
        }
        Set setB = b();
        if (setB != null) {
            return setB.add(obj);
        }
        int[] iArrJ = j();
        Object[] objArrI = i();
        int i2 = this.e;
        int i3 = i2 + 1;
        int iR = U16229988784104357932.R(obj);
        int iK = (1 << (this.d & 31)) - 1;
        int i4 = iR & iK;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iB0 = D15445857918358799638.b0(i4, obj2);
        if (iB0 != 0) {
            int i5 = ~iK;
            int i6 = iR & i5;
            int i7 = 0;
            while (true) {
                int i8 = iB0 - 1;
                int i9 = iArrJ[i8];
                char c2 = c;
                if ((i9 & i5) == i6 && M2066880349381062048.A(obj, objArrI[i8])) {
                    return false;
                }
                int i10 = i9 & iK;
                i7++;
                if (i10 != 0) {
                    iB0 = i10;
                    c = c2;
                } else {
                    if (i7 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.d & 31), 1.0f);
                        int i11 = isEmpty() ? -1 : 0;
                        while (i11 >= 0) {
                            linkedHashSet.add(i()[i11]);
                            i11++;
                            if (i11 >= this.e) {
                                i11 = -1;
                            }
                        }
                        this.a = linkedHashSet;
                        this.b = null;
                        this.c = null;
                        this.d += 32;
                        return linkedHashSet.add(obj);
                    }
                    if (i3 > iK) {
                        iK = k(iK, D15445857918358799638.T(iK), iR, i2);
                    } else {
                        iArrJ[i8] = D15445857918358799638.S(i9, i3, iK);
                    }
                }
            }
        } else if (i3 > iK) {
            iK = k(iK, D15445857918358799638.T(iK), iR, i2);
        } else {
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            D15445857918358799638.c0(i4, i3, obj3);
        }
        int length = j().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(j(), iMin);
            this.c = Arrays.copyOf(i(), iMin);
        }
        j()[i2] = D15445857918358799638.S(iR, 0, iK);
        i()[i2] = obj;
        this.e = i3;
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
        Set setB = b();
        if (setB != null) {
            this.d = M18113111391818111737.z(size(), 3);
            setB.clear();
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
        Set setB = b();
        if (setB != null) {
            return setB.contains(obj);
        }
        int iR = U16229988784104357932.R(obj);
        int i = (1 << (this.d & 31)) - 1;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iB0 = D15445857918358799638.b0(iR & i, obj2);
        if (iB0 == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iR & i2;
        do {
            int i4 = iB0 - 1;
            int i5 = j()[i4];
            if ((i5 & i2) == i3 && M2066880349381062048.A(obj, i()[i4])) {
                return true;
            }
            iB0 = i5 & i;
        } while (iB0 != 0);
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
        Set setB = b();
        return setB != null ? setB.iterator() : new X5270663186006261488(this);
    }

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object objB = D15445857918358799638.B(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            D15445857918358799638.c0(i3 & i5, i4 + 1, objB);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iB0 = D15445857918358799638.b0(i6, obj);
            while (iB0 != 0) {
                int i7 = iB0 - 1;
                int i8 = iArrJ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iB02 = D15445857918358799638.b0(i10, objB);
                D15445857918358799638.c0(i10, iB0, objB);
                iArrJ[i7] = D15445857918358799638.S(i9, iB02, i5);
                iB0 = i8 & i;
            }
        }
        this.a = objB;
        this.d = D15445857918358799638.S(this.d, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!c()) {
            Set setB = b();
            if (setB != null) {
                return setB.remove(obj);
            }
            int i3 = (1 << (this.d & 31)) - 1;
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iV = D15445857918358799638.V(obj, null, i3, obj2, j(), i(), null);
            if (iV != -1) {
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                int[] iArrJ = j();
                Object[] objArrI = i();
                int size = size();
                int i4 = size - 1;
                if (iV < i4) {
                    Object obj4 = objArrI[i4];
                    objArrI[iV] = obj4;
                    objArrI[i4] = null;
                    iArrJ[iV] = iArrJ[i4];
                    iArrJ[i4] = 0;
                    int iR = U16229988784104357932.R(obj4) & i3;
                    int iB0 = D15445857918358799638.b0(iR, obj3);
                    if (iB0 == size) {
                        D15445857918358799638.c0(iR, iV + 1, obj3);
                    } else {
                        while (true) {
                            i = iB0 - 1;
                            i2 = iArrJ[i];
                            int i5 = i2 & i3;
                            if (i5 == size) {
                                break;
                            }
                            iB0 = i5;
                        }
                        iArrJ[i] = D15445857918358799638.S(i2, iV + 1, i3);
                    }
                } else {
                    objArrI[iV] = null;
                    iArrJ[iV] = 0;
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
        Set setB = b();
        return setB != null ? setB.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (c()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setB = b();
        if (setB != null) {
            return setB.toArray(objArr);
        }
        Object[] objArrI = i();
        int i = this.e;
        U15853425786981391261.B(0, i, objArrI.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrI, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (c()) {
            return new Object[0];
        }
        Set setB = b();
        return setB != null ? setB.toArray() : Arrays.copyOf(i(), this.e);
    }
}
