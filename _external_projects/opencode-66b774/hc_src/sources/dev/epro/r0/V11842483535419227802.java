package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V11842483535419227802 {
    public final Y17711880887972520074 a;
    public final boolean b;

    public V11842483535419227802(int i) {
        boolean z = (i & 4) != 0;
        this.a = Y17711880887972520074.a;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V11842483535419227802)) {
            return false;
        }
        V11842483535419227802 v11842483535419227802 = (V11842483535419227802) obj;
        return this.a == v11842483535419227802.a && this.b == v11842483535419227802.b;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(true) + G6547577305291411977.i((this.a.hashCode() + G6547577305291411977.i(Boolean.hashCode(true) * 31, 31, true)) * 31, 31, this.b)) * 31) + 2) * 31;
    }
}
