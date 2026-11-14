package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E1096494211642212429 {
    public static final dev.epro.r0.E1096494211642212429 c = new dev.epro.r0.E1096494211642212429();
    public final java.util.HashMap a = new java.util.HashMap();
    public final java.util.HashMap b = new java.util.HashMap();

    public static void b(java.util.HashMap map, dev.epro.r0.C1309492667323693710 c1309492667323693710, dev.epro.r0.P72364327365747079 p72364327365747079, java.lang.Class cls) {
        dev.epro.r0.P72364327365747079 p723643273657470792 = (dev.epro.r0.P72364327365747079) map.get(c1309492667323693710);
        if (p723643273657470792 == null || p72364327365747079 == p723643273657470792) {
            if (p723643273657470792 == null) {
                map.put(c1309492667323693710, p72364327365747079);
            }
        } else {
            java.lang.String name = c1309492667323693710.b.getName();
            java.lang.String name2 = cls.getName();
            dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.v(dev.epro.r0.G6547577305291411977.y("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), java.lang.String.valueOf(p723643273657470792), ", new value ", java.lang.String.valueOf(p72364327365747079)));
        }
    }

    public final dev.epro.r0.G17001453823809908244 a(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = this.a;
        if (superclass != null) {
            dev.epro.r0.G17001453823809908244 g17001453823809908244A = (dev.epro.r0.G17001453823809908244) map2.get(superclass);
            if (g17001453823809908244A == null) {
                g17001453823809908244A = a(superclass, null);
            }
            map.putAll(g17001453823809908244A.b);
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            dev.epro.r0.G17001453823809908244 g17001453823809908244A2 = (dev.epro.r0.G17001453823809908244) map2.get(cls2);
            if (g17001453823809908244A2 == null) {
                g17001453823809908244A2 = a(cls2, null);
            }
            for (java.util.Map.Entry entry : g17001453823809908244A2.b.entrySet()) {
                b(map, (dev.epro.r0.C1309492667323693710) entry.getKey(), (dev.epro.r0.P72364327365747079) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (java.lang.NoClassDefFoundError e) {
                throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (java.lang.reflect.Method method : methodArr) {
            dev.epro.r0.L2013008117766361745 annotation = method.getAnnotation(dev.epro.r0.L2013008117766361745.class);
            if (annotation != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!dev.epro.r0.I4293432593871965076.class.isAssignableFrom(parameterTypes[0])) {
                        dev.epro.r0.S10973172697741180971.j("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                dev.epro.r0.P72364327365747079 p72364327365747079Value = annotation.value();
                if (parameterTypes.length > 1) {
                    if (!dev.epro.r0.P72364327365747079.class.isAssignableFrom(parameterTypes[1])) {
                        dev.epro.r0.S10973172697741180971.j("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (p72364327365747079Value != dev.epro.r0.P72364327365747079.ON_ANY) {
                        dev.epro.r0.S10973172697741180971.j("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    dev.epro.r0.S10973172697741180971.j("cannot have more than 2 params");
                    return null;
                }
                b(map, new dev.epro.r0.C1309492667323693710(i, method), p72364327365747079Value, cls);
                z = true;
            }
        }
        dev.epro.r0.G17001453823809908244 g17001453823809908244 = new dev.epro.r0.G17001453823809908244(map);
        map2.put(cls, g17001453823809908244);
        this.b.put(cls, java.lang.Boolean.valueOf(z));
        return g17001453823809908244;
    }
}
