.class public final Lorg/jasypt/util/password/rfc2307/RFC2307SMD5PasswordEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/util/password/PasswordEncryptor;


# instance fields
.field private final digester:Lorg/jasypt/digest/StandardStringDigester;


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/digest/StandardStringDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardStringDigester;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/password/rfc2307/RFC2307SMD5PasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    const-string v1, "MD5"

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setAlgorithm(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setIterations(I)V

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lorg/jasypt/digest/StandardStringDigester;->setSaltSizeBytes(I)V

    const-string v2, "{SMD5}"

    invoke-virtual {v0, v2}, Lorg/jasypt/digest/StandardStringDigester;->setPrefix(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setInvertPositionOfSaltInMessageBeforeDigesting(Z)V

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setInvertPositionOfPlainSaltInEncryptionResults(Z)V

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setUseLenientSaltSizeCheck(Z)V

    return-void
.end method


# virtual methods
.method public checkPassword(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 4

    iget-object v0, p0, Lorg/jasypt/util/password/rfc2307/RFC2307SMD5PasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1, p2}, Lorg/jasypt/digest/StandardStringDigester;->matches(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public encryptPassword(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/password/rfc2307/RFC2307SMD5PasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->digest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public setSaltSizeBytes(I)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/password/rfc2307/RFC2307SMD5PasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setSaltSizeBytes(I)V

    return-void
.end method

.method public setStringOutputType(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/password/rfc2307/RFC2307SMD5PasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setStringOutputType(Ljava/lang/String;)V

    return-void
.end method
