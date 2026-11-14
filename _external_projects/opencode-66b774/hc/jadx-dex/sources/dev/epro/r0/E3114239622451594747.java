package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E3114239622451594747 implements dev.epro.r0.L469992840463392687 {
    public final /* synthetic */ byte a;
    public final java.lang.Object b;

    public E3114239622451594747(dev.epro.r0.V10300877997588547986 v10300877997588547986) {
        this.a = (byte) 1;
        this.b = new java.util.LinkedHashSet();
        v10300877997588547986.y("androidx.savedstate.Restarter", this);
    }

    public final android.os.Bundle a() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                android.os.Bundle bundle = new android.os.Bundle();
                ((dev.epro.httpcustom.MainActivity) obj).n();
                return bundle;
            default:
                android.os.Bundle bundleZ = dev.epro.r0.O5354877807466160604.z((dev.epro.r0.H9390398899829886498[]) java.util.Arrays.copyOf(new dev.epro.r0.H9390398899829886498[0], 0));
                dev.epro.r0.Z14316276734425062790.t(bundleZ, "classes_to_restore", dev.epro.r0.R9411874267597469228.d1((java.util.LinkedHashSet) obj));
                return bundleZ;
        }
    }

    public E3114239622451594747(dev.epro.httpcustom.MainActivity mainActivity) {
        this.a = (byte) 0;
        this.b = mainActivity;
    }
}
