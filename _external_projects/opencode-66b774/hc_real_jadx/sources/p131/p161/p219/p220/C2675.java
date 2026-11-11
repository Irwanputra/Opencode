package p131.p161.p219.p220;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2675 implements RewardedVideoAdListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ AbstractAdViewAdapter f10145;

    public C2675(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f10145 = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewarded(RewardItem rewardItem) {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.f10145.zzgy;
        mediationRewardedVideoAdListener.onRewarded(this.f10145, rewardItem);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdClosed() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.f10145.zzgy;
        mediationRewardedVideoAdListener.onAdClosed(this.f10145);
        AbstractAdViewAdapter.zza(this.f10145, (InterstitialAd) null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdFailedToLoad(int i) {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.f10145.zzgy;
        mediationRewardedVideoAdListener.onAdFailedToLoad(this.f10145, i);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdLeftApplication() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.f10145.zzgy;
        mediationRewardedVideoAdListener.onAdLeftApplication(this.f10145);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdLoaded() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.f10145.zzgy;
        mediationRewardedVideoAdListener.onAdLoaded(this.f10145);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdOpened() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.f10145.zzgy;
        mediationRewardedVideoAdListener.onAdOpened(this.f10145);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoStarted() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.f10145.zzgy;
        mediationRewardedVideoAdListener.onVideoStarted(this.f10145);
    }
}
