package dev.epro.r0;

import android.app.Notification;
import android.content.Context;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class J12522477015336997462 {
    public static final J12522477015336997462 a;

    static {
        int klvwmmrndtix;
        izmyclvb.dpqpjfpoanwt1(1462);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                klvwmmrndtix = klvwmmrndtix(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (klvwmmrndtix != 0) {
                switch (klvwmmrndtix) {
                    case 1:
                        a = (J12522477015336997462) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native void a(Context context);

    public static native Notification b(Context context, long j, I17024494956719342617 i17024494956719342617);

    public static native I17024494956719342617 c(Context context, long j, long j2, X11638668447546090163 x11638668447546090163, J13646974641779584938 j13646974641779584938);

    public static native void d(Context context);

    private native void grvdvakhnnfs();

    private static native int klvwmmrndtix(Object[] objArr);

    private J12522477015336997462() {
        grvdvakhnnfs();
    }
}
