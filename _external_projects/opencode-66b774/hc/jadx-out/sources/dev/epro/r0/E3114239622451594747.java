package dev.epro.r0;

import android.os.Bundle;
import dev.epro.httpcustom.MainActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E3114239622451594747 implements L469992840463392687 {
    public final /* synthetic */ byte a;
    public final Object b;

    public E3114239622451594747(V10300877997588547986 v10300877997588547986) {
        this.a = (byte) 1;
        this.b = new LinkedHashSet();
        v10300877997588547986.y("androidx.savedstate.Restarter", this);
    }

    @Override // dev.epro.r0.L469992840463392687
    public final Bundle a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) obj).n();
                return bundle;
            default:
                Bundle bundleZ = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
                Z14316276734425062790.t(bundleZ, "classes_to_restore", R9411874267597469228.d1((LinkedHashSet) obj));
                return bundleZ;
        }
    }

    public E3114239622451594747(MainActivity mainActivity) {
        this.a = (byte) 0;
        this.b = mainActivity;
    }
}
