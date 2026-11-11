package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzuc implements zzali {
    private /* synthetic */ com.google.android.gms.ads.internal.js.zzaa zzcck;
    private /* synthetic */ zzalf zzccm;

    public zzuc(zzua zzuaVar, zzalf zzalfVar, com.google.android.gms.ads.internal.js.zzaa zzaaVar) {
        this.zzccm = zzalfVar;
        this.zzcck = zzaaVar;
    }

    @Override // com.google.android.gms.internal.zzali
    public final void run() {
        this.zzccm.setException(new zzto("Unable to obtain a JavascriptEngine."));
        this.zzcck.release();
    }
}
