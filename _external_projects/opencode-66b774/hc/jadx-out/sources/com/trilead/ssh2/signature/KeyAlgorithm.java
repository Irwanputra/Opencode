package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.CertificateDecoder;
import dev.epro.r0.Z3383101362411723454;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class KeyAlgorithm<U extends PublicKey, R extends PrivateKey> {
    private final String keyFormat;
    private final Class<R> keyType;
    private final Provider provider;
    private final String signatureAlgorithm;

    public KeyAlgorithm(String str, String str2, Class<R> cls, Provider provider) {
        this.signatureAlgorithm = str;
        this.keyFormat = str2;
        this.keyType = cls;
        this.provider = provider;
    }

    public abstract PublicKey decodePublicKey(byte[] bArr);

    public abstract byte[] decodeSignature(byte[] bArr);

    public abstract byte[] encodePublicKey(U u);

    public abstract byte[] encodeSignature(byte[] bArr);

    public byte[] generateSignature(byte[] bArr, R r, SecureRandom secureRandom) throws IOException {
        try {
            Provider provider = this.provider;
            String str = this.signatureAlgorithm;
            Signature signature = provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
            signature.initSign(r, secureRandom);
            signature.update(bArr);
            return signature.sign();
        } catch (GeneralSecurityException e) {
            Z3383101362411723454.q("Could not generate signature", e);
            return null;
        }
    }

    public abstract List<CertificateDecoder> getCertificateDecoders();

    public String getKeyFormat() {
        return this.keyFormat;
    }

    public boolean supportsKey(PrivateKey privateKey) {
        return this.keyType.isAssignableFrom(privateKey.getClass());
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, U u) throws IOException {
        try {
            Provider provider = this.provider;
            String str = this.signatureAlgorithm;
            Signature signature = provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
            signature.initVerify(u);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (GeneralSecurityException e) {
            Z3383101362411723454.q("Could not verify signature", e);
            return false;
        }
    }

    public KeyAlgorithm(String str, String str2, Class<R> cls) {
        this(str, str2, cls, null);
    }
}
