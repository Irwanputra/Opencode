.class public interface abstract Lorg/jasypt/digest/config/DigesterConfig;
.super Ljava/lang/Object;
.source ""


# virtual methods
.method public abstract getAlgorithm()Ljava/lang/String;
.end method

.method public abstract getInvertPositionOfPlainSaltInEncryptionResults()Ljava/lang/Boolean;
.end method

.method public abstract getInvertPositionOfSaltInMessageBeforeDigesting()Ljava/lang/Boolean;
.end method

.method public abstract getIterations()Ljava/lang/Integer;
.end method

.method public abstract getPoolSize()Ljava/lang/Integer;
.end method

.method public abstract getProvider()Ljava/security/Provider;
.end method

.method public abstract getProviderName()Ljava/lang/String;
.end method

.method public abstract getSaltGenerator()Lorg/jasypt/salt/SaltGenerator;
.end method

.method public abstract getSaltSizeBytes()Ljava/lang/Integer;
.end method

.method public abstract getUseLenientSaltSizeCheck()Ljava/lang/Boolean;
.end method
