package dev.epro.r0;

import java.security.SecureRandom;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T11558491893303867762 {
    public static final byte[] a;

    static {
        int iOmqpuiusvedz;
        izmyclvb.qgayjvbiagej2(2155);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iOmqpuiusvedz = omqpuiusvedz(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iOmqpuiusvedz != 0) {
                switch (iOmqpuiusvedz) {
                    case 1:
                        a = (byte[]) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native /* synthetic */ byte[] a(SecureRandom secureRandom);

    private static final native byte[] b(SecureRandom secureRandom);

    public static final native byte[] c(int i, byte[] bArr);

    private static native int omqpuiusvedz(Object[] objArr);
}
