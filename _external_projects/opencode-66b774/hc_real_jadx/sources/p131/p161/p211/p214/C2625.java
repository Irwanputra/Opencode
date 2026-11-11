package p131.p161.p211.p214;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.NoSuchElementException;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2625 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final Type[] f10064 = new Type[0];

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static final class C2626 implements ParameterizedType, Serializable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Type f10065;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Type f10066;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Type[] f10067;

        public C2626(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C1687.m3659(z);
            }
            this.f10065 = type == null ? null : C2625.m4617(type);
            this.f10066 = C2625.m4617(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f10067 = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                this.f10067[i].getClass();
                C2625.m4614(this.f10067[i]);
                Type[] typeArr3 = this.f10067;
                typeArr3[i] = C2625.m4617(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C2625.m4616(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f10067.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f10065;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f10066;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f10067) ^ this.f10066.hashCode();
            Type type = this.f10065;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            int length = this.f10067.length;
            if (length == 0) {
                return C2625.m4621(this.f10066);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C2625.m4621(this.f10066));
            sb.append("<");
            sb.append(C2625.m4621(this.f10067[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C2625.m4621(this.f10067[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
    public static final class C2627 implements WildcardType, Serializable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Type f10068;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Type f10069;

        public C2627(Type[] typeArr, Type[] typeArr2) {
            C1687.m3659(typeArr2.length <= 1);
            C1687.m3659(typeArr.length == 1);
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                C2625.m4614(typeArr[0]);
                this.f10069 = null;
                this.f10068 = C2625.m4617(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            C2625.m4614(typeArr2[0]);
            C1687.m3659(typeArr[0] == Object.class);
            this.f10069 = C2625.m4617(typeArr2[0]);
            this.f10068 = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C2625.m4616(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f10069;
            return type != null ? new Type[]{type} : C2625.f10064;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f10068};
        }

        public int hashCode() {
            Type type = this.f10069;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f10068.hashCode() + 31);
        }

        public String toString() {
            StringBuilder m4207;
            Type type;
            if (this.f10069 != null) {
                m4207 = C2098.m4207("? super ");
                type = this.f10069;
            } else {
                if (this.f10068 == Object.class) {
                    return "?";
                }
                m4207 = C2098.m4207("? extends ");
                type = this.f10068;
            }
            m4207.append(C2625.m4621(type));
            return m4207.toString();
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C2628 implements GenericArrayType, Serializable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Type f10070;

        public C2628(Type type) {
            this.f10070 = C2625.m4617(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C2625.m4616(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f10070;
        }

        public int hashCode() {
            return this.f10070.hashCode();
        }

        public String toString() {
            return C2625.m4621(this.f10070) + "[]";
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static Type m4613(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type m4613 = m4613(type, cls, componentType, collection);
                        return componentType == m4613 ? cls2 : new C2628(m4613);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type m46132 = m4613(type, cls, genericComponentType, collection);
                    return genericComponentType == m46132 ? genericArrayType : new C2628(m46132);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type m46133 = m4613(type, cls, ownerType, collection);
                    boolean z = m46133 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type m46134 = m4613(type, cls, actualTypeArguments[i], collection);
                        if (m46134 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = m46134;
                        }
                        i++;
                    }
                    return z ? new C2626(m46133, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type2 instanceof WildcardType;
                Type type3 = type2;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type m46135 = m4613(type, cls, lowerBounds[0], collection);
                        type3 = wildcardType;
                        if (m46135 != lowerBounds[0]) {
                            return new C2627(new Type[]{Object.class}, m46135 instanceof WildcardType ? ((WildcardType) m46135).getLowerBounds() : new Type[]{m46135});
                        }
                    } else {
                        type3 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type m46136 = m4613(type, cls, upperBounds[0], collection);
                            type3 = wildcardType;
                            if (m46136 != upperBounds[0]) {
                                return new C2627(m46136 instanceof WildcardType ? ((WildcardType) m46136).getUpperBounds() : new Type[]{m46136}, f10064);
                            }
                        }
                    }
                }
                return type3;
            }
            typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type m4620 = m4620(type, cls, cls3);
                if (m4620 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (i < length2) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) m4620).getActualTypeArguments()[i];
                        } else {
                            i++;
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type2 = typeVariable;
        } while (type2 != typeVariable);
        return type2;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m4614(Type type) {
        C1687.m3659(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static Type m4615(Type type, Class<?> cls, Type type2) {
        return m4613(type, cls, type2, new HashSet());
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean m4616(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m4616(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Type m4617(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C2628(m4617(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C2626(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C2628(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C2627(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Class<?> m4618(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C1687.m3659(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m4618(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m4618(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static Type m4619(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C1687.m3659(cls2.isAssignableFrom(cls));
        return m4615(type, cls, m4620(type, cls, cls2));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Type m4620(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m4620(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m4620(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static String m4621(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
