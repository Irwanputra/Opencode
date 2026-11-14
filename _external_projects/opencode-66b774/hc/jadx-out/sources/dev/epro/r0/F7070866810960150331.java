package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class F7070866810960150331 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int iDitmenxzbpgx;
        izmyclvb.dpqpjfpoanwt1(972);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iDitmenxzbpgx = ditmenxzbpgx(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iDitmenxzbpgx != 0) {
                switch (iDitmenxzbpgx) {
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

    private static native int ditmenxzbpgx(Object[] objArr);
}
