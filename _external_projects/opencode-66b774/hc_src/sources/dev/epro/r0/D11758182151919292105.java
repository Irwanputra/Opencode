package dev.epro.r0;

import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D11758182151919292105 implements Map.Entry {
    public final Object a;
    public final W16122746836868022518 b;
    public D11758182151919292105 c;
    public D11758182151919292105 d;

    public D11758182151919292105(Object obj, W16122746836868022518 w16122746836868022518) {
        this.a = obj;
        this.b = w16122746836868022518;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D11758182151919292105) {
            D11758182151919292105 d11758182151919292105 = (D11758182151919292105) obj;
            return this.a.equals(d11758182151919292105.a) && this.b == d11758182151919292105.b;
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
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
