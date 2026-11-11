package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzut implements Runnable {
    private /* synthetic */ zzur zzcfg;
    private /* synthetic */ zzakv zzcfh;

    public zzut(zzur zzurVar, zzakv zzakvVar) {
        this.zzcfg = zzurVar;
        this.zzcfh = zzakvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        map = this.zzcfg.zzcfc;
        for (zzakv zzakvVar : map.keySet()) {
            if (zzakvVar != this.zzcfh) {
                map2 = this.zzcfg.zzcfc;
                ((zzul) map2.get(zzakvVar)).cancel();
            }
        }
    }
}
