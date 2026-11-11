package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.internal.zzjr;
import java.util.concurrent.atomic.AtomicBoolean;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlv {
    private final zzjm zzalp;
    private VideoOptions zzaml;
    private boolean zzamr;
    private AppEventListener zzamt;
    private String zzapq;
    private zzje zzbdd;
    private AdListener zzbde;
    private AdSize[] zzbeq;
    private final zzuw zzbgb;
    private final AtomicBoolean zzbgc;
    private final VideoController zzbgd;
    private zzkd zzbge;
    private Correlator zzbgf;
    private zzks zzbgg;
    private OnCustomRenderedAdLoadedListener zzbgh;
    private ViewGroup zzbgi;
    private int zzbgj;

    public zzlv(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzjm.zzbej, 0);
    }

    public zzlv(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzjm.zzbej, i);
    }

    public zzlv(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzjm.zzbej, 0);
    }

    public zzlv(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zzjm.zzbej, i);
    }

    private zzlv(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzjm zzjmVar, int i) {
        this(viewGroup, attributeSet, z, zzjmVar, null, i);
    }

    private zzlv(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzjm zzjmVar, zzks zzksVar, int i) {
        this.zzbgb = new zzuw();
        this.zzbgd = new VideoController();
        this.zzbge = new zzlw(this);
        this.zzbgi = viewGroup;
        this.zzalp = zzjmVar;
        this.zzbgg = null;
        this.zzbgc = new AtomicBoolean(false);
        this.zzbgj = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzjq zzjqVar = new zzjq(context, attributeSet);
                this.zzbeq = zzjqVar.zzh(z);
                this.zzapq = zzjqVar.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzajr zzia = zzkb.zzia();
                    AdSize adSize = this.zzbeq[0];
                    int i2 = this.zzbgj;
                    zzjn zzjnVar = new zzjn(context, adSize);
                    zzjnVar.zzbep = zzs(i2);
                    zzia.zza(viewGroup, zzjnVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzkb.zzia().zza(viewGroup, new zzjn(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private static zzjn zza(Context context, AdSize[] adSizeArr, int i) {
        zzjn zzjnVar = new zzjn(context, adSizeArr);
        zzjnVar.zzbep = zzs(i);
        return zzjnVar;
    }

    private static boolean zzs(int i) {
        return i == 1;
    }

    public final void destroy() {
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.destroy();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to destroy AdView.", e);
        }
    }

    public final AdListener getAdListener() {
        return this.zzbde;
    }

    public final AdSize getAdSize() {
        zzjn zzbs;
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null && (zzbs = zzksVar.zzbs()) != null) {
                return zzbs.zzht();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to get the current AdSize.", e);
        }
        AdSize[] adSizeArr = this.zzbeq;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] getAdSizes() {
        return this.zzbeq;
    }

    public final String getAdUnitId() {
        zzks zzksVar;
        if (this.zzapq == null && (zzksVar = this.zzbgg) != null) {
            try {
                this.zzapq = zzksVar.getAdUnitId();
            } catch (RemoteException e) {
                zzakb.zzc("Failed to get ad unit id.", e);
            }
        }
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

    public final VideoController getVideoController() {
        return this.zzbgd;
    }

    public final VideoOptions getVideoOptions() {
        return this.zzaml;
    }

    public final boolean isLoading() {
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                return zzksVar.isLoading();
            }
            return false;
        } catch (RemoteException e) {
            zzakb.zzc("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public final void pause() {
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.pause();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to call pause.", e);
        }
    }

    public final void recordManualImpression() {
        if (this.zzbgc.getAndSet(true)) {
            return;
        }
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zzbu();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to record impression.", e);
        }
    }

    public final void resume() {
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.resume();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to call resume.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        this.zzbde = adListener;
        this.zzbge.zza(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (this.zzbeq != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zza(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        if (this.zzapq != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzamr = z;
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.setManualImpressionsEnabled(z);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set manual impressions.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzbgh = onCustomRenderedAdLoadedListener;
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zza(onCustomRenderedAdLoadedListener != null ? new zzod(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzaml = videoOptions;
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zza(videoOptions == null ? null : new zzmr(videoOptions));
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set video options.", e);
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
            zzks zzksVar = this.zzbgg;
            if (zzksVar == null) {
                if ((this.zzbeq == null || this.zzapq == null) && zzksVar == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzbgi.getContext();
                zzjn zza = zza(context, this.zzbeq, this.zzbgj);
                zzks zzksVar2 = (zzks) ("search_v2".equals(zza.zzbek) ? zzjr.zza(context, false, (zzjr.zza) new zzjt(zzkb.zzib(), context, zza, this.zzapq)) : zzjr.zza(context, false, (zzjr.zza) new zzjs(zzkb.zzib(), context, zza, this.zzapq, this.zzbgb)));
                this.zzbgg = zzksVar2;
                zzksVar2.zza(new zzjg(this.zzbge));
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
                if (this.zzaml != null) {
                    this.zzbgg.zza(new zzmr(this.zzaml));
                }
                this.zzbgg.setManualImpressionsEnabled(this.zzamr);
                try {
                    InterfaceC2455 zzbr = this.zzbgg.zzbr();
                    if (zzbr != null) {
                        this.zzbgi.addView((View) BinderC2454.m4502(zzbr));
                    }
                } catch (RemoteException e) {
                    zzakb.zzc("Failed to get an ad frame.", e);
                }
            }
            if (this.zzbgg.zzb(zzjm.zza(this.zzbgi.getContext(), zzltVar))) {
                this.zzbgb.zzn(zzltVar.zzim());
            }
        } catch (RemoteException e2) {
            zzakb.zzc("Failed to load ad.", e2);
        }
    }

    public final void zza(AdSize... adSizeArr) {
        this.zzbeq = adSizeArr;
        try {
            zzks zzksVar = this.zzbgg;
            if (zzksVar != null) {
                zzksVar.zza(zza(this.zzbgi.getContext(), this.zzbeq, this.zzbgj));
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to set the ad size.", e);
        }
        this.zzbgi.requestLayout();
    }

    public final boolean zza(zzks zzksVar) {
        if (zzksVar == null) {
            return false;
        }
        try {
            InterfaceC2455 zzbr = zzksVar.zzbr();
            if (zzbr == null || ((View) BinderC2454.m4502(zzbr)).getParent() != null) {
                return false;
            }
            this.zzbgi.addView((View) BinderC2454.m4502(zzbr));
            this.zzbgg = zzksVar;
            return true;
        } catch (RemoteException e) {
            zzakb.zzc("Failed to get an ad frame.", e);
            return false;
        }
    }

    public final zzll zzbj() {
        zzks zzksVar = this.zzbgg;
        if (zzksVar == null) {
            return null;
        }
        try {
            return zzksVar.getVideoController();
        } catch (RemoteException e) {
            zzakb.zzc("Failed to retrieve VideoController.", e);
            return null;
        }
    }
}
