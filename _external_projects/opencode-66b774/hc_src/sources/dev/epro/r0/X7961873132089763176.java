package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class X7961873132089763176 {
    public static final X7961873132089763176 a;
    public static final X7961873132089763176 b;
    public static final X7961873132089763176 c;
    public static final /* synthetic */ X7961873132089763176[] d;

    static {
        int zsuyzlfuvyvf;
        izmyclvb.qgayjvbiagej2(1318);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                zsuyzlfuvyvf = zsuyzlfuvyvf(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (zsuyzlfuvyvf != 0) {
                switch (zsuyzlfuvyvf) {
                    case 1:
                        a = (X7961873132089763176) objArr[1];
                        continue;
                    case 2:
                        b = (X7961873132089763176) objArr[1];
                        continue;
                    case 3:
                        c = (X7961873132089763176) objArr[1];
                        continue;
                    case 4:
                        d = (X7961873132089763176[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void lrznjvvrmogt(String str, int i);

    public static native X7961873132089763176 valueOf(String str);

    public static native X7961873132089763176[] values();

    private static native int zsuyzlfuvyvf(Object[] objArr);

    private X7961873132089763176(String str, int i) {
        lrznjvvrmogt(str, i);
    }
}
