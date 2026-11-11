package com.google.android.gms.internal;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaie {
    private boolean zzcob = false;
    private float zzcnv = 1.0f;

    private final synchronized boolean zzql() {
        return this.zzcnv >= 0.0f;
    }

    public final synchronized void setAppMuted(boolean z) {
        this.zzcob = z;
    }

    public final synchronized void setAppVolume(float f) {
        this.zzcnv = f;
    }

    public final synchronized float zzdn() {
        if (!zzql()) {
            return 1.0f;
        }
        return this.zzcnv;
    }

    public final synchronized boolean zzdo() {
        return this.zzcob;
    }
}
