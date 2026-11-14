package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class P16080705924044660797 {
    public static final P16080705924044660797 a;
    public static final P16080705924044660797 b;
    public static final P16080705924044660797 c;
    public static final P16080705924044660797 d;
    public static final /* synthetic */ P16080705924044660797[] e;

    static {
        int iMcthlxkvyujn;
        izmyclvb.qgayjvbiagej2(1788);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iMcthlxkvyujn = mcthlxkvyujn(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iMcthlxkvyujn != 0) {
                switch (iMcthlxkvyujn) {
                    case 1:
                        a = (P16080705924044660797) objArr[1];
                        continue;
                    case 2:
                        b = (P16080705924044660797) objArr[1];
                        continue;
                    case 3:
                        c = (P16080705924044660797) objArr[1];
                        continue;
                    case 4:
                        d = (P16080705924044660797) objArr[1];
                        continue;
                    case 5:
                        e = (P16080705924044660797[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void bymzmqxlfkgh(String str, int i);

    private static native int mcthlxkvyujn(Object[] objArr);

    public static native P16080705924044660797 valueOf(String str);

    public static native P16080705924044660797[] values();

    private P16080705924044660797(String str, int i) {
        bymzmqxlfkgh(str, i);
    }
}
