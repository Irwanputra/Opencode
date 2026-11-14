package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class X15724426206654835963 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int iPugmtpogkotb;
        izmyclvb.qgayjvbiagej2(1427);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iPugmtpogkotb = pugmtpogkotb(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iPugmtpogkotb != 0) {
                switch (iPugmtpogkotb) {
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

    private static native int pugmtpogkotb(Object[] objArr);
}
