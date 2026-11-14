package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K4700945099601341370 {
    public static final Set a;

    static {
        int iZccuwaqbxjno;
        izmyclvb.dpqpjfpoanwt1(2008);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iZccuwaqbxjno = zccuwaqbxjno(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iZccuwaqbxjno != 0) {
                switch (iZccuwaqbxjno) {
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

    public static final native boolean b(String str);

    private static native int zccuwaqbxjno(Object[] objArr);
}
