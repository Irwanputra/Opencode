package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K16784123498484085517 extends H885820584188137964 {
    public final H12843822278061842084 f;

    public K16784123498484085517(H12843822278061842084 h12843822278061842084) {
        this.f = h12843822278061842084;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K16784123498484085517) {
            return this.f == ((K16784123498484085517) obj).f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f + ")";
    }
}
