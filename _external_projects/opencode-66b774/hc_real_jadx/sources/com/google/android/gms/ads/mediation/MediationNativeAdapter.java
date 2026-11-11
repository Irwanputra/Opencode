package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface MediationNativeAdapter extends MediationAdapter {
    void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2);
}
