package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p131.p161.p162.p193.p203.AbstractC2458;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.C2457;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzadt extends AbstractC2458<zzadn> {
    public zzadt() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final zzadk zza(Context context, zzux zzuxVar) {
        try {
            IBinder zza = zzde(context).zza(new BinderC2454(context), zzuxVar, 11910000);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof zzadk ? (zzadk) queryLocalInterface : new zzadm(zza);
        } catch (RemoteException | C2457 e) {
            zzakb.zzc("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    @Override // p131.p161.p162.p193.p203.AbstractC2458
    public final /* synthetic */ zzadn zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof zzadn ? (zzadn) queryLocalInterface : new zzado(iBinder);
    }
}
