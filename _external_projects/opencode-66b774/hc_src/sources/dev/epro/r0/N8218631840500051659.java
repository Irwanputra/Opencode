package dev.epro.r0;

import java.security.SecureRandom;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class N8218631840500051659 {
    public static final N8218631840500051659 a;
    public static final char[] b;
    public static final char[] c;

    static {
        int lrhsmzznbort;
        izmyclvb.dpqpjfpoanwt1(1021);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                lrhsmzznbort = lrhsmzznbort(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (lrhsmzznbort != 0) {
                switch (lrhsmzznbort) {
                    case 1:
                        a = (N8218631840500051659) objArr[1];
                        continue;
                    case 2:
                        b = (char[]) objArr[1];
                        continue;
                    case 3:
                        c = (char[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int lrhsmzznbort(Object[] objArr);

    private native void qkercgcdbnhc();

    public final native String a(String str, String str2);

    public final native String b(int i, SecureRandom secureRandom);

    private N8218631840500051659() {
        qkercgcdbnhc();
    }
}
