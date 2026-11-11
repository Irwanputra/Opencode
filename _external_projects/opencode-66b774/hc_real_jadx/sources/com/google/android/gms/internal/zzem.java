package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzem extends zzet {
    public zzem(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 51);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        synchronized (this.zzako) {
            zzdl zzdlVar = new zzdl((String) this.zzakw.invoke(null, new Object[0]));
            zzaz zzazVar = this.zzako;
            zzazVar.zzem = zzdlVar.zzaip;
            zzazVar.zzen = zzdlVar.zzaiq;
        }
    }
}
