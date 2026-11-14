package dev.epro.r0;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G16472559273103586035 extends E1636901823844057514 {
    @Override // dev.epro.r0.E1636901823844057514
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = V15988431841853345341.j;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof B1049225300677980478 ? (B1049225300677980478) iInterfaceQueryLocalInterface : new T3920948503184368030(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", (byte) 1);
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final String c() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final String d() {
        return "com.google.android.gms.ads.service.START";
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final int getMinApkVersion() {
        return 243300000;
    }
}
