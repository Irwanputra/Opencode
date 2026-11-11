.class public Lorg/jasypt/encryption/pbe/config/WebStringPBEConfig;
.super Lorg/jasypt/encryption/pbe/config/WebPBEConfig;
.source ""

# interfaces
.implements Lorg/jasypt/encryption/pbe/config/StringPBEConfig;


# instance fields
.field private stringOutputType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/WebStringPBEConfig;->stringOutputType:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getStringOutputType()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/WebStringPBEConfig;->stringOutputType:Ljava/lang/String;

    return-object v0
.end method

.method public setStringOutputType(Ljava/lang/String;)V
    .registers 2

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/WebStringPBEConfig;->stringOutputType:Ljava/lang/String;

    return-void
.end method
