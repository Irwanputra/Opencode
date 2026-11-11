package com.google.android.gms.internal;

import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzej extends zzet {
    private List<Long> zzakr;

    public zzej(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 31);
        this.zzakr = null;
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        this.zzako.zzdx = -1L;
        this.zzako.zzdy = -1L;
        if (this.zzakr == null) {
            this.zzakr = (List) this.zzakw.invoke(null, this.zzagr.getContext());
        }
        List<Long> list = this.zzakr;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzako) {
            this.zzako.zzdx = Long.valueOf(this.zzakr.get(0).longValue());
            this.zzako.zzdy = Long.valueOf(this.zzakr.get(1).longValue());
        }
    }
}
