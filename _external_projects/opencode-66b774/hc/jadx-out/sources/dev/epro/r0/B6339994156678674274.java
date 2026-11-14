package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract class B6339994156678674274 {
    public static final R8003785900637483151 a;
    public static final R8003785900637483151 b;

    static {
        int iGfeypmzeckss;
        izmyclvb.oeynnivvrnts0(767);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iGfeypmzeckss = gfeypmzeckss(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iGfeypmzeckss != 0) {
                switch (iGfeypmzeckss) {
                    case 1:
                        a = (R8003785900637483151) objArr[1];
                        continue;
                    case 2:
                        b = (R8003785900637483151) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native void a(String str);

    private static native int gfeypmzeckss(Object[] objArr);
}
