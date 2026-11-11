package com.google.android.gms.internal;

import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzws implements View.OnClickListener {
    private /* synthetic */ zzwr zzcgy;

    public zzws(zzwr zzwrVar) {
        this.zzcgy = zzwrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzcgy.zzl(true);
    }
}
