package dev.epro.r0;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S3746654492080191549 implements ParameterizedType, Serializable {
    public final Type a;
    public final Type b;
    public final Type[] c;

    public S3746654492080191549(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            Q11088980322693754445.l("Must specify owner type for ", cls);
            throw null;
        }
        this.a = type != null ? U15853425786981391261.v(type) : null;
        this.b = U15853425786981391261.v(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.c[i]);
            U15853425786981391261.z(this.c[i]);
            Type[] typeArr3 = this.c;
            typeArr3[i] = U15853425786981391261.v(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && U15853425786981391261.E(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
        Type type = this.a;
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Type type = this.b;
        if (length == 0) {
            return U15853425786981391261.h0(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(U15853425786981391261.h0(type));
        sb.append("<");
        sb.append(U15853425786981391261.h0(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(U15853425786981391261.h0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
