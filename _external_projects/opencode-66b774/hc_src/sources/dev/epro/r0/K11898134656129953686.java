package dev.epro.r0;

import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class K11898134656129953686<T> {
    public final Class a;
    public final Type b;
    public final int c;

    public K11898134656129953686(Type type) {
        Objects.requireNonNull(type);
        Type v = U15853425786981391261.v(type);
        this.b = v;
        this.a = U15853425786981391261.N(v);
        this.c = v.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K11898134656129953686) {
            return U15853425786981391261.E(this.b, ((K11898134656129953686) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return U15853425786981391261.h0(this.b);
    }
}
