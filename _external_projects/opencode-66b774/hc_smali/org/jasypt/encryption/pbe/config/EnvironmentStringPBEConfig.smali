.class public Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;
.super Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;
.source ""

# interfaces
.implements Lorg/jasypt/encryption/pbe/config/StringPBEConfig;


# instance fields
.field private stringOutputType:Ljava/lang/String;

.field private stringOutputTypeEnvName:Ljava/lang/String;

.field private stringOutputTypeSysPropertyName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputType:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getStringOutputType()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputType:Ljava/lang/String;

    return-object v0
.end method

.method public getStringOutputTypeEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getStringOutputTypeSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public setStringOutputType(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputType:Ljava/lang/String;

    return-void
.end method

.method public setStringOutputTypeEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputType:Ljava/lang/String;

    goto :goto_14

    :cond_8
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputType:Ljava/lang/String;

    :goto_14
    return-void
.end method

.method public setStringOutputTypeSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputType:Ljava/lang/String;

    goto :goto_14

    :cond_8
    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->stringOutputType:Ljava/lang/String;

    :goto_14
    return-void
.end method
