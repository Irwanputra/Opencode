package dev.epro.r0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class A9980048833330902462 {
    public static final A9980048833330902462 a;
    public static final A2789795882633926065 b;
    public static final Object c;
    public static final LinkedHashMap d;
    public static final LinkedHashMap e;
    public static final LinkedHashSet f;

    static {
        int wkspzasxasud;
        izmyclvb.oeynnivvrnts0(924);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                wkspzasxasud = wkspzasxasud(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (wkspzasxasud != 0) {
                switch (wkspzasxasud) {
                    case 1:
                        a = (A9980048833330902462) objArr[1];
                        continue;
                    case 2:
                        b = (A2789795882633926065) objArr[1];
                        continue;
                    case 3:
                        c = objArr[1];
                        continue;
                    case 4:
                        d = (LinkedHashMap) objArr[1];
                        continue;
                    case 5:
                        e = (LinkedHashMap) objArr[1];
                        continue;
                    case 6:
                        f = (LinkedHashSet) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native void c(A9980048833330902462 a9980048833330902462, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, L12639328004344855510 l12639328004344855510, int i2, int i3, int i4, boolean z, int i5);

    public static native void d(String str);

    private native void ohlvzallrrbq();

    private static native int wkspzasxasud(Object[] objArr);

    public final native Object a(String str, int i, K14749510448791472029 k14749510448791472029);

    public final native Serializable b(String str, int i, K14749510448791472029 k14749510448791472029);

    private A9980048833330902462() {
        ohlvzallrrbq();
    }
}
