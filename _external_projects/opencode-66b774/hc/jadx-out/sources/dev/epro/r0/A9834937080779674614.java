package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class A9834937080779674614 {
    public static final /* synthetic */ int[] a;

    static {
        int iAdpstnpmqxqy;
        izmyclvb.oeynnivvrnts0(20);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iAdpstnpmqxqy = adpstnpmqxqy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iAdpstnpmqxqy != 0) {
                switch (iAdpstnpmqxqy) {
                    case 1:
                        a = (int[]) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int adpstnpmqxqy(Object[] objArr);
}
