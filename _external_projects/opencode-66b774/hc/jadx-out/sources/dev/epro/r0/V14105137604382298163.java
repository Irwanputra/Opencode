package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V14105137604382298163 {
    public static final Set a;
    public static final Set b;

    static {
        int iRtggxmqohvfi;
        izmyclvb.qgayjvbiagej2(2195);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iRtggxmqohvfi = rtggxmqohvfi(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iRtggxmqohvfi != 0) {
                switch (iRtggxmqohvfi) {
                    case 1:
                        a = (Set) objArr[1];
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

    public static final native void a(String str, K14749510448791472029 k14749510448791472029);

    public static final native Object b(String str, G5865513469313204166 g5865513469313204166, F4096073349764486348 f4096073349764486348, K14749510448791472029 k14749510448791472029);

    private static native int rtggxmqohvfi(Object[] objArr);
}
