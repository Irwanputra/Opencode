package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class A15717146702094362135 {
    public static final A15717146702094362135 a;
    public static final Set b;

    static {
        int iIgkcdfxoejqv;
        izmyclvb.oeynnivvrnts0(700);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iIgkcdfxoejqv = igkcdfxoejqv(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iIgkcdfxoejqv != 0) {
                switch (iIgkcdfxoejqv) {
                    case 1:
                        a = (A15717146702094362135) objArr[1];
                        continue;
                    case 2:
                        b = (Set) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native JSONObject a(JSONObject jSONObject);

    public static native String b(String str);

    public static native JSONObject c(String str);

    public static native String d(String str, JSONObject jSONObject);

    public static native List e(JSONObject jSONObject);

    private static native int igkcdfxoejqv(Object[] objArr);

    private native void mqosmeohmrwp();

    public static final class Z11244019023321623390 {
        public final String a;
        public final String b;

        static {
            izmyclvb.oeynnivvrnts0(1159);
        }

        private native void lzseffmrlkno(String str, String str2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(String str, String str2) {
            str.getClass();
            lzseffmrlkno(str, str2);
        }
    }

    private A15717146702094362135() {
        mqosmeohmrwp();
    }
}
