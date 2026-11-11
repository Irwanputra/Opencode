.class public final Lorg/jasypt/properties/EncryptableProperties;
.super Ljava/util/Properties;
.source ""


# static fields
.field private static final serialVersionUID:J = 0x59ecdc00112be2dfL


# instance fields
.field private final ident:Ljava/lang/Integer;

.field private transient stringEncryptor:Lorg/jasypt/encryption/StringEncryptor;

.field private transient textEncryptor:Lorg/jasypt/util/text/TextEncryptor;


# direct methods
.method public constructor <init>(Ljava/util/Properties;Lorg/jasypt/encryption/StringEncryptor;)V
    .registers 4

    invoke-direct {p0, p1}, Ljava/util/Properties;-><init>(Ljava/util/Properties;)V

    new-instance p1, Ljava/lang/Integer;

    invoke-static {}, Lorg/jasypt/commons/CommonUtils;->nextRandomInt()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    iput-object p1, p0, Lorg/jasypt/properties/EncryptableProperties;->ident:Ljava/lang/Integer;

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/jasypt/properties/EncryptableProperties;->stringEncryptor:Lorg/jasypt/encryption/StringEncryptor;

    iput-object p1, p0, Lorg/jasypt/properties/EncryptableProperties;->textEncryptor:Lorg/jasypt/util/text/TextEncryptor;

    const-string v0, "Encryptor cannot be null"

    invoke-static {p2, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lorg/jasypt/properties/EncryptableProperties;->stringEncryptor:Lorg/jasypt/encryption/StringEncryptor;

    iput-object p1, p0, Lorg/jasypt/properties/EncryptableProperties;->textEncryptor:Lorg/jasypt/util/text/TextEncryptor;

    return-void
.end method

.method public constructor <init>(Ljava/util/Properties;Lorg/jasypt/util/text/TextEncryptor;)V
    .registers 4

    invoke-direct {p0, p1}, Ljava/util/Properties;-><init>(Ljava/util/Properties;)V

    new-instance p1, Ljava/lang/Integer;

    invoke-static {}, Lorg/jasypt/commons/CommonUtils;->nextRandomInt()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    iput-object p1, p0, Lorg/jasypt/properties/EncryptableProperties;->ident:Ljava/lang/Integer;

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/jasypt/properties/EncryptableProperties;->stringEncryptor:Lorg/jasypt/encryption/StringEncryptor;

    iput-object p1, p0, Lorg/jasypt/properties/EncryptableProperties;->textEncryptor:Lorg/jasypt/util/text/TextEncryptor;

    const-string v0, "Encryptor cannot be null"

    invoke-static {p2, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/jasypt/properties/EncryptableProperties;->stringEncryptor:Lorg/jasypt/encryption/StringEncryptor;

    iput-object p2, p0, Lorg/jasypt/properties/EncryptableProperties;->textEncryptor:Lorg/jasypt/util/text/TextEncryptor;

    return-void
.end method

.method public constructor <init>(Lorg/jasypt/encryption/StringEncryptor;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lorg/jasypt/properties/EncryptableProperties;-><init>(Ljava/util/Properties;Lorg/jasypt/encryption/StringEncryptor;)V

    return-void
.end method

.method public constructor <init>(Lorg/jasypt/util/text/TextEncryptor;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lorg/jasypt/properties/EncryptableProperties;-><init>(Ljava/util/Properties;Lorg/jasypt/util/text/TextEncryptor;)V

    return-void
.end method

.method private declared-synchronized decode(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-static {p1}, Lorg/jasypt/properties/PropertyValueEncryptionUtils;->isEncryptedValue(Ljava/lang/String;)Z

    move-result v0
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_25

    if-nez v0, :cond_9

    monitor-exit p0

    return-object p1

    :cond_9
    :try_start_9
    iget-object v0, p0, Lorg/jasypt/properties/EncryptableProperties;->stringEncryptor:Lorg/jasypt/encryption/StringEncryptor;

    if-eqz v0, :cond_13

    invoke-static {p1, v0}, Lorg/jasypt/properties/PropertyValueEncryptionUtils;->decrypt(Ljava/lang/String;Lorg/jasypt/encryption/StringEncryptor;)Ljava/lang/String;

    move-result-object p1
    :try_end_11
    .catchall {:try_start_9 .. :try_end_11} :catchall_25

    monitor-exit p0

    return-object p1

    :cond_13
    :try_start_13
    iget-object v0, p0, Lorg/jasypt/properties/EncryptableProperties;->textEncryptor:Lorg/jasypt/util/text/TextEncryptor;

    if-eqz v0, :cond_1d

    invoke-static {p1, v0}, Lorg/jasypt/properties/PropertyValueEncryptionUtils;->decrypt(Ljava/lang/String;Lorg/jasypt/util/text/TextEncryptor;)Ljava/lang/String;

    move-result-object p1
    :try_end_1b
    .catchall {:try_start_13 .. :try_end_1b} :catchall_25

    monitor-exit p0

    return-object p1

    :cond_1d
    :try_start_1d
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    const-string v0, "Neither a string encryptor nor a text encryptor exist for this instance of EncryptableProperties. This is usually caused by the instance having been serialized and then de-serialized in a different classloader or virtual machine, which is an unsupported behaviour (as encryptors cannot be serialized themselves)"

    invoke-direct {p1, v0}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_25
    .catchall {:try_start_1d .. :try_end_25} :catchall_25

    :catchall_25
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .registers 3

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    invoke-static {}, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->getInstance()Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->getStringEncryptor(Lorg/jasypt/properties/EncryptableProperties;)Lorg/jasypt/encryption/StringEncryptor;

    move-result-object v0

    if-eqz v0, :cond_10

    iput-object v0, p0, Lorg/jasypt/properties/EncryptableProperties;->stringEncryptor:Lorg/jasypt/encryption/StringEncryptor;

    return-void

    :cond_10
    invoke-virtual {p1, p0}, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->getTextEncryptor(Lorg/jasypt/properties/EncryptableProperties;)Lorg/jasypt/util/text/TextEncryptor;

    move-result-object p1

    if-eqz p1, :cond_18

    iput-object p1, p0, Lorg/jasypt/properties/EncryptableProperties;->textEncryptor:Lorg/jasypt/util/text/TextEncryptor;

    :cond_18
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .registers 4

    invoke-static {}, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->getInstance()Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;

    move-result-object v0

    iget-object v1, p0, Lorg/jasypt/properties/EncryptableProperties;->textEncryptor:Lorg/jasypt/util/text/TextEncryptor;

    if-eqz v1, :cond_c

    invoke-virtual {v0, p0, v1}, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->setTextEncryptor(Lorg/jasypt/properties/EncryptableProperties;Lorg/jasypt/util/text/TextEncryptor;)V

    goto :goto_13

    :cond_c
    iget-object v1, p0, Lorg/jasypt/properties/EncryptableProperties;->stringEncryptor:Lorg/jasypt/encryption/StringEncryptor;

    if-eqz v1, :cond_13

    invoke-virtual {v0, p0, v1}, Lorg/jasypt/properties/EncryptablePropertiesEncryptorRegistry;->setStringEncryptor(Lorg/jasypt/properties/EncryptableProperties;Lorg/jasypt/encryption/StringEncryptor;)V

    :cond_13
    :goto_13
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    return-void
.end method


# virtual methods
.method public declared-synchronized get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-super {p0, p1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_c

    check-cast p1, Ljava/lang/String;

    goto :goto_d

    :cond_c
    const/4 p1, 0x0

    :goto_d
    invoke-direct {p0, p1}, Lorg/jasypt/properties/EncryptableProperties;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_13

    monitor-exit p0

    return-object p1

    :catchall_13
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getIdent()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Lorg/jasypt/properties/EncryptableProperties;->ident:Ljava/lang/Integer;

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    invoke-super {p0, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jasypt/properties/EncryptableProperties;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    invoke-super {p0, p1, p2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jasypt/properties/EncryptableProperties;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
