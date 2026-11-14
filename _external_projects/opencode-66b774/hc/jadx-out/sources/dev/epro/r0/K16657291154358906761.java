package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class K16657291154358906761 {
    public static final Z11244019023321623390 b;
    public static final char[] c;
    public final List a;

    static {
        int iHtrbrrcygxrk;
        izmyclvb.dpqpjfpoanwt1(1156);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iHtrbrrcygxrk = htrbrrcygxrk(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iHtrbrrcygxrk != 0) {
                switch (iHtrbrrcygxrk) {
                    case 1:
                        b = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        c = (char[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int htrbrrcygxrk(Object[] objArr);

    private native void sgxrhbuqyjkt(List<T8468160229121804470> list);

    public final native boolean a(String str);

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(2025);
        }

        public static native K16657291154358906761 a(String str);

        private native void bkomodajcmdo();

        private native void rcigvylqdxvl(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            rcigvylqdxvl(o18369580107802500074);
        }

        private Z11244019023321623390() {
            bkomodajcmdo();
        }
    }

    public K16657291154358906761(List<T8468160229121804470> list) {
        list.getClass();
        sgxrhbuqyjkt(list);
    }
}
