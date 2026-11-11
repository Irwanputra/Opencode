.class public final Lorg/jasypt/util/binary/StrongBinaryEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/util/binary/BinaryEncryptor;


# instance fields
.field private final encryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-direct {v0}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/binary/StrongBinaryEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    const-string v1, "PBEWithMD5AndTripleDES"

    invoke-virtual {v0, v1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public decrypt([B)[B
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/binary/StrongBinaryEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->decrypt([B)[B

    move-result-object p1

    return-object p1
.end method

.method public encrypt([B)[B
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/binary/StrongBinaryEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->encrypt([B)[B

    move-result-object p1

    return-object p1
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/binary/StrongBinaryEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setPassword(Ljava/lang/String;)V

    return-void
.end method

.method public setPasswordCharArray([C)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/binary/StrongBinaryEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEByteEncryptor;->setPasswordCharArray([C)V

    return-void
.end method
