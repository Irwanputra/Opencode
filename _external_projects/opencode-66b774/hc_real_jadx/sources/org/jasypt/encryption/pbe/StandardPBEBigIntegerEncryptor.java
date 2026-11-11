package org.jasypt.encryption.pbe;

import java.math.BigInteger;
import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.pbe.config.PBEConfig;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.salt.SaltGenerator;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class StandardPBEBigIntegerEncryptor implements PBEBigIntegerCleanablePasswordEncryptor {
    private final StandardPBEByteEncryptor byteEncryptor;

    public StandardPBEBigIntegerEncryptor() {
        this.byteEncryptor = new StandardPBEByteEncryptor();
    }

    private StandardPBEBigIntegerEncryptor(StandardPBEByteEncryptor standardPBEByteEncryptor) {
        this.byteEncryptor = standardPBEByteEncryptor;
    }

    public synchronized StandardPBEBigIntegerEncryptor[] cloneAndInitializeEncryptor(int i) {
        StandardPBEBigIntegerEncryptor[] standardPBEBigIntegerEncryptorArr;
        StandardPBEByteEncryptor[] cloneAndInitializeEncryptor = this.byteEncryptor.cloneAndInitializeEncryptor(i);
        standardPBEBigIntegerEncryptorArr = new StandardPBEBigIntegerEncryptor[i];
        standardPBEBigIntegerEncryptorArr[0] = this;
        for (int i2 = 1; i2 < i; i2++) {
            standardPBEBigIntegerEncryptorArr[i2] = new StandardPBEBigIntegerEncryptor(cloneAndInitializeEncryptor[i2]);
        }
        return standardPBEBigIntegerEncryptorArr;
    }

    @Override // org.jasypt.encryption.BigIntegerEncryptor
    public BigInteger decrypt(BigInteger bigInteger) {
        if (bigInteger == null) {
            return null;
        }
        try {
            return new BigInteger(this.byteEncryptor.decrypt(NumberUtils.processBigIntegerEncryptedByteArray(bigInteger.toByteArray(), bigInteger.signum())));
        } catch (EncryptionInitializationException e) {
            throw e;
        } catch (EncryptionOperationNotPossibleException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    @Override // org.jasypt.encryption.BigIntegerEncryptor
    public BigInteger encrypt(BigInteger bigInteger) {
        if (bigInteger == null) {
            return null;
        }
        try {
            byte[] encrypt = this.byteEncryptor.encrypt(bigInteger.toByteArray());
            return new BigInteger(CommonUtils.appendArrays(encrypt, NumberUtils.byteArrayFromInt(encrypt.length)));
        } catch (EncryptionInitializationException e) {
            throw e;
        } catch (EncryptionOperationNotPossibleException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public void initialize() {
        this.byteEncryptor.initialize();
    }

    public boolean isInitialized() {
        return this.byteEncryptor.isInitialized();
    }

    public void setAlgorithm(String str) {
        this.byteEncryptor.setAlgorithm(str);
    }

    public void setConfig(PBEConfig pBEConfig) {
        this.byteEncryptor.setConfig(pBEConfig);
    }

    public void setKeyObtentionIterations(int i) {
        this.byteEncryptor.setKeyObtentionIterations(i);
    }

    @Override // org.jasypt.encryption.pbe.PasswordBased
    public void setPassword(String str) {
        this.byteEncryptor.setPassword(str);
    }

    @Override // org.jasypt.encryption.pbe.CleanablePasswordBased
    public void setPasswordCharArray(char[] cArr) {
        this.byteEncryptor.setPasswordCharArray(cArr);
    }

    public void setProvider(Provider provider) {
        this.byteEncryptor.setProvider(provider);
    }

    public void setProviderName(String str) {
        this.byteEncryptor.setProviderName(str);
    }

    public void setSaltGenerator(SaltGenerator saltGenerator) {
        this.byteEncryptor.setSaltGenerator(saltGenerator);
    }
}
