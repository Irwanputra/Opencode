package dev.epro.r0;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class W5633554511999220426 {
    public static final W5633554511999220426 a;

    static {
        int ookspkjvqoww;
        izmyclvb.qgayjvbiagej2(117);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                ookspkjvqoww = ookspkjvqoww(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (ookspkjvqoww != 0) {
                switch (ookspkjvqoww) {
                    case 1:
                        a = (W5633554511999220426) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native long a(long j);

    public static native String b(W5633554511999220426 w5633554511999220426, byte[] bArr, int i);

    public static native Z11244019023321623390 c(W5633554511999220426 w5633554511999220426, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2, int i4, T14793413619962821194 t14793413619962821194, int i5);

    public static native DatagramPacket d(DatagramSocket datagramSocket, byte[] bArr, int i, long j, L12639328004344855510 l12639328004344855510);

    private static native int ookspkjvqoww(Object[] objArr);

    private native void rwpkxfusobve();

    public static final class Z11244019023321623390 {
        public final boolean a;
        public final boolean b;
        public final int c;
        public final int d;
        public final byte[] e;
        public final long f;
        public final String g;

        static {
            izmyclvb.qgayjvbiagej2(1518);
        }

        private native void rdfgvdpotsox(boolean z, boolean z2, int i, int i2, byte[] bArr, long j, String str);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(boolean z, boolean z2, int i, int i2, byte[] bArr, long j, String str) {
            bArr.getClass();
            rdfgvdpotsox(z, z2, i, i2, bArr, j, str);
        }
    }

    private W5633554511999220426() {
        rwpkxfusobve();
    }
}
