package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdy extends zzet {
    private static volatile String zzakk;
    private static final Object zzakl = new Object();

    public zzdy(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 29);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        this.zzako.zzdw = "E";
        if (zzakk == null) {
            synchronized (zzakl) {
                if (zzakk == null) {
                    zzakk = (String) this.zzakw.invoke(null, this.zzagr.getContext());
                }
            }
        }
        synchronized (this.zzako) {
            this.zzako.zzdw = zzbu.zza(zzakk.getBytes(), true);
        }
    }
}
