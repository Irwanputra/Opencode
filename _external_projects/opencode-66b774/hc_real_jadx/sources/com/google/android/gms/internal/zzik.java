package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p131.p161.p162.p193.p205.p208.AbstractC2501;
import p131.p161.p162.p193.p205.p208.InterfaceC2491;
import p131.p161.p162.p193.p205.p208.InterfaceC2496;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzik extends AbstractC2501<zzio> {
    public zzik(Context context, Looper looper, InterfaceC2491 interfaceC2491, InterfaceC2496 interfaceC2496) {
        super(context, looper, 123, interfaceC2491, interfaceC2496, null);
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final /* synthetic */ zzio zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzio ? (zzio) queryLocalInterface : new zzip(iBinder);
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final String zzhi() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final String zzhj() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    public final zzio zzhk() {
        return (zzio) super.zzakn();
    }
}
