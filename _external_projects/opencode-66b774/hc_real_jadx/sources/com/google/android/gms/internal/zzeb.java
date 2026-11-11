package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzeb extends zzet {
    private static final Object zzakl = new Object();
    private static volatile Long zzei;

    public zzeb(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 44);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        if (zzei == null) {
            synchronized (zzakl) {
                if (zzei == null) {
                    zzei = (Long) this.zzakw.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzako) {
            this.zzako.zzei = zzei;
        }
    }
}
