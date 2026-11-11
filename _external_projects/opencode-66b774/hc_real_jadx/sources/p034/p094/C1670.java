package p034.p094;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p034.p094.AbstractC1680;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.のぷのちつ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1670 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C1670 f7788 = new C1670();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Map<Class, C1672> f7790 = new HashMap();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Map<Class, Boolean> f7789 = new HashMap();

    /* renamed from: づざかべべ.のぷのちつ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static class C1671 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Method f7791;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int f7792;

        public C1671(int i, Method method) {
            this.f7792 = i;
            this.f7791 = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1671.class != obj.getClass()) {
                return false;
            }
            C1671 c1671 = (C1671) obj;
            return this.f7792 == c1671.f7792 && this.f7791.getName().equals(c1671.f7791.getName());
        }

        public int hashCode() {
            return this.f7791.getName().hashCode() + (this.f7792 * 31);
        }
    }

    /* renamed from: づざかべべ.のぷのちつ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1672 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Map<C1671, AbstractC1680.EnumC1682> f7793;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Map<AbstractC1680.EnumC1682, List<C1671>> f7794 = new HashMap();

        public C1672(Map<C1671, AbstractC1680.EnumC1682> map) {
            this.f7793 = map;
            for (Map.Entry<C1671, AbstractC1680.EnumC1682> entry : map.entrySet()) {
                AbstractC1680.EnumC1682 value = entry.getValue();
                List<C1671> list = this.f7794.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f7794.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static void m3645(List<C1671> list, InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1671 c1671 = list.get(size);
                    c1671.getClass();
                    try {
                        int i = c1671.f7792;
                        if (i == 0) {
                            c1671.f7791.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            c1671.f7791.invoke(obj, interfaceC1664);
                        } else if (i == 2) {
                            c1671.f7791.invoke(obj, interfaceC1664, enumC1682);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1672 m3642(Class cls) {
        C1672 c1672 = this.f7790.get(cls);
        return c1672 != null ? c1672 : m3644(cls, null);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m3643(Map<C1671, AbstractC1680.EnumC1682> map, C1671 c1671, AbstractC1680.EnumC1682 enumC1682, Class cls) {
        AbstractC1680.EnumC1682 enumC16822 = map.get(c1671);
        if (enumC16822 == null || enumC1682 == enumC16822) {
            if (enumC16822 == null) {
                map.put(c1671, enumC1682);
                return;
            }
            return;
        }
        Method method = c1671.f7791;
        StringBuilder m4207 = C2098.m4207("Method ");
        m4207.append(method.getName());
        m4207.append(" in ");
        m4207.append(cls.getName());
        m4207.append(" already declared with different @OnLifecycleEvent value: previous value ");
        m4207.append(enumC16822);
        m4207.append(", new value ");
        m4207.append(enumC1682);
        throw new IllegalArgumentException(m4207.toString());
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C1672 m3644(Class cls, Method[] methodArr) {
        int i;
        C1672 m3642;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m3642 = m3642(superclass)) != null) {
            hashMap.putAll(m3642.f7793);
        }
        for (Class cls2 : cls.getInterfaces()) {
            for (Map.Entry<C1671, AbstractC1680.EnumC1682> entry : m3642(cls2).f7793.entrySet()) {
                m3643(hashMap, entry.getKey(), entry.getValue(), cls);
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
            InterfaceC1683 interfaceC1683 = (InterfaceC1683) method.getAnnotation(InterfaceC1683.class);
            if (interfaceC1683 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC1664.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC1680.EnumC1682 value = interfaceC1683.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC1680.EnumC1682.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC1680.EnumC1682.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m3643(hashMap, new C1671(i, method), value, cls);
                z = true;
            }
        }
        C1672 c1672 = new C1672(hashMap);
        this.f7790.put(cls, c1672);
        this.f7789.put(cls, Boolean.valueOf(z));
        return c1672;
    }
}
