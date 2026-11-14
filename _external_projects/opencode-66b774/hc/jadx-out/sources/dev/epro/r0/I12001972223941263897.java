package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class I12001972223941263897 {
    public static final I12001972223941263897 a;

    static {
        int iVhbvjobtucev;
        izmyclvb.dpqpjfpoanwt1(569);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iVhbvjobtucev = vhbvjobtucev(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iVhbvjobtucev != 0) {
                switch (iVhbvjobtucev) {
                    case 1:
                        a = (I12001972223941263897) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native L11185428873362538365 a(byte[] bArr);

    public static native V13784730198723422466 b(JSONObject jSONObject);

    public static native String c(String str, JSONObject jSONObject);

    private native void vfqiifflsjos();

    private static native int vhbvjobtucev(Object[] objArr);

    private I12001972223941263897() {
        vfqiifflsjos();
    }
}
