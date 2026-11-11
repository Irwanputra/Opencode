.class public Lorg/jasypt/salt/FixedStringSaltGenerator;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/salt/SaltGenerator;


# static fields
.field private static final DEFAULT_CHARSET:Ljava/lang/String; = "UTF-8"


# instance fields
.field private charset:Ljava/lang/String;

.field private salt:Ljava/lang/String;

.field private saltBytes:[B


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->salt:Ljava/lang/String;

    const-string v1, "UTF-8"

    iput-object v1, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->charset:Ljava/lang/String;

    iput-object v0, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->saltBytes:[B

    return-void
.end method


# virtual methods
.method public generateSalt(I)[B
    .registers 5

    iget-object v0, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->salt:Ljava/lang/String;

    if-eqz v0, :cond_3e

    iget-object v1, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->saltBytes:[B

    if-nez v1, :cond_2a

    :try_start_8
    iget-object v1, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->charset:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->saltBytes:[B
    :try_end_10
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_8 .. :try_end_10} :catch_11

    goto :goto_2a

    :catch_11
    new-instance p1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Invalid charset specified: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->charset:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2a
    :goto_2a
    iget-object v0, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->saltBytes:[B

    array-length v1, v0

    if-lt v1, p1, :cond_36

    new-array v1, p1, [B

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    :cond_36
    new-instance p1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v0, "Requested salt larger than set"

    invoke-direct {p1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3e
    new-instance p1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v0, "Salt has not been set"

    invoke-direct {p1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public includePlainSaltInEncryptionResults()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public declared-synchronized setCharset(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Charset cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->charset:Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_1 .. :try_end_8} :catchall_a

    monitor-exit p0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSalt(Ljava/lang/String;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "Salt cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/jasypt/salt/FixedStringSaltGenerator;->salt:Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_1 .. :try_end_8} :catchall_a

    monitor-exit p0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit p0

    throw p1
.end method
