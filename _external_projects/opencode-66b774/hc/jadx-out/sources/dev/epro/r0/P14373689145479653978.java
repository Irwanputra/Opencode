package dev.epro.r0;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class P14373689145479653978 {
    public static final P14373689145479653978 a;
    public static volatile Configuration b;

    static {
        int iGrwebghqvygy;
        izmyclvb.qgayjvbiagej2(607);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iGrwebghqvygy = grwebghqvygy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iGrwebghqvygy != 0) {
                switch (iGrwebghqvygy) {
                    case 1:
                        a = (P14373689145479653978) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native Context a();

    private static native int grwebghqvygy(Object[] objArr);

    private native void xrvdbnhwcmpq();

    private P14373689145479653978() {
        xrvdbnhwcmpq();
    }
}
