package dev.epro.r0;

import android.os.Bundle;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W6610499404761400913 implements Comparable {
    public final V7801742040189616406 a;
    public final Bundle b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public W6610499404761400913(V7801742040189616406 v7801742040189616406, Bundle bundle, boolean z, int i, boolean z2) {
        this.a = v7801742040189616406;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(W6610499404761400913 w6610499404761400913) {
        w6610499404761400913.getClass();
        boolean z = w6610499404761400913.e;
        boolean z2 = w6610499404761400913.c;
        Bundle bundle = w6610499404761400913.b;
        boolean z3 = this.c;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.d - w6610499404761400913.d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.e;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
