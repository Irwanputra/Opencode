package dev.epro.r0;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X8134396307090105871 {
    public static volatile X8134396307090105871 a;
    public static final X8134396307090105871 b;

    static {
        X8134396307090105871 x8134396307090105871 = new X8134396307090105871();
        Map map = Collections.EMPTY_MAP;
        b = x8134396307090105871;
    }

    public static X8134396307090105871 a() {
        X8134396307090105871 x8134396307090105871;
        X8134396307090105871 x81343963070901058712 = a;
        if (x81343963070901058712 != null) {
            return x81343963070901058712;
        }
        synchronized (X8134396307090105871.class) {
            try {
                x8134396307090105871 = a;
                if (x8134396307090105871 == null) {
                    Class cls = A6698793478409306539.a;
                    X8134396307090105871 x81343963070901058713 = null;
                    if (cls != null) {
                        try {
                            x81343963070901058713 = (X8134396307090105871) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    x8134396307090105871 = x81343963070901058713 != null ? x81343963070901058713 : b;
                    a = x8134396307090105871;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x8134396307090105871;
    }
}
