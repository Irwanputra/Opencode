package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfjm;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzfjm<M extends zzfjm<M>> extends zzfjs {
    public zzfjo zzpnc;

    public final <T> T zza(zzfjn<M, T> zzfjnVar) {
        zzfjp zzmj;
        zzfjo zzfjoVar = this.zzpnc;
        if (zzfjoVar == null || (zzmj = zzfjoVar.zzmj(zzfjnVar.tag >>> 3)) == null) {
            return null;
        }
        return (T) zzmj.zzb(zzfjnVar);
    }

    @Override // com.google.android.gms.internal.zzfjs
    public void zza(zzfjk zzfjkVar) {
        if (this.zzpnc == null) {
            return;
        }
        for (int i = 0; i < this.zzpnc.size(); i++) {
            this.zzpnc.zzmk(i).zza(zzfjkVar);
        }
    }

    public final boolean zza(zzfjj zzfjjVar, int i) {
        int position = zzfjjVar.getPosition();
        if (!zzfjjVar.zzkq(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zzfju zzfjuVar = new zzfju(i, zzfjjVar.zzal(position, zzfjjVar.getPosition() - position));
        zzfjp zzfjpVar = null;
        zzfjo zzfjoVar = this.zzpnc;
        if (zzfjoVar == null) {
            this.zzpnc = new zzfjo();
        } else {
            zzfjpVar = zzfjoVar.zzmj(i2);
        }
        if (zzfjpVar == null) {
            zzfjpVar = new zzfjp();
            this.zzpnc.zza(i2, zzfjpVar);
        }
        zzfjpVar.zza(zzfjuVar);
        return true;
    }

    @Override // com.google.android.gms.internal.zzfjs
    /* renamed from: zzdaf, reason: merged with bridge method [inline-methods] */
    public M clone() {
        M m = (M) super.clone();
        zzfjq.zza(this, m);
        return m;
    }

    @Override // com.google.android.gms.internal.zzfjs
    /* renamed from: zzdag */
    public /* synthetic */ zzfjs clone() {
        return (zzfjm) clone();
    }

    @Override // com.google.android.gms.internal.zzfjs
    public int zzq() {
        if (this.zzpnc == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzpnc.size(); i2++) {
            i += this.zzpnc.zzmk(i2).zzq();
        }
        return i;
    }
}
