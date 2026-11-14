package dev.epro.r0;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class N13156852726304692127 {
    public static final List a = K5751602218013079365.V(Application.class, L13135072960070674001.class);
    public static final List b = K5751602218013079365.U(L13135072960070674001.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List U0 = O5378677881740157249.U0(parameterTypes);
            if (list.equals(U0)) {
                return constructor;
            }
            if (list.size() == U0.size() && U0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final J14024120050125738337 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (J14024120050125738337) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            K2042933864045806308.m("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            Z3383101362411723454.m("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
