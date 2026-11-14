package dev.epro.r0;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q9578470633816342965 extends K10678596132709730734 {
    public static final R12076024538037930379 d = new R12076024538037930379();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public Q9578470633816342965(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                O7462376509978667369 o7462376509978667369 = (O7462376509978667369) field2.getAnnotation(O7462376509978667369.class);
                if (o7462376509978667369 != null) {
                    strName = o7462376509978667369.value();
                    for (String str : o7462376509978667369.alternate()) {
                        this.a.put(str, r4);
                    }
                }
                this.a.put(strName, r4);
                this.b.put(string, r4);
                this.c.put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        String strF = d13396727227989475489.F();
        Enum r0 = (Enum) this.a.get(strF);
        return r0 == null ? (Enum) this.b.get(strF) : r0;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        y14132333989764804283.D(r2 == null ? null : (String) this.c.get(r2));
    }
}
