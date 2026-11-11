.class public final Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/encryption/pbe/PBEByteCleanablePasswordEncryptor;


# static fields
.field public static final DEFAULT_ALGORITHM:Ljava/lang/String; = "PBEWithMD5AndDES"

.field public static final DEFAULT_KEY_OBTENTION_ITERATIONS:I = 0x3e8

.field public static final DEFAULT_SALT_SIZE_BYTES:I = 0x8


# instance fields
.field private algorithm:Ljava/lang/String;

.field private algorithmSet:Z

.field private config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

.field private decryptCipher:Ljavax/crypto/Cipher;

.field private encryptCipher:Ljavax/crypto/Cipher;

.field private fixedSaltInUse:[B

.field private initialized:Z

.field private iterationsSet:Z

.field private key:Ljavax/crypto/SecretKey;

.field private keyObtentionIterations:I

.field private password:[C

.field private passwordSet:Z

.field private provider:Ljava/security/Provider;

.field private providerName:Ljava/lang/String;

.field private providerNameSet:Z

.field private providerSet:Z

.field private saltGenerator:Lorg/jasypt/salt/SaltGenerator;

.field private saltGeneratorSet:Z

.field private saltSizeBytes:I

.field private usingFixedSalt:Z


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "PBEWithMD5AndDES"

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->provider:Ljava/security/Provider;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->password:[C

    const/16 v1, 0x3e8

    iput v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->keyObtentionIterations:I

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    const/16 v1, 0x8

    iput v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltSizeBytes:I

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithmSet:Z

    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->passwordSet:Z

    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->iterationsSet:Z

    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGeneratorSet:Z

    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerNameSet:Z

    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerSet:Z

    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialized:Z

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->key:Ljavax/crypto/SecretKey;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decryptCipher:Ljavax/crypto/Cipher;

    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->usingFixedSalt:Z

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->fixedSaltInUse:[B

    return-void
.end method

.method private static cleanPassword([C)V
    .registers 4

    if-eqz p0, :cond_12

    monitor-enter p0

    :try_start_3
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v0, :cond_d

    aput-char v1, p0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_d
    monitor-exit p0

    goto :goto_12

    :catchall_f
    move-exception v0

    monitor-exit p0
    :try_end_11
    .catchall {:try_start_3 .. :try_end_11} :catchall_f

    throw v0

    :cond_12
    :goto_12
    return-void
.end method

.method private handleInvalidKeyException(Ljava/security/InvalidKeyException;)V
    .registers 3

    invoke-virtual {p1}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {p1}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "KEY SIZE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_18

    goto :goto_20

    :cond_18
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    const-string v0, "Encryption raised an exception. A possible cause is you are using strong encryption algorithms and you have not installed the Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files in this Java Virtual Machine"

    invoke-direct {p1, v0}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_20
    :goto_20
    return-void
.end method

.method private declared-synchronized resolveConfigurationPassword()V
    .registers 6

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialized:Z

    if-nez v0, :cond_4d

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    if-eqz v0, :cond_4d

    iget-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->passwordSet:Z

    if-nez v1, :cond_4d

    const/4 v1, 0x0

    instance-of v2, v0, Lorg/jasypt/encryption/pbe/config/PBECleanablePasswordConfig;

    if-eqz v2, :cond_19

    check-cast v0, Lorg/jasypt/encryption/pbe/config/PBECleanablePasswordConfig;

    invoke-interface {v0}, Lorg/jasypt/encryption/pbe/config/PBECleanablePasswordConfig;->getPasswordCharArray()[C

    move-result-object v1

    goto :goto_23

    :cond_19
    invoke-interface {v0}, Lorg/jasypt/encryption/pbe/config/PBEConfig;->getPassword()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    :cond_23
    :goto_23
    const/4 v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_32

    array-length v3, v1

    if-lez v3, :cond_2c

    const/4 v3, 0x1

    goto :goto_2d

    :cond_2c
    const/4 v3, 0x0

    :goto_2d
    const-string v4, "Password cannot be set empty"

    invoke-static {v3, v4}, Lorg/jasypt/commons/CommonUtils;->validateIsTrue(ZLjava/lang/String;)V

    :cond_32
    if-eqz v1, :cond_42

    array-length v3, v1

    new-array v3, v3, [C

    iput-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->password:[C

    array-length v4, v1

    invoke-static {v1, v2, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->passwordSet:Z

    invoke-static {v1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->cleanPassword([C)V

    :cond_42
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    instance-of v1, v0, Lorg/jasypt/encryption/pbe/config/PBECleanablePasswordConfig;

    if-eqz v1, :cond_4d

    check-cast v0, Lorg/jasypt/encryption/pbe/config/PBECleanablePasswordConfig;

    invoke-interface {v0}, Lorg/jasypt/encryption/pbe/config/PBECleanablePasswordConfig;->cleanPassword()V
    :try_end_4d
    .catchall {:try_start_1 .. :try_end_4d} :catchall_4f

    :cond_4d
    monitor-exit p0

    return-void

    :catchall_4f
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized cloneAndInitializeEncryptor(I)[Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;
    .registers 7

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_57

    invoke-direct {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->resolveConfigurationPassword()V

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->password:[C

    array-length v1, v0

    new-array v1, v1, [C

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialize()V

    new-array v0, p1, [Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    aput-object p0, v0, v3

    const/4 v2, 0x1

    :goto_1c
    if-ge v2, p1, :cond_52

    new-instance v3, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-direct {v3}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;-><init>()V

    invoke-virtual {v3, v1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setPasswordCharArray([C)V

    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    invoke-static {v4}, Lorg/jasypt/commons/CommonUtils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_33

    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setAlgorithm(Ljava/lang/String;)V

    :cond_33
    iget v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->keyObtentionIterations:I

    invoke-virtual {v3, v4}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setKeyObtentionIterations(I)V

    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->provider:Ljava/security/Provider;

    if-eqz v4, :cond_3f

    invoke-virtual {v3, v4}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setProvider(Ljava/security/Provider;)V

    :cond_3f
    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerName:Ljava/lang/String;

    if-eqz v4, :cond_46

    invoke-virtual {v3, v4}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setProviderName(Ljava/lang/String;)V

    :cond_46
    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    if-eqz v4, :cond_4d

    invoke-virtual {v3, v4}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    :cond_4d
    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1c

    :cond_52
    invoke-static {v1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->cleanPassword([C)V
    :try_end_55
    .catchall {:try_start_1 .. :try_end_55} :catchall_5f

    monitor-exit p0

    return-object v0

    :cond_57
    :try_start_57
    new-instance p1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v0, "Cannot clone encryptor if it has been already initialized"

    invoke-direct {p1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5f
    .catchall {:try_start_57 .. :try_end_5f} :catchall_5f

    :catchall_5f
    move-exception p1

    monitor-exit p0

    goto :goto_63

    :goto_62
    throw p1

    :goto_63
    goto :goto_62
.end method

.method public decrypt([B)[B
    .registers 8

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialize()V

    :cond_d
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    invoke-interface {v0}, Lorg/jasypt/salt/SaltGenerator;->includePlainSaltInEncryptionResults()Z

    move-result v0

    if-eqz v0, :cond_21

    array-length v0, p1

    iget v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltSizeBytes:I

    if-le v0, v1, :cond_1b

    goto :goto_21

    :cond_1b
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :cond_21
    :goto_21
    :try_start_21
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    invoke-interface {v0}, Lorg/jasypt/salt/SaltGenerator;->includePlainSaltInEncryptionResults()Z

    move-result v0

    if-eqz v0, :cond_4b

    iget v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltSizeBytes:I

    array-length v1, p1

    if-ge v0, v1, :cond_30

    move v1, v0

    goto :goto_31

    :cond_30
    array-length v1, p1

    :goto_31
    array-length v2, p1

    if-ge v0, v2, :cond_36

    move v2, v0

    goto :goto_37

    :cond_36
    array-length v2, p1

    :goto_37
    array-length v3, p1

    const/4 v4, 0x0

    if-ge v0, v3, :cond_3e

    array-length v3, p1

    sub-int/2addr v3, v0

    goto :goto_3f

    :cond_3e
    const/4 v3, 0x0

    :goto_3f
    new-array v0, v1, [B

    new-array v5, v3, [B

    invoke-static {p1, v4, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1, v2, v5, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v5

    goto :goto_5a

    :cond_4b
    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->usingFixedSalt:Z

    if-nez v0, :cond_58

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    iget v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltSizeBytes:I

    invoke-interface {v0, v1}, Lorg/jasypt/salt/SaltGenerator;->generateSalt(I)[B

    move-result-object v0

    goto :goto_5a

    :cond_58
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->fixedSaltInUse:[B

    :goto_5a
    iget-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->usingFixedSalt:Z

    if-eqz v1, :cond_6c

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decryptCipher:Ljavax/crypto/Cipher;

    monitor-enter v0
    :try_end_61
    .catch Ljava/security/InvalidKeyException; {:try_start_21 .. :try_end_61} :catch_8f
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_61} :catch_89

    :try_start_61
    iget-object v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decryptCipher:Ljavax/crypto/Cipher;

    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    monitor-exit v0

    goto :goto_85

    :catchall_69
    move-exception p1

    monitor-exit v0
    :try_end_6b
    .catchall {:try_start_61 .. :try_end_6b} :catchall_69

    :try_start_6b
    throw p1

    :cond_6c
    new-instance v1, Ljavax/crypto/spec/PBEParameterSpec;

    iget v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->keyObtentionIterations:I

    invoke-direct {v1, v0, v2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decryptCipher:Ljavax/crypto/Cipher;

    monitor-enter v0
    :try_end_76
    .catch Ljava/security/InvalidKeyException; {:try_start_6b .. :try_end_76} :catch_8f
    .catch Ljava/lang/Exception; {:try_start_6b .. :try_end_76} :catch_89

    :try_start_76
    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decryptCipher:Ljavax/crypto/Cipher;

    const/4 v3, 0x2

    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->key:Ljavax/crypto/SecretKey;

    invoke-virtual {v2, v3, v4, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    iget-object v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decryptCipher:Ljavax/crypto/Cipher;

    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    monitor-exit v0

    :goto_85
    return-object p1

    :catchall_86
    move-exception p1

    monitor-exit v0
    :try_end_88
    .catchall {:try_start_76 .. :try_end_88} :catchall_86

    :try_start_88
    throw p1
    :try_end_89
    .catch Ljava/security/InvalidKeyException; {:try_start_88 .. :try_end_89} :catch_8f
    .catch Ljava/lang/Exception; {:try_start_88 .. :try_end_89} :catch_89

    :catch_89
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :catch_8f
    move-exception p1

    invoke-direct {p0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->handleInvalidKeyException(Ljava/security/InvalidKeyException;)V

    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1
.end method

.method public encrypt([B)[B
    .registers 8

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialize()V

    :cond_d
    :try_start_d
    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->usingFixedSalt:Z

    if-eqz v0, :cond_21

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->fixedSaltInUse:[B

    iget-object v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    monitor-enter v1
    :try_end_16
    .catch Ljava/security/InvalidKeyException; {:try_start_d .. :try_end_16} :catch_58
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_16} :catch_52

    :try_start_16
    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    invoke-virtual {v2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    monitor-exit v1

    goto :goto_42

    :catchall_1e
    move-exception p1

    monitor-exit v1
    :try_end_20
    .catchall {:try_start_16 .. :try_end_20} :catchall_1e

    :try_start_20
    throw p1

    :cond_21
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    iget v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltSizeBytes:I

    invoke-interface {v0, v1}, Lorg/jasypt/salt/SaltGenerator;->generateSalt(I)[B

    move-result-object v0

    new-instance v1, Ljavax/crypto/spec/PBEParameterSpec;

    iget v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->keyObtentionIterations:I

    invoke-direct {v1, v0, v2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    monitor-enter v2
    :try_end_33
    .catch Ljava/security/InvalidKeyException; {:try_start_20 .. :try_end_33} :catch_58
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_33} :catch_52

    :try_start_33
    iget-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    const/4 v4, 0x1

    iget-object v5, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->key:Ljavax/crypto/SecretKey;

    invoke-virtual {v3, v4, v5, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    iget-object v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    monitor-exit v2
    :try_end_42
    .catchall {:try_start_33 .. :try_end_42} :catchall_4f

    :goto_42
    :try_start_42
    iget-object v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    invoke-interface {v1}, Lorg/jasypt/salt/SaltGenerator;->includePlainSaltInEncryptionResults()Z

    move-result v1

    if-eqz v1, :cond_4e

    invoke-static {v0, p1}, Lorg/jasypt/commons/CommonUtils;->appendArrays([B[B)[B

    move-result-object p1
    :try_end_4e
    .catch Ljava/security/InvalidKeyException; {:try_start_42 .. :try_end_4e} :catch_58
    .catch Ljava/lang/Exception; {:try_start_42 .. :try_end_4e} :catch_52

    :cond_4e
    return-object p1

    :catchall_4f
    move-exception p1

    :try_start_50
    monitor-exit v2
    :try_end_51
    .catchall {:try_start_50 .. :try_end_51} :catchall_4f

    :try_start_51
    throw p1
    :try_end_52
    .catch Ljava/security/InvalidKeyException; {:try_start_51 .. :try_end_52} :catch_58
    .catch Ljava/lang/Exception; {:try_start_51 .. :try_end_52} :catch_52

    :catch_52
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :catch_58
    move-exception p1

    invoke-direct {p0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->handleInvalidKeyException(Ljava/security/InvalidKeyException;)V

    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1
.end method

.method public declared-synchronized initialize()V
    .registers 8

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialized:Z

    if-nez v0, :cond_151

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    const/4 v1, 0x1

    if-eqz v0, :cond_81

    invoke-direct {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->resolveConfigurationPassword()V

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    invoke-interface {v0}, Lorg/jasypt/encryption/pbe/config/PBEConfig;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1a

    const-string v2, "Algorithm cannot be set empty"

    invoke-static {v0, v2}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1a
    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    invoke-interface {v2}, Lorg/jasypt/encryption/pbe/config/PBEConfig;->getKeyObtentionIterations()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_30

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_2a

    const/4 v3, 0x1

    goto :goto_2b

    :cond_2a
    const/4 v3, 0x0

    :goto_2b
    const-string v4, "Number of iterations for key obtention must be greater than zero"

    invoke-static {v3, v4}, Lorg/jasypt/commons/CommonUtils;->validateIsTrue(ZLjava/lang/String;)V

    :cond_30
    iget-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    invoke-interface {v3}, Lorg/jasypt/encryption/pbe/config/PBEConfig;->getSaltGenerator()Lorg/jasypt/salt/SaltGenerator;

    move-result-object v3

    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    invoke-interface {v4}, Lorg/jasypt/encryption/pbe/config/PBEConfig;->getProviderName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_43

    const-string v5, "Provider name cannot be empty"

    invoke-static {v4, v5}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_43
    iget-object v5, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    invoke-interface {v5}, Lorg/jasypt/encryption/pbe/config/PBEConfig;->getProvider()Ljava/security/Provider;

    move-result-object v5

    iget-boolean v6, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithmSet:Z

    if-nez v6, :cond_4f

    if-nez v0, :cond_51

    :cond_4f
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    :cond_51
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->iterationsSet:Z

    if-nez v0, :cond_5f

    if-nez v2, :cond_5a

    goto :goto_5f

    :cond_5a
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_61

    :cond_5f
    :goto_5f
    iget v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->keyObtentionIterations:I

    :goto_61
    iput v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->keyObtentionIterations:I

    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGeneratorSet:Z

    if-nez v0, :cond_69

    if-nez v3, :cond_6b

    :cond_69
    iget-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    :cond_6b
    iput-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerNameSet:Z

    if-nez v0, :cond_73

    if-nez v4, :cond_75

    :cond_73
    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerName:Ljava/lang/String;

    :cond_75
    iput-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerName:Ljava/lang/String;

    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerSet:Z

    if-nez v0, :cond_7d

    if-nez v5, :cond_7f

    :cond_7d
    iget-object v5, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->provider:Ljava/security/Provider;

    :cond_7f
    iput-object v5, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->provider:Ljava/security/Provider;

    :cond_81
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    if-nez v0, :cond_8c

    new-instance v0, Lorg/jasypt/salt/RandomSaltGenerator;

    invoke-direct {v0}, Lorg/jasypt/salt/RandomSaltGenerator;-><init>()V

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;
    :try_end_8c
    .catchall {:try_start_1 .. :try_end_8c} :catchall_153

    :cond_8c
    :try_start_8c
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->password:[C

    if-eqz v0, :cond_140

    invoke-static {v0}, Lorg/jasypt/normalization/Normalizer;->normalizeToNfc([C)[C

    move-result-object v0

    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v2, v0}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    iget-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->password:[C

    invoke-static {v3}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->cleanPassword([C)V

    invoke-static {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->cleanPassword([C)V

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->provider:Ljava/security/Provider;

    if-eqz v0, :cond_c6

    iget-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    invoke-static {v3, v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->key:Ljavax/crypto/SecretKey;

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->provider:Ljava/security/Provider;

    invoke-static {v0, v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->provider:Ljava/security/Provider;

    invoke-static {v0, v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v0

    :goto_c3
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decryptCipher:Ljavax/crypto/Cipher;

    goto :goto_104

    :cond_c6
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerName:Ljava/lang/String;

    if-eqz v0, :cond_e9

    iget-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    invoke-static {v3, v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->key:Ljavax/crypto/SecretKey;

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerName:Ljava/lang/String;

    invoke-static {v0, v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerName:Ljava/lang/String;

    invoke-static {v0, v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    goto :goto_c3

    :cond_e9
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->key:Ljavax/crypto/SecretKey;

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0
    :try_end_103
    .catch Lorg/jasypt/exceptions/EncryptionInitializationException; {:try_start_8c .. :try_end_103} :catch_14f
    .catchall {:try_start_8c .. :try_end_103} :catchall_148

    goto :goto_c3

    :goto_104
    :try_start_104
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    invoke-virtual {v0}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result v0

    if-lez v0, :cond_10e

    iput v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltSizeBytes:I

    :cond_10e
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    instance-of v2, v0, Lorg/jasypt/salt/FixedSaltGenerator;

    iput-boolean v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->usingFixedSalt:Z

    if-eqz v2, :cond_13d

    iget v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltSizeBytes:I

    invoke-interface {v0, v2}, Lorg/jasypt/salt/SaltGenerator;->generateSalt(I)[B

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->fixedSaltInUse:[B

    new-instance v0, Ljavax/crypto/spec/PBEParameterSpec;

    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->fixedSaltInUse:[B

    iget v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->keyObtentionIterations:I

    invoke-direct {v0, v2, v3}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V
    :try_end_127
    .catchall {:try_start_104 .. :try_end_127} :catchall_153

    :try_start_127
    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encryptCipher:Ljavax/crypto/Cipher;

    iget-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->key:Ljavax/crypto/SecretKey;

    invoke-virtual {v2, v1, v3, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    iget-object v2, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decryptCipher:Ljavax/crypto/Cipher;

    const/4 v3, 0x2

    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->key:Ljavax/crypto/SecretKey;

    invoke-virtual {v2, v3, v4, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_136
    .catch Ljava/lang/Exception; {:try_start_127 .. :try_end_136} :catch_137
    .catchall {:try_start_127 .. :try_end_136} :catchall_153

    goto :goto_13d

    :catch_137
    :try_start_137
    new-instance v0, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {v0}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw v0

    :cond_13d
    :goto_13d
    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialized:Z
    :try_end_13f
    .catchall {:try_start_137 .. :try_end_13f} :catchall_153

    goto :goto_151

    :cond_140
    :try_start_140
    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v1, "Password not set for Password Based Encryptor"

    invoke-direct {v0, v1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_148
    .catch Lorg/jasypt/exceptions/EncryptionInitializationException; {:try_start_140 .. :try_end_148} :catch_14f
    .catchall {:try_start_140 .. :try_end_148} :catchall_148

    :catchall_148
    move-exception v0

    :try_start_149
    new-instance v1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_14f
    move-exception v0

    throw v0
    :try_end_151
    .catchall {:try_start_149 .. :try_end_151} :catchall_153

    :cond_151
    :goto_151
    monitor-exit p0

    return-void

    :catchall_153
    move-exception v0

    monitor-exit p0

    goto :goto_157

    :goto_156
    throw v0

    :goto_157
    goto :goto_156
.end method

.method public isInitialized()Z
    .registers 2

    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialized:Z

    return v0
.end method

.method public declared-synchronized setAlgorithm(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Algorithm cannot be set empty"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_13

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithm:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->algorithmSet:Z
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_19

    monitor-exit p0

    return-void

    :cond_13
    :try_start_13
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_19
    .catchall {:try_start_13 .. :try_end_19} :catchall_19

    :catchall_19
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setConfig(Lorg/jasypt/encryption/pbe/config/PBEConfig;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Config cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_10

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;
    :try_end_e
    .catchall {:try_start_1 .. :try_end_e} :catchall_16

    monitor-exit p0

    return-void

    :cond_10
    :try_start_10
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_16
    .catchall {:try_start_10 .. :try_end_16} :catchall_16

    :catchall_16
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setKeyObtentionIterations(I)V
    .registers 5

    monitor-enter p0

    const/4 v0, 0x1

    if-lez p1, :cond_6

    const/4 v1, 0x1

    goto :goto_7

    :cond_6
    const/4 v1, 0x0

    :goto_7
    :try_start_7
    const-string v2, "Number of iterations for key obtention must be greater than zero"

    invoke-static {v1, v2}, Lorg/jasypt/commons/CommonUtils;->validateIsTrue(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_18

    iput p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->keyObtentionIterations:I

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->iterationsSet:Z
    :try_end_16
    .catchall {:try_start_7 .. :try_end_16} :catchall_1e

    monitor-exit p0

    return-void

    :cond_18
    :try_start_18
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_1e
    .catchall {:try_start_18 .. :try_end_1e} :catchall_1e

    :catchall_1e
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setPassword(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Password cannot be set empty"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->password:[C

    if-eqz v0, :cond_13

    invoke-static {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->cleanPassword([C)V

    :cond_13
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->password:[C

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->passwordSet:Z
    :try_end_1c
    .catchall {:try_start_1 .. :try_end_1c} :catchall_24

    monitor-exit p0

    return-void

    :cond_1e
    :try_start_1e
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_24
    .catchall {:try_start_1e .. :try_end_24} :catchall_24

    :catchall_24
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setPasswordCharArray([C)V
    .registers 6

    monitor-enter p0

    :try_start_1
    const-string v0, "Password cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_d

    const/4 v0, 0x1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    const-string v3, "Password cannot be set empty"

    invoke-static {v0, v3}, Lorg/jasypt/commons/CommonUtils;->validateIsTrue(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2d

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->password:[C

    if-eqz v0, :cond_20

    invoke-static {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->cleanPassword([C)V

    :cond_20
    array-length v0, p1

    new-array v0, v0, [C

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->password:[C

    array-length v3, p1

    invoke-static {p1, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->passwordSet:Z
    :try_end_2b
    .catchall {:try_start_1 .. :try_end_2b} :catchall_33

    monitor-exit p0

    return-void

    :cond_2d
    :try_start_2d
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_33
    .catchall {:try_start_2d .. :try_end_33} :catchall_33

    :catchall_33
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setProvider(Ljava/security/Provider;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Provider cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_13

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->provider:Ljava/security/Provider;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerSet:Z
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_19

    monitor-exit p0

    return-void

    :cond_13
    :try_start_13
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_19
    .catchall {:try_start_13 .. :try_end_19} :catchall_19

    :catchall_19
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setProviderName(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Provider name cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_13

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerName:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->providerNameSet:Z
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_19

    monitor-exit p0

    return-void

    :cond_13
    :try_start_13
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_19
    .catchall {:try_start_13 .. :try_end_19} :catchall_19

    :catchall_19
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Salt generator cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_13

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->saltGeneratorSet:Z
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_19

    monitor-exit p0

    return-void

    :cond_13
    :try_start_13
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_19
    .catchall {:try_start_13 .. :try_end_19} :catchall_19

    :catchall_19
    move-exception p1

    monitor-exit p0

    throw p1
.end method
