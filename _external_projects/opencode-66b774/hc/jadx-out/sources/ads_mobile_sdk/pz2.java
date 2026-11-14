package ads_mobile_sdk;

import dev.epro.r0.L8361547894089146393;
import dev.epro.r0.Z3383101362411723454;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class pz2 extends sq {
    public static final int[] i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int d;
    public final sq e;
    public final sq f;
    public final int g;
    public final int h;

    public pz2(sq sqVar, sq sqVar2) {
        this.e = sqVar;
        this.f = sqVar2;
        int size = sqVar.size();
        this.g = size;
        this.d = sqVar2.size() + size;
        this.h = Math.max(sqVar.a(), sqVar2.a()) + 1;
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
        sq sqVar = this.e;
        int i6 = this.g;
        if (i5 <= i6) {
            sqVar.a(i2, i3, bArr, i4);
            return;
        }
        sq sqVar2 = this.f;
        if (i2 >= i6) {
            sqVar2.a(i2 - i6, i3, bArr, i4);
            return;
        }
        int i7 = i6 - i2;
        sqVar.a(i2, i3, bArr, i7);
        sqVar2.a(0, i3 + i7, bArr, i4 - i7);
    }

    @Override // ads_mobile_sdk.sq
    public final boolean b(sq sqVar) {
        oz2 oz2Var = new oz2(this);
        L8361547894089146393 l8361547894089146393B = oz2Var.next();
        oz2 oz2Var2 = new oz2(sqVar);
        L8361547894089146393 l8361547894089146393B2 = oz2Var2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = l8361547894089146393B.size() - i2;
            int size2 = l8361547894089146393B2.size() - i3;
            int iMin = Math.min(size, size2);
            if (!(i2 == 0 ? l8361547894089146393B.a(l8361547894089146393B2, i3, iMin) : l8361547894089146393B2.a(l8361547894089146393B, i2, iMin))) {
                return false;
            }
            i4 += iMin;
            int i5 = this.d;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                Z3383101362411723454.r();
                return false;
            }
            if (iMin == size) {
                i2 = 0;
                l8361547894089146393B = oz2Var.next();
            } else {
                i2 += iMin;
                l8361547894089146393B = l8361547894089146393B;
            }
            if (iMin == size2) {
                l8361547894089146393B2 = oz2Var2.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mz2(this);
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
    public final sq a(int i2, int i3) {
        return b(i2, i3);
    }

    @Override // ads_mobile_sdk.sq
    public final void a(yu yuVar) {
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
        sq sqVar = this.e;
        int i6 = this.g;
        if (i5 <= i6) {
            return sqVar.b(i2, i3, i4);
        }
        sq sqVar2 = this.f;
        if (i3 >= i6) {
            return sqVar2.b(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return sqVar2.b(sqVar.b(i2, i3, i7), 0, i4 - i7);
    }

    @Override // ads_mobile_sdk.sq
    public final sq b(int i2, int i3) {
        int i4 = this.d;
        int iA = sq.a(i2, i3, i4);
        if (iA == 0) {
            return sq.b;
        }
        if (iA == i4) {
            return this;
        }
        sq sqVar = this.e;
        int i5 = this.g;
        if (i3 <= i5) {
            return sqVar.a(i2, i3);
        }
        sq sqVar2 = this.f;
        if (i2 >= i5) {
            return sqVar2.a(i2 - i5, i3 - i5);
        }
        return new pz2(sqVar.a(i2, sqVar.size()), sqVar2.a(0, i3 - i5));
    }
}
