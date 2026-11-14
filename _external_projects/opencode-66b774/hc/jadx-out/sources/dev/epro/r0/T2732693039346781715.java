package dev.epro.r0;

import android.content.Intent;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class T2732693039346781715 {
    public static final T2732693039346781715 a;

    static {
        int iNblnjwulgncu;
        izmyclvb.qgayjvbiagej2(93);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iNblnjwulgncu = nblnjwulgncu(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNblnjwulgncu != 0) {
                switch (iNblnjwulgncu) {
                    case 1:
                        a = (T2732693039346781715) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native LinkedHashSet a(Map map, T13614432975881747224 t13614432975881747224);

    public static native LinkedHashMap b(Intent intent, String str, boolean z);

    public static native LinkedHashMap c(K6255634571546489463 k6255634571546489463, String str, boolean z, boolean z2);

    public static native Map d(Map map, Map map2, T13614432975881747224 t13614432975881747224, boolean z);

    public static native String e(String str, String str2, Set set, Set set2);

    public static native boolean f(String str);

    public static native int g(int i);

    public static native JSONObject h(String str);

    private static native int nblnjwulgncu(Object[] objArr);

    private native void psorzkjvtrop();

    private T2732693039346781715() {
        psorzkjvtrop();
    }
}
