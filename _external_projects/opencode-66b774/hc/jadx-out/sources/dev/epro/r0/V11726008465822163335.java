package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class V11726008465822163335 {
    public static final V11726008465822163335 a;

    static {
        int iGdnjikorqjgy;
        izmyclvb.qgayjvbiagej2(402);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iGdnjikorqjgy = gdnjikorqjgy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iGdnjikorqjgy != 0) {
                switch (iGdnjikorqjgy) {
                    case 1:
                        a = (V11726008465822163335) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native int a(String str, JSONObject jSONObject);

    public static native N5407556009060208754 b(JSONObject jSONObject);

    public static native void c(JSONObject jSONObject, N5407556009060208754 n5407556009060208754);

    private static native int gdnjikorqjgy(Object[] objArr);

    private native void svadjjtmruhb();

    private V11726008465822163335() {
        svadjjtmruhb();
    }
}
