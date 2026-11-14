package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E874292296621450842 {
    public final G15527156457921655762 a;
    public final F4096073349764486348 b;
    public final A10693687560045094360 c;
    public final boolean d;

    public E874292296621450842(G15527156457921655762 g15527156457921655762, F4096073349764486348 f4096073349764486348, A10693687560045094360 a10693687560045094360, boolean z) {
        this.a = g15527156457921655762;
        this.b = f4096073349764486348;
        this.c = a10693687560045094360;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E874292296621450842)) {
            return false;
        }
        E874292296621450842 e874292296621450842 = (E874292296621450842) obj;
        return S10823041268949770285.t(this.a, e874292296621450842.a) && S10823041268949770285.t(this.b, e874292296621450842.b) && S10823041268949770285.t(this.c, e874292296621450842.c) && this.d == e874292296621450842.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + L11610354117192841236.g(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ")";
    }
}
