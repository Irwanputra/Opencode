package dev.epro.httpcustom.protocol.ssh;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class HcrNativeCodec {
    public static final int $stable = 0;
    public static final HcrNativeCodec INSTANCE;

    static {
        int ojrxijvrgaxo;
        izmyclvb.oeynnivvrnts0(1141);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                ojrxijvrgaxo = ojrxijvrgaxo(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (ojrxijvrgaxo != 0) {
                switch (ojrxijvrgaxo) {
                    case 1:
                        INSTANCE = (HcrNativeCodec) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void hklyyjnormys();

    private static native int ojrxijvrgaxo(Object[] objArr);

    public static final native boolean transform(byte[] bArr, byte[] bArr2, int i, long j, boolean z, int i2);

    private HcrNativeCodec() {
        hklyyjnormys();
    }
}
