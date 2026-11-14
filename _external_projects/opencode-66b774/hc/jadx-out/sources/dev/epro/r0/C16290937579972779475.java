package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C16290937579972779475 {
    public final Object a;
    public final Object b;

    public C16290937579972779475(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16290937579972779475.class != obj.getClass()) {
            return false;
        }
        C16290937579972779475 c16290937579972779475 = (C16290937579972779475) obj;
        Object obj2 = c16290937579972779475.a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        Object obj4 = c16290937579972779475.b;
        Object obj5 = this.b;
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
        Object obj = this.a;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 31) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
