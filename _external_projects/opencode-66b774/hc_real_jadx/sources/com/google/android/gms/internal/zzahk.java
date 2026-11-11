package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzbs;
import java.util.concurrent.Callable;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzahk implements Runnable {
    private /* synthetic */ Callable val$callable;
    private /* synthetic */ zzalf zzbyv;

    public zzahk(zzalf zzalfVar, Callable callable) {
        this.zzbyv = zzalfVar;
        this.val$callable = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(10);
            this.zzbyv.set(this.val$callable.call());
        } catch (Exception e) {
            zzbs.zzem().zza(e, "AdThreadPool.submit");
            this.zzbyv.setException(e);
        }
    }
}
