package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M6532212949786578992 {
    public static final P8646985343900033725 a;

    static {
        int iXlhfhikoruuv;
        izmyclvb.dpqpjfpoanwt1(281);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iXlhfhikoruuv = xlhfhikoruuv(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iXlhfhikoruuv != 0) {
                switch (iXlhfhikoruuv) {
                    case 1:
                        a = (P8646985343900033725) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native long a(float f, float f2, float f3, float f4);

    public static final native String b(long j);

    public static final native U10174709222559481877 c(String str);

    private static native int xlhfhikoruuv(Object[] objArr);
}
