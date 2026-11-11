package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpi implements zzoq {
    private /* synthetic */ zzpg zzbvu;
    private /* synthetic */ View zzbvv;

    public zzpi(zzpg zzpgVar, View view) {
        this.zzbvu = zzpgVar;
        this.zzbvv = view;
    }

    @Override // com.google.android.gms.internal.zzoq
    public final void zzc(MotionEvent motionEvent) {
        this.zzbvu.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.zzoq
    public final void zzkb() {
        this.zzbvu.onClick(this.zzbvv);
    }
}
