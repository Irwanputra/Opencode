package dev.epro.httpcustom.protocol.ssh;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class HcrNativeCodec {
    public static final int $stable = 0;
    public static final HcrNativeCodec INSTANCE;

    static {
        int iOjrxijvrgaxo;
        izmyclvb.oeynnivvrnts0(1141);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iOjrxijvrgaxo = ojrxijvrgaxo(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iOjrxijvrgaxo != 0) {
                switch (iOjrxijvrgaxo) {
                    case 1:
                        INSTANCE = (HcrNativeCodec) objArr[1];
                        break;
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
