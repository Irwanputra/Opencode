package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import dev.epro.r0.H13673682671831771655;
import dev.epro.r0.J2562139256184902546;
import dev.epro.r0.K17289497074290777238;
import dev.epro.r0.P11229048577947898441;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
@P11229048577947898441
public interface MediationNativeAdapter extends J2562139256184902546 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, K17289497074290777238 k17289497074290777238, Bundle bundle, H13673682671831771655 h13673682671831771655, Bundle bundle2);
}
