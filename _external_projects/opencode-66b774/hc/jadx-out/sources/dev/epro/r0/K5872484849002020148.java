package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class K5872484849002020148 {
    public static final K5872484849002020148 a;

    static {
        int iBqtnhktqdesi;
        izmyclvb.dpqpjfpoanwt1(220);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iBqtnhktqdesi = bqtnhktqdesi(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iBqtnhktqdesi != 0) {
                switch (iBqtnhktqdesi) {
                    case 1:
                        a = (K5872484849002020148) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native String a(String str, JSONObject jSONObject);

    public static native Z11244019023321623390 b(String str, JSONObject jSONObject);

    private static native int bqtnhktqdesi(Object[] objArr);

    private native void nyvjocikwnkr();

    public static final class Z11244019023321623390 {
        public final String a;
        public final int b;
        public final String c;

        static {
            izmyclvb.dpqpjfpoanwt1(1946);
        }

        private native void jvpuvcztjemr(String str, int i, String str2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(String str, int i, String str2) {
            str.getClass();
            str2.getClass();
            jvpuvcztjemr(str, i, str2);
        }
    }

    private K5872484849002020148() {
        nyvjocikwnkr();
    }
}
