package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class G7321729298444823400 {
    public static final G7321729298444823400 a;
    public static final /* synthetic */ G7321729298444823400[] b;

    static {
        int bakhspxmitxt;
        izmyclvb.dpqpjfpoanwt1(2174);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                bakhspxmitxt = bakhspxmitxt(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (bakhspxmitxt != 0) {
                switch (bakhspxmitxt) {
                    case 1:
                        a = (G7321729298444823400) objArr[1];
                        continue;
                    case 2:
                        b = (G7321729298444823400[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int bakhspxmitxt(Object[] objArr);

    public static native G7321729298444823400 valueOf(String str);

    public static native G7321729298444823400[] values();

    private native void vchaguuyliwu(String str, int i);

    private G7321729298444823400(String str, int i) {
        vchaguuyliwu(str, i);
    }
}
