package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class O16805348006866119786 {
    public static final O16805348006866119786 e;
    public static final /* synthetic */ O16805348006866119786[] f;
    public static final /* synthetic */ M665231115116566295 g;
    public final String a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    static {
        int rmtpdwxuczxz;
        izmyclvb.dpqpjfpoanwt1(2232);
        Object[] objArr = new Object[19];
        while (true) {
            try {
                rmtpdwxuczxz = rmtpdwxuczxz(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (rmtpdwxuczxz != 0) {
                switch (rmtpdwxuczxz) {
                    case 1:
                        e = (O16805348006866119786) objArr[1];
                        continue;
                    case 2:
                        f = (O16805348006866119786[]) objArr[1];
                        continue;
                    case 3:
                        g = (M665231115116566295) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void jbhvaaepswcy(String str, int i, String str2, String str3, byte[] bArr, byte[] bArr2);

    private static native int rmtpdwxuczxz(Object[] objArr);

    public static native O16805348006866119786 valueOf(String str);

    public static native O16805348006866119786[] values();

    private O16805348006866119786(String str, int i, String str2, String str3, byte[] bArr, byte[] bArr2) {
        jbhvaaepswcy(str, i, str2, str3, bArr, bArr2);
    }
}
