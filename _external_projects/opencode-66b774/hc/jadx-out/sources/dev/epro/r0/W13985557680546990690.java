package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class W13985557680546990690 {
    public static final Z11244019023321623390 c;
    public static final Set d;
    public final String a;
    public final String b;

    static {
        int iNfczqkbetogb;
        izmyclvb.qgayjvbiagej2(778);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iNfczqkbetogb = nfczqkbetogb(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNfczqkbetogb != 0) {
                switch (iNfczqkbetogb) {
                    case 1:
                        c = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        d = (Set) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int nfczqkbetogb(Object[] objArr);

    private native void yjbrktcbvdsa(String str, String str2);

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(2116);
        }

        public static native W13985557680546990690 a(JSONObject jSONObject);

        private native void ayzotzmnjnsf();

        private native void inqzdqegeaau(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            inqzdqegeaau(o18369580107802500074);
        }

        private Z11244019023321623390() {
            ayzotzmnjnsf();
        }
    }

    public W13985557680546990690(String str, String str2) {
        str.getClass();
        str2.getClass();
        yjbrktcbvdsa(str, str2);
    }
}
