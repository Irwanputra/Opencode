package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzw<T> {
    public final T result;
    public final zzc zzbh;
    public final zzad zzbi;
    public boolean zzbj;

    private zzw(zzad zzadVar) {
        this.zzbj = false;
        this.result = null;
        this.zzbh = null;
        this.zzbi = zzadVar;
    }

    private zzw(T t, zzc zzcVar) {
        this.zzbj = false;
        this.result = t;
        this.zzbh = zzcVar;
        this.zzbi = null;
    }

    public static <T> zzw<T> zza(T t, zzc zzcVar) {
        return new zzw<>(t, zzcVar);
    }

    public static <T> zzw<T> zzc(zzad zzadVar) {
        return new zzw<>(zzadVar);
    }
}
