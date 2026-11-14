package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L1995871430852137122 {
    public final Z13251062865217617579 a;
    public final J6301524036964264730 b;

    public L1995871430852137122(Z13251062865217617579 z13251062865217617579, J6301524036964264730 j6301524036964264730) {
        this.a = z13251062865217617579;
        this.b = j6301524036964264730;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L1995871430852137122)) {
            return false;
        }
        L1995871430852137122 l1995871430852137122 = (L1995871430852137122) obj;
        return S10823041268949770285.t(this.a, l1995871430852137122.a) && S10823041268949770285.t(this.b, l1995871430852137122.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
