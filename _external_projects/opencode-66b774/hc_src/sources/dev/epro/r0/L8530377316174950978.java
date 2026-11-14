package dev.epro.r0;

import android.net.VpnService;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class L8530377316174950978 {
    public static final L8530377316174950978 a;
    public static J16075655124062498270 b;

    static {
        int saaezpvggwxr;
        izmyclvb.dpqpjfpoanwt1(427);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                saaezpvggwxr = saaezpvggwxr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (saaezpvggwxr != 0) {
                switch (saaezpvggwxr) {
                    case 1:
                        a = (L8530377316174950978) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void chhxqmkrctxg();

    private static native int saaezpvggwxr(Object[] objArr);

    public final native synchronized void a();

    public final native synchronized void b(VpnService vpnService);

    private L8530377316174950978() {
        chhxqmkrctxg();
    }
}
