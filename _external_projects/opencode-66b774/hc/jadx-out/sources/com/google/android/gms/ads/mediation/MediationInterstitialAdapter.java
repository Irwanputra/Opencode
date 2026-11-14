package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import dev.epro.r0.C2488272584835726867;
import dev.epro.r0.J10922886535334311319;
import dev.epro.r0.J2562139256184902546;
import dev.epro.r0.P11229048577947898441;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
@P11229048577947898441
public interface MediationInterstitialAdapter extends J2562139256184902546 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, C2488272584835726867 c2488272584835726867, Bundle bundle, J10922886535334311319 j10922886535334311319, Bundle bundle2);

    void showInterstitial();
}
