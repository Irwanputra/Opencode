package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q9839587184380308437 {
    public final int a;
    public final int b;
    public final String c;
    public final List d;

    public Q9839587184380308437(ArrayList arrayList, int i, int i2) {
        String str;
        this.a = i;
        this.b = i2;
        if (!arrayList.isEmpty()) {
            V17780983785905150922 v17780983785905150922 = (V17780983785905150922) arrayList.get(0);
            if ("Name".equalsIgnoreCase(v17780983785905150922.a)) {
                str = v17780983785905150922.b;
                this.c = str;
                this.d = Collections.unmodifiableList(new ArrayList(arrayList));
            }
        }
        str = null;
        this.c = str;
        this.d = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final String a(String str) {
        for (V17780983785905150922 v17780983785905150922 : this.d) {
            if (v17780983785905150922.a.equalsIgnoreCase(str)) {
                return v17780983785905150922.b;
            }
        }
        return null;
    }
}
