.class public final Lorg/jasypt/digest/StandardStringDigester;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/digest/StringDigester;


# static fields
.field public static final DEFAULT_STRING_OUTPUT_TYPE:Ljava/lang/String; = "base64"

.field public static final DEFAULT_UNICODE_NORMALIZATION_IGNORED:Z = false

.field public static final DIGEST_CHARSET:Ljava/lang/String; = "US-ASCII"

.field public static final MESSAGE_CHARSET:Ljava/lang/String; = "UTF-8"


# instance fields
.field private final base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

.field private final byteDigester:Lorg/jasypt/digest/StandardByteDigester;

.field private prefix:Ljava/lang/String;

.field private prefixSet:Z

.field private stringDigesterConfig:Lorg/jasypt/digest/config/StringDigesterConfig;

.field private stringOutputType:Ljava/lang/String;

.field private stringOutputTypeBase64:Z

.field private stringOutputTypeSet:Z

.field private suffix:Ljava/lang/String;

.field private suffixSet:Z

.field private unicodeNormalizationIgnored:Z

.field private unicodeNormalizationIgnoredSet:Z


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->stringDigesterConfig:Lorg/jasypt/digest/config/StringDigesterConfig;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnored:Z

    const-string v2, "base64"

    iput-object v2, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputType:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputTypeBase64:Z

    iput-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnoredSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputTypeSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->prefixSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->suffixSet:Z

    new-instance v0, Lorg/jasypt/digest/StandardByteDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardByteDigester;-><init>()V

    iput-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    new-instance v0, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    invoke-direct {v0}, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;-><init>()V

    iput-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    return-void
.end method

