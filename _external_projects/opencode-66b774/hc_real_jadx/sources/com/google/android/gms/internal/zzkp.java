package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzkp extends zzeu implements zzkn {
    public zzkp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, publisherAdViewOptions);
        zzb(9, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzpe zzpeVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzpeVar);
        zzb(6, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzqq zzqqVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzqqVar);
        zzb(3, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzqt zzqtVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzqtVar);
        zzb(4, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzrc zzrcVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzrcVar);
        zzb(10, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzrf zzrfVar, zzjn zzjnVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzrfVar);
        zzew.zza(zzbe, zzjnVar);
        zzb(8, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(String str, zzqz zzqzVar, zzqw zzqwVar) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        zzew.zza(zzbe, zzqzVar);
        zzew.zza(zzbe, zzqwVar);
        zzb(5, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zzb(zzkh zzkhVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzkhVar);
        zzb(2, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zzb(zzld zzldVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzldVar);
        zzb(7, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final zzkk zzdi() {
        zzkk zzkmVar;
        Parcel zza = zza(1, zzbe());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzkmVar = queryLocalInterface instanceof zzkk ? (zzkk) queryLocalInterface : new zzkm(readStrongBinder);
        }
        zza.recycle();
        return zzkmVar;
    }
}
