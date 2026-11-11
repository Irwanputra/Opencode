package com.google.android.gms.internal;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzbs;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaji {
    private long zzdda;
    private long zzddb = Long.MIN_VALUE;
    private Object mLock = new Object();

    public zzaji(long j) {
        this.zzdda = j;
    }

    public final boolean tryAcquire() {
        synchronized (this.mLock) {
            ((C2510) zzbs.zzeo()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.zzddb + this.zzdda > elapsedRealtime) {
                return false;
            }
            this.zzddb = elapsedRealtime;
            return true;
        }
    }
}
