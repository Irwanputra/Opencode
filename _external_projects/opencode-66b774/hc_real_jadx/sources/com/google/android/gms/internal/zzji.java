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
public final class zzji extends AbstractC2458<zzkv> {
    public zzji() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final zzks zza(Context context, zzjn zzjnVar, String str, zzux zzuxVar, int i) {
        try {
            IBinder zza = zzde(context).zza(new BinderC2454(context), zzjnVar, str, zzuxVar, 11910000, i);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new zzku(zza);
        } catch (RemoteException | C2457 e) {
            zzakb.zza("Could not create remote AdManager.", e);
            return null;
        }
    }

    @Override // p131.p161.p162.p193.p203.AbstractC2458
    public final /* synthetic */ zzkv zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzkv ? (zzkv) queryLocalInterface : new zzkw(iBinder);
    }
}
