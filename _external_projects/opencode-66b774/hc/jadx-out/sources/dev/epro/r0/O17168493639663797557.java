package dev.epro.r0;

import android.net.VpnService;
import dev.epro.httpcustom.service.CustomVpnService;
import java.util.Arrays;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class O17168493639663797557 {
    public static final O17168493639663797557 a;

    static {
        int iLmsovjjlsopi;
        izmyclvb.dpqpjfpoanwt1(1683);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iLmsovjjlsopi = lmsovjjlsopi(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iLmsovjjlsopi != 0) {
                switch (iLmsovjjlsopi) {
                    case 1:
                        a = (O17168493639663797557) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native boolean a(CustomVpnService customVpnService, VpnService.Builder builder, Map map);

    private static native int lmsovjjlsopi(Object[] objArr);

    private native void zidtqmsepeep();

    private O17168493639663797557() {
        zidtqmsepeep();
    }
}
