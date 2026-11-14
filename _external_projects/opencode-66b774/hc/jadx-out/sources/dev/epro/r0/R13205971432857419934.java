package dev.epro.r0;

import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class R13205971432857419934 {
    public static final Z11244019023321623390 f;
    public final String a;
    public final String b;
    public final RSAPublicKey c;
    public final int d;
    public final boolean e;

    static {
        int iZeqdtkqtgikt;
        izmyclvb.qgayjvbiagej2(1182);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iZeqdtkqtgikt = zeqdtkqtgikt(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iZeqdtkqtgikt != 0) {
                switch (iZeqdtkqtgikt) {
                    case 1:
                        f = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void capomjkwxweq(String str, String str2, RSAPublicKey rSAPublicKey, int i, boolean z, O18369580107802500074 o18369580107802500074);

    private native void owcloulfqqcb(String str, String str2, RSAPublicKey rSAPublicKey, int i, boolean z);

    private static native int zeqdtkqtgikt(Object[] objArr);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(2161);
        }

        public static native R13205971432857419934 a(String str, E13520742018712329785 e13520742018712329785);

        private native void ilmzfyvuvvta(O18369580107802500074 o18369580107802500074);

        private native void wowidihnhbfx();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            ilmzfyvuvvta(o18369580107802500074);
        }

        private Z11244019023321623390() {
            wowidihnhbfx();
        }
    }

    private R13205971432857419934(String str, String str2, RSAPublicKey rSAPublicKey, int i, boolean z) {
        owcloulfqqcb(str, str2, rSAPublicKey, i, z);
    }

    public /* synthetic */ R13205971432857419934(String str, String str2, RSAPublicKey rSAPublicKey, int i, boolean z, O18369580107802500074 o18369580107802500074) {
        this(str, str2, rSAPublicKey, i, z);
        capomjkwxweq(str, str2, rSAPublicKey, i, z, o18369580107802500074);
    }
}
