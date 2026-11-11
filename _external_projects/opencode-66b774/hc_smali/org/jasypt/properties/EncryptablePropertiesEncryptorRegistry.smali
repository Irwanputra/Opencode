.class public final Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final instance:Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;


# instance fields
.field private final stringEncryptors:Ljava/util/Map;

.field private final textEncryptors:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;

    invoke-direct {v0}, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;-><init>()V

    sput-object v0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->instance:Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->stringEncryptors:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->textEncryptors:Ljava/util/Map;

    return-void
.end method

.method public static getInstance()Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;
    .registers 1

    sget-object v0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->instance:Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;

    return-object v0
.end method


# virtual methods
.method public getStringEncryptor(Lorg/jasypt/properties/EncryptableProperties;)Lorg/jasypt/encryption/StringEncryptor;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->stringEncryptors:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/jasypt/properties/EncryptableProperties;->getIdent()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jasypt/encryption/StringEncryptor;

    return-object p1
.end method

.method public getTextEncryptor(Lorg/jasypt/properties/EncryptableProperties;)Lorg/jasypt/util/text/TextEncryptor;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->textEncryptors:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/jasypt/properties/EncryptableProperties;->getIdent()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jasypt/util/text/TextEncryptor;

    return-object p1
.end method

.method public removeEntries(Lorg/jasypt/properties/EncryptableProperties;)V
    .registers 4

    iget-object v0, p0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->stringEncryptors:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/jasypt/properties/EncryptableProperties;->getIdent()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->textEncryptors:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/jasypt/properties/EncryptableProperties;->getIdent()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setStringEncryptor(Lorg/jasypt/properties/EncryptableProperties;Lorg/jasypt/encryption/StringEncryptor;)V
    .registers 4

    iget-object v0, p0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->stringEncryptors:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/jasypt/properties/EncryptableProperties;->getIdent()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setTextEncryptor(Lorg/jasypt/properties/EncryptableProperties;Lorg/jasypt/util/text/TextEncryptor;)V
    .registers 4

    iget-object v0, p0, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->textEncryptors:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/jasypt/properties/EncryptableProperties;->getIdent()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
