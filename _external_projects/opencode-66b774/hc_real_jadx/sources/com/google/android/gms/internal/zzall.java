package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public class zzall<T> implements zzalh<T> {
    private final Object mLock = new Object();
    private int zzcbc = 0;
    private BlockingQueue<zzalm> zzdfo = new LinkedBlockingQueue();
    private T zzdfp;

    public final int getStatus() {
        return this.zzcbc;
    }

    public final void reject() {
        synchronized (this.mLock) {
            if (this.zzcbc != 0) {
                throw new UnsupportedOperationException();
            }
            this.zzcbc = -1;
            Iterator it = this.zzdfo.iterator();
            while (it.hasNext()) {
                ((zzalm) it.next()).zzdfr.run();
            }
            this.zzdfo.clear();
        }
    }

    @Override // com.google.android.gms.internal.zzalh
    public final void zza(zzalk<T> zzalkVar, zzali zzaliVar) {
        synchronized (this.mLock) {
            int i = this.zzcbc;
            if (i == 1) {
                zzalkVar.zzf(this.zzdfp);
            } else if (i == -1) {
                zzaliVar.run();
            } else if (i == 0) {
                this.zzdfo.add(new zzalm(this, zzalkVar, zzaliVar));
            }
        }
    }

    @Override // com.google.android.gms.internal.zzalh
    public final void zzk(T t) {
        synchronized (this.mLock) {
            if (this.zzcbc != 0) {
                throw new UnsupportedOperationException();
            }
            this.zzdfp = t;
            this.zzcbc = 1;
            Iterator it = this.zzdfo.iterator();
            while (it.hasNext()) {
                ((zzalm) it.next()).zzdfq.zzf(t);
            }
            this.zzdfo.clear();
        }
    }
}
