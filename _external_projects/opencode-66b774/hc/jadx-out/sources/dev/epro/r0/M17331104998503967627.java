package dev.epro.r0;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M17331104998503967627 implements GenericArrayType, Serializable {
    public final Type a;

    public M17331104998503967627(Type type) {
        Objects.requireNonNull(type);
        this.a = U15853425786981391261.v(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && U15853425786981391261.E(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return U15853425786981391261.h0(this.a) + "[]";
    }
}
