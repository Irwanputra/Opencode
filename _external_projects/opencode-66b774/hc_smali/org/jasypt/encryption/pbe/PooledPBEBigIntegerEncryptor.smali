.class public final Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/encryption/pbe/PBEBigIntegerCleanablePasswordEncryptor;


# instance fields
.field private config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

.field private final firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

.field private initialized:Z

.field private pool:[Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

.field private poolSize:I

.field private poolSizeSet:Z

.field private roundRobin:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    const/4 v0, 0x0

    iput v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSize:I

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSizeSet:Z

    iput v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->roundRobin:I

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->initialized:Z

    new-instance v0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-direct {v0}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;-><init>()V

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    return-void
.end method


# virtual methods
.method public decrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 5

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->initialize()V

    :cond_9
    monitor-enter p0

    :try_start_a
    iget v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->roundRobin:I

    add-int/lit8 v1, v0, 0x1

    iget v2, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSize:I

    rem-int/2addr v1, v2

    iput v1, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->roundRobin:I

    monitor-exit p0
    :try_end_14
    .catchall {:try_start_a .. :try_end_14} :catchall_1d

    iget-object v1, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->pool:[Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    aget-object v0, v1, v0

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->decrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :catchall_1d
    move-exception p1

    :try_start_1e
    monitor-exit p0
    :try_end_1f
    .catchall {:try_start_1e .. :try_end_1f} :catchall_1d

    throw p1
.end method

.method public encrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 5

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->initialize()V

    :cond_9
    monitor-enter p0

    :try_start_a
    iget v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->roundRobin:I

    add-int/lit8 v1, v0, 0x1

    iget v2, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSize:I

    rem-int/2addr v1, v2

    iput v1, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->roundRobin:I

    monitor-exit p0
    :try_end_14
    .catchall {:try_start_a .. :try_end_14} :catchall_1d

    iget-object v1, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->pool:[Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    aget-object v0, v1, v0

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->encrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :catchall_1d
    move-exception p1

    :try_start_1e
    monitor-exit p0
    :try_end_1f
    .catchall {:try_start_1e .. :try_end_1f} :catchall_1d

    throw p1
.end method

.method public declared-synchronized initialize()V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->initialized:Z

    if-nez v0, :cond_35

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;

    if-eqz v0, :cond_1d

    invoke-interface {v0}, Lorg/jasypt/encryption/pbe/config/PBEConfig;->getPoolSize()Ljava/lang/Integer;

    move-result-object v0

    iget-boolean v1, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSizeSet:Z

    if-nez v1, :cond_19

    if-nez v0, :cond_14

    goto :goto_19

    :cond_14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1b

    :cond_19
    :goto_19
    iget v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSize:I

    :goto_1b
    iput v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSize:I

    :cond_1d
    iget v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSize:I

    if-lez v0, :cond_2d

    iget-object v1, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->cloneAndInitializeEncryptor(I)[Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->pool:[Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->initialized:Z

    goto :goto_35

    :cond_2d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Pool size must be set and > 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_35
    .catchall {:try_start_1 .. :try_end_35} :catchall_37

    :cond_35
    :goto_35
    monitor-exit p0

    return-void

    :catchall_37
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isInitialized()Z
    .registers 2

    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->initialized:Z

    return v0
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized setConfig(Lorg/jasypt/encryption/pbe/config/PBEConfig;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setConfig(Lorg/jasypt/encryption/pbe/config/PBEConfig;)V

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->config:Lorg/jasypt/encryption/pbe/config/PBEConfig;
    :try_end_8
    .catchall {:try_start_1 .. :try_end_8} :catchall_a

    monitor-exit p0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setKeyObtentionIterations(I)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setKeyObtentionIterations(I)V

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setPassword(Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized setPasswordCharArray([C)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setPasswordCharArray([C)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setPoolSize(I)V
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
    const-string v2, "Pool size be > 0"

    invoke-static {v1, v2}, Lorg/jasypt/commons/CommonUtils;->validateIsTrue(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_18

    iput p1, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSize:I

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->poolSizeSet:Z
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

.method public setProvider(Ljava/security/Provider;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setProvider(Ljava/security/Provider;)V

    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setProviderName(Ljava/lang/String;)V

    return-void
.end method

.method public setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/PooledPBEBigIntegerEncryptor;->firstEncryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    return-void
.end method
