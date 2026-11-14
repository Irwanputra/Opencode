package dev.epro.r0;

import java.util.Arrays;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class J3469719159098818144 {
    public static final J3469719159098818144 a;

    static {
        int i;
        izmyclvb.dpqpjfpoanwt1(675);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                i = tokvactnegbs(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (i != 0) {
                switch (i) {
                    case 1:
                        a = (J3469719159098818144) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native int a(JSONObject jSONObject, String str, int i);

    public static native Integer b(Map map);

    public static native String c(String str, JSONObject jSONObject);

    public static native String d(Map map, String str);

    private native void eicncmegdwna();

    private static native int tokvactnegbs(Object[] objArr);

    public static final class Z11244019023321623390 {
        public final String a;
        public final String b;

        static {
            izmyclvb.dpqpjfpoanwt1(1324);
        }

        private native void lqvjnxrcdnsa(String str, String str2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(String str, String str2) {
            str.getClass();
            str2.getClass();
            lqvjnxrcdnsa(str, str2);
        }
    }

    private J3469719159098818144() {
        eicncmegdwna();
    }
}
