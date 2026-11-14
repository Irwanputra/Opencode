package dev.epro.r0;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H17609567404463830776 extends R12595700116524328013 {
    @Override // dev.epro.r0.R12595700116524328013
    public final Method C(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // dev.epro.r0.R12595700116524328013
    public final Typeface z(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.n.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            Q11088980322693754445.k(e);
            return null;
        }
    }
}
