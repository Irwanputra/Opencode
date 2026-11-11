package com.google.android.gms.internal;

import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzanj implements Runnable {
    private /* synthetic */ View val$view;
    private /* synthetic */ zzafb zzdld;
    private /* synthetic */ int zzdle;
    private /* synthetic */ zzani zzdlf;

    public zzanj(zzani zzaniVar, View view, zzafb zzafbVar, int i) {
        this.zzdlf = zzaniVar;
        this.val$view = view;
        this.zzdld = zzafbVar;
        this.zzdle = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdlf.zza(this.val$view, this.zzdld, this.zzdle - 1);
    }
}
