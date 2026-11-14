package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class Z16930645345884674738 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int iRptlvhbvhmpb;
        izmyclvb.qgayjvbiagej2(1751);
        Object[] objArr = new Object[9];
        while (true) {
            try {
                iRptlvhbvhmpb = rptlvhbvhmpb(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iRptlvhbvhmpb != 0) {
                switch (iRptlvhbvhmpb) {
                    case 1:
                        a = (int[]) objArr[1];
                        continue;
                    case 2:
                        b = (int[]) objArr[1];
                        continue;
                    case 3:
                        c = (int[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int rptlvhbvhmpb(Object[] objArr);
}
