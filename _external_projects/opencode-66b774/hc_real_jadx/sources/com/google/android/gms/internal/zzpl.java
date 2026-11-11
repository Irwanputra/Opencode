package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpl implements zzoq {
    private /* synthetic */ View zzbvv;
    private /* synthetic */ zzpj zzbwa;

    public zzpl(zzpj zzpjVar, View view) {
        this.zzbwa = zzpjVar;
        this.zzbvv = view;
    }

    @Override // com.google.android.gms.internal.zzoq
    public final void zzc(MotionEvent motionEvent) {
        this.zzbwa.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.zzoq
    public final void zzkb() {
        boolean zza;
        zza = this.zzbwa.zza(zzpj.zzbvj);
        if (zza) {
            this.zzbwa.onClick(this.zzbvv);
        }
    }
}
