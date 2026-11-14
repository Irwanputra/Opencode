package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class V2325095492445883347 {
    public static final V2325095492445883347 b;
    public static final V2325095492445883347 c;
    public static final V2325095492445883347 d;
    public static final V2325095492445883347 e;
    public static final /* synthetic */ V2325095492445883347[] f;
    public final String a;

    static {
        int iRsfaiaiopaud;
        izmyclvb.qgayjvbiagej2(980);
        Object[] objArr = new Object[9];
        while (true) {
            try {
                iRsfaiaiopaud = rsfaiaiopaud(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iRsfaiaiopaud != 0) {
                switch (iRsfaiaiopaud) {
                    case 1:
                        b = (V2325095492445883347) objArr[1];
                        continue;
                    case 2:
                        c = (V2325095492445883347) objArr[1];
                        continue;
                    case 3:
                        d = (V2325095492445883347) objArr[1];
                        continue;
                    case 4:
                        e = (V2325095492445883347) objArr[1];
                        continue;
                    case 5:
                        f = (V2325095492445883347[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void bugvfahepwtq(String str, int i, String str2);

    private static native int rsfaiaiopaud(Object[] objArr);

    public static native V2325095492445883347 valueOf(String str);

    public static native V2325095492445883347[] values();

    private V2325095492445883347(String str, int i, String str2) {
        bugvfahepwtq(str, i, str2);
    }
}
