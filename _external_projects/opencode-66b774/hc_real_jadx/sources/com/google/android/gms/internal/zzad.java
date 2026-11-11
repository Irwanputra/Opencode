package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzad extends Exception {
    private long zzae;
    private zzp zzbk;

    public zzad() {
        this.zzbk = null;
    }

    public zzad(zzp zzpVar) {
        this.zzbk = zzpVar;
    }

    public zzad(String str) {
        super(str);
        this.zzbk = null;
    }

    public zzad(Throwable th) {
        super(th);
        this.zzbk = null;
    }

    public final void zza(long j) {
        this.zzae = j;
    }
}
