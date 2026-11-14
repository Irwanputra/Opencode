package dev.epro.r0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class V6916883330368648150 {
    public static final V6916883330368648150 a;
    public static final A2789795882633926065 b;
    public static final List c;

    static {
        int iQoerigydpwyu;
        izmyclvb.qgayjvbiagej2(1350);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iQoerigydpwyu = qoerigydpwyu(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iQoerigydpwyu != 0) {
                switch (iQoerigydpwyu) {
                    case 1:
                        a = (V6916883330368648150) objArr[1];
                        continue;
                    case 2:
                        b = (A2789795882633926065) objArr[1];
                        continue;
                    case 3:
                        c = (List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native byte[] a(byte[] bArr);

    public static native boolean b(byte[] bArr, byte[] bArr2, int i);

    private native void obvcjpnfsoja();

    private static native int qoerigydpwyu(Object[] objArr);

    public final native Serializable c(String str, int i, K14749510448791472029 k14749510448791472029);

    public static final class Y6921797927338498306 {
        public final String a;
        public final int b;

        static {
            izmyclvb.qgayjvbiagej2(1570);
        }

        public /* synthetic */ Y6921797927338498306(String str, int i, int i2, O18369580107802500074 o18369580107802500074) {
            this(str, ((Integer) tkxgjhquwuip(str, i, i2, o18369580107802500074)[0]).intValue());
            vwajwjucjtas();
        }

        private native void otmxsjyzqkpj(String str, int i);

        private static native Object[] tkxgjhquwuip(String str, int i, int i2, O18369580107802500074 o18369580107802500074);

        private native void vwajwjucjtas();

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y6921797927338498306(String str, int i) {
            str.getClass();
            otmxsjyzqkpj(str, i);
        }
    }

    public static final class Z11244019023321623390 {
        public final boolean a;
        public final long b;
        public final Throwable c;

        static {
            izmyclvb.qgayjvbiagej2(417);
        }

        public /* synthetic */ Z11244019023321623390(boolean z, long j, Throwable th, int i, O18369580107802500074 o18369580107802500074) {
            this(z, j, (Throwable) ojjvhfrkmolq(z, j, th, i, o18369580107802500074)[0]);
            cuywacphikyw();
        }

        private native void cuywacphikyw();

        private static native Object[] ojjvhfrkmolq(boolean z, long j, Throwable th, int i, O18369580107802500074 o18369580107802500074);

        private native void zyparxztqlrh(boolean z, long j, Throwable th);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(boolean z, long j, Throwable th) {
            zyparxztqlrh(z, j, th);
        }
    }

    private V6916883330368648150() {
        obvcjpnfsoja();
    }
}
