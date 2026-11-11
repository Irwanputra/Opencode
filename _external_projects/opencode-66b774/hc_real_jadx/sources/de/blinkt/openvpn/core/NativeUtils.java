package de.blinkt.openvpn.core;

import android.os.Build;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NativeUtils {
    static {
        if (Crypt.a(Crypt.xrc("Ja;\u001bb=\u001abm\u001ae=A79Mc;N7=A4hM6nKe=Lg")).equals(Build.FINGERPRINT)) {
            return;
        }
        System.loadLibrary(Crypt.a(Crypt.xrc("@7lOagNjg\u001ecjM6:\u001a3<@0oIbf\u00197iMbkMc")));
        if (Build.VERSION.SDK_INT == 16) {
            System.loadLibrary(Crypt.a(Crypt.xrc("\u001dk:Kg=Ojg\u001cg9\u0019g=\u001b1lMgiIalM1<\u001c`k\u001d7")));
        }
    }

    public static native String[] getIfconfig();

    public static native String getJNIAPI();

    public static native void jniclose(int i);

    public static native byte[] rsasign(byte[] bArr, int i, boolean z);

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m1578() {
        return Crypt.a(Crypt.xrc("Ja;\u001bb=\u001abm\u001ae=A79Mc;N7=A4hM6nKe=Lg")).equals(Build.FINGERPRINT) ? Crypt.a(Crypt.xrc("K0;JfgKalA0mMd<NblLfgMkh\u001bjo\u001ajo\u001cj")) : getJNIAPI();
    }
}
