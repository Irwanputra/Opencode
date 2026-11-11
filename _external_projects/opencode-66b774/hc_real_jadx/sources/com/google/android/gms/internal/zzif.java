package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzif implements zzhj {
    private /* synthetic */ zzid zzbaw;

    public zzif(zzid zzidVar) {
        this.zzbaw = zzidVar;
    }

    @Override // com.google.android.gms.internal.zzhj
    public final void zzg(boolean z) {
        if (z) {
            this.zzbaw.connect();
        } else {
            this.zzbaw.disconnect();
        }
    }
}
