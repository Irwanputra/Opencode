package dev.epro.r0;

import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V1154380420567164397 implements Map.Entry, D14639766352081121636 {
    public final N16594346128251165883 a;
    public final H9528616825559273309 b;
    public V1154380420567164397 c;
    public V1154380420567164397 d;
    public boolean e;

    public V1154380420567164397(N16594346128251165883 n16594346128251165883, H9528616825559273309 h9528616825559273309) {
        this.a = n16594346128251165883;
        this.b = h9528616825559273309;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V1154380420567164397) {
            V1154380420567164397 v1154380420567164397 = (V1154380420567164397) obj;
            return this.a.equals(v1154380420567164397.a) && this.b == v1154380420567164397.b;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.a + ", value=" + this.b + ")";
    }
}
