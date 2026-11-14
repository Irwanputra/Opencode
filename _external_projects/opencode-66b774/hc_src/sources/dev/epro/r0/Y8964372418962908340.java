package dev.epro.r0;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class Y8964372418962908340 {
    public static final Y8964372418962908340 a;
    public static final ConcurrentHashMap b;

    static {
        int vrmchgkfxgpj;
        izmyclvb.qgayjvbiagej2(1126);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                vrmchgkfxgpj = vrmchgkfxgpj(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (vrmchgkfxgpj != 0) {
                switch (vrmchgkfxgpj) {
                    case 1:
                        a = (Y8964372418962908340) objArr[1];
                        continue;
                    case 2:
                        b = (ConcurrentHashMap) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native void a(int i, AutoCloseable autoCloseable);

    public static native void b(int i);

    private native void euzwdrttakqn();

    private static native int vrmchgkfxgpj(Object[] objArr);

    private Y8964372418962908340() {
        euzwdrttakqn();
    }
}
