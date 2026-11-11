package org.jasypt.encryption.pbe;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.pbe.config.PBEConfig;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.salt.SaltGenerator;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class StandardPBEBigDecimalEncryptor implements PBEBigDecimalCleanablePasswordEncryptor {
    private final StandardPBEByteEncryptor byteEncryptor;

    public StandardPBEBigDecimalEncryptor() {
        this.byteEncryptor = new StandardPBEByteEncryptor();
    }

    private StandardPBEBigDecimalEncryptor(StandardPBEByteEncryptor standardPBEByteEncryptor) {
        this.byteEncryptor = standardPBEByteEncryptor;
    }

    public synchronized StandardPBEBigDecimalEncryptor[] cloneAndInitializeEncryptor(int i) {
        StandardPBEBigDecimalEncryptor[] standardPBEBigDecimalEncryptorArr;
        StandardPBEByteEncryptor[] cloneAndInitializeEncryptor = this.byteEncryptor.cloneAndInitializeEncryptor(i);
        standardPBEBigDecimalEncryptorArr = new StandardPBEBigDecimalEncryptor[i];
        standardPBEBigDecimalEncryptorArr[0] = this;
        for (int i2 = 1; i2 < i; i2++) {
            standardPBEBigDecimalEncryptorArr[i2] = new StandardPBEBigDecimalEncryptor(cloneAndInitializeEncryptor[i2]);
        }
        return standardPBEBigDecimalEncryptorArr;
    }

    @Override // org.jasypt.encryption.BigDecimalEncryptor
    public BigDecimal decrypt(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        try {
            return new BigDecimal(new BigInteger(this.byteEncryptor.decrypt(NumberUtils.processBigIntegerEncryptedByteArray(bigDecimal.unscaledValue().toByteArray(), bigDecimal.signum()))), bigDecimal.scale());
        } catch (EncryptionInitializationException e) {
            throw e;
        } catch (EncryptionOperationNotPossibleException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    @Override // org.jasypt.encryption.BigDecimalEncryptor
    public BigDecimal encrypt(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        try {
            int scale = bigDecimal.scale();
            byte[] encrypt = this.byteEncryptor.encrypt(bigDecimal.unscaledValue().toByteArray());
            return new BigDecimal(new BigInteger(CommonUtils.appendArrays(encrypt, NumberUtils.byteArrayFromInt(encrypt.length))), scale);
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
