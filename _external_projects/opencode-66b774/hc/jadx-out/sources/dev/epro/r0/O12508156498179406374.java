package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O12508156498179406374 {
    public static final O12508156498179406374 b = new O12508156498179406374("text/*");
    public static final O12508156498179406374 c = new O12508156498179406374("*/*");
    public final String a;

    public O12508156498179406374(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O12508156498179406374)) {
            return false;
        }
        return this.a.equals(((O12508156498179406374) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return G6547577305291411977.s("MediaType(representation='", this.a, "')");
    }
}
