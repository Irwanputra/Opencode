package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H7844982194660002900 {
    public F2238012860950049442 a = null;
    public U5519500298982620611 b = null;
    public N16536369055082677148 c = null;
    public B1061516154492673368 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H7844982194660002900)) {
            return false;
        }
        H7844982194660002900 h7844982194660002900 = (H7844982194660002900) obj;
        return S10823041268949770285.t(this.a, h7844982194660002900.a) && S10823041268949770285.t(this.b, h7844982194660002900.b) && S10823041268949770285.t(this.c, h7844982194660002900.c) && S10823041268949770285.t(this.d, h7844982194660002900.d);
    }

    public final int hashCode() {
        F2238012860950049442 f2238012860950049442 = this.a;
        int hashCode = (f2238012860950049442 == null ? 0 : f2238012860950049442.hashCode()) * 31;
        U5519500298982620611 u5519500298982620611 = this.b;
        int hashCode2 = (hashCode + (u5519500298982620611 == null ? 0 : u5519500298982620611.hashCode())) * 31;
        N16536369055082677148 n16536369055082677148 = this.c;
        int hashCode3 = (hashCode2 + (n16536369055082677148 == null ? 0 : n16536369055082677148.hashCode())) * 31;
        B1061516154492673368 b1061516154492673368 = this.d;
        return hashCode3 + (b1061516154492673368 != null ? b1061516154492673368.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
