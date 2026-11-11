package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzef extends zzet {
    private static final Object zzakl = new Object();
    private static volatile Long zzakp;

    public zzef(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 22);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        if (zzakp == null) {
            synchronized (zzakl) {
                if (zzakp == null) {
                    zzakp = (Long) this.zzakw.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzako) {
            this.zzako.zzdu = zzakp;
        }
    }
}
