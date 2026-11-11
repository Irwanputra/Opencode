.class public Lorg/jasypt/digest/config/EnvironmentDigesterConfig;
.super Lorg/jasypt/digest/config/SimpleDigesterConfig;
.source ""


# instance fields
.field private algorithmEnvName:Ljava/lang/String;

.field private algorithmSysPropertyName:Ljava/lang/String;

.field private invertPositionOfPlainSaltInEncryptionResultsEnvName:Ljava/lang/String;

.field private invertPositionOfPlainSaltInEncryptionResultsSysPropertyName:Ljava/lang/String;

.field private invertPositionOfSaltInMessageBeforeDigestingEnvName:Ljava/lang/String;

.field private invertPositionOfSaltInMessageBeforeDigestingSysPropertyName:Ljava/lang/String;

.field private iterationsEnvName:Ljava/lang/String;

.field private iterationsSysPropertyName:Ljava/lang/String;

.field private poolSizeEnvName:Ljava/lang/String;

.field private poolSizeSysPropertyName:Ljava/lang/String;

.field private providerClassNameEnvName:Ljava/lang/String;

.field private providerClassNameSysPropertyName:Ljava/lang/String;

.field private providerNameEnvName:Ljava/lang/String;

.field private providerNameSysPropertyName:Ljava/lang/String;

.field private saltGeneratorClassNameEnvName:Ljava/lang/String;

.field private saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

.field private saltSizeBytesEnvName:Ljava/lang/String;

.field private saltSizeBytesSysPropertyName:Ljava/lang/String;

.field private useLenientSaltSizeCheckEnvName:Ljava/lang/String;

.field private useLenientSaltSizeCheckSysPropertyName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAlgorithmEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getAlgorithmSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getInvertPositionOfPlainSaltInEncryptionResultsEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getInvertPositionOfPlainSaltInEncryptionResultsSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getInvertPositionOfSaltInMessageBeforeDigestingEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getInvertPositionOfSaltInMessageBeforeDigestingSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getIterationsEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getIterationsSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getPoolSizeEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getPoolSizeSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderClassNameEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderClassNameSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderNameEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderNameSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getSaltGeneratorClassNameEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getSaltGeneratorClassNameSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getSaltSizeBytesEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getSaltSizeBytesSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getUseLenientSaltSizeCheckEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getUseLenientSaltSizeCheckSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method

.method public setAlgorithmEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setAlgorithm(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setAlgorithm(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setAlgorithmSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setAlgorithm(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->algorithmEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setAlgorithm(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setInvertPositionOfPlainSaltInEncryptionResults(Ljava/lang/Boolean;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfPlainSaltInEncryptionResults(Ljava/lang/Boolean;)V

    return-void
.end method

.method public setInvertPositionOfPlainSaltInEncryptionResultsEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfPlainSaltInEncryptionResults(Ljava/lang/Boolean;)V

    goto :goto_16

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfPlainSaltInEncryptionResults(Ljava/lang/Boolean;)V

    :goto_16
    return-void
.end method

.method public setInvertPositionOfPlainSaltInEncryptionResultsSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfPlainSaltInEncryptionResults(Ljava/lang/Boolean;)V

    goto :goto_16

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfPlainSaltInEncryptionResultsEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfPlainSaltInEncryptionResults(Ljava/lang/Boolean;)V

    :goto_16
    return-void
.end method

.method public setInvertPositionOfSaltInMessageBeforeDigesting(Ljava/lang/Boolean;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfSaltInMessageBeforeDigesting(Ljava/lang/Boolean;)V

    return-void
.end method

.method public setInvertPositionOfSaltInMessageBeforeDigestingEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfSaltInMessageBeforeDigesting(Ljava/lang/Boolean;)V

    goto :goto_16

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfSaltInMessageBeforeDigesting(Ljava/lang/Boolean;)V

    :goto_16
    return-void
.end method

.method public setInvertPositionOfSaltInMessageBeforeDigestingSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfSaltInMessageBeforeDigesting(Ljava/lang/Boolean;)V

    goto :goto_16

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->invertPositionOfSaltInMessageBeforeDigestingEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setInvertPositionOfSaltInMessageBeforeDigesting(Ljava/lang/Boolean;)V

    :goto_16
    return-void
.end method

.method public setIterations(Ljava/lang/Integer;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setIterations(Ljava/lang/Integer;)V

    return-void
.end method

.method public setIterations(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setIterations(Ljava/lang/String;)V

    return-void
.end method

.method public setIterationsEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setIterations(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setIterations(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setIterationsSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setIterations(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->iterationsEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setIterations(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setPoolSize(Ljava/lang/Integer;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setPoolSize(Ljava/lang/Integer;)V

    return-void
.end method

.method public setPoolSize(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setPoolSize(Ljava/lang/String;)V

    return-void
.end method

.method public setPoolSizeEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setPoolSize(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setPoolSize(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setPoolSizeSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setPoolSize(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->poolSizeEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setPoolSize(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setProvider(Ljava/security/Provider;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProvider(Ljava/security/Provider;)V

    return-void
.end method

.method public setProviderClassName(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProviderClassName(Ljava/lang/String;)V

    return-void
.end method

.method public setProviderClassNameEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProvider(Ljava/security/Provider;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProviderClassName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setProviderClassNameSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProvider(Ljava/security/Provider;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerClassNameEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProviderClassName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProviderName(Ljava/lang/String;)V

    return-void
.end method

.method public setProviderNameEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProviderName(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProviderName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setProviderNameSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProviderName(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->providerNameEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setProviderName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    return-void
.end method

.method public setSaltGeneratorClassName(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltGeneratorClassName(Ljava/lang/String;)V

    return-void
.end method

.method public setSaltGeneratorClassNameEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltGeneratorClassName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setSaltGeneratorClassNameSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltGeneratorClassNameEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltGeneratorClassName(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setSaltSizeBytes(Ljava/lang/Integer;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltSizeBytes(Ljava/lang/Integer;)V

    return-void
.end method

.method public setSaltSizeBytes(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltSizeBytes(Ljava/lang/String;)V

    return-void
.end method

.method public setSaltSizeBytesEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltSizeBytes(Ljava/lang/String;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltSizeBytes(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setSaltSizeBytesSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltSizeBytes(Ljava/lang/Integer;)V

    goto :goto_12

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->saltSizeBytesEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setSaltSizeBytes(Ljava/lang/String;)V

    :goto_12
    return-void
.end method

.method public setUseLenientSaltSizeCheck(Ljava/lang/Boolean;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckSysPropertyName:Ljava/lang/String;

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setUseLenientSaltSizeCheck(Ljava/lang/Boolean;)V

    return-void
.end method

.method public setUseLenientSaltSizeCheckEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setUseLenientSaltSizeCheck(Ljava/lang/Boolean;)V

    goto :goto_16

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setUseLenientSaltSizeCheck(Ljava/lang/Boolean;)V

    :goto_16
    return-void
.end method

.method public setUseLenientSaltSizeCheckSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-super {p0, v0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setUseLenientSaltSizeCheck(Ljava/lang/Boolean;)V

    goto :goto_16

    :cond_9
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->useLenientSaltSizeCheckEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-super {p0, p1}, Lorg/jasypt/digest/config/SimpleDigesterConfig;->setUseLenientSaltSizeCheck(Ljava/lang/Boolean;)V

    :goto_16
    return-void
.end method
