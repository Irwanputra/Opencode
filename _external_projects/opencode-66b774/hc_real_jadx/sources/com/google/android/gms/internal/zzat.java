package com.google.android.gms.internal;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzat extends ByteArrayOutputStream {
    private final zzaj zzbr;

    public zzat(zzaj zzajVar, int i) {
        this.zzbr = zzajVar;
        ((ByteArrayOutputStream) this).buf = zzajVar.zzb(Math.max(i, NotificationCompat.FLAG_LOCAL_ONLY));
    }

    private final void zzc(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] zzb = this.zzbr.zzb((i2 + i) << 1);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, zzb, 0, ((ByteArrayOutputStream) this).count);
        this.zzbr.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = zzb;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zzbr.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zzbr.zza(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zzc(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zzc(i2);
        super.write(bArr, i, i2);
    }
}
