package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X13590909012094200898 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof X13590909012094200898) {
            return this.a == ((X13590909012094200898) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Hour" : i == 1 ? "Minute" : "";
    }
}
