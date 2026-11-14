package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class M11750094950192991949 implements AutoCloseable {
    public static final Z11244019023321623390 e;
    public final byte[] a;
    public final int b;
    public final int[] c;
    public final int[] d;

    static {
        int jltcelxygbvb;
        izmyclvb.dpqpjfpoanwt1(1892);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                jltcelxygbvb = jltcelxygbvb(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (jltcelxygbvb != 0) {
                switch (jltcelxygbvb) {
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

    private native void fqmawhhdjecf(byte[] bArr, int i, int[] iArr, int[] iArr2, O18369580107802500074 o18369580107802500074);

    private static native int jltcelxygbvb(Object[] objArr);

    private native void kpfwinpuevoj(byte[] bArr, int i, int[] iArr, int[] iArr2);

    @Override // java.lang.AutoCloseable
    public final native void close();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(1576);
        }

        public static native M11750094950192991949 a(byte[] bArr, byte[] bArr2, int i, int i2);

        private native void efafcydpvyto(O18369580107802500074 o18369580107802500074);

        private native void jmzadtmyyakq();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            efafcydpvyto(o18369580107802500074);
        }

        private Z11244019023321623390() {
            jmzadtmyyakq();
        }
    }

    private M11750094950192991949(byte[] bArr, int i, int[] iArr, int[] iArr2) {
        kpfwinpuevoj(bArr, i, iArr, iArr2);
    }

    public /* synthetic */ M11750094950192991949(byte[] bArr, int i, int[] iArr, int[] iArr2, O18369580107802500074 o18369580107802500074) {
        this(bArr, i, iArr, iArr2);
        fqmawhhdjecf(bArr, i, iArr, iArr2, o18369580107802500074);
    }
}
