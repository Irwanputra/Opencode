package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzv {
    private final zzm zzab;
    private final AtomicInteger zzbb;
    private final Set<zzr<?>> zzbc;
    private final PriorityBlockingQueue<zzr<?>> zzbd;
    private final PriorityBlockingQueue<zzr<?>> zzbe;
    private final zzn[] zzbf;
    private final List<Object> zzbg;
    private final zzb zzj;
    private final zzz zzk;
    private zzd zzq;

    public zzv(zzb zzbVar, zzm zzmVar) {
        this(zzbVar, zzmVar, 4);
    }

    private zzv(zzb zzbVar, zzm zzmVar, int i) {
        this(zzbVar, zzmVar, 4, new zzi(new Handler(Looper.getMainLooper())));
    }

    private zzv(zzb zzbVar, zzm zzmVar, int i, zzz zzzVar) {
        this.zzbb = new AtomicInteger();
        this.zzbc = new HashSet();
        this.zzbd = new PriorityBlockingQueue<>();
        this.zzbe = new PriorityBlockingQueue<>();
        this.zzbg = new ArrayList();
        this.zzj = zzbVar;
        this.zzab = zzmVar;
        this.zzbf = new zzn[4];
        this.zzk = zzzVar;
    }

    public final void start() {
        zzd zzdVar = this.zzq;
        if (zzdVar != null) {
            zzdVar.quit();
        }
        for (zzn zznVar : this.zzbf) {
            if (zznVar != null) {
                zznVar.quit();
            }
        }
        zzd zzdVar2 = new zzd(this.zzbd, this.zzbe, this.zzj, this.zzk);
        this.zzq = zzdVar2;
        zzdVar2.start();
        for (int i = 0; i < this.zzbf.length; i++) {
            zzn zznVar2 = new zzn(this.zzbe, this.zzab, this.zzj, this.zzk);
            this.zzbf[i] = zznVar2;
            zznVar2.start();
        }
    }

    public final <T> zzr<T> zze(zzr<T> zzrVar) {
        zzrVar.zza(this);
        synchronized (this.zzbc) {
            this.zzbc.add(zzrVar);
        }
        zzrVar.zza(this.zzbb.incrementAndGet());
        zzrVar.zzb("add-to-queue");
        (!zzrVar.zzg() ? this.zzbe : this.zzbd).add(zzrVar);
        return zzrVar;
    }

    public final <T> void zzf(zzr<T> zzrVar) {
        synchronized (this.zzbc) {
            this.zzbc.remove(zzrVar);
        }
        synchronized (this.zzbg) {
            Iterator<Object> it = this.zzbg.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
