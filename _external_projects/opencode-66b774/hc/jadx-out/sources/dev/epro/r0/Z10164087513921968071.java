package dev.epro.r0;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z10164087513921968071 {
    public final Resources.Theme a;
    public final int b;

    public Z10164087513921968071(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z10164087513921968071)) {
            return false;
        }
        Z10164087513921968071 z10164087513921968071 = (Z10164087513921968071) obj;
        return S10823041268949770285.t(this.a, z10164087513921968071.a) && this.b == z10164087513921968071.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ")";
    }
}
