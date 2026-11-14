package ads_mobile_sdk;

import dev.epro.r0.C17458191457732048292;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.Z3383101362411723454;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class bm3 {
    public static final bm3 f = new bm3(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public bm3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static bm3 b() {
        return new bm3(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iH;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iH = yu.h(i4) + yu.a(((Long) this.c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.c[i2]).getClass();
                iH = yu.h(i4) + 8;
            } else if (i5 == 2) {
                sq sqVar = (sq) this.c[i2];
                int iH2 = yu.h(i4);
                int size = sqVar.size();
                iH = yu.i(size) + size + iH2;
            } else if (i5 == 3) {
                iA = ((bm3) this.c[i2]).a() + (yu.h(i4) * 2) + iA;
            } else {
                if (i5 != 5) {
                    throw new IllegalStateException(new C17458191457732048292());
                }
                ((Integer) this.c[i2]).getClass();
                iH = yu.h(i4) + 4;
            }
            iA = iH + iA;
        }
        this.d = iA;
        return iA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bm3)) {
            bm3 bm3Var = (bm3) obj;
            int i = this.a;
            if (i == bm3Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = bm3Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = bm3Var.c;
                        int i3 = this.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    }
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final void a(int i, Object obj) {
        if (this.e) {
            a(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        Z3383101362411723454.t();
    }

    public final void a(w8 w8Var) {
        yu yuVar = (yu) w8Var.a;
        if (this.a == 0) {
            return;
        }
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                yuVar.e(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                yuVar.d(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                yuVar.b(i3, (sq) obj);
            } else if (i4 == 3) {
                yuVar.g(i3, 3);
                ((bm3) obj).a(w8Var);
                yuVar.g(i3, 4);
            } else if (i4 == 5) {
                yuVar.e(i3, ((Integer) obj).intValue());
            } else {
                Q11088980322693754445.k(new C17458191457732048292());
                return;
            }
        }
    }
}
