package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z15361361711907993645 {
    public final int a;

    public /* synthetic */ Z15361361711907993645(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Z15361361711907993645) {
            return this.a == ((Z15361361711907993645) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return G6547577305291411977.o(this.a, "AutoClearFocusBehavior(value=", ")");
    }
}
