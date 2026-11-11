package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzeh extends zzet {
    private static final Object zzakl = new Object();
    private static volatile String zzdb;

    public zzeh(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 1);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        this.zzako.zzdb = "E";
        if (zzdb == null) {
            synchronized (zzakl) {
                if (zzdb == null) {
                    zzdb = (String) this.zzakw.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzako) {
            this.zzako.zzdb = zzdb;
        }
    }
}
