package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbs;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzafz {
    private final Object mLock;
    private final zzaft zzasx;
    private final String zzcyb;
    private int zzczz;
    private int zzdaa;

    private zzafz(zzaft zzaftVar, String str) {
        this.mLock = new Object();
        this.zzasx = zzaftVar;
        this.zzcyb = str;
    }

    public zzafz(String str) {
        this(zzbs.zzem(), str);
    }

    public final Bundle toBundle() {
        Bundle bundle;
        synchronized (this.mLock) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.zzczz);
            bundle.putInt("pmnll", this.zzdaa);
        }
        return bundle;
    }

    public final void zze(int i, int i2) {
        synchronized (this.mLock) {
            this.zzczz = i;
            this.zzdaa = i2;
            this.zzasx.zza(this.zzcyb, this);
        }
    }
}
