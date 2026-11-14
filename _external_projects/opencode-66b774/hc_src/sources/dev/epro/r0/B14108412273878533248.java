package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B14108412273878533248 {
    public static final B14108412273878533248 e = new B14108412273878533248(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final J3301701597851028733 c;
    public Object[] d;

    public B14108412273878533248(int i, int i2, Object[] objArr, J3301701597851028733 j3301701597851028733) {
        this.a = i;
        this.b = i2;
        this.c = j3301701597851028733;
        this.d = objArr;
    }

    public static B14108412273878533248 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, J3301701597851028733 j3301701597851028733) {
        if (i3 > 30) {
            return new B14108412273878533248(0, 0, new Object[]{obj, obj2, obj3, obj4}, j3301701597851028733);
        }
        int k = T8598786036980488824.k(i, i3);
        int k2 = T8598786036980488824.k(i2, i3);
        if (k != k2) {
            return new B14108412273878533248((1 << k) | (1 << k2), 0, k < k2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, j3301701597851028733);
        }
        return new B14108412273878533248(0, 1 << k, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, j3301701597851028733)}, j3301701597851028733);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, J3301701597851028733 j3301701597851028733) {
        Object obj3 = this.d[i];
        B14108412273878533248 j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, j3301701597851028733);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        O5378677881740157249.s0(0, i, 6, objArr, objArr2);
        O5378677881740157249.n0(i, i + 2, i5, objArr, objArr2);
        objArr2[t - 1] = j;
        O5378677881740157249.n0(t, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        I12982432556619280823 L = W7808703833045379622.L(W7808703833045379622.N(0, this.d.length), 2);
        int i = L.a;
        int i2 = L.b;
        int i3 = L.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!S10823041268949770285.t(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int k = 1 << T8598786036980488824.k(i, i2);
        if (h(k)) {
            return S10823041268949770285.t(obj, this.d[f(k)]);
        }
        if (!i(k)) {
            return false;
        }
        B14108412273878533248 s = s(t(k));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(B14108412273878533248 b14108412273878533248) {
        if (this == b14108412273878533248) {
            return true;
        }
        if (this.b == b14108412273878533248.b && this.a == b14108412273878533248.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == b14108412273878533248.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int k = 1 << T8598786036980488824.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (S10823041268949770285.t(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(k)) {
            return null;
        }
        B14108412273878533248 s = s(t(k));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        I12982432556619280823 L = W7808703833045379622.L(W7808703833045379622.N(0, s.d.length), 2);
        int i3 = L.a;
        int i4 = L.b;
        int i5 = L.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!S10823041268949770285.t(obj, s.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return s.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final B14108412273878533248 k(int i, D13190160240050003111 d13190160240050003111) {
        d13190160240050003111.i(d13190160240050003111.e - 1);
        d13190160240050003111.c = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != d13190160240050003111.a) {
            return new B14108412273878533248(0, 0, T8598786036980488824.v(i, objArr), d13190160240050003111.a);
        }
        this.d = T8598786036980488824.v(i, objArr);
        return this;
    }

    public final B14108412273878533248 l(int i, Object obj, Object obj2, int i2, D13190160240050003111 d13190160240050003111) {
        D13190160240050003111 d131901602400500031112;
        B14108412273878533248 l;
        int k = 1 << T8598786036980488824.k(i, i2);
        boolean h = h(k);
        J3301701597851028733 j3301701597851028733 = this.c;
        if (h) {
            int f = f(k);
            if (!S10823041268949770285.t(obj, this.d[f])) {
                d13190160240050003111.i(d13190160240050003111.e + 1);
                J3301701597851028733 j33017015978510287332 = d13190160240050003111.a;
                if (j3301701597851028733 != j33017015978510287332) {
                    return new B14108412273878533248(this.a ^ k, this.b | k, a(f, k, i, obj, obj2, i2, j33017015978510287332), j33017015978510287332);
                }
                this.d = a(f, k, i, obj, obj2, i2, j33017015978510287332);
                this.a ^= k;
                this.b |= k;
                return this;
            }
            d13190160240050003111.c = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (j3301701597851028733 == d13190160240050003111.a) {
                this.d[f + 1] = obj2;
                return this;
            }
            d13190160240050003111.d++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = obj2;
            return new B14108412273878533248(this.a, this.b, copyOf, d13190160240050003111.a);
        }
        if (!i(k)) {
            d13190160240050003111.i(d13190160240050003111.e + 1);
            J3301701597851028733 j33017015978510287333 = d13190160240050003111.a;
            int f2 = f(k);
            Object[] objArr2 = this.d;
            if (j3301701597851028733 != j33017015978510287333) {
                return new B14108412273878533248(this.a | k, this.b, T8598786036980488824.l(objArr2, f2, obj, obj2), j33017015978510287333);
            }
            this.d = T8598786036980488824.l(objArr2, f2, obj, obj2);
            this.a |= k;
            return this;
        }
        int t = t(k);
        B14108412273878533248 s = s(t);
        if (i2 == 30) {
            I12982432556619280823 L = W7808703833045379622.L(W7808703833045379622.N(0, s.d.length), 2);
            int i3 = L.a;
            int i4 = L.b;
            int i5 = L.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!S10823041268949770285.t(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                d13190160240050003111.c = s.x(i3);
                if (s.c == d13190160240050003111.a) {
                    s.d[i3 + 1] = obj2;
                    l = s;
                } else {
                    d13190160240050003111.d++;
                    Object[] objArr3 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    l = new B14108412273878533248(0, 0, copyOf2, d13190160240050003111.a);
                }
                d131901602400500031112 = d13190160240050003111;
            }
            d13190160240050003111.i(d13190160240050003111.e + 1);
            l = new B14108412273878533248(0, 0, T8598786036980488824.l(s.d, 0, obj, obj2), d13190160240050003111.a);
            d131901602400500031112 = d13190160240050003111;
        } else {
            d131901602400500031112 = d13190160240050003111;
            l = s.l(i, obj, obj2, i2 + 5, d131901602400500031112);
        }
        return s == l ? this : r(t, l, d131901602400500031112.a);
    }

    public final B14108412273878533248 m(B14108412273878533248 b14108412273878533248, int i, J8000059863626891400 j8000059863626891400, D13190160240050003111 d13190160240050003111) {
        Object[] objArr;
        B14108412273878533248 j;
        if (this == b14108412273878533248) {
            j8000059863626891400.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            J3301701597851028733 j3301701597851028733 = d13190160240050003111.a;
            int i3 = b14108412273878533248.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + b14108412273878533248.d.length);
            int length = this.d.length;
            I12982432556619280823 L = W7808703833045379622.L(W7808703833045379622.N(0, b14108412273878533248.d.length), 2);
            int i4 = L.a;
            int i5 = L.b;
            int i6 = L.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(b14108412273878533248.d[i4])) {
                        j8000059863626891400.a++;
                    } else {
                        Object[] objArr3 = b14108412273878533248.d;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == b14108412273878533248.d.length ? b14108412273878533248 : length == copyOf.length ? new B14108412273878533248(0, 0, copyOf, j3301701597851028733) : new B14108412273878533248(0, 0, Arrays.copyOf(copyOf, length), j3301701597851028733);
            }
        } else {
            int i7 = this.b | b14108412273878533248.b;
            int i8 = this.a;
            int i9 = b14108412273878533248.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (S10823041268949770285.t(this.d[f(lowestOneBit)], b14108412273878533248.d[b14108412273878533248.f(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                L4738636499147270068.b("Check failed.");
            }
            B14108412273878533248 b141084122738785332482 = (S10823041268949770285.t(this.c, d13190160240050003111.a) && this.a == i12 && this.b == i7) ? this : new B14108412273878533248(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = b141084122738785332482.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (b14108412273878533248.i(lowestOneBit2)) {
                        j = j.m(b14108412273878533248.s(b14108412273878533248.t(lowestOneBit2)), i + 5, j8000059863626891400, d13190160240050003111);
                        objArr = objArr4;
                    } else if (b14108412273878533248.h(lowestOneBit2)) {
                        int f = b14108412273878533248.f(lowestOneBit2);
                        Object obj = b14108412273878533248.d[f];
                        Object x = b14108412273878533248.x(f);
                        int i15 = d13190160240050003111.e;
                        objArr = objArr4;
                        j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, d13190160240050003111);
                        if (d13190160240050003111.e == i15) {
                            j8000059863626891400.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (b14108412273878533248.i(lowestOneBit2)) {
                        B14108412273878533248 s = b14108412273878533248.s(b14108412273878533248.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            int i16 = i + 5;
                            if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                j8000059863626891400.a++;
                            } else {
                                j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i16, d13190160240050003111);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x2 = x(f3);
                        int f4 = b14108412273878533248.f(lowestOneBit2);
                        Object obj4 = b14108412273878533248.d[f4];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, b14108412273878533248.x(f4), i + 5, d13190160240050003111.a);
                    }
                }
                objArr[length2] = j;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (b14108412273878533248.h(lowestOneBit3)) {
                    int f5 = b14108412273878533248.f(lowestOneBit3);
                    Object[] objArr5 = b141084122738785332482.d;
                    objArr5[i18] = b14108412273878533248.d[f5];
                    objArr5[i18 + 1] = b14108412273878533248.x(f5);
                    if (h(lowestOneBit3)) {
                        j8000059863626891400.a++;
                    }
                } else {
                    int f6 = f(lowestOneBit3);
                    Object[] objArr6 = b141084122738785332482.d;
                    objArr6[i18] = this.d[f6];
                    objArr6[i18 + 1] = x(f6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!e(b141084122738785332482)) {
                return b14108412273878533248.e(b141084122738785332482) ? b14108412273878533248 : b141084122738785332482;
            }
        }
        return this;
    }

    public final B14108412273878533248 n(int i, Object obj, int i2, D13190160240050003111 d13190160240050003111) {
        B14108412273878533248 n;
        int k = 1 << T8598786036980488824.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (S10823041268949770285.t(obj, this.d[f])) {
                return p(f, k, d13190160240050003111);
            }
        } else if (i(k)) {
            int t = t(k);
            B14108412273878533248 s = s(t);
            if (i2 == 30) {
                I12982432556619280823 L = W7808703833045379622.L(W7808703833045379622.N(0, s.d.length), 2);
                int i3 = L.a;
                int i4 = L.b;
                int i5 = L.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!S10823041268949770285.t(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, d13190160240050003111);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, d13190160240050003111);
            return q(s, n, t, k, d13190160240050003111.a);
        }
        return this;
    }

    public final B14108412273878533248 o(int i, Object obj, Object obj2, int i2, D13190160240050003111 d13190160240050003111) {
        D13190160240050003111 d131901602400500031112;
        B14108412273878533248 o2;
        int k = 1 << T8598786036980488824.k(i, i2);
        if (h(k)) {
            int f = f(k);
            return (S10823041268949770285.t(obj, this.d[f]) && S10823041268949770285.t(obj2, x(f))) ? p(f, k, d13190160240050003111) : this;
        }
        if (!i(k)) {
            return this;
        }
        int t = t(k);
        B14108412273878533248 s = s(t);
        if (i2 == 30) {
            I12982432556619280823 L = W7808703833045379622.L(W7808703833045379622.N(0, s.d.length), 2);
            int i3 = L.a;
            int i4 = L.b;
            int i5 = L.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!S10823041268949770285.t(obj, s.d[i3]) || !S10823041268949770285.t(obj2, s.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        o2 = s.k(i3, d13190160240050003111);
                        break;
                    }
                }
                d131901602400500031112 = d13190160240050003111;
            }
            o2 = s;
            d131901602400500031112 = d13190160240050003111;
        } else {
            d131901602400500031112 = d13190160240050003111;
            o2 = s.o(i, obj, obj2, i2 + 5, d131901602400500031112);
        }
        return q(s, o2, t, k, d131901602400500031112.a);
    }

    public final B14108412273878533248 p(int i, int i2, D13190160240050003111 d13190160240050003111) {
        d13190160240050003111.i(d13190160240050003111.e - 1);
        d13190160240050003111.c = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != d13190160240050003111.a) {
            return new B14108412273878533248(i2 ^ this.a, this.b, T8598786036980488824.v(i, objArr), d13190160240050003111.a);
        }
        this.d = T8598786036980488824.v(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final B14108412273878533248 q(B14108412273878533248 b14108412273878533248, B14108412273878533248 b141084122738785332482, int i, int i2, J3301701597851028733 j3301701597851028733) {
        J3301701597851028733 j33017015978510287332 = this.c;
        if (b141084122738785332482 != null) {
            return (j33017015978510287332 == j3301701597851028733 || b14108412273878533248 != b141084122738785332482) ? r(i, b141084122738785332482, j3301701597851028733) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (j33017015978510287332 != j3301701597851028733) {
            return new B14108412273878533248(this.a, this.b ^ i2, T8598786036980488824.w(i, objArr), j3301701597851028733);
        }
        this.d = T8598786036980488824.w(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final B14108412273878533248 r(int i, B14108412273878533248 b14108412273878533248, J3301701597851028733 j3301701597851028733) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && b14108412273878533248.d.length == 2 && b14108412273878533248.b == 0) {
            b14108412273878533248.a = this.b;
            return b14108412273878533248;
        }
        if (this.c == j3301701597851028733) {
            objArr[i] = b14108412273878533248;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = b14108412273878533248;
        return new B14108412273878533248(this.a, this.b, copyOf, j3301701597851028733);
    }

    public final B14108412273878533248 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (B14108412273878533248) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        r13.b = w(r11, r4, (dev.epro.r0.B14108412273878533248) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Q6203700555324584864 u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B14108412273878533248.u(int, int, java.lang.Object, java.lang.Object):dev.epro.r0.Q6203700555324584864");
    }

    public final B14108412273878533248 v(int i, int i2, Object obj) {
        B14108412273878533248 v;
        int k = 1 << T8598786036980488824.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (!S10823041268949770285.t(obj, this.d[f])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new B14108412273878533248(this.a ^ k, this.b, T8598786036980488824.v(f, objArr), null);
            }
        } else {
            if (!i(k)) {
                return this;
            }
            int t = t(k);
            B14108412273878533248 s = s(t);
            if (i2 == 30) {
                I12982432556619280823 L = W7808703833045379622.L(W7808703833045379622.N(0, s.d.length), 2);
                int i3 = L.a;
                int i4 = L.b;
                int i5 = L.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!S10823041268949770285.t(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new B14108412273878533248(0, 0, T8598786036980488824.v(i3, objArr2), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v != null) {
                return s != v ? w(t, k, v) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new B14108412273878533248(this.a, this.b ^ k, T8598786036980488824.w(t, objArr3), null);
            }
        }
        return null;
    }

    public final B14108412273878533248 w(int i, int i2, B14108412273878533248 b14108412273878533248) {
        Object[] objArr = b14108412273878533248.d;
        if (objArr.length != 2 || b14108412273878533248.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = b14108412273878533248;
            return new B14108412273878533248(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            b14108412273878533248.a = this.b;
            return b14108412273878533248;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        O5378677881740157249.n0(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        O5378677881740157249.n0(f + 2, f, i, copyOf2, copyOf2);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new B14108412273878533248(this.a ^ i2, this.b ^ i2, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
