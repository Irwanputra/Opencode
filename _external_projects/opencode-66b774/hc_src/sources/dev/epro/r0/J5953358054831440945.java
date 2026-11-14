package dev.epro.r0;

import android.util.SparseArray;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J5953358054831440945 {
    public final SparseArray a;
    public D14027398382627356533 b;

    public J5953358054831440945(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(D14027398382627356533 d14027398382627356533, int i, int i2) {
        int a = d14027398382627356533.a(i);
        SparseArray sparseArray = this.a;
        J5953358054831440945 j5953358054831440945 = (J5953358054831440945) sparseArray.get(a);
        if (j5953358054831440945 == null) {
            j5953358054831440945 = new J5953358054831440945(1);
            sparseArray.put(d14027398382627356533.a(i), j5953358054831440945);
        }
        if (i2 > i) {
            j5953358054831440945.a(d14027398382627356533, i + 1, i2);
        } else {
            j5953358054831440945.b = d14027398382627356533;
        }
    }
}
