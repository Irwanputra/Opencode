package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import p131.p161.p162.p193.p203.AbstractC2458;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.C2457;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzri extends AbstractC2458<zzpx> {
    public zzri() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final zzpu zzb(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zza = zzde(context).zza(new BinderC2454(context), new BinderC2454(frameLayout), new BinderC2454(frameLayout2), 11910000);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzpu ? (zzpu) queryLocalInterface : new zzpw(zza);
        } catch (RemoteException | C2457 e) {
            zzakb.zzc("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // p131.p161.p162.p193.p203.AbstractC2458
    public final /* synthetic */ zzpx zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzpx ? (zzpx) queryLocalInterface : new zzpy(iBinder);
    }
}
