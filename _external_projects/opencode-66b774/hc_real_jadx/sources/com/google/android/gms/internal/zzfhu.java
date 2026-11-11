package com.google.android.gms.internal;

import java.io.InputStream;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfhu extends InputStream {
    private int mark;
    private zzfht zzpjp;
    private zzfey zzpjq;
    private int zzpjr;
    private int zzpjs;
    private int zzpjt;
    private /* synthetic */ zzfhq zzpju;

    public zzfhu(zzfhq zzfhqVar) {
        this.zzpju = zzfhqVar;
        initialize();
    }

    private final void initialize() {
        zzfht zzfhtVar = new zzfht(this.zzpju);
        this.zzpjp = zzfhtVar;
        zzfey zzfeyVar = (zzfey) zzfhtVar.next();
        this.zzpjq = zzfeyVar;
        this.zzpjr = zzfeyVar.size();
        this.zzpjs = 0;
        this.zzpjt = 0;
    }

    private final void zzczd() {
        if (this.zzpjq != null) {
            int i = this.zzpjs;
            int i2 = this.zzpjr;
            if (i == i2) {
                this.zzpjt += i2;
                this.zzpjs = 0;
                if (!this.zzpjp.hasNext()) {
                    this.zzpjq = null;
                    this.zzpjr = 0;
                } else {
                    zzfey zzfeyVar = (zzfey) this.zzpjp.next();
                    this.zzpjq = zzfeyVar;
                    this.zzpjr = zzfeyVar.size();
                }
            }
        }
    }

    private final int zzj(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (true) {
            if (i3 <= 0) {
                break;
            }
            zzczd();
            if (this.zzpjq != null) {
                int min = Math.min(this.zzpjr - this.zzpjs, i3);
                if (bArr != null) {
                    this.zzpjq.zza(bArr, this.zzpjs, i, min);
                    i += min;
                }
                this.zzpjs += min;
                i3 -= min;
            } else if (i3 == i2) {
                return -1;
            }
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.zzpju.size() - (this.zzpjt + this.zzpjs);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.mark = this.zzpjt + this.zzpjs;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        zzczd();
        zzfey zzfeyVar = this.zzpjq;
        if (zzfeyVar == null) {
            return -1;
        }
        int i = this.zzpjs;
        this.zzpjs = i + 1;
        return zzfeyVar.zzkn(i) & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        return zzj(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        initialize();
        zzj(null, 0, this.mark);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return zzj(null, 0, (int) j);
    }
}
