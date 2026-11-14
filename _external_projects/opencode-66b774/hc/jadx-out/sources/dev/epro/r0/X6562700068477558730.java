package dev.epro.r0;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class X6562700068477558730 {
    public static final X6562700068477558730 a;
    public static final byte[] b;
    public static final byte[] c;
    public static final SecureRandom d;
    public static volatile byte[] e;
    public static final ReentrantLock f;

    static {
        int iCqsbrzymdmjs;
        izmyclvb.qgayjvbiagej2(745);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iCqsbrzymdmjs = cqsbrzymdmjs(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iCqsbrzymdmjs != 0) {
                switch (iCqsbrzymdmjs) {
                    case 1:
                        a = (X6562700068477558730) objArr[1];
                        continue;
                    case 2:
                        b = (byte[]) objArr[1];
                        continue;
                    case 3:
                        c = (byte[]) objArr[1];
                        continue;
                    case 4:
                        d = (SecureRandom) objArr[1];
                        continue;
                    case 5:
                        f = (ReentrantLock) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native S4051884465659140834 a(String str);

    public static native String b(String str);

    public static native String c(String str);

    private static native int cqsbrzymdmjs(Object[] objArr);

    public static native byte[] d();

    private native void uqmpjxzsedna();

    private X6562700068477558730() {
        uqmpjxzsedna();
    }
}
