package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Y2471352605761100623 {
    public static final List a;

    static {
        int iNuhvdmsyrlls;
        izmyclvb.qgayjvbiagej2(558);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iNuhvdmsyrlls = nuhvdmsyrlls(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNuhvdmsyrlls != 0) {
                switch (iNuhvdmsyrlls) {
                    case 1:
                        a = (List) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native Object a(List list, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122203, F4096073349764486348 f40960733497644863482);

    public static native Object b(B13729205492206812220 b13729205492206812220, D2443437645761252362 d2443437645761252362, int i);

    private static native int nuhvdmsyrlls(Object[] objArr);
}
