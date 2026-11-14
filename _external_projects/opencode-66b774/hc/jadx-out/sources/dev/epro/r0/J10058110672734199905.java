package dev.epro.r0;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J10058110672734199905 {
    public static final List a;
    public static final Map b;

    static {
        int iJoniwourglgw;
        izmyclvb.dpqpjfpoanwt1(1113);
        Object[] objArr = new Object[12];
        while (true) {
            try {
                iJoniwourglgw = joniwourglgw(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iJoniwourglgw != 0) {
                switch (iJoniwourglgw) {
                    case 1:
                        a = (List) objArr[1];
                        continue;
                    case 2:
                        b = (Map) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native G9506192477171422664 a(S17135094063410587600 s17135094063410587600, Context context);

    private static native int joniwourglgw(Object[] objArr);
}
