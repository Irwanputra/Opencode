package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class V5092047418778463835 {
    public static final V5092047418778463835 a;
    public static final Set b;

    static {
        int iJxzetgzlrgso;
        izmyclvb.qgayjvbiagej2(2211);
        Object[] objArr = new Object[9];
        while (true) {
            try {
                iJxzetgzlrgso = jxzetgzlrgso(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iJxzetgzlrgso != 0) {
                switch (iJxzetgzlrgso) {
                    case 1:
                        a = (V5092047418778463835) objArr[1];
                        continue;
                    case 2:
                        b = (Set) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native int a(String str);

    public static native boolean b(String str);

    public static native void c(String str, boolean z);

    public static native void d(V5092047418778463835 v5092047418778463835, A4891004611542415874 a4891004611542415874);

    private static native int jxzetgzlrgso(Object[] objArr);

    private native void ksogagvzmmuz();

    private V5092047418778463835() {
        ksogagvzmmuz();
    }
}
