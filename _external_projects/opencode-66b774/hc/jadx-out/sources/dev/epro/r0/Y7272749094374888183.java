package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class Y7272749094374888183 {
    public static final Y7272749094374888183 a;
    public static final Y7272749094374888183 b;
    public static final /* synthetic */ Y7272749094374888183[] c;

    static {
        int iDklhuupjvzcr;
        izmyclvb.qgayjvbiagej2(158);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iDklhuupjvzcr = dklhuupjvzcr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iDklhuupjvzcr != 0) {
                switch (iDklhuupjvzcr) {
                    case 1:
                        a = (Y7272749094374888183) objArr[1];
                        continue;
                    case 2:
                        b = (Y7272749094374888183) objArr[1];
                        continue;
                    case 3:
                        c = (Y7272749094374888183[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void cqdpamqzicnx(String str, int i);

    private static native int dklhuupjvzcr(Object[] objArr);

    public static native Y7272749094374888183 valueOf(String str);

    public static native Y7272749094374888183[] values();

    private Y7272749094374888183(String str, int i) {
        cqdpamqzicnx(str, i);
    }
}
