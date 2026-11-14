package dev.epro.r0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J15049672055732829618 extends E2168127913664336368 implements Collection, S3000285732458222736 {
    public A4783298371339261043 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public J3301701597851028733 e = new J3301701597851028733(17);
    public Object[] f;
    public Object[] g;
    public int h;

    public J15049672055732829618(A4783298371339261043 a4783298371339261043, Object[] objArr, Object[] objArr2, int i) {
        this.a = a4783298371339261043;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.g = objArr2;
        this.h = a4783298371339261043.a();
    }

    public static void i(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(F4096073349764486348 f4096073349764486348, Object[] objArr, int i, int i2, Z6787503239643758223 z6787503239643758223, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = z6787503239643758223.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) f4096073349764486348.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        z6787503239643758223.a = objArrR;
        if (objArr2 != objArrR) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(F4096073349764486348 f4096073349764486348, Object[] objArr, int i, Z6787503239643758223 z6787503239643758223) {
        Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) f4096073349764486348.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrP = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrP[i2] = obj;
                i2++;
            }
        }
        z6787503239643758223.a = objArrP;
        return i2;
    }

    public final int C(F4096073349764486348 f4096073349764486348, int i, Z6787503239643758223 z6787503239643758223) {
        int iB = B(f4096073349764486348, this.g, i, z6787503239643758223);
        Object obj = z6787503239643758223.a;
        if (iB == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iB, i, (Object) null);
        this.g = objArr;
        this.h -= i - iB;
        return iB;
    }

    public final boolean D(F4096073349764486348 f4096073349764486348) {
        int i;
        F4096073349764486348 f40960733497644863482 = f4096073349764486348;
        int iJ = J();
        Object[] objArrT = null;
        Z6787503239643758223 z6787503239643758223 = new Z6787503239643758223(null);
        boolean z = false;
        if (this.f != null) {
            K9754274840577282785 k9754274840577282785O = o(0);
            int iB = 32;
            while (iB == 32 && k9754274840577282785O.hasNext()) {
                iB = B(f40960733497644863482, (Object[]) k9754274840577282785O.next(), 32, z6787503239643758223);
            }
            if (iB == 32) {
                int iC = C(f40960733497644863482, iJ, z6787503239643758223);
                if (iC == 0) {
                    v(this.f, this.h, this.d);
                }
                if (iC != iJ) {
                }
            } else {
                int i2 = (k9754274840577282785O.a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iA = iB;
                while (k9754274840577282785O.hasNext()) {
                    iA = A(f40960733497644863482, (Object[]) k9754274840577282785O.next(), 32, iA, z6787503239643758223, arrayList2, arrayList);
                    f40960733497644863482 = f4096073349764486348;
                }
                int iA2 = A(f4096073349764486348, this.g, iJ, iA, z6787503239643758223, arrayList2, arrayList);
                Object obj = z6787503239643758223.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iA2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrW = this.f;
                if (zIsEmpty) {
                    objArrW.getClass();
                } else {
                    objArrW = w(objArrW, i2, this.d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    L4738636499147270068.a("invalid size");
                }
                if (size == 0) {
                    this.d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.d = i - 5;
                        Object[] objArr2 = objArrW[0];
                        objArr2.getClass();
                        objArrW = objArr2;
                    }
                    objArrT = t(objArrW, i3, i);
                }
                this.f = objArrT;
                this.g = objArr;
                this.h = size + iA2;
            }
            z = true;
        } else if (C(f40960733497644863482, iJ, z6787503239643758223) != iJ) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] E(Object[] objArr, int i, int i2, Z6787503239643758223 z6787503239643758223) {
        int i3 = P1789376955961125859.i(i2, i);
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrP = p(objArr);
            O5378677881740157249.n0(i3, i3 + 1, 32, objArr, objArrP);
            objArrP[31] = z6787503239643758223.a;
            z6787503239643758223.a = obj;
            return objArrP;
        }
        int i4 = objArr[31] == null ? P1789376955961125859.i(G() - 1, i) : 31;
        Object[] objArrP2 = p(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = objArrP2[i4];
                obj2.getClass();
                objArrP2[i4] = E((Object[]) obj2, i5, 0, z6787503239643758223);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = objArrP2[i3];
        obj3.getClass();
        objArrP2[i3] = E((Object[]) obj3, i5, i2, z6787503239643758223);
        return objArrP2;
    }

    public final Object F(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.h - i;
        Object[] objArr2 = this.g;
        if (i4 == 1) {
            Object obj = objArr2[0];
            v(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrP = p(objArr2);
        O5378677881740157249.n0(i3, i3 + 1, i4, objArr2, objArrP);
        objArrP[i4 - 1] = null;
        this.f = objArr;
        this.g = objArrP;
        this.h = (i + i4) - 1;
        this.d = i2;
        return obj2;
    }

    public final int G() {
        int i = this.h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i, int i2, Object obj, Z6787503239643758223 z6787503239643758223) {
        int i3 = P1789376955961125859.i(i2, i);
        Object[] objArrP = p(objArr);
        if (i != 0) {
            Object obj2 = objArrP[i3];
            obj2.getClass();
            objArrP[i3] = H((Object[]) obj2, i - 5, i2, obj, z6787503239643758223);
            return objArrP;
        }
        if (objArrP != objArr) {
            ((AbstractList) this).modCount++;
        }
        z6787503239643758223.a = objArrP[i3];
        objArrP[i3] = obj;
        return objArrP;
    }

    public final void I(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrR;
        if (i3 < 1) {
            L4738636499147270068.a("requires at least one nullBuffer");
        }
        Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            O5378677881740157249.n0(size + 1, i4, i2, objArrP, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrR = objArrP;
            } else {
                objArrR = r();
                i3--;
                objArr2[i3] = objArrR;
            }
            int i7 = i2 - i6;
            O5378677881740157249.n0(0, i7, i2, objArrP, objArr3);
            O5378677881740157249.n0(size + 1, i4, i7, objArrP, objArrR);
            objArr3 = objArrR;
        }
        Iterator it = collection.iterator();
        i(objArrP, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrR2 = r();
            i(objArrR2, 0, it);
            objArr2[i8] = objArrR2;
        }
        i(objArr3, 0, it);
    }

    public final int J() {
        int i = this.h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // dev.epro.r0.E2168127913664336368
    public final int a() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        O8620973563946607355.y(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            m(i - iG, obj, this.f);
            return;
        }
        Z6787503239643758223 z6787503239643758223 = new Z6787503239643758223(null);
        Object[] objArr = this.f;
        objArr.getClass();
        m(0, z6787503239643758223.a, l(objArr, this.d, i, obj, z6787503239643758223));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrR;
        O8620973563946607355.y(i, this.h);
        if (i == this.h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g;
            Object[] objArrP = p(objArr);
            O5378677881740157249.n0(size2 + 1, i3, J(), objArr, objArrP);
            i(objArrP, i3, collection.iterator());
            this.g = objArrP;
            this.h = collection.size() + this.h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iJ = J();
        int size3 = collection.size() + this.h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= G()) {
            objArrR = r();
            collection2 = collection;
            I(collection2, i, this.g, iJ, objArr2, size, objArrR);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.g;
            if (size3 > iJ) {
                int i4 = size3 - iJ;
                Object[] objArrQ = q(i4, objArr3);
                k(collection2, i, i4, objArr2, size, objArrQ);
                objArr2 = objArr2;
                objArrR = objArrQ;
            } else {
                objArrR = r();
                int i5 = iJ - size3;
                O5378677881740157249.n0(0, i5, iJ, objArr3, objArrR);
                int i6 = 32 - i5;
                Object[] objArrQ2 = q(i6, this.g);
                int i7 = size - 1;
                objArr2[i7] = objArrQ2;
                k(collection2, i, i6, objArr2, i7, objArrQ2);
                collection2 = collection2;
            }
        }
        this.f = x(this.f, i2, objArr2);
        this.g = objArrR;
        this.h = collection2.size() + this.h;
        return true;
    }

    @Override // dev.epro.r0.E2168127913664336368
    public final Object b(int i) {
        O8620973563946607355.x(i, a());
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            return F(this.f, iG, this.d, i - iG);
        }
        Z6787503239643758223 z6787503239643758223 = new Z6787503239643758223(this.g[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        F(E(objArr, this.d, i, z6787503239643758223), iG, this.d, 0);
        return z6787503239643758223.a;
    }

    public final A4783298371339261043 c() {
        A4783298371339261043 a13457896839052192887;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            a13457896839052192887 = this.a;
        } else {
            this.e = new J3301701597851028733((byte) 17);
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            a13457896839052192887 = objArr == null ? objArr2.length == 0 ? A13457896839052192887.b : new A13457896839052192887(Arrays.copyOf(objArr2, this.h)) : new Q6678426126573562739(objArr, objArr2, this.h, this.d);
        }
        this.a = a13457896839052192887;
        return a13457896839052192887;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        O8620973563946607355.x(i, a());
        if (G() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[P1789376955961125859.i(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j() {
        return ((AbstractList) this).modCount;
    }

    public final void k(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            S10973172697741180971.m("root is null");
            return;
        }
        int i4 = i >> 5;
        K9754274840577282785 k9754274840577282785O = o(G() >> 5);
        int i5 = i3;
        Object[] objArrQ = objArr2;
        while (k9754274840577282785O.a - 1 != i4) {
            Object[] objArr3 = (Object[]) k9754274840577282785O.previous();
            O5378677881740157249.n0(0, 32 - i2, 32, objArr3, objArrQ);
            objArrQ = q(i2, objArr3);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr4 = (Object[]) k9754274840577282785O.previous();
        int iG = i3 - (((G() >> 5) - 1) - i4);
        if (iG < i3) {
            objArr2 = objArr[iG];
            objArr2.getClass();
        }
        I(collection, i, objArr4, 32, objArr, iG, objArr2);
    }

    public final Object[] l(Object[] objArr, int i, int i2, Object obj, Z6787503239643758223 z6787503239643758223) {
        Object obj2;
        int i3 = P1789376955961125859.i(i2, i);
        if (i == 0) {
            z6787503239643758223.a = objArr[31];
            Object[] objArrP = p(objArr);
            O5378677881740157249.n0(i3 + 1, i3, 31, objArr, objArrP);
            objArrP[i3] = obj;
            return objArrP;
        }
        Object[] objArrP2 = p(objArr);
        int i4 = i - 5;
        Object obj3 = objArrP2[i3];
        obj3.getClass();
        objArrP2[i3] = l((Object[]) obj3, i4, i2, obj, z6787503239643758223);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = objArrP2[i3]) == null) {
                break;
            }
            objArrP2[i3] = l((Object[]) obj2, i4, 0, z6787503239643758223.a, z6787503239643758223);
        }
        return objArrP2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        O8620973563946607355.y(i, this.h);
        return new J1177206280180038194(this, i);
    }

    public final void m(int i, Object obj, Object[] objArr) {
        int iJ = J();
        Object[] objArrP = p(this.g);
        Object[] objArr2 = this.g;
        if (iJ >= 32) {
            Object obj2 = objArr2[31];
            O5378677881740157249.n0(i + 1, i, 31, objArr2, objArrP);
            objArrP[i] = obj;
            y(objArr, objArrP, s(obj2));
            return;
        }
        O5378677881740157249.n0(i + 1, i, iJ, objArr2, objArrP);
        objArrP[i] = obj;
        this.f = objArr;
        this.g = objArrP;
        this.h++;
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final K9754274840577282785 o(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            S10973172697741180971.m("Invalid root");
            return null;
        }
        int iG = G() >> 5;
        O8620973563946607355.y(i, iG);
        int i2 = this.d;
        return i2 == 0 ? new N9950793444260175412(i, objArr) : new V15316295198673619864(objArr, i, iG, i2 / 5);
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] objArrR = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        O5378677881740157249.s0(0, length, 6, objArr, objArrR);
        return objArrR;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (n(objArr)) {
            O5378677881740157249.n0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrR = r();
        O5378677881740157249.n0(i, 0, 32 - i, objArr, objArrR);
        return objArrR;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return D(new X4434822404034665133(collection, (byte) 1));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        O8620973563946607355.x(i, a());
        if (G() > i) {
            Z6787503239643758223 z6787503239643758223 = new Z6787503239643758223(null);
            Object[] objArr = this.f;
            objArr.getClass();
            this.f = H(objArr, this.d, i, obj, z6787503239643758223);
            return z6787503239643758223.a;
        }
        Object[] objArrP = p(this.g);
        if (objArrP != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrP[i2];
        objArrP[i2] = obj;
        this.g = objArrP;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            L4738636499147270068.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int i3 = P1789376955961125859.i(i, i2);
        Object obj = objArr[i3];
        obj.getClass();
        Object objT = t((Object[]) obj, i, i2 - 5);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] objArrR = r();
                O5378677881740157249.n0(0, 0, i4, objArr, objArrR);
                objArr = objArrR;
            }
        }
        if (objT == objArr[i3]) {
            return objArr;
        }
        Object[] objArrP = p(objArr);
        objArrP[i3] = objT;
        return objArrP;
    }

    public final Object[] u(Object[] objArr, int i, int i2, Z6787503239643758223 z6787503239643758223) {
        Object[] objArrU;
        int i3 = P1789376955961125859.i(i2 - 1, i);
        if (i == 5) {
            z6787503239643758223.a = objArr[i3];
            objArrU = null;
        } else {
            Object obj = objArr[i3];
            obj.getClass();
            objArrU = u((Object[]) obj, i - 5, i2, z6787503239643758223);
        }
        if (objArrU == null && i3 == 0) {
            return null;
        }
        Object[] objArrP = p(objArr);
        objArrP[i3] = objArrU;
        return objArrP;
    }

    public final void v(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        Z6787503239643758223 z6787503239643758223 = new Z6787503239643758223(null);
        objArr.getClass();
        Object[] objArrU = u(objArr, i2, i, z6787503239643758223);
        objArrU.getClass();
        Object obj = z6787503239643758223.a;
        obj.getClass();
        this.g = (Object[]) obj;
        this.h = i;
        if (objArrU[1] == null) {
            this.f = (Object[]) objArrU[0];
            this.d = i2 - 5;
        } else {
            this.f = objArrU;
            this.d = i2;
        }
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            L4738636499147270068.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            L4738636499147270068.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrP = p(objArr);
        int i3 = P1789376955961125859.i(i, i2);
        int i4 = i2 - 5;
        objArrP[i3] = w((Object[]) objArrP[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[i3] = w((Object[]) objArrP[i3], 0, i4, it);
        }
        return objArrP;
    }

    public final Object[] x(Object[] objArr, int i, Object[][] objArr2) {
        Z1085125311131623997 z1085125311131623997 = new Z1085125311131623997(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrW = i2 < (1 << i3) ? w(objArr, i, i3, z1085125311131623997) : p(objArr);
        while (z1085125311131623997.hasNext()) {
            this.d += 5;
            objArrW = s(objArrW);
            int i4 = this.d;
            w(objArrW, 1 << i4, i4, z1085125311131623997);
        }
        return objArrW;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = z(this.d + 5, s(objArr), objArr2);
            this.g = objArr3;
            this.d += 5;
            this.h++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = i + 1;
        } else {
            this.f = z(i3, objArr, objArr2);
            this.g = objArr3;
            this.h++;
        }
    }

    public final Object[] z(int i, Object[] objArr, Object[] objArr2) {
        int i2 = P1789376955961125859.i(a() - 1, i);
        Object[] objArrP = p(objArr);
        if (i == 5) {
            objArrP[i2] = objArr2;
            return objArrP;
        }
        objArrP[i2] = z(i - 5, (Object[]) objArrP[i2], objArr2);
        return objArrP;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (iJ < 32) {
            Object[] objArrP = p(this.g);
            objArrP[iJ] = obj;
            this.g = objArrP;
            this.h = a() + 1;
        } else {
            y(this.f, this.g, s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        Iterator it = collection.iterator();
        if (32 - iJ >= collection.size()) {
            Object[] objArrP = p(this.g);
            i(objArrP, iJ, it);
            this.g = objArrP;
            this.h = collection.size() + this.h;
            return true;
        }
        int size = ((collection.size() + iJ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrP2 = p(this.g);
        i(objArrP2, iJ, it);
        objArr[0] = objArrP2;
        for (int i = 1; i < size; i++) {
            Object[] objArrR = r();
            i(objArrR, 0, it);
            objArr[i] = objArrR;
        }
        this.f = x(this.f, G(), objArr);
        Object[] objArrR2 = r();
        i(objArrR2, 0, it);
        this.g = objArrR2;
        this.h = collection.size() + this.h;
        return true;
    }
}
