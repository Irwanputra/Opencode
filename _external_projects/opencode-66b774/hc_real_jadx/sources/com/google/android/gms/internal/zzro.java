package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzro extends zzrg {
    private final OnPublisherAdViewLoadedListener zzbwr;

    public zzro(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.zzbwr = onPublisherAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.zzrf
    public final void zza(zzks zzksVar, InterfaceC2455 interfaceC2455) {
        if (zzksVar == null || interfaceC2455 == null) {
            return;
        }
        PublisherAdView publisherAdView = new PublisherAdView((Context) BinderC2454.m4502(interfaceC2455));
        try {
            if (zzksVar.zzce() instanceof zzjg) {
                zzjg zzjgVar = (zzjg) zzksVar.zzce();
                publisherAdView.setAdListener(zzjgVar != null ? zzjgVar.getAdListener() : null);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Failed to get ad listener.", e);
        }
        try {
            if (zzksVar.zzcd() instanceof zzjp) {
                zzjp zzjpVar = (zzjp) zzksVar.zzcd();
                publisherAdView.setAppEventListener(zzjpVar != null ? zzjpVar.getAppEventListener() : null);
            }
        } catch (RemoteException e2) {
            zzakb.zzc("Failed to get app event listener.", e2);
        }
        zzajr.zzajw.post(new zzrp(this, publisherAdView, zzksVar));
    }
}
