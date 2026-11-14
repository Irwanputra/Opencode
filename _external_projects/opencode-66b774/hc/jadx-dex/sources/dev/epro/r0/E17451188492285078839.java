package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E17451188492285078839 extends dev.epro.r0.R11411706056986754302 {
    public final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        dev.epro.r0.Q14925164961901808324 q14925164961901808324QueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return q14925164961901808324QueryLocalInterface instanceof dev.epro.r0.Q14925164961901808324 ? q14925164961901808324QueryLocalInterface : new dev.epro.r0.Q14925164961901808324(iBinder);
    }

    public final java.lang.String c() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    public final java.lang.String d() {
        return "com.google.android.gms.appset.service.START";
    }

    public final dev.epro.r0.J18325703078859211263[] getApiFeatures() {
        return dev.epro.r0.S2941385686793915703.R;
    }

    public final int getMinApkVersion() {
        return 212800000;
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }
}
