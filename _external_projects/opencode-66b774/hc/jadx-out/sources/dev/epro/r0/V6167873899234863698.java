package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class V6167873899234863698 {
    public static final Z11244019023321623390 m;
    public static final Set n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final LinkedHashSet f547o;
    public final List a;
    public final byte[] b;
    public final T4926175550138300278 c;
    public final Map d;
    public final Integer e;
    public final boolean f;
    public final int g;
    public final long h;
    public final String i;
    public final List j;
    public final int k;
    public final S1985039337943195993 l;

    static {
        int iXzphhdruazon;
        izmyclvb.qgayjvbiagej2(1473);
        Object[] objArr = new Object[15];
        while (true) {
            try {
                iXzphhdruazon = xzphhdruazon(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iXzphhdruazon != 0) {
                switch (iXzphhdruazon) {
                    case 1:
                        m = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        n = (Set) objArr[1];
                        continue;
                    case 3:
                        f547o = (LinkedHashSet) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean, int] */
    public /* synthetic */ V6167873899234863698(List list, byte[] bArr, T4926175550138300278 t4926175550138300278, Map map, Integer num, boolean z, int i, long j, String str, List list2, int i2, S1985039337943195993 s1985039337943195993, int i3, O18369580107802500074 o18369580107802500074) {
        Object[] objArrXektrjpirqzc = xektrjpirqzc(list, bArr, t4926175550138300278, map, num, z, i, j, str, list2, i2, s1985039337943195993, i3, o18369580107802500074);
        this((List) objArrXektrjpirqzc[0], (byte[]) objArrXektrjpirqzc[1], (T4926175550138300278) objArrXektrjpirqzc[2], (Map) objArrXektrjpirqzc[3], (Integer) objArrXektrjpirqzc[4], ((Integer) objArrXektrjpirqzc[5]).intValue(), ((Integer) objArrXektrjpirqzc[6]).intValue(), ((Long) objArrXektrjpirqzc[7]).longValue(), (String) objArrXektrjpirqzc[8], (List) objArrXektrjpirqzc[9], ((Integer) objArrXektrjpirqzc[10]).intValue(), (S1985039337943195993) objArrXektrjpirqzc[11]);
        sqhipzkykada();
    }

    private native void sqhipzkykada();

    private native void vnssscwuokok(List<? extends J17212163343241671962> list, byte[] bArr, T4926175550138300278 t4926175550138300278, Map<String, T4926175550138300278> map, Integer num, boolean z, int i, long j, String str, List<W13985557680546990690> list2, int i2, S1985039337943195993 s1985039337943195993);

    private static native Object[] xektrjpirqzc(List list, byte[] bArr, T4926175550138300278 t4926175550138300278, Map map, Integer num, boolean z, int i, long j, String str, List list2, int i2, S1985039337943195993 s1985039337943195993, int i3, O18369580107802500074 o18369580107802500074);

    private static native int xzphhdruazon(Object[] objArr);

    public final native String a();

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(pd.T0);
        }

        public static native Integer a(JSONObject jSONObject);

        public static native V6167873899234863698 b(String str);

        public static native void c(String str, Set set, JSONObject jSONObject);

        public static native V6167873899234863698 d(JSONObject jSONObject);

        private native void daheeshkxmnx();

        private native void erxymdiifafm(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            erxymdiifafm(o18369580107802500074);
        }

        private Z11244019023321623390() {
            daheeshkxmnx();
        }
    }

    public V6167873899234863698(List<? extends J17212163343241671962> list, byte[] bArr, T4926175550138300278 t4926175550138300278, Map<String, T4926175550138300278> map, Integer num, boolean z, int i, long j, String str, List<W13985557680546990690> list2, int i2, S1985039337943195993 s1985039337943195993) {
        list.getClass();
        bArr.getClass();
        t4926175550138300278.getClass();
        map.getClass();
        str.getClass();
        list2.getClass();
        vnssscwuokok(list, bArr, t4926175550138300278, map, num, z, i, j, str, list2, i2, s1985039337943195993);
    }
}
