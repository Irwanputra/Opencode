.class public final Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/encryption/pbe/PBEStringCleanablePasswordEncryptor;


# static fields
.field public static final DEFAULT_STRING_OUTPUT_TYPE:Ljava/lang/String; = "base64"

.field private static final ENCRYPTED_MESSAGE_CHARSET:Ljava/lang/String; = "US-ASCII"

.field private static final MESSAGE_CHARSET:Ljava/lang/String; = "UTF-8"


# instance fields
.field private final base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

.field private final byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

.field private stringOutputType:Ljava/lang/String;

.field private stringOutputTypeBase64:Z

.field private stringOutputTypeSet:Z

.field private stringPBEConfig:Lorg/jasypt/encryption/pbe/config/StringPBEConfig;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringPBEConfig:Lorg/jasypt/encryption/pbe/config/StringPBEConfig;

    const-string v0, "base64"

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputType:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputTypeBase64:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputTypeSet:Z

    new-instance v0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-direct {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;-><init>()V

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    new-instance v0, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    invoke-direct {v0}, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;-><init>()V

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    return-void
.end method

.method private constructor <init>(Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringPBEConfig:Lorg/jasypt/encryption/pbe/config/StringPBEConfig;

    const-string v0, "base64"

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputType:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputTypeBase64:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputTypeSet:Z

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    new-instance p1, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    invoke-direct {p1}, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;-><init>()V

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    return-void
.end method

.method private initializeSpecifics()V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringPBEConfig:Lorg/jasypt/encryption/pbe/config/StringPBEConfig;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Lorg/jasypt/encryption/pbe/config/StringPBEConfig;->getStringOutputType()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputTypeSet:Z

    if-nez v1, :cond_e

    if-nez v0, :cond_10

    :cond_e
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputType:Ljava/lang/String;

    :cond_10
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputType:Ljava/lang/String;

    :cond_12
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputType:Ljava/lang/String;

    const-string v1, "base64"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputTypeBase64:Z

    return-void
.end method


# virtual methods
.method public declared-synchronized cloneAndInitializeEncryptor(I)[Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->cloneAndInitializeEncryptor(I)[Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    move-result-object v0

    invoke-direct {p0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->initializeSpecifics()V

    new-array v1, p1, [Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    :goto_10
    if-ge v2, p1, :cond_2d

    new-instance v3, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    aget-object v4, v0, v2

    invoke-direct {v3, v4}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;-><init>(Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;)V

    aput-object v3, v1, v2

    iget-object v3, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputType:Ljava/lang/String;

    invoke-static {v3}, Lorg/jasypt/commons/CommonUtils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2a

    aget-object v3, v1, v2

    iget-object v4, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputType:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->setStringOutputType(Ljava/lang/String;)V
    :try_end_2a
    .catchall {:try_start_1 .. :try_end_2a} :catchall_2f

    :cond_2a
    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :cond_2d
    monitor-exit p0

    return-object v1

    :catchall_2f
    move-exception p1

    monitor-exit p0

    goto :goto_33

    :goto_32
    throw p1

    :goto_33
    goto :goto_32
.end method

.method public decrypt(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->initialize()V

    :cond_d
    :try_start_d
    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputTypeBase64:Z

    if-eqz v0, :cond_1e

    const-string v0, "US-ASCII"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    invoke-virtual {v0, p1}, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;->decode([B)[B

    move-result-object p1

    goto :goto_22

    :cond_1e
    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->fromHexadecimal(Ljava/lang/String;)[B

    move-result-object p1

    :goto_22
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decrypt([B)[B

    move-result-object p1

    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_2f
    .catch Lorg/jasypt/exceptions/EncryptionInitializationException; {:try_start_d .. :try_end_2f} :catch_38
    .catch Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException; {:try_start_d .. :try_end_2f} :catch_36
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_2f} :catch_30

    return-object v0

    :catch_30
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :catch_36
    move-exception p1

    throw p1

    :catch_38
    move-exception p1

    throw p1
.end method

.method public encrypt(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->initialize()V

    :cond_d
    :try_start_d
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encrypt([B)[B

    move-result-object p1

    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputTypeBase64:Z

    if-eqz v0, :cond_2b

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    invoke-virtual {v0, p1}, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;->encode([B)[B

    move-result-object p1

    new-instance v0, Ljava/lang/String;

    const-string v1, "US-ASCII"

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_2f

    :cond_2b
    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->toHexadecimal([B)Ljava/lang/String;

    move-result-object v0
    :try_end_2f
    .catch Lorg/jasypt/exceptions/EncryptionInitializationException; {:try_start_d .. :try_end_2f} :catch_38
    .catch Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException; {:try_start_d .. :try_end_2f} :catch_36
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_2f} :catch_30

    :goto_2f
    return-object v0

    :catch_30
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :catch_36
    move-exception p1

    throw p1

    :catch_38
    move-exception p1

    throw p1
.end method

.method public declared-synchronized initialize()V
    .registers 2

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_f

    invoke-direct {p0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->initializeSpecifics()V

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->initialize()V
    :try_end_f
    .catchall {:try_start_1 .. :try_end_f} :catchall_11

    :cond_f
    monitor-exit p0

    return-void

    :catchall_11
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isInitialized()Z
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->isInitialized()Z

    move-result v0

    return v0
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized setConfig(Lorg/jasypt/encryption/pbe/config/PBEConfig;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setConfig(Lorg/jasypt/encryption/pbe/config/PBEConfig;)V

    if-eqz p1, :cond_10

    instance-of v0, p1, Lorg/jasypt/encryption/pbe/config/StringPBEConfig;

    if-eqz v0, :cond_10

    check-cast p1, Lorg/jasypt/encryption/pbe/config/StringPBEConfig;

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringPBEConfig:Lorg/jasypt/encryption/pbe/config/StringPBEConfig;
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_12

    :cond_10
    monitor-exit p0

    return-void

    :catchall_12
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setKeyObtentionIterations(I)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setKeyObtentionIterations(I)V

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setPassword(Ljava/lang/String;)V

    return-void
.end method

.method public setPasswordCharArray([C)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setPasswordCharArray([C)V

    return-void
.end method

.method public setProvider(Ljava/security/Provider;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setProvider(Ljava/security/Provider;)V

    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setProviderName(Ljava/lang/String;)V

    return-void
.end method

.method public setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->byteEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    return-void
.end method

.method public declared-synchronized setStringOutputType(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "String output type cannot be set empty"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_17

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputType:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->stringOutputTypeSet:Z
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_1d

    monitor-exit p0

    return-void

    :cond_17
    :try_start_17
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_1d
    .catchall {:try_start_17 .. :try_end_1d} :catchall_1d

    :catchall_1d
    move-exception p1

    monitor-exit p0

    throw p1
.end method
