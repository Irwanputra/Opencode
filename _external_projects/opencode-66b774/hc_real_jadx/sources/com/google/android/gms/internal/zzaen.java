package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzaen extends zzev implements zzaem {
    public zzaen() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzaem zzab(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzaem ? (zzaem) queryLocalInterface : new zzaeo(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                zzm(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 2:
                zzc(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                zzn(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 4:
                zzo(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 5:
                zzp(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 6:
                zzq(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 7:
                zza(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), (zzaeq) zzew.zza(parcel, zzaeq.CREATOR));
                break;
            case 8:
                zzr(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 9:
                zzd(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                zzs(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
