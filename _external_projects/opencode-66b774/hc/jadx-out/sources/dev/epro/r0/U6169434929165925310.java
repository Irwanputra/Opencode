package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class U6169434929165925310 {
    public static final U6169434929165925310 a;
    public static final U6169434929165925310 b;
    public static final U6169434929165925310 c;
    public static final U6169434929165925310 d;
    public static final /* synthetic */ U6169434929165925310[] e;

    static {
        int iRjvcrohawced;
        izmyclvb.qgayjvbiagej2(1833);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iRjvcrohawced = rjvcrohawced(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iRjvcrohawced != 0) {
                switch (iRjvcrohawced) {
                    case 1:
                        a = (U6169434929165925310) objArr[1];
                        continue;
                    case 2:
                        b = (U6169434929165925310) objArr[1];
                        continue;
                    case 3:
                        c = (U6169434929165925310) objArr[1];
                        continue;
                    case 4:
                        d = (U6169434929165925310) objArr[1];
                        continue;
                    case 5:
                        e = (U6169434929165925310[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void adiibylspzdb(String str, int i);

    private static native int rjvcrohawced(Object[] objArr);

    public static native U6169434929165925310 valueOf(String str);

    public static native U6169434929165925310[] values();

    private U6169434929165925310(String str, int i) {
        adiibylspzdb(str, i);
    }
}
