package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pz2 extends ads_mobile_sdk.sq {
    public static final int[] i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int d;
    public final ads_mobile_sdk.sq e;
    public final ads_mobile_sdk.sq f;
    public final int g;
    public final int h;

    public pz2(ads_mobile_sdk.sq sqVar, ads_mobile_sdk.sq sqVar2) {
        this.e = sqVar;
        this.f = sqVar2;
        int size = sqVar.size();
        this.g = size;
        this.d = sqVar2.size() + size;
        this.h = java.lang.Math.max(sqVar.a(), sqVar2.a()) + 1;
    }

    public static int c(int i2) {
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return i[i2];
    }

    @Override // ads_mobile_sdk.sq
    public final void a(int i2, int i3, byte[] bArr, int i4) {
        int i5 = i2 + i4;
        ads_mobile_sdk.sq sqVar = this.e;
        int i6 = this.g;
        if (i5 <= i6) {
            sqVar.a(i2, i3, bArr, i4);
            return;
        }
        ads_mobile_sdk.sq sqVar2 = this.f;
        if (i2 >= i6) {
            sqVar2.a(i2 - i6, i3, bArr, i4);
            return;
        }
        int i7 = i6 - i2;
        sqVar.a(i2, i3, bArr, i7);
        sqVar2.a(0, i3 + i7, bArr, i4 - i7);
    }

    @Override // ads_mobile_sdk.sq
    public final boolean b(ads_mobile_sdk.sq sqVar) {
        ads_mobile_sdk.oz2 oz2Var = new ads_mobile_sdk.oz2(this);
        dev.epro.r0.L8361547894089146393 l8361547894089146393B = oz2Var.next();
        ads_mobile_sdk.oz2 oz2Var2 = new ads_mobile_sdk.oz2(sqVar);
        ads_mobile_sdk.sq sqVarB = oz2Var2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = l8361547894089146393B.size() - i2;
            int size2 = sqVarB.size() - i3;
            int iMin = java.lang.Math.min(size, size2);
            if (!(i2 == 0 ? l8361547894089146393B.a(sqVarB, i3, iMin) : sqVarB.a(l8361547894089146393B, i2, iMin))) {
                return false;
            }
            i4 += iMin;
            int i5 = this.d;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                dev.epro.r0.Z3383101362411723454.r();
                return false;
            }
            if (iMin == size) {
                l8361547894089146393B = oz2Var.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
            if (iMin == size2) {
                sqVarB = oz2Var2.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new ads_mobile_sdk.mz2(this);
    }

    @Override // ads_mobile_sdk.sq
    public final int size() {
        return this.d;
    }

    @Override // ads_mobile_sdk.sq
    public final int a() {
        return this.h;
    }

    @Override // ads_mobile_sdk.sq
    public final ads_mobile_sdk.sq a(int i2, int i3) {
        return b(i2, i3);
    }

    @Override // ads_mobile_sdk.sq
    public final void a(ads_mobile_sdk.yu yuVar) {
        this.e.a(yuVar);
        this.f.a(yuVar);
    }

    @Override // ads_mobile_sdk.sq
    public final byte b(int i2) {
        int i3 = this.g;
        if (i2 < i3) {
            return this.e.b(i2);
        }
        return this.f.b(i2 - i3);
    }

    @Override // ads_mobile_sdk.sq
    public final boolean b() {
        return this.d >= c(this.h);
    }

    @Override // ads_mobile_sdk.sq
    public final int b(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        ads_mobile_sdk.sq sqVar = this.e;
        int i6 = this.g;
        if (i5 <= i6) {
            return sqVar.b(i2, i3, i4);
        }
        ads_mobile_sdk.sq sqVar2 = this.f;
        if (i3 >= i6) {
            return sqVar2.b(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return sqVar2.b(sqVar.b(i2, i3, i7), 0, i4 - i7);
    }

    @Override // ads_mobile_sdk.sq
    public final ads_mobile_sdk.sq b(int i2, int i3) {
        int i4 = this.d;
        int iA = ads_mobile_sdk.sq.a(i2, i3, i4);
        if (iA == 0) {
            return ads_mobile_sdk.sq.b;
        }
        if (iA == i4) {
            return this;
        }
        ads_mobile_sdk.sq sqVar = this.e;
        int i5 = this.g;
        if (i3 <= i5) {
            return sqVar.a(i2, i3);
        }
        ads_mobile_sdk.sq sqVar2 = this.f;
        if (i2 >= i5) {
            return sqVar2.a(i2 - i5, i3 - i5);
        }
        return new ads_mobile_sdk.pz2(sqVar.a(i2, sqVar.size()), sqVar2.a(0, i3 - i5));
    }
}
