package dev.epro.r0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class F6351115841019446535 {
    public static final F6351115841019446535 a;

    static {
        int iGfizlaijtyqf;
        izmyclvb.dpqpjfpoanwt1(292);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iGfizlaijtyqf = gfizlaijtyqf(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iGfizlaijtyqf != 0) {
                switch (iGfizlaijtyqf) {
                    case 1:
                        a = (F6351115841019446535) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native R2590639056571640352 a(byte[] bArr);

    public static native byte[] b(R2590639056571640352 r2590639056571640352);

    public static native Object c(byte[] bArr, F4096073349764486348 f4096073349764486348);

    public static native String d(DataInputStream dataInputStream);

    public static native void e(DataOutputStream dataOutputStream, String str);

    private static native int gfizlaijtyqf(Object[] objArr);

    private native void hejbgmnaqkwj();

    private F6351115841019446535() {
        hejbgmnaqkwj();
    }
}
