package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzei extends zzet {
    public zzei(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 3);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        synchronized (this.zzako) {
            zzcz zzczVar = new zzcz((String) this.zzakw.invoke(null, this.zzagr.getContext()));
            synchronized (this.zzako) {
                this.zzako.zzdc = Long.valueOf(zzczVar.zzaig);
                this.zzako.zzex = Long.valueOf(zzczVar.zzaih);
            }
        }
    }
}
