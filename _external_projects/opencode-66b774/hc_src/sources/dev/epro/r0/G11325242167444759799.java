package dev.epro.r0;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class G11325242167444759799 {
    public static final G11325242167444759799 a;

    static {
        int kzyyixpsqnwo;
        izmyclvb.dpqpjfpoanwt1(2021);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                kzyyixpsqnwo = kzyyixpsqnwo(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (kzyyixpsqnwo != 0) {
                switch (kzyyixpsqnwo) {
                    case 1:
                        a = (G11325242167444759799) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native JSONObject a(Context context, JSONObject jSONObject, int i, File file, int i2);

    public static native J9901552011246808928 b(JSONObject jSONObject, List list, G17925322415672763677 g17925322415672763677, int i, JSONObject jSONObject2);

    public static native J9901552011246808928 c(List list, G17925322415672763677 g17925322415672763677, int i, JSONObject jSONObject, int i2, String str);

    public static native Z11244019023321623390 d(Map map);

    public static native List e(JSONObject jSONObject);

    public static native String f(JSONObject jSONObject, String str, String str2);

    public static native void g(JSONObject jSONObject, List list);

    public static native List h(List list, ArrayList arrayList, List list2, boolean z);

    public static native List i(ArrayList arrayList);

    public static native J9901552011246808928 j(J9901552011246808928 j9901552011246808928, List list);

    public static native J9901552011246808928 k(J9901552011246808928 j9901552011246808928, String str);

    private static native int kzyyixpsqnwo(Object[] objArr);

    private native void tthxibjvushz();

    public static final class Z11244019023321623390 {
        public final String a;
        public final List b;
        public final List c;

        static {
            izmyclvb.dpqpjfpoanwt1(132);
        }

        private native void zlrmrtvwsupl(String str, List<String> list, List<String> list2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(String str, List<String> list, List<String> list2) {
            str.getClass();
            list.getClass();
            list2.getClass();
            zlrmrtvwsupl(str, list, list2);
        }
    }

    private G11325242167444759799() {
        tthxibjvushz();
    }
}
