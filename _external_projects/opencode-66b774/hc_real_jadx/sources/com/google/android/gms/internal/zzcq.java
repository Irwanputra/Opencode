package com.google.android.gms.internal;

import android.os.ConditionVariable;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzcq implements Runnable {
    private /* synthetic */ zzcp zzagw;

    public zzcq(zzcp zzcpVar) {
        this.zzagw = zzcpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        zzdm zzdmVar;
        ConditionVariable conditionVariable2;
        if (this.zzagw.zzagu != null) {
            return;
        }
        conditionVariable = zzcp.zzags;
        synchronized (conditionVariable) {
            if (this.zzagw.zzagu != null) {
                return;
            }
            boolean booleanValue = ((Boolean) zzkb.zzif().zzd(zznh.zzbnk)).booleanValue();
            if (booleanValue) {
                try {
                    zzdmVar = this.zzagw.zzagr;
                    zzcp.zzagt = new zzix(zzdmVar.zzair, "ADSHIELD", null);
                } catch (Throwable unused) {
                    booleanValue = false;
                }
            }
            this.zzagw.zzagu = Boolean.valueOf(booleanValue);
            conditionVariable2 = zzcp.zzags;
            conditionVariable2.open();
        }
    }
}
