package dev.epro.r0;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R12171924199823312678 {
    public static volatile R12171924199823312678 a;
    public static final R12171924199823312678 b;

    static {
        R12171924199823312678 r12171924199823312678 = new R12171924199823312678();
        Map map = Collections.EMPTY_MAP;
        b = r12171924199823312678;
    }

    public static R12171924199823312678 a() {
        R12171924199823312678 r12171924199823312678;
        X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
        R12171924199823312678 r121719241998233126782 = a;
        if (r121719241998233126782 != null) {
            return r121719241998233126782;
        }
        synchronized (R12171924199823312678.class) {
            try {
                r12171924199823312678 = a;
                if (r12171924199823312678 == null) {
                    Class cls = G14641106348912704059.a;
                    R12171924199823312678 r121719241998233126783 = null;
                    if (cls != null) {
                        try {
                            r121719241998233126783 = (R12171924199823312678) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    r12171924199823312678 = r121719241998233126783 != null ? r121719241998233126783 : b;
                    a = r12171924199823312678;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r12171924199823312678;
    }
}
