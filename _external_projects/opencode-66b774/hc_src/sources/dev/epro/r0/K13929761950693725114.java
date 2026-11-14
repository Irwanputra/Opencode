package dev.epro.r0;

import android.os.Bundle;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K13929761950693725114 {
    public final int a;
    public final Bundle b;

    public K13929761950693725114(Bundle bundle, int i) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K13929761950693725114)) {
            return false;
        }
        K13929761950693725114 k13929761950693725114 = (K13929761950693725114) obj;
        return this.a == k13929761950693725114.a && this.b.equals(k13929761950693725114.b);
    }
}
