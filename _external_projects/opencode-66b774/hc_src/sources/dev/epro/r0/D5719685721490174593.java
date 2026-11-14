package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D5719685721490174593 implements B9345618057833789735 {
    public final int a;
    public final int b;

    public D5719685721490174593(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int a(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return this.a;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int b(R8540738700654750557 r8540738700654750557) {
        return this.b;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int c(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return 0;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int d(R8540738700654750557 r8540738700654750557) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D5719685721490174593)) {
            return false;
        }
        D5719685721490174593 d5719685721490174593 = (D5719685721490174593) obj;
        return this.a == d5719685721490174593.a && this.b == d5719685721490174593.b;
    }

    public final int hashCode() {
        return ((this.a * 31) + this.b) * 961;
    }

    public final String toString() {
        return G11450220448113054352.h(this.a, this.b, "Insets(left=", ", top=", ", right=0, bottom=0)");
    }
}
