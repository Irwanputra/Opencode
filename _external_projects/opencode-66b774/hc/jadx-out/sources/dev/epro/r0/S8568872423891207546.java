package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class S8568872423891207546 implements AutoCloseable {
    public static final Z11244019023321623390 h;
    public final H3947267601815958942 a;
    public String b;
    public final Object c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public boolean g;

    static {
        int iNjxfexaxcspy;
        izmyclvb.qgayjvbiagej2(1492);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iNjxfexaxcspy = njxfexaxcspy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNjxfexaxcspy != 0) {
                switch (iNjxfexaxcspy) {
                    case 1:
                        h = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ S8568872423891207546(G6894491622547477053 g6894491622547477053, byte[] bArr, byte[] bArr2, byte[] bArr3, H3947267601815958942 h3947267601815958942, int i, O18369580107802500074 o18369580107802500074) {
        Object[] objArrZcuuxsvmyeli = zcuuxsvmyeli(g6894491622547477053, bArr, bArr2, bArr3, h3947267601815958942, i, o18369580107802500074);
        this((G6894491622547477053) objArrZcuuxsvmyeli[0], (byte[]) objArrZcuuxsvmyeli[1], (byte[]) objArrZcuuxsvmyeli[2], (byte[]) objArrZcuuxsvmyeli[3], (H3947267601815958942) objArrZcuuxsvmyeli[4]);
        igwdsyxdteeu();
    }

    private final native String d(G6894491622547477053 g6894491622547477053);

    private native void igwdsyxdteeu();

    private static native int njxfexaxcspy(Object[] objArr);

    private native void ukxqisgbkwck(byte[] bArr, byte[] bArr2, byte[] bArr3, H3947267601815958942 h3947267601815958942, String str);

    private native void xlwfeprghoeg(G6894491622547477053 g6894491622547477053);

    private static native Object[] zcuuxsvmyeli(G6894491622547477053 g6894491622547477053, byte[] bArr, byte[] bArr2, byte[] bArr3, H3947267601815958942 h3947267601815958942, int i, O18369580107802500074 o18369580107802500074);

    public final native byte[] b();

    public final native S8568872423891207546 c();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(68);
        }

        public static native S8568872423891207546 a(G6894491622547477053 g6894491622547477053, byte[] bArr, byte[] bArr2, byte[] bArr3, H3947267601815958942 h3947267601815958942);

        private native void jnrzuvjaqwsp();

        private native void jvyqtqktxoac(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            jvyqtqktxoac(o18369580107802500074);
        }

        private Z11244019023321623390() {
            jnrzuvjaqwsp();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S8568872423891207546(G6894491622547477053 g6894491622547477053, byte[] bArr, byte[] bArr2, byte[] bArr3, H3947267601815958942 h3947267601815958942) {
        this(bArr, bArr2, bArr3, h3947267601815958942, (String) null);
        g6894491622547477053.getClass();
        bArr.getClass();
        bArr2.getClass();
        bArr3.getClass();
        h3947267601815958942.getClass();
        xlwfeprghoeg(g6894491622547477053);
    }

    private S8568872423891207546(byte[] bArr, byte[] bArr2, byte[] bArr3, H3947267601815958942 h3947267601815958942, String str) {
        ukxqisgbkwck(bArr, bArr2, bArr3, h3947267601815958942, str);
    }
}
