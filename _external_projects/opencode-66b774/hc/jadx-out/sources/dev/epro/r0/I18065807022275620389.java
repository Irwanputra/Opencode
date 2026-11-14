package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I18065807022275620389 {
    public static final R11410497983598242063 a;
    public static final float b;

    static {
        int iUusvsegbnjlb;
        izmyclvb.dpqpjfpoanwt1(833);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iUusvsegbnjlb = uusvsegbnjlb(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iUusvsegbnjlb != 0) {
                switch (iUusvsegbnjlb) {
                    case 1:
                        a = (R11410497983598242063) objArr[1];
                        continue;
                    case 2:
                        b = ((Float) objArr[1]).floatValue();
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native void a(String str, M3727281027331139839 m3727281027331139839, int i);

    public static final native void b(N4052665617792397286 n4052665617792397286, I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i);

    public static final native void c(String str, N4052665617792397286 n4052665617792397286, N4052665617792397286 n40526656177923972862, F4096073349764486348 f4096073349764486348, Z7022156542152740569 z7022156542152740569, Z7022156542152740569 z70221565421527405692, String str2, M3727281027331139839 m3727281027331139839, int i, int i2);

    public static final native void d(N4052665617792397286 n4052665617792397286, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i);

    private static native int uusvsegbnjlb(Object[] objArr);
}
