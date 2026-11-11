package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfev extends zzfez {
    private final int zzpfj;
    private final int zzpfk;

    public zzfev(byte[] bArr, int i, int i2) {
        super(bArr);
        zzfes.zzh(i, i + i2, bArr.length);
        this.zzpfj = i;
        this.zzpfk = i2;
    }

    @Override // com.google.android.gms.internal.zzfez, com.google.android.gms.internal.zzfes
    public final int size() {
        return this.zzpfk;
    }

    @Override // com.google.android.gms.internal.zzfez, com.google.android.gms.internal.zzfes
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzjng, zzcvq() + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.zzfez
    public final int zzcvq() {
        return this.zzpfj;
    }

    @Override // com.google.android.gms.internal.zzfez, com.google.android.gms.internal.zzfes
    public final byte zzkn(int i) {
        zzfes.zzy(i, size());
        return this.zzjng[this.zzpfj + i];
    }
}
