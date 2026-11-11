package org.jasypt.digest;

import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.digest.config.DigesterConfig;
import org.jasypt.exceptions.AlreadyInitializedException;
import org.jasypt.salt.SaltGenerator;

/* loaded from: /tmp/opencode/hc_real.dex */
public class PooledByteDigester implements ByteDigester {
    private StandardByteDigester[] pool;
    private DigesterConfig config = null;
    private int poolSize = 0;
    private boolean poolSizeSet = false;
    private int roundRobin = 0;
    private boolean initialized = false;
    private final StandardByteDigester firstDigester = new StandardByteDigester();

    @Override // org.jasypt.digest.ByteDigester
    public byte[] digest(byte[] bArr) {
        int i;
        if (!isInitialized()) {
            initialize();
        }
        synchronized (this) {
            i = this.roundRobin;
            this.roundRobin = (i + 1) % this.poolSize;
        }
        return this.pool[i].digest(bArr);
    }

    public synchronized void initialize() {
        int i;
        if (!this.initialized) {
            DigesterConfig digesterConfig = this.config;
            if (digesterConfig != null) {
                Integer poolSize = digesterConfig.getPoolSize();
                if (!this.poolSizeSet && poolSize != null) {
                    i = poolSize.intValue();
                    this.poolSize = i;
                }
                i = this.poolSize;
                this.poolSize = i;
            }
            int i2 = this.poolSize;
            if (i2 <= 0) {
                throw new IllegalArgumentException("Pool size must be set and > 0");
            }
            StandardByteDigester[] standardByteDigesterArr = new StandardByteDigester[i2];
            this.pool = standardByteDigesterArr;
            standardByteDigesterArr[0] = this.firstDigester;
            for (int i3 = 1; i3 < this.poolSize; i3++) {
                StandardByteDigester[] standardByteDigesterArr2 = this.pool;
                standardByteDigesterArr2[i3] = standardByteDigesterArr2[i3 - 1].cloneDigester();
            }
            this.initialized = true;
        }
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    @Override // org.jasypt.digest.ByteDigester
    public boolean matches(byte[] bArr, byte[] bArr2) {
        int i;
        if (!isInitialized()) {
            initialize();
        }
        synchronized (this) {
            i = this.roundRobin;
            this.roundRobin = (i + 1) % this.poolSize;
        }
        return this.pool[i].matches(bArr, bArr2);
    }

    public synchronized void setAlgorithm(String str) {
        this.firstDigester.setAlgorithm(str);
    }

    public synchronized void setConfig(DigesterConfig digesterConfig) {
        this.firstDigester.setConfig(digesterConfig);
        this.config = digesterConfig;
    }

    public synchronized void setInvertPositionOfPlainSaltInEncryptionResults(boolean z) {
        this.firstDigester.setInvertPositionOfPlainSaltInEncryptionResults(z);
    }

    public synchronized void setInvertPositionOfSaltInMessageBeforeDigesting(boolean z) {
        this.firstDigester.setInvertPositionOfSaltInMessageBeforeDigesting(z);
    }

    public synchronized void setIterations(int i) {
        this.firstDigester.setIterations(i);
    }

    public synchronized void setPoolSize(int i) {
        CommonUtils.validateIsTrue(i > 0, "Pool size be > 0");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.poolSize = i;
        this.poolSizeSet = true;
    }

    public synchronized void setProvider(Provider provider) {
        this.firstDigester.setProvider(provider);
    }

    public synchronized void setProviderName(String str) {
        this.firstDigester.setProviderName(str);
    }

    public synchronized void setSaltGenerator(SaltGenerator saltGenerator) {
        this.firstDigester.setSaltGenerator(saltGenerator);
    }

    public synchronized void setSaltSizeBytes(int i) {
        this.firstDigester.setSaltSizeBytes(i);
    }

    public synchronized void setUseLenientSaltSizeCheck(boolean z) {
        this.firstDigester.setUseLenientSaltSizeCheck(z);
    }
}
