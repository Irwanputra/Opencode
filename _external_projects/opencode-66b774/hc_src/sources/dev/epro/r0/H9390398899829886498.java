package dev.epro.r0;

import java.io.Serializable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H9390398899829886498 implements Serializable {
    public final Object a;
    public final Object b;

    public H9390398899829886498(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H9390398899829886498)) {
            return false;
        }
        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) obj;
        return S10823041268949770285.t(this.a, h9390398899829886498.a) && S10823041268949770285.t(this.b, h9390398899829886498.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
