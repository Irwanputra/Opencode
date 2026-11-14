package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z12048494961298168735 {
    public static final U1779235441444412014 a;
    public static final String b;
    public static final String c;

    static {
        int iQspmeckkcegw;
        izmyclvb.qgayjvbiagej2(133);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iQspmeckkcegw = qspmeckkcegw(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iQspmeckkcegw != 0) {
                switch (iQspmeckkcegw) {
                    case 1:
                        a = (U1779235441444412014) objArr[1];
                        continue;
                    case 2:
                        b = (String) objArr[1];
                        continue;
                    case 3:
                        c = (String) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native Integer a(Z12230432157744414222 z12230432157744414222, Y15427935686644244568 y15427935686644244568);

    public static final native boolean b(String str);

    public static final native String c(U1779235441444412014 u1779235441444412014);

    public static final native Z12230432157744414222 d(Z12230432157744414222 z12230432157744414222);

    private static native int qspmeckkcegw(Object[] objArr);
}
