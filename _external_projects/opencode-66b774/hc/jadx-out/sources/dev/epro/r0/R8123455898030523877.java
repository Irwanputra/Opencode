package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class R8123455898030523877 {
    public static final List a;

    static {
        int iWamecxjlrsrz;
        izmyclvb.qgayjvbiagej2(672);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iWamecxjlrsrz = wamecxjlrsrz(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iWamecxjlrsrz != 0) {
                switch (iWamecxjlrsrz) {
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

    public static final native boolean a(Exception exc, boolean z);

    private static native int wamecxjlrsrz(Object[] objArr);
}
