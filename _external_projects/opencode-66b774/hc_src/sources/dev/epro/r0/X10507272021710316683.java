package dev.epro.r0;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class X10507272021710316683 {
    public static final X10507272021710316683 a;
    public static final String[] b;

    static {
        int xfxqofgizhni;
        izmyclvb.qgayjvbiagej2(1978);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                xfxqofgizhni = xfxqofgizhni(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (xfxqofgizhni != 0) {
                switch (xfxqofgizhni) {
                    case 1:
                        a = (X10507272021710316683) objArr[1];
                        continue;
                    case 2:
                        b = (String[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native File a(Context context);

    public static native File b(Context context, String str);

    private native void qiktsarjqtkf();

    private static native int xfxqofgizhni(Object[] objArr);

    private X10507272021710316683() {
        qiktsarjqtkf();
    }
}
