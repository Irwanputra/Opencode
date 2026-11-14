package dev.epro.r0;

import android.content.Context;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes4.dex */
public final class Z6379685802376252086 {
    public static final Z11244019023321623390 b;
    public static final List c;
    public final F5424571050510598400 a;

    static {
        int iXjkgixqxipxm;
        izmyclvb.qbtpmwoxbgtw3(11);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iXjkgixqxipxm = xjkgixqxipxm(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iXjkgixqxipxm != 0) {
                switch (iXjkgixqxipxm) {
                    case 1:
                        b = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        c = (List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void hnhjvtqchngy(Context context);

    private static native int xjkgixqxipxm(Object[] objArr);

    public final native Serializable a(K14749510448791472029 k14749510448791472029);

    public final native Object b(J17212163343241671962 j17212163343241671962, K14749510448791472029 k14749510448791472029);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qbtpmwoxbgtw3(37);
        }

        private native void mwtwvrplxyzu();

        private native void rkvdvkeebmxy(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            rkvdvkeebmxy(o18369580107802500074);
        }

        private Z11244019023321623390() {
            mwtwvrplxyzu();
        }
    }

    public Z6379685802376252086(Context context) {
        context.getClass();
        hnhjvtqchngy(context);
    }
}
