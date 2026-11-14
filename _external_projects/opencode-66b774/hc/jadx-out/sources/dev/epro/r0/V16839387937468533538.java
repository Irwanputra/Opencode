package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class V16839387937468533538 {
    public static final V16839387937468533538 a;
    public static final V16839387937468533538 b;
    public static final V16839387937468533538 c;
    public static final V16839387937468533538 d;
    public static final /* synthetic */ V16839387937468533538[] e;

    static {
        int iSiswbrcjklrq;
        izmyclvb.qgayjvbiagej2(1546);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iSiswbrcjklrq = siswbrcjklrq(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iSiswbrcjklrq != 0) {
                switch (iSiswbrcjklrq) {
                    case 1:
                        a = (V16839387937468533538) objArr[1];
                        continue;
                    case 2:
                        b = (V16839387937468533538) objArr[1];
                        continue;
                    case 3:
                        c = (V16839387937468533538) objArr[1];
                        continue;
                    case 4:
                        d = (V16839387937468533538) objArr[1];
                        continue;
                    case 5:
                        e = (V16839387937468533538[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void jblpurxkndfh(String str, int i);

    private static native int siswbrcjklrq(Object[] objArr);

    public static native V16839387937468533538 valueOf(String str);

    public static native V16839387937468533538[] values();

    private V16839387937468533538(String str, int i) {
        jblpurxkndfh(str, i);
    }
}
