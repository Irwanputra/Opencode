package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V5656221289452463152 {
    public final Z6884774333691094167 a;
    public final Z6884774333691094167 b;
    public final boolean c;

    public V5656221289452463152(Z6884774333691094167 z6884774333691094167, Z6884774333691094167 z68847743336910941672, boolean z) {
        this.a = z6884774333691094167;
        this.b = z68847743336910941672;
        this.c = z;
    }

    public static V5656221289452463152 a(V5656221289452463152 v5656221289452463152, Z6884774333691094167 z6884774333691094167, Z6884774333691094167 z68847743336910941672, boolean z, int i) {
        if ((i & 1) != 0) {
            z6884774333691094167 = v5656221289452463152.a;
        }
        if ((i & 2) != 0) {
            z68847743336910941672 = v5656221289452463152.b;
        }
        if ((i & 4) != 0) {
            z = v5656221289452463152.c;
        }
        v5656221289452463152.getClass();
        return new V5656221289452463152(z6884774333691094167, z68847743336910941672, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V5656221289452463152)) {
            return false;
        }
        V5656221289452463152 v5656221289452463152 = (V5656221289452463152) obj;
        return S10823041268949770285.t(this.a, v5656221289452463152.a) && S10823041268949770285.t(this.b, v5656221289452463152.b) && this.c == v5656221289452463152.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return E12098517352909843120.o(sb, this.c, ")");
    }
}
