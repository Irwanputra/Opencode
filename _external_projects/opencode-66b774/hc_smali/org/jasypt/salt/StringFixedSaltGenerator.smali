.class public Lorg/jasypt/salt/StringFixedSaltGenerator;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/salt/FixedSaltGenerator;


# static fields
.field private static final DEFAULT_CHARSET:Ljava/lang/String; = "UTF-8"


# instance fields
.field private final charset:Ljava/lang/String;

.field private final salt:Ljava/lang/String;

.field private final saltBytes:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/jasypt/salt/StringFixedSaltGenerator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Salt cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/jasypt/salt/StringFixedSaltGenerator;->salt:Ljava/lang/String;

    if-eqz p2, :cond_d

    goto :goto_f

    :cond_d
    const-string p2, "UTF-8"

    :goto_f
    iput-object p2, p0, Lorg/jasypt/salt/StringFixedSaltGenerator;->charset:Ljava/lang/String;

    :try_start_11
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/salt/StringFixedSaltGenerator;->saltBytes:[B
    :try_end_17
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_11 .. :try_end_17} :catch_18

    return-void

    :catch_18
    new-instance p1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, "Invalid charset specified: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/jasypt/salt/StringFixedSaltGenerator;->charset:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public generateSalt(I)[B
    .registers 5

    iget-object v0, p0, Lorg/jasypt/salt/StringFixedSaltGenerator;->saltBytes:[B

    array-length v1, v0

    if-lt v1, p1, :cond_c

    new-array v1, p1, [B

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    :cond_c
    new-instance p1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v0, "Requested salt larger than set"

    invoke-direct {p1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public includePlainSaltInEncryptionResults()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method
