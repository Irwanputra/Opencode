package dev.epro.r0;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G15739123543877306217 implements Q18154916179356040156 {
    public static final byte[] a = B11964701839924937722.p("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] b = B11964701839924937722.p("070000004041424344454647");
    public static final byte[] c = B11964701839924937722.p("a0784d7a4716f3feb4f64e7f4b39bf04");

    public static Cipher a() {
        Cipher cipher = (Cipher) W8357658991043002609.b.a.a("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(b);
            byte[] bArr = a;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = c;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        W4415201450379021245.c("JCE does not support algorithm: ChaCha20-Poly1305");
        return null;
    }
}
