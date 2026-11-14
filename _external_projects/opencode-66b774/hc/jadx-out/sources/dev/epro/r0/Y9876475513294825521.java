package dev.epro.r0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y9876475513294825521 extends R11411706056986754302 {
    public final C216269635322847295 c;

    public Y9876475513294825521(Context context, Looper looper, B16853324304735504143 b16853324304735504143, C216269635322847295 c216269635322847295, Z102412548944701279 z102412548944701279, Z102412548944701279 z1024125489447012792) {
        super(context, looper, 270, b16853324304735504143, z102412548944701279, z1024125489447012792);
        this.c = c216269635322847295;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof X5601567687078639138 ? (X5601567687078639138) iInterfaceQueryLocalInterface : new X5601567687078639138(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 0);
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final J18325703078859211263[] getApiFeatures() {
        return A10225670138084435446.h;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final Bundle getGetServiceRequestExtraArgs() {
        this.c.getClass();
        return new Bundle();
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
