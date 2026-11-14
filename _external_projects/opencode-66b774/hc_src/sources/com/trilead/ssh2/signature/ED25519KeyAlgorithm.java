package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.CertificateDecoder;
import dev.epro.r0.C9142879380583651391;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.T17032536773975598836;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSASecurityProvider;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class ED25519KeyAlgorithm extends KeyAlgorithm<EdDSAPublicKey, EdDSAPrivateKey> {
    private static final String ED25519_CURVE_NAME = "Ed25519";
    private static final String ED25519_KEY_NAME = "ssh-ed25519";

    public ED25519KeyAlgorithm() {
        super("NoneWithEdDSA", ED25519_KEY_NAME, EdDSAPrivateKey.class, new EdDSASecurityProvider());
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public EdDSAPublicKey decodePublicKey(byte[] bArr) {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals(ED25519_KEY_NAME)) {
            Q11088980322693754445.h("Invalid key type");
            return null;
        }
        byte[] c = c9142879380583651391.c();
        if (c9142879380583651391.j() == 0) {
            return new EdDSAPublicKey(new EdDSAPublicKeySpec(c, EdDSANamedCurveTable.getByName("Ed25519")));
        }
        Q11088980322693754445.h("Unexpected padding in public key");
        return null;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals(ED25519_KEY_NAME)) {
            Q11088980322693754445.h("Invalid signature format");
            return null;
        }
        byte[] c = c9142879380583651391.c();
        if (c9142879380583651391.j() == 0) {
            return c;
        }
        Q11088980322693754445.h("Unexpected padding in signature");
        return null;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodePublicKey(EdDSAPublicKey edDSAPublicKey) {
        byte[] abyte = edDSAPublicKey.getAbyte();
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t(ED25519_KEY_NAME);
        t17032536773975598836.s(0, abyte, abyte.length);
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) {
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t(ED25519_KEY_NAME);
        t17032536773975598836.s(0, bArr, bArr.length);
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public List<CertificateDecoder> getCertificateDecoders() {
        return Collections.singletonList(new OpenSshCertificateDecoder(ED25519_KEY_NAME) { // from class: com.trilead.ssh2.signature.ED25519KeyAlgorithm.1
            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
            public KeyPair generateKeyPair(C9142879380583651391 c9142879380583651391) {
                EdDSANamedCurveSpec byName = EdDSANamedCurveTable.getByName("Ed25519");
                byte[] c = c9142879380583651391.c();
                byte[] c2 = c9142879380583651391.c();
                EdDSAPublicKeySpec edDSAPublicKeySpec = new EdDSAPublicKeySpec(c, byName);
                EdDSAPrivateKeySpec edDSAPrivateKeySpec = new EdDSAPrivateKeySpec(Arrays.copyOfRange(c2, 0, 32), byName);
                KeyFactory keyFactory = KeyFactory.getInstance("EdDSA", new EdDSASecurityProvider());
                return new KeyPair(keyFactory.generatePublic(edDSAPublicKeySpec), keyFactory.generatePrivate(edDSAPrivateKeySpec));
            }
        });
    }
}
