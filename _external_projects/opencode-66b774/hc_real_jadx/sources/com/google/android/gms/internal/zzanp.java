package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzanp implements com.google.android.gms.ads.internal.overlay.zzn {
    private com.google.android.gms.ads.internal.overlay.zzn zzbyj;
    private zzanh zzdlg;

    public zzanp(zzanh zzanhVar, com.google.android.gms.ads.internal.overlay.zzn zznVar) {
        this.zzdlg = zzanhVar;
        this.zzbyj = zznVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void zzcg() {
        this.zzbyj.zzcg();
        this.zzdlg.zzss();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void zzch() {
        this.zzbyj.zzch();
        this.zzdlg.zzmz();
    }
}
