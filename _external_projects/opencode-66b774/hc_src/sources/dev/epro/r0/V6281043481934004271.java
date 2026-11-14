package dev.epro.r0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V6281043481934004271 implements R14538352738342298516 {
    public static final Map b;
    public final Class a;

    static {
        List V = K5751602218013079365.V(B13729205492206812220.class, F4096073349764486348.class, L12639328004344855510.class, J12078565427869724451.class, G13792465322404021864.class, X9973786505953245660.class, V9261584529168786349.class, D7772520967547850105.class, D11437685219418266086.class, O5745440982696445525.class, J2735738717836875655.class, Q3354554335772326037.class, E6131089793628420610.class, Z2074687661010595864.class, J8774491949465308730.class, B1950770386626402451.class, T3362297006778140915.class, F7663718823386495150.class, D12754633875664436259.class, S3437763749522728681.class, T15896224511591213151.class, R17636885141369258529.class, I8770151526503062784.class);
        ArrayList arrayList = new ArrayList(Z115818233709597990.k0(V, 10));
        int i = 0;
        for (Object obj : V) {
            int i2 = i + 1;
            if (i < 0) {
                K5751602218013079365.f0();
                throw null;
            }
            arrayList.add(new H9390398899829886498((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = E4951175994894594588.y0(arrayList);
    }

    public V6281043481934004271(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // dev.epro.r0.R14538352738342298516
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String y;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String y2 = K5751602218013079365.y(cls.getName());
            return y2 == null ? cls.getCanonicalName() : y2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (y = K5751602218013079365.y(componentType.getName())) != null) {
            str = y.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String c() {
        String c0;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String c02 = K5751602218013079365.c0(cls.getName());
                return c02 == null ? cls.getSimpleName() : c02;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (c0 = K5751602218013079365.c0(componentType.getName())) != null) {
                str = c0.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return M8927913404651150384.u0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return M8927913404651150384.t0(simpleName, '$', simpleName);
        }
        return M8927913404651150384.u0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean d(Object obj) {
        Class cls = this.a;
        cls.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return V12319504402545346730.K(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = U16229988784104357932.I(J17975719213314763068.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof V6281043481934004271) && U16229988784104357932.I(this).equals(U16229988784104357932.I((V6281043481934004271) obj));
    }

    public final int hashCode() {
        return U16229988784104357932.I(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
