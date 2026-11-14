package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K15874181163669594725 {
    public static final H5336160545165318150 a;
    public static final H5336160545165318150 b;
    public static final H5336160545165318150 c;

    static {
        int iMvrvyrwupnoz;
        izmyclvb.dpqpjfpoanwt1(1374);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iMvrvyrwupnoz = mvrvyrwupnoz(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iMvrvyrwupnoz != 0) {
                switch (iMvrvyrwupnoz) {
                    case 1:
                        a = (H5336160545165318150) objArr[1];
                        continue;
                    case 2:
                        b = (H5336160545165318150) objArr[1];
                        continue;
                    case 3:
                        c = (H5336160545165318150) objArr[1];
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

    private static native int mvrvyrwupnoz(Object[] objArr);
}
