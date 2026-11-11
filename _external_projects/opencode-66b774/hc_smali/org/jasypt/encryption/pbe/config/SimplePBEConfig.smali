.class public Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/encryption/pbe/config/PBEConfig;
.implements Lorg/jasypt/encryption/pbe/config/PBECleanablePasswordConfig;


# instance fields
.field private algorithm:Ljava/lang/String;

.field private keyObtentionIterations:Ljava/lang/Integer;

.field private password:[C

.field private passwordCleaned:Z

.field private poolSize:Ljava/lang/Integer;

.field private provider:Ljava/security/Provider;

.field private providerName:Ljava/lang/String;

.field private saltGenerator:Lorg/jasypt/salt/SaltGenerator;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->algorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->keyObtentionIterations:Ljava/lang/Integer;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->providerName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->provider:Ljava/security/Provider;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->poolSize:Ljava/lang/Integer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->passwordCleaned:Z

    return-void
.end method


# virtual methods
.method public cleanPassword()V
    .registers 5

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    if-eqz v0, :cond_14

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v0, :cond_10

    iget-object v3, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    aput-char v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_10
    new-array v0, v1, [C

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    :cond_14
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->passwordCleaned:Z

    return-void
.end method

.method public getAlgorithm()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->algorithm:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyObtentionIterations()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->keyObtentionIterations:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .registers 3

    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->passwordCleaned:Z

    if-nez v0, :cond_c

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0

    :cond_c
    new-instance v0, Lorg/jasypt/exceptions/PasswordAlreadyCleanedException;

    invoke-direct {v0}, Lorg/jasypt/exceptions/PasswordAlreadyCleanedException;-><init>()V

    throw v0
.end method

.method public getPasswordCharArray()[C
    .registers 5

    iget-boolean v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->passwordCleaned:Z

    if-nez v0, :cond_f

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    array-length v1, v0

    new-array v1, v1, [C

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    :cond_f
    new-instance v0, Lorg/jasypt/exceptions/PasswordAlreadyCleanedException;

    invoke-direct {v0}, Lorg/jasypt/exceptions/PasswordAlreadyCleanedException;-><init>()V

    throw v0
.end method

.method public getPoolSize()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->poolSize:Ljava/lang/Integer;

    return-object v0
.end method

.method public getProvider()Ljava/security/Provider;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->provider:Ljava/security/Provider;

    return-object v0
.end method

.method public getProviderName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->providerName:Ljava/lang/String;

    return-object v0
.end method

.method public getSaltGenerator()Lorg/jasypt/salt/SaltGenerator;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    return-object v0
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->algorithm:Ljava/lang/String;

    return-void
.end method

.method public setKeyObtentionIterations(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->keyObtentionIterations:Ljava/lang/Integer;

    return-void
.end method

.method public setKeyObtentionIterations(Ljava/lang/String;)V
    .registers 3

    if-eqz p1, :cond_11

    :try_start_2
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->keyObtentionIterations:Ljava/lang/Integer;
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

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->keyObtentionIterations:Ljava/lang/Integer;

    :goto_14
    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->cleanPassword()V

    :cond_7
    if-nez p1, :cond_d

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    goto :goto_13

    :cond_d
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    :goto_13
    return-void
.end method

.method public setPasswordCharArray([C)V
    .registers 5

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->cleanPassword()V

    :cond_7
    if-nez p1, :cond_d

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    goto :goto_17

    :cond_d
    array-length v0, p1

    new-array v0, v0, [C

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->password:[C

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_17
    return-void
.end method

.method public setPoolSize(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->poolSize:Ljava/lang/Integer;

    return-void
.end method

.method public setPoolSize(Ljava/lang/String;)V
    .registers 3

    if-eqz p1, :cond_11

    :try_start_2
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->poolSize:Ljava/lang/Integer;
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

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->poolSize:Ljava/lang/Integer;

    :goto_14
    return-void
.end method

.method public setProvider(Ljava/security/Provider;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->provider:Ljava/security/Provider;

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

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->provider:Ljava/security/Provider;
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

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->provider:Ljava/security/Provider;

    :goto_21
    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->providerName:Ljava/lang/String;

    return-void
.end method

.method public setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

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

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;
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

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->saltGenerator:Lorg/jasypt/salt/SaltGenerator;

    :goto_21
    return-void
.end method
