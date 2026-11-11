.class public final Lorg/jasypt/util/numeric/StrongDecimalNumberEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/util/numeric/DecimalNumberEncryptor;


# instance fields
.field private final encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;

    invoke-direct {v0}, Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/numeric/StrongDecimalNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;

    const-string v1, "PBEWithMD5AndTripleDES"

    invoke-virtual {v0, v1}, Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public decrypt(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/numeric/StrongDecimalNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;->decrypt(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public encrypt(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/numeric/StrongDecimalNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;->encrypt(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public setPassword(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/numeric/StrongDecimalNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;->setPassword(Ljava/lang/String;)V

    return-void
.end method

.method public setPasswordCharArray([C)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/numeric/StrongDecimalNumberEncryptor;->encryptor:Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;

    invoke-virtual {v0, p1}, Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;->setPasswordCharArray([C)V

    return-void
.end method
