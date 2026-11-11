package com.google.android.gms.ads.mediation.customevent;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(int i);

    void onAdLeftApplication();

    void onAdOpened();
}
