package dev.epro.r0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) f4096073349764486348.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        z6787503239643758223.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(F4096073349764486348 f4096073349764486348, Object[] objArr, int i, Z6787503239643758223 z6787503239643758223) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) f4096073349764486348.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        z6787503239643758223.a = objArr2;
        return i2;
    }

    public final int C(F4096073349764486348 f4096073349764486348, int i, Z6787503239643758223 z6787503239643758223) {
        int B = B(f4096073349764486348, this.g, i, z6787503239643758223);
        Object obj = z6787503239643758223.a;
        if (B == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, B, i, (Object) null);
        this.g = objArr;
        this.h -= i - B;
        return B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (C(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(dev.epro.r0.F4096073349764486348 r16) {
        /*
            r15 = this;
            r1 = r16
            int r8 = r15.J()
            dev.epro.r0.Z6787503239643758223 r5 = new dev.epro.r0.Z6787503239643758223
            r9 = 0
            r5.<init>(r9)
            java.lang.Object[] r0 = r15.f
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1b
            int r0 = r15.C(r1, r8, r5)
            if (r0 == r8) goto Ld1
        L18:
            r10 = r11
            goto Ld1
        L1b:
            dev.epro.r0.K9754274840577282785 r12 = r15.o(r10)
            r13 = 32
            r0 = r13
        L22:
            if (r0 != r13) goto L35
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.B(r1, r0, r13, r5)
            goto L22
        L35:
            if (r0 != r13) goto L49
            int r0 = r15.C(r1, r8, r5)
            if (r0 != 0) goto L46
            java.lang.Object[] r1 = r15.f
            int r2 = r15.h
            int r3 = r15.d
            r15.v(r1, r2, r3)
        L46:
            if (r0 == r8) goto Ld1
            goto L18
        L49:
            int r2 = r12.a
            int r2 = r2 - r11
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L59:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.A(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L59
        L70:
            java.lang.Object[] r2 = r15.g
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.A(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.a
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r13, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r15.f
            if (r3 == 0) goto L90
            r4.getClass()
            goto L9a
        L90:
            int r3 = r15.d
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r15.w(r4, r14, r3, r5)
        L9a:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La6
            goto Lab
        La6:
            java.lang.String r3 = "invalid size"
            dev.epro.r0.L4738636499147270068.a(r3)
        Lab:
            if (r14 != 0) goto Lb0
            r15.d = r10
            goto Lc8
        Lb0:
            int r3 = r14 + (-1)
        Lb2:
            int r5 = r15.d
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc4
            int r5 = r5 + (-5)
            r15.d = r5
            r4 = r4[r10]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb2
        Lc4:
            java.lang.Object[] r9 = r15.t(r4, r3, r5)
        Lc8:
            r15.f = r9
            r15.g = r2
            int r14 = r14 + r1
            r15.h = r14
            goto L18
        Ld1:
            if (r10 == 0) goto Ld8
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J15049672055732829618.D(dev.epro.r0.F4096073349764486348):boolean");
    }

    public final Object[] E(Object[] objArr, int i, int i2, Z6787503239643758223 z6787503239643758223) {
        int i3 = P1789376955961125859.i(i2, i);
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] p = p(objArr);
            O5378677881740157249.n0(i3, i3 + 1, 32, objArr, p);
            p[31] = z6787503239643758223.a;
            z6787503239643758223.a = obj;
            return p;
        }
        int i4 = objArr[31] == null ? P1789376955961125859.i(G() - 1, i) : 31;
        Object[] p2 = p(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = p2[i4];
                obj2.getClass();
                p2[i4] = E((Object[]) obj2, i5, 0, z6787503239643758223);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = p2[i3];
        obj3.getClass();
        p2[i3] = E((Object[]) obj3, i5, i2, z6787503239643758223);
        return p2;
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
        Object[] p = p(objArr2);
        O5378677881740157249.n0(i3, i3 + 1, i4, objArr2, p);
        p[i4 - 1] = null;
        this.f = objArr;
        this.g = p;
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
        Object[] p = p(objArr);
        if (i != 0) {
            Object obj2 = p[i3];
            obj2.getClass();
            p[i3] = H((Object[]) obj2, i - 5, i2, obj, z6787503239643758223);
            return p;
        }
        if (p != objArr) {
            ((AbstractList) this).modCount++;
        }
        z6787503239643758223.a = p[i3];
        p[i3] = obj;
        return p;
    }

    public final void I(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] r;
        if (i3 < 1) {
            L4738636499147270068.a("requires at least one nullBuffer");
        }
        Object[] p = p(objArr);
        objArr2[0] = p;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            O5378677881740157249.n0(size + 1, i4, i2, p, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                r = p;
            } else {
                r = r();
                i3--;
                objArr2[i3] = r;
            }
            int i7 = i2 - i6;
            O5378677881740157249.n0(0, i7, i2, p, objArr3);
            O5378677881740157249.n0(size + 1, i4, i7, p, r);
            objArr3 = r;
        }
        Iterator it = collection.iterator();
        i(p, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] r2 = r();
            i(r2, 0, it);
            objArr2[i8] = r2;
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
        int G = G();
        if (i >= G) {
            m(i - G, obj, this.f);
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
        Object[] r;
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
            Object[] p = p(objArr);
            O5378677881740157249.n0(size2 + 1, i3, J(), objArr, p);
            i(p, i3, collection.iterator());
            this.g = p;
            this.h = collection.size() + this.h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int J = J();
        int size3 = collection.size() + this.h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= G()) {
            r = r();
            collection2 = collection;
            I(collection2, i, this.g, J, objArr2, size, r);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.g;
            if (size3 > J) {
                int i4 = size3 - J;
                Object[] q = q(i4, objArr3);
                k(collection2, i, i4, objArr2, size, q);
                objArr2 = objArr2;
                r = q;
            } else {
                r = r();
                int i5 = J - size3;
                O5378677881740157249.n0(0, i5, J, objArr3, r);
                int i6 = 32 - i5;
                Object[] q2 = q(i6, this.g);
                int i7 = size - 1;
                objArr2[i7] = q2;
                k(collection2, i, i6, objArr2, i7, q2);
                collection2 = collection2;
            }
        }
        this.f = x(this.f, i2, objArr2);
        this.g = r;
        this.h = collection2.size() + this.h;
        return true;
    }

    @Override // dev.epro.r0.E2168127913664336368
    public final Object b(int i) {
        O8620973563946607355.x(i, a());
        ((AbstractList) this).modCount++;
        int G = G();
        if (i >= G) {
            return F(this.f, G, this.d, i - G);
        }
        Z6787503239643758223 z6787503239643758223 = new Z6787503239643758223(this.g[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        F(E(objArr, this.d, i, z6787503239643758223), G, this.d, 0);
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
        K9754274840577282785 o2 = o(G() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (o2.a - 1 != i4) {
            Object[] objArr4 = (Object[]) o2.previous();
            O5378677881740157249.n0(0, 32 - i2, 32, objArr4, objArr3);
            objArr3 = q(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) o2.previous();
        int G = i3 - (((G() >> 5) - 1) - i4);
        if (G < i3) {
            objArr2 = objArr[G];
            objArr2.getClass();
        }
        I(collection, i, objArr5, 32, objArr, G, objArr2);
    }

    public final Object[] l(Object[] objArr, int i, int i2, Object obj, Z6787503239643758223 z6787503239643758223) {
        Object obj2;
        int i3 = P1789376955961125859.i(i2, i);
        if (i == 0) {
            z6787503239643758223.a = objArr[31];
            Object[] p = p(objArr);
            O5378677881740157249.n0(i3 + 1, i3, 31, objArr, p);
            p[i3] = obj;
            return p;
        }
        Object[] p2 = p(objArr);
        int i4 = i - 5;
        Object obj3 = p2[i3];
        obj3.getClass();
        p2[i3] = l((Object[]) obj3, i4, i2, obj, z6787503239643758223);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = p2[i3]) == null) {
                break;
            }
            p2[i3] = l((Object[]) obj2, i4, 0, z6787503239643758223.a, z6787503239643758223);
        }
        return p2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        O8620973563946607355.y(i, this.h);
        return new J1177206280180038194(this, i);
    }

    public final void m(int i, Object obj, Object[] objArr) {
        int J = J();
        Object[] p = p(this.g);
        Object[] objArr2 = this.g;
        if (J >= 32) {
            Object obj2 = objArr2[31];
            O5378677881740157249.n0(i + 1, i, 31, objArr2, p);
            p[i] = obj;
            y(objArr, p, s(obj2));
            return;
        }
        O5378677881740157249.n0(i + 1, i, J, objArr2, p);
        p[i] = obj;
        this.f = objArr;
        this.g = p;
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
        int G = G() >> 5;
        O8620973563946607355.y(i, G);
        int i2 = this.d;
        return i2 == 0 ? new N9950793444260175412(i, objArr) : new V15316295198673619864(objArr, i, G, i2 / 5);
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] r = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        O5378677881740157249.s0(0, length, 6, objArr, r);
        return r;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (n(objArr)) {
            O5378677881740157249.n0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] r = r();
        O5378677881740157249.n0(i, 0, 32 - i, objArr, r);
        return r;
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
        Object[] p = p(this.g);
        if (p != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = p[i2];
        p[i2] = obj;
        this.g = p;
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
        Object t = t((Object[]) obj, i, i2 - 5);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] r = r();
                O5378677881740157249.n0(0, 0, i4, objArr, r);
                objArr = r;
            }
        }
        if (t == objArr[i3]) {
            return objArr;
        }
        Object[] p = p(objArr);
        p[i3] = t;
        return p;
    }

    public final Object[] u(Object[] objArr, int i, int i2, Z6787503239643758223 z6787503239643758223) {
        Object[] u;
        int i3 = P1789376955961125859.i(i2 - 1, i);
        if (i == 5) {
            z6787503239643758223.a = objArr[i3];
            u = null;
        } else {
            Object obj = objArr[i3];
            obj.getClass();
            u = u((Object[]) obj, i - 5, i2, z6787503239643758223);
        }
        if (u == null && i3 == 0) {
            return null;
        }
        Object[] p = p(objArr);
        p[i3] = u;
        return p;
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
        Object[] u = u(objArr, i2, i, z6787503239643758223);
        u.getClass();
        Object obj = z6787503239643758223.a;
        obj.getClass();
        this.g = (Object[]) obj;
        this.h = i;
        if (u[1] == null) {
            this.f = (Object[]) u[0];
            this.d = i2 - 5;
        } else {
            this.f = u;
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
        Object[] p = p(objArr);
        int i3 = P1789376955961125859.i(i, i2);
        int i4 = i2 - 5;
        p[i3] = w((Object[]) p[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            p[i3] = w((Object[]) p[i3], 0, i4, it);
        }
        return p;
    }

    public final Object[] x(Object[] objArr, int i, Object[][] objArr2) {
        Z1085125311131623997 z1085125311131623997 = new Z1085125311131623997(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] w = i2 < (1 << i3) ? w(objArr, i, i3, z1085125311131623997) : p(objArr);
        while (z1085125311131623997.hasNext()) {
            this.d += 5;
            w = s(w);
            int i4 = this.d;
            w(w, 1 << i4, i4, z1085125311131623997);
        }
        return w;
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
        Object[] p = p(objArr);
        if (i == 5) {
            p[i2] = objArr2;
            return p;
        }
        p[i2] = z(i - 5, (Object[]) p[i2], objArr2);
        return p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int J = J();
        if (J < 32) {
            Object[] p = p(this.g);
            p[J] = obj;
            this.g = p;
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
        int J = J();
        Iterator it = collection.iterator();
        if (32 - J >= collection.size()) {
            Object[] p = p(this.g);
            i(p, J, it);
            this.g = p;
            this.h = collection.size() + this.h;
            return true;
        }
        int size = ((collection.size() + J) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] p2 = p(this.g);
        i(p2, J, it);
        objArr[0] = p2;
        for (int i = 1; i < size; i++) {
            Object[] r = r();
            i(r, 0, it);
            objArr[i] = r;
        }
        this.f = x(this.f, G(), objArr);
        Object[] r2 = r();
        i(r2, 0, it);
        this.g = r2;
        this.h = collection.size() + this.h;
        return true;
    }
}
