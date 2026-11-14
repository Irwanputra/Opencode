package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class J14738216854556830558 {
    public static final J14738216854556830558 a;
    public static final Set b;

    static {
        int iUmaxeryvzzjs;
        izmyclvb.dpqpjfpoanwt1(895);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iUmaxeryvzzjs = umaxeryvzzjs(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iUmaxeryvzzjs != 0) {
                switch (iUmaxeryvzzjs) {
                    case 1:
                        a = (J14738216854556830558) objArr[1];
                        continue;
                    case 2:
                        b = (Set) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native boolean a(String str);

    private static native int umaxeryvzzjs(Object[] objArr);

    private native void ziikbcqbarbl();

    private J14738216854556830558() {
        ziikbcqbarbl();
    }
}
