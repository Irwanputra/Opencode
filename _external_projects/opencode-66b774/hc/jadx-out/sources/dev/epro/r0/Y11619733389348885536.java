package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class Y11619733389348885536 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int iPlfaonbdotkq;
        izmyclvb.qgayjvbiagej2(pd.d1);
        Object[] objArr = new Object[10];
        while (true) {
            try {
                iPlfaonbdotkq = plfaonbdotkq(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iPlfaonbdotkq != 0) {
                switch (iPlfaonbdotkq) {
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

    private static native int plfaonbdotkq(Object[] objArr);
}
