package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public abstract class F3763145507963411864 {
    public static final long a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        int zcpfsavmatkj;
        izmyclvb.dpqpjfpoanwt1(2022);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                zcpfsavmatkj = zcpfsavmatkj(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (zcpfsavmatkj != 0) {
                switch (zcpfsavmatkj) {
                    case 1:
                        a = ((Long) objArr[1]).longValue();
                        continue;
                    case 2:
                        b = ((Float) objArr[1]).floatValue();
                        continue;
                    case 3:
                        c = ((Float) objArr[1]).floatValue();
                        continue;
                    case 4:
                        d = ((Float) objArr[1]).floatValue();
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native void a(String str, L12639328004344855510 l12639328004344855510, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i);

    public static final native void b(String str, Integer num, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i);

    public static final native int[] c(String str);

    public static final native S6349823729575121924 d(S6349823729575121924 s6349823729575121924, R8540738700654750557 r8540738700654750557);

    private static native int zcpfsavmatkj(Object[] objArr);
}
