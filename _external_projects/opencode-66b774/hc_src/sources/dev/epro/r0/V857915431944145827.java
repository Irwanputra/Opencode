package dev.epro.r0;

import android.os.Handler;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class V857915431944145827 {
    public static final V857915431944145827 a;
    public static final Handler b;

    static {
        int teetodiywtlk;
        izmyclvb.qgayjvbiagej2(635);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                teetodiywtlk = teetodiywtlk(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (teetodiywtlk != 0) {
                switch (teetodiywtlk) {
                    case 1:
                        a = (V857915431944145827) objArr[1];
                        continue;
                    case 2:
                        b = (Handler) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native void a(B13729205492206812220 b13729205492206812220);

    private native void ipztxddoerkm();

    private static native int teetodiywtlk(Object[] objArr);

    private V857915431944145827() {
        ipztxddoerkm();
    }
}
