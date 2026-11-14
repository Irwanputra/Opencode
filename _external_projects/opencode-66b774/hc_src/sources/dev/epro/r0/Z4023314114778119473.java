package dev.epro.r0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z4023314114778119473 {
    public static final Z4023314114778119473 b;
    public final HashMap a;

    static {
        Z4023314114778119473 z4023314114778119473 = new Z4023314114778119473(new LinkedHashMap());
        Z860808776098365610.R(z4023314114778119473);
        b = z4023314114778119473;
    }

    public Z4023314114778119473(Z4023314114778119473 z4023314114778119473) {
        z4023314114778119473.getClass();
        this.a = new HashMap(z4023314114778119473.a);
    }

    public final boolean a(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && Z4023314114778119473.class.equals(obj.getClass())) {
                HashMap hashMap = ((Z4023314114778119473) obj).a;
                HashMap hashMap2 = this.a;
                Set<String> keySet = hashMap2.keySet();
                if (S10823041268949770285.t(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 == null || obj3 == null) {
                            z = obj2 == obj3;
                        } else {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = O5378677881740157249.l0(objArr, (Object[]) obj3);
                                }
                            }
                            z = obj2.equals(obj3);
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final String toString() {
        return G6547577305291411977.u(new StringBuilder("Data {"), R9411874267597469228.J0(this.a.entrySet(), null, null, null, 0, new F17594658268783405200((byte) 28), 31), "}");
    }

    public Z4023314114778119473(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
