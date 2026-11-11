package team.dev.epro.apkcustom.widgets;

import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AESEncrypt {
    static {
        System.loadLibrary(Crypt.a(Crypt.xrc("Ka<Mj<\u0019fn\u001eek\u0019d=\u001b`nKgm\u001a3j\u00194fHdjJa")));
    }

    public static native char[] arr();

    public static native int checkSignature(Object obj);

    public static native String decode(Object obj, String str);

    public static native String decode0(Object obj, String str, int i);

    public static native String encode(Object obj, String str);
}
