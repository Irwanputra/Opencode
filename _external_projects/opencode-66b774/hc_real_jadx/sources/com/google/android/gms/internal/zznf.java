package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import p131.p161.p162.p193.p205.C2475;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznf {
    private Context zzbhi;
    private final Object mLock = new Object();
    private final ConditionVariable zzbhg = new ConditionVariable();
    private volatile boolean zzare = false;
    private SharedPreferences zzbhh = null;

    public final void initialize(Context context) {
        if (this.zzare) {
            return;
        }
        synchronized (this.mLock) {
            if (this.zzare) {
                return;
            }
            this.zzbhi = context.getApplicationContext() == null ? context : context.getApplicationContext();
            try {
                Context m4508 = C2475.m4508(context);
                if (m4508 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    m4508 = context;
                }
                if (m4508 == null) {
                    return;
                }
                zzkb.zzid();
                this.zzbhh = m4508.getSharedPreferences("google_ads_flags", 0);
                this.zzare = true;
            } finally {
                this.zzbhg.open();
            }
        }
    }

    public final <T> T zzd(zzmx<T> zzmxVar) {
        if (!this.zzbhg.block(5000L)) {
            throw new IllegalStateException("Flags.initialize() was not called!");
        }
        if (!this.zzare || this.zzbhh == null) {
            synchronized (this.mLock) {
                if (this.zzare && this.zzbhh != null) {
                }
                return zzmxVar.zziv();
            }
        }
        return (T) zzajk.zza(this.zzbhi, new zzng(this, zzmxVar));
    }
}
