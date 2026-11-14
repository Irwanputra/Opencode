package dev.epro.r0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A13457896839052192887 extends A4783298371339261043 {
    public static final A13457896839052192887 b = new A13457896839052192887(new Object[0]);
    public final Object[] a;

    public A13457896839052192887(Object[] objArr) {
        this.a = objArr;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        return this.a.length;
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 b(int i, Object obj) {
        Object[] objArr = this.a;
        O8620973563946607355.y(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            O5378677881740157249.s0(0, i, 6, objArr, objArr2);
            O5378677881740157249.n0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new A13457896839052192887(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        O5378677881740157249.n0(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new Q6678426126573562739(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 c(Object obj) {
        Object[] objArr = this.a;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new A13457896839052192887(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new Q6678426126573562739(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.a;
        O8620973563946607355.x(i, objArr.length);
        return objArr[i];
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 i(Collection collection) {
        Object[] objArr = this.a;
        if (collection.size() + objArr.length > 32) {
            J15049672055732829618 j = j();
            j.addAll(collection);
            return j.c();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new A13457896839052192887(copyOf);
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final int indexOf(Object obj) {
        return O5378677881740157249.J0(obj, this.a);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final J15049672055732829618 j() {
        return new J15049672055732829618(this, null, this.a, 0);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 k(X4434822404034665133 x4434822404034665133) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) x4434822404034665133.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? b : new A13457896839052192887(O5378677881740157249.v0(objArr2, 0, length));
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 l(int i) {
        Object[] objArr = this.a;
        O8620973563946607355.x(i, objArr.length);
        if (objArr.length == 1) {
            return b;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        O5378677881740157249.n0(i, i + 1, objArr.length, objArr, copyOf);
        return new A13457896839052192887(copyOf);
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.a;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.a;
        O8620973563946607355.y(i, objArr.length);
        return new N9950793444260175412(objArr, i, objArr.length);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 m(int i, Object obj) {
        Object[] objArr = this.a;
        O8620973563946607355.x(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new A13457896839052192887(copyOf);
    }
}
