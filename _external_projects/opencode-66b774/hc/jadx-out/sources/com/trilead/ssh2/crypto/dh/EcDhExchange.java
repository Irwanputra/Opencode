package com.trilead.ssh2.crypto.dh;

import com.trilead.ssh2.signature.ECDSAKeyAlgorithm;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3383101362411723454;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyAgreement;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class EcDhExchange extends GenericDhExchange {
    private ECPrivateKey clientPrivate;
    private ECPublicKey clientPublic;
    private ECDSAKeyAlgorithm ecdsKeyAlgorithm;
    private ECPublicKey serverPublic;

    public static ECDSAKeyAlgorithm getVerifierForKey(ECKey eCKey) {
        int fieldSize = eCKey.getParams().getCurve().getField().getFieldSize();
        if (fieldSize == 256) {
            return new ECDSAKeyAlgorithm.ECDSASha2Nistp256();
        }
        if (fieldSize == 384) {
            return new ECDSAKeyAlgorithm.ECDSASha2Nistp384();
        }
        if (fieldSize != 521) {
            return null;
        }
        return new ECDSAKeyAlgorithm.ECDSASha2Nistp521();
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public byte[] getE() {
        return ECDSAKeyAlgorithm.encodePoint(this.clientPublic.getW(), this.clientPublic.getParams().getCurve());
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public String getHashAlgo() {
        return ECDSAKeyAlgorithm.getDigestAlgorithmForParams(this.clientPublic);
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public byte[] getServerE() {
        return ECDSAKeyAlgorithm.encodePoint(this.serverPublic.getW(), this.serverPublic.getParams().getCurve());
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public void init(String str) throws IOException {
        ECParameterSpec ecParameterSpec;
        str.getClass();
        switch (str) {
            case "ecdh-sha2-nistp256":
                ECDSAKeyAlgorithm.ECDSASha2Nistp256 eCDSASha2Nistp256 = new ECDSAKeyAlgorithm.ECDSASha2Nistp256();
                this.ecdsKeyAlgorithm = eCDSASha2Nistp256;
                ecParameterSpec = eCDSASha2Nistp256.getEcParameterSpec();
                break;
            case "ecdh-sha2-nistp384":
                ECDSAKeyAlgorithm.ECDSASha2Nistp384 eCDSASha2Nistp384 = new ECDSAKeyAlgorithm.ECDSASha2Nistp384();
                this.ecdsKeyAlgorithm = eCDSASha2Nistp384;
                ecParameterSpec = eCDSASha2Nistp384.getEcParameterSpec();
                break;
            case "ecdh-sha2-nistp521":
                ECDSAKeyAlgorithm.ECDSASha2Nistp521 eCDSASha2Nistp521 = new ECDSAKeyAlgorithm.ECDSASha2Nistp521();
                this.ecdsKeyAlgorithm = eCDSASha2Nistp521;
                ecParameterSpec = eCDSASha2Nistp521.getEcParameterSpec();
                break;
            default:
                S10973172697741180971.j("Unknown EC curve ".concat(str));
                return;
        }
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(ecParameterSpec);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            this.clientPrivate = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
            this.clientPublic = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        } catch (InvalidAlgorithmParameterException e) {
            Z3383101362411723454.q("Invalid DH parameters", e);
        } catch (NoSuchAlgorithmException e2) {
            Z3383101362411723454.q("No DH keypair generator", e2);
        }
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public void setF(byte[] bArr) throws IOException {
        if (this.clientPublic == null) {
            S10973172697741180971.m("EcDhExchange not initialized!");
            return;
        }
        try {
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("EC");
                ECDSAKeyAlgorithm verifierForKey = getVerifierForKey(this.clientPublic);
                if (verifierForKey == null) {
                    throw new IOException("No such EC group");
                }
                ECParameterSpec ecParameterSpec = verifierForKey.getEcParameterSpec();
                this.serverPublic = (ECPublicKey) keyFactory.generatePublic(new ECPublicKeySpec(ECDSAKeyAlgorithm.decodePoint(bArr, ecParameterSpec.getCurve()), ecParameterSpec));
                KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                keyAgreement.init(this.clientPrivate);
                keyAgreement.doPhase(this.serverPublic, true);
                this.sharedSecret = new BigInteger(1, keyAgreement.generateSecret());
            } catch (NoSuchAlgorithmException e) {
                Z3383101362411723454.q("No ECDH key agreement method", e);
            }
        } catch (InvalidKeyException | InvalidKeySpecException e2) {
            Z3383101362411723454.q("Invalid ECDH key", e2);
        }
    }
}
