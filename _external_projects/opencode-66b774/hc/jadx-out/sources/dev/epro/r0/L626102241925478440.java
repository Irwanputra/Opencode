package dev.epro.r0;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L626102241925478440 extends FilterInputStream {
    public int a;

    public L626102241925478440(int i, FileInputStream fileInputStream) {
        super(fileInputStream);
        this.a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.a -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int iSkip = (int) super.skip(Math.min(j, this.a));
        if (iSkip >= 0) {
            this.a -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.a <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.a--;
        }
        return i;
    }
}
