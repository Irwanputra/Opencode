package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O12013896688000893502 {
    public static final O12013896688000893502 c = new O12013896688000893502(null, null, 63);
    public final F4096073349764486348 a;
    public final F4096073349764486348 b;

    public O12013896688000893502(F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, int i) {
        f4096073349764486348 = (i & 1) != 0 ? null : f4096073349764486348;
        f40960733497644863482 = (i & 4) != 0 ? null : f40960733497644863482;
        this.a = f4096073349764486348;
        this.b = f40960733497644863482;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O12013896688000893502)) {
            return false;
        }
        O12013896688000893502 o12013896688000893502 = (O12013896688000893502) obj;
        return this.a == o12013896688000893502.a && this.b == o12013896688000893502.b;
    }

    public final int hashCode() {
        F4096073349764486348 f4096073349764486348 = this.a;
        int iHashCode = (f4096073349764486348 != null ? f4096073349764486348.hashCode() : 0) * 961;
        F4096073349764486348 f40960733497644863482 = this.b;
        return (iHashCode + (f40960733497644863482 != null ? f40960733497644863482.hashCode() : 0)) * 29791;
    }
}
