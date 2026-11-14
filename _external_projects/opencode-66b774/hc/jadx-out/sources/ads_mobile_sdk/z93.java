package ads_mobile_sdk;

import dev.epro.r0.V4416135141588678913;
import dev.epro.r0.X17419789831805662092;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class z93 {
    public static final Charset a = StandardCharsets.UTF_8;
    public static Cipher b = null;
    public static final Object c = new Object();
    public static final Object d = new Object();

    public static byte[] a(String str, byte[] bArr) {
        byte[] bArrDoFinal;
        if (bArr.length != 16) {
            throw new X17419789831805662092();
        }
        try {
            byte[] bArrF = V4416135141588678913.f(str, false);
            if (bArrF.length <= 16) {
                throw new X17419789831805662092();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length);
            byteBufferAllocate.put(bArrF);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArrF.length - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (c) {
                a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = a().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new X17419789831805662092(e);
        }
    }

    public static Cipher a() {
        Cipher cipher;
        synchronized (d) {
            try {
                cipher = b;
                if (cipher == null) {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    b = cipher;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
