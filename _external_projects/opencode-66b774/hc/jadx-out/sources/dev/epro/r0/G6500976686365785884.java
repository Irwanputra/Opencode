package dev.epro.r0;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class G6500976686365785884 implements AutoCloseable {
    public static final Z11244019023321623390 d;
    public final List a;
    public final int[] b;
    public final int c;

    static {
        int iIngwvuplqcaq;
        izmyclvb.dpqpjfpoanwt1(861);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iIngwvuplqcaq = ingwvuplqcaq(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iIngwvuplqcaq != 0) {
                switch (iIngwvuplqcaq) {
                    case 1:
                        d = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public G6500976686365785884(List<byte[]> list) {
        this(list, null, ((Integer) rqoqqpopbffm(list)[0]).intValue());
        pjzenxunrebg();
    }

    private static native int ingwvuplqcaq(Object[] objArr);

    private native void oeggmzmzlrkv(List list, int[] iArr, int i, O18369580107802500074 o18369580107802500074);

    private native void pjzenxunrebg();

    private static native Object[] rqoqqpopbffm(List list);

    private native void uouivxybcgmr(List<byte[]> list, int[] iArr, int i);

    public final native ArrayList b();

    public final native long c();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native int d(int i, OutputStream outputStream);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(1370);
        }

        public static native G6500976686365785884 a(int i, byte[] bArr, int i2);

        public static native G6500976686365785884 b(byte[] bArr, int[] iArr, int i);

        private native void cgacegqetstz();

        private native void zwzdovhmqdps(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            zwzdovhmqdps(o18369580107802500074);
        }

        private Z11244019023321623390() {
            cgacegqetstz();
        }
    }

    private G6500976686365785884(List<byte[]> list, int[] iArr, int i) {
        uouivxybcgmr(list, iArr, i);
    }

    public /* synthetic */ G6500976686365785884(List list, int[] iArr, int i, O18369580107802500074 o18369580107802500074) {
        this(list, iArr, i);
        oeggmzmzlrkv(list, iArr, i, o18369580107802500074);
    }
}
