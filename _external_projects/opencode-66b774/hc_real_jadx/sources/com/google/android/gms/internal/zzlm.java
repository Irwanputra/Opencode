package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzlm extends zzev implements zzll {
    public zzlm() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzll zzh(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzll ? (zzll) queryLocalInterface : new zzln(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean isMuted;
        float zzih;
        zzlo zzlqVar;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                play();
                parcel2.writeNoException();
                break;
            case 2:
                pause();
                parcel2.writeNoException();
                break;
            case 3:
                mute(zzew.zza(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                isMuted = isMuted();
                parcel2.writeNoException();
                zzew.zza(parcel2, isMuted);
                break;
            case 5:
                int playbackState = getPlaybackState();
                parcel2.writeNoException();
                parcel2.writeInt(playbackState);
                break;
            case 6:
                zzih = zzih();
                parcel2.writeNoException();
                parcel2.writeFloat(zzih);
                break;
            case 7:
                zzih = zzii();
                parcel2.writeNoException();
                parcel2.writeFloat(zzih);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzlqVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzlqVar = queryLocalInterface instanceof zzlo ? (zzlo) queryLocalInterface : new zzlq(readStrongBinder);
                }
                zza(zzlqVar);
                parcel2.writeNoException();
                break;
            case 9:
                zzih = getAspectRatio();
                parcel2.writeNoException();
                parcel2.writeFloat(zzih);
                break;
            case 10:
                isMuted = isCustomControlsEnabled();
                parcel2.writeNoException();
                zzew.zza(parcel2, isMuted);
                break;
            case 11:
                zzlo zzij = zzij();
                parcel2.writeNoException();
                zzew.zza(parcel2, zzij);
                break;
            case 12:
                isMuted = isClickToExpandEnabled();
                parcel2.writeNoException();
                zzew.zza(parcel2, isMuted);
                break;
        }
        return true;
    }
}
