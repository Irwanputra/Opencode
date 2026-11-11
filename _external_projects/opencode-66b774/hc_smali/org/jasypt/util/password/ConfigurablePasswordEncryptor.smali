.class public final Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/util/password/PasswordEncryptor;


# instance fields
.field private final digester:Lorg/jasypt/digest/StandardStringDigester;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/jasypt/digest/StandardStringDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardStringDigester;-><init>()V

    iput-object v0, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    return-void
.end method


# virtual methods
.method public checkPassword(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 4

    iget-object v0, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1, p2}, Lorg/jasypt/digest/StandardStringDigester;->matches(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public encryptPassword(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->digest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method

.method public setConfig(Lorg/jasypt/digest/config/DigesterConfig;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setConfig(Lorg/jasypt/digest/config/DigesterConfig;)V

    return-void
.end method

.method public setPlainDigest(Z)V
    .registers 3

    if-eqz p1, :cond_c

    iget-object p1, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/jasypt/digest/StandardStringDigester;->setIterations(I)V

    iget-object p1, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    const/4 v0, 0x0

    goto :goto_17

    :cond_c
    iget-object p1, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    const/16 v0, 0x3e8

    invoke-virtual {p1, v0}, Lorg/jasypt/digest/StandardStringDigester;->setIterations(I)V

    iget-object p1, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    const/16 v0, 0x8

    :goto_17
    invoke-virtual {p1, v0}, Lorg/jasypt/digest/StandardStringDigester;->setSaltSizeBytes(I)V

    return-void
.end method

.method public setProvider(Ljava/security/Provider;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setProvider(Ljava/security/Provider;)V

    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setProviderName(Ljava/lang/String;)V

    return-void
.end method

.method public setStringOutputType(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/util/password/ConfigurablePasswordEncryptor;->digester:Lorg/jasypt/digest/StandardStringDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardStringDigester;->setStringOutputType(Ljava/lang/String;)V

    return-void
.end method