.method private constructor <init>(Lorg/jasypt/digest/StandardByteDigester;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->stringDigesterConfig:Lorg/jasypt/digest/config/StringDigesterConfig;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnored:Z

    const-string v2, "base64"

    iput-object v2, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputType:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputTypeBase64:Z

    iput-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnoredSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputTypeSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->prefixSet:Z

    iput-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->suffixSet:Z

    iput-object p1, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    new-instance p1, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    invoke-direct {p1}, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;-><init>()V

    iput-object p1, p0, Lorg/jasypt/digest/StandardStringDigester;->base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    return-void
.end method


# virtual methods
.method public cloneDigester()Lorg/jasypt/digest/StandardStringDigester;
    .registers 3

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->initialize()V

    :cond_9
    new-instance v0, Lorg/jasypt/digest/StandardStringDigester;

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v1}, Lorg/jasypt/digest/StandardByteDigester;->cloneDigester()Lorg/jasypt/digest/StandardByteDigester;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;-><init>(Lorg/jasypt/digest/StandardByteDigester;)V

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setPrefix(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setSuffix(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputType:Ljava/lang/String;

    invoke-static {v1}, Lorg/jasypt/commons/CommonUtils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2b

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setStringOutputType(Ljava/lang/String;)V

    :cond_2b
    iget-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnored:Z

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setUnicodeNormalizationIgnored(Z)V

    return-object v0
.end method

.method public digest(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->initialize()V

    :cond_d
    :try_start_d
    iget-boolean v0, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnored:Z

    if-nez v0, :cond_15

    invoke-static {p1}, Lorg/jasypt/normalization/Normalizer;->normalizeToNfc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_15
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->digest([B)[B

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    if-eqz v1, :cond_2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2d
    iget-boolean v1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputTypeBase64:Z

    if-eqz v1, :cond_42

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    invoke-virtual {v1, p1}, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;->encode([B)[B

    move-result-object p1

    new-instance v1, Ljava/lang/String;

    const-string v2, "US-ASCII"

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_49

    :cond_42
    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->toHexadecimal([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_49
    iget-object p1, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    if-eqz p1, :cond_50

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_50
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_54
    .catch Lorg/jasypt/exceptions/EncryptionInitializationException; {:try_start_d .. :try_end_54} :catch_5d
    .catch Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException; {:try_start_d .. :try_end_54} :catch_5b
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_54} :catch_55

    return-object p1

    :catch_55
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :catch_5b
    move-exception p1

    throw p1

    :catch_5d
    move-exception p1

    throw p1
.end method

.method public declared-synchronized initialize()V
    .registers 6

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_5e

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->stringDigesterConfig:Lorg/jasypt/digest/config/StringDigesterConfig;

    if-eqz v0, :cond_4f

    invoke-interface {v0}, Lorg/jasypt/digest/config/StringDigesterConfig;->isUnicodeNormalizationIgnored()Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringDigesterConfig:Lorg/jasypt/digest/config/StringDigesterConfig;

    invoke-interface {v1}, Lorg/jasypt/digest/config/StringDigesterConfig;->getStringOutputType()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/jasypt/digest/StandardStringDigester;->stringDigesterConfig:Lorg/jasypt/digest/config/StringDigesterConfig;

    invoke-interface {v2}, Lorg/jasypt/digest/config/StringDigesterConfig;->getPrefix()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lorg/jasypt/digest/StandardStringDigester;->stringDigesterConfig:Lorg/jasypt/digest/config/StringDigesterConfig;

    invoke-interface {v3}, Lorg/jasypt/digest/config/StringDigesterConfig;->getSuffix()Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnoredSet:Z

    if-nez v4, :cond_2d

    if-nez v0, :cond_28

    goto :goto_2d

    :cond_28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_2f

    :cond_2d
    :goto_2d
    iget-boolean v0, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnored:Z

    :goto_2f
    iput-boolean v0, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnored:Z

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputTypeSet:Z

    if-nez v0, :cond_37

    if-nez v1, :cond_39

    :cond_37
    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputType:Ljava/lang/String;

    :cond_39
    iput-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputType:Ljava/lang/String;

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardStringDigester;->prefixSet:Z

    if-nez v0, :cond_41

    if-nez v2, :cond_43

    :cond_41
    iget-object v2, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    :cond_43
    iput-object v2, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardStringDigester;->suffixSet:Z

    if-nez v0, :cond_4b

    if-nez v3, :cond_4d

    :cond_4b
    iget-object v3, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    :cond_4d
    iput-object v3, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    :cond_4f
    const-string v0, "base64"

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputTypeBase64:Z

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0}, Lorg/jasypt/digest/StandardByteDigester;->initialize()V
    :try_end_5e
    .catchall {:try_start_1 .. :try_end_5e} :catchall_60

    :cond_5e
    monitor-exit p0

    return-void

    :catchall_60
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isInitialized()Z
    .registers 2

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0}, Lorg/jasypt/digest/StandardByteDigester;->isInitialized()Z

    move-result v0

    return v0
.end method

.method public matches(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 6

    const/4 v0, 0x0

    if-eqz p2, :cond_6c

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    const-string v2, "\""

    if-eqz v1, :cond_36

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_36

    :cond_1a
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, "Digest does not start with required prefix \""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    :goto_36
    iget-object v1, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    if-eqz v1, :cond_6c

    invoke-virtual {p2, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_50

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v2, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    goto :goto_6c

    :cond_50
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, "Digest does not end with required suffix \""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6c
    :goto_6c
    if-nez p1, :cond_72

    if-nez p2, :cond_71

    const/4 v0, 0x1

    :cond_71
    return v0

    :cond_72
    if-nez p2, :cond_75

    return v0

    :cond_75
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_7e

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->initialize()V

    :cond_7e
    :try_start_7e
    iget-boolean v0, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnored:Z

    if-nez v0, :cond_86

    invoke-static {p1}, Lorg/jasypt/normalization/Normalizer;->normalizeToNfc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_86
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iget-boolean v0, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputTypeBase64:Z

    if-eqz v0, :cond_9d

    const-string v0, "US-ASCII"

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->base64:Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;

    invoke-virtual {v0, p2}, Lorg/jasypt/contrib/org/apache/commons/codec_1_3/binary/Base64;->decode([B)[B

    move-result-object p2

    goto :goto_a1

    :cond_9d
    invoke-static {p2}, Lorg/jasypt/commons/CommonUtils;->fromHexadecimal(Ljava/lang/String;)[B

    move-result-object p2

    :goto_a1
    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1, p2}, Lorg/jasypt/digest/StandardByteDigester;->matches([B[B)Z

    move-result p1
    :try_end_a7
    .catch Lorg/jasypt/exceptions/EncryptionInitializationException; {:try_start_7e .. :try_end_a7} :catch_b0
    .catch Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException; {:try_start_7e .. :try_end_a7} :catch_ae
    .catch Ljava/lang/Exception; {:try_start_7e .. :try_end_a7} :catch_a8

    return p1

    :catch_a8
    new-instance p1, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p1

    :catch_ae
    move-exception p1

    throw p1

    :catch_b0
    move-exception p1

    throw p1
.end method

.method public setAlgorithm(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setAlgorithm(Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized setConfig(Lorg/jasypt/digest/config/DigesterConfig;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setConfig(Lorg/jasypt/digest/config/DigesterConfig;)V

    if-eqz p1, :cond_10

    instance-of v0, p1, Lorg/jasypt/digest/config/StringDigesterConfig;

    if-eqz v0, :cond_10

    check-cast p1, Lorg/jasypt/digest/config/StringDigesterConfig;

    iput-object p1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringDigesterConfig:Lorg/jasypt/digest/config/StringDigesterConfig;
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_12

    :cond_10
    monitor-exit p0

    return-void

    :catchall_12
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setInvertPositionOfPlainSaltInEncryptionResults(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setInvertPositionOfPlainSaltInEncryptionResults(Z)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setInvertPositionOfSaltInMessageBeforeDigesting(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setInvertPositionOfSaltInMessageBeforeDigesting(Z)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setIterations(I)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setIterations(I)V

    return-void
.end method

.method public declared-synchronized setPrefix(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_e

    iput-object p1, p0, Lorg/jasypt/digest/StandardStringDigester;->prefix:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardStringDigester;->prefixSet:Z
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_14

    monitor-exit p0

    return-void

    :cond_e
    :try_start_e
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_14
    .catchall {:try_start_e .. :try_end_14} :catchall_14

    :catchall_14
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setProvider(Ljava/security/Provider;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setProvider(Ljava/security/Provider;)V

    return-void
.end method

.method public setProviderName(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setProviderName(Ljava/lang/String;)V

    return-void
.end method

.method public setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setSaltGenerator(Lorg/jasypt/salt/SaltGenerator;)V

    return-void
.end method

.method public setSaltSizeBytes(I)V
    .registers 3

    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setSaltSizeBytes(I)V

    return-void
.end method

.method public declared-synchronized setStringOutputType(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "String output type cannot be set empty"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotEmpty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_17

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->getStandardStringOutputType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputType:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardStringDigester;->stringOutputTypeSet:Z
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_1d

    monitor-exit p0

    return-void

    :cond_17
    :try_start_17
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_1d
    .catchall {:try_start_17 .. :try_end_1d} :catchall_1d

    :catchall_1d
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSuffix(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_e

    iput-object p1, p0, Lorg/jasypt/digest/StandardStringDigester;->suffix:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardStringDigester;->suffixSet:Z
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_14

    monitor-exit p0

    return-void

    :cond_e
    :try_start_e
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_14
    .catchall {:try_start_e .. :try_end_14} :catchall_14

    :catchall_14
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setUnicodeNormalizationIgnored(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lorg/jasypt/digest/StandardStringDigester;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_e

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnored:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/jasypt/digest/StandardStringDigester;->unicodeNormalizationIgnoredSet:Z
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_14

    monitor-exit p0

    return-void

    :cond_e
    :try_start_e
    new-instance p1, Lorg/jasypt/exceptions/AlreadyInitializedException;

    invoke-direct {p1}, Lorg/jasypt/exceptions/AlreadyInitializedException;-><init>()V

    throw p1
    :try_end_14
    .catchall {:try_start_e .. :try_end_14} :catchall_14

    :catchall_14
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setUseLenientSaltSizeCheck(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/digest/StandardStringDigester;->byteDigester:Lorg/jasypt/digest/StandardByteDigester;

    invoke-virtual {v0, p1}, Lorg/jasypt/digest/StandardByteDigester;->setUseLenientSaltSizeCheck(Z)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method
