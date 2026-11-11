package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhi implements Runnable {
    private /* synthetic */ zzhh zzaza;

    public zzhi(zzhh zzhhVar) {
        this.zzaza = zzhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.zzaza.mLock;
        synchronized (obj) {
            z = this.zzaza.zzayu;
            if (z) {
                z2 = this.zzaza.zzayv;
                if (z2) {
                    zzhh.zza(this.zzaza, false);
                    zzakb.zzbx("App went background");
                    list = this.zzaza.zzayw;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzhj) it.next()).zzg(false);
                        } catch (Exception e) {
                            zzakb.zzb("OnForegroundStateChangedListener threw exception.", e);
                        }
                    }
                }
            }
            zzakb.zzbx("App is still foreground");
        }
    }
}
