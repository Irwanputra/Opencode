package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.util.Arrays;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class L13228523046976612098 {
    public static final Z11244019023321623390 e;
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;

    static {
        int ncfdlpkhgsbr;
        izmyclvb.dpqpjfpoanwt1(pd.l1);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                ncfdlpkhgsbr = ncfdlpkhgsbr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (ncfdlpkhgsbr != 0) {
                switch (ncfdlpkhgsbr) {
                    case 1:
                        e = (Z11244019023321623390) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void evwpxwdcfysv(int i, int i2, boolean z);

    private static native int ncfdlpkhgsbr(Object[] objArr);

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(1619);
        }

        public static native L13228523046976612098 a(Map map, L13228523046976612098 l13228523046976612098);

        private native void barmygguytrw();

        private native void icmdydicmany(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            icmdydicmany(o18369580107802500074);
        }

        private Z11244019023321623390() {
            barmygguytrw();
        }
    }

    public L13228523046976612098(int i, int i2, boolean z) {
        evwpxwdcfysv(i, i2, z);
    }
}
