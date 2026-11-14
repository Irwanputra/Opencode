package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C10101319439186475078 {
    public static final C10101319439186475078 f = new C10101319439186475078(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public C10101319439186475078(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static C10101319439186475078 c() {
        return new C10101319439186475078(0, new int[8], new Object[8], true);
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

    public final int b() {
        int e;
        int g;
        int e2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    e2 = A5011514514014580540.e(i5) + 8;
                } else if (i6 == 2) {
                    e2 = A5011514514014580540.a(i5, (N17666688112968464504) this.c[i3]);
                } else if (i6 == 3) {
                    e = A5011514514014580540.e(i5) * 2;
                    g = ((C10101319439186475078) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(N11355818201711573941.b());
                    }
                    ((Integer) this.c[i3]).getClass();
                    e2 = A5011514514014580540.e(i5) + 4;
                }
                i2 = e2 + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                e = A5011514514014580540.e(i5);
                g = A5011514514014580540.g(longValue);
            }
            i2 = g + e + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            Z3383101362411723454.t();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(H12843822278061842084 h12843822278061842084) {
        if (this.a == 0) {
            return;
        }
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                a5011514514014580540.w(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                a5011514514014580540.n(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                a5011514514014580540.k(i3, (N17666688112968464504) obj);
            } else if (i4 == 3) {
                a5011514514014580540.t(i3, 3);
                ((C10101319439186475078) obj).e(h12843822278061842084);
                a5011514514014580540.t(i3, 4);
            } else {
                if (i4 != 5) {
                    Q11088980322693754445.k(N11355818201711573941.b());
                    return;
                }
                a5011514514014580540.l(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10101319439186475078)) {
            return false;
        }
        C10101319439186475078 c10101319439186475078 = (C10101319439186475078) obj;
        int i = this.a;
        if (i == c10101319439186475078.a) {
            int[] iArr = this.b;
            int[] iArr2 = c10101319439186475078.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c10101319439186475078.c;
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
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
