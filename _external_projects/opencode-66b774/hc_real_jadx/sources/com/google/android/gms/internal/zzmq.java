package com.google.android.gms.internal;

import com.google.android.gms.ads.VideoController;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzmq extends zzlp {
    private final VideoController.VideoLifecycleCallbacks zzamd;

    public zzmq(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzamd = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoEnd() {
        this.zzamd.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoMute(boolean z) {
        this.zzamd.onVideoMute(z);
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoPause() {
        this.zzamd.onVideoPause();
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoPlay() {
        this.zzamd.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoStart() {
        this.zzamd.onVideoStart();
    }
}
