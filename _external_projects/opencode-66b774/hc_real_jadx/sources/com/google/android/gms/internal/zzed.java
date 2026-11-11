package com.google.android.gms.internal;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzed extends zzet {
    public zzed(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 24);
    }

    private final void zzbb() {
        AdvertisingIdClient zzas = this.zzagr.zzas();
        if (zzas == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzas.getInfo();
            String zzn = zzdr.zzn(info.getId());
            if (zzn != null) {
                synchronized (this.zzako) {
                    zzaz zzazVar = this.zzako;
                    zzazVar.zzfd = zzn;
                    zzazVar.zzff = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                    this.zzako.zzfe = 5;
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        if (this.zzagr.zzak()) {
            zzbb();
            return;
        }
        synchronized (this.zzako) {
            this.zzako.zzfd = (String) this.zzakw.invoke(null, this.zzagr.getContext());
        }
    }

    @Override // com.google.android.gms.internal.zzet, java.util.concurrent.Callable
    /* renamed from: zzba */
    public final Void call() {
        if (this.zzagr.isInitialized()) {
            return super.call();
        }
        if (!this.zzagr.zzak()) {
            return null;
        }
        zzbb();
        return null;
    }
}
