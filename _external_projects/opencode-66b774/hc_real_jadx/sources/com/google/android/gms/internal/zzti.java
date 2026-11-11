package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedList;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzti {
    private final String zzapq;
    private final LinkedList<zztj> zzbzt;
    private zzjj zzbzu;
    private final int zzbzv;
    private boolean zzbzw;

    public zzti(zzjj zzjjVar, String str, int i) {
        if (zzjjVar == null) {
            throw new NullPointerException("null reference");
        }
        if (str == null) {
            throw new NullPointerException("null reference");
        }
        this.zzbzt = new LinkedList<>();
        this.zzbzu = zzjjVar;
        this.zzapq = str;
        this.zzbzv = i;
    }

    public final String getAdUnitId() {
        return this.zzapq;
    }

    public final int getNetworkType() {
        return this.zzbzv;
    }

    public final int size() {
        return this.zzbzt.size();
    }

    public final void zza(zzsd zzsdVar, zzjj zzjjVar) {
        this.zzbzt.add(new zztj(this, zzsdVar, zzjjVar));
    }

    public final boolean zzb(zzsd zzsdVar) {
        zztj zztjVar = new zztj(this, zzsdVar);
        this.zzbzt.add(zztjVar);
        return zztjVar.load();
    }

    public final zzjj zzkx() {
        return this.zzbzu;
    }

    public final int zzky() {
        Iterator<zztj> it = this.zzbzt.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().zzcab) {
                i++;
            }
        }
        return i;
    }

    public final int zzkz() {
        Iterator<zztj> it = this.zzbzt.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().load()) {
                i++;
            }
        }
        return i;
    }

    public final void zzla() {
        this.zzbzw = true;
    }

    public final boolean zzlb() {
        return this.zzbzw;
    }

    public final zztj zzm(zzjj zzjjVar) {
        if (zzjjVar != null) {
            this.zzbzu = zzjjVar;
        }
        return this.zzbzt.remove();
    }
}
