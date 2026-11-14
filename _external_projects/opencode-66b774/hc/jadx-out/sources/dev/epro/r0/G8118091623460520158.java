package dev.epro.r0;

import java.io.OutputStream;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G8118091623460520158 {
    public static final H5336160545165318150 a;
    public static final H5336160545165318150 b;

    static {
        int iVwhlfrrnwikj;
        izmyclvb.dpqpjfpoanwt1(2027);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iVwhlfrrnwikj = vwhlfrrnwikj(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iVwhlfrrnwikj != 0) {
                switch (iVwhlfrrnwikj) {
                    case 1:
                        a = (H5336160545165318150) objArr[1];
                        continue;
                    case 2:
                        b = (H5336160545165318150) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native void a();

    public static final native void b(OutputStream outputStream, String str);

    private static native int vwhlfrrnwikj(Object[] objArr);
}
