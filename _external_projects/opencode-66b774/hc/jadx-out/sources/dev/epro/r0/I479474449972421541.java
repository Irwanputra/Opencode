package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class I479474449972421541 implements E16285158603488107888 {
    public static final I479474449972421541 a;

    static {
        int iIakvpescjsyk;
        izmyclvb.dpqpjfpoanwt1(2310);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iIakvpescjsyk = iakvpescjsyk(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iIakvpescjsyk != 0) {
                switch (iIakvpescjsyk) {
                    case 1:
                        a = (I479474449972421541) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int iakvpescjsyk(Object[] objArr);

    private native void vkegeacnbojw();

    @Override // dev.epro.r0.E16285158603488107888
    public final native P10917817599008460069 intercept(N4061146215511977314 n4061146215511977314);

    private I479474449972421541() {
        vkegeacnbojw();
    }
}
