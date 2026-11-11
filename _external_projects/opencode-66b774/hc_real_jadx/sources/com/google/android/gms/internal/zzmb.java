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
public final class zzmb extends AbstractC2458<zzlj> {
    public zzmb() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // p131.p161.p162.p193.p203.AbstractC2458
    public final /* synthetic */ zzlj zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzlj ? (zzlj) queryLocalInterface : new zzlk(iBinder);
    }

    public final zzlg zzg(Context context) {
        try {
            IBinder zza = zzde(context).zza(new BinderC2454(context), 11910000);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzlg ? (zzlg) queryLocalInterface : new zzli(zza);
        } catch (RemoteException e) {
            zzakb.zzc("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (C2457 e2) {
            zzakb.zzc("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
