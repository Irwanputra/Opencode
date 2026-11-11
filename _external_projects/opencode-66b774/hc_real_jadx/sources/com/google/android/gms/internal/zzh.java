package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzh implements zzaa {
    private int zzr;
    private int zzs;
    private final int zzt;
    private final float zzu;

    public zzh() {
        this(2500, 1, 1.0f);
    }

    private zzh(int i, int i2, float f) {
        this.zzr = 2500;
        this.zzt = 1;
        this.zzu = 1.0f;
    }

    @Override // com.google.android.gms.internal.zzaa
    public final void zza(zzad zzadVar) {
        int i = this.zzs + 1;
        this.zzs = i;
        int i2 = this.zzr;
        this.zzr = (int) ((i2 * this.zzu) + i2);
        if (!(i <= this.zzt)) {
            throw zzadVar;
        }
    }

    @Override // com.google.android.gms.internal.zzaa
    public final int zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.zzaa
    public final int zzc() {
        return this.zzs;
    }
}
