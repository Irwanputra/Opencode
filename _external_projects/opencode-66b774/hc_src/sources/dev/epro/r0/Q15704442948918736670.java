package dev.epro.r0;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class Q15704442948918736670 {
    public static final Q15704442948918736670 a;
    public static final AtomicReference b;

    static {
        int ierqkdruamhr;
        izmyclvb.qgayjvbiagej2(1700);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                ierqkdruamhr = ierqkdruamhr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (ierqkdruamhr != 0) {
                switch (ierqkdruamhr) {
                    case 1:
                        a = (Q15704442948918736670) objArr[1];
                        continue;
                    case 2:
                        b = (AtomicReference) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native boolean a(int i);

    private native void dnzywtmympye();

    private static native int ierqkdruamhr(Object[] objArr);

    private Q15704442948918736670() {
        dnzywtmympye();
    }
}
