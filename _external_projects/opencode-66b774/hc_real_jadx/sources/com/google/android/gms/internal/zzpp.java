package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpp extends NativeAd.AdChoicesInfo {
    private final List<NativeAd.Image> zzbth = new ArrayList();
    private final zzpm zzbwb;
    private String zzbwc;

    public zzpp(zzpm zzpmVar) {
        zzpq zzpqVar;
        IBinder iBinder;
        this.zzbwb = zzpmVar;
        try {
            this.zzbwc = zzpmVar.getText();
        } catch (RemoteException e) {
            zzakb.zzb("Error while obtaining attribution text.", e);
            this.zzbwc = "";
        }
        try {
            for (zzpq zzpqVar2 : zzpmVar.zzjm()) {
                if (!(zzpqVar2 instanceof IBinder) || (iBinder = (IBinder) zzpqVar2) == null) {
                    zzpqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzpqVar = queryLocalInterface instanceof zzpq ? (zzpq) queryLocalInterface : new zzps(iBinder);
                }
                if (zzpqVar != null) {
                    this.zzbth.add(new zzpt(zzpqVar));
                }
            }
        } catch (RemoteException e2) {
            zzakb.zzb("Error while obtaining image.", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzbth;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzbwc;
    }
}
