package dev.epro.r0;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U9713947319876159550 {
    public static final AtomicBoolean a;

    static {
        int iRqckcnrmkqwy;
        izmyclvb.qgayjvbiagej2(1411);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iRqckcnrmkqwy = rqckcnrmkqwy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iRqckcnrmkqwy != 0) {
                switch (iRqckcnrmkqwy) {
                    case 1:
                        a = (AtomicBoolean) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native boolean a(boolean z);

    public static final native void b(boolean z, boolean z2);

    private static native int rqckcnrmkqwy(Object[] objArr);
}
