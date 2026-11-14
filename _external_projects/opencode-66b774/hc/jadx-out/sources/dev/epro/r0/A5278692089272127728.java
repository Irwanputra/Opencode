package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class A5278692089272127728 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int iFiswupkreeun;
        izmyclvb.oeynnivvrnts0(879);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iFiswupkreeun = fiswupkreeun(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iFiswupkreeun != 0) {
                switch (iFiswupkreeun) {
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

    private static native int fiswupkreeun(Object[] objArr);
}
