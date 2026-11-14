package dev.epro.r0;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q6678426126573562739 extends A4783298371339261043 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public Q6678426126573562739(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (!(a() > 32)) {
            L4738636499147270068.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] n(Object[] objArr, int i, int i2, Object obj, Z6787503239643758223 z6787503239643758223) {
        int i3 = P1789376955961125859.i(i2, i);
        if (i == 0) {
            Object[] copyOf = i3 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            O5378677881740157249.n0(i3 + 1, i3, 31, objArr, copyOf);
            z6787503239643758223.a = objArr[31];
            copyOf[i3] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        obj2.getClass();
        copyOf2[i3] = n((Object[]) obj2, i4, i2, obj, z6787503239643758223);
        while (true) {
            i3++;
            if (i3 >= 32 || copyOf2[i3] == null) {
                break;
            }
            Object obj3 = objArr[i3];
            obj3.getClass();
            copyOf2[i3] = n((Object[]) obj3, i4, 0, z6787503239643758223.a, z6787503239643758223);
        }
        return copyOf2;
    }

    public static Object[] p(Object[] objArr, int i, int i2, Z6787503239643758223 z6787503239643758223) {
        Object[] p;
        int i3 = P1789376955961125859.i(i2, i);
        if (i == 5) {
            z6787503239643758223.a = objArr[i3];
            p = null;
        } else {
            Object obj = objArr[i3];
            obj.getClass();
            p = p((Object[]) obj, i - 5, i2, z6787503239643758223);
        }
        if (p == null && i3 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[i3] = p;
        return copyOf;
    }

    public static Object[] v(int i, int i2, Object obj, Object[] objArr) {
        int i3 = P1789376955961125859.i(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[i3] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[i3];
        obj2.getClass();
        copyOf[i3] = v(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        return this.c;
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 b(int i, Object obj) {
        int i2 = this.c;
        O8620973563946607355.y(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int u = u();
        Object[] objArr = this.a;
        if (i >= u) {
            return o(i - u, obj, objArr);
        }
        Z6787503239643758223 z6787503239643758223 = new Z6787503239643758223(null);
        return o(0, z6787503239643758223.a, n(objArr, this.d, i, obj, z6787503239643758223));
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 c(Object obj) {
        int u = u();
        int i = this.c;
        int i2 = i - u;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new Q6678426126573562739(objArr, copyOf, i + 1, this.d);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return q(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        O8620973563946607355.x(i, a());
        if (u() <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[P1789376955961125859.i(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final J15049672055732829618 j() {
        return new J15049672055732829618(this, this.a, this.b, this.d);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 k(X4434822404034665133 x4434822404034665133) {
        J15049672055732829618 j15049672055732829618 = new J15049672055732829618(this, this.a, this.b, this.d);
        j15049672055732829618.D(x4434822404034665133);
        return j15049672055732829618.c();
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 l(int i) {
        O8620973563946607355.x(i, a());
        int u = u();
        int i2 = this.d;
        Object[] objArr = this.a;
        return i >= u ? t(objArr, u, i2, i - u) : t(s(objArr, i2, i, new Z6787503239643758223(this.b[0])), u, i2, 0);
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final ListIterator listIterator(int i) {
        O8620973563946607355.y(i, this.c);
        return new W6324677308932785514(i, this.c, (this.d / 5) + 1, this.a, this.b);
    }

    @Override // dev.epro.r0.A4783298371339261043
    public final A4783298371339261043 m(int i, Object obj) {
        int i2 = this.c;
        O8620973563946607355.x(i, i2);
        int u = u();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i3 = this.d;
        if (u > i) {
            return new Q6678426126573562739(v(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new Q6678426126573562739(objArr, copyOf, i2, i3);
    }

    public final Q6678426126573562739 o(int i, Object obj, Object[] objArr) {
        int u = u();
        int i2 = this.c;
        int i3 = i2 - u;
        Object[] objArr2 = this.b;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            O5378677881740157249.n0(i + 1, i, i3, objArr2, copyOf);
            copyOf[i] = obj;
            return new Q6678426126573562739(objArr, copyOf, i2 + 1, this.d);
        }
        Object obj2 = objArr2[31];
        O5378677881740157249.n0(i + 1, i, i3 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return q(objArr, copyOf, objArr3);
    }

    public final Q6678426126573562739 q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 <= (1 << i3)) {
            return new Q6678426126573562739(r(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new Q6678426126573562739(r(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] r(int i, Object[] objArr, Object[] objArr2) {
        int i2 = P1789376955961125859.i(a() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[i2] = objArr2;
            return copyOf;
        }
        copyOf[i2] = r(i - 5, (Object[]) copyOf[i2], objArr2);
        return copyOf;
    }

    public final Object[] s(Object[] objArr, int i, int i2, Z6787503239643758223 z6787503239643758223) {
        int i3 = P1789376955961125859.i(i2, i);
        if (i == 0) {
            Object[] copyOf = i3 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            O5378677881740157249.n0(i3, i3 + 1, 32, objArr, copyOf);
            copyOf[31] = z6787503239643758223.a;
            z6787503239643758223.a = objArr[i3];
            return copyOf;
        }
        int i4 = objArr[31] == null ? P1789376955961125859.i(u() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = copyOf2[i4];
                obj.getClass();
                copyOf2[i4] = s((Object[]) obj, i5, 0, z6787503239643758223);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = copyOf2[i3];
        obj2.getClass();
        copyOf2[i3] = s((Object[]) obj2, i5, i2, z6787503239643758223);
        return copyOf2;
    }

    public final A4783298371339261043 t(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            Object[] objArr2 = this.b;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                O5378677881740157249.n0(i3, i3 + 1, i4, objArr2, copyOf);
            }
            copyOf[i5] = null;
            return new Q6678426126573562739(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new A13457896839052192887(objArr);
        }
        Z6787503239643758223 z6787503239643758223 = new Z6787503239643758223(null);
        Object[] p = p(objArr, i2, i - 1, z6787503239643758223);
        p.getClass();
        Object obj = z6787503239643758223.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (p[1] != null) {
            return new Q6678426126573562739(p, objArr3, i, i2);
        }
        Object obj2 = p[0];
        obj2.getClass();
        return new Q6678426126573562739((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int u() {
        return (this.c - 1) & (-32);
    }
}
