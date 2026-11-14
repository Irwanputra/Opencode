package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class U10726575623804843294 {
    public static final U10726575623804843294 a;
    public static final U10726575623804843294 b;
    public static final U10726575623804843294 c;
    public static final /* synthetic */ U10726575623804843294[] d;

    static {
        int iHyzncbdisodb;
        izmyclvb.qgayjvbiagej2(704);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iHyzncbdisodb = hyzncbdisodb(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iHyzncbdisodb != 0) {
                switch (iHyzncbdisodb) {
                    case 1:
                        a = (U10726575623804843294) objArr[1];
                        continue;
                    case 2:
                        b = (U10726575623804843294) objArr[1];
                        continue;
                    case 3:
                        c = (U10726575623804843294) objArr[1];
                        continue;
                    case 4:
                        d = (U10726575623804843294[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void aewarbiobqiv(String str, int i);

    private static native int hyzncbdisodb(Object[] objArr);

    public static native U10726575623804843294 valueOf(String str);

    public static native U10726575623804843294[] values();

    private U10726575623804843294(String str, int i) {
        aewarbiobqiv(str, i);
    }
}
