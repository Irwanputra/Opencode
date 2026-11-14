package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D12564639665095693399 {
    public final android.net.Uri a;
    public final boolean b;

    public D12564639665095693399(android.net.Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dev.epro.r0.D12564639665095693399.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dev.epro.r0.D12564639665095693399 d12564639665095693399 = (dev.epro.r0.D12564639665095693399) obj;
        return this.a.equals(d12564639665095693399.a) && this.b == d12564639665095693399.b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
