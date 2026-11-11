package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzanz implements Runnable {
    private /* synthetic */ zzanx zzdmx;

    public zzanz(zzanx zzanxVar) {
        this.zzdmx = zzanxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
