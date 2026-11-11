.class public Lorg/jasypt/digest/PooledStringDigester;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/digest/StringDigester;


# instance fields
.field private config:Lorg/jasypt/digest/config/DigesterConfig;

.field private final firstDigester:Lorg/jasypt/digest/StandardStringDigester;

.field private initialized:Z

.field private pool:[Lorg/jasypt/digest/StandardStringDigester;

.field private poolSize:I

.field private poolSizeSet:Z

.field private roundRobin:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    const/4 v0, 0x0

    iput v0, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSize:I

    iput-boolean v0, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSizeSet:Z

    iput v0, p0, Lorg/jasypt/digest/PooledStringDigester;->roundRobin:I

    iput-boolean v0, p0, Lorg/jasypt/digest/PooledStringDigester;->initialized:Z

    new-instance v0, Lorg/jasypt/digest/StandardStringDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardStringDigester;-><init>()V

    iput-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    return-void
.end method


# virtual methods
.method public digest(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    invoke-virtual {p0}, Lorg/jasypt/digest/PooledStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lorg/jasypt/digest/PooledStringDigester;->initialize()V

    :cond_9
    monitor-enter p0

    :try_start_a
    iget v0, p0, Lorg/jasypt/digest/PooledStringDigester;->roundRobin:I

    add-int/lit8 v1, v0, 0x1

    iget v2, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSize:I

    rem-int/2addr v1, v2

    iput v1, p0, Lorg/jasypt/digest/PooledStringDigester;->roundRobin:I

    monitor-exit p0
    :try_end_14
    .catchall {:try_start_a .. :try_end_14} :catchall_1d

    iget-object v1, p0, Lorg/jasypt/digest/PooledStringDigester;->pool:[Lorg/jasypt/digest/StandardStringDigester;

    aget-object v0, v1, v0

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->digest(Ljava/lang/String;)Ljava/lang/String;

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
    .registers 5

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lorg/jasypt/digest/PooledStringDigester;->initialized:Z

    if-nez v0, :cond_4a

    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;

    if-eqz v0, :cond_1d

    invoke-interface {v0}, Lorg/jasypt/digest/config/DigesterConfig;->getPoolSize()Ljava/lang/Integer;

    move-result-object v0

    iget-boolean v1, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSizeSet:Z

    if-nez v1, :cond_19

    if-nez v0, :cond_14

    goto :goto_19

    :cond_14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1b

    :cond_19
    :goto_19
    iget v0, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSize:I

    :goto_1b
    iput v0, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSize:I

    :cond_1d
    iget v0, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSize:I

    if-lez v0, :cond_42

    new-array v0, v0, [Lorg/jasypt/digest/StandardStringDigester;

    iput-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->pool:[Lorg/jasypt/digest/StandardStringDigester;

    const/4 v1, 0x0

    iget-object v2, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    aput-object v2, v0, v1

    const/4 v0, 0x1

    const/4 v1, 0x1

    :goto_2c
    iget v2, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSize:I

    if-ge v1, v2, :cond_3f

    iget-object v2, p0, Lorg/jasypt/digest/PooledStringDigester;->pool:[Lorg/jasypt/digest/StandardStringDigester;

    add-int/lit8 v3, v1, -0x1

    aget-object v3, v2, v3

    invoke-virtual {v3}, Lorg/jasypt/digest/StandardStringDigester;->cloneDigester()Lorg/jasypt/digest/StandardStringDigester;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2c

    :cond_3f
    iput-boolean v0, p0, Lorg/jasypt/digest/PooledStringDigester;->initialized:Z

    goto :goto_4a

    :cond_42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Pool size must be set and > 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4a
    .catchall {:try_start_1 .. :try_end_4a} :catchall_4c

    :cond_4a
    :goto_4a
    monitor-exit p0

    return-void

    :catchall_4c
    move-exception v0

    monitor-exit p0

    goto :goto_50

    :goto_4f
    throw v0

    :goto_50
    goto :goto_4f
.end method

.method public isInitialized()Z
    .registers 2

    iget-boolean v0, p0, Lorg/jasypt/digest/PooledStringDigester;->initialized:Z

    return v0
.end method

.method public matches(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 6

    invoke-virtual {p0}, Lorg/jasypt/digest/PooledStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lorg/jasypt/digest/PooledStringDigester;->initialize()V

    :cond_9
    monitor-enter p0

    :try_start_a
    iget v0, p0, Lorg/jasypt/digest/PooledStringDigester;->roundRobin:I

    add-int/lit8 v1, v0, 0x1

    iget v2, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSize:I

    rem-int/2addr v1, v2

    iput v1, p0, Lorg/jasypt/digest/PooledStringDigester;->roundRobin:I

    monitor-exit p0
    :try_end_14
    .catchall {:try_start_a .. :try_end_14} :catchall_1d

    iget-object v1, p0, Lorg/jasypt/digest/PooledStringDigester;->pool:[Lorg/jasypt/digest/StandardStringDigester;

    aget-object v0, v1, v0

    invoke-virtual {v0, p1, p2}, Lorg/jasypt/digest/StandardStringDigester;->matches(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1

    :catchall_1d
    move-exception p1

    :try_start_1e
    monitor-exit p0
    :try_end_1f
    .catchall {:try_start_1e .. :try_end_1f} :catchall_1d

    throw p1
.end method

.method public declared-synchronized setAlgorithm(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setAlgorithm(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setConfig(Lorg/jasypt/digest/config/DigesterConfig;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setConfig(Lorg/jasypt/digest/config/DigesterConfig;)V

    iput-object p1, p0, Lorg/jasypt/digest/PooledStringDigester;->config:Lorg/jasypt/digest/config/DigesterConfig;
    :try_end_8
    .catchall {:try_start_1 .. :try_end_8} :catchall_a

    monitor-exit p0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setInvertPositionOfPlainSaltInEncryptionResults(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setInvertPositionOfPlainSaltInEncryptionResults(Z)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setInvertPositionOfSaltInMessageBeforeDigesting(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setInvertPositionOfSaltInMessageBeforeDigesting(Z)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setIterations(I)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setIterations(I)V
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

    invoke-virtual {p0}, Lorg/jasypt/digest/PooledStringDigester;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_18

    iput p1, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSize:I

    iput-boolean v0, p0, Lorg/jasypt/digest/PooledStringDigester;->poolSizeSet:Z
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

.method public declared-synchronized setPrefix(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setPrefix(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setProvider(Ljava/security/Provider;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setProvider(Ljava/security/Provider;)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setProviderName(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setProviderName(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSaltSizeBytes(I)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setSaltSizeBytes(I)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setStringOutputType(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setStringOutputType(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSuffix(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setSuffix(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setUnicodeNormalizationIgnored(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setUnicodeNormalizationIgnored(Z)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setUseLenientSaltSizeCheck(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/PooledStringDigester;->firstDigester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setUseLenientSaltSizeCheck(Z)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method
