package dev.epro.r0;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F2666344450883603512 {
    public final String a;
    public final Set b;

    public F2666344450883603512(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F2666344450883603512)) {
            return false;
        }
        F2666344450883603512 f2666344450883603512 = (F2666344450883603512) obj;
        return this.a.equals(f2666344450883603512.a) && this.b.equals(f2666344450883603512.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return G6547577305291411977.w(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.a, ", verdictOptOut=", this.b.toString(), "}");
    }
}
