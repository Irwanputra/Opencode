package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C16290937579972779475 {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public C16290937579972779475(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dev.epro.r0.C16290937579972779475.class != obj.getClass()) {
            return false;
        }
        dev.epro.r0.C16290937579972779475 c16290937579972779475 = (dev.epro.r0.C16290937579972779475) obj;
        java.lang.Object obj2 = c16290937579972779475.a;
        java.lang.Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        java.lang.Object obj4 = c16290937579972779475.b;
        java.lang.Object obj5 = this.b;
        if (obj5 == null) {
            if (obj4 != null) {
                return false;
            }
        } else if (!obj5.equals(obj4)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 31) * 31;
        java.lang.Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
