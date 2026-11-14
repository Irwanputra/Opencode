package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class O16081980334380350467 {
    public static final O16081980334380350467 a;
    public static final ArrayList b;

    static {
        int iXoedypflhnho;
        izmyclvb.dpqpjfpoanwt1(359);
        Object[] objArr = new Object[9];
        while (true) {
            try {
                iXoedypflhnho = xoedypflhnho(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iXoedypflhnho != 0) {
                switch (iXoedypflhnho) {
                    case 1:
                        a = (O16081980334380350467) objArr[1];
                        continue;
                    case 2:
                        b = (ArrayList) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native Set a(String str);

    public static native String b(Set set);

    public static native Set c(Set set);

    private native void fbzolhqosxss();

    private static native int xoedypflhnho(Object[] objArr);

    private O16081980334380350467() {
        fbzolhqosxss();
    }
}
