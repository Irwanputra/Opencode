package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class L13107047504285157635 {
    public static final L13107047504285157635 a;
    public static final L13107047504285157635 b;
    public static final /* synthetic */ L13107047504285157635[] c;

    static {
        int iAgeipjryfozj;
        izmyclvb.dpqpjfpoanwt1(1134);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iAgeipjryfozj = ageipjryfozj(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iAgeipjryfozj != 0) {
                switch (iAgeipjryfozj) {
                    case 1:
                        a = (L13107047504285157635) objArr[1];
                        continue;
                    case 2:
                        b = (L13107047504285157635) objArr[1];
                        continue;
                    case 3:
                        c = (L13107047504285157635[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int ageipjryfozj(Object[] objArr);

    private native void kthgnaggdqxg(String str, int i);

    public static native L13107047504285157635 valueOf(String str);

    public static native L13107047504285157635[] values();

    private L13107047504285157635(String str, int i) {
        kthgnaggdqxg(str, i);
    }
}
