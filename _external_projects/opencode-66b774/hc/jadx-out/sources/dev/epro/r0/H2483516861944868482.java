package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class H2483516861944868482 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int iHfiixqtytlbv;
        izmyclvb.dpqpjfpoanwt1(0);
        Object[] objArr = new Object[10];
        while (true) {
            try {
                iHfiixqtytlbv = hfiixqtytlbv(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iHfiixqtytlbv != 0) {
                switch (iHfiixqtytlbv) {
                    case 1:
                        a = (int[]) objArr[1];
                        continue;
                    case 2:
                        b = (int[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int hfiixqtytlbv(Object[] objArr);
}
