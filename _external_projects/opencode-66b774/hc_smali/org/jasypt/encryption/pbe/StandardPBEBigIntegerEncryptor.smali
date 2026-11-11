.class public final Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/encryption/pbe/PBEBigIntegerCleanablePasswordEncryptor;


# instance fields
.field private final byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-direct {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;-><init>()V

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    return-void
.end method

.method private constructor <init>(Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    return-void
.end method


# virtual methods
.method public declared-synchronized cloneAndInitializeEncryptor(I)[Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->cloneAndInitializeEncryptor(I)[Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    move-result-object v0

    new-array v1, p1, [Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    :goto_d
    if-ge v2, p1, :cond_1b

    new-instance v3, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    aget-object v4, v0, v2

    invoke-direct {v3, v4}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;-><init>(Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;)V

    aput-object v3, v1, v2
    :try_end_18
    .catchall {:try_start_1 .. :try_end_18} :catchall_1d

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_1b
    monitor-exit p0

    return-object v1

    :catchall_1d
    move-exception p1

    monitor-exit p0

    goto :goto_21

    :goto_20
    throw p1

    :goto_21
    goto :goto_20
.end method

.method public decrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 3

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    :try_start_4
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result p1

    invoke-static {v0, p1}, Lorg/jasypt/encryption/pbe/NumberUtils;->processBigIntegerEncryptedByteArray([BI)[B

    move-result-object p1

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decrypt([B)[B

    move-result-object p1

    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p1}, Ljava/math/BigInteger;-><init>([B)V
    :try_end_1b
    .catch Lorg/jasypt/exceptions/EncryptionInitializationException; {:try_start_4 .. :try_end_1b} :catch_24
    .catch Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException; {:try_start_4 .. :try_end_1b} :catch_22
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_1b} :catch_1c

    return-object v0

    :catch_1c
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :catch_22
    move-exception p1

    throw p1

    :catch_24
    move-exception p1

    throw p1
.end method

.method public encrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 3

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    :try_start_4
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encrypt([B)[B

    move-result-object p1

    array-length v0, p1

    invoke-static {v0}, Lorg/jasypt/encryption/pbe/NumberUtils;->byteArrayFromInt(I)[B

    move-result-object v0

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->appendArrays([B[B)[B

    move-result-object p1

    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p1}, Ljava/math/BigInteger;-><init>([B)V
    :try_end_1c
    .catch Lorg/jasypt/exceptions/EncryptionInitializationException; {:try_start_4 .. :try_end_1c} :catch_25
    .catch Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException; {:try_start_4 .. :try_end_1c} :catch_23
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_1c} :catch_1d

    return-object v0

    :catch_1d
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :catch_23
    move-exception p1

    throw p1

    :catch_25
    move-exception p1

    throw p1
.end method

.method public initialize()V
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialize()V

    return-void
.end method

.method public isInitialized()Z
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    return v0
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method

.method public setConfig(Lorg/jasypt/encryption/pbe/config/PBEConfig;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setConfig(Lorg/jasypt/encryption/pbe/config/PBEConfig;)V

    return-void
.end method

.method public setKeyObtentionIterations(I)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setKeyObtentionIterations(I)V

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setPassword(Ljava/lang/String;)V

    return-void
.end method

.method public setPasswordCharArray([C)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setPasswordCharArray([C)V

    return-void
.end method

.method public setProvider(Ljava/security/Provider;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setProvider(Ljava/security/Provider;)V

    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setProviderName(Ljava/lang/String;)V

    return-void
.end method

.method public setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    return-void
.end method
