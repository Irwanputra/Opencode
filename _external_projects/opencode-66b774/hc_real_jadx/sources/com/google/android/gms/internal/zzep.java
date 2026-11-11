package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzep extends zzet {
    public zzep(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 48);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        zzaz zzazVar;
        int i;
        this.zzako.zzek = 2;
        boolean booleanValue = ((Boolean) this.zzakw.invoke(null, this.zzagr.getContext())).booleanValue();
        synchronized (this.zzako) {
            if (booleanValue) {
                zzazVar = this.zzako;
                i = 1;
            } else {
                zzazVar = this.zzako;
                i = 0;
            }
            zzazVar.zzek = i;
        }
    }
}
