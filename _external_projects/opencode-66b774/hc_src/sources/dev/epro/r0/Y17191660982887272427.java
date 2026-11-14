package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class Y17191660982887272427 extends S3338576511881427402 {
    public K10678596132709730734 a = null;

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        K10678596132709730734 k10678596132709730734 = this.a;
        if (k10678596132709730734 != null) {
            return k10678596132709730734.b(d13396727227989475489);
        }
        S10973172697741180971.m("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        K10678596132709730734 k10678596132709730734 = this.a;
        if (k10678596132709730734 != null) {
            k10678596132709730734.c(y14132333989764804283, obj);
        } else {
            S10973172697741180971.m("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // dev.epro.r0.S3338576511881427402
    public final K10678596132709730734 d() {
        K10678596132709730734 k10678596132709730734 = this.a;
        if (k10678596132709730734 != null) {
            return k10678596132709730734;
        }
        S10973172697741180971.m("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
