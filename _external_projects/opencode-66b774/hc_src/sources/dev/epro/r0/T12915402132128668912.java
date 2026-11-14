package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class T12915402132128668912 {
    public static final T12915402132128668912 a;
    public static final /* synthetic */ T12915402132128668912[] b;

    static {
        int mxnsnzasnivu;
        izmyclvb.qgayjvbiagej2(677);
        Object[] objArr = new Object[9];
        while (true) {
            try {
                mxnsnzasnivu = mxnsnzasnivu(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (mxnsnzasnivu != 0) {
                switch (mxnsnzasnivu) {
                    case 1:
                        a = (T12915402132128668912) objArr[1];
                        continue;
                    case 2:
                        b = (T12915402132128668912[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int mxnsnzasnivu(Object[] objArr);

    private native void phxmzuvoppnj(String str, int i);

    public static native T12915402132128668912 valueOf(String str);

    public static native T12915402132128668912[] values();

    private T12915402132128668912(String str, int i) {
        phxmzuvoppnj(str, i);
    }
}
