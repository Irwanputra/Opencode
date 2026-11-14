package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A13457896839052192887 extends dev.epro.r0.A4783298371339261043 {
    public static final dev.epro.r0.A13457896839052192887 b = new dev.epro.r0.A13457896839052192887(new java.lang.Object[0]);
    public final java.lang.Object[] a;

    public A13457896839052192887(java.lang.Object[] objArr) {
        this.a = objArr;
    }

    public final int a() {
        return this.a.length;
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final dev.epro.r0.A4783298371339261043 b(int i, java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
        dev.epro.r0.O8620973563946607355.y(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 1];
            dev.epro.r0.O5378677881740157249.s0(0, i, 6, objArr, objArr2);
            dev.epro.r0.O5378677881740157249.n0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new dev.epro.r0.A13457896839052192887(objArr2);
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        dev.epro.r0.O5378677881740157249.n0(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        java.lang.Object[] objArr3 = new java.lang.Object[32];
        objArr3[0] = objArr[31];
        return new dev.epro.r0.Q6678426126573562739(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final dev.epro.r0.A4783298371339261043 c(java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
        if (objArr.length < 32) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new dev.epro.r0.A13457896839052192887(objArrCopyOf);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[32];
        objArr2[0] = obj;
        return new dev.epro.r0.Q6678426126573562739(objArr, objArr2, objArr.length + 1, 0);
    }

    public final java.lang.Object get(int i) {
        java.lang.Object[] objArr = this.a;
        dev.epro.r0.O8620973563946607355.x(i, objArr.length);
        return objArr[i];
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final dev.epro.r0.A4783298371339261043 i(java.util.Collection collection) {
        java.lang.Object[] objArr = this.a;
        if (collection.size() + objArr.length > 32) {
            dev.epro.r0.J15049672055732829618 j15049672055732829618J = j();
            j15049672055732829618J.addAll(collection);
            return j15049672055732829618J.c();
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new dev.epro.r0.A13457896839052192887(objArrCopyOf);
    }

    public final int indexOf(java.lang.Object obj) {
        return dev.epro.r0.O5378677881740157249.J0(obj, this.a);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final dev.epro.r0.J15049672055732829618 j() {
        return new dev.epro.r0.J15049672055732829618(this, (java.lang.Object[]) null, this.a, 0);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final dev.epro.r0.A4783298371339261043 k(dev.epro.r0.X4434822404034665133 x4434822404034665133) {
        java.lang.Object[] objArr = this.a;
        int length = objArr.length;
        int length2 = objArr.length;
        java.lang.Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            java.lang.Object obj = objArr[i];
            if (((java.lang.Boolean) x4434822404034665133.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? b : new dev.epro.r0.A13457896839052192887(dev.epro.r0.O5378677881740157249.v0(objArrCopyOf, 0, length));
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final dev.epro.r0.A4783298371339261043 l(int i) {
        java.lang.Object[] objArr = this.a;
        dev.epro.r0.O8620973563946607355.x(i, objArr.length);
        if (objArr.length == 1) {
            return b;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length - 1);
        dev.epro.r0.O5378677881740157249.n0(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new dev.epro.r0.A13457896839052192887(objArrCopyOf);
    }

    public final int lastIndexOf(java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
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

    public final java.util.ListIterator listIterator(int i) {
        java.lang.Object[] objArr = this.a;
        dev.epro.r0.O8620973563946607355.y(i, objArr.length);
        return new dev.epro.r0.N9950793444260175412(objArr, i, objArr.length);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final dev.epro.r0.A4783298371339261043 m(int i, java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
        dev.epro.r0.O8620973563946607355.x(i, objArr.length);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new dev.epro.r0.A13457896839052192887(objArrCopyOf);
    }
}
