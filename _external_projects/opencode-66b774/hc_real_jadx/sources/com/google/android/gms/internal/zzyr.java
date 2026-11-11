package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyr implements Runnable {
    private /* synthetic */ AtomicInteger zzclb;
    private /* synthetic */ int zzclc;
    private /* synthetic */ zzalf zzcld;
    private /* synthetic */ List zzcle;

    public zzyr(AtomicInteger atomicInteger, int i, zzalf zzalfVar, List list) {
        this.zzclb = atomicInteger;
        this.zzclc = i;
        this.zzcld = zzalfVar;
        this.zzcle = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List zzm;
        if (this.zzclb.incrementAndGet() >= this.zzclc) {
            try {
                zzalf zzalfVar = this.zzcld;
                zzm = zzym.zzm(this.zzcle);
                zzalfVar.set(zzm);
            } catch (InterruptedException | ExecutionException e) {
                zzakb.zzc("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
