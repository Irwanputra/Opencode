package dev.epro.r0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class W10767647038824692228 {
    public static final Set b;
    public static final Set c;
    public static final LinkedHashSet d;
    public final JSONObject a;

    static {
        int iMldniazyuwvh;
        izmyclvb.qgayjvbiagej2(1059);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iMldniazyuwvh = mldniazyuwvh(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iMldniazyuwvh != 0) {
                switch (iMldniazyuwvh) {
                    case 1:
                        b = (Set) objArr[1];
                        continue;
                    case 2:
                        c = (Set) objArr[1];
                        continue;
                    case 3:
                        d = (LinkedHashSet) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void efsddmxuyguk(JSONObject jSONObject);

    private static native int mldniazyuwvh(Object[] objArr);

    public final native String a(String str);

    public final native int b(String str);

    public final native String c(String str);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(1255);
        }

        private native void jvzmfxvegcym(O18369580107802500074 o18369580107802500074);

        private native void kpfnknpdxgkb();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            jvzmfxvegcym(o18369580107802500074);
        }

        private Z11244019023321623390() {
            kpfnknpdxgkb();
        }
    }

    public W10767647038824692228(JSONObject jSONObject) {
        jSONObject.getClass();
        efsddmxuyguk(jSONObject);
    }
}
