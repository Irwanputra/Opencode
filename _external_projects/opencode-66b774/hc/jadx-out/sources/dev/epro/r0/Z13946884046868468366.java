package dev.epro.r0;

import java.util.Arrays;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class Z13946884046868468366 {
    public static final Z13946884046868468366 a;
    public static final EdDSANamedCurveSpec b;

    static {
        int iRfjvnujzemlg;
        izmyclvb.qgayjvbiagej2(53);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iRfjvnujzemlg = rfjvnujzemlg(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iRfjvnujzemlg != 0) {
                switch (iRfjvnujzemlg) {
                    case 1:
                        a = (Z13946884046868468366) objArr[1];
                        continue;
                    case 2:
                        b = (EdDSANamedCurveSpec) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private native void gjtmaobaxedj();

    private static native int rfjvnujzemlg(Object[] objArr);

    private Z13946884046868468366() {
        gjtmaobaxedj();
    }
}
