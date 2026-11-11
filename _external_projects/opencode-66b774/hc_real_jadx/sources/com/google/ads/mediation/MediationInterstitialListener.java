package com.google.ads.mediation;

import com.google.ads.AdRequest;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public interface MediationInterstitialListener {
    void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter);

    void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, AdRequest.ErrorCode errorCode);

    void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter);

    void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter);

    void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter);
}
