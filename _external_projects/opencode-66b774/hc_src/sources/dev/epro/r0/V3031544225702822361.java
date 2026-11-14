package dev.epro.r0;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V3031544225702822361 {
    public final O3228356295430981133 a;

    public V3031544225702822361(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(V3031544225702822361.class.getClassLoader());
        bundle.getClass();
        O3228356295430981133 o3228356295430981133 = new O3228356295430981133();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            V4416135141588678913.s("nav-entry-state:id");
            throw null;
        }
        o3228356295430981133.b = string;
        int i = bundle.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt("nav-entry-state:destination-id", Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            V4416135141588678913.s("nav-entry-state:destination-id");
            throw null;
        }
        o3228356295430981133.a = i;
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            V4416135141588678913.s("nav-entry-state:args");
            throw null;
        }
        o3228356295430981133.c = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 == null) {
            V4416135141588678913.s("nav-entry-state:saved-state");
            throw null;
        }
        o3228356295430981133.d = bundle3;
        this.a = o3228356295430981133;
    }

    public V3031544225702822361(R14289894334981469490 r14289894334981469490) {
        int i = r14289894334981469490.b.b.a;
        O3228356295430981133 o3228356295430981133 = new O3228356295430981133();
        o3228356295430981133.b = r14289894334981469490.f;
        o3228356295430981133.a = i;
        o3228356295430981133.c = r14289894334981469490.c();
        Bundle z = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
        o3228356295430981133.d = z;
        r14289894334981469490.h.w(z);
        this.a = o3228356295430981133;
    }
}
