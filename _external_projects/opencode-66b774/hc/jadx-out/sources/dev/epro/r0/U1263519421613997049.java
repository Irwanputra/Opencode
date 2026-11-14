package dev.epro.r0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class U1263519421613997049 {
    public static final U1263519421613997049 a;

    static {
        int iQaoxwtdiokdg;
        izmyclvb.qgayjvbiagej2(1801);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iQaoxwtdiokdg = qaoxwtdiokdg(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iQaoxwtdiokdg != 0) {
                switch (iQaoxwtdiokdg) {
                    case 1:
                        a = (U1263519421613997049) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native byte[] a(String str, int i, int i2, Integer num);

    public static native boolean b(byte[] bArr, byte[] bArr2, int i);

    public static native Y6921797927338498306 c(int i, byte[] bArr);

    public static native String d(int i);

    public static native void e(ByteArrayOutputStream byteArrayOutputStream, int i);

    private native void jocnmxvgcfni();

    private static native int qaoxwtdiokdg(Object[] objArr);

    public static final class Z11244019023321623390 {
        public final String a;
        public final int b;
        public final int c;

        static {
            izmyclvb.qgayjvbiagej2(2119);
        }

        private native void mgrchfemyyzy(String str, int i, int i2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(String str, int i, int i2) {
            str.getClass();
            mgrchfemyyzy(str, i, i2);
        }
    }

    private U1263519421613997049() {
        jocnmxvgcfni();
    }

    public static final class Y6921797927338498306 {
        public final int a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final List e;
        public final List f;
        public final boolean g;
        public final int h;

        static {
            izmyclvb.qgayjvbiagej2(1590);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v18, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
        public /* synthetic */ Y6921797927338498306(int i, int i2, boolean z, boolean z2, List list, List list2, boolean z3, int i3, int i4, O18369580107802500074 o18369580107802500074) {
            Object[] objArrOegrqnnjzgib = oegrqnnjzgib(i, i2, z, z2, list, list2, z3, i3, i4, o18369580107802500074);
            this(((Integer) objArrOegrqnnjzgib[0]).intValue(), ((Integer) objArrOegrqnnjzgib[1]).intValue(), ((Integer) objArrOegrqnnjzgib[2]).intValue(), ((Integer) objArrOegrqnnjzgib[3]).intValue(), (List) objArrOegrqnnjzgib[4], (List) objArrOegrqnnjzgib[5], ((Integer) objArrOegrqnnjzgib[6]).intValue(), ((Integer) objArrOegrqnnjzgib[7]).intValue());
            ppmaawmjjasg();
        }

        private native void gxieoyqattig(int i, int i2, boolean z, boolean z2, List<U15329576221039454451> list, List<Z11244019023321623390> list2, boolean z3, int i3);

        private static native Object[] oegrqnnjzgib(int i, int i2, boolean z, boolean z2, List list, List list2, boolean z3, int i3, int i4, O18369580107802500074 o18369580107802500074);

        private native void ppmaawmjjasg();

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y6921797927338498306(int i, int i2, boolean z, boolean z2, List<U15329576221039454451> list, List<Z11244019023321623390> list2, boolean z3, int i3) {
            list.getClass();
            list2.getClass();
            gxieoyqattig(i, i2, z, z2, list, list2, z3, i3);
        }
    }
}
