package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class I17576634997632380939 {
    public static final I17576634997632380939 a;
    public static final Set b;

    static {
        int iRlavvbxftvgr;
        izmyclvb.dpqpjfpoanwt1(199);
        Object[] objArr = new Object[10];
        while (true) {
            try {
                iRlavvbxftvgr = rlavvbxftvgr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iRlavvbxftvgr != 0) {
                switch (iRlavvbxftvgr) {
                    case 1:
                        a = (I17576634997632380939) objArr[1];
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

    private native void icggklbvqrfu();

    private static native int rlavvbxftvgr(Object[] objArr);

    private I17576634997632380939() {
        icggklbvqrfu();
    }
}
