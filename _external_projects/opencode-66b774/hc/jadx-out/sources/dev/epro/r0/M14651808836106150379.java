package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class M14651808836106150379 {
    public static final M14651808836106150379 a;
    public static final M14651808836106150379 b;
    public static final M14651808836106150379 c;
    public static final /* synthetic */ M14651808836106150379[] d;

    static {
        int iEmkogjfuobwy;
        izmyclvb.dpqpjfpoanwt1(857);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iEmkogjfuobwy = emkogjfuobwy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iEmkogjfuobwy != 0) {
                switch (iEmkogjfuobwy) {
                    case 1:
                        a = (M14651808836106150379) objArr[1];
                        continue;
                    case 2:
                        b = (M14651808836106150379) objArr[1];
                        continue;
                    case 3:
                        c = (M14651808836106150379) objArr[1];
                        continue;
                    case 4:
                        d = (M14651808836106150379[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void cbgbtweaerhs(String str, int i);

    private static native int emkogjfuobwy(Object[] objArr);

    public static native M14651808836106150379 valueOf(String str);

    public static native M14651808836106150379[] values();

    private M14651808836106150379(String str, int i) {
        cbgbtweaerhs(str, i);
    }
}
