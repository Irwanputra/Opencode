package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R6081921892807856809 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final short f;

    /* JADX WARN: Illegal instructions before constructor call */
    public R6081921892807856809(boolean z, Y17711880887972520074 y17711880887972520074, boolean z2, int i) {
        X354568553596380848 x354568553596380848 = W10645948712581465792.a;
        int i2 = !z ? 262152 : 262144;
        i2 = y17711880887972520074 == Y17711880887972520074.b ? i2 | 8192 : i2;
        this(z2 ? i2 : i2 | 512, y17711880887972520074 == Y17711880887972520074.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R6081921892807856809)) {
            return false;
        }
        R6081921892807856809 r6081921892807856809 = (R6081921892807856809) obj;
        return this.a == r6081921892807856809.a && this.b == r6081921892807856809.b && this.c == r6081921892807856809.c && this.d == r6081921892807856809.d && this.e == r6081921892807856809.e && this.f == r6081921892807856809.f;
    }

    public final int hashCode() {
        return (G6547577305291411977.i(G6547577305291411977.i(G6547577305291411977.i(G6547577305291411977.i(G6547577305291411977.i(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public R6081921892807856809(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = (short) 1002;
    }

    public R6081921892807856809(boolean z) {
        this(z, Y17711880887972520074.a, true, 0);
    }
}
