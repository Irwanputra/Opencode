package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class I4983914851516402973 {
    public static final I4983914851516402973 b;
    public static final I4983914851516402973 c;
    public static final I4983914851516402973 d;
    public static final /* synthetic */ I4983914851516402973[] e;
    public final int a;

    static {
        int iRsdlwgwjgflp;
        izmyclvb.dpqpjfpoanwt1(1045);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iRsdlwgwjgflp = rsdlwgwjgflp(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iRsdlwgwjgflp != 0) {
                switch (iRsdlwgwjgflp) {
                    case 1:
                        b = (I4983914851516402973) objArr[1];
                        continue;
                    case 2:
                        c = (I4983914851516402973) objArr[1];
                        continue;
                    case 3:
                        d = (I4983914851516402973) objArr[1];
                        continue;
                    case 4:
                        e = (I4983914851516402973[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void gtlodkaxvxay(String str, int i, int i2);

    private static native int rsdlwgwjgflp(Object[] objArr);

    public static native I4983914851516402973 valueOf(String str);

    public static native I4983914851516402973[] values();

    private I4983914851516402973(String str, int i, int i2) {
        gtlodkaxvxay(str, i, i2);
    }
}
