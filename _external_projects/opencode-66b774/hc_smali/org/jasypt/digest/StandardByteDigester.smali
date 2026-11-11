.class public final Lorg/jasypt/digest/StandardByteDigester;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/digest/ByteDigester;


# static fields
.field public static final DEFAULT_ALGORITHM:Ljava/lang/String; = "MD5"

.field public static final DEFAULT_ITERATIONS:I = 0x3e8

.field public static final DEFAULT_SALT_SIZE_BYTES:I = 0x8


# instance fields
.field private algorithm:Ljava/lang/String;

.field private algorithmSet:Z

.field private config:Lorg/jasypt/digest/config/DigesterConfig;

.field private digestLengthBytes:I

.field private initialized:Z

.field private invertPositionOfPlainSaltInEncryptionResults:Z

.field private invertPositionOfPlainSaltInEncryptionResultsSet:Z

.field private invertPositionOfSaltInMessageBeforeDigesting:Z

.field private invertPositionOfSaltInMessageBeforeDigestingSet:Z

.field private iterations:I

.field private iterationsSet:Z

.field private md:Ljava/security/MessageDigest;

.field private provider:Ljava/security/Provider;

.field private providerName:Ljava/lang/String;

.field private providerNameSet:Z

.field private providerSet:Z

.field private saltGenerator:Lorg/jasypt/salt/SaltGenerator;

.field private saltGeneratorSet:Z

.field private saltSizeBytes:I

.field private saltSizeBytesSet:Z

.field private useLenientSaltSizeCheck:Z

.field private useLenientSaltSizeCheckSet:Z

.field private useSalt:Z


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "MD5"

    iput-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    const/16 v0, 0x8

    iput v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytes:I

    const/16 v0, 0x3e8

    iput v0, p0, Lorg/jasypt/digest/StandardByteDigester;->iterations:I

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    iput-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->providerName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->provider:Ljava/security/Provider;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfSaltInMessageBeforeDigesting:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResults:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheck:Z

    iput-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithmSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytesSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->iterationsSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGeneratorSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->providerNameSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->providerSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfSaltInMessageBeforeDigestingSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResultsSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheckSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->initialized:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lorg/jasypt/digest/StandardByteDigester;->useSalt:Z

    iput-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    iput v1, p0, Lorg/jasypt/digest/StandardByteDigester;->digestLengthBytes:I

    return-void
.end method

