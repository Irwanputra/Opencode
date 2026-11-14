package dev.epro.r0;

import android.content.Context;
import java.io.Serializable;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class C3778441172258343986 {
    public static final byte c;
    public final F5424571050510598400 a;
    public final H15186625828076266306 b;

    static {
        int iSkmlthxhkafp;
        izmyclvb.oeynnivvrnts0(753);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iSkmlthxhkafp = skmlthxhkafp(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iSkmlthxhkafp != 0) {
                switch (iSkmlthxhkafp) {
                    case 1:
                        c = ((Byte) objArr[1]).byteValue();
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void bvpghonzvujn(Context context);

    private static native int skmlthxhkafp(Object[] objArr);

    public final native Serializable a(K14749510448791472029 k14749510448791472029);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.oeynnivvrnts0(42);
        }

        private native void dzzoxjgyvlfh(O18369580107802500074 o18369580107802500074);

        private native void yogjyzyrbngg();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            dzzoxjgyvlfh(o18369580107802500074);
        }

        private Z11244019023321623390() {
            yogjyzyrbngg();
        }
    }

    public C3778441172258343986(Context context) {
        context.getClass();
        bvpghonzvujn(context);
    }
}
