package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhf {
    private int zzayp;
    private final Object mLock = new Object();
    private List<zzhe> zzayq = new LinkedList();

    public final boolean zza(zzhe zzheVar) {
        synchronized (this.mLock) {
            return this.zzayq.contains(zzheVar);
        }
    }

    public final boolean zzb(zzhe zzheVar) {
        synchronized (this.mLock) {
            Iterator<zzhe> it = this.zzayq.iterator();
            while (it.hasNext()) {
                zzhe next = it.next();
                if (!((Boolean) zzkb.zzif().zzd(zznh.zzbju)).booleanValue() || zzbs.zzem().zzoy()) {
                    if (((Boolean) zzkb.zzif().zzd(zznh.zzbjw)).booleanValue() && !zzbs.zzem().zzoz() && zzheVar != next && next.zzgm().equals(zzheVar.zzgm())) {
                        it.remove();
                        return true;
                    }
                } else if (zzheVar != next && next.zzgk().equals(zzheVar.zzgk())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzhe zzheVar) {
        synchronized (this.mLock) {
            if (this.zzayq.size() >= 10) {
                int size = this.zzayq.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzakb.zzbx(sb.toString());
                this.zzayq.remove(0);
            }
            int i = this.zzayp;
            this.zzayp = i + 1;
            zzheVar.zzo(i);
            this.zzayq.add(zzheVar);
        }
    }

    public final zzhe zzgs() {
        synchronized (this.mLock) {
            zzhe zzheVar = null;
            if (this.zzayq.size() == 0) {
                zzakb.zzbx("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzayq.size() < 2) {
                zzhe zzheVar2 = this.zzayq.get(0);
                zzheVar2.zzgn();
                return zzheVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzhe zzheVar3 : this.zzayq) {
                int score = zzheVar3.getScore();
                if (score > i2) {
                    i = i3;
                    zzheVar = zzheVar3;
                    i2 = score;
                }
                i3++;
            }
            this.zzayq.remove(i);
            return zzheVar;
        }
    }
}
