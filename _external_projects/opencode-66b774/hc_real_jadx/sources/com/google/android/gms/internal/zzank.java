package com.google.android.gms.internal;

import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzank implements View.OnAttachStateChangeListener {
    private /* synthetic */ zzafb zzdld;
    private /* synthetic */ zzani zzdlf;

    public zzank(zzani zzaniVar, zzafb zzafbVar) {
        this.zzdlf = zzaniVar;
        this.zzdld = zzafbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzdlf.zza(view, this.zzdld, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
