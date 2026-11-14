package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K16125985034475820531 implements H1203938712873468075 {
    public final String a;

    public K16125985034475820531(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K16125985034475820531) {
            return this.a.equals(((K16125985034475820531) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return G6547577305291411977.s("UrlAnnotation(url=", this.a, ")");
    }
}