.method private digest([B[B)[B
    .registers 6

    :try_start_0
    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    monitor-enter v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_3} :catch_5e

    :try_start_3
    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V

    if-eqz p2, :cond_24

    iget-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfSaltInMessageBeforeDigesting:Z

    if-nez v1, :cond_19

    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->update([B)V

    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    :goto_15
    invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_27

    :cond_19
    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->update([B)V

    iget-object p1, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    invoke-virtual {p1, p2}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_27

    :cond_24
    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    goto :goto_15

    :goto_27
    iget-object p1, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    const/4 v1, 0x0

    :goto_2e
    iget v2, p0, Lorg/jasypt/digest/StandardByteDigester;->iterations:I

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_42

    iget-object v2, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V

    iget-object v2, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    invoke-virtual {v2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2e

    :cond_42
    monitor-exit v0
    :try_end_43
    .catchall {:try_start_3 .. :try_end_43} :catchall_5b

    :try_start_43
    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    invoke-interface {v0}, Lorg/jasypt/salt/SaltGenerator;->includePlainSaltInEncryptionResults()Z

    move-result v0

    if-eqz v0, :cond_5a

    if-eqz p2, :cond_5a

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResults:Z

    if-nez v0, :cond_56

    invoke-static {p2, p1}, Lorg/jasypt/commons/CommonUtils;->appendArrays([B[B)[B

    move-result-object p1

    return-object p1

    :cond_56
    invoke-static {p1, p2}, Lorg/jasypt/commons/CommonUtils;->appendArrays([B[B)[B

    move-result-object p1
    :try_end_5a
    .catch Ljava/lang/Exception; {:try_start_43 .. :try_end_5a} :catch_5e

    :cond_5a
    return-object p1

    :catchall_5b
    move-exception p1

    :try_start_5c
    monitor-exit v0
    :try_end_5d
    .catchall {:try_start_5c .. :try_end_5d} :catchall_5b

    :try_start_5d
    throw p1
    :try_end_5e
    .catch Ljava/lang/Exception; {:try_start_5d .. :try_end_5e} :catch_5e

    :catch_5e
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    goto :goto_65

    :goto_64
    throw p1

    :goto_65
    goto :goto_64
.end method

.method private static digestsAreEqual([B[B)Z
    .registers 8

    const/4 v0, 0x0

    if-eqz p0, :cond_1b

    if-nez p1, :cond_6

    goto :goto_1b

    :cond_6
    array-length v1, p0

    array-length v2, p1

    if-eq v2, v1, :cond_b

    return v0

    :cond_b
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_d
    if-ge v2, v1, :cond_18

    aget-byte v4, p0, v2

    aget-byte v5, p1, v2

    xor-int/2addr v4, v5

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_18
    if-nez v3, :cond_1b

    const/4 v0, 0x1

    :cond_1b
    :goto_1b
    return v0
.end method


# virtual methods
.method public cloneDigester()Lorg/jasypt/digest/StandardByteDigester;
    .registers 3

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->initialize()V

    :cond_9
    new-instance v0, Lorg/jasypt/digest/StandardByteDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardByteDigester;-><init>()V

    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    invoke-static {v1}, Lorg/jasypt/commons/CommonUtils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1b

    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setAlgorithm(Ljava/lang/String;)V

    :cond_1b
    iget-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResults:Z

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setInvertPositionOfPlainSaltInEncryptionResults(Z)V

    iget-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfSaltInMessageBeforeDigesting:Z

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setInvertPositionOfSaltInMessageBeforeDigesting(Z)V

    iget v1, p0, Lorg/jasypt/digest/StandardByteDigester;->iterations:I

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setIterations(I)V

    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->provider:Ljava/security/Provider;

    if-eqz v1, :cond_31

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setProvider(Ljava/security/Provider;)V

    :cond_31
    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->providerName:Ljava/lang/String;

    if-eqz v1, :cond_38

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setProviderName(Ljava/lang/String;)V

    :cond_38
    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    if-eqz v1, :cond_3f

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    :cond_3f
    iget v1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytes:I

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setSaltSizeBytes(I)V

    iget-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheck:Z

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardByteDigester;->setUseLenientSaltSizeCheck(Z)V

    return-object v0
.end method

.method public digest([B)[B
    .registers 4

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return-object v0

    :cond_4
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->initialize()V

    :cond_d
    iget-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->useSalt:Z

    if-eqz v1, :cond_19

    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    iget v1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytes:I

    invoke-interface {v0, v1}, Lorg/jasypt/salt/SaltGenerator;->generateSalt(I)[B

    move-result-object v0

    :cond_19
    invoke-direct {p0, p1, v0}, Lorg/jasypt/digest/StandardByteDigester;->digest([B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized initialize()V
    .registers 12

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->initialized:Z

    if-nez v0, :cond_192

    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    const/4 v1, 0x1

    if-eqz v0, :cond_e3

    invoke-interface {v0}, Lorg/jasypt/digest/config/DigesterConfig;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_15

    const-string v2, "Algorithm cannot be empty"

    invoke-static {v0, v2}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_15
    iget-object v2, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    invoke-interface {v2}, Lorg/jasypt/digest/config/DigesterConfig;->getSaltSizeBytes()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2c

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ltz v4, :cond_26

    const/4 v4, 0x1

    goto :goto_27

    :cond_26
    const/4 v4, 0x0

    :goto_27
    const-string v5, "Salt size in bytes must be non-negative"

    invoke-static {v4, v5}, Lorg/jasypt/commons/CommonUtils;->validateIsTrue(ZLjava/lang/String;)V

    :cond_2c
    iget-object v4, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    invoke-interface {v4}, Lorg/jasypt/digest/config/DigesterConfig;->getIterations()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_40

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-lez v5, :cond_3b

    const/4 v3, 0x1

    :cond_3b
    const-string v5, "Number of iterations must be greater than zero"

    invoke-static {v3, v5}, Lorg/jasypt/commons/CommonUtils;->validateIsTrue(ZLjava/lang/String;)V

    :cond_40
    iget-object v3, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    invoke-interface {v3}, Lorg/jasypt/digest/config/DigesterConfig;->getSaltGenerator()Lorg/jasypt/salt/SaltGenerator;

    move-result-object v3

    iget-object v5, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    invoke-interface {v5}, Lorg/jasypt/digest/config/DigesterConfig;->getProviderName()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_53

    const-string v6, "Provider name cannot be empty"

    invoke-static {v5, v6}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_53
    iget-object v6, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    invoke-interface {v6}, Lorg/jasypt/digest/config/DigesterConfig;->getProvider()Ljava/security/Provider;

    move-result-object v6

    iget-object v7, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    invoke-interface {v7}, Lorg/jasypt/digest/config/DigesterConfig;->getInvertPositionOfSaltInMessageBeforeDigesting()Ljava/lang/Boolean;

    move-result-object v7

    iget-object v8, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    invoke-interface {v8}, Lorg/jasypt/digest/config/DigesterConfig;->getInvertPositionOfPlainSaltInEncryptionResults()Ljava/lang/Boolean;

    move-result-object v8

    iget-object v9, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    invoke-interface {v9}, Lorg/jasypt/digest/config/DigesterConfig;->getUseLenientSaltSizeCheck()Ljava/lang/Boolean;

    move-result-object v9

    iget-boolean v10, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithmSet:Z

    if-nez v10, :cond_71

    if-nez v0, :cond_73

    :cond_71
    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    :cond_73
    iput-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytesSet:Z

    if-nez v0, :cond_81

    if-nez v2, :cond_7c

    goto :goto_81

    :cond_7c
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_83

    :cond_81
    :goto_81
    iget v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytes:I

    :goto_83
    iput v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytes:I

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->iterationsSet:Z

    if-nez v0, :cond_91

    if-nez v4, :cond_8c

    goto :goto_91

    :cond_8c
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_93

    :cond_91
    :goto_91
    iget v0, p0, Lorg/jasypt/digest/StandardByteDigester;->iterations:I

    :goto_93
    iput v0, p0, Lorg/jasypt/digest/StandardByteDigester;->iterations:I

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGeneratorSet:Z

    if-nez v0, :cond_9b

    if-nez v3, :cond_9d

    :cond_9b
    iget-object v3, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    :cond_9d
    iput-object v3, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->providerNameSet:Z

    if-nez v0, :cond_a5

    if-nez v5, :cond_a7

    :cond_a5
    iget-object v5, p0, Lorg/jasypt/digest/StandardByteDigester;->providerName:Ljava/lang/String;

    :cond_a7
    iput-object v5, p0, Lorg/jasypt/digest/StandardByteDigester;->providerName:Ljava/lang/String;

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->providerSet:Z

    if-nez v0, :cond_af

    if-nez v6, :cond_b1

    :cond_af
    iget-object v6, p0, Lorg/jasypt/digest/StandardByteDigester;->provider:Ljava/security/Provider;

    :cond_b1
    iput-object v6, p0, Lorg/jasypt/digest/StandardByteDigester;->provider:Ljava/security/Provider;

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfSaltInMessageBeforeDigestingSet:Z

    if-nez v0, :cond_bf

    if-nez v7, :cond_ba

    goto :goto_bf

    :cond_ba
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_c1

    :cond_bf
    :goto_bf
    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfSaltInMessageBeforeDigesting:Z

    :goto_c1
    iput-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfSaltInMessageBeforeDigesting:Z

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResultsSet:Z

    if-nez v0, :cond_cf

    if-nez v8, :cond_ca

    goto :goto_cf

    :cond_ca
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_d1

    :cond_cf
    :goto_cf
    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResults:Z

    :goto_d1
    iput-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResults:Z

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheckSet:Z

    if-nez v0, :cond_df

    if-nez v9, :cond_da

    goto :goto_df

    :cond_da
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_e1

    :cond_df
    :goto_df
    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheck:Z

    :goto_e1
    iput-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheck:Z

    :cond_e3
    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    if-nez v0, :cond_ee

    new-instance v0, Lorg/jasypt/salt/RandomSaltGenerator;

    invoke-direct {v0}, Lorg/jasypt/salt/RandomSaltGenerator;-><init>()V

    iput-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    :cond_ee
    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheck:Z

    if-eqz v0, :cond_12b

    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    invoke-interface {v0}, Lorg/jasypt/salt/SaltGenerator;->includePlainSaltInEncryptionResults()Z

    move-result v0

    if-eqz v0, :cond_fb

    goto :goto_12b

    :cond_fb
    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "The configured Salt Generator ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, ") does not include plain salt "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "in encryption results, which is not compatible"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "with setting the salt size checking behaviour to \"lenient\"."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_12b
    .catchall {:try_start_1 .. :try_end_12b} :catchall_194

    :cond_12b
    :goto_12b
    :try_start_12b
    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->provider:Ljava/security/Provider;

    if-eqz v0, :cond_138

    iget-object v2, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    invoke-static {v2, v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/MessageDigest;

    move-result-object v0

    :goto_135
    iput-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    goto :goto_14a

    :cond_138
    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->providerName:Ljava/lang/String;

    if-eqz v0, :cond_143

    iget-object v2, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    invoke-static {v2, v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    goto :goto_135

    :cond_143
    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_149
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_12b .. :try_end_149} :catch_18b
    .catch Ljava/security/NoSuchProviderException; {:try_start_12b .. :try_end_149} :catch_184
    .catchall {:try_start_12b .. :try_end_149} :catchall_194

    goto :goto_135

    :goto_14a
    :try_start_14a
    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->md:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v0

    iput v0, p0, Lorg/jasypt/digest/StandardByteDigester;->digestLengthBytes:I

    if-lez v0, :cond_157

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->initialized:Z

    goto :goto_192

    :cond_157
    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "The configured algorithm ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, ") or its provider do  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "not allow knowing the digest length beforehand "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "(getDigestLength() operation), which is not compatible"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "with setting the salt size checking behaviour to \"lenient\"."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_184
    move-exception v0

    new-instance v1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_18b
    move-exception v0

    new-instance v1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_192
    .catchall {:try_start_14a .. :try_end_192} :catchall_194

    :cond_192
    :goto_192
    monitor-exit p0

    return-void

    :catchall_194
    move-exception v0

    monitor-exit p0

    goto :goto_198

    :goto_197
    throw v0

    :goto_198
    goto :goto_197
.end method

.method public isInitialized()Z
    .registers 2

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->initialized:Z

    return v0
.end method

.method public matches([B[B)Z
    .registers 7

    const/4 v0, 0x0

    if-nez p1, :cond_7

    if-nez p2, :cond_6

    const/4 v0, 0x1

    :cond_6
    return v0

    :cond_7
    if-nez p2, :cond_a

    return v0

    :cond_a
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->initialize()V

    :cond_13
    const/4 v1, 0x0

    :try_start_14
    iget-boolean v2, p0, Lorg/jasypt/digest/StandardByteDigester;->useSalt:Z

    if-eqz v2, :cond_65

    iget-object v1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    invoke-interface {v1}, Lorg/jasypt/salt/SaltGenerator;->includePlainSaltInEncryptionResults()Z

    move-result v1

    if-eqz v1, :cond_5d

    iget v1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytes:I

    iget v2, p0, Lorg/jasypt/digest/StandardByteDigester;->digestLengthBytes:I

    if-lez v2, :cond_41

    iget-boolean v3, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheck:Z

    if-eqz v3, :cond_36

    array-length v1, p2

    if-lt v1, v2, :cond_30

    array-length v1, p2

    sub-int/2addr v1, v2

    goto :goto_44

    :cond_30
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :cond_36
    array-length v3, p2

    add-int/2addr v2, v1

    if-ne v3, v2, :cond_3b

    goto :goto_44

    :cond_3b
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :cond_41
    array-length v2, p2

    if-lt v2, v1, :cond_57

    :goto_44
    iget-boolean v2, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResults:Z

    if-nez v2, :cond_4e

    new-array v2, v1, [B

    invoke-static {p2, v0, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_55

    :cond_4e
    new-array v2, v1, [B

    array-length v3, p2

    sub-int/2addr v3, v1

    invoke-static {p2, v3, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_55
    move-object v1, v2

    goto :goto_65

    :cond_57
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :cond_5d
    iget-object v0, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    iget v1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytes:I

    invoke-interface {v0, v1}, Lorg/jasypt/salt/SaltGenerator;->generateSalt(I)[B

    move-result-object v1

    :cond_65
    :goto_65
    invoke-direct {p0, p1, v1}, Lorg/jasypt/digest/StandardByteDigester;->digest([B[B)[B

    move-result-object p1

    invoke-static {p1, p2}, Lorg/jasypt/digest/StandardByteDigester;->digestsAreEqual([B[B)Z

    move-result p1
    :try_end_6d
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_6d} :catch_6e

    return p1

    :catch_6e
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1
.end method

.method public declared-synchronized setAlgorithm(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Algorithm cannot be empty"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_13

    iput-object p1, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithm:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->algorithmSet:Z
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

.method public declared-synchronized setConfig(Lorg/jasypt/digest/config/DigesterConfig;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Config cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_10

    iput-object p1, p0, Lorg/jasypt/digest/StandardByteDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;
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

.method public declared-synchronized setInvertPositionOfPlainSaltInEncryptionResults(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_e

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResults:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfPlainSaltInEncryptionResultsSet:Z
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_14

    monitor-exit p0

    return-void

    :cond_e
    :try_start_e
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_14
    .catchall {:try_start_e .. :try_end_14} :catchall_14

    :catchall_14
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setInvertPositionOfSaltInMessageBeforeDigesting(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_e

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfSaltInMessageBeforeDigesting:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->invertPositionOfSaltInMessageBeforeDigestingSet:Z
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_14

    monitor-exit p0

    return-void

    :cond_e
    :try_start_e
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_14
    .catchall {:try_start_e .. :try_end_14} :catchall_14

    :catchall_14
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setIterations(I)V
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
    const-string v2, "Number of iterations must be greater than zero"

    invoke-static {v1, v2}, Lorg/jasypt/commons/CommonUtils;->validateIsTrue(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_18

    iput p1, p0, Lorg/jasypt/digest/StandardByteDigester;->iterations:I

    iput-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->iterationsSet:Z
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

.method public declared-synchronized setProvider(Ljava/security/Provider;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Provider cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_13

    iput-object p1, p0, Lorg/jasypt/digest/StandardByteDigester;->provider:Ljava/security/Provider;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->providerSet:Z
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

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_13

    iput-object p1, p0, Lorg/jasypt/digest/StandardByteDigester;->providerName:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->providerNameSet:Z
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

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_13

    iput-object p1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltGeneratorSet:Z
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

.method public declared-synchronized setSaltSizeBytes(I)V
    .registers 6

    monitor-enter p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_7

    const/4 v2, 0x1

    goto :goto_8

    :cond_7
    const/4 v2, 0x0

    :goto_8
    :try_start_8
    const-string v3, "Salt size in bytes must be non-negative"

    invoke-static {v2, v3}, Lorg/jasypt/commons/CommonUtils;->validateIsTrue(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_1e

    iput p1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytes:I

    if-lez p1, :cond_18

    const/4 v0, 0x1

    :cond_18
    iput-boolean v0, p0, Lorg/jasypt/digest/StandardByteDigester;->useSalt:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardByteDigester;->saltSizeBytesSet:Z
    :try_end_1c
    .catchall {:try_start_8 .. :try_end_1c} :catchall_24

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

.method public declared-synchronized setUseLenientSaltSizeCheck(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_e

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheck:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardByteDigester;->useLenientSaltSizeCheckSet:Z
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_14

    monitor-exit p0

    return-void

    :cond_e
    :try_start_e
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_14
    .catchall {:try_start_e .. :try_end_14} :catchall_14

    :catchall_14
    move-exception p1

    monitor-exit p0

    throw p1
.end method
