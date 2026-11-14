package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class D6573652527563961006 implements I15538023536476448075 {
    public static final D6573652527563961006 a;

    static {
        int iOkarkausojum;
        izmyclvb.oeynnivvrnts0(907);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iOkarkausojum = okarkausojum(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iOkarkausojum != 0) {
                switch (iOkarkausojum) {
                    case 1:
                        a = (D6573652527563961006) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int okarkausojum(Object[] objArr);

    private native void vgiruosnnujq();

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    private D6573652527563961006() {
        vgiruosnnujq();
    }
}
