package dev.epro.r0;

import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class B6301521529509267707 {
    public static final B6301521529509267707 a;
    public static final SecureRandom b;
    public static final H5336160545165318150 c;

    static {
        int iMagntwbaovne;
        izmyclvb.oeynnivvrnts0(448);
        Object[] objArr = new Object[56];
        while (true) {
            try {
                iMagntwbaovne = magntwbaovne(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iMagntwbaovne != 0) {
                switch (iMagntwbaovne) {
                    case 1:
                        a = (B6301521529509267707) objArr[1];
                        continue;
                    case 2:
                        b = (SecureRandom) objArr[1];
                        continue;
                    case 3:
                        c = (H5336160545165318150) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native boolean a(String str, byte[] bArr);

    public static native boolean b(String str);

    public static native String c(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, String str12);

    public static native /* synthetic */ String d(B6301521529509267707 b6301521529509267707, String str, String str2, int i, String str3, String str4, String str5, String str6, int i2);

    public static native String e();

    public static native boolean f(String... strArr);

    public static native Y8596934373970376627 g(String str, Integer num);

    public static native /* synthetic */ Y8596934373970376627 h(B6301521529509267707 b6301521529509267707, String str);

    public static native void i(byte[] bArr, OutputStream outputStream, String str, int i, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10);

    public static native void j(OutputStream outputStream, byte[] bArr, int i, int i2);

    private static native int magntwbaovne(Object[] objArr);

    private native void siotjxewlkhk();

    private B6301521529509267707() {
        siotjxewlkhk();
    }
}
