package dev.epro.r0;

import android.content.Context;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class C17395215706123916034 {
    public static final Z11244019023321623390 c;
    public final F5424571050510598400 a;
    public final J12043550928838212009 b;

    public static final class Y6921797927338498306 implements J12043550928838212009 {
        public final /* synthetic */ J12043550928838212009 a;
        public final /* synthetic */ Z11244019023321623390 b;

        static {
            izmyclvb.oeynnivvrnts0(437);
        }

        private native void fbwmrzxobmbm(J12043550928838212009 j12043550928838212009, Z11244019023321623390 z11244019023321623390);

        @Override // dev.epro.r0.J12043550928838212009
        public final native Object collect(S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294);

        public Y6921797927338498306(J12043550928838212009 j12043550928838212009, Z11244019023321623390 z11244019023321623390) {
            this.a = j12043550928838212009;
            this.b = z11244019023321623390;
            fbwmrzxobmbm(j12043550928838212009, z11244019023321623390);
        }
    }

    static {
        int iBdyyclxztapm;
        izmyclvb.oeynnivvrnts0(953);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iBdyyclxztapm = bdyyclxztapm(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iBdyyclxztapm != 0) {
                switch (iBdyyclxztapm) {
                    case 1:
                        c = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int bdyyclxztapm(Object[] objArr);

    private native void jqscrmbycojj(Context context);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.oeynnivvrnts0(1032);
        }

        private native void jqgbjirkpqiv(O18369580107802500074 o18369580107802500074);

        private native void lfibrlduifio();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            jqgbjirkpqiv(o18369580107802500074);
        }

        private Z11244019023321623390() {
            lfibrlduifio();
        }
    }

    public C17395215706123916034(Context context) {
        context.getClass();
        jqscrmbycojj(context);
    }
}
