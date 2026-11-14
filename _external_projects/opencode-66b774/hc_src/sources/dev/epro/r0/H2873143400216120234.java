package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class H2873143400216120234 extends A8269341136279542501 {
    public final D5719685721490174593 a;

    public H2873143400216120234(D5719685721490174593 d5719685721490174593) {
        this.a = d5719685721490174593;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        O16069943227202361206 o16069943227202361206 = new O16069943227202361206();
        o16069943227202361206.q = this.a;
        return o16069943227202361206;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        O16069943227202361206 o16069943227202361206 = (O16069943227202361206) r15896830329318850690;
        D5719685721490174593 d5719685721490174593 = o16069943227202361206.q;
        D5719685721490174593 d57196857214901745932 = this.a;
        if (d57196857214901745932.equals(d5719685721490174593)) {
            return;
        }
        o16069943227202361206.q = d57196857214901745932;
        o16069943227202361206.i1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H2873143400216120234) {
            return ((H2873143400216120234) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
