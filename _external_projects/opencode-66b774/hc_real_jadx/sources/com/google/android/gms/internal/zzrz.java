package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Future;
import p131.p161.p162.p193.p205.p208.InterfaceC2491;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzrz implements InterfaceC2491 {
    public final /* synthetic */ zzrx zzbyu;
    private /* synthetic */ zzalf zzbyv;
    private /* synthetic */ zzrr zzbyw;

    public zzrz(zzrx zzrxVar, zzalf zzalfVar, zzrr zzrrVar) {
        this.zzbyu = zzrxVar;
        this.zzbyv = zzalfVar;
        this.zzbyw = zzrrVar;
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2491
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzrq zzrqVar;
        obj = this.zzbyu.mLock;
        synchronized (obj) {
            z = this.zzbyu.zzbyt;
            if (z) {
                return;
            }
            zzrx.zza(this.zzbyu, true);
            zzrqVar = this.zzbyu.zzbys;
            if (zzrqVar == null) {
                return;
            }
            final zzalf zzalfVar = this.zzbyv;
            final zzrr zzrrVar = this.zzbyw;
            final zzakv<Void> zza = zzahh.zza(new Runnable(this, zzrqVar, zzalfVar, zzrrVar) { // from class: com.google.android.gms.internal.zzsa
                private final zzrz zzbyx;
                private final zzrq zzbyy;
                private final zzalf zzbyz;
                private final zzrr zzbza;

                {
                    this.zzbyx = this;
                    this.zzbyy = zzrqVar;
                    this.zzbyz = zzalfVar;
                    this.zzbza = zzrrVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzrz zzrzVar = this.zzbyx;
                    zzrq zzrqVar2 = this.zzbyy;
                    zzalf zzalfVar2 = this.zzbyz;
                    try {
                        zzalfVar2.set(zzrqVar2.zzkt().zza(this.zzbza));
                    } catch (RemoteException e) {
                        zzakb.zzb("Unable to obtain a cache service instance.", e);
                        zzalfVar2.setException(e);
                        zzrzVar.zzbyu.disconnect();
                    }
                }
            });
            final zzalf zzalfVar2 = this.zzbyv;
            zzalfVar2.zza(new Runnable(zzalfVar2, zza) { // from class: com.google.android.gms.internal.zzsb
                private final zzalf zzbzb;
                private final Future zzbzc;

                {
                    this.zzbzb = zzalfVar2;
                    this.zzbzc = zza;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzalf zzalfVar3 = this.zzbzb;
                    Future future = this.zzbzc;
                    if (zzalfVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzala.zzdff);
        }
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2491
    public final void onConnectionSuspended(int i) {
    }
}
