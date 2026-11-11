package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzwl implements MediationInterstitialAdapter {
    private Uri mUri;
    private Activity zzcgb;
    private MediationInterstitialListener zzcgc;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzakb.zzbx("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzakb.zzbx("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzakb.zzbx("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzcgc = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzakb.zzcu("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            zzakb.zzcu("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzcgc.onAdFailedToLoad(this, 0);
            return;
        }
        if (!(zzoe.zzh(context))) {
            zzakb.zzcu("Default browser does not support custom tabs. Bailing out.");
            this.zzcgc.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            zzakb.zzcu("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.zzcgc.onAdFailedToLoad(this, 0);
        } else {
            this.zzcgb = (Activity) context;
            this.mUri = Uri.parse(string);
            this.zzcgc.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        build.intent.setData(this.mUri);
        zzahn.zzdaw.post(new zzwn(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(build.intent), null, new zzwm(this), null, new zzakd(0, 0, false))));
        zzbs.zzem().zzpo();
    }
}
