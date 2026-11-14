package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U9803441765912152712 {
    public Object[] a;
    public int b;
    public K7217096618580727896 c;

    public U9803441765912152712(int i) {
        this.a = i == 0 ? M17189296052689530719.a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(U9803441765912152712 u9803441765912152712) {
        u9803441765912152712.getClass();
        if (u9803441765912152712.h()) {
            return;
        }
        int i = this.b + u9803441765912152712.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        O5378677881740157249.n0(this.b, 0, u9803441765912152712.b, u9803441765912152712.a, this.a);
        this.b += u9803441765912152712.b;
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void d() {
        O5378677881740157249.x0(0, this.b, null, this.a);
        this.b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.a[0];
        }
        K2042933864045806308.n("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof U9803441765912152712) {
            U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj;
            int i = u9803441765912152712.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = u9803441765912152712.a;
                P8646985343900033725 p8646985343900033725N = W7808703833045379622.N(0, i2);
                int i3 = p8646985343900033725N.a;
                int i4 = p8646985343900033725N.b;
                if (i3 > i4) {
                    return true;
                }
                while (S10823041268949770285.t(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        o(i);
        throw null;
    }

    public final int g(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean h() {
        return this.b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.b != 0;
    }

    public final boolean j(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        k(iG);
        return true;
    }

    public final Object k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            o(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            O5378677881740157249.n0(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            D11988991656201568495.i(this.b, E12098517352909843120.p(i, i2, "Start (", ") and end (", ") must be in 0.."));
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                O5378677881740157249.n0(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            O5378677881740157249.x0(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        O5378677881740157249.n0(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final Object n(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            o(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void o(int i) {
        StringBuilder sbQ = E12098517352909843120.q(i, "Index ", " must be in 0..");
        sbQ.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public final void p(int i) {
        StringBuilder sbQ = E12098517352909843120.q(i, "Index ", " must be in 0..");
        sbQ.append(this.b);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public final String toString() {
        J3227772737003951788 j3227772737003951788 = new J3227772737003951788(this, (byte) 13);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) j3227772737003951788.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ U9803441765912152712() {
        this(16);
    }
}
