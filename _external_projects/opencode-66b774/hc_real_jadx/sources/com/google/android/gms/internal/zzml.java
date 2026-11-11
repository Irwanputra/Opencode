package com.google.android.gms.internal;

import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzml extends zzadl {
    private zzadp zzbgu;

    @Override // com.google.android.gms.internal.zzadk
    public final void destroy() {
    }

    @Override // com.google.android.gms.internal.zzadk
    public final String getMediationAdapterClassName() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzadk
    public final boolean isLoaded() {
        return false;
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void pause() {
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void resume() {
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void show() {
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zza(zzadp zzadpVar) {
        this.zzbgu = zzadpVar;
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zza(zzadv zzadvVar) {
        zzakb.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzajr.zzajw.post(new zzmm(this));
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zzb(InterfaceC2455 interfaceC2455) {
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zzc(InterfaceC2455 interfaceC2455) {
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zzd(InterfaceC2455 interfaceC2455) {
    }
}
