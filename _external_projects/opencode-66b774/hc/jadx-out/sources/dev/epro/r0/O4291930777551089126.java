package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class O4291930777551089126 {
    public static final O4291930777551089126 a;
    public static final O4291930777551089126 b;
    public static final O4291930777551089126 c;
    public static final O4291930777551089126 d;
    public static final /* synthetic */ O4291930777551089126[] e;

    static {
        int iOcenbektlatm;
        izmyclvb.dpqpjfpoanwt1(908);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iOcenbektlatm = ocenbektlatm(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iOcenbektlatm != 0) {
                switch (iOcenbektlatm) {
                    case 1:
                        a = (O4291930777551089126) objArr[1];
                        continue;
                    case 2:
                        b = (O4291930777551089126) objArr[1];
                        continue;
                    case 3:
                        c = (O4291930777551089126) objArr[1];
                        continue;
                    case 4:
                        d = (O4291930777551089126) objArr[1];
                        continue;
                    case 5:
                        e = (O4291930777551089126[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int ocenbektlatm(Object[] objArr);

    private native void pbqczcpmxljr(String str, int i);

    public static native O4291930777551089126 valueOf(String str);

    public static native O4291930777551089126[] values();

    private O4291930777551089126(String str, int i) {
        pbqczcpmxljr(str, i);
    }
}
