package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C5577211331494591160 {
    public final Class a;
    public final Class b;

    public C5577211331494591160(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5577211331494591160)) {
            return false;
        }
        C5577211331494591160 c5577211331494591160 = (C5577211331494591160) obj;
        return c5577211331494591160.a.equals(this.a) && c5577211331494591160.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return G6547577305291411977.s(this.a.getSimpleName(), " with primitive type: ", this.b.getSimpleName());
    }
}
