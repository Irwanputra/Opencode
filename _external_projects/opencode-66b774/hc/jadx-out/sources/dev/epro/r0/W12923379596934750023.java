package dev.epro.r0;

import java.net.URL;
import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W12923379596934750023 {
    public static final Set a;

    static {
        int iJvoglmgmxfan;
        izmyclvb.qgayjvbiagej2(1446);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iJvoglmgmxfan = jvoglmgmxfan(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iJvoglmgmxfan != 0) {
                switch (iJvoglmgmxfan) {
                    case 1:
                        a = (Set) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native boolean a(String str);

    public static final native String b(URL url, String str);

    private static native int jvoglmgmxfan(Object[] objArr);
}
