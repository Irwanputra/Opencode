package dev.epro.r0;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class W13664277822466527402 {
    public static final W13664277822466527402 a;

    static {
        int iEajxpeednmnn;
        izmyclvb.qgayjvbiagej2(1101);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iEajxpeednmnn = eajxpeednmnn(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iEajxpeednmnn != 0) {
                switch (iEajxpeednmnn) {
                    case 1:
                        a = (W13664277822466527402) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native File a(Context context, String str);

    private static native int eajxpeednmnn(Object[] objArr);

    private native void imdbjngxbejo();

    private W13664277822466527402() {
        imdbjngxbejo();
    }
}
