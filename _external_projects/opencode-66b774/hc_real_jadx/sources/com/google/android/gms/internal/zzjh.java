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
public final class zzjh extends AbstractC2458<zzkq> {
    public zzjh() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final zzkn zza(Context context, String str, zzux zzuxVar) {
        try {
            IBinder zza = zzde(context).zza(new BinderC2454(context), str, zzuxVar, 11910000);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzkn ? (zzkn) queryLocalInterface : new zzkp(zza);
        } catch (RemoteException | C2457 e) {
            zzakb.zzc("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // p131.p161.p162.p193.p203.AbstractC2458
    public final /* synthetic */ zzkq zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzkq ? (zzkq) queryLocalInterface : new zzkr(iBinder);
    }
}
