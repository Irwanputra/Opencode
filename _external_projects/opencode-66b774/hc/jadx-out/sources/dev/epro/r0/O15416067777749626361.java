package dev.epro.r0;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O15416067777749626361 {
    public static final Set a;

    static {
        int iDrolsylddetq;
        izmyclvb.dpqpjfpoanwt1(391);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iDrolsylddetq = drolsylddetq(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iDrolsylddetq != 0) {
                switch (iDrolsylddetq) {
                    case 1:
                        a = (Set) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native Object a(Map map, Q11843986452694298435 q11843986452694298435, boolean z, R16499804965158751443 r16499804965158751443, K14749510448791472029 k14749510448791472029);

    public static final native int b(J7635443573303624065 j7635443573303624065);

    public static final native Map c(Map map, String str, boolean z);

    private static native int drolsylddetq(Object[] objArr);
}
