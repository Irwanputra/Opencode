package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J12743056621057876892 extends A10473301933203002473 {
    @Override // dev.epro.r0.A10473301933203002473
    public final byte b(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(G6547577305291411977.n(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(G6547577305291411977.o(i, "Index > length: ", ", 47"));
    }

    @Override // dev.epro.r0.A10473301933203002473
    public final byte c(int i) {
        return this.b[i];
    }

    @Override // dev.epro.r0.A10473301933203002473
    public final int i() {
        return 47;
    }
}
