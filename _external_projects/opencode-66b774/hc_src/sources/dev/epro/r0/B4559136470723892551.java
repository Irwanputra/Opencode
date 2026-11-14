package dev.epro.r0;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class B4559136470723892551 {
    public static final B4559136470723892551 a;
    public static final List b;

    static {
        int zyowwodjpktm;
        izmyclvb.oeynnivvrnts0(144);
        Object[] objArr = new Object[10];
        while (true) {
            try {
                zyowwodjpktm = zyowwodjpktm(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (zyowwodjpktm != 0) {
                switch (zyowwodjpktm) {
                    case 1:
                        a = (B4559136470723892551) objArr[1];
                        continue;
                    case 2:
                        b = (List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native int a(byte[] bArr, byte[] bArr2, int i, int i2);

    public static native List b(OutputStream outputStream, byte[] bArr, int i, L10135580317894902847 l10135580317894902847);

    public static native ArrayList c(OutputStream outputStream, byte[] bArr, int i, int i2, L10135580317894902847 l10135580317894902847);

    private native void yjmfbkimhooh();

    private static native int zyowwodjpktm(Object[] objArr);

    private B4559136470723892551() {
        yjmfbkimhooh();
    }

    public static final class Z11244019023321623390 {
        public final byte[] a;
        public final boolean b;

        static {
            izmyclvb.oeynnivvrnts0(132);
        }

        public Z11244019023321623390(String str, boolean z) {
            this((byte[]) qnbahvnnubaw(str, z)[0], z);
            qezrwiqdhzle();
        }

        private native void hkxqtjtjzrtq(byte[] bArr, boolean z);

        private native void qezrwiqdhzle();

        private static native Object[] qnbahvnnubaw(String str, boolean z);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(byte[] bArr, boolean z) {
            bArr.getClass();
            hkxqtjtjzrtq(bArr, z);
        }
    }
}
