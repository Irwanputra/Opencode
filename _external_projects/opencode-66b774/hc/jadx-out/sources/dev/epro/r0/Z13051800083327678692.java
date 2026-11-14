package dev.epro.r0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z13051800083327678692 {
    public static final ArrayList a;

    static {
        int iFpsuhfegsfwf;
        izmyclvb.qgayjvbiagej2(2163);
        Object[] objArr = new Object[10];
        while (true) {
            try {
                iFpsuhfegsfwf = fpsuhfegsfwf(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iFpsuhfegsfwf != 0) {
                switch (iFpsuhfegsfwf) {
                    case 1:
                        a = (ArrayList) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native String a(IOException iOException);

    public static final native String b(byte[] bArr);

    private static native int fpsuhfegsfwf(Object[] objArr);
}
