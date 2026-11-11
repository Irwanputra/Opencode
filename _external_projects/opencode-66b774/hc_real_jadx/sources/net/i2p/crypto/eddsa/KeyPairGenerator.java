package net.i2p.crypto.eddsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import net.i2p.crypto.eddsa.spec.EdDSAGenParameterSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAParameterSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class KeyPairGenerator extends KeyPairGeneratorSpi {
    private static final int DEFAULT_KEYSIZE = 256;
    private static final Hashtable<Integer, AlgorithmParameterSpec> edParameters;
    private EdDSAParameterSpec edParams;
    private boolean initialized;
    private SecureRandom random;

    static {
        Hashtable<Integer, AlgorithmParameterSpec> hashtable = new Hashtable<>();
        edParameters = hashtable;
        hashtable.put(256, new EdDSAGenParameterSpec(EdDSANamedCurveTable.ED_25519));
    }

    public EdDSANamedCurveSpec createNamedCurveSpec(String str) {
        EdDSANamedCurveSpec byName = EdDSANamedCurveTable.getByName(str);
        if (byName != null) {
            return byName;
        }
        throw new InvalidAlgorithmParameterException(C2098.m4205("unknown curve name: ", str));
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialized) {
            initialize(256, new SecureRandom());
        }
        byte[] bArr = new byte[this.edParams.getCurve().getField().getb() / 8];
        this.random.nextBytes(bArr);
        EdDSAPrivateKeySpec edDSAPrivateKeySpec = new EdDSAPrivateKeySpec(bArr, this.edParams);
        return new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(edDSAPrivateKeySpec.getA(), this.edParams)), new EdDSAPrivateKey(edDSAPrivateKeySpec));
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec = edParameters.get(Integer.valueOf(i));
        if (algorithmParameterSpec == null) {
            throw new InvalidParameterException("unknown key type.");
        }
        try {
            initialize(algorithmParameterSpec, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("key type not configurable.");
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        EdDSAParameterSpec createNamedCurveSpec;
        if (algorithmParameterSpec instanceof EdDSAParameterSpec) {
            createNamedCurveSpec = (EdDSAParameterSpec) algorithmParameterSpec;
        } else {
            if (!(algorithmParameterSpec instanceof EdDSAGenParameterSpec)) {
                throw new InvalidAlgorithmParameterException("parameter object not a EdDSAParameterSpec");
            }
            createNamedCurveSpec = createNamedCurveSpec(((EdDSAGenParameterSpec) algorithmParameterSpec).getName());
        }
        this.edParams = createNamedCurveSpec;
        this.random = secureRandom;
        this.initialized = true;
    }
}
