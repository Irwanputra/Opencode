package dev.epro.r0;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class V13488058467038473104 {
    public static final V13488058467038473104 a;
    public static final ArrayList b;
    public static final List c;
    public static final List d;
    public static final SecureRandom e;

    static {
        int mckdlrsahjcj;
        izmyclvb.qgayjvbiagej2(129);
        Object[] objArr = new Object[10];
        while (true) {
            try {
                mckdlrsahjcj = mckdlrsahjcj(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (mckdlrsahjcj != 0) {
                switch (mckdlrsahjcj) {
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Z11244019023321623390(byte[] r28, boolean r29, boolean r30, java.lang.Integer r31, java.lang.Integer r32, int r33, dev.epro.r0.O18369580107802500074 r34) {
            /*
                r27 = this;
                r10 = r27
                r11 = r28
                r12 = r29
                r13 = r30
                r14 = r31
                r15 = r32
                r16 = r33
                r17 = r34
                r18 = r10
                java.lang.Object[] r0 = ggfvcufkvbjx(r28, r29, r30, r31, r32, r33, r34)
                r1 = 0
                r2 = r0[r1]
                byte[] r2 = (byte[]) r2
                r5 = r2
                r1 = 1
                r2 = r0[r1]
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r6 = r2
                r1 = 2
                r2 = r0[r1]
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r7 = r2
                r1 = 3
                r2 = r0[r1]
                java.lang.Integer r2 = (java.lang.Integer) r2
                r8 = r2
                r1 = 4
                r2 = r0[r1]
                java.lang.Integer r2 = (java.lang.Integer) r2
                r9 = r2
                r4 = r18
                r19 = r4
                r20 = r5
                r21 = r6
                r22 = r7
                r23 = r8
                r24 = r9
                r19.<init>(r20, r21, r22, r23, r24)
                r19 = r4
                r19.epqsxpsspfkn()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V13488058467038473104.Z11244019023321623390.<init>(byte[], boolean, boolean, java.lang.Integer, java.lang.Integer, int, dev.epro.r0.O18369580107802500074):void");
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
