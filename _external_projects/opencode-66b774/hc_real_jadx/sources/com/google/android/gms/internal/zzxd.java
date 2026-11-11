package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p131.p161.p162.p193.p203.AbstractC2458;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.C2457;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzxd extends AbstractC2458<zzxh> {
    public zzxd() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final zzxe zze(Activity activity) {
        try {
            IBinder zzl = zzde(activity).zzl(new BinderC2454(activity));
            if (zzl == null) {
                return null;
            }
            IInterface queryLocalInterface = zzl.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzxe ? (zzxe) queryLocalInterface : new zzxg(zzl);
        } catch (RemoteException e) {
            zzakb.zzc("Could not create remote AdOverlay.", e);
            return null;
        } catch (C2457 e2) {
            zzakb.zzc("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    @Override // p131.p161.p162.p193.p203.AbstractC2458
    public final /* synthetic */ zzxh zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzxh ? (zzxh) queryLocalInterface : new zzxi(iBinder);
    }
}
