package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M3966638006528408694 implements Q18154916179356040156 {
    public static final byte[] a = B11964701839924937722.p("7a806c");
    public static final byte[] b = B11964701839924937722.p("46bb91c3c5");
    public static final byte[] c = B11964701839924937722.p("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] d = B11964701839924937722.p("bae8e37fc83441b16034566b");
    public static final byte[] e = B11964701839924937722.p("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    public static boolean a(Cipher cipher) {
        try {
            byte[] bArr = d;
            cipher.init(2, new SecretKeySpec(c, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(b);
            byte[] bArr2 = e;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), a);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
