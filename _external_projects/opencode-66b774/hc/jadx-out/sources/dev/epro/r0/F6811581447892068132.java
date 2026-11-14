package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F6811581447892068132 {
    public static final Set a;
    public static final H5336160545165318150 b;

    static {
        int iHfprzrtcyzcl;
        izmyclvb.dpqpjfpoanwt1(1507);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iHfprzrtcyzcl = hfprzrtcyzcl(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iHfprzrtcyzcl != 0) {
                switch (iHfprzrtcyzcl) {
                    case 1:
                        a = (Set) objArr[1];
                        continue;
                    case 2:
                        b = (H5336160545165318150) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native boolean a(String str);

    public static final native String b(String str);

    private static native int hfprzrtcyzcl(Object[] objArr);
}
