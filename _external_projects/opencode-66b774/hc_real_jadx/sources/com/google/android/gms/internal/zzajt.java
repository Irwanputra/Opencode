package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzajt extends Thread {
    private /* synthetic */ String zzcml;

    public zzajt(zzajs zzajsVar, String str) {
        this.zzcml = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzakc().zzck(this.zzcml);
    }
}
