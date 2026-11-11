.class public final Lorg/jasypt/encryption/pbe/NumberUtils;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static byteArrayFromInt(I)[B
    .registers 6

    and-int/lit16 v0, p0, 0xff

    int-to-byte v0, v0

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    shr-int/lit8 v2, p0, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    const/4 v3, 0x4

    new-array v3, v3, [B

    const/4 v4, 0x0

    aput-byte p0, v3, v4

    const/4 p0, 0x1

    aput-byte v2, v3, p0

    const/4 p0, 0x2

    aput-byte v1, v3, p0

    const/4 p0, 0x3

    aput-byte v0, v3, p0

    return-object v3
.end method

.method public static intFromByteArray([B)I
    .registers 4

    if-eqz p0, :cond_19

    array-length v0, p0

    if-eqz v0, :cond_19

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    :goto_b
    array-length v2, p0

    if-ge v1, v2, :cond_18

    shl-int/lit8 v0, v0, 0x8

    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_18
    return v0

    :cond_19
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot convert an empty array into an int"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_22

    :goto_21
    throw p0

    :goto_22
    goto :goto_21
.end method

.method private static maxSafeSizeInBytes()I
    .registers 6

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v4

    sub-long/2addr v0, v4

    add-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public static processBigIntegerEncryptedByteArray([BI)[B
    .registers 8

    array-length v0, p0

    const/4 v1, 0x4

    if-le v0, v1, :cond_3b

    array-length v0, p0

    new-array v2, v1, [B

    sub-int/2addr v0, v1

    const/4 v3, 0x0

    invoke-static {p0, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v1, v0, [B

    invoke-static {p0, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Lorg/jasypt/encryption/pbe/NumberUtils;->intFromByteArray([B)I

    move-result p0

    if-ltz p0, :cond_35

    invoke-static {}, Lorg/jasypt/encryption/pbe/NumberUtils;->maxSafeSizeInBytes()I

    move-result v2

    if-gt p0, v2, :cond_35

    if-eq v0, p0, :cond_34

    sub-int v2, p0, v0

    new-array p0, p0, [B

    const/4 v4, 0x0

    :goto_24
    if-ge v4, v2, :cond_30

    if-ltz p1, :cond_2a

    const/4 v5, 0x0

    goto :goto_2b

    :cond_2a
    const/4 v5, -0x1

    :goto_2b
    aput-byte v5, p0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_24

    :cond_30
    invoke-static {v1, v3, p0, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0

    :cond_34
    return-object v1

    :cond_35
    new-instance p0, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    invoke-direct {p0}, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;-><init>()V

    throw p0

    :cond_3b
    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method
