package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class B6384073123243656092 {
    public static final B6384073123243656092 b;
    public static final B6384073123243656092 c;
    public static final /* synthetic */ B6384073123243656092[] d;
    public final String a;

    static {
        int vbksnvdugfgi;
        izmyclvb.oeynnivvrnts0(pd.V0);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                vbksnvdugfgi = vbksnvdugfgi(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (vbksnvdugfgi != 0) {
                switch (vbksnvdugfgi) {
                    case 1:
                        b = (B6384073123243656092) objArr[1];
                        continue;
                    case 2:
                        c = (B6384073123243656092) objArr[1];
                        continue;
                    case 3:
                        d = (B6384073123243656092[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void hgocymjuydod(String str, int i, String str2);

    public static native B6384073123243656092 valueOf(String str);

    public static native B6384073123243656092[] values();

    private static native int vbksnvdugfgi(Object[] objArr);

    private B6384073123243656092(String str, int i, String str2) {
        hgocymjuydod(str, i, str2);
    }
}
