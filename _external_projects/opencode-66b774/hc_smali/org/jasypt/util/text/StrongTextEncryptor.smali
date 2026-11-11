.class public final Lorg/jasypt/util/text/StrongTextEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/util/text/TextEncryptor;


# instance fields
.field private final encryptor:Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    invoke-direct {v0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/text/StrongTextEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    const-string v1, "PBEWithMD5AndTripleDES"

    invoke-virtual {v0, v1}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public decrypt(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/text/StrongTextEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->decrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public encrypt(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/text/StrongTextEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/text/StrongTextEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->setPassword(Ljava/lang/String;)V

    return-void
.end method

.method public setPasswordCharArray([C)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/text/StrongTextEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->setPasswordCharArray([C)V

    return-void
.end method
