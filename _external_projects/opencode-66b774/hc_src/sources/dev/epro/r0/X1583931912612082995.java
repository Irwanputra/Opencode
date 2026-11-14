package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X1583931912612082995 extends B15200565448991586841 {
    public final int e;
    public final int f;

    public X1583931912612082995(byte[] bArr, int i, int i2) {
        super(bArr);
        B15200565448991586841.c(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // dev.epro.r0.B15200565448991586841
    public final byte b(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(G6547577305291411977.n(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(E12098517352909843120.l("Index > length: ", i, i2, ", "));
    }

    @Override // dev.epro.r0.B15200565448991586841
    public final int j() {
        return this.e;
    }

    @Override // dev.epro.r0.B15200565448991586841
    public final byte k(int i) {
        return this.b[this.e + i];
    }

    @Override // dev.epro.r0.B15200565448991586841
    public final int size() {
        return this.f;
    }
}
