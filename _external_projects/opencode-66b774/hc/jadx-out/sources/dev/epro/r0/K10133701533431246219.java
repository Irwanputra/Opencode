package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K10133701533431246219 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof K10133701533431246219) {
            return this.a == ((K10133701533431246219) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.a;
        return !z ? "Polite" : z ? "Assertive" : "Unknown";
    }
}
