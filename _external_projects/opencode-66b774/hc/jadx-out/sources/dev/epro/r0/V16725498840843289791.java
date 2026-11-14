package dev.epro.r0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V16725498840843289791 {
    public static final Set a;
    public static final LinkedHashSet b;

    static {
        int iQiyxmkbkqwjk;
        izmyclvb.qgayjvbiagej2(1215);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iQiyxmkbkqwjk = qiyxmkbkqwjk(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iQiyxmkbkqwjk != 0) {
                switch (iQiyxmkbkqwjk) {
                    case 1:
                        a = (Set) objArr[1];
                        continue;
                    case 2:
                        b = (LinkedHashSet) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native Z2583223807443939214 a(int i, List list, C13199856549537327585 c13199856549537327585, boolean z);

    private static native int qiyxmkbkqwjk(Object[] objArr);
}
