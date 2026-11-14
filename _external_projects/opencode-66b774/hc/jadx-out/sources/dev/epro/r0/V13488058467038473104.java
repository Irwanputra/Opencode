package dev.epro.r0;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class V13488058467038473104 {
    public static final V13488058467038473104 a;
    public static final ArrayList b;
    public static final List c;
    public static final List d;
    public static final SecureRandom e;

    static {
        int iMckdlrsahjcj;
        izmyclvb.qgayjvbiagej2(129);
        Object[] objArr = new Object[10];
        while (true) {
            try {
                iMckdlrsahjcj = mckdlrsahjcj(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iMckdlrsahjcj != 0) {
                switch (iMckdlrsahjcj) {
                    case 1:
                        a = (V13488058467038473104) objArr[1];
                        continue;
                    case 2:
                        b = (ArrayList) objArr[1];
                        continue;
                    case 3:
                        c = (List) objArr[1];
                        continue;
                    case 4:
                        d = (List) objArr[1];
                        continue;
                    case 5:
                        e = (SecureRandom) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native Z11244019023321623390 a(int i, Y6921797927338498306 y6921797927338498306, byte[] bArr);

    public static native Y6921797927338498306 b(String str, int i, Integer num);

    public static native byte[] c(String str);

    public static native String d(String str);

    public static native String e(int i, String str, String str2);

    public static native Y6921797927338498306 f(int i, int i2, String str, byte[] bArr);

    public static native Y6921797927338498306 g(String str, int i, byte[] bArr, int i2, int i3);

    public static native byte[] h(int i, Y6921797927338498306 y6921797927338498306, byte[] bArr);

    public static native int i(String str);

    private static native int mckdlrsahjcj(Object[] objArr);

    private native void uqebxckgbqac();

    public static final class Y6921797927338498306 {
        public final String a;
        public final int b;
        public final int c;
        public final byte[] d;
        public final byte[] e;

        static {
            izmyclvb.qgayjvbiagej2(2);
        }

        private native void wotdesdmqdcs(String str, int i, int i2, byte[] bArr, byte[] bArr2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y6921797927338498306(String str, int i, int i2, byte[] bArr, byte[] bArr2) {
            str.getClass();
            bArr.getClass();
            bArr2.getClass();
            wotdesdmqdcs(str, i, i2, bArr, bArr2);
        }
    }

    private V13488058467038473104() {
        uqebxckgbqac();
    }

    public static final class Z11244019023321623390 {
        public final byte[] a;
        public final boolean b;
        public final boolean c;
        public final Integer d;
        public final Integer e;

        static {
            izmyclvb.qgayjvbiagej2(1053);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
        public /* synthetic */ Z11244019023321623390(byte[] bArr, boolean z, boolean z2, Integer num, Integer num2, int i, O18369580107802500074 o18369580107802500074) {
            Object[] objArrGgfvcufkvbjx = ggfvcufkvbjx(bArr, z, z2, num, num2, i, o18369580107802500074);
            this((byte[]) objArrGgfvcufkvbjx[0], ((Integer) objArrGgfvcufkvbjx[1]).intValue(), ((Integer) objArrGgfvcufkvbjx[2]).intValue(), (Integer) objArrGgfvcufkvbjx[3], (Integer) objArrGgfvcufkvbjx[4]);
            epqsxpsspfkn();
        }

        private native void epqsxpsspfkn();

        private static native Object[] ggfvcufkvbjx(byte[] bArr, boolean z, boolean z2, Integer num, Integer num2, int i, O18369580107802500074 o18369580107802500074);

        private native void ldhjdpuvjvxa(byte[] bArr, boolean z, boolean z2, Integer num, Integer num2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(byte[] bArr, boolean z, boolean z2, Integer num, Integer num2) {
            bArr.getClass();
            ldhjdpuvjvxa(bArr, z, z2, num, num2);
        }
    }
}
