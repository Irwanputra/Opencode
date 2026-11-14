package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract class A9566922576338370526 {
    public static final X354568553596380848 a;

    static {
        int iQnkeujfewniy;
        izmyclvb.oeynnivvrnts0(715);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iQnkeujfewniy = qnkeujfewniy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iQnkeujfewniy != 0) {
                switch (iQnkeujfewniy) {
                    case 1:
                        a = (X354568553596380848) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native float a(G2190230421268324049 g2190230421268324049, float f, float f2, M3727281027331139839 m3727281027331139839, int i);

    public static final native float b(M3727281027331139839 m3727281027331139839);

    private static native int qnkeujfewniy(Object[] objArr);
}
