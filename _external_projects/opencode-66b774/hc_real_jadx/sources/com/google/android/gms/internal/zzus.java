package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzus implements Callable<zzuo> {
    private /* synthetic */ zzul zzcff;
    private /* synthetic */ zzur zzcfg;

    public zzus(zzur zzurVar, zzul zzulVar) {
        this.zzcfg = zzurVar;
        this.zzcff = zzulVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzmd, reason: merged with bridge method [inline-methods] */
    public final zzuo call() {
        Object obj;
        boolean z;
        long j;
        long j2;
        obj = this.zzcfg.mLock;
        synchronized (obj) {
            z = this.zzcfg.zzcfb;
            if (z) {
                return null;
            }
            zzul zzulVar = this.zzcff;
            j = this.zzcfg.mStartTime;
            j2 = this.zzcfg.zzcez;
            return zzulVar.zza(j, j2);
        }
    }
}
