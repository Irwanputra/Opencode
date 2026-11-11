.class public Lorg/jasypt/digest/config/SimpleDigesterConfig;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/digest/config/DigesterConfig;


# instance fields
.field private algorithm:Ljava/lang/String;

.field private invertPositionOfPlainSaltInEncryptionResults:Ljava/lang/Boolean;

.field private invertPositionOfSaltInMessageBeforeDigesting:Ljava/lang/Boolean;

.field private iterations:Ljava/lang/Integer;

.field private poolSize:Ljava/lang/Integer;

.field private provider:Ljava/security/Provider;

.field private providerName:Ljava/lang/String;

.field private saltGenerator:Lorg/jasypt/salt/SaltGenerator;

.field private saltSizeBytes:Ljava/lang/Integer;

.field private useLenientSaltSizeCheck:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->algorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->iterations:Ljava/lang/Integer;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltSizeBytes:Ljava/lang/Integer;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->providerName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->provider:Ljava/security/Provider;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->invertPositionOfSaltInMessageBeforeDigesting:Ljava/lang/Boolean;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->invertPositionOfPlainSaltInEncryptionResults:Ljava/lang/Boolean;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->useLenientSaltSizeCheck:Ljava/lang/Boolean;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->poolSize:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getAlgorithm()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->algorithm:Ljava/lang/String;

    return-object v0
.end method

.method public getInvertPositionOfPlainSaltInEncryptionResults()Ljava/lang/Boolean;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->invertPositionOfPlainSaltInEncryptionResults:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getInvertPositionOfSaltInMessageBeforeDigesting()Ljava/lang/Boolean;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->invertPositionOfSaltInMessageBeforeDigesting:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getIterations()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->iterations:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPoolSize()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->poolSize:Ljava/lang/Integer;

    return-object v0
.end method

.method public getProvider()Ljava/security/Provider;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->provider:Ljava/security/Provider;

    return-object v0
.end method

.method public getProviderName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->providerName:Ljava/lang/String;

    return-object v0
.end method

.method public getSaltGenerator()Lorg/jasypt/salt/SaltGenerator;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    return-object v0
.end method

.method public getSaltSizeBytes()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltSizeBytes:Ljava/lang/Integer;

    return-object v0
.end method

.method public getUseLenientSaltSizeCheck()Ljava/lang/Boolean;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->useLenientSaltSizeCheck:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->algorithm:Ljava/lang/String;

    return-void
.end method

.method public setInvertPositionOfPlainSaltInEncryptionResults(Ljava/lang/Boolean;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->invertPositionOfPlainSaltInEncryptionResults:Ljava/lang/Boolean;

    return-void
.end method

.method public setInvertPositionOfSaltInMessageBeforeDigesting(Ljava/lang/Boolean;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->invertPositionOfSaltInMessageBeforeDigesting:Ljava/lang/Boolean;

    return-void
.end method

.method public setIterations(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->iterations:Ljava/lang/Integer;

    return-void
.end method

.method public setIterations(Ljava/lang/String;)V
    .registers 3

    if-eqz p1, :cond_11

    :try_start_2
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->iterations:Ljava/lang/Integer;
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_9} :catch_a

    goto :goto_14

    :catch_a
    move-exception p1

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_11
    const/4 p1, 0x0

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->iterations:Ljava/lang/Integer;

    :goto_14
    return-void
.end method

.method public setPoolSize(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->poolSize:Ljava/lang/Integer;

    return-void
.end method

.method public setPoolSize(Ljava/lang/String;)V
    .registers 3

    if-eqz p1, :cond_11

    :try_start_2
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->poolSize:Ljava/lang/Integer;
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_9} :catch_a

    goto :goto_14

    :catch_a
    move-exception p1

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_11
    const/4 p1, 0x0

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->poolSize:Ljava/lang/Integer;

    :goto_14
    return-void
.end method

.method public setProvider(Ljava/security/Provider;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->provider:Ljava/security/Provider;

    return-void
.end method

.method public setProviderClassName(Ljava/lang/String;)V
    .registers 3

    if-eqz p1, :cond_1e

    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/Provider;

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->provider:Ljava/security/Provider;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_16} :catch_17

    goto :goto_21

    :catch_17
    move-exception p1

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1e
    const/4 p1, 0x0

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->provider:Ljava/security/Provider;

    :goto_21
    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->providerName:Ljava/lang/String;

    return-void
.end method

.method public setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    return-void
.end method

.method public setSaltGeneratorClassName(Ljava/lang/String;)V
    .registers 3

    if-eqz p1, :cond_1e

    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jasypt/salt/SaltGenerator;

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_16} :catch_17

    goto :goto_21

    :catch_17
    move-exception p1

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1e
    const/4 p1, 0x0

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    :goto_21
    return-void
.end method

.method public setSaltSizeBytes(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltSizeBytes:Ljava/lang/Integer;

    return-void
.end method

.method public setSaltSizeBytes(Ljava/lang/String;)V
    .registers 3

    if-eqz p1, :cond_11

    :try_start_2
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltSizeBytes:Ljava/lang/Integer;
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_9} :catch_a

    goto :goto_14

    :catch_a
    move-exception p1

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_11
    const/4 p1, 0x0

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->saltSizeBytes:Ljava/lang/Integer;

    :goto_14
    return-void
.end method

.method public setUseLenientSaltSizeCheck(Ljava/lang/Boolean;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleDigesterConfig;->useLenientSaltSizeCheck:Ljava/lang/Boolean;

    return-void
.end method
