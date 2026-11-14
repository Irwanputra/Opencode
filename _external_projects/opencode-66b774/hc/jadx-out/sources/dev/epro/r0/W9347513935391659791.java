package dev.epro.r0;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W9347513935391659791 implements WildcardType, Serializable {
    public final Type a;
    public final Type b;

    public W9347513935391659791(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            S10973172697741180971.j("At most one lower bound is supported");
            throw null;
        }
        if (typeArr.length != 1) {
            S10973172697741180971.j("Exactly one upper bound must be specified");
            throw null;
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            U15853425786981391261.z(typeArr[0]);
            this.b = null;
            this.a = U15853425786981391261.v(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        U15853425786981391261.z(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            S10973172697741180971.j("When lower bound is specified, upper bound must be Object");
            throw null;
        }
        this.b = U15853425786981391261.v(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && U15853425786981391261.E(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : U15853425786981391261.g;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (this.a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + U15853425786981391261.h0(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + U15853425786981391261.h0(type2);
    }
}
