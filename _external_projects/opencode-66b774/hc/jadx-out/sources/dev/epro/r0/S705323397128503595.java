package dev.epro.r0;

import android.content.Context;
import dev.epro.r0.L941116477899640873;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class S705323397128503595 {
    public static final Z11244019023321623390 d;
    public final F5424571050510598400 a;
    public final J12043550928838212009 b;
    public final J12043550928838212009 c;

    public static final class Y11460403151847909905 implements J12043550928838212009 {
        public final /* synthetic */ J12043550928838212009 a;
        public final /* synthetic */ L941116477899640873.Z11244019023321623390 b;

        static {
            izmyclvb.qgayjvbiagej2(625);
        }

        private native void bspfqponicpc(J12043550928838212009 j12043550928838212009, L941116477899640873.Z11244019023321623390 z11244019023321623390);

        @Override // dev.epro.r0.J12043550928838212009
        public final native Object collect(S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294);

        public Y11460403151847909905(J12043550928838212009 j12043550928838212009, L941116477899640873.Z11244019023321623390 z11244019023321623390) {
            this.a = j12043550928838212009;
            this.b = z11244019023321623390;
            bspfqponicpc(j12043550928838212009, z11244019023321623390);
        }
    }

    public static final class Y6921797927338498306 implements J12043550928838212009 {
        public final /* synthetic */ J12043550928838212009 a;

        static {
            izmyclvb.qgayjvbiagej2(320);
        }

        private native void vdvceaczwgve(J12043550928838212009 j12043550928838212009);

        @Override // dev.epro.r0.J12043550928838212009
        public final native Object collect(S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294);

        public Y6921797927338498306(J12043550928838212009 j12043550928838212009) {
            this.a = j12043550928838212009;
            vdvceaczwgve(j12043550928838212009);
        }
    }

    static {
        int iTjhhbrxhgxwe;
        izmyclvb.qgayjvbiagej2(734);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iTjhhbrxhgxwe = tjhhbrxhgxwe(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iTjhhbrxhgxwe != 0) {
                switch (iTjhhbrxhgxwe) {
                    case 1:
                        d = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void dhaebsfafnev(Context context);

    private static native int tjhhbrxhgxwe(Object[] objArr);

    public final native Object a(K14749510448791472029 k14749510448791472029, F4096073349764486348 f4096073349764486348, String str, String str2);

    public final native J12043550928838212009 b(J12043550928838212009 j12043550928838212009);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(2092);
        }

        private native void dsqnujtbtloi(O18369580107802500074 o18369580107802500074);

        private native void snxggtkvyrsq();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            dsqnujtbtloi(o18369580107802500074);
        }

        private Z11244019023321623390() {
            snxggtkvyrsq();
        }
    }

    public S705323397128503595(Context context) {
        context.getClass();
        dhaebsfafnev(context);
    }
}
