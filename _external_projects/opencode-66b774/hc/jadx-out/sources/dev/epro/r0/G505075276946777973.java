package dev.epro.r0;

import java.io.InputStream;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class G505075276946777973 {
    public static final G505075276946777973 a;
    public static final byte[] b;
    public static final byte[] c;

    static {
        int iMxxnwztsvdik;
        izmyclvb.dpqpjfpoanwt1(667);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iMxxnwztsvdik = mxxnwztsvdik(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iMxxnwztsvdik != 0) {
                switch (iMxxnwztsvdik) {
                    case 1:
                        a = (G505075276946777973) objArr[1];
                        continue;
                    case 2:
                        b = (byte[]) objArr[1];
                        continue;
                    case 3:
                        c = (byte[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native byte[] a(int i, int i2, byte[] bArr, int i3, byte[] bArr2, int i4, int i5);

    private native void abkraqarqwyl();

    public static native Z11244019023321623390 b(InputStream inputStream);

    private static native int mxxnwztsvdik(Object[] objArr);

    public static final class Z11244019023321623390 {
        public final int a;
        public final int b;
        public final byte[] c;
        public final int d;
        public final byte[] e;

        static {
            izmyclvb.dpqpjfpoanwt1(930);
        }

        private native void widjjnejkami(int i, int i2, byte[] bArr, int i3, byte[] bArr2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(int i, int i2, byte[] bArr, int i3, byte[] bArr2) {
            bArr2.getClass();
            widjjnejkami(i, i2, bArr, i3, bArr2);
        }
    }

    private G505075276946777973() {
        abkraqarqwyl();
    }
}
