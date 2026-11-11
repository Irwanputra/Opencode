package com.google.android.gms.internal;

import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzse {
    private final List<zztc> zzapa = new LinkedList();

    public final void zza(zztd zztdVar) {
        Handler handler = zzahn.zzdaw;
        Iterator<zztc> it = this.zzapa.iterator();
        while (it.hasNext()) {
            handler.post(new zztb(this, it.next(), zztdVar));
        }
        this.zzapa.clear();
    }
}
