package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class I7832778803563215865 implements F4096073349764486348 {
    public static final I7832778803563215865 a;

    static {
        int iHgrcfepsdlsv;
        izmyclvb.dpqpjfpoanwt1(1873);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iHgrcfepsdlsv = hgrcfepsdlsv(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iHgrcfepsdlsv != 0) {
                switch (iHgrcfepsdlsv) {
                    case 1:
                        a = (I7832778803563215865) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void beylytelxmns();

    private static native int hgrcfepsdlsv(Object[] objArr);

    @Override // dev.epro.r0.F4096073349764486348
    public final native Object invoke(Object obj);

    public I7832778803563215865() {
        beylytelxmns();
    }
}
