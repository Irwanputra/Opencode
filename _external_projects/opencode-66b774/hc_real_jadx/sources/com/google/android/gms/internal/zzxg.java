package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzxg extends zzeu implements zzxe {
    public zzxg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcel zzbe = zzbe();
        zzbe.writeInt(i);
        zzbe.writeInt(i2);
        zzew.zza(zzbe, intent);
        zzb(12, zzbe);
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onBackPressed() {
        zzb(10, zzbe());
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onCreate(Bundle bundle) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, bundle);
        zzb(1, zzbe);
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onDestroy() {
        zzb(8, zzbe());
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onPause() {
        zzb(5, zzbe());
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onRestart() {
        zzb(2, zzbe());
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onResume() {
        zzb(4, zzbe());
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, bundle);
        Parcel zza = zza(6, zzbe);
        if (zza.readInt() != 0) {
            bundle.readFromParcel(zza);
        }
        zza.recycle();
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onStart() {
        zzb(3, zzbe());
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onStop() {
        zzb(7, zzbe());
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void zzbf() {
        zzb(9, zzbe());
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void zzk(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(13, zzbe);
    }

    @Override // com.google.android.gms.internal.zzxe
    public final boolean zzmu() {
        Parcel zza = zza(11, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }
}
