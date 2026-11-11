package xyz.easypro.ecrypt.utils;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class Crypt {
    static {
        System.loadLibrary(a.c("&\u0018\u0082ÈüÈ\u0001"));
    }

    public static String a(String str) {
        byte[] bArr;
        try {
            if (str.length() < 1) {
                bArr = null;
            } else {
                bArr = new byte[str.length() / 2];
                for (int i = 0; i < str.length() / 2; i++) {
                    int i2 = i * 2;
                    int i3 = i2 + 1;
                    bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
                }
            }
            return new String(easyCrypt(bArr), xrc("-\u0006\u0019Uj"));
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static native int[] arrInt();

    public static native byte[] easyCrypt(byte[] bArr);

    public static native byte[] load(byte[] bArr);

    public static native String xrc(String str);
}
