package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzec extends zzet {
    private long startTime;

    public zzec(zzdm zzdmVar, String str, String str2, zzaz zzazVar, long j, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 25);
        this.startTime = j;
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        long longValue = ((Long) this.zzakw.invoke(null, new Object[0])).longValue();
        synchronized (this.zzako) {
            this.zzako.zzfh = Long.valueOf(longValue);
            long j = this.startTime;
            if (j != 0) {
                this.zzako.zzdq = Long.valueOf(longValue - j);
                this.zzako.zzdv = Long.valueOf(this.startTime);
            }
        }
    }
}
