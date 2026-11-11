.class public Lorg/jasypt/digest/config/SimpleStringDigesterConfig;
.super Lorg/jasypt/digest/config/SimpleDigesterConfig;
.source ""

# interfaces
.implements Lorg/jasypt/digest/config/StringDigesterConfig;


# instance fields
.field private prefix:Ljava/lang/String;

.field private stringOutputType:Ljava/lang/String;

.field private suffix:Ljava/lang/String;

.field private unicodeNormalizationIgnored:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lorg/jasypt/digest/config/SimpleDigesterConfig;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->prefix:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->suffix:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getPrefix()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->prefix:Ljava/lang/String;

    return-object v0
.end method

.method public getStringOutputType()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    return-object v0
.end method

.method public getSuffix()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->suffix:Ljava/lang/String;

    return-object v0
.end method

.method public isUnicodeNormalizationIgnored()Ljava/lang/Boolean;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setPrefix(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->prefix:Ljava/lang/String;

    return-void
.end method

.method public setStringOutputType(Ljava/lang/String;)V
    .registers 2

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->stringOutputType:Ljava/lang/String;

    return-void
.end method

.method public setSuffix(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->suffix:Ljava/lang/String;

    return-void
.end method

.method public setUnicodeNormalizationIgnored(Ljava/lang/Boolean;)V
    .registers 2

    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    return-void
.end method

.method public setUnicodeNormalizationIgnored(Ljava/lang/String;)V
    .registers 2

    if-eqz p1, :cond_7

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_8

    :cond_7
    const/4 p1, 0x0

    :goto_8
    iput-object p1, p0, Lorg/jasypt/digest/config/SimpleStringDigesterConfig;->unicodeNormalizationIgnored:Ljava/lang/Boolean;

    return-void
.end method
