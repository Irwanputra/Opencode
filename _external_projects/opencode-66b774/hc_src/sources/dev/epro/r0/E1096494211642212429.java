package dev.epro.r0;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E1096494211642212429 {
    public static final E1096494211642212429 c = new E1096494211642212429();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, C1309492667323693710 c1309492667323693710, P72364327365747079 p72364327365747079, Class cls) {
        P72364327365747079 p723643273657470792 = (P72364327365747079) hashMap.get(c1309492667323693710);
        if (p723643273657470792 == null || p72364327365747079 == p723643273657470792) {
            if (p723643273657470792 == null) {
                hashMap.put(c1309492667323693710, p72364327365747079);
            }
        } else {
            String name = c1309492667323693710.b.getName();
            String name2 = cls.getName();
            S10973172697741180971.j(G6547577305291411977.v(G6547577305291411977.y("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(p723643273657470792), ", new value ", String.valueOf(p72364327365747079)));
        }
    }

    public final G17001453823809908244 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            G17001453823809908244 g17001453823809908244 = (G17001453823809908244) hashMap2.get(superclass);
            if (g17001453823809908244 == null) {
                g17001453823809908244 = a(superclass, null);
            }
            hashMap.putAll(g17001453823809908244.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            G17001453823809908244 g170014538238099082442 = (G17001453823809908244) hashMap2.get(cls2);
            if (g170014538238099082442 == null) {
                g170014538238099082442 = a(cls2, null);
            }
            for (Map.Entry entry : g170014538238099082442.b.entrySet()) {
                b(hashMap, (C1309492667323693710) entry.getKey(), (P72364327365747079) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            L2013008117766361745 l2013008117766361745 = (L2013008117766361745) method.getAnnotation(L2013008117766361745.class);
            if (l2013008117766361745 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!I4293432593871965076.class.isAssignableFrom(parameterTypes[0])) {
                        S10973172697741180971.j("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                P72364327365747079 value = l2013008117766361745.value();
                if (parameterTypes.length > 1) {
                    if (!P72364327365747079.class.isAssignableFrom(parameterTypes[1])) {
                        S10973172697741180971.j("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != P72364327365747079.ON_ANY) {
                        S10973172697741180971.j("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    S10973172697741180971.j("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new C1309492667323693710(i, method), value, cls);
                z = true;
            }
        }
        G17001453823809908244 g170014538238099082443 = new G17001453823809908244(hashMap);
        hashMap2.put(cls, g170014538238099082443);
        this.b.put(cls, Boolean.valueOf(z));
        return g170014538238099082443;
    }
}
