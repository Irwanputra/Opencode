package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class X8178024650992698151 {
    public static final X8178024650992698151 a;
    public static final X8178024650992698151 b;
    public static final X8178024650992698151 c;
    public static final /* synthetic */ X8178024650992698151[] d;

    static {
        int iXitrdnjktmso;
        izmyclvb.qgayjvbiagej2(1953);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iXitrdnjktmso = xitrdnjktmso(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iXitrdnjktmso != 0) {
                switch (iXitrdnjktmso) {
                    case 1:
                        a = (X8178024650992698151) objArr[1];
                        continue;
                    case 2:
                        b = (X8178024650992698151) objArr[1];
                        continue;
                    case 3:
                        c = (X8178024650992698151) objArr[1];
                        continue;
                    case 4:
                        d = (X8178024650992698151[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void cmmmcsbqjddm(String str, int i);

    public static native X8178024650992698151 valueOf(String str);

    public static native X8178024650992698151[] values();

    private static native int xitrdnjktmso(Object[] objArr);

    private X8178024650992698151(String str, int i) {
        cmmmcsbqjddm(str, i);
    }
}
