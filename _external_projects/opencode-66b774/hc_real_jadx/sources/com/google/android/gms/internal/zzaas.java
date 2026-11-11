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
public final class zzaas extends AbstractC2501<zzabb> {
    private int zzcnb;

    public zzaas(Context context, Looper looper, InterfaceC2491 interfaceC2491, InterfaceC2496 interfaceC2496, int i) {
        super(context.getApplicationContext() != null ? context.getApplicationContext() : context, looper, 8, interfaceC2491, interfaceC2496, null);
        this.zzcnb = i;
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final /* synthetic */ zzabb zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof zzabb ? (zzabb) queryLocalInterface : new zzabd(iBinder);
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final String zzhi() {
        return "com.google.android.gms.ads.service.START";
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final String zzhj() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final zzabb zznm() {
        return (zzabb) super.zzakn();
    }
}
