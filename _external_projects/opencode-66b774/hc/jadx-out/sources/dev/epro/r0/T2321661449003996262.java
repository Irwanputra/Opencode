package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class T2321661449003996262 {
    public static final /* synthetic */ int[] a;

    static {
        int iEpelfvqpatzh;
        izmyclvb.qgayjvbiagej2(20);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iEpelfvqpatzh = epelfvqpatzh(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iEpelfvqpatzh != 0) {
                switch (iEpelfvqpatzh) {
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

    private static native int epelfvqpatzh(Object[] objArr);
}
