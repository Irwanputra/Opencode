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
public final class zzrq extends AbstractC2501<zzrv> {
    public zzrq(Context context, Looper looper, InterfaceC2491 interfaceC2491, InterfaceC2496 interfaceC2496) {
        super(context, looper, 166, interfaceC2491, interfaceC2496, null);
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final /* synthetic */ zzrv zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof zzrv ? (zzrv) queryLocalInterface : new zzrw(iBinder);
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final String zzhi() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final String zzhj() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    public final zzrv zzkt() {
        return (zzrv) super.zzakn();
    }
}
