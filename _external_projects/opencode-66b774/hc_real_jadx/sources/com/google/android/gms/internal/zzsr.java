package com.google.android.gms.internal;

import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzsr extends zzkf {
    private /* synthetic */ zzse zzbzd;

    public zzsr(zzse zzseVar) {
        this.zzbzd = zzseVar;
    }

    @Override // com.google.android.gms.internal.zzke
    public final void onAdClicked() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzss(this));
    }
}
