package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import java.util.WeakHashMap;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T7861665476026723109 {
    public static final Object a;
    public static final WeakHashMap b;
    public static final Set c;

    static {
        int iBysrwpiajcwa;
        izmyclvb.qgayjvbiagej2(1581);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iBysrwpiajcwa = bysrwpiajcwa(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iBysrwpiajcwa != 0) {
                switch (iBysrwpiajcwa) {
                    case 1:
                        a = objArr[1];
                        continue;
                    case 2:
                        b = (WeakHashMap) objArr[1];
                        continue;
                    case 3:
                        c = (Set) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native Object a(S2557420383749238385 s2557420383749238385, K14749510448791472029 k14749510448791472029);

    public static native void b(S2557420383749238385 s2557420383749238385, W5797197595347441198 w5797197595347441198, String str, F4096073349764486348 f4096073349764486348, int i);

    private static native int bysrwpiajcwa(Object[] objArr);

    public static final native L15671594719280660167 c(S2557420383749238385 s2557420383749238385);
}
