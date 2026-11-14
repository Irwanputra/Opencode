package dev.epro.r0;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class O3688991224633979391 {
    public static final O3688991224633979391 a;

    static {
        int iLcsydhrpbsle;
        izmyclvb.dpqpjfpoanwt1(603);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iLcsydhrpbsle = lcsydhrpbsle(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iLcsydhrpbsle != 0) {
                switch (iLcsydhrpbsle) {
                    case 1:
                        a = (O3688991224633979391) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native boolean a(String str, byte[] bArr);

    public static native List b(String str, OutputStream outputStream, R2199163221789731147 r2199163221789731147, AtomicInteger atomicInteger, L10135580317894902847 l10135580317894902847);

    private static native int lcsydhrpbsle(Object[] objArr);

    private native void mxrkgzqitxon();

    private O3688991224633979391() {
        mxrkgzqitxon();
    }
}
