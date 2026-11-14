package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class F9576970268294731829 {
    public static final /* synthetic */ int[] a;

    static {
        int iIqdfrditsqos;
        izmyclvb.dpqpjfpoanwt1(1100);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iIqdfrditsqos = iqdfrditsqos(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iIqdfrditsqos != 0) {
                switch (iIqdfrditsqos) {
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

    private static native int iqdfrditsqos(Object[] objArr);
}
