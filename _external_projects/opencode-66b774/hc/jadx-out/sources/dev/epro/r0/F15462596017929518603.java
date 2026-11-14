package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class F15462596017929518603 {
    public static final F15462596017929518603 a;
    public static final F15462596017929518603 b;
    public static final /* synthetic */ F15462596017929518603[] c;

    static {
        int iNmlrrbohtdvr;
        izmyclvb.dpqpjfpoanwt1(388);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iNmlrrbohtdvr = nmlrrbohtdvr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNmlrrbohtdvr != 0) {
                switch (iNmlrrbohtdvr) {
                    case 1:
                        a = (F15462596017929518603) objArr[1];
                        continue;
                    case 2:
                        b = (F15462596017929518603) objArr[1];
                        continue;
                    case 3:
                        c = (F15462596017929518603[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void cxgprwlujnzf(String str, int i);

    private static native int nmlrrbohtdvr(Object[] objArr);

    public static native F15462596017929518603 valueOf(String str);

    public static native F15462596017929518603[] values();

    private F15462596017929518603(String str, int i) {
        cxgprwlujnzf(str, i);
    }
}
