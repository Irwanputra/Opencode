package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B4559136470723892551 {
    public static final dev.epro.r0.B4559136470723892551 a;
    public static final java.util.List b;

    static {
        int iZyowwodjpktm;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(144);
        java.lang.Object[] objArr = new java.lang.Object[10];
        while (true) {
            try {
                iZyowwodjpktm = zyowwodjpktm(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iZyowwodjpktm != 0) {
                switch (iZyowwodjpktm) {
                    case 1:
                        a = (dev.epro.r0.B4559136470723892551) objArr[1];
                        continue;
                    case 2:
                        b = (java.util.List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    public static native int a(byte[] bArr, byte[] bArr2, int i, int i2);

    public static native java.util.List b(java.io.OutputStream outputStream, byte[] bArr, int i, dev.epro.r0.L10135580317894902847 l10135580317894902847);

    public static native java.util.ArrayList c(java.io.OutputStream outputStream, byte[] bArr, int i, int i2, dev.epro.r0.L10135580317894902847 l10135580317894902847);

    private native void yjmfbkimhooh();

    private static native int zyowwodjpktm(java.lang.Object[] objArr);

    private B4559136470723892551() {
        yjmfbkimhooh();
    }

    public static final class Z11244019023321623390 {
        public final byte[] a;
        public final boolean b;

        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(132);
        }

        public Z11244019023321623390(java.lang.String str, boolean z) {
            this((byte[]) qnbahvnnubaw(str, z)[0], z);
            qezrwiqdhzle();
        }

        private native void hkxqtjtjzrtq(byte[] bArr, boolean z);

        private native void qezrwiqdhzle();

        private static native java.lang.Object[] qnbahvnnubaw(java.lang.String str, boolean z);

        public final native boolean equals(java.lang.Object obj);

        public final native int hashCode();

        public final native java.lang.String toString();

        public Z11244019023321623390(byte[] bArr, boolean z) {
            bArr.getClass();
            hkxqtjtjzrtq(bArr, z);
        }
    }
}
