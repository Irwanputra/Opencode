package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class M310145413173941529 {
    public static final M310145413173941529 b;
    public static final M310145413173941529 c;
    public static final M310145413173941529 d;
    public static final /* synthetic */ M310145413173941529[] e;
    public static final /* synthetic */ M665231115116566295 f;
    public final int a;

    static {
        int malannvehtrf;
        izmyclvb.dpqpjfpoanwt1(1241);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                malannvehtrf = malannvehtrf(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (malannvehtrf != 0) {
                switch (malannvehtrf) {
                    case 1:
                        b = (M310145413173941529) objArr[1];
                        continue;
                    case 2:
                        c = (M310145413173941529) objArr[1];
                        continue;
                    case 3:
                        d = (M310145413173941529) objArr[1];
                        continue;
                    case 4:
                        e = (M310145413173941529[]) objArr[1];
                        continue;
                    case 5:
                        f = (M665231115116566295) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void hwptyhnrjmbf(String str, int i, int i2);

    private static native int malannvehtrf(Object[] objArr);

    public static native M310145413173941529 valueOf(String str);

    public static native M310145413173941529[] values();

    private M310145413173941529(String str, int i, int i2) {
        hwptyhnrjmbf(str, i, i2);
    }
}
