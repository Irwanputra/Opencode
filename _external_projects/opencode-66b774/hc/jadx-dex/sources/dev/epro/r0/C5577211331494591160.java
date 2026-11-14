package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C5577211331494591160 {
    public final java.lang.Class a;
    public final java.lang.Class b;

    public C5577211331494591160(java.lang.Class cls, java.lang.Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.C5577211331494591160)) {
            return false;
        }
        dev.epro.r0.C5577211331494591160 c5577211331494591160 = (dev.epro.r0.C5577211331494591160) obj;
        return c5577211331494591160.a.equals(this.a) && c5577211331494591160.b.equals(this.b);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.a, this.b);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.s(this.a.getSimpleName(), " with primitive type: ", this.b.getSimpleName());
    }
}
