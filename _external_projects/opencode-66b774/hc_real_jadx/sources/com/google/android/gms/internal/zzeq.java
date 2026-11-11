package com.google.android.gms.internal;

import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzeq extends zzet {
    private final View zzakj;

    public zzeq(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2, View view) {
        super(zzdmVar, str, str2, zzazVar, i, 57);
        this.zzakj = view;
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        if (this.zzakj != null) {
            zzds zzdsVar = new zzds((String) this.zzakw.invoke(null, this.zzakj, this.zzagr.getContext().getResources().getDisplayMetrics()));
            zzbb zzbbVar = new zzbb();
            zzbbVar.zzgd = zzdsVar.zzajv;
            zzbbVar.zzge = zzdsVar.zzge;
            zzbbVar.zzgf = zzdsVar.zzgf;
            this.zzako.zzeu = zzbbVar;
        }
    }
}
