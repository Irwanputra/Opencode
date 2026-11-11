package com.google.android.gms.internal;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzuk extends zzve {
    private final Object mLock = new Object();
    private zzup zzceb;
    private zzuj zzcec;

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdClicked() {
        synchronized (this.mLock) {
            zzuj zzujVar = this.zzcec;
            if (zzujVar != null) {
                zzujVar.zzcj();
            }
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdClosed() {
        synchronized (this.mLock) {
            zzuj zzujVar = this.zzcec;
            if (zzujVar != null) {
                zzujVar.zzck();
            }
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdFailedToLoad(int i) {
        synchronized (this.mLock) {
            zzup zzupVar = this.zzceb;
            if (zzupVar != null) {
                zzupVar.zzv(i == 3 ? 1 : 2);
                this.zzceb = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdImpression() {
        synchronized (this.mLock) {
            zzuj zzujVar = this.zzcec;
            if (zzujVar != null) {
                zzujVar.zzco();
            }
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdLeftApplication() {
        synchronized (this.mLock) {
            zzuj zzujVar = this.zzcec;
            if (zzujVar != null) {
                zzujVar.zzcl();
            }
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdLoaded() {
        synchronized (this.mLock) {
            zzup zzupVar = this.zzceb;
            if (zzupVar != null) {
                zzupVar.zzv(0);
                this.zzceb = null;
            } else {
                zzuj zzujVar = this.zzcec;
                if (zzujVar != null) {
                    zzujVar.zzcn();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdOpened() {
        synchronized (this.mLock) {
            zzuj zzujVar = this.zzcec;
            if (zzujVar != null) {
                zzujVar.zzcm();
            }
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAppEvent(String str, String str2) {
        synchronized (this.mLock) {
            zzuj zzujVar = this.zzcec;
            if (zzujVar != null) {
                zzujVar.zzc(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onVideoEnd() {
        synchronized (this.mLock) {
            zzuj zzujVar = this.zzcec;
            if (zzujVar != null) {
                zzujVar.zzci();
            }
        }
    }

    public final void zza(zzuj zzujVar) {
        synchronized (this.mLock) {
            this.zzcec = zzujVar;
        }
    }

    public final void zza(zzup zzupVar) {
        synchronized (this.mLock) {
            this.zzceb = zzupVar;
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void zza(zzvg zzvgVar) {
        synchronized (this.mLock) {
            zzup zzupVar = this.zzceb;
            if (zzupVar != null) {
                zzupVar.zza(0, zzvgVar);
                this.zzceb = null;
            } else {
                zzuj zzujVar = this.zzcec;
                if (zzujVar != null) {
                    zzujVar.zzcn();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void zzb(zzqm zzqmVar, String str) {
        synchronized (this.mLock) {
            zzuj zzujVar = this.zzcec;
            if (zzujVar != null) {
                zzujVar.zza(zzqmVar, str);
            }
        }
    }
}
