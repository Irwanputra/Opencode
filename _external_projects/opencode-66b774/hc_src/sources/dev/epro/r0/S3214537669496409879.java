package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S3214537669496409879 {
    public final Object a;
    public final L3530692241870850490 b;
    public boolean c;

    public S3214537669496409879(Object obj) {
        L3530692241870850490 l3530692241870850490 = new L3530692241870850490();
        this.a = obj;
        this.b = l3530692241870850490;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S3214537669496409879) {
            S3214537669496409879 s3214537669496409879 = (S3214537669496409879) obj;
            if (this.a.equals(s3214537669496409879.a) && this.b == s3214537669496409879.b && this.c == s3214537669496409879.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + X2485016533998461232.f(0, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        boolean z = this.c;
        StringBuilder sb = new StringBuilder("Entry(key=");
        sb.append(this.a);
        sb.append(", store=");
        sb.append(this.b);
        sb.append(", refCount=0, isDisposable=");
        return E12098517352909843120.o(sb, z, ")");
    }
}
