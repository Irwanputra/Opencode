package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B14108412273878533248 {
    public static final dev.epro.r0.B14108412273878533248 e = new dev.epro.r0.B14108412273878533248(0, 0, new java.lang.Object[0], null);
    public int a;
    public int b;
    public final dev.epro.r0.J3301701597851028733 c;
    public java.lang.Object[] d;

    public B14108412273878533248(int i, int i2, java.lang.Object[] objArr, dev.epro.r0.J3301701597851028733 j3301701597851028733) {
        this.a = i;
        this.b = i2;
        this.c = j3301701597851028733;
        this.d = objArr;
    }

    public static dev.epro.r0.B14108412273878533248 j(int i, java.lang.Object obj, java.lang.Object obj2, int i2, java.lang.Object obj3, java.lang.Object obj4, int i3, dev.epro.r0.J3301701597851028733 j3301701597851028733) {
        if (i3 > 30) {
            return new dev.epro.r0.B14108412273878533248(0, 0, new java.lang.Object[]{obj, obj2, obj3, obj4}, j3301701597851028733);
        }
        int iK = dev.epro.r0.T8598786036980488824.k(i, i3);
        int iK2 = dev.epro.r0.T8598786036980488824.k(i2, i3);
        if (iK != iK2) {
            return new dev.epro.r0.B14108412273878533248((1 << iK) | (1 << iK2), 0, iK < iK2 ? new java.lang.Object[]{obj, obj2, obj3, obj4} : new java.lang.Object[]{obj3, obj4, obj, obj2}, j3301701597851028733);
        }
        return new dev.epro.r0.B14108412273878533248(0, 1 << iK, new java.lang.Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, j3301701597851028733)}, j3301701597851028733);
    }

    public final java.lang.Object[] a(int i, int i2, int i3, java.lang.Object obj, java.lang.Object obj2, int i4, dev.epro.r0.J3301701597851028733 j3301701597851028733) {
        java.lang.Object obj3 = this.d[i];
        dev.epro.r0.B14108412273878533248 b14108412273878533248J = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, j3301701597851028733);
        int iT = t(i2);
        int i5 = iT + 1;
        java.lang.Object[] objArr = this.d;
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        dev.epro.r0.O5378677881740157249.s0(0, i, 6, objArr, objArr2);
        dev.epro.r0.O5378677881740157249.n0(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = b14108412273878533248J;
        dev.epro.r0.O5378677881740157249.n0(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = java.lang.Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(java.lang.Object obj) {
        dev.epro.r0.I12982432556619280823 i12982432556619280823L = dev.epro.r0.W7808703833045379622.L(dev.epro.r0.W7808703833045379622.N(0, this.d.length), 2);
        int i = i12982432556619280823L.a;
        int i2 = i12982432556619280823L.b;
        int i3 = i12982432556619280823L.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!dev.epro.r0.S10823041268949770285.t(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, java.lang.Object obj) {
        int iK = 1 << dev.epro.r0.T8598786036980488824.k(i, i2);
        if (h(iK)) {
            return dev.epro.r0.S10823041268949770285.t(obj, this.d[f(iK)]);
        }
        if (!i(iK)) {
            return false;
        }
        dev.epro.r0.B14108412273878533248 b14108412273878533248S = s(t(iK));
        return i2 == 30 ? b14108412273878533248S.c(obj) : b14108412273878533248S.d(i, i2 + 5, obj);
    }

    public final boolean e(dev.epro.r0.B14108412273878533248 b14108412273878533248) {
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
        return java.lang.Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final java.lang.Object g(int i, int i2, java.lang.Object obj) {
        int iK = 1 << dev.epro.r0.T8598786036980488824.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (dev.epro.r0.S10823041268949770285.t(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iK)) {
            return null;
        }
        dev.epro.r0.B14108412273878533248 b14108412273878533248S = s(t(iK));
        if (i2 != 30) {
            return b14108412273878533248S.g(i, i2 + 5, obj);
        }
        dev.epro.r0.I12982432556619280823 i12982432556619280823L = dev.epro.r0.W7808703833045379622.L(dev.epro.r0.W7808703833045379622.N(0, b14108412273878533248S.d.length), 2);
        int i3 = i12982432556619280823L.a;
        int i4 = i12982432556619280823L.b;
        int i5 = i12982432556619280823L.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!dev.epro.r0.S10823041268949770285.t(obj, b14108412273878533248S.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return b14108412273878533248S.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final dev.epro.r0.B14108412273878533248 k(int i, dev.epro.r0.D13190160240050003111 d13190160240050003111) {
        d13190160240050003111.i(d13190160240050003111.e - 1);
        d13190160240050003111.c = x(i);
        java.lang.Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != d13190160240050003111.a) {
            return new dev.epro.r0.B14108412273878533248(0, 0, dev.epro.r0.T8598786036980488824.v(i, objArr), d13190160240050003111.a);
        }
        this.d = dev.epro.r0.T8598786036980488824.v(i, objArr);
        return this;
    }

    public final dev.epro.r0.B14108412273878533248 l(int i, java.lang.Object obj, java.lang.Object obj2, int i2, dev.epro.r0.D13190160240050003111 d13190160240050003111) {
        dev.epro.r0.D13190160240050003111 d131901602400500031112;
        dev.epro.r0.B14108412273878533248 b14108412273878533248L;
        int iK = 1 << dev.epro.r0.T8598786036980488824.k(i, i2);
        boolean zH = h(iK);
        dev.epro.r0.J3301701597851028733 j3301701597851028733 = this.c;
        if (zH) {
            int iF = f(iK);
            if (!dev.epro.r0.S10823041268949770285.t(obj, this.d[iF])) {
                d13190160240050003111.i(d13190160240050003111.e + 1);
                dev.epro.r0.J3301701597851028733 j33017015978510287332 = d13190160240050003111.a;
                if (j3301701597851028733 != j33017015978510287332) {
                    return new dev.epro.r0.B14108412273878533248(this.a ^ iK, this.b | iK, a(iF, iK, i, obj, obj2, i2, j33017015978510287332), j33017015978510287332);
                }
                this.d = a(iF, iK, i, obj, obj2, i2, j33017015978510287332);
                this.a ^= iK;
                this.b |= iK;
                return this;
            }
            d13190160240050003111.c = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (j3301701597851028733 == d13190160240050003111.a) {
                this.d[iF + 1] = obj2;
                return this;
            }
            d13190160240050003111.d++;
            java.lang.Object[] objArr = this.d;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new dev.epro.r0.B14108412273878533248(this.a, this.b, objArrCopyOf, d13190160240050003111.a);
        }
        if (!i(iK)) {
            d13190160240050003111.i(d13190160240050003111.e + 1);
            dev.epro.r0.J3301701597851028733 j33017015978510287333 = d13190160240050003111.a;
            int iF2 = f(iK);
            java.lang.Object[] objArr2 = this.d;
            if (j3301701597851028733 != j33017015978510287333) {
                return new dev.epro.r0.B14108412273878533248(this.a | iK, this.b, dev.epro.r0.T8598786036980488824.l(objArr2, iF2, obj, obj2), j33017015978510287333);
            }
            this.d = dev.epro.r0.T8598786036980488824.l(objArr2, iF2, obj, obj2);
            this.a |= iK;
            return this;
        }
        int iT = t(iK);
        dev.epro.r0.B14108412273878533248 b14108412273878533248S = s(iT);
        if (i2 == 30) {
            dev.epro.r0.I12982432556619280823 i12982432556619280823L = dev.epro.r0.W7808703833045379622.L(dev.epro.r0.W7808703833045379622.N(0, b14108412273878533248S.d.length), 2);
            int i3 = i12982432556619280823L.a;
            int i4 = i12982432556619280823L.b;
            int i5 = i12982432556619280823L.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                d13190160240050003111.i(d13190160240050003111.e + 1);
                b14108412273878533248L = new dev.epro.r0.B14108412273878533248(0, 0, dev.epro.r0.T8598786036980488824.l(b14108412273878533248S.d, 0, obj, obj2), d13190160240050003111.a);
                d131901602400500031112 = d13190160240050003111;
            } else {
                while (!dev.epro.r0.S10823041268949770285.t(obj, b14108412273878533248S.d[i3])) {
                    if (i3 == i4) {
                        d13190160240050003111.i(d13190160240050003111.e + 1);
                        b14108412273878533248L = new dev.epro.r0.B14108412273878533248(0, 0, dev.epro.r0.T8598786036980488824.l(b14108412273878533248S.d, 0, obj, obj2), d13190160240050003111.a);
                        break;
                    }
                    i3 += i5;
                }
                d13190160240050003111.c = b14108412273878533248S.x(i3);
                if (b14108412273878533248S.c == d13190160240050003111.a) {
                    b14108412273878533248S.d[i3 + 1] = obj2;
                    b14108412273878533248L = b14108412273878533248S;
                } else {
                    d13190160240050003111.d++;
                    java.lang.Object[] objArr3 = b14108412273878533248S.d;
                    java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    b14108412273878533248L = new dev.epro.r0.B14108412273878533248(0, 0, objArrCopyOf2, d13190160240050003111.a);
                }
                d131901602400500031112 = d13190160240050003111;
            }
        } else {
            d131901602400500031112 = d13190160240050003111;
            b14108412273878533248L = b14108412273878533248S.l(i, obj, obj2, i2 + 5, d131901602400500031112);
        }
        return b14108412273878533248S == b14108412273878533248L ? this : r(iT, b14108412273878533248L, d131901602400500031112.a);
    }

    public final dev.epro.r0.B14108412273878533248 m(dev.epro.r0.B14108412273878533248 b14108412273878533248, int i, dev.epro.r0.J8000059863626891400 j8000059863626891400, dev.epro.r0.D13190160240050003111 d13190160240050003111) {
        java.lang.Object[] objArr;
        dev.epro.r0.B14108412273878533248 b14108412273878533248J;
        if (this == b14108412273878533248) {
            j8000059863626891400.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            dev.epro.r0.J3301701597851028733 j3301701597851028733 = d13190160240050003111.a;
            int i3 = b14108412273878533248.b;
            java.lang.Object[] objArr2 = this.d;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, objArr2.length + b14108412273878533248.d.length);
            int length = this.d.length;
            dev.epro.r0.I12982432556619280823 i12982432556619280823L = dev.epro.r0.W7808703833045379622.L(dev.epro.r0.W7808703833045379622.N(0, b14108412273878533248.d.length), 2);
            int i4 = i12982432556619280823L.a;
            int i5 = i12982432556619280823L.b;
            int i6 = i12982432556619280823L.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(b14108412273878533248.d[i4])) {
                        j8000059863626891400.a++;
                    } else {
                        java.lang.Object[] objArr3 = b14108412273878533248.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == b14108412273878533248.d.length ? b14108412273878533248 : length == objArrCopyOf.length ? new dev.epro.r0.B14108412273878533248(0, 0, objArrCopyOf, j3301701597851028733) : new dev.epro.r0.B14108412273878533248(0, 0, java.util.Arrays.copyOf(objArrCopyOf, length), j3301701597851028733);
            }
        } else {
            int i7 = this.b | b14108412273878533248.b;
            int i8 = this.a;
            int i9 = b14108412273878533248.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = java.lang.Integer.lowestOneBit(i11);
                if (dev.epro.r0.S10823041268949770285.t(this.d[f(iLowestOneBit)], b14108412273878533248.d[b14108412273878533248.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                dev.epro.r0.L4738636499147270068.b("Check failed.");
            }
            dev.epro.r0.B14108412273878533248 b141084122738785332482 = (dev.epro.r0.S10823041268949770285.t(this.c, d13190160240050003111.a) && this.a == i12 && this.b == i7) ? this : new dev.epro.r0.B14108412273878533248(i12, i7, new java.lang.Object[java.lang.Integer.bitCount(i7) + (java.lang.Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = java.lang.Integer.lowestOneBit(i13);
                java.lang.Object[] objArr4 = b141084122738785332482.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    b14108412273878533248J = s(t(iLowestOneBit2));
                    if (b14108412273878533248.i(iLowestOneBit2)) {
                        b14108412273878533248J = b14108412273878533248J.m(b14108412273878533248.s(b14108412273878533248.t(iLowestOneBit2)), i + 5, j8000059863626891400, d13190160240050003111);
                        objArr = objArr4;
                    } else if (b14108412273878533248.h(iLowestOneBit2)) {
                        int iF = b14108412273878533248.f(iLowestOneBit2);
                        java.lang.Object obj = b14108412273878533248.d[iF];
                        java.lang.Object objX = b14108412273878533248.x(iF);
                        int i15 = d13190160240050003111.e;
                        objArr = objArr4;
                        b14108412273878533248J = b14108412273878533248J.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, d13190160240050003111);
                        if (d13190160240050003111.e == i15) {
                            j8000059863626891400.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (b14108412273878533248.i(iLowestOneBit2)) {
                        dev.epro.r0.B14108412273878533248 b14108412273878533248S = b14108412273878533248.s(b14108412273878533248.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            java.lang.Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (b14108412273878533248S.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                j8000059863626891400.a++;
                                b14108412273878533248J = b14108412273878533248S;
                            } else {
                                b14108412273878533248J = b14108412273878533248S.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, d13190160240050003111);
                            }
                        } else {
                            b14108412273878533248J = b14108412273878533248S;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        java.lang.Object obj3 = this.d[iF3];
                        java.lang.Object objX2 = x(iF3);
                        int iF4 = b14108412273878533248.f(iLowestOneBit2);
                        java.lang.Object obj4 = b14108412273878533248.d[iF4];
                        b14108412273878533248J = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, b14108412273878533248.x(iF4), i + 5, d13190160240050003111.a);
                    }
                }
                objArr[length2] = b14108412273878533248J;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = java.lang.Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (b14108412273878533248.h(iLowestOneBit3)) {
                    int iF5 = b14108412273878533248.f(iLowestOneBit3);
                    java.lang.Object[] objArr5 = b141084122738785332482.d;
                    objArr5[i18] = b14108412273878533248.d[iF5];
                    objArr5[i18 + 1] = b14108412273878533248.x(iF5);
                    if (h(iLowestOneBit3)) {
                        j8000059863626891400.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    java.lang.Object[] objArr6 = b141084122738785332482.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(b141084122738785332482)) {
                return b14108412273878533248.e(b141084122738785332482) ? b14108412273878533248 : b141084122738785332482;
            }
        }
        return this;
    }

    public final dev.epro.r0.B14108412273878533248 n(int i, java.lang.Object obj, int i2, dev.epro.r0.D13190160240050003111 d13190160240050003111) {
        dev.epro.r0.B14108412273878533248 b14108412273878533248N;
        int iK = 1 << dev.epro.r0.T8598786036980488824.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (dev.epro.r0.S10823041268949770285.t(obj, this.d[iF])) {
                return p(iF, iK, d13190160240050003111);
            }
        } else if (i(iK)) {
            int iT = t(iK);
            dev.epro.r0.B14108412273878533248 b14108412273878533248S = s(iT);
            if (i2 == 30) {
                dev.epro.r0.I12982432556619280823 i12982432556619280823L = dev.epro.r0.W7808703833045379622.L(dev.epro.r0.W7808703833045379622.N(0, b14108412273878533248S.d.length), 2);
                int i3 = i12982432556619280823L.a;
                int i4 = i12982432556619280823L.b;
                int i5 = i12982432556619280823L.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    b14108412273878533248N = b14108412273878533248S;
                    break;
                }
                while (!dev.epro.r0.S10823041268949770285.t(obj, b14108412273878533248S.d[i3])) {
                    if (i3 == i4) {
                        b14108412273878533248N = b14108412273878533248S;
                        break;
                    }
                    i3 += i5;
                }
                b14108412273878533248N = b14108412273878533248S.k(i3, d13190160240050003111);
            } else {
                b14108412273878533248N = b14108412273878533248S.n(i, obj, i2 + 5, d13190160240050003111);
            }
            return q(b14108412273878533248S, b14108412273878533248N, iT, iK, d13190160240050003111.a);
        }
        return this;
    }

    public final dev.epro.r0.B14108412273878533248 o(int i, java.lang.Object obj, java.lang.Object obj2, int i2, dev.epro.r0.D13190160240050003111 d13190160240050003111) {
        dev.epro.r0.D13190160240050003111 d131901602400500031112;
        dev.epro.r0.B14108412273878533248 b14108412273878533248O;
        int iK = 1 << dev.epro.r0.T8598786036980488824.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            return (dev.epro.r0.S10823041268949770285.t(obj, this.d[iF]) && dev.epro.r0.S10823041268949770285.t(obj2, x(iF))) ? p(iF, iK, d13190160240050003111) : this;
        }
        if (!i(iK)) {
            return this;
        }
        int iT = t(iK);
        dev.epro.r0.B14108412273878533248 b14108412273878533248S = s(iT);
        if (i2 == 30) {
            dev.epro.r0.I12982432556619280823 i12982432556619280823L = dev.epro.r0.W7808703833045379622.L(dev.epro.r0.W7808703833045379622.N(0, b14108412273878533248S.d.length), 2);
            int i3 = i12982432556619280823L.a;
            int i4 = i12982432556619280823L.b;
            int i5 = i12982432556619280823L.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                b14108412273878533248O = b14108412273878533248S;
                d131901602400500031112 = d13190160240050003111;
            } else {
                while (true) {
                    if (!dev.epro.r0.S10823041268949770285.t(obj, b14108412273878533248S.d[i3]) || !dev.epro.r0.S10823041268949770285.t(obj2, b14108412273878533248S.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        b14108412273878533248O = b14108412273878533248S.k(i3, d13190160240050003111);
                        break;
                    }
                }
                b14108412273878533248O = b14108412273878533248S;
                d131901602400500031112 = d13190160240050003111;
            }
        } else {
            d131901602400500031112 = d13190160240050003111;
            b14108412273878533248O = b14108412273878533248S.o(i, obj, obj2, i2 + 5, d131901602400500031112);
        }
        return q(b14108412273878533248S, b14108412273878533248O, iT, iK, d131901602400500031112.a);
    }

    public final dev.epro.r0.B14108412273878533248 p(int i, int i2, dev.epro.r0.D13190160240050003111 d13190160240050003111) {
        d13190160240050003111.i(d13190160240050003111.e - 1);
        d13190160240050003111.c = x(i);
        java.lang.Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != d13190160240050003111.a) {
            return new dev.epro.r0.B14108412273878533248(i2 ^ this.a, this.b, dev.epro.r0.T8598786036980488824.v(i, objArr), d13190160240050003111.a);
        }
        this.d = dev.epro.r0.T8598786036980488824.v(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final dev.epro.r0.B14108412273878533248 q(dev.epro.r0.B14108412273878533248 b14108412273878533248, dev.epro.r0.B14108412273878533248 b141084122738785332482, int i, int i2, dev.epro.r0.J3301701597851028733 j3301701597851028733) {
        dev.epro.r0.J3301701597851028733 j33017015978510287332 = this.c;
        if (b141084122738785332482 != null) {
            return (j33017015978510287332 == j3301701597851028733 || b14108412273878533248 != b141084122738785332482) ? r(i, b141084122738785332482, j3301701597851028733) : this;
        }
        java.lang.Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (j33017015978510287332 != j3301701597851028733) {
            return new dev.epro.r0.B14108412273878533248(this.a, this.b ^ i2, dev.epro.r0.T8598786036980488824.w(i, objArr), j3301701597851028733);
        }
        this.d = dev.epro.r0.T8598786036980488824.w(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final dev.epro.r0.B14108412273878533248 r(int i, dev.epro.r0.B14108412273878533248 b14108412273878533248, dev.epro.r0.J3301701597851028733 j3301701597851028733) {
        java.lang.Object[] objArr = this.d;
        if (objArr.length == 1 && b14108412273878533248.d.length == 2 && b14108412273878533248.b == 0) {
            b14108412273878533248.a = this.b;
            return b14108412273878533248;
        }
        if (this.c == j3301701597851028733) {
            objArr[i] = b14108412273878533248;
            return this;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = b14108412273878533248;
        return new dev.epro.r0.B14108412273878533248(this.a, this.b, objArrCopyOf, j3301701597851028733);
    }

    public final dev.epro.r0.B14108412273878533248 s(int i) {
        java.lang.Object obj = this.d[i];
        obj.getClass();
        return (dev.epro.r0.B14108412273878533248) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - java.lang.Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r13.b = w(r11, r4, (dev.epro.r0.B14108412273878533248) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Q6203700555324584864 u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B14108412273878533248.u(int, int, java.lang.Object, java.lang.Object):dev.epro.r0.Q6203700555324584864");
    }

    public final dev.epro.r0.B14108412273878533248 v(int i, int i2, java.lang.Object obj) {
        dev.epro.r0.B14108412273878533248 b14108412273878533248V;
        int iK = 1 << dev.epro.r0.T8598786036980488824.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (!dev.epro.r0.S10823041268949770285.t(obj, this.d[iF])) {
                return this;
            }
            java.lang.Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new dev.epro.r0.B14108412273878533248(this.a ^ iK, this.b, dev.epro.r0.T8598786036980488824.v(iF, objArr), null);
            }
        } else {
            if (!i(iK)) {
                return this;
            }
            int iT = t(iK);
            dev.epro.r0.B14108412273878533248 b14108412273878533248S = s(iT);
            if (i2 == 30) {
                dev.epro.r0.I12982432556619280823 i12982432556619280823L = dev.epro.r0.W7808703833045379622.L(dev.epro.r0.W7808703833045379622.N(0, b14108412273878533248S.d.length), 2);
                int i3 = i12982432556619280823L.a;
                int i4 = i12982432556619280823L.b;
                int i5 = i12982432556619280823L.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    b14108412273878533248V = b14108412273878533248S;
                    break;
                }
                while (!dev.epro.r0.S10823041268949770285.t(obj, b14108412273878533248S.d[i3])) {
                    if (i3 == i4) {
                        b14108412273878533248V = b14108412273878533248S;
                        break;
                    }
                    i3 += i5;
                }
                java.lang.Object[] objArr2 = b14108412273878533248S.d;
                b14108412273878533248V = objArr2.length == 2 ? null : new dev.epro.r0.B14108412273878533248(0, 0, dev.epro.r0.T8598786036980488824.v(i3, objArr2), null);
            } else {
                b14108412273878533248V = b14108412273878533248S.v(i, i2 + 5, obj);
            }
            if (b14108412273878533248V != null) {
                return b14108412273878533248S != b14108412273878533248V ? w(iT, iK, b14108412273878533248V) : this;
            }
            java.lang.Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new dev.epro.r0.B14108412273878533248(this.a, this.b ^ iK, dev.epro.r0.T8598786036980488824.w(iT, objArr3), null);
            }
        }
        return null;
    }

    public final dev.epro.r0.B14108412273878533248 w(int i, int i2, dev.epro.r0.B14108412273878533248 b14108412273878533248) {
        java.lang.Object[] objArr = b14108412273878533248.d;
        if (objArr.length != 2 || b14108412273878533248.b != 0) {
            java.lang.Object[] objArr2 = this.d;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = b14108412273878533248;
            return new dev.epro.r0.B14108412273878533248(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            b14108412273878533248.a = this.b;
            return b14108412273878533248;
        }
        int iF = f(i2);
        java.lang.Object[] objArr3 = this.d;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = objArr[1];
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length + 1);
        dev.epro.r0.O5378677881740157249.n0(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        dev.epro.r0.O5378677881740157249.n0(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new dev.epro.r0.B14108412273878533248(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final java.lang.Object x(int i) {
        return this.d[i + 1];
    }
}
