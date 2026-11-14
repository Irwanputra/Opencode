package dev.epro.r0;

import android.content.Context;
import dev.epro.r0.I10641435353074925267;
import java.util.Arrays;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class B10298427464076167859 {
    public static final byte[] c;
    public final B13729205492206812220 a;
    public final String b;

    static {
        int iXrjjiiffwdkw;
        izmyclvb.oeynnivvrnts0(424);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iXrjjiiffwdkw = xrjjiiffwdkw(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iXrjjiiffwdkw != 0) {
                switch (iXrjjiiffwdkw) {
                    case 1:
                        c = (byte[]) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void mxuetwqjbdbn(Context context, B13729205492206812220 b13729205492206812220, String str);

    private static native int xrjjiiffwdkw(Object[] objArr);

    public final native Object a(I10641435353074925267.Z11244019023321623390 z11244019023321623390, int i, K14749510448791472029 k14749510448791472029);

    public final native Object b(K14749510448791472029 k14749510448791472029, String str, Map map);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.oeynnivvrnts0(758);
        }

        private native void krtqqmyeaisp(O18369580107802500074 o18369580107802500074);

        private native void vngxiictzelo();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            krtqqmyeaisp(o18369580107802500074);
        }

        private Z11244019023321623390() {
            vngxiictzelo();
        }
    }

    public B10298427464076167859(Context context, B13729205492206812220 b13729205492206812220, String str) {
        context.getClass();
        b13729205492206812220.getClass();
        str.getClass();
        mxuetwqjbdbn(context, b13729205492206812220, str);
    }
}
