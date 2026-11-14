package dev.epro.r0;

import java.security.PrivateKey;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;
import javax.crypto.spec.OAEPParameterSpec;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class E5538123785991428492 {
    public static final E5538123785991428492 a;
    public static final OAEPParameterSpec b;
    public static final PSSParameterSpec c;

    static {
        int vuhmsqepstoy;
        izmyclvb.oeynnivvrnts0(858);
        Object[] objArr = new Object[13];
        while (true) {
            try {
                vuhmsqepstoy = vuhmsqepstoy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (vuhmsqepstoy != 0) {
                switch (vuhmsqepstoy) {
                    case 1:
                        a = (E5538123785991428492) objArr[1];
                        continue;
                    case 2:
                        b = (OAEPParameterSpec) objArr[1];
                        continue;
                    case 3:
                        c = (PSSParameterSpec) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native byte[] a(PrivateKey privateKey, byte[] bArr);

    public static native byte[] b(PrivateKey privateKey, byte[] bArr, boolean z);

    private native void hsxfcqepcwqh();

    private static native int vuhmsqepstoy(Object[] objArr);

    private E5538123785991428492() {
        hsxfcqepcwqh();
    }
}
