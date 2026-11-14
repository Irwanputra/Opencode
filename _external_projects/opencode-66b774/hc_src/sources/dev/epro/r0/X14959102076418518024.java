package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X14959102076418518024 implements B13906740428466697912, A6527624962738679687 {
    public final float a;
    public final boolean b;
    public final U15384774985926769650 c;
    public final float d;

    public X14959102076418518024(float f, boolean z, U15384774985926769650 u15384774985926769650) {
        this.a = f;
        this.b = z;
        this.c = u15384774985926769650;
        this.d = f;
    }

    @Override // dev.epro.r0.B13906740428466697912, dev.epro.r0.A6527624962738679687
    public final float a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X14959102076418518024)) {
            return false;
        }
        X14959102076418518024 x14959102076418518024 = (X14959102076418518024) obj;
        return A891803927997771281.b(this.a, x14959102076418518024.a) && this.b == x14959102076418518024.b && S10823041268949770285.t(this.c, x14959102076418518024.c);
    }

    @Override // dev.epro.r0.B13906740428466697912
    public final void f(R8540738700654750557 r8540738700654750557, int i, int[] iArr, F10342546226345611902 f10342546226345611902, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int g0 = r8540738700654750557.g0(this.a);
        boolean z = this.b && f10342546226345611902 == F10342546226345611902.b;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = Math.min(g0, max);
                i = iArr2[i5] - i4;
                i3++;
                i5++;
            }
            i2 = i + i4;
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                int min = Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = Math.min(g0, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        if (this.c == null || i2 <= 0) {
            return;
        }
        int round = Math.round((1.0f + (f10342546226345611902 == F10342546226345611902.a ? -1.0f : 1.0f)) * (i2 / 2.0f));
        if (z) {
            round -= i2;
        }
        if (round != 0) {
            int length3 = iArr2.length;
            for (int i12 = 0; i12 < length3; i12++) {
                iArr2[i12] = iArr2[i12] + round;
            }
        }
    }

    public final int hashCode() {
        int i = G6547577305291411977.i(Float.hashCode(this.a) * 31, 31, this.b);
        U15384774985926769650 u15384774985926769650 = this.c;
        return i + (u15384774985926769650 == null ? 0 : u15384774985926769650.hashCode());
    }

    @Override // dev.epro.r0.A6527624962738679687
    public final void o(R8540738700654750557 r8540738700654750557, int i, int[] iArr, int[] iArr2) {
        f(r8540738700654750557, i, iArr, F10342546226345611902.a, iArr2);
    }

    public final String toString() {
        return (this.b ? "" : "Absolute") + "Arrangement#spacedAligned(" + A891803927997771281.c(this.a) + ", " + this.c + ")";
    }
}
