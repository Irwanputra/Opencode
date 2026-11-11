package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzek extends zzet {
    public zzek(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 61);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        long longValue = ((Long) this.zzakw.invoke(null, this.zzagr.getContext(), Boolean.valueOf(this.zzagr.zzan()))).longValue();
        synchronized (this.zzako) {
            this.zzako.zzey = Long.valueOf(longValue);
        }
    }
}
