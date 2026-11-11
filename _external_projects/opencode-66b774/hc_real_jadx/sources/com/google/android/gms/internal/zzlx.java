package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.zzjr;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlx {
    private final Context mContext;
    private final zzjm zzalp;
    private AppEventListener zzamt;
    private String zzapq;
    private boolean zzaqg;
    private zzje zzbdd;
    private AdListener zzbde;
    private final zzuw zzbgb;
    private Correlator zzbgf;
    private zzks zzbgg;
    private OnCustomRenderedAdLoadedListener zzbgh;
    private PublisherInterstitialAd zzbgl;
    private boolean zzbgm;
    private RewardedVideoAdListener zzgz;

    public zzlx(Context context) {
        this(context, zzjm.zzbej, null);
    }

    public zzlx(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzjm.zzbej, publisherInterstitialAd);
    }

    private zzlx(Context context, zzjm zzjmVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.zzbgb = new zzuw();
        this.mContext = context;
        this.zzalp = zzjmVar;
        this.zzbgl = publisherInterstitialAd;
    }

    private final void zzak(String str) {
        if (this.zzbgg != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }

    public final AdListener getAdListener() {
        return this.zzbde;
    }

    public final String getAdUnitId() {
        return this.zzapq;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzamt;
    }

    public final String getMediationAdapterClassName() {
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                return zzksVar.zzcp();
            }
            return null;
        } catch (RemoteException e) {
            zzakb.zzc("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzbgh;
    }

    public final boolean isLoaded() {
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar == null) {
                return false;
            }
            return zzksVar.isReady();
        } catch (RemoteException e) {
            zzakb.zzc("Failed to check if ad is ready.", e);
            return false;
        }
    }

    public final boolean isLoading() {
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar == null) {
                return false;
            }
            return zzksVar.isLoading();
        } catch (RemoteException e) {
            zzakb.zzc("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public final void setAdListener(AdListener adListener) {
        try {
            this.zzbde = adListener;
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zza(adListener != null ? new zzjg(adListener) : null);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set the AdListener.", e);
        }
    }

    public final void setAdUnitId(String str) {
        if (this.zzapq != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.zzapq = str;
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzamt = appEventListener;
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zza(appEventListener != null ? new zzjp(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set the AppEventListener.", e);
        }
    }

    public final void setCorrelator(Correlator correlator) {
        this.zzbgf = correlator;
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zza(correlator == null ? null : correlator.zzbh());
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set correlator.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzaqg = z;
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set immersive mode", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.zzbgh = onCustomRenderedAdLoadedListener;
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zza(onCustomRenderedAdLoadedListener != null ? new zzod(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set the OnCustomRenderedAdLoadedListener.", e);
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.zzgz = rewardedVideoAdListener;
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zza(rewardedVideoAdListener != null ? new zzadu(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set the AdListener.", e);
        }
    }

    public final void show() {
        try {
            zzak("show");
            this.zzbgg.showInterstitial();
        } catch (RemoteException e) {
            zzakb.zzc("Failed to show interstitial.", e);
        }
    }

    public final void zza(zzje zzjeVar) {
        try {
            this.zzbdd = zzjeVar;
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zza(zzjeVar != null ? new zzjf(zzjeVar) : null);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set the AdClickListener.", e);
        }
    }

    public final void zza(zzlt zzltVar) {
        try {
            if (this.zzbgg == null) {
                if (this.zzapq == null) {
                    zzak("loadAd");
                }
                zzjn zzhs = this.zzbgm ? zzjn.zzhs() : new zzjn();
                zzjr zzib = zzkb.zzib();
                Context context = this.mContext;
                zzks zzksVar = (zzks) zzjr.zza(context, false, (zzjr.zza) new zzju(zzib, context, zzhs, this.zzapq, this.zzbgb));
                this.zzbgg = zzksVar;
                if (this.zzbde != null) {
                    zzksVar.zza(new zzjg(this.zzbde));
                }
                if (this.zzbdd != null) {
                    this.zzbgg.zza(new zzjf(this.zzbdd));
                }
                if (this.zzamt != null) {
                    this.zzbgg.zza(new zzjp(this.zzamt));
                }
                if (this.zzbgh != null) {
                    this.zzbgg.zza(new zzod(this.zzbgh));
                }
                Correlator correlator = this.zzbgf;
                if (correlator != null) {
                    this.zzbgg.zza(correlator.zzbh());
                }
                if (this.zzgz != null) {
                    this.zzbgg.zza(new zzadu(this.zzgz));
                }
                this.zzbgg.setImmersiveMode(this.zzaqg);
            }
            if (this.zzbgg.zzb(zzjm.zza(this.mContext, zzltVar))) {
                this.zzbgb.zzn(zzltVar.zzim());
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to load ad.", e);
        }
    }

    public final void zza(boolean z) {
        this.zzbgm = true;
    }
}
