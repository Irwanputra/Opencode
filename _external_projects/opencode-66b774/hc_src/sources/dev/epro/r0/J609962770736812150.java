package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J609962770736812150 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ J609962770736812150(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J609962770736812150) {
            return this.a == ((J609962770736812150) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return G6547577305291411977.o(this.a, "AndroidContentDataType(androidAutofillType=", ")");
    }
}
