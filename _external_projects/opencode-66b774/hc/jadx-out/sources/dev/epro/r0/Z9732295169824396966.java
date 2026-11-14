package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes4.dex */
public final class Z9732295169824396966 {
    public static final Z9732295169824396966 a;
    public static final Set b;

    static {
        int iGysxvrepewzn;
        izmyclvb.qbtpmwoxbgtw3(29);
        Object[] objArr = new Object[11];
        while (true) {
            try {
                iGysxvrepewzn = gysxvrepewzn(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iGysxvrepewzn != 0) {
                switch (iGysxvrepewzn) {
                    case 1:
                        a = (Z9732295169824396966) objArr[1];
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

    public static native List a(String str, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220);

    public static native boolean b(String str);

    private static native int gysxvrepewzn(Object[] objArr);

    private native void xwapxvnqpenl();

    private Z9732295169824396966() {
        xwapxvnqpenl();
    }
}
