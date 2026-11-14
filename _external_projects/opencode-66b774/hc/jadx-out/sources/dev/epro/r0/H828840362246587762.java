package dev.epro.r0;

import android.net.VpnService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class H828840362246587762 {
    public static final H828840362246587762 a;

    static {
        int iXoizxuvptvpr;
        izmyclvb.dpqpjfpoanwt1(271);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iXoizxuvptvpr = xoizxuvptvpr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iXoizxuvptvpr != 0) {
                switch (iXoizxuvptvpr) {
                    case 1:
                        a = (H828840362246587762) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native Z11244019023321623390 a(VpnService.Builder builder, Map map, JSONObject jSONObject, String str, String str2, boolean z, List list, List list2, boolean z2);

    public static native void b(Y6921797927338498306 y6921797927338498306, String str);

    public static native void c(int i, List list);

    private static native int xoizxuvptvpr(Object[] objArr);

    private native void ztwjfrbchlfn();

    public static final class Y6921797927338498306 {
        public final T3330755843074931369 a;
        public final T3330755843074931369 b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;
        public final ArrayList f;

        static {
            izmyclvb.dpqpjfpoanwt1(1887);
        }

        private native void jihqhoylkugr(T3330755843074931369 t3330755843074931369, T3330755843074931369 t33307558430749313692);

        public final native void a(int i, String str, boolean z);

        public Y6921797927338498306(T3330755843074931369 t3330755843074931369, T3330755843074931369 t33307558430749313692) {
            t3330755843074931369.getClass();
            jihqhoylkugr(t3330755843074931369, t33307558430749313692);
        }
    }

    public static final class Z11244019023321623390 {
        public final int a;
        public final int b;

        static {
            izmyclvb.dpqpjfpoanwt1(991);
        }

        private native void rsinqdwbwxpf(int i, int i2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(int i, int i2) {
            rsinqdwbwxpf(i, i2);
        }
    }

    private H828840362246587762() {
        ztwjfrbchlfn();
    }
}
