package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D11758182151919292105 implements java.util.Map.Entry {
    public final java.lang.Object a;
    public final dev.epro.r0.W16122746836868022518 b;
    public dev.epro.r0.D11758182151919292105 c;
    public dev.epro.r0.D11758182151919292105 d;

    public D11758182151919292105(java.lang.Object obj, dev.epro.r0.W16122746836868022518 w16122746836868022518) {
        this.a = obj;
        this.b = w16122746836868022518;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dev.epro.r0.D11758182151919292105) {
            dev.epro.r0.D11758182151919292105 d11758182151919292105 = (dev.epro.r0.D11758182151919292105) obj;
            return this.a.equals(d11758182151919292105.a) && this.b == d11758182151919292105.b;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
    }

    public final java.lang.String toString() {
        return this.a + "=" + this.b;
    }
}
