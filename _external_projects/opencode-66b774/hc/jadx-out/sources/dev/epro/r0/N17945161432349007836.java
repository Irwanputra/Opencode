package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class N17945161432349007836 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int iMniylctxihrt;
        izmyclvb.dpqpjfpoanwt1(64);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iMniylctxihrt = mniylctxihrt(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iMniylctxihrt != 0) {
                switch (iMniylctxihrt) {
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

    private static native int mniylctxihrt(Object[] objArr);
}
