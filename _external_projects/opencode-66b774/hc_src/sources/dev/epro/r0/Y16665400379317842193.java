package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y16665400379317842193 {
    public final long a = U10174709222559481877.h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y16665400379317842193)) {
            return false;
        }
        long j = ((Y16665400379317842193) obj).a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j);
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) U10174709222559481877.h(this.a)) + ", rippleAlpha=null)";
    }
}
