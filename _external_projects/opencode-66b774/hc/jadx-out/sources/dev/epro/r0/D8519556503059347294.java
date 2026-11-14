package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class D8519556503059347294 {
    public static final /* synthetic */ int[] a;

    static {
        int iWormapmopfcs;
        izmyclvb.oeynnivvrnts0(780);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iWormapmopfcs = wormapmopfcs(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iWormapmopfcs != 0) {
                switch (iWormapmopfcs) {
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

    private static native int wormapmopfcs(Object[] objArr);
}
