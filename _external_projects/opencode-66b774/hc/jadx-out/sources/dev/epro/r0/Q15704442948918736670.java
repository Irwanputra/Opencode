package dev.epro.r0;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class Q15704442948918736670 {
    public static final Q15704442948918736670 a;
    public static final AtomicReference b;

    static {
        int iIerqkdruamhr;
        izmyclvb.qgayjvbiagej2(1700);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iIerqkdruamhr = ierqkdruamhr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iIerqkdruamhr != 0) {
                switch (iIerqkdruamhr) {
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
