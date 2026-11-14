package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class Y14073806020536580293 implements X17974541085502881877 {
    public static final Y14073806020536580293 a;

    static {
        int iNbdrsprvylky;
        izmyclvb.qgayjvbiagej2(2168);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iNbdrsprvylky = nbdrsprvylky(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNbdrsprvylky != 0) {
                switch (iNbdrsprvylky) {
                    case 1:
                        a = (Y14073806020536580293) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int nbdrsprvylky(Object[] objArr);

    private native void yhhfbcigzzxi();

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    private Y14073806020536580293() {
        yhhfbcigzzxi();
    }
}
