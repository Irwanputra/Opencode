package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C13297862214201274442 {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.C13297862214201274442) {
            return this.a == ((dev.epro.r0.C13297862214201274442) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.a);
    }

    public final java.lang.String toString() {
        int i = this.a;
        return i == 0 ? "Picker" : i == 1 ? "Input" : "Unknown";
    }
}
