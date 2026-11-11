package com.google.android.gms.internal;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyz implements ViewTreeObserver.OnGlobalLayoutListener {
    private /* synthetic */ zzyt zzclk;
    private /* synthetic */ WeakReference zzclm;

    public zzyz(zzyt zzytVar, WeakReference weakReference) {
        this.zzclk = zzytVar;
        this.zzclm = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.zzclk.zza((WeakReference<zzanh>) this.zzclm, false);
    }
}
