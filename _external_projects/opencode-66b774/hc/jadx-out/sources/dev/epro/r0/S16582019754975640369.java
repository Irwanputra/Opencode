package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S16582019754975640369 {
    public final J9761478802862050991 a;
    public final J9761478802862050991 b;

    public S16582019754975640369(J9761478802862050991 j9761478802862050991, J9761478802862050991 j97614788028620509912) {
        if (j97614788028620509912 == null) {
            Z3383101362411723454.k("Nodes must be provided.");
            throw null;
        }
        this.a = j9761478802862050991;
        this.b = j97614788028620509912;
    }

    public final String toString() {
        return "<NodeTuple keyNode=" + this.a + "; valueNode=" + this.b + ">";
    }
}
