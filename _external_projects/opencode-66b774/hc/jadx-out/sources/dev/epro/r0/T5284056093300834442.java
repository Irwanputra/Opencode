package dev.epro.r0;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class T5284056093300834442 {
    public static final /* synthetic */ Unsafe a;

    static {
        Field declaredField;
        try {
            declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    declaredField = null;
                    break;
                }
                Field field = declaredFields[i];
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                    break;
                }
                i++;
            }
            if (declaredField != null) {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
        }
        declaredField.setAccessible(true);
        try {
            a = (Unsafe) declaredField.get(null);
        } catch (IllegalAccessException e2) {
            Q11088980322693754445.k(e2);
        }
    }
}
