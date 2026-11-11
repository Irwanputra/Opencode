package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzee implements Callable {
    private final zzdm zzagr;
    private final zzaz zzako;

    public zzee(zzdm zzdmVar, zzaz zzazVar) {
        this.zzagr = zzdmVar;
        this.zzako = zzazVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzba, reason: merged with bridge method [inline-methods] */
    public final Void call() {
        if (this.zzagr.zzap() != null) {
            this.zzagr.zzap().get();
        }
        zzaz zzao = this.zzagr.zzao();
        if (zzao == null) {
            return null;
        }
        try {
            synchronized (this.zzako) {
                zzfjs.zza(this.zzako, zzfjs.zzc(zzao));
            }
            return null;
        } catch (zzfjr unused) {
            return null;
        }
    }
}
