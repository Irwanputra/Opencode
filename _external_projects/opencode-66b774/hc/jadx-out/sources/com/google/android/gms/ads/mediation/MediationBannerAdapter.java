package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import dev.epro.r0.J10922886535334311319;
import dev.epro.r0.J2562139256184902546;
import dev.epro.r0.N17304285488307381535;
import dev.epro.r0.P11229048577947898441;
import dev.epro.r0.U6672801493511051432;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
@P11229048577947898441
public interface MediationBannerAdapter extends J2562139256184902546 {
    View getBannerView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, N17304285488307381535 n17304285488307381535, Bundle bundle, U6672801493511051432 u6672801493511051432, J10922886535334311319 j10922886535334311319, Bundle bundle2);
}
