package dev.epro.r0;

import dev.epro.slowdns.SocketProtector;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class K6440471139849864050 implements SocketProtector {
    public static final K6440471139849864050 a;

    static {
        int uvobaawnpmge;
        izmyclvb.dpqpjfpoanwt1(2023);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                uvobaawnpmge = uvobaawnpmge(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (uvobaawnpmge != 0) {
                switch (uvobaawnpmge) {
                    case 1:
                        a = (K6440471139849864050) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void muejgmqhjgsr();

    private static native int uvobaawnpmge(Object[] objArr);

    @Override // dev.epro.slowdns.SocketProtector
    public final native boolean protect(long j);

    private K6440471139849864050() {
        muejgmqhjgsr();
    }
}
