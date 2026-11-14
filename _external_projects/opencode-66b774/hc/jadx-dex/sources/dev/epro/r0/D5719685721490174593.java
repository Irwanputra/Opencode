package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D5719685721490174593 implements dev.epro.r0.B9345618057833789735 {
    public final int a;
    public final int b;

    public D5719685721490174593(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int a(dev.epro.r0.R8540738700654750557 r8540738700654750557, dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        return this.a;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int b(dev.epro.r0.R8540738700654750557 r8540738700654750557) {
        return this.b;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int c(dev.epro.r0.R8540738700654750557 r8540738700654750557, dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        return 0;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int d(dev.epro.r0.R8540738700654750557 r8540738700654750557) {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.D5719685721490174593)) {
            return false;
        }
        dev.epro.r0.D5719685721490174593 d5719685721490174593 = (dev.epro.r0.D5719685721490174593) obj;
        return this.a == d5719685721490174593.a && this.b == d5719685721490174593.b;
    }

    public final int hashCode() {
        return ((this.a * 31) + this.b) * 961;
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G11450220448113054352.h(this.a, this.b, "Insets(left=", ", top=", ", right=0, bottom=0)");
    }
}
