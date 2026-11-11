package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzeo extends zzet {
    private static final Object zzakl = new Object();
    private static volatile Long zzakt;

    public zzeo(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 33);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        if (zzakt == null) {
            synchronized (zzakl) {
                if (zzakt == null) {
                    zzakt = (Long) this.zzakw.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzako) {
            this.zzako.zzdz = zzakt;
        }
    }
}
