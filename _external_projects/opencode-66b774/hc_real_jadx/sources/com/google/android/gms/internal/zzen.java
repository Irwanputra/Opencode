package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzen extends zzet {
    private final zzdt zzahv;

    public zzen(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2, zzdt zzdtVar) {
        super(zzdmVar, str, str2, zzazVar, i, 53);
        this.zzahv = zzdtVar;
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        zzdt zzdtVar = this.zzahv;
        if (zzdtVar != null) {
            this.zzako.zzeo = (Long) this.zzakw.invoke(null, Long.valueOf(zzdtVar.zzaw()));
        }
    }
}
