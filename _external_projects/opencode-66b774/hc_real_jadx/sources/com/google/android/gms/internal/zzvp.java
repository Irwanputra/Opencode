package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvp extends zzlm {
    private final Object mLock = new Object();
    private volatile zzlo zzcfl;

    @Override // com.google.android.gms.internal.zzll
    public final float getAspectRatio() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final int getPlaybackState() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final boolean isClickToExpandEnabled() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final boolean isCustomControlsEnabled() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final boolean isMuted() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final void mute(boolean z) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final void pause() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final void play() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final void zza(zzlo zzloVar) {
        synchronized (this.mLock) {
            this.zzcfl = zzloVar;
        }
    }

    @Override // com.google.android.gms.internal.zzll
    public final float zzih() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final float zzii() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzll
    public final zzlo zzij() {
        zzlo zzloVar;
        synchronized (this.mLock) {
            zzloVar = this.zzcfl;
        }
        return zzloVar;
    }
}
