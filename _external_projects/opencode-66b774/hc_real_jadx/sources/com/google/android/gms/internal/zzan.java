package com.google.android.gms.internal;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzan extends FilterInputStream {
    private long bytesRead;
    private final long zzcc;

    public zzan(InputStream inputStream, long j) {
        super(inputStream);
        this.zzcc = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.bytesRead++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.bytesRead += read;
        }
        return read;
    }

    public final long zzn() {
        return this.zzcc - this.bytesRead;
    }
}
