package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B8690326337663253179 {
    public final int a;
    public final Object b;

    public B8690326337663253179(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B8690326337663253179)) {
            return false;
        }
        B8690326337663253179 b8690326337663253179 = (B8690326337663253179) obj;
        return this.a == b8690326337663253179.a && S10823041268949770285.t(this.b, b8690326337663253179.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
