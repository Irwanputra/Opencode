package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F4816433342645112776 extends M18082356575916498704 {
    public final int e;
    public final int f;

    public F4816433342645112776(byte[] bArr, int i, int i2) {
        super(bArr);
        N17666688112968464504.c(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // dev.epro.r0.M18082356575916498704, dev.epro.r0.N17666688112968464504
    public final byte b(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(G6547577305291411977.n(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(E12098517352909843120.l("Index > length: ", i, i2, ", "));
    }

    @Override // dev.epro.r0.M18082356575916498704, dev.epro.r0.N17666688112968464504
    public final void j(int i, byte[] bArr) {
        System.arraycopy(this.d, this.e, bArr, 0, i);
    }

    @Override // dev.epro.r0.M18082356575916498704
    public final int l() {
        return this.e;
    }

    @Override // dev.epro.r0.M18082356575916498704
    public final byte m(int i) {
        return this.d[this.e + i];
    }

    @Override // dev.epro.r0.M18082356575916498704, dev.epro.r0.N17666688112968464504
    public final int size() {
        return this.f;
    }
}
