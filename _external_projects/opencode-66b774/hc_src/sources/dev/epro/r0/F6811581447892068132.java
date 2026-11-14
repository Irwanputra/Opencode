package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public abstract class F6811581447892068132 {
    public static final Set a;
    public static final H5336160545165318150 b;

    static {
        int hfprzrtcyzcl;
        izmyclvb.dpqpjfpoanwt1(1507);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                hfprzrtcyzcl = hfprzrtcyzcl(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (hfprzrtcyzcl != 0) {
                switch (hfprzrtcyzcl) {
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
