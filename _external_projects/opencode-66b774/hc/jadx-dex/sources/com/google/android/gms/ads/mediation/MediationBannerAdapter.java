package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
@dev.epro.r0.P11229048577947898441
public interface MediationBannerAdapter extends dev.epro.r0.J2562139256184902546 {
    android.view.View getBannerView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(android.content.Context context, dev.epro.r0.N17304285488307381535 n17304285488307381535, android.os.Bundle bundle, dev.epro.r0.U6672801493511051432 u6672801493511051432, dev.epro.r0.J10922886535334311319 j10922886535334311319, android.os.Bundle bundle2);
}
