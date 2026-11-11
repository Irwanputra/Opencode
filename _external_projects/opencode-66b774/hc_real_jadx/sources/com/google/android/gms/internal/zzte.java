package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import java.util.Random;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzte extends zzki {
    private final zzkh zzbzo;

    public zzte(zzkh zzkhVar) {
        this.zzbzo = zzkhVar;
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdClicked() {
        this.zzbzo.onAdClicked();
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdClosed() {
        if (zztn.zzlm()) {
            int intValue = ((Integer) zzkb.zzif().zzd(zznh.zzbmc)).intValue();
            int intValue2 = ((Integer) zzkb.zzif().zzd(zznh.zzbmd)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                zzbs.zzeu().zzkv();
            } else {
                zzahn.zzdaw.postDelayed(zztf.zzbzp, new Random().nextInt(intValue2 + 1) + intValue);
            }
        }
        this.zzbzo.onAdClosed();
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdFailedToLoad(int i) {
        this.zzbzo.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdImpression() {
        this.zzbzo.onAdImpression();
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdLeftApplication() {
        this.zzbzo.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdLoaded() {
        this.zzbzo.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdOpened() {
        this.zzbzo.onAdOpened();
    }
}
