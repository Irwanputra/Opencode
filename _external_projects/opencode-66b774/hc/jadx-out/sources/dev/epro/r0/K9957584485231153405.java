package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class K9957584485231153405 {
    public static final K9957584485231153405 b;
    public static final /* synthetic */ K9957584485231153405[] c;
    public static final /* synthetic */ M665231115116566295 d;
    public final String a;

    static {
        int iQtstuzdnwour;
        izmyclvb.dpqpjfpoanwt1(2095);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iQtstuzdnwour = qtstuzdnwour(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iQtstuzdnwour != 0) {
                switch (iQtstuzdnwour) {
                    case 1:
                        b = (K9957584485231153405) objArr[1];
                        continue;
                    case 2:
                        c = (K9957584485231153405[]) objArr[1];
                        continue;
                    case 3:
                        d = (M665231115116566295) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int qtstuzdnwour(Object[] objArr);

    private native void rwnixhwkhzyt(String str, int i, String str2);

    public static native K9957584485231153405 valueOf(String str);

    public static native K9957584485231153405[] values();

    private K9957584485231153405(String str, int i, String str2) {
        rwnixhwkhzyt(str, i, str2);
    }
}
