package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import p034.p095.C1687;
import p131.p161.p162.p193.p203.BinderC2454;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaep implements MediationRewardedVideoAdListener {
    private final zzaem zzcwc;

    public zzaep(zzaem zzaemVar) {
        this.zzcwc = zzaemVar;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1687.m3716("onAdClicked must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onAdClicked.");
        try {
            this.zzcwc.zzr(new BinderC2454(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAdClicked.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1687.m3716("onAdClosed must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onAdClosed.");
        try {
            this.zzcwc.zzq(new BinderC2454(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C1687.m3716("onAdFailedToLoad must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onAdFailedToLoad.");
        try {
            this.zzcwc.zzd(new BinderC2454(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1687.m3716("onAdLeftApplication must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onAdLeftApplication.");
        try {
            this.zzcwc.zzs(new BinderC2454(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1687.m3716("onAdLoaded must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onAdLoaded.");
        try {
            this.zzcwc.zzn(new BinderC2454(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1687.m3716("onAdOpened must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onAdOpened.");
        try {
            this.zzcwc.zzo(new BinderC2454(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C1687.m3716("onInitializationFailed must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onInitializationFailed.");
        try {
            this.zzcwc.zzc(new BinderC2454(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onInitializationFailed.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1687.m3716("onInitializationSucceeded must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onInitializationSucceeded.");
        try {
            this.zzcwc.zzm(new BinderC2454(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onInitializationSucceeded.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        C1687.m3716("onRewarded must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onRewarded.");
        try {
            if (rewardItem != null) {
                this.zzcwc.zza(new BinderC2454(mediationRewardedVideoAdAdapter), new zzaeq(rewardItem));
            } else {
                this.zzcwc.zza(new BinderC2454(mediationRewardedVideoAdAdapter), new zzaeq("", 1));
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onRewarded.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1687.m3716("onVideoStarted must be called on the main UI thread.");
        zzakb.zzbx("Adapter called onVideoStarted.");
        try {
            this.zzcwc.zzp(new BinderC2454(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onVideoStarted.", e);
        }
    }
}
