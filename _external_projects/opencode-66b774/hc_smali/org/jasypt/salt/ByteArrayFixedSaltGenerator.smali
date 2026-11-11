.class public Lorg/jasypt/salt/ByteArrayFixedSaltGenerator;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/salt/FixedSaltGenerator;


# instance fields
.field private final salt:[B


# direct methods
.method public constructor <init>([B)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Salt cannot be set null"

    invoke-static {p1, v0}, Lorg/jasypt/commons/CommonUtils;->validateNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lorg/jasypt/salt/ByteArrayFixedSaltGenerator;->salt:[B

    return-void
.end method


# virtual methods
.method public generateSalt(I)[B
    .registers 5

    iget-object v0, p0, Lorg/jasypt/salt/ByteArrayFixedSaltGenerator;->salt:[B

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
