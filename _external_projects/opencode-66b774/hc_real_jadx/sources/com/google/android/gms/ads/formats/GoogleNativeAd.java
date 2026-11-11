package com.google.android.gms.ads.formats;

import android.os.Bundle;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class GoogleNativeAd {
    public abstract void performClick(Bundle bundle);

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);
}
