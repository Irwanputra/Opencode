package dev.epro.r0;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R4931231174251890987 {
    public static volatile R4931231174251890987 a;
    public static final R4931231174251890987 b;

    static {
        R4931231174251890987 r4931231174251890987 = new R4931231174251890987();
        Map map = Collections.EMPTY_MAP;
        b = r4931231174251890987;
    }

    public static R4931231174251890987 a() {
        R4931231174251890987 r4931231174251890987;
        Class cls = E6993330184355272251.a;
        R4931231174251890987 r49312311742518909872 = a;
        if (r49312311742518909872 != null) {
            return r49312311742518909872;
        }
        synchronized (R4931231174251890987.class) {
            try {
                r4931231174251890987 = a;
                if (r4931231174251890987 == null) {
                    Class cls2 = N11492304799487818103.a;
                    R4931231174251890987 r49312311742518909873 = null;
                    if (cls2 != null) {
                        try {
                            r49312311742518909873 = (R4931231174251890987) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    r4931231174251890987 = r49312311742518909873 != null ? r49312311742518909873 : b;
                    a = r4931231174251890987;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r4931231174251890987;
    }
}
