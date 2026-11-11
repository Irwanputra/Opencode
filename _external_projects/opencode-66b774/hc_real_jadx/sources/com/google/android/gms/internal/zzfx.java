package com.google.android.gms.internal;

import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfx implements zzhd {
    private zzos zzawp;

    public zzfx(zzos zzosVar) {
        this.zzawp = zzosVar;
    }

    @Override // com.google.android.gms.internal.zzhd
    public final View zzgd() {
        zzos zzosVar = this.zzawp;
        if (zzosVar != null) {
            return zzosVar.zzkj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.zzhd
    public final boolean zzge() {
        return this.zzawp == null;
    }

    @Override // com.google.android.gms.internal.zzhd
    public final zzhd zzgf() {
        return this;
    }
}
