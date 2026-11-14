package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class L8157014561124294065 {
    public static final L8157014561124294065 a;
    public static final H5336160545165318150 b;
    public static final H5336160545165318150 c;

    static {
        int rochngjiioko;
        izmyclvb.dpqpjfpoanwt1(1639);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                rochngjiioko = rochngjiioko(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (rochngjiioko != 0) {
                switch (rochngjiioko) {
                    case 1:
                        a = (L8157014561124294065) objArr[1];
                        continue;
                    case 2:
                        b = (H5336160545165318150) objArr[1];
                        continue;
                    case 3:
                        c = (H5336160545165318150) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native M941267783158958208 a(String str);

    public static native String b(String str, JSONObject jSONObject);

    public static native M941267783158958208 c(JSONObject jSONObject, int i);

    public static native String d(String str);

    private native void lsqhunjggpen();

    private static native int rochngjiioko(Object[] objArr);

    private L8157014561124294065() {
        lsqhunjggpen();
    }
}
