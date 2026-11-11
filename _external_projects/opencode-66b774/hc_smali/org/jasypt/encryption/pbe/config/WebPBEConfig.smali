.class public Lorg/jasypt/encryption/pbe/config/WebPBEConfig;
.super Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;
.source ""


# instance fields
.field private name:Ljava/lang/String;

.field private validationWord:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->name:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->validationWord:Ljava/lang/String;

    invoke-static {}, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->getInstance()Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->registerConfig(Lorg/jasypt/encryption/pbe/config/WebPBEConfig;)V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getValidationWord()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->validationWord:Ljava/lang/String;

    return-object v0
.end method

.method public isComplete()Z
    .registers 2

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->name:Ljava/lang/String;

    invoke-static {v0}, Lorg/jasypt/commons/CommonUtils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->validationWord:Ljava/lang/String;

    invoke-static {v0}, Lorg/jasypt/commons/CommonUtils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    return v0
.end method

.method public setName(Ljava/lang/String;)V
    .registers 3

    const-string v0, "Name cannot be set empty"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->name:Ljava/lang/String;

    return-void
.end method

.method public setValidationWord(Ljava/lang/String;)V
    .registers 3

    const-string v0, "Validation word cannot be set empty"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->validationWord:Ljava/lang/String;

    return-void
.end method
