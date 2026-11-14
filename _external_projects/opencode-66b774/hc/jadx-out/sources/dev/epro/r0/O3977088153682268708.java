package dev.epro.r0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O3977088153682268708 extends H12922621320026152513 {
    public static final HashMap e;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        e = map;
    }

    public O3977088153682268708(Class cls, R11530267699218145783 r11530267699218145783) {
        super(r11530267699218145783);
        this.d = new HashMap();
        S12227320117525376577 s12227320117525376577 = P15002231639878788228.a;
        Constructor constructorL = s12227320117525376577.l(cls);
        this.b = constructorL;
        P15002231639878788228.f(constructorL);
        String[] strArrO = s12227320117525376577.o(cls);
        for (int i = 0; i < strArrO.length; i++) {
            this.d.put(strArrO[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // dev.epro.r0.H12922621320026152513
    public final Object d() {
        return (Object[]) this.c.clone();
    }

    @Override // dev.epro.r0.H12922621320026152513
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            S12227320117525376577 s12227320117525376577 = P15002231639878788228.a;
            Z3383101362411723454.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + P15002231639878788228.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + P15002231639878788228.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e5) {
            Z3383101362411723454.m("Failed to invoke constructor '" + P15002231639878788228.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
            return null;
        }
    }

    @Override // dev.epro.r0.H12922621320026152513
    public final void f(Object obj, D13396727227989475489 d13396727227989475489, T9284579437310788245 t9284579437310788245) {
        Object[] objArr = (Object[]) obj;
        String str = t9284579437310788245.c;
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + P15002231639878788228.b(this.b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = t9284579437310788245.f.b(d13396727227989475489);
        if (objB != null || !t9284579437310788245.g) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbG = X2485016533998461232.g("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbG.append(d13396727227989475489.o(false));
            throw new J18177443637724208589(sbG.toString());
        }
    }
}
