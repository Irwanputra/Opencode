package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzln extends zzeu implements zzll {
    public zzln(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.zzll
    public final float getAspectRatio() {
        Parcel zza = zza(9, zzbe());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.zzll
    public final int getPlaybackState() {
        Parcel zza = zza(5, zzbe());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.zzll
    public final boolean isClickToExpandEnabled() {
        Parcel zza = zza(12, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzll
    public final boolean isCustomControlsEnabled() {
        Parcel zza = zza(10, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzll
    public final boolean isMuted() {
        Parcel zza = zza(4, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzll
    public final void mute(boolean z) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, z);
        zzb(3, zzbe);
    }

    @Override // com.google.android.gms.internal.zzll
    public final void pause() {
        zzb(2, zzbe());
    }

    @Override // com.google.android.gms.internal.zzll
    public final void play() {
        zzb(1, zzbe());
    }

    @Override // com.google.android.gms.internal.zzll
    public final void zza(zzlo zzloVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzloVar);
        zzb(8, zzbe);
    }

    @Override // com.google.android.gms.internal.zzll
    public final float zzih() {
        Parcel zza = zza(6, zzbe());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.zzll
    public final float zzii() {
        Parcel zza = zza(7, zzbe());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.zzll
    public final zzlo zzij() {
        zzlo zzlqVar;
        Parcel zza = zza(11, zzbe());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzlqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzlqVar = queryLocalInterface instanceof zzlo ? (zzlo) queryLocalInterface : new zzlq(readStrongBinder);
        }
        zza.recycle();
        return zzlqVar;
    }
}
