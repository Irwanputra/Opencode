.class public Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;
.super Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;
.source ""


# instance fields
.field private algorithmEnvName:Ljava/lang/String;

.field private algorithmSysPropertyName:Ljava/lang/String;

.field private keyObtentionIterationsEnvName:Ljava/lang/String;

.field private keyObtentionIterationsSysPropertyName:Ljava/lang/String;

.field private passwordEnvName:Ljava/lang/String;

.field private passwordSysPropertyName:Ljava/lang/String;

.field private poolSizeEnvName:Ljava/lang/String;

.field private poolSizeSysPropertyName:Ljava/lang/String;

.field private providerClassNameEnvName:Ljava/lang/String;

.field private providerClassNameSysPropertyName:Ljava/lang/String;

.field private providerNameEnvName:Ljava/lang/String;

.field private providerNameSysPropertyName:Ljava/lang/String;

.field private saltGeneratorClassNameEnvName:Ljava/lang/String;

.field private saltGeneratorClassNameSysPropertyName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAlgorithmEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getAlgorithmSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyObtentionIterationsEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyObtentionIterationsSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getPasswordEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getPasswordSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getPoolSizeEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getPoolSizeSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderClassNameEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderClassNameSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderNameEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderNameSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getSaltGeneratorClassNameEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getSaltGeneratorClassNameSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method

.method public setAlgorithmEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setAlgorithm(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setAlgorithm(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setAlgorithmSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setAlgorithm(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->algorithmEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setAlgorithm(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setKeyObtentionIterations(Ljava/lang/Integer;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setKeyObtentionIterations(Ljava/lang/Integer;)V

    return-void
.end method

.method public setKeyObtentionIterations(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setKeyObtentionIterations(Ljava/lang/String;)V

    return-void
.end method

.method public setKeyObtentionIterationsEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setKeyObtentionIterations(Ljava/lang/Integer;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setKeyObtentionIterations(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setKeyObtentionIterationsSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setKeyObtentionIterations(Ljava/lang/Integer;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->keyObtentionIterationsEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setKeyObtentionIterations(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPassword(Ljava/lang/String;)V

    return-void
.end method

.method public setPasswordCharArray([C)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPasswordCharArray([C)V

    return-void
.end method

.method public setPasswordEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPassword(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPassword(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setPasswordSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPassword(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->passwordEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPassword(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setPoolSize(Ljava/lang/Integer;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPoolSize(Ljava/lang/Integer;)V

    return-void
.end method

.method public setPoolSize(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPoolSize(Ljava/lang/String;)V

    return-void
.end method

.method public setPoolSizeEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPoolSize(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPoolSize(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setPoolSizeSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPoolSize(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->poolSizeEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPoolSize(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setProvider(Ljava/security/Provider;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProvider(Ljava/security/Provider;)V

    return-void
.end method

.method public setProviderClassName(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProviderClassName(Ljava/lang/String;)V

    return-void
.end method

.method public setProviderClassNameEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProvider(Ljava/security/Provider;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProviderClassName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setProviderClassNameSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProvider(Ljava/security/Provider;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerClassNameEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProviderClassName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProviderName(Ljava/lang/String;)V

    return-void
.end method

.method public setProviderNameEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProviderName(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProviderName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setProviderNameSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProviderName(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->providerNameEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setProviderName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    return-void
.end method

.method public setSaltGeneratorClassName(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setSaltGeneratorClassName(Ljava/lang/String;)V

    return-void
.end method

.method public setSaltGeneratorClassNameEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setSaltGeneratorClassName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setSaltGeneratorClassNameSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setSaltGeneratorClassName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method
