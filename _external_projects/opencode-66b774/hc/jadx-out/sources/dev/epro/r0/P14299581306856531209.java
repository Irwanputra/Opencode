package dev.epro.r0;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P14299581306856531209 implements L469992840463392687 {
    public final V10300877997588547986 a;
    public boolean b;
    public Bundle c;
    public final O12494175665883759871 d;

    public P14299581306856531209(V10300877997588547986 v10300877997588547986, J5715778638296486773 j5715778638296486773) {
        v10300877997588547986.getClass();
        this.a = v10300877997588547986;
        this.d = new O12494175665883759871(new N8306548196372912291(j5715778638296486773, (byte) 13));
    }

    @Override // dev.epro.r0.L469992840463392687
    public final Bundle a() {
        Bundle bundleZ = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleZ.putAll(bundle);
        }
        for (Map.Entry entry : ((T12832465072585023763) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((N8459270538234465343) ((L13135072960070674001) entry.getValue()).b.e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleZ.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleZ;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleG = this.a.g("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleZ = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleZ.putAll(bundle);
        }
        if (bundleG != null) {
            bundleZ.putAll(bundleG);
        }
        this.c = bundleZ;
        this.b = true;
    }
}
