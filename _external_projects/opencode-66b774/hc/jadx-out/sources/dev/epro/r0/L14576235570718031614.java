package dev.epro.r0;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L14576235570718031614 {
    public final LinkedHashMap a = new LinkedHashMap();

    public Object a(W14715101850940949422 w14715101850940949422) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof L14576235570718031614) {
            return this.a.equals(((L14576235570718031614) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}
