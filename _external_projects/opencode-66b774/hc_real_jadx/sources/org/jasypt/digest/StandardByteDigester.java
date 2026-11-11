package org.jasypt.digest;

import java.security.MessageDigest;
import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.digest.config.DigesterConfig;
import org.jasypt.exceptions.AlreadyInitializedException;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.salt.SaltGenerator;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class StandardByteDigester implements ByteDigester {
    public static final String DEFAULT_ALGORITHM = "MD5";
    public static final int DEFAULT_ITERATIONS = 1000;
    public static final int DEFAULT_SALT_SIZE_BYTES = 8;
    private String algorithm = "MD5";
    private int saltSizeBytes = 8;
    private int iterations = 1000;
    private SaltGenerator saltGenerator = null;
    private String providerName = null;
    private Provider provider = null;
    private boolean invertPositionOfSaltInMessageBeforeDigesting = false;
    private boolean invertPositionOfPlainSaltInEncryptionResults = false;
    private boolean useLenientSaltSizeCheck = false;
    private DigesterConfig config = null;
    private boolean algorithmSet = false;
    private boolean saltSizeBytesSet = false;
    private boolean iterationsSet = false;
    private boolean saltGeneratorSet = false;
    private boolean providerNameSet = false;
    private boolean providerSet = false;
    private boolean invertPositionOfSaltInMessageBeforeDigestingSet = false;
    private boolean invertPositionOfPlainSaltInEncryptionResultsSet = false;
    private boolean useLenientSaltSizeCheckSet = false;
    private boolean initialized = false;
    private boolean useSalt = true;
    private MessageDigest md = null;
    private int digestLengthBytes = 0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x005b, LOOP:0: B:12:0x002e->B:14:0x0034, LOOP_END, TryCatch #1 {, blocks: (B:5:0x0003, B:7:0x000a, B:9:0x000e, B:10:0x0015, B:11:0x0027, B:12:0x002e, B:14:0x0034, B:16:0x0042, B:30:0x0019, B:31:0x0024), top: B:4:0x0003, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] digest(byte[] r4, byte[] r5) {
        /*
            r3 = this;
            java.security.MessageDigest r0 = r3.md     // Catch: java.lang.Exception -> L5e
            monitor-enter(r0)     // Catch: java.lang.Exception -> L5e
            java.security.MessageDigest r1 = r3.md     // Catch: java.lang.Throwable -> L5b
            r1.reset()     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L24
            boolean r1 = r3.invertPositionOfSaltInMessageBeforeDigesting     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L19
            java.security.MessageDigest r1 = r3.md     // Catch: java.lang.Throwable -> L5b
            r1.update(r5)     // Catch: java.lang.Throwable -> L5b
            java.security.MessageDigest r1 = r3.md     // Catch: java.lang.Throwable -> L5b
        L15:
            r1.update(r4)     // Catch: java.lang.Throwable -> L5b
            goto L27
        L19:
            java.security.MessageDigest r1 = r3.md     // Catch: java.lang.Throwable -> L5b
            r1.update(r4)     // Catch: java.lang.Throwable -> L5b
            java.security.MessageDigest r4 = r3.md     // Catch: java.lang.Throwable -> L5b
            r4.update(r5)     // Catch: java.lang.Throwable -> L5b
            goto L27
        L24:
            java.security.MessageDigest r1 = r3.md     // Catch: java.lang.Throwable -> L5b
            goto L15
        L27:
            java.security.MessageDigest r4 = r3.md     // Catch: java.lang.Throwable -> L5b
            byte[] r4 = r4.digest()     // Catch: java.lang.Throwable -> L5b
            r1 = 0
        L2e:
            int r2 = r3.iterations     // Catch: java.lang.Throwable -> L5b
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L42
            java.security.MessageDigest r2 = r3.md     // Catch: java.lang.Throwable -> L5b
            r2.reset()     // Catch: java.lang.Throwable -> L5b
            java.security.MessageDigest r2 = r3.md     // Catch: java.lang.Throwable -> L5b
            byte[] r4 = r2.digest(r4)     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 + 1
            goto L2e
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            org.jasypt.salt.SaltGenerator r0 = r3.saltGenerator     // Catch: java.lang.Exception -> L5e
            boolean r0 = r0.includePlainSaltInEncryptionResults()     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L5a
            if (r5 == 0) goto L5a
            boolean r0 = r3.invertPositionOfPlainSaltInEncryptionResults     // Catch: java.lang.Exception -> L5e
            if (r0 != 0) goto L56
            byte[] r4 = org.jasypt.commons.CommonUtils.appendArrays(r5, r4)     // Catch: java.lang.Exception -> L5e
            return r4
        L56:
            byte[] r4 = org.jasypt.commons.CommonUtils.appendArrays(r4, r5)     // Catch: java.lang.Exception -> L5e
        L5a:
            return r4
        L5b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r4     // Catch: java.lang.Exception -> L5e
        L5e:
            org.jasypt.exceptions.EncryptionOperationNotPossibleException r4 = new org.jasypt.exceptions.EncryptionOperationNotPossibleException
            r4.<init>()
            goto L65
        L64:
            throw r4
        L65:
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jasypt.digest.StandardByteDigester.digest(byte[], byte[]):byte[]");
    }

    private static boolean digestsAreEqual(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || bArr2 == null || bArr2.length != (length = bArr.length)) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    public StandardByteDigester cloneDigester() {
        if (!isInitialized()) {
            initialize();
        }
        StandardByteDigester standardByteDigester = new StandardByteDigester();
        if (CommonUtils.isNotEmpty(this.algorithm)) {
            standardByteDigester.setAlgorithm(this.algorithm);
        }
        standardByteDigester.setInvertPositionOfPlainSaltInEncryptionResults(this.invertPositionOfPlainSaltInEncryptionResults);
        standardByteDigester.setInvertPositionOfSaltInMessageBeforeDigesting(this.invertPositionOfSaltInMessageBeforeDigesting);
        standardByteDigester.setIterations(this.iterations);
        Provider provider = this.provider;
        if (provider != null) {
            standardByteDigester.setProvider(provider);
        }
        String str = this.providerName;
        if (str != null) {
            standardByteDigester.setProviderName(str);
        }
        SaltGenerator saltGenerator = this.saltGenerator;
        if (saltGenerator != null) {
            standardByteDigester.setSaltGenerator(saltGenerator);
        }
        standardByteDigester.setSaltSizeBytes(this.saltSizeBytes);
        standardByteDigester.setUseLenientSaltSizeCheck(this.useLenientSaltSizeCheck);
        return standardByteDigester;
    }

    @Override // org.jasypt.digest.ByteDigester
    public byte[] digest(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (!isInitialized()) {
            initialize();
        }
        return digest(bArr, this.useSalt ? this.saltGenerator.generateSalt(this.saltSizeBytes) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void initialize() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jasypt.digest.StandardByteDigester.initialize():void");
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    @Override // org.jasypt.digest.ByteDigester
    public boolean matches(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null) {
            return false;
        }
        if (!isInitialized()) {
            initialize();
        }
        byte[] bArr4 = null;
        try {
            if (this.useSalt) {
                if (this.saltGenerator.includePlainSaltInEncryptionResults()) {
                    int i = this.saltSizeBytes;
                    int i2 = this.digestLengthBytes;
                    if (i2 > 0) {
                        if (this.useLenientSaltSizeCheck) {
                            if (bArr2.length < i2) {
                                throw new EncryptionOperationNotPossibleException();
                            }
                            i = bArr2.length - i2;
                        } else if (bArr2.length != i2 + i) {
                            throw new EncryptionOperationNotPossibleException();
                        }
                    } else if (bArr2.length < i) {
                        throw new EncryptionOperationNotPossibleException();
                    }
                    if (this.invertPositionOfPlainSaltInEncryptionResults) {
                        bArr3 = new byte[i];
                        System.arraycopy(bArr2, bArr2.length - i, bArr3, 0, i);
                    } else {
                        bArr3 = new byte[i];
                        System.arraycopy(bArr2, 0, bArr3, 0, i);
                    }
                    bArr4 = bArr3;
                } else {
                    bArr4 = this.saltGenerator.generateSalt(this.saltSizeBytes);
                }
            }
            return digestsAreEqual(digest(bArr, bArr4), bArr2);
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public synchronized void setAlgorithm(String str) {
        CommonUtils.validateNotEmpty(str, "Algorithm cannot be empty");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.algorithm = str;
        this.algorithmSet = true;
    }

    public synchronized void setConfig(DigesterConfig digesterConfig) {
        CommonUtils.validateNotNull(digesterConfig, "Config cannot be set null");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.config = digesterConfig;
    }

    public synchronized void setInvertPositionOfPlainSaltInEncryptionResults(boolean z) {
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.invertPositionOfPlainSaltInEncryptionResults = z;
        this.invertPositionOfPlainSaltInEncryptionResultsSet = true;
    }

    public synchronized void setInvertPositionOfSaltInMessageBeforeDigesting(boolean z) {
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.invertPositionOfSaltInMessageBeforeDigesting = z;
        this.invertPositionOfSaltInMessageBeforeDigestingSet = true;
    }

    public synchronized void setIterations(int i) {
        CommonUtils.validateIsTrue(i > 0, "Number of iterations must be greater than zero");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.iterations = i;
        this.iterationsSet = true;
    }

    public synchronized void setProvider(Provider provider) {
        CommonUtils.validateNotNull(provider, "Provider cannot be set null");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.provider = provider;
        this.providerSet = true;
    }

    public synchronized void setProviderName(String str) {
        CommonUtils.validateNotNull(str, "Provider name cannot be set null");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.providerName = str;
        this.providerNameSet = true;
    }

    public synchronized void setSaltGenerator(SaltGenerator saltGenerator) {
        CommonUtils.validateNotNull(saltGenerator, "Salt generator cannot be set null");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.saltGenerator = saltGenerator;
        this.saltGeneratorSet = true;
    }

    public synchronized void setSaltSizeBytes(int i) {
        CommonUtils.validateIsTrue(i >= 0, "Salt size in bytes must be non-negative");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.saltSizeBytes = i;
        this.useSalt = i > 0;
        this.saltSizeBytesSet = true;
    }

    public synchronized void setUseLenientSaltSizeCheck(boolean z) {
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.useLenientSaltSizeCheck = z;
        this.useLenientSaltSizeCheckSet = true;
    }
}
