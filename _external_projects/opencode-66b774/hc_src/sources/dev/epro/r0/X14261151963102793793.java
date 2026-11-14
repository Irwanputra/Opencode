package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X14261151963102793793 {
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ X14261151963102793793(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X14261151963102793793) {
            return this.a == ((X14261151963102793793) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        return G6547577305291411977.o(this.a ? 1 : 0, "TextHighlightType(value=", ")");
    }
}
