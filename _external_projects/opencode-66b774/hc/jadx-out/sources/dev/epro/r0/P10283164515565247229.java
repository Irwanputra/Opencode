package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P10283164515565247229 implements O7949773076758836562 {
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public P10283164515565247229(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!P10283164515565247229.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((P10283164515565247229) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return G6547577305291411977.o(this.b, "AndroidPointerIcon(type=", ")");
    }
}
