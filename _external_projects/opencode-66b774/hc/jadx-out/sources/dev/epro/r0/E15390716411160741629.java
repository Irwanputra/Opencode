package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class E15390716411160741629 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int iRhgcnnlbvzdh;
        izmyclvb.oeynnivvrnts0(520);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iRhgcnnlbvzdh = rhgcnnlbvzdh(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iRhgcnnlbvzdh != 0) {
                switch (iRhgcnnlbvzdh) {
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

    private static native int rhgcnnlbvzdh(Object[] objArr);
}
