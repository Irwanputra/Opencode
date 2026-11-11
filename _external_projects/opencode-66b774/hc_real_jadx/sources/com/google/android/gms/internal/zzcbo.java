package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p131.p161.p162.p193.p205.p208.AbstractC2501;
import p131.p161.p162.p193.p205.p208.InterfaceC2491;
import p131.p161.p162.p193.p205.p208.InterfaceC2496;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzcbo extends AbstractC2501<zzcbt> {
    public zzcbo(Context context, Looper looper, InterfaceC2491 interfaceC2491, InterfaceC2496 interfaceC2496) {
        super(context, looper, 116, interfaceC2491, interfaceC2496, null);
    }

    public final zzcbt zzauq() {
        return (zzcbt) super.zzakn();
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final /* synthetic */ zzcbt zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzcbt ? (zzcbt) queryLocalInterface : new zzcbu(iBinder);
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final String zzhi() {
        return "com.google.android.gms.gass.START";
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2501
    public final String zzhj() {
        return "com.google.android.gms.gass.internal.IGassService";
    }
}
