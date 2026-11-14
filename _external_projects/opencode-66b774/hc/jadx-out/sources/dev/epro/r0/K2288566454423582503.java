package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class K2288566454423582503 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int iSwbknewliuqz;
        izmyclvb.dpqpjfpoanwt1(590);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iSwbknewliuqz = swbknewliuqz(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iSwbknewliuqz != 0) {
                switch (iSwbknewliuqz) {
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

    private static native int swbknewliuqz(Object[] objArr);
}
