package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U18170924438753170978 {
    public final D417720124633959953 a;
    public final int b;
    public final int c;

    public U18170924438753170978(D417720124633959953 d417720124633959953, int i, int i2) {
        this.a = d417720124633959953;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U18170924438753170978) {
            U18170924438753170978 u18170924438753170978 = (U18170924438753170978) obj;
            if (this.a == u18170924438753170978.a && this.b == u18170924438753170978.b && this.c == u18170924438753170978.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return E12098517352909843120.n(sb, this.c, ")");
    }
}
