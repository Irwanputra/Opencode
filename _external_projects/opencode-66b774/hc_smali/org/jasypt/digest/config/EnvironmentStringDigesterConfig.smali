.class public Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;
.super Lorg/jasypt/digest/config/EnvironmentDigesterConfig;
.source ""

# interfaces
.implements Lorg/jasypt/digest/config/StringDigesterConfig;


# instance fields
.field private prefix:Ljava/lang/String;

.field private prefixEnvName:Ljava/lang/String;

.field private prefixSysPropertyName:Ljava/lang/String;

.field private stringOutputType:Ljava/lang/String;

.field private stringOutputTypeEnvName:Ljava/lang/String;

.field private stringOutputTypeSysPropertyName:Ljava/lang/String;

.field private suffix:Ljava/lang/String;

.field private suffixEnvName:Ljava/lang/String;

.field private suffixSysPropertyName:Ljava/lang/String;

.field private unicodeNormalizationIgnored:Ljava/lang/Boolean;

.field private unicodeNormalizationIgnoredEnvName:Ljava/lang/String;

.field private unicodeNormalizationIgnoredSysPropertyName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefix:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffix:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixSysPropertyName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixSysPropertyName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getPrefix()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefix:Ljava/lang/String;

    return-object v0
.end method

.method public getPrefixEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getPrefixSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getStringOutputType()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    return-object v0
.end method

.method public getStringOutputTypeEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getStringOutputTypeSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getSuffix()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffix:Ljava/lang/String;

    return-object v0
.end method

.method public getSuffixEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getSuffixSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getUnicodeNormalizationIgnoredEnvName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredEnvName:Ljava/lang/String;

    return-object v0
.end method

.method public getUnicodeNormalizationIgnoredSysPropertyName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredSysPropertyName:Ljava/lang/String;

    return-object v0
.end method

.method public isUnicodeNormalizationIgnored()Ljava/lang/Boolean;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setPrefix(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixSysPropertyName:Ljava/lang/String;

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefix:Ljava/lang/String;

    return-void
.end method

.method public setPrefixEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefix:Ljava/lang/String;

    goto :goto_10

    :cond_8
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefix:Ljava/lang/String;

    :goto_10
    return-void
.end method

.method public setPrefixSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefix:Ljava/lang/String;

    goto :goto_10

    :cond_8
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefixEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->prefix:Ljava/lang/String;

    :goto_10
    return-void
.end method

.method public setStringOutputType(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    return-void
.end method

.method public setStringOutputTypeEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    goto :goto_14

    :cond_8
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    :goto_14
    return-void
.end method

.method public setStringOutputTypeSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    goto :goto_14

    :cond_8
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputTypeEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    :goto_14
    return-void
.end method

.method public setSuffix(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixSysPropertyName:Ljava/lang/String;

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffix:Ljava/lang/String;

    return-void
.end method

.method public setSuffixEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffix:Ljava/lang/String;

    goto :goto_10

    :cond_8
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffix:Ljava/lang/String;

    :goto_10
    return-void
.end method

.method public setSuffixSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffix:Ljava/lang/String;

    goto :goto_10

    :cond_8
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffixEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->suffix:Ljava/lang/String;

    :goto_10
    return-void
.end method

.method public setUnicodeNormalizationIgnored(Ljava/lang/Boolean;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredSysPropertyName:Ljava/lang/String;

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    return-void
.end method

.method public setUnicodeNormalizationIgnored(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredEnvName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredSysPropertyName:Ljava/lang/String;

    if-eqz p1, :cond_e

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    goto :goto_10

    :cond_e
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    :goto_10
    return-void
.end method

.method public setUnicodeNormalizationIgnoredEnvName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredEnvName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    :cond_5
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    goto :goto_16

    :cond_8
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredSysPropertyName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    :goto_16
    return-void
.end method

.method public setUnicodeNormalizationIgnoredSysPropertyName(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredSysPropertyName:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_8

    :cond_5
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    goto :goto_16

    :cond_8
    iput-object v0, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnoredEnvName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    :goto_16
    return-void
.end method
