package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D873579236909824701 {
    public final long a;

    public D873579236909824701(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dev.epro.r0.D873579236909824701) && this.a == ((dev.epro.r0.D873579236909824701) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) ((j >>> 32) ^ j)) ^ 1000003) * (-721379959);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.L11610354117192841236.p(this.a, ", webViewRequestMode=0, sessionId=null}", new java.lang.StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="));
    }
}
