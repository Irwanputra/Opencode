package dev.epro.r0;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E17451188492285078839 extends R11411706056986754302 {
    @Override // dev.epro.r0.E1636901823844057514
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof Q14925164961901808324 ? (Q14925164961901808324) queryLocalInterface : new Q14925164961901808324(iBinder);
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final String c() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final String d() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final J18325703078859211263[] getApiFeatures() {
        return S2941385686793915703.R;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
