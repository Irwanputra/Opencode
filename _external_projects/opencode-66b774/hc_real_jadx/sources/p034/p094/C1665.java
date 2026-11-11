package p034.p094;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: づざかべべ.のぷのちつ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1665 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Map<Class, Integer> f7786 = new HashMap();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Map<Class, List<Constructor<? extends InterfaceC1669>>> f7785 = new HashMap();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String m3635(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static int m3636(Class<?> cls) {
        Constructor<?> constructor;
        boolean z;
        List<Constructor<? extends InterfaceC1669>> arrayList;
        Map<Class, List<Constructor<? extends InterfaceC1669>>> map;
        Integer num = f7786.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String m3635 = m3635(canonicalName);
                if (!name.isEmpty()) {
                    m3635 = name + "." + m3635;
                }
                constructor = Class.forName(m3635).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                map = f7785;
                arrayList = Collections.singletonList(constructor);
            } else {
                C1670 c1670 = C1670.f7788;
                Boolean bool = c1670.f7789.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                c1670.f7789.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                            if (((InterfaceC1683) declaredMethods[i2].getAnnotation(InterfaceC1683.class)) != null) {
                                c1670.m3644(cls, declaredMethods);
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC1677.class.isAssignableFrom(superclass)) {
                        arrayList = m3636(superclass) != 1 ? new ArrayList<>(f7785.get(superclass)) : null;
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && InterfaceC1677.class.isAssignableFrom(cls2)) {
                                if (m3636(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList<>();
                                }
                                arrayList.addAll(f7785.get(cls2));
                            }
                            i3++;
                        } else if (arrayList != null) {
                            map = f7785;
                        }
                    }
                }
            }
            map.put(cls, arrayList);
            i = 2;
        }
        f7786.put(cls, Integer.valueOf(i));
        return i;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static InterfaceC1669 m3637(Constructor<? extends InterfaceC1669> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
