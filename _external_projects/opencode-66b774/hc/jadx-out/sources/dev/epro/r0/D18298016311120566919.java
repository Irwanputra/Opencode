package dev.epro.r0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D18298016311120566919 implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public D18298016311120566919(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D18298016311120566919)) {
            return false;
        }
        D18298016311120566919 d18298016311120566919 = (D18298016311120566919) obj;
        return S10823041268949770285.t(this.a, d18298016311120566919.a) && S10823041268949770285.t(this.b, d18298016311120566919.b) && S10823041268949770285.t(this.c, d18298016311120566919.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
