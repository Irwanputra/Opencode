package net.i2p.crypto.eddsa;

import dev.epro.r0.G6547577305291411977;
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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class KeyPairGenerator extends KeyPairGeneratorSpi {
    private static final int DEFAULT_KEYSIZE = 256;
    private static final Hashtable<Integer, AlgorithmParameterSpec> edParameters;
    private EdDSAParameterSpec edParams;
    private boolean initialized;
    private SecureRandom random;

    static {
        Hashtable<Integer, AlgorithmParameterSpec> hashtable = new Hashtable<>();
        edParameters = hashtable;
        hashtable.put(Integer.valueOf(DEFAULT_KEYSIZE), new EdDSAGenParameterSpec(EdDSANamedCurveTable.ED_25519));
    }

    public EdDSANamedCurveSpec createNamedCurveSpec(String str) throws InvalidAlgorithmParameterException {
        EdDSANamedCurveSpec byName = EdDSANamedCurveTable.getByName(str);
        if (byName != null) {
            return byName;
        }
        throw new InvalidAlgorithmParameterException(G6547577305291411977.C("unknown curve name: ", str));
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialized) {
            initialize(DEFAULT_KEYSIZE, new SecureRandom());
        }
        byte[] bArr = new byte[this.edParams.getCurve().getField().getb() / 8];
        this.random.nextBytes(bArr);
        EdDSAPrivateKeySpec edDSAPrivateKeySpec = new EdDSAPrivateKeySpec(bArr, this.edParams);
        return new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(edDSAPrivateKeySpec.getA(), this.edParams)), new EdDSAPrivateKey(edDSAPrivateKeySpec));
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof EdDSAParameterSpec) {
            this.edParams = (EdDSAParameterSpec) algorithmParameterSpec;
        } else {
            if (!(algorithmParameterSpec instanceof EdDSAGenParameterSpec)) {
                throw new InvalidAlgorithmParameterException("parameter object not a EdDSAParameterSpec");
            }
            this.edParams = createNamedCurveSpec(((EdDSAGenParameterSpec) algorithmParameterSpec).getName());
        }
        this.random = secureRandom;
        this.initialized = true;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec = edParameters.get(Integer.valueOf(i));
        if (algorithmParameterSpec != null) {
            try {
                initialize(algorithmParameterSpec, secureRandom);
                return;
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key type not configurable.");
            }
        }
        throw new InvalidParameterException("unknown key type.");
    }
}
