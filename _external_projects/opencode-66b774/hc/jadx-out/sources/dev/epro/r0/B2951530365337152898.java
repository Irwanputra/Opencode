package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B2951530365337152898 implements R14538352738342298516 {
    public final Class a;

    public B2951530365337152898(Class cls) {
        this.a = cls;
    }

    @Override // dev.epro.r0.R14538352738342298516
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B2951530365337152898) {
            return this.a.equals(((B2951530365337152898) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
