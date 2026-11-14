package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class B8744184212717362508 {
    public static final B8744184212717362508 a;
    public static final B8744184212717362508 b;
    public static final B8744184212717362508 c;
    public static final /* synthetic */ B8744184212717362508[] d;

    static {
        int iOevqhedhboha;
        izmyclvb.oeynnivvrnts0(549);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iOevqhedhboha = oevqhedhboha(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iOevqhedhboha != 0) {
                switch (iOevqhedhboha) {
                    case 1:
                        a = (B8744184212717362508) objArr[1];
                        continue;
                    case 2:
                        b = (B8744184212717362508) objArr[1];
                        continue;
                    case 3:
                        c = (B8744184212717362508) objArr[1];
                        continue;
                    case 4:
                        d = (B8744184212717362508[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void ijcmpmqoqarw(String str, int i);

    private static native int oevqhedhboha(Object[] objArr);

    public static native B8744184212717362508 valueOf(String str);

    public static native B8744184212717362508[] values();

    private B8744184212717362508(String str, int i) {
        ijcmpmqoqarw(str, i);
    }
}
