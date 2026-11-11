.class public final Lorg/jasypt/util/numeric/StrongIntegerNumberEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/util/numeric/IntegerNumberEncryptor;


# instance fields
.field private final encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-direct {v0}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/numeric/StrongIntegerNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    const-string v1, "PBEWithMD5AndTripleDES"

    invoke-virtual {v0, v1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public decrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/numeric/StrongIntegerNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->decrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1
.end method

.method public encrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/numeric/StrongIntegerNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->encrypt(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/numeric/StrongIntegerNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setPassword(Ljava/lang/String;)V

    return-void
.end method

.method public setPasswordCharArray([C)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/numeric/StrongIntegerNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;->setPasswordCharArray([C)V

    return-void
.end method
