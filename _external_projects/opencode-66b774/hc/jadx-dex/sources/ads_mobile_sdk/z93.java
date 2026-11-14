package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class z93 {
    public static final java.nio.charset.Charset a = java.nio.charset.StandardCharsets.UTF_8;
    public static javax.crypto.Cipher b = null;
    public static final java.lang.Object c = new java.lang.Object();
    public static final java.lang.Object d = new java.lang.Object();

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.X17419789831805662092 */
    public static byte[] a(java.lang.String str, byte[] bArr) throws dev.epro.r0.X17419789831805662092 {
        byte[] bArrDoFinal;
        if (bArr.length != 16) {
            throw new dev.epro.r0.X17419789831805662092();
        }
        try {
            byte[] bArrF = dev.epro.r0.V4416135141588678913.f(str, false);
            if (bArrF.length <= 16) {
                throw new dev.epro.r0.X17419789831805662092();
            }
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bArrF.length);
            byteBufferAllocate.put(bArrF);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArrF.length - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
            synchronized (c) {
                a().init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr2));
                bArrDoFinal = a().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (java.lang.IllegalArgumentException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            throw new dev.epro.r0.X17419789831805662092(e);
        }
    }

    public static javax.crypto.Cipher a() {
        javax.crypto.Cipher cipher;
        synchronized (d) {
            try {
                cipher = b;
                if (cipher == null) {
                    cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
                    b = cipher;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
